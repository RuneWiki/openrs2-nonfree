import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!efa", name = "L", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "Lclient!kn;")
	private Class207 aClass207_9;

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer2;

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "Lclient!dl;")
	private final Class84_Sub1 aClass84_Sub1_2;

	@OriginalMember(owner = "client!efa", name = "I", descriptor = "F")
	public final float aFloat59;

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
	public final int anInt1953;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_11;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
	public final int anInt1961;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "[I")
	private final int[] anIntArray103;

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
	public final int anInt1958;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
	public final int anInt1965;

	@OriginalMember(owner = "client!efa", name = "J", descriptor = "Lclient!tb;")
	private final Class276_Sub2 aClass276_Sub2_1;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!dl;IIIII)V")
	public Class5_Sub17(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass84_Sub1_2 = arg0;
		this.aFloat59 = (float) arg2;
		this.anInt1953 = arg3;
		this.aClass100_Sub3_11 = this.aClass84_Sub1_2.aClass100_Sub3_10;
		this.anInt1961 = arg1;
		this.anIntArray103 = new int[this.aClass84_Sub1_2.anInt8878 * this.aClass84_Sub1_2.anInt8883];
		this.anInt1958 = arg5;
		this.anInt1965 = arg4;
		this.aClass276_Sub2_1 = new Class276_Sub2(this.aClass100_Sub3_11, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIBI)V")
	public void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray103[arg1 + this.aClass84_Sub1_2.anInt8883 * arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(II)V")
	public void method1770(@OriginalArg(0) int arg0) {
		this.aStream4.b();
		@Pc(18) Interface17 local18 = this.aClass100_Sub3_11.method8694(arg0 * 4, 4, this.aNativeHeapBuffer2);
		this.aClass207_9 = new Class207(local18, 5121, 4, 0);
		this.aNativeHeapBuffer2 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[I)V")
	public void method1771(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5_Sub36_Sub1 local11 = this.aClass100_Sub3_11.aClass5_Sub36_Sub1_3;
		local11.anInt8456 = 0;
		@Pc(45) short[] local45;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(28) int local28;
		@Pc(53) int local53;
		@Pc(55) int local55;
		if (this.aClass100_Sub3_11.aBoolean735) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local39 = this.anIntArray103[local34];
				local45 = this.aClass84_Sub1_2.aShortArrayArray8[local34];
				if (local39 != 0 && local45 != null) {
					local53 = 0;
					local55 = 0;
					while (local45.length > local55) {
						if ((local39 & 0x1 << local53++) == 0) {
							local55 += 3;
						} else {
							local11.method7296(local45[local55++] & 0xFFFF);
							local7++;
							local11.method7296(local45[local55++] & 0xFFFF);
							local7++;
							local11.method7296(local45[local55++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local45 = this.aClass84_Sub1_2.aShortArrayArray8[local34];
				local39 = this.anIntArray103[local34];
				if (local39 != 0 && local45 != null) {
					local53 = 0;
					local55 = 0;
					while (local55 < local45.length) {
						if ((0x1 << local53++ & local39) == 0) {
							local55 += 3;
						} else {
							local7++;
							local11.method7279(local45[local55++] & 0xFFFF);
							local11.method7279(local45[local55++] & 0xFFFF);
							local7++;
							local11.method7279(local45[local55++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass276_Sub2_1.method7654(local11.anInt8456, local11.aByteArray89);
		this.aClass100_Sub3_11.method8727(this.aClass207_9, this.aClass84_Sub1_2.aClass207_8, this.aClass84_Sub1_2.aClass207_6, this.aClass84_Sub1_2.aClass207_7);
		this.aClass100_Sub3_11.method8737(this.anInt1961, (this.aClass84_Sub1_2.anInt1703 & 0x8) != 0, (this.aClass84_Sub1_2.anInt1703 & 0x7) != 0);
		if (this.aClass100_Sub3_11.aBoolean728) {
			this.aClass100_Sub3_11.EA(Integer.MAX_VALUE, this.anInt1953, this.anInt1965, this.anInt1958);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat59, 1.0F / this.aFloat59, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass100_Sub3_11.method8727(this.aClass207_9, this.aClass84_Sub1_2.aClass207_8, this.aClass84_Sub1_2.aClass207_6, this.aClass84_Sub1_2.aClass207_7);
		this.aClass100_Sub3_11.method8707(this.aClass276_Sub2_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V")
	public void method1772(@OriginalArg(1) int arg0) {
		this.aStream4.d(arg0 * 4 + 3);
		this.aStream4.e(-1);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IFIII)V")
	public void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(22) int local22;
		@Pc(41) int local41;
		if (this.anInt1961 != -1) {
			@Pc(17) Class44 local17 = this.aClass100_Sub3_11.anInterface7_12.method7423(this.anInt1961);
			local22 = local17.aByte17 & 0xFF;
			@Pc(68) int local68;
			if (local22 != 0 && local17.aByte23 != 4) {
				if (arg3 < 0) {
					local41 = 0;
				} else if (arg3 <= 127) {
					local41 = arg3 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local22 == 256) {
					arg0 = local41;
				} else {
					local68 = 256 - local22;
					arg0 = ((local41 & 0xFF00FF) * local22 + local68 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * local68 + (local41 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local41 = local17.aByte22 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(122) int local122 = local41 * (arg0 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local68 = local41 * (arg0 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(146) int local146 = (arg0 & 0xFF) * local41;
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg0 = (local68 & 0xFF00) + (local122 << 8 & 0xFF0002) + (local146 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(177) int local177 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local41 = arg0 & 0xFF;
			local177 = (int) ((float) local177 * arg1);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local22 = (int) ((float) local22 * arg1);
			local41 = (int) ((float) local41 * arg1);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg0 = local177 << 16 | local22 << 8 | local41;
		}
		this.aStream4.d(arg2 * 4);
		this.aStream4.e((byte) (arg0 >> 16));
		this.aStream4.e((byte) (arg0 >> 8));
		this.aStream4.e((byte) arg0);
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(II)V")
	public void method1774(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer2 = this.aClass100_Sub3_11.aNativeHeap6.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer2);
	}
}
