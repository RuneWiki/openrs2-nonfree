import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class17_Sub1_Sub2 extends Class17_Sub1 {

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_15;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!m;")
	private final Class92_Sub3 aClass92_Sub3_2;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!hd;I)V")
	public Class17_Sub1_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass89_Sub1_15 = arg0;
		this.aClass92_Sub3_2 = new Class92_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!m;FLclient!m;)V")
	public void method1866(@OriginalArg(1) Class92_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class92_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_15.anOpengl2;
		@Pc(7) Class85 local7 = this.aClass89_Sub1_15.aClass85_3;
		if (this.aClass89_Sub1_15.aClass92_Sub4_3.anInt3881 != arg0.anInt3842 || arg0.anInt3842 != this.aClass89_Sub1_15.aClass92_Sub4_3.anInt3880) {
			this.aClass89_Sub1_15.aClass92_Sub4_3 = new Class92_Sub4(this.aClass89_Sub1_15, 3553, 6408, arg0.anInt3842, arg0.anInt3842);
		}
		if (this.aClass89_Sub1_15.aClass92_Sub4_4.anInt3881 != arg2.anInt3842 || arg2.anInt3842 != this.aClass89_Sub1_15.aClass92_Sub4_4.anInt3880) {
			this.aClass89_Sub1_15.aClass92_Sub4_4 = new Class92_Sub4(this.aClass89_Sub1_15, 3553, 6408, arg2.anInt3842, arg2.anInt3842);
		}
		this.aClass89_Sub1_15.method5421(Static90.anIntArray307);
		this.aClass89_Sub1_15.method5425();
		this.aClass89_Sub1_15.method2468(local7);
		this.aClass89_Sub1_15.method2449();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass92_Sub3_2.anInt3842, this.aClass92_Sub3_2.anInt3842);
		this.aClass89_Sub1_15.method2436(false);
		this.aClass89_Sub1_15.method2407(false);
		this.aClass89_Sub1_15.method2414(false);
		this.aClass89_Sub1_15.method2424(false);
		this.aClass89_Sub1_15.method2438();
		this.aClass89_Sub1_15.method2433(1);
		this.aClass89_Sub1_15.method2429(0.0F, 0.0F, 0.0F, arg1);
		this.aClass89_Sub1_15.method2419(34165, 34165);
		this.aClass89_Sub1_15.method2433(0);
		this.aClass89_Sub1_15.method2425(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(176) int local176 = local167 + 34069;
			local7.method2075(arg0, local176);
			this.aClass89_Sub1_15.aClass92_Sub4_3.method3532(0, 0, arg0.anInt3842, arg0.anInt3842);
			local7.method2075(arg2, local176);
			this.aClass89_Sub1_15.aClass92_Sub4_4.method3532(0, 0, arg2.anInt3842, arg2.anInt3842);
			local7.method2075(this.aClass92_Sub3_2, local176);
			this.aClass89_Sub1_15.method2433(1);
			this.aClass89_Sub1_15.method2445(this.aClass89_Sub1_15.aClass92_Sub4_4);
			this.aClass89_Sub1_15.method2433(0);
			this.aClass89_Sub1_15.method2445(this.aClass89_Sub1_15.aClass92_Sub4_3);
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
			this.aClass89_Sub1_15.method2433(1);
			this.aClass89_Sub1_15.method2445(null);
			this.aClass89_Sub1_15.method2433(0);
			this.aClass89_Sub1_15.method2445(null);
		}
		this.aClass89_Sub1_15.method2433(1);
		this.aClass89_Sub1_15.method2419(8448, 8448);
		this.aClass89_Sub1_15.method2433(0);
		local7.method2072(0);
		local3.glPopAttrib();
		this.aClass89_Sub1_15.method2447(local7);
		this.aClass89_Sub1_15.method5431(Static90.anIntArray307[0], Static90.anIntArray307[1], Static90.anIntArray307[2], Static90.anIntArray307[3]);
		this.aClass92_Sub3_2.method3527();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)Lclient!m;")
	@Override
	public Class92_Sub3 method1865() {
		return this.aClass92_Sub3_2;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)I")
	public int method1867() {
		return this.aClass92_Sub3_2.anInt3842;
	}
}
