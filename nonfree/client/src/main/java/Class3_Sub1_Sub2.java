import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_22;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!gm;")
	private final Class81_Sub1 aClass81_Sub1_2;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!cg;I)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass37_Sub1_22 = arg0;
		this.aClass81_Sub1_2 = new Class81_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!gm;Lclient!gm;BF)V")
	public void method3587(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class81_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_22.anOpengl1;
		@Pc(7) Class23 local7 = this.aClass37_Sub1_22.aClass23_2;
		if (this.aClass37_Sub1_22.aClass81_Sub4_4.anInt5614 != arg0.anInt2373 || arg0.anInt2373 != this.aClass37_Sub1_22.aClass81_Sub4_4.anInt5612) {
			this.aClass37_Sub1_22.aClass81_Sub4_4 = new Class81_Sub4(this.aClass37_Sub1_22, 3553, 6408, arg0.anInt2373, arg0.anInt2373);
		}
		if (arg1.anInt2373 != this.aClass37_Sub1_22.aClass81_Sub4_2.anInt5614 || arg1.anInt2373 != this.aClass37_Sub1_22.aClass81_Sub4_2.anInt5612) {
			this.aClass37_Sub1_22.aClass81_Sub4_2 = new Class81_Sub4(this.aClass37_Sub1_22, 3553, 6408, arg1.anInt2373, arg1.anInt2373);
		}
		this.aClass37_Sub1_22.method3676(Static192.anIntArray315);
		this.aClass37_Sub1_22.method3709();
		this.aClass37_Sub1_22.method798(local7);
		this.aClass37_Sub1_22.method773();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass81_Sub1_2.anInt2373, this.aClass81_Sub1_2.anInt2373);
		this.aClass37_Sub1_22.method788(false);
		this.aClass37_Sub1_22.method793(false);
		this.aClass37_Sub1_22.method790(false);
		this.aClass37_Sub1_22.method772(false);
		this.aClass37_Sub1_22.method781();
		this.aClass37_Sub1_22.method759(1);
		this.aClass37_Sub1_22.method787(0.0F, 0.0F, 0.0F, arg2);
		this.aClass37_Sub1_22.method735(34165, 34165);
		this.aClass37_Sub1_22.method759(0);
		this.aClass37_Sub1_22.method774(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(174) int local174 = local167 + 34069;
			local7.method350(arg0, local174);
			this.aClass37_Sub1_22.aClass81_Sub4_4.method4747(0, 0, arg0.anInt2373, arg0.anInt2373);
			local7.method350(arg1, local174);
			this.aClass37_Sub1_22.aClass81_Sub4_2.method4747(0, 0, arg1.anInt2373, arg1.anInt2373);
			local7.method350(this.aClass81_Sub1_2, local174);
			this.aClass37_Sub1_22.method759(1);
			this.aClass37_Sub1_22.method767(this.aClass37_Sub1_22.aClass81_Sub4_2);
			this.aClass37_Sub1_22.method759(0);
			this.aClass37_Sub1_22.method767(this.aClass37_Sub1_22.aClass81_Sub4_4);
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
			this.aClass37_Sub1_22.method759(1);
			this.aClass37_Sub1_22.method767(null);
			this.aClass37_Sub1_22.method759(0);
			this.aClass37_Sub1_22.method767(null);
		}
		this.aClass37_Sub1_22.method759(1);
		this.aClass37_Sub1_22.method735(8448, 8448);
		this.aClass37_Sub1_22.method759(0);
		local7.method348(0);
		local3.glPopAttrib();
		this.aClass37_Sub1_22.method782(local7);
		this.aClass37_Sub1_22.method3677(Static192.anIntArray315[0], Static192.anIntArray315[1], Static192.anIntArray315[2], Static192.anIntArray315[3]);
		this.aClass81_Sub1_2.method4735();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Lclient!gm;")
	@Override
	public Class81_Sub1 method3586() {
		return this.aClass81_Sub1_2;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)I")
	public int method3588() {
		return this.aClass81_Sub1_2.anInt2373;
	}
}
