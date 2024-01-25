import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class132_Sub1_Sub1 extends Class132_Sub1 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_35;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Lclient!ds;")
	private final Class56_Sub1 aClass56_Sub1_1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!tb;I)V")
	public Class132_Sub1_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass129_Sub2_35 = arg0;
		this.aClass56_Sub1_1 = new Class56_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	public int method4823() {
		return this.aClass56_Sub1_1.anInt1226;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(FILclient!ds;Lclient!ds;)V")
	public void method4824(@OriginalArg(0) float arg0, @OriginalArg(2) Class56_Sub1 arg1, @OriginalArg(3) Class56_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass129_Sub2_35.anOpengl2;
		@Pc(7) Class217 local7 = this.aClass129_Sub2_35.aClass217_4;
		if (this.aClass129_Sub2_35.aClass56_Sub4_6.anInt3013 != arg1.anInt1226 || this.aClass129_Sub2_35.aClass56_Sub4_6.anInt3012 != arg1.anInt1226) {
			this.aClass129_Sub2_35.aClass56_Sub4_6 = new Class56_Sub4(this.aClass129_Sub2_35, 3553, 6408, arg1.anInt1226, arg1.anInt1226);
		}
		if (arg2.anInt1226 != this.aClass129_Sub2_35.aClass56_Sub4_5.anInt3013 || arg2.anInt1226 != this.aClass129_Sub2_35.aClass56_Sub4_5.anInt3012) {
			this.aClass129_Sub2_35.aClass56_Sub4_5 = new Class56_Sub4(this.aClass129_Sub2_35, 3553, 6408, arg2.anInt1226, arg2.anInt1226);
		}
		this.aClass129_Sub2_35.method4920(Static290.anIntArray445);
		this.aClass129_Sub2_35.method4966();
		this.aClass129_Sub2_35.method5039(local7);
		this.aClass129_Sub2_35.method5030();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, (double) -1, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass56_Sub1_1.anInt1226, this.aClass56_Sub1_1.anInt1226);
		this.aClass129_Sub2_35.method5045(false);
		this.aClass129_Sub2_35.method5069(false);
		this.aClass129_Sub2_35.method5089(false);
		this.aClass129_Sub2_35.method5044(false);
		this.aClass129_Sub2_35.method5041();
		this.aClass129_Sub2_35.method5091(1);
		this.aClass129_Sub2_35.method5086(0.0F, 0.0F, 0.0F, arg0);
		this.aClass129_Sub2_35.method5067(34165, 34165);
		this.aClass129_Sub2_35.method5091(0);
		this.aClass129_Sub2_35.method5094(0);
		for (@Pc(165) int local165 = 0; local165 < 6; local165++) {
			@Pc(174) int local174 = local165 + 34069;
			local7.method5730(arg1, local174);
			this.aClass129_Sub2_35.aClass56_Sub4_6.method2549(0, 0, arg1.anInt1226, arg1.anInt1226);
			local7.method5730(arg2, local174);
			this.aClass129_Sub2_35.aClass56_Sub4_5.method2549(0, 0, arg2.anInt1226, arg2.anInt1226);
			local7.method5730(this.aClass56_Sub1_1, local174);
			this.aClass129_Sub2_35.method5091(1);
			this.aClass129_Sub2_35.method5084(this.aClass129_Sub2_35.aClass56_Sub4_5);
			this.aClass129_Sub2_35.method5091(0);
			this.aClass129_Sub2_35.method5084(this.aClass129_Sub2_35.aClass56_Sub4_6);
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
			this.aClass129_Sub2_35.method5091(1);
			this.aClass129_Sub2_35.method5084(null);
			this.aClass129_Sub2_35.method5091(0);
			this.aClass129_Sub2_35.method5084(null);
		}
		this.aClass129_Sub2_35.method5091(1);
		this.aClass129_Sub2_35.method5067(8448, 8448);
		this.aClass129_Sub2_35.method5091(0);
		local7.method5731(0);
		local3.glPopAttrib();
		this.aClass129_Sub2_35.method5082(local7);
		this.aClass129_Sub2_35.method4952(Static290.anIntArray445[0], Static290.anIntArray445[1], Static290.anIntArray445[2], Static290.anIntArray445[3]);
		this.aClass56_Sub1_1.method2538();
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)Lclient!ds;")
	@Override
	public Class56_Sub1 method5140() {
		return this.aClass56_Sub1_1;
	}
}
