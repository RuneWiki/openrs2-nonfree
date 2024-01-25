import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class81_Sub1_Sub2 extends Class81_Sub1 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_41;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!wl;")
	private final Class52_Sub4 aClass52_Sub4_2;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ig;I)V")
	public Class81_Sub1_Sub2(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass47_Sub2_41 = arg0;
		this.aClass52_Sub4_2 = new Class52_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)I")
	public int method5600() {
		return this.aClass52_Sub4_2.anInt6687;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!wl;FLclient!wl;)V")
	public void method5601(@OriginalArg(1) Class52_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class52_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass47_Sub2_41.anOpengl2;
		@Pc(7) Class77 local7 = this.aClass47_Sub2_41.aClass77_4;
		if (arg2.anInt6687 != this.aClass47_Sub2_41.aClass52_Sub1_5.anInt5495 || arg2.anInt6687 != this.aClass47_Sub2_41.aClass52_Sub1_5.anInt5496) {
			this.aClass47_Sub2_41.aClass52_Sub1_5 = new Class52_Sub1(this.aClass47_Sub2_41, 3553, 6408, arg2.anInt6687, arg2.anInt6687);
		}
		if (arg0.anInt6687 != this.aClass47_Sub2_41.aClass52_Sub1_6.anInt5495 || arg0.anInt6687 != this.aClass47_Sub2_41.aClass52_Sub1_6.anInt5496) {
			this.aClass47_Sub2_41.aClass52_Sub1_6 = new Class52_Sub1(this.aClass47_Sub2_41, 3553, 6408, arg0.anInt6687, arg0.anInt6687);
		}
		this.aClass47_Sub2_41.method2699(Static352.anIntArray508);
		this.aClass47_Sub2_41.method2722();
		this.aClass47_Sub2_41.method2767(local7);
		this.aClass47_Sub2_41.method2816();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass52_Sub4_2.anInt6687, this.aClass52_Sub4_2.anInt6687);
		this.aClass47_Sub2_41.method2798(false);
		this.aClass47_Sub2_41.method2825(false);
		this.aClass47_Sub2_41.method2794(false);
		this.aClass47_Sub2_41.method2810(false);
		this.aClass47_Sub2_41.method2814();
		this.aClass47_Sub2_41.method2828(1);
		this.aClass47_Sub2_41.method2792(0.0F, (float) 0, 0.0F, arg1);
		this.aClass47_Sub2_41.method2790(34165, 34165);
		this.aClass47_Sub2_41.method2828(0);
		this.aClass47_Sub2_41.method2782(0);
		for (@Pc(168) int local168 = 0; local168 < 6; local168++) {
			@Pc(175) int local175 = local168 + 34069;
			local7.method2290(arg2, local175);
			this.aClass47_Sub2_41.aClass52_Sub1_5.method4730(0, 0, arg2.anInt6687, arg2.anInt6687);
			local7.method2290(arg0, local175);
			this.aClass47_Sub2_41.aClass52_Sub1_6.method4730(0, 0, arg0.anInt6687, arg0.anInt6687);
			local7.method2290(this.aClass52_Sub4_2, local175);
			this.aClass47_Sub2_41.method2828(1);
			this.aClass47_Sub2_41.method2772(this.aClass47_Sub2_41.aClass52_Sub1_6);
			this.aClass47_Sub2_41.method2828(0);
			this.aClass47_Sub2_41.method2772(this.aClass47_Sub2_41.aClass52_Sub1_5);
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
			this.aClass47_Sub2_41.method2828(1);
			this.aClass47_Sub2_41.method2772(null);
			this.aClass47_Sub2_41.method2828(0);
			this.aClass47_Sub2_41.method2772(null);
		}
		this.aClass47_Sub2_41.method2828(1);
		this.aClass47_Sub2_41.method2790(8448, 8448);
		this.aClass47_Sub2_41.method2828(0);
		local7.method2289(0);
		local3.glPopAttrib();
		this.aClass47_Sub2_41.method2808(local7);
		this.aClass47_Sub2_41.method2709(Static352.anIntArray508[0], Static352.anIntArray508[1], Static352.anIntArray508[2], Static352.anIntArray508[3]);
		this.aClass52_Sub4_2.method5607();
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Lclient!wl;")
	@Override
	public Class52_Sub4 method5599() {
		return this.aClass52_Sub4_2;
	}
}
