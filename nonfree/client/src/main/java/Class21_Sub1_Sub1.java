import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_10;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!qh;")
	private final Class7_Sub4 aClass7_Sub4_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!qi;I)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass82_Sub2_10 = arg0;
		this.aClass7_Sub4_1 = new Class7_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Lclient!qh;")
	@Override
	public Class7_Sub4 method2723() {
		return this.aClass7_Sub4_1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public int method583() {
		return this.aClass7_Sub4_1.anInt5179;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qh;FILclient!qh;)V")
	public void method584(@OriginalArg(0) Class7_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class7_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass82_Sub2_10.anOpengl2;
		@Pc(7) Class42 local7 = this.aClass82_Sub2_10.aClass42_3;
		if (arg2.anInt5179 != this.aClass82_Sub2_10.aClass7_Sub1_6.anInt5435 || this.aClass82_Sub2_10.aClass7_Sub1_6.anInt5434 != arg2.anInt5179) {
			this.aClass82_Sub2_10.aClass7_Sub1_6 = new Class7_Sub1(this.aClass82_Sub2_10, 3553, 6408, arg2.anInt5179, arg2.anInt5179);
		}
		if (arg0.anInt5179 != this.aClass82_Sub2_10.aClass7_Sub1_5.anInt5435 || this.aClass82_Sub2_10.aClass7_Sub1_5.anInt5434 != arg0.anInt5179) {
			this.aClass82_Sub2_10.aClass7_Sub1_5 = new Class7_Sub1(this.aClass82_Sub2_10, 3553, 6408, arg0.anInt5179, arg0.anInt5179);
		}
		this.aClass82_Sub2_10.method4523(Static20.anIntArray90);
		this.aClass82_Sub2_10.method4512();
		this.aClass82_Sub2_10.method4602(local7);
		this.aClass82_Sub2_10.method4590();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass7_Sub4_1.anInt5179, this.aClass7_Sub4_1.anInt5179);
		this.aClass82_Sub2_10.method4616(false);
		this.aClass82_Sub2_10.method4574(false);
		this.aClass82_Sub2_10.method4585(false);
		this.aClass82_Sub2_10.method4573(false);
		this.aClass82_Sub2_10.method4569();
		this.aClass82_Sub2_10.method4582(1);
		this.aClass82_Sub2_10.method4591(0.0F, 0.0F, 0.0F, arg1);
		this.aClass82_Sub2_10.method4624(34165, 34165);
		this.aClass82_Sub2_10.method4582(0);
		this.aClass82_Sub2_10.method4618(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(174) int local174 = local167 + 34069;
			local7.method932(arg2, local174);
			this.aClass82_Sub2_10.aClass7_Sub1_6.method4745(0, 0, arg2.anInt5179, arg2.anInt5179);
			local7.method932(arg0, local174);
			this.aClass82_Sub2_10.aClass7_Sub1_5.method4745(0, 0, arg0.anInt5179, arg0.anInt5179);
			local7.method932(this.aClass7_Sub4_1, local174);
			this.aClass82_Sub2_10.method4582(1);
			this.aClass82_Sub2_10.method4614(this.aClass82_Sub2_10.aClass7_Sub1_5);
			this.aClass82_Sub2_10.method4582(0);
			this.aClass82_Sub2_10.method4614(this.aClass82_Sub2_10.aClass7_Sub1_6);
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
			this.aClass82_Sub2_10.method4582(1);
			this.aClass82_Sub2_10.method4614(null);
			this.aClass82_Sub2_10.method4582(0);
			this.aClass82_Sub2_10.method4614(null);
		}
		this.aClass82_Sub2_10.method4582(1);
		this.aClass82_Sub2_10.method4624(8448, 8448);
		this.aClass82_Sub2_10.method4582(0);
		local7.method927(0);
		local3.glPopAttrib();
		this.aClass82_Sub2_10.method4579(local7);
		this.aClass82_Sub2_10.method4477(Static20.anIntArray90[0], Static20.anIntArray90[1], Static20.anIntArray90[2], Static20.anIntArray90[3]);
		this.aClass7_Sub4_1.method4735();
	}
}
