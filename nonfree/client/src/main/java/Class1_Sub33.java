import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!ms", name = "m", descriptor = "Lclient!cd;")
	private Class43 aClass43_7;

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!ms", name = "B", descriptor = "Lclient!nk;")
	private final Class205_Sub1 aClass205_Sub1_2;

	@OriginalMember(owner = "client!ms", name = "D", descriptor = "I")
	public final int anInt5690;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "F")
	public final float aFloat117;

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_24;

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
	public final int anInt5679;

	@OriginalMember(owner = "client!ms", name = "x", descriptor = "[I")
	private final int[] anIntArray567;

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
	public final int anInt5682;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	public final int anInt5683;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!rc;")
	private final Class33_Sub2 aClass33_Sub2_1;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!nk;IIIII)V")
	public Class1_Sub33(@OriginalArg(0) Class205_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass205_Sub1_2 = arg0;
		this.anInt5690 = arg3;
		this.aFloat117 = arg2;
		this.aClass122_Sub3_24 = this.aClass205_Sub1_2.aClass122_Sub3_25;
		this.anInt5679 = arg5;
		this.anIntArray567 = new int[this.aClass205_Sub1_2.anInt8174 * this.aClass205_Sub1_2.anInt8177];
		this.anInt5682 = arg4;
		this.anInt5683 = arg1;
		this.aClass33_Sub2_1 = new Class33_Sub2(this.aClass122_Sub3_24, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([III)V")
	public void method4847(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub6_Sub1 local11 = this.aClass122_Sub3_24.aClass1_Sub6_Sub1_3;
		local11.anInt4555 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass122_Sub3_24.aBoolean594) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass205_Sub1_2.aShortArrayArray5[local26];
				local37 = this.anIntArray567[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method3919(local32[local48++] & 0xFFFF);
							local11.method3919(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method3919(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local37 = this.anIntArray567[local26];
				local32 = this.aClass205_Sub1_2.aShortArrayArray5[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local11.method3971(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method3971(local32[local48++] & 0xFFFF);
							local11.method3971(local32[local48++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass33_Sub2_1.method6550(local11.aByteArray66, local11.anInt4555);
		this.aClass122_Sub3_24.method6890(this.aClass205_Sub1_2.aClass43_11, this.aClass205_Sub1_2.aClass43_10, this.aClass205_Sub1_2.aClass43_8, this.aClass43_7);
		this.aClass122_Sub3_24.method6888(this.anInt5683, (this.aClass205_Sub1_2.anInt5925 & 0x7) != 0, (this.aClass205_Sub1_2.anInt5925 & 0x8) != 0);
		if (this.aClass122_Sub3_24.aBoolean598) {
			this.aClass122_Sub3_24.JA(Integer.MAX_VALUE, this.anInt5690, this.anInt5682, this.anInt5679);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat117, 1.0F / this.aFloat117, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass122_Sub3_24.method6890(this.aClass205_Sub1_2.aClass43_11, this.aClass205_Sub1_2.aClass43_10, this.aClass205_Sub1_2.aClass43_8, this.aClass43_7);
		this.aClass122_Sub3_24.method6889(local7, this.aClass33_Sub2_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIB)V")
	public void method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray567[arg1 + this.aClass205_Sub1_2.anInt8174 * arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIBIF)V")
	public void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(40) int local40;
		if (this.anInt5683 != -1) {
			@Pc(17) Class220 local17 = this.aClass122_Sub3_24.anInterface8_14.method878(this.anInt5683);
			local22 = local17.aByte81 & 0xFF;
			@Pc(60) int local60;
			if (local22 != 0 && local17.aByte87 != 4) {
				if (arg1 < 0) {
					local40 = 0;
				} else if (arg1 > 127) {
					local40 = 16777215;
				} else {
					local40 = arg1 * 131586;
				}
				if (local22 == 256) {
					arg2 = local40;
				} else {
					local60 = 256 - local22;
					arg2 = (local22 * (local40 & 0xFF00FF) + local60 * (arg2 & 0xFF00FF) & 0xFF00FF00) + (local60 * (arg2 & 0xFF00) + (local40 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local40 = local17.aByte84 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(110) int local110 = (arg2 >> 16 & 0xFF) * local40;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local60 = local40 * (arg2 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(138) int local138 = (arg2 & 0xFF) * local40;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg2 = ((local110 & 0x2700FF00) << 8) + (local60 & 0xFF00) + (local138 >> 8);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(168) int local168 = arg2 >> 16 & 0xFF;
			local22 = arg2 >> 8 & 0xFF;
			local40 = arg2 & 0xFF;
			local168 = (int) ((float) local168 * arg3);
			if (local168 < 0) {
				local168 = 0;
			} else if (local168 > 255) {
				local168 = 255;
			}
			local22 = (int) ((float) local22 * arg3);
			local40 = (int) ((float) local40 * arg3);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg2 = local40 | local168 << 16 | local22 << 8;
		}
		this.aStream4.e(arg0 * 4);
		this.aStream4.f((byte) (arg2 >> 16));
		this.aStream4.f((byte) (arg2 >> 8));
		this.aStream4.f((byte) arg2);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public void method4851(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass122_Sub3_24.aNativeHeap5.a(arg0 * 4, true);
		this.aStream4 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
	public void method4853(@OriginalArg(0) int arg0) {
		this.aStream4.e(arg0 * 4 + 3);
		this.aStream4.f(-1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZ)V")
	public void method4854(@OriginalArg(0) int arg0) {
		this.aStream4.b();
		@Pc(18) Interface2 local18 = this.aClass122_Sub3_24.method6924(arg0 * 4, 4, this.aNativeHeapBuffer6);
		this.aClass43_7 = new Class43(local18, 5121, 4, 0);
		this.aStream4 = null;
		this.aNativeHeapBuffer6 = null;
	}
}
