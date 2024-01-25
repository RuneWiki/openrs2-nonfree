import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class4_Sub52 extends Class4 {

	@OriginalMember(owner = "client!wda", name = "h", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Lclient!sf;")
	private Class327 aClass327_16;

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "Lclient!cea;")
	private final Class42_Sub1 aClass42_Sub1_3;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
	public final int anInt10365;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
	public final int anInt10359;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "F")
	public final float aFloat235;

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_43;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "[I")
	private final int[] anIntArray714;

	@OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
	public final int anInt10364;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public final int anInt10360;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "Lclient!vb;")
	private final Class322_Sub2 aClass322_Sub2_2;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!cea;IIIII)V")
	public Class4_Sub52(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass42_Sub1_3 = arg0;
		this.anInt10365 = arg1;
		this.anInt10359 = arg5;
		this.aFloat235 = (float) arg2;
		this.aClass33_Sub3_43 = this.aClass42_Sub1_3.aClass33_Sub3_3;
		this.anIntArray714 = new int[this.aClass42_Sub1_3.anInt8630 * this.aClass42_Sub1_3.anInt8638];
		this.anInt10364 = arg3;
		this.anInt10360 = arg4;
		this.aClass322_Sub2_2 = new Class322_Sub2(this.aClass33_Sub3_43, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB)V")
	public void method8751(@OriginalArg(0) int arg0) {
		this.aStream7.c();
		@Pc(24) Interface11 local24 = this.aClass33_Sub3_43.method6330(this.aNativeHeapBuffer5, 4, arg0 * 4);
		this.aClass327_16 = new Class327(local24, 5121, 4, 0);
		this.aNativeHeapBuffer5 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BIIIF)V")
	public void method8752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(39) int local39;
		if (this.anInt10365 != -1) {
			@Pc(17) Class130 local17 = this.aClass33_Sub3_43.anInterface9_12.method1558(this.anInt10365);
			local22 = local17.aByte40 & 0xFF;
			@Pc(56) int local56;
			if (local22 != 0 && local17.aByte39 != 4) {
				if (arg0 < 0) {
					local39 = 0;
				} else if (arg0 <= 127) {
					local39 = arg0 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local22 == 256) {
					arg1 = local39;
				} else {
					local56 = 256 - local22;
					arg1 = (local56 * (arg1 & 0xFF00) + (local39 & 0xFF00) * local22 & 0xFF0000) + (local56 * (arg1 & 0xFF00FF) + local22 * (local39 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local39 = local17.aByte38 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(109) int local109 = (arg1 >> 16 & 0xFF) * local39;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local56 = (arg1 >> 8 & 0xFF) * local39;
				if (local56 > 65535) {
					local56 = 65535;
				}
				@Pc(133) int local133 = (arg1 & 0xFF) * local39;
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg1 = (local133 >> 8) + ((local109 << 8 & 0xFF00D2) + (local56 & 0xFF00));
			}
		}
		this.aStream7.b(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(171) int local171 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local171 = (int) ((float) local171 * arg3);
			local39 = arg1 & 0xFF;
			local22 = (int) ((float) local22 * arg3);
			if (local171 < 0) {
				local171 = 0;
			} else if (local171 > 255) {
				local171 = 255;
			}
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			local39 = (int) ((float) local39 * arg3);
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg1 = local39 | local171 << 16 | local22 << 8;
		}
		this.aStream7.a((byte) (arg1 >> 16));
		this.aStream7.a((byte) (arg1 >> 8));
		this.aStream7.a((byte) arg1);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IB[I)V")
	public void method8754(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(17) Class4_Sub11_Sub2 local17 = this.aClass33_Sub3_43.aClass4_Sub11_Sub2_3;
		local17.anInt10466 = 0;
		@Pc(38) short[] local38;
		@Pc(32) int local32;
		@Pc(43) int local43;
		@Pc(26) int local26;
		@Pc(52) int local52;
		@Pc(54) int local54;
		if (this.aClass33_Sub3_43.aBoolean555) {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local38 = this.aClass42_Sub1_3.aShortArrayArray5[local32];
				local43 = this.anIntArray714[local32];
				if (local43 != 0 && local38 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local38.length) {
						if ((0x1 << local52++ & local43) == 0) {
							local54 += 3;
						} else {
							local17.method8838(local38[local54++] & 0xFFFF);
							local13++;
							local17.method8838(local38[local54++] & 0xFFFF);
							local13++;
							local13++;
							local17.method8838(local38[local54++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local38 = this.aClass42_Sub1_3.aShortArrayArray5[local32];
				local43 = this.anIntArray714[local32];
				if (local43 != 0 && local38 != null) {
					local52 = 0;
					local54 = 0;
					while (local54 < local38.length) {
						if ((local43 & 0x1 << local52++) == 0) {
							local54 += 3;
						} else {
							local17.method8848(local38[local54++] & 0xFFFF);
							local13++;
							local17.method8848(local38[local54++] & 0xFFFF);
							local13++;
							local17.method8848(local38[local54++] & 0xFFFF);
							local13++;
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass322_Sub2_2.method8458(local17.anInt10466, local17.aByteArray107);
		this.aClass33_Sub3_43.method6339(this.aClass42_Sub1_3.aClass327_3, this.aClass42_Sub1_3.aClass327_5, this.aClass327_16, this.aClass42_Sub1_3.aClass327_6);
		this.aClass33_Sub3_43.method6309(this.anInt10365, (this.aClass42_Sub1_3.anInt1398 & 0x8) != 0, (this.aClass42_Sub1_3.anInt1398 & 0x7) != 0);
		if (this.aClass33_Sub3_43.aBoolean574) {
			this.aClass33_Sub3_43.EA(Integer.MAX_VALUE, this.anInt10364, this.anInt10360, this.anInt10359);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat235, 1.0F / this.aFloat235, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass33_Sub3_43.method6339(this.aClass42_Sub1_3.aClass327_3, this.aClass42_Sub1_3.aClass327_5, this.aClass327_16, this.aClass42_Sub1_3.aClass327_6);
		this.aClass33_Sub3_43.method6348(0, local13, this.aClass322_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)V")
	public void method8755(@OriginalArg(0) int arg0) {
		this.aStream7.b(arg0 * 4 + 3);
		this.aStream7.a(-1);
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(II)V")
	public void method8756(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass33_Sub3_43.aNativeHeap4.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIII)V")
	public void method8757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray714[arg1 * this.aClass42_Sub1_3.anInt8638 + arg2] |= 0x1 << arg0;
	}
}
