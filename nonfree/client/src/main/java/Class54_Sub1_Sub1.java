import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class54_Sub1_Sub1 extends Class54_Sub1 {

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_12;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!fq;")
	private final Class60_Sub2 aClass60_Sub2_1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!mm;I)V")
	public Class54_Sub1_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass55_Sub1_12 = arg0;
		this.aClass60_Sub2_1 = new Class60_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!fq;Lclient!fq;F)V")
	public void method1014(@OriginalArg(1) Class60_Sub2 arg0, @OriginalArg(2) Class60_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass55_Sub1_12.anOpengl1;
		@Pc(7) Class167 local7 = this.aClass55_Sub1_12.aClass167_4;
		if (this.aClass55_Sub1_12.aClass60_Sub4_5.anInt6574 != arg0.anInt1838 || this.aClass55_Sub1_12.aClass60_Sub4_5.anInt6575 != arg0.anInt1838) {
			this.aClass55_Sub1_12.aClass60_Sub4_5 = new Class60_Sub4(this.aClass55_Sub1_12, 3553, 6408, arg0.anInt1838, arg0.anInt1838);
		}
		if (arg1.anInt1838 != this.aClass55_Sub1_12.aClass60_Sub4_6.anInt6574 || this.aClass55_Sub1_12.aClass60_Sub4_6.anInt6575 != arg1.anInt1838) {
			this.aClass55_Sub1_12.aClass60_Sub4_6 = new Class60_Sub4(this.aClass55_Sub1_12, 3553, 6408, arg1.anInt1838, arg1.anInt1838);
		}
		this.aClass55_Sub1_12.method5203(Static65.anIntArray102);
		this.aClass55_Sub1_12.method5186();
		this.aClass55_Sub1_12.method3685(local7);
		this.aClass55_Sub1_12.method3656();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass60_Sub2_1.anInt1838, this.aClass60_Sub2_1.anInt1838);
		this.aClass55_Sub1_12.method3638(false);
		this.aClass55_Sub1_12.method3695(false);
		this.aClass55_Sub1_12.method3701(false);
		this.aClass55_Sub1_12.method3671(false);
		this.aClass55_Sub1_12.method3666();
		this.aClass55_Sub1_12.method3693(1);
		this.aClass55_Sub1_12.method3676(0.0F, 0.0F, 0.0F, arg2);
		this.aClass55_Sub1_12.method3709(34165, 34165);
		this.aClass55_Sub1_12.method3693(0);
		this.aClass55_Sub1_12.method3655(0);
		for (@Pc(171) int local171 = 0; local171 < 6; local171++) {
			@Pc(181) int local181 = local171 + 34069;
			local7.method4547(arg0, local181);
			this.aClass55_Sub1_12.aClass60_Sub4_5.method5851(0, 0, arg0.anInt1838, arg0.anInt1838);
			local7.method4547(arg1, local181);
			this.aClass55_Sub1_12.aClass60_Sub4_6.method5851(0, 0, arg1.anInt1838, arg1.anInt1838);
			local7.method4547(this.aClass60_Sub2_1, local181);
			this.aClass55_Sub1_12.method3693(1);
			this.aClass55_Sub1_12.method3677(this.aClass55_Sub1_12.aClass60_Sub4_6);
			this.aClass55_Sub1_12.method3693(0);
			this.aClass55_Sub1_12.method3677(this.aClass55_Sub1_12.aClass60_Sub4_5);
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
			this.aClass55_Sub1_12.method3693(1);
			this.aClass55_Sub1_12.method3677(null);
			this.aClass55_Sub1_12.method3693(0);
			this.aClass55_Sub1_12.method3677(null);
		}
		this.aClass55_Sub1_12.method3693(1);
		this.aClass55_Sub1_12.method3709(8448, 8448);
		this.aClass55_Sub1_12.method3693(0);
		local7.method4544(0);
		local3.glPopAttrib();
		this.aClass55_Sub1_12.method3688(local7);
		this.aClass55_Sub1_12.method5258(Static65.anIntArray102[0], Static65.anIntArray102[1], Static65.anIntArray102[2], Static65.anIntArray102[3]);
		this.aClass60_Sub2_1.method5838();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
	public int method1015() {
		return this.aClass60_Sub2_1.anInt1838;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Lclient!fq;")
	@Override
	public Class60_Sub2 method2238() {
		return this.aClass60_Sub2_1;
	}
}
