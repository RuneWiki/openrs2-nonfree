import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_16;

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "Lclient!cd;")
	private final Class15_Sub1 aClass15_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!nm;I)V")
	public Class16_Sub1_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass164_Sub1_16 = arg0;
		this.aClass15_Sub1_1 = new Class15_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	public int method2332() {
		return this.aClass15_Sub1_1.anInt820;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)Lclient!cd;")
	@Override
	public Class15_Sub1 method2857() {
		return this.aClass15_Sub1_1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!cd;Lclient!cd;F)V")
	public void method2333(@OriginalArg(1) Class15_Sub1 arg0, @OriginalArg(2) Class15_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass164_Sub1_16.anOpengl1;
		@Pc(11) Class90 local11 = this.aClass164_Sub1_16.aClass90_4;
		if (this.aClass164_Sub1_16.aClass15_Sub2_5.anInt5853 != arg0.anInt820 || this.aClass164_Sub1_16.aClass15_Sub2_5.anInt5854 != arg0.anInt820) {
			this.aClass164_Sub1_16.aClass15_Sub2_5 = new Class15_Sub2(this.aClass164_Sub1_16, 3553, 6408, arg0.anInt820, arg0.anInt820);
		}
		if (arg1.anInt820 != this.aClass164_Sub1_16.aClass15_Sub2_7.anInt5853 || arg1.anInt820 != this.aClass164_Sub1_16.aClass15_Sub2_7.anInt5854) {
			this.aClass164_Sub1_16.aClass15_Sub2_7 = new Class15_Sub2(this.aClass164_Sub1_16, 3553, 6408, arg1.anInt820, arg1.anInt820);
		}
		this.aClass164_Sub1_16.method5353(Static154.anIntArray336);
		this.aClass164_Sub1_16.method5306();
		this.aClass164_Sub1_16.method3562(local11);
		this.aClass164_Sub1_16.method3632();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass15_Sub1_1.anInt820, this.aClass15_Sub1_1.anInt820);
		this.aClass164_Sub1_16.method3602(false);
		this.aClass164_Sub1_16.method3581(false);
		this.aClass164_Sub1_16.method3563(false);
		this.aClass164_Sub1_16.method3606(false);
		this.aClass164_Sub1_16.method3630();
		this.aClass164_Sub1_16.method3584(1);
		this.aClass164_Sub1_16.method3566(0.0F, 0.0F, 0.0F, arg2);
		this.aClass164_Sub1_16.method3629(34165, 34165);
		this.aClass164_Sub1_16.method3584(0);
		this.aClass164_Sub1_16.method3586(0);
		for (@Pc(168) int local168 = 0; local168 < 6; local168++) {
			@Pc(177) int local177 = local168 + 34069;
			local11.method1709(arg0, local177);
			this.aClass164_Sub1_16.aClass15_Sub2_5.method5039(0, 0, arg0.anInt820, arg0.anInt820);
			local11.method1709(arg1, local177);
			this.aClass164_Sub1_16.aClass15_Sub2_7.method5039(0, 0, arg1.anInt820, arg1.anInt820);
			local11.method1709(this.aClass15_Sub1_1, local177);
			this.aClass164_Sub1_16.method3584(1);
			this.aClass164_Sub1_16.method3603(this.aClass164_Sub1_16.aClass15_Sub2_7);
			this.aClass164_Sub1_16.method3584(0);
			this.aClass164_Sub1_16.method3603(this.aClass164_Sub1_16.aClass15_Sub2_5);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
			this.aClass164_Sub1_16.method3584(1);
			this.aClass164_Sub1_16.method3603(null);
			this.aClass164_Sub1_16.method3584(0);
			this.aClass164_Sub1_16.method3603(null);
		}
		this.aClass164_Sub1_16.method3584(1);
		this.aClass164_Sub1_16.method3629(8448, 8448);
		this.aClass164_Sub1_16.method3584(0);
		local11.method1712(0);
		local3.glPopAttrib();
		this.aClass164_Sub1_16.method3609(local11);
		this.aClass164_Sub1_16.method5313(Static154.anIntArray336[0], Static154.anIntArray336[1], Static154.anIntArray336[2], Static154.anIntArray336[3]);
		this.aClass15_Sub1_1.method5555();
	}
}
