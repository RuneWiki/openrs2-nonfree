import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_15;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!ea;")
	private final Class19_Sub2 aClass19_Sub2_1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!ks;I)V")
	public Class13_Sub1_Sub1(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass63_Sub1_15 = arg0;
		this.aClass19_Sub2_1 = new Class19_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!ea;")
	@Override
	public Class19_Sub2 method5276() {
		return this.aClass19_Sub2_1;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
	public int method1559() {
		return this.aClass19_Sub2_1.anInt1573;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(FLclient!ea;Lclient!ea;I)V")
	public void method1560(@OriginalArg(0) float arg0, @OriginalArg(1) Class19_Sub2 arg1, @OriginalArg(2) Class19_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass63_Sub1_15.anOpengl1;
		@Pc(7) Class197 local7 = this.aClass63_Sub1_15.aClass197_1;
		if (arg2.anInt1573 != this.aClass63_Sub1_15.aClass19_Sub3_1.anInt3964 || arg2.anInt1573 != this.aClass63_Sub1_15.aClass19_Sub3_1.anInt3963) {
			this.aClass63_Sub1_15.aClass19_Sub3_1 = new Class19_Sub3(this.aClass63_Sub1_15, 3553, 6408, arg2.anInt1573, arg2.anInt1573);
		}
		if (this.aClass63_Sub1_15.aClass19_Sub3_2.anInt3964 != arg1.anInt1573 || arg1.anInt1573 != this.aClass63_Sub1_15.aClass19_Sub3_2.anInt3963) {
			this.aClass63_Sub1_15.aClass19_Sub3_2 = new Class19_Sub3(this.aClass63_Sub1_15, 3553, 6408, arg1.anInt1573, arg1.anInt1573);
		}
		this.aClass63_Sub1_15.method4565(Static68.anIntArray133);
		this.aClass63_Sub1_15.method4651();
		this.aClass63_Sub1_15.method3329(local7);
		this.aClass63_Sub1_15.method3365();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass19_Sub2_1.anInt1573, this.aClass19_Sub2_1.anInt1573);
		this.aClass63_Sub1_15.method3339(false);
		this.aClass63_Sub1_15.method3330(false);
		this.aClass63_Sub1_15.method3357(false);
		this.aClass63_Sub1_15.method3384(false);
		this.aClass63_Sub1_15.method3331();
		this.aClass63_Sub1_15.method3345(1);
		this.aClass63_Sub1_15.method3335(0.0F, 0.0F, 0.0F, arg0);
		this.aClass63_Sub1_15.method3356(34165, 34165);
		this.aClass63_Sub1_15.method3345(0);
		this.aClass63_Sub1_15.method3340(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(176) int local176 = local167 + 34069;
			local7.method5359(arg2, local176);
			this.aClass63_Sub1_15.aClass19_Sub3_1.method3678(0, 0, arg2.anInt1573, arg2.anInt1573);
			local7.method5359(arg1, local176);
			this.aClass63_Sub1_15.aClass19_Sub3_2.method3678(0, 0, arg1.anInt1573, arg1.anInt1573);
			local7.method5359(this.aClass19_Sub2_1, local176);
			this.aClass63_Sub1_15.method3345(1);
			this.aClass63_Sub1_15.method3355(this.aClass63_Sub1_15.aClass19_Sub3_2);
			this.aClass63_Sub1_15.method3345(0);
			this.aClass63_Sub1_15.method3355(this.aClass63_Sub1_15.aClass19_Sub3_1);
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
			this.aClass63_Sub1_15.method3345(1);
			this.aClass63_Sub1_15.method3355(null);
			this.aClass63_Sub1_15.method3345(0);
			this.aClass63_Sub1_15.method3355(null);
		}
		this.aClass63_Sub1_15.method3345(1);
		this.aClass63_Sub1_15.method3356(8448, 8448);
		this.aClass63_Sub1_15.method3345(0);
		local7.method5358(0);
		local3.glPopAttrib();
		this.aClass63_Sub1_15.method3377(local7);
		this.aClass63_Sub1_15.method4566(Static68.anIntArray133[0], Static68.anIntArray133[1], Static68.anIntArray133[2], Static68.anIntArray133[3]);
		this.aClass19_Sub2_1.method4246();
	}
}
