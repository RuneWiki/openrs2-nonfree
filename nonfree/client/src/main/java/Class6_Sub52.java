import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class6_Sub52 extends Class6 {

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!ce;")
	private Class45 aClass45_15;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer8;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "Lclient!rk;")
	private final Class59_Sub3 aClass59_Sub3_3;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public final int anInt9575;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_44;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "F")
	public final float aFloat203;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public final int anInt9574;

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
	public final int anInt9578;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public final int anInt9577;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "[I")
	private final int[] anIntArray716;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!ea;")
	private final Class77_Sub1 aClass77_Sub1_2;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!rk;IIIII)V")
	public Class6_Sub52(@OriginalArg(0) Class59_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass59_Sub3_3 = arg0;
		this.anInt9575 = arg1;
		this.aClass14_Sub3_44 = this.aClass59_Sub3_3.aClass14_Sub3_37;
		this.aFloat203 = arg2;
		this.anInt9574 = arg4;
		this.anInt9578 = arg5;
		this.anInt9577 = arg3;
		this.anIntArray716 = new int[this.aClass59_Sub3_3.anInt9639 * this.aClass59_Sub3_3.anInt9640];
		this.aClass77_Sub1_2 = new Class77_Sub1(this.aClass14_Sub3_44, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	public void method7806(@OriginalArg(1) int arg0) {
		this.aStream7.e(arg0 * 4 + 3);
		this.aStream7.b(-1);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	public void method7807(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer8 = this.aClass14_Sub3_44.aNativeHeap4.a(arg0 * 4, true);
		this.aStream7 = new Stream(this.aNativeHeapBuffer8);
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
	public void method7808(@OriginalArg(1) int arg0) {
		this.aStream7.c();
		@Pc(18) Interface1 local18 = this.aClass14_Sub3_44.method3936(4, arg0 * 4, this.aNativeHeapBuffer8);
		this.aClass45_15 = new Class45(local18, 5121, 4, 0);
		this.aNativeHeapBuffer8 = null;
		this.aStream7 = null;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[II)V")
	public void method7809(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6_Sub21_Sub1 local11 = this.aClass14_Sub3_44.aClass6_Sub21_Sub1_1;
		local11.anInt7338 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass14_Sub3_44.aBoolean298) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass59_Sub3_3.aShortArrayArray9[local26];
				local37 = this.anIntArray716[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local32.length > local48) {
						if ((local37 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local7++;
							local11.method6052(local32[local48++] & 0xFFFF);
							local7++;
							local11.method6052(local32[local48++] & 0xFFFF);
							local7++;
							local11.method6052(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass59_Sub3_3.aShortArrayArray9[local26];
				local37 = this.anIntArray716[local26];
				if (local37 != 0 && local32 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local32.length) {
						if ((0x1 << local46++ & local37) == 0) {
							local48 += 3;
						} else {
							local11.method6032(local32[local48++] & 0xFFFF);
							local7++;
							local11.method6032(local32[local48++] & 0xFFFF);
							local7++;
							local7++;
							local11.method6032(local32[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass77_Sub1_2.method5683(local11.aByteArray93, local11.anInt7338);
		this.aClass14_Sub3_44.method3981(this.aClass59_Sub3_3.aClass45_13, this.aClass45_15, this.aClass59_Sub3_3.aClass45_14, this.aClass59_Sub3_3.aClass45_11);
		this.aClass14_Sub3_44.method3939((this.aClass59_Sub3_3.anInt7820 & 0x7) != 0, this.anInt9575, (this.aClass59_Sub3_3.anInt7820 & 0x8) != 0);
		if (this.aClass14_Sub3_44.aBoolean308) {
			this.aClass14_Sub3_44.LA(Integer.MAX_VALUE, this.anInt9577, this.anInt9574, this.anInt9578);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat203, 1.0F / this.aFloat203, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass14_Sub3_44.method3981(this.aClass59_Sub3_3.aClass45_13, this.aClass45_15, this.aClass59_Sub3_3.aClass45_14, this.aClass59_Sub3_3.aClass45_11);
		this.aClass14_Sub3_44.method3920(this.aClass77_Sub1_2, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
	public void method7810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray716[arg1 * this.aClass59_Sub3_3.anInt9640 + arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIF)V")
	public void method7811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(22) int local22;
		@Pc(37) int local37;
		if (this.anInt9575 != -1) {
			@Pc(17) Class313 local17 = this.aClass14_Sub3_44.anInterface4_15.method4234(this.anInt9575);
			local22 = local17.aByte101 & 0xFF;
			@Pc(64) int local64;
			if (local22 != 0 && local17.aByte98 != 4) {
				if (arg2 < 0) {
					local37 = 0;
				} else if (arg2 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg2 * 131586;
				}
				if (local22 == 256) {
					arg0 = local37;
				} else {
					local64 = 256 - local22;
					arg0 = (local22 * (local37 & 0xFF00) + (arg0 & 0xFF00) * local64 & 0xFF0000) + (local64 * (arg0 & 0xFF00FF) + (local37 & 0xFF00FF) * local22 & 0xFF00FF00) >> 8;
				}
			}
			local37 = local17.aByte100 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(113) int local113 = local37 * (arg0 >> 16 & 0xFF);
				if (local113 > 65535) {
					local113 = 65535;
				}
				local64 = (arg0 >> 8 & 0xFF) * local37;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(139) int local139 = (arg0 & 0xFF) * local37;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg0 = (local64 & 0xFF00) + (((local113 & 0xD300FF00) << 8) + (local139 >> 8));
			}
		}
		if (arg3 != 1.0F) {
			@Pc(169) int local169 = arg0 >> 16 & 0xFF;
			local22 = arg0 >> 8 & 0xFF;
			local37 = arg0 & 0xFF;
			local169 = (int) ((float) local169 * arg3);
			if (local169 < 0) {
				local169 = 0;
			} else if (local169 > 255) {
				local169 = 255;
			}
			local22 = (int) ((float) local22 * arg3);
			local37 = (int) ((float) local37 * arg3);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg0 = local37 | local22 << 8 | local169 << 16;
		}
		this.aStream7.e(arg1 * 4);
		this.aStream7.b((byte) (arg0 >> 16));
		this.aStream7.b((byte) (arg0 >> 8));
		this.aStream7.b((byte) arg0);
	}
}
