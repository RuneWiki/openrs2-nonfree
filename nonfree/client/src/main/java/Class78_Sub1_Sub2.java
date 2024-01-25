import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class78_Sub1_Sub2 extends Class78_Sub1 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_34;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!vm;")
	private final Class44_Sub4 aClass44_Sub4_2;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!nf;I)V")
	public Class78_Sub1_Sub2(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass105_Sub1_34 = arg0;
		this.aClass44_Sub4_2 = new Class44_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)Lclient!vm;")
	@Override
	public Class44_Sub4 method4488() {
		return this.aClass44_Sub4_2;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!vm;FLclient!vm;I)V")
	public void method4489(@OriginalArg(0) Class44_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class44_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass105_Sub1_34.anOpengl1;
		@Pc(7) Class57 local7 = this.aClass105_Sub1_34.aClass57_3;
		if (this.aClass105_Sub1_34.aClass44_Sub1_4.anInt1285 != arg0.anInt6479 || this.aClass105_Sub1_34.aClass44_Sub1_4.anInt1287 != arg0.anInt6479) {
			this.aClass105_Sub1_34.aClass44_Sub1_4 = new Class44_Sub1(this.aClass105_Sub1_34, 3553, 6408, arg0.anInt6479, arg0.anInt6479);
		}
		if (arg2.anInt6479 != this.aClass105_Sub1_34.aClass44_Sub1_5.anInt1285 || arg2.anInt6479 != this.aClass105_Sub1_34.aClass44_Sub1_5.anInt1287) {
			this.aClass105_Sub1_34.aClass44_Sub1_5 = new Class44_Sub1(this.aClass105_Sub1_34, 3553, 6408, arg2.anInt6479, arg2.anInt6479);
		}
		this.aClass105_Sub1_34.method4292(Static249.anIntArray480);
		this.aClass105_Sub1_34.method4233();
		this.aClass105_Sub1_34.method3614(local7);
		this.aClass105_Sub1_34.method3596();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass44_Sub4_2.anInt6479, this.aClass44_Sub4_2.anInt6479);
		this.aClass105_Sub1_34.method3594(false);
		this.aClass105_Sub1_34.method3570(false);
		this.aClass105_Sub1_34.method3621(false);
		this.aClass105_Sub1_34.method3589(false);
		this.aClass105_Sub1_34.method3613();
		this.aClass105_Sub1_34.method3634(1);
		this.aClass105_Sub1_34.method3586(0.0F, 0.0F, 0.0F, arg1);
		this.aClass105_Sub1_34.method3562(34165, 34165);
		this.aClass105_Sub1_34.method3634(0);
		this.aClass105_Sub1_34.method3618(0);
		for (@Pc(155) int local155 = 0; local155 < 6; local155++) {
			@Pc(162) int local162 = local155 + 34069;
			local7.method1239(arg0, local162);
			this.aClass105_Sub1_34.aClass44_Sub1_4.method1073(0, 0, arg0.anInt6479, arg0.anInt6479);
			local7.method1239(arg2, local162);
			this.aClass105_Sub1_34.aClass44_Sub1_5.method1073(0, 0, arg2.anInt6479, arg2.anInt6479);
			local7.method1239(this.aClass44_Sub4_2, local162);
			this.aClass105_Sub1_34.method3634(1);
			this.aClass105_Sub1_34.method3591(this.aClass105_Sub1_34.aClass44_Sub1_5);
			this.aClass105_Sub1_34.method3634(0);
			this.aClass105_Sub1_34.method3591(this.aClass105_Sub1_34.aClass44_Sub1_4);
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
			this.aClass105_Sub1_34.method3634(1);
			this.aClass105_Sub1_34.method3591(null);
			this.aClass105_Sub1_34.method3634(0);
			this.aClass105_Sub1_34.method3591(null);
		}
		this.aClass105_Sub1_34.method3634(1);
		this.aClass105_Sub1_34.method3562(8448, 8448);
		this.aClass105_Sub1_34.method3634(0);
		local7.method1238(0);
		local3.glPopAttrib();
		this.aClass105_Sub1_34.method3629(local7);
		this.aClass105_Sub1_34.method4268(Static249.anIntArray480[0], Static249.anIntArray480[1], Static249.anIntArray480[2], Static249.anIntArray480[3]);
		this.aClass44_Sub4_2.method5571();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)I")
	public int method4490() {
		return this.aClass44_Sub4_2.anInt6479;
	}
}
