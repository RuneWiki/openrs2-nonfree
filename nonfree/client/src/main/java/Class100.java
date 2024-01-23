import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class100 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!kn;")
	private Class1_Sub2_Sub11_Sub2 aClass1_Sub2_Sub11_Sub2_2;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	private int anInt3384 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private int anInt3381;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	private int anInt3383;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	private int anInt3387;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[Lclient!qd;")
	private Class136[] aClass136Array1;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "[Lclient!qd;")
	private Class136[] aClass136Array2;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!qd;")
	private Class136 aClass136_1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[Lclient!qd;IIII)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) Class136[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3381 = arg3;
		this.anInt3386 = arg4;
		this.anInt3383 = arg5;
		this.anInt3387 = arg0;
		this.aClass136Array1 = arg1;
		if (arg1 == null) {
			this.aClass136Array2 = null;
			this.aClass136_1 = null;
		} else {
			this.aClass136Array2 = new Class136[arg1.length];
			this.aClass136_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
	public void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2738(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt3387 == -1) {
			Static50.method954(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub2_Sub11_Sub2_2 == null) {
				this.aClass1_Sub2_Sub11_Sub2_2 = Static110.anInterface2_1.method2276(this.anInt3385, false, this.anInt3387, Static110.aFloat18);
			}
			if (!Static110.anInterface2_1.method2273(this.anInt3387)) {
				Static50.method954(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub2_Sub11_Sub2_2 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static50.anInt1138; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static50.anInt1140; local100 += arg4) {
						this.aClass1_Sub2_Sub11_Sub2_2.method3778(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt3382 - 1; local47 >= 0; local47--) {
			this.aClass136Array2[local47].method3331(arg1, arg2, arg3, arg4, arg5, local8, this.aClass136_1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	private void method2738(@OriginalArg(0) int arg0) {
		if (this.anInt3384 == arg0) {
			return;
		}
		this.anInt3384 = arg0;
		@Pc(10) int local10 = Static215.method3400(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt3385) {
			this.anInt3385 = local10;
			this.aClass1_Sub2_Sub11_Sub2_2 = null;
		}
		if (this.aClass136Array1 == null) {
			return;
		}
		this.anInt3382 = 0;
		@Pc(36) int[] local36 = new int[this.aClass136Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass136Array1.length; local38++) {
			@Pc(48) Class136 local48 = this.aClass136Array1[local38];
			if (local48.method3332(this.anInt3381, this.anInt3386, this.anInt3383, this.anInt3384)) {
				local36[this.anInt3382] = local48.anInt4200;
				this.aClass136Array2[this.anInt3382++] = local48;
			}
		}
		Static130.method2226(0, this.anInt3382 - 1, local36, this.aClass136Array2);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIIII)V")
	public void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static277.aGL1;
		this.method2738(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static277.method4209(false);
		Static277.method4193(false);
		Static277.method4192(false);
		Static277.method4210();
		Static277.method4184(arg1, local14, arg2, local18);
		Static277.method4208();
		@Pc(36) int local36;
		for (local36 = this.anInt3382 - 1; local36 >= 0; local36--) {
			this.aClass136Array2[local36].method3339(this.aClass136_1);
		}
		if (this.anInt3387 == -1) {
			Static277.method4186(arg7);
		} else {
			if (!Static110.anInterface2_1.method2273(this.anInt3387)) {
				Static277.method4186(arg7);
			}
			Static110.anInterface2_1.method2265(this.anInt3385, this.anInt3387);
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
		for (local36 = this.anInt3382 - 1; local36 >= 0; local36--) {
			this.aClass136Array2[local36].method3347(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static277.method4215();
		Static277.method4192(true);
		Static277.method4193(true);
		Static277.method4209(true);
	}
}
