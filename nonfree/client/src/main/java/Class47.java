import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class47 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private int anInt1247;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	private int anInt1250;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!vn;")
	private Class4_Sub3_Sub14_Sub1 aClass4_Sub3_Sub14_Sub1_1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	private int anInt1245 = -1;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	private int anInt1246;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private int anInt1248;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private int anInt1249;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "[Lclient!kg;")
	private Class107[] aClass107Array1;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[Lclient!kg;")
	private Class107[] aClass107Array2;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Lclient!kg;")
	private Class107 aClass107_1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I[Lclient!kg;IIII)V")
	public Class47(@OriginalArg(0) int arg0, @OriginalArg(1) Class107[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1246 = arg3;
		this.anInt1248 = arg4;
		this.anInt1251 = arg5;
		this.anInt1249 = arg0;
		this.aClass107Array1 = arg1;
		if (arg1 == null) {
			this.aClass107Array2 = null;
			this.aClass107_1 = null;
		} else {
			this.aClass107Array2 = new Class107[arg1.length];
			this.aClass107_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
	public void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1029(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt1249 == -1) {
			Static270.method4242(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass4_Sub3_Sub14_Sub1_1 == null) {
				this.aClass4_Sub3_Sub14_Sub1_1 = Static158.anInterface5_1.method452(false, Static158.aFloat74, this.anInt1250, this.anInt1249);
			}
			if (!Static158.anInterface5_1.method443(this.anInt1249)) {
				Static270.method4242(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass4_Sub3_Sub14_Sub1_1 != null) {
				local47 = arg5 * arg4 / -512;
				@Pc(59) int local59;
				for (local59 = (arg3 - arg4) / 2 + local8 * arg4 / 512; local59 > arg4; local59 -= arg4) {
				}
				while (local59 < 0) {
					local59 += arg4;
				}
				while (local47 > arg4) {
					local47 -= arg4;
				}
				while (local47 < 0) {
					local47 += arg4;
				}
				for (@Pc(93) int local93 = local59 - arg4; local93 < arg3; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < arg4; local100 += arg4) {
						this.aClass4_Sub3_Sub14_Sub1_1.method4544(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt1247 - 1; local47 >= 0; local47--) {
			this.aClass107Array2[local47].method2306(arg1, arg2, arg3, arg4, arg5, local8, this.aClass107_1);
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIIIIII)V")
	public void method1025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static94.aGL1;
		this.method1029(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static94.method1593(false);
		Static94.method1610(false);
		Static94.method1588(false);
		Static94.method1595();
		Static94.method1606(arg1, local14, arg2, local18);
		Static94.method1589();
		@Pc(36) int local36;
		for (local36 = this.anInt1247 - 1; local36 >= 0; local36--) {
			this.aClass107Array2[local36].method2300(this.aClass107_1);
		}
		if (this.anInt1249 == -1) {
			Static94.method1615(arg7);
		} else {
			if (!Static158.anInterface5_1.method443(this.anInt1249)) {
				Static94.method1615(arg7);
			}
			Static158.anInterface5_1.method454(this.anInt1250, this.anInt1249);
			@Pc(71) float local71 = (float) arg5 / 512.0F;
			@Pc(76) float local76 = (float) local10 / -512.0F;
			@Pc(86) float local86 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
			local1.glBegin(7);
			local1.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			local1.glTexCoord2f(local76 - local86, local71);
			local1.glVertex2i(arg1, arg2);
			local1.glTexCoord2f(local76 - local86, local71 + 1.0F);
			local1.glVertex2i(arg1, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71 + 1.0F);
			local1.glVertex2i(local14, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71);
			local1.glVertex2i(local14, arg2);
			local1.glEnd();
		}
		for (local36 = this.anInt1247 - 1; local36 >= 0; local36--) {
			this.aClass107Array2[local36].method2299(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static94.method1591();
		Static94.method1588(true);
		Static94.method1610(true);
		Static94.method1593(true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	private void method1029(@OriginalArg(0) int arg0) {
		if (this.anInt1245 == arg0) {
			return;
		}
		this.anInt1245 = arg0;
		@Pc(10) int local10 = Static162.method2618(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt1250) {
			this.anInt1250 = local10;
			this.aClass4_Sub3_Sub14_Sub1_1 = null;
		}
		if (this.aClass107Array1 == null) {
			return;
		}
		this.anInt1247 = 0;
		@Pc(36) int[] local36 = new int[this.aClass107Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass107Array1.length; local38++) {
			@Pc(48) Class107 local48 = this.aClass107Array1[local38];
			if (local48.method2301(this.anInt1246, this.anInt1248, this.anInt1251, this.anInt1245)) {
				local36[this.anInt1247] = local48.anInt2860;
				this.aClass107Array2[this.anInt1247++] = local48;
			}
		}
		Static93.method2018(this.anInt1247 - 1, this.aClass107Array2, 0, local36);
	}
}
