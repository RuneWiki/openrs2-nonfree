import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!nea", name = "q", descriptor = "Lclient!ak;")
	private Class18 aClass18_6;

	@OriginalMember(owner = "client!nea", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!nea", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!nea", name = "p", descriptor = "Lclient!ru;")
	private final Class61_Sub2 aClass61_Sub2_2;

	@OriginalMember(owner = "client!nea", name = "y", descriptor = "[I")
	private final int[] anIntArray336;

	@OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
	public final int anInt6133;

	@OriginalMember(owner = "client!nea", name = "t", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_22;

	@OriginalMember(owner = "client!nea", name = "v", descriptor = "F")
	public final float aFloat97;

	@OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
	public final int anInt6129;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "I")
	public final int anInt6125;

	@OriginalMember(owner = "client!nea", name = "w", descriptor = "I")
	public final int anInt6130;

	@OriginalMember(owner = "client!nea", name = "m", descriptor = "Lclient!mn;")
	private final Class164_Sub2 aClass164_Sub2_2;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!ru;IIIII)V")
	public Class5_Sub35(@OriginalArg(0) Class61_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass61_Sub2_2 = arg0;
		this.anIntArray336 = new int[this.aClass61_Sub2_2.anInt10026 * this.aClass61_Sub2_2.anInt10029];
		this.anInt6133 = arg5;
		this.aClass133_Sub3_22 = this.aClass61_Sub2_2.aClass133_Sub3_27;
		this.aFloat97 = arg2;
		this.anInt6129 = arg4;
		this.anInt6125 = arg3;
		this.anInt6130 = arg1;
		this.aClass164_Sub2_2 = new Class164_Sub2(this.aClass133_Sub3_22, 5123, null, 1);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BIII)V")
	public void method5436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray336[arg1 + this.aClass61_Sub2_2.anInt10026 * arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(II)V")
	public void method5438(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass133_Sub3_22.aNativeHeap5.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(BI)V")
	public void method5439(@OriginalArg(1) int arg0) {
		this.aStream5.c(arg0 * 4 + 3);
		this.aStream5.a(-1);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IB)V")
	public void method5440(@OriginalArg(0) int arg0) {
		this.aStream5.b();
		@Pc(24) Interface10 local24 = this.aClass133_Sub3_22.method7403(4, arg0 * 4, this.aNativeHeapBuffer5);
		this.aClass18_6 = new Class18(local24, 5121, 4, 0);
		this.aStream5 = null;
		this.aNativeHeapBuffer5 = null;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(IFIII)V")
	public void method5441(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (this.anInt6130 != -1) {
			@Pc(13) Class145 local13 = this.aClass133_Sub3_22.anInterface3_12.method4656(this.anInt6130);
			local18 = local13.aByte66 & 0xFF;
			@Pc(59) int local59;
			if (local18 != 0 && local13.aByte68 != 4) {
				if (arg2 < 0) {
					local34 = 0;
				} else if (arg2 <= 127) {
					local34 = arg2 * 131586;
				} else {
					local34 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local34;
				} else {
					local59 = 256 - local18;
					arg3 = (local59 * (arg3 & 0xFF00) + (local34 & 0xFF00) * local18 & 0xFF0000) + ((arg3 & 0xFF00FF) * local59 + local18 * (local34 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local34 = local13.aByte67 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(109) int local109 = (arg3 >> 16 & 0xFF) * local34;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local59 = (arg3 >> 8 & 0xFF) * local34;
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(137) int local137 = local34 * (arg3 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg3 = (local109 << 8 & 0xFF00BD) - (-(local59 & 0xFF00) - (local137 >> 8));
			}
		}
		if (arg0 != 1.0F) {
			@Pc(171) int local171 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local34 = arg3 & 0xFF;
			local171 = (int) ((float) local171 * arg0);
			local18 = (int) ((float) local18 * arg0);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			local34 = (int) ((float) local34 * arg0);
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg3 = local18 << 8 | local171 << 16 | local34;
		}
		this.aStream5.c(arg1 * 4);
		this.aStream5.a((byte) (arg3 >> 16));
		this.aStream5.a((byte) (arg3 >> 8));
		this.aStream5.a((byte) arg3);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I[II)V")
	public void method5442(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class5_Sub22_Sub2 local11 = this.aClass133_Sub3_22.aClass5_Sub22_Sub2_3;
		local11.anInt6629 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass133_Sub3_22.aBoolean611) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local31 = this.anIntArray336[local26];
				local37 = this.aClass61_Sub2_2.aShortArrayArray26[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local37.length) {
						if ((local31 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method5918(local37[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method5918(local37[local45++] & 0xFFFF);
							local11.method5918(local37[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local31 = this.anIntArray336[local26];
				local37 = this.aClass61_Sub2_2.aShortArrayArray26[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local37.length > local45) {
						if ((local31 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method5948(local37[local45++] & 0xFFFF);
							local7++;
							local11.method5948(local37[local45++] & 0xFFFF);
							local7++;
							local11.method5948(local37[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass164_Sub2_2.method8974(local11.aByteArray71, local11.anInt6629);
		this.aClass133_Sub3_22.method7396(this.aClass61_Sub2_2.aClass18_10, this.aClass18_6, this.aClass61_Sub2_2.aClass18_11, this.aClass61_Sub2_2.lb);
		this.aClass133_Sub3_22.method7404((this.aClass61_Sub2_2.anInt8612 & 0x8) != 0, (this.aClass61_Sub2_2.anInt8612 & 0x7) != 0, this.anInt6130);
		if (this.aClass133_Sub3_22.aBoolean631) {
			this.aClass133_Sub3_22.EA(Integer.MAX_VALUE, this.anInt6125, this.anInt6129, this.anInt6133);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat97, 1.0F / this.aFloat97, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass133_Sub3_22.method7396(this.aClass61_Sub2_2.aClass18_10, this.aClass18_6, this.aClass61_Sub2_2.aClass18_11, this.aClass61_Sub2_2.lb);
		this.aClass133_Sub3_22.method7383(0, local7, this.aClass164_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
