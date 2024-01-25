import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Lclient!fe;")
	private Class97 aClass97_7;

	@OriginalMember(owner = "client!ar", name = "C", descriptor = "Lclient!al;")
	private final Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_8;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
	public final int anInt675;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "F")
	public final float aFloat24;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
	public final int anInt676;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	public final int anInt681;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "[I")
	private final int[] anIntArray18;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
	public final int anInt685;

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "Lclient!hd;")
	private final Class14_Sub2 aClass14_Sub2_2;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!al;IIIII)V")
	public Class1_Sub6(@OriginalArg(0) Class17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass17_Sub1_1 = arg0;
		this.aClass12_Sub1_8 = this.aClass17_Sub1_1.aClass12_Sub1_7;
		this.anInt675 = arg4;
		this.aFloat24 = arg2;
		this.anInt676 = arg3;
		this.anInt681 = arg1;
		this.anIntArray18 = new int[this.aClass17_Sub1_1.anInt7984 * this.aClass17_Sub1_1.anInt7983];
		this.anInt685 = arg5;
		this.aClass14_Sub2_2 = new Class14_Sub2(this.aClass12_Sub1_8, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BIII)V")
	public void method594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray18[arg2 + this.aClass17_Sub1_1.anInt7983 * arg0] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZFIII)V")
	public void method595(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (this.anInt681 != -1) {
			@Pc(24) Class45 local24 = this.aClass12_Sub1_8.anInterface5_10.method4043(this.anInt681);
			local29 = local24.aByte22 & 0xFF;
			@Pc(63) int local63;
			if (local29 != 0 && local24.aByte25 != 4) {
				if (arg1 < 0) {
					local44 = 0;
				} else if (arg1 <= 127) {
					local44 = arg1 * 131586;
				} else {
					local44 = 16777215;
				}
				if (local29 == 256) {
					arg2 = local44;
				} else {
					local63 = 256 - local29;
					arg2 = (local63 * (arg2 & 0xFF00) + (local44 & 0xFF00) * local29 & 0xFF0000) + ((arg2 & 0xFF00FF) * local63 + local29 * (local44 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local44 = local24.aByte28 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(113) int local113 = (arg2 >> 16 & 0xFF) * local44;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local63 = (arg2 >> 8 & 0xFF) * local44;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(139) int local139 = (arg2 & 0xFF) * local44;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg2 = (local139 >> 8) + (local63 & 0xFF00) + (local113 << 8 & 0xFF00B3);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(172) int local172 = arg2 >> 16 & 0xFF;
			local29 = arg2 >> 8 & 0xFF;
			local44 = arg2 & 0xFF;
			local172 = (int) ((float) local172 * arg0);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			local29 = (int) ((float) local29 * arg0);
			if (local29 < 0) {
				local29 = 0;
			} else if (local29 > 255) {
				local29 = 255;
			}
			local44 = (int) ((float) local44 * arg0);
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg2 = local44 | local172 << 16 | local29 << 8;
		}
		this.aStream1.c(arg3 * 4);
		this.aStream1.d((byte) (arg2 >> 16));
		this.aStream1.d((byte) (arg2 >> 8));
		this.aStream1.d((byte) arg2);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public void method597(@OriginalArg(1) int arg0) {
		this.aStream1.c(arg0 * 4 + 3);
		this.aStream1.d(-1);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
	public void method598(@OriginalArg(0) int arg0) {
		this.aStream1.a();
		@Pc(20) Interface1 local20 = this.aClass12_Sub1_8.method421(arg0 * 4, 4, this.aNativeHeapBuffer1);
		this.aClass97_7 = new Class97(local20, 5121, 4, 0);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(II)V")
	public void method600(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass12_Sub1_8.aNativeHeap1.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
	public void method601(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub20_Sub2 local11 = this.aClass12_Sub1_8.aClass1_Sub20_Sub2_1;
		local11.anInt5238 = 0;
		@Pc(43) short[] local43;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (this.aClass12_Sub1_8.aBoolean23) {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local43 = this.aClass17_Sub1_1.aShortArrayArray1[local32];
				local37 = this.anIntArray18[local32];
				if (local37 != 0 && local43 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local43.length) {
						if ((0x1 << local49++ & local37) == 0) {
							local51 += 3;
						} else {
							local11.method4381(local43[local51++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4381(local43[local51++] & 0xFFFF);
							local11.method4381(local43[local51++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg1; local26++) {
				local32 = arg0[local26];
				local37 = this.anIntArray18[local32];
				local43 = this.aClass17_Sub1_1.aShortArrayArray1[local32];
				if (local37 != 0 && local43 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local43.length) {
						if ((local37 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local11.method4376(local43[local51++] & 0xFFFF);
							local7++;
							local11.method4376(local43[local51++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4376(local43[local51++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass14_Sub2_2.method7764(local11.anInt5238, local11.aByteArray52);
		this.aClass12_Sub1_8.method428(this.aClass17_Sub1_1.aClass97_4, this.aClass17_Sub1_1.aClass97_3, this.aClass97_7, this.aClass17_Sub1_1.aClass97_6);
		this.aClass12_Sub1_8.method398(this.anInt681, (this.aClass17_Sub1_1.anInt597 & 0x8) != 0, (this.aClass17_Sub1_1.anInt597 & 0x7) != 0);
		if (this.aClass12_Sub1_8.aBoolean28) {
			this.aClass12_Sub1_8.YA(Integer.MAX_VALUE, this.anInt676, this.anInt675, this.anInt685);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat24, 1.0F / this.aFloat24, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass12_Sub1_8.method428(this.aClass17_Sub1_1.aClass97_4, this.aClass17_Sub1_1.aClass97_3, this.aClass97_7, this.aClass17_Sub1_1.aClass97_6);
		this.aClass12_Sub1_8.method425(0, this.aClass14_Sub2_2, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
