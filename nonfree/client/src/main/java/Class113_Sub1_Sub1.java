import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class113_Sub1_Sub1 extends Class113_Sub1 {

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_25;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "Lclient!pi;")
	private final Class66_Sub4 aClass66_Sub4_1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!se;I)V")
	public Class113_Sub1_Sub1(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass122_Sub2_25 = arg0;
		this.aClass66_Sub4_1 = new Class66_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!pi;FZLclient!pi;)V")
	public void method3539(@OriginalArg(0) Class66_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class66_Sub4 arg2) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_25.anOpengl2;
		@Pc(7) Class109 local7 = this.aClass122_Sub2_25.aClass109_3;
		if (arg2.anInt4756 != this.aClass122_Sub2_25.aClass66_Sub1_4.anInt1844 || this.aClass122_Sub2_25.aClass66_Sub1_4.anInt1842 != arg2.anInt4756) {
			this.aClass122_Sub2_25.aClass66_Sub1_4 = new Class66_Sub1(this.aClass122_Sub2_25, 3553, 6408, arg2.anInt4756, arg2.anInt4756);
		}
		if (this.aClass122_Sub2_25.aClass66_Sub1_5.anInt1844 != arg0.anInt4756 || this.aClass122_Sub2_25.aClass66_Sub1_5.anInt1842 != arg0.anInt4756) {
			this.aClass122_Sub2_25.aClass66_Sub1_5 = new Class66_Sub1(this.aClass122_Sub2_25, 3553, 6408, arg0.anInt4756, arg0.anInt4756);
		}
		this.aClass122_Sub2_25.method4796(Static202.anIntArray345);
		this.aClass122_Sub2_25.method4734();
		this.aClass122_Sub2_25.method4833(local7);
		this.aClass122_Sub2_25.method4848();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass66_Sub4_1.anInt4756, this.aClass66_Sub4_1.anInt4756);
		this.aClass122_Sub2_25.method4852(false);
		this.aClass122_Sub2_25.method4880(false);
		this.aClass122_Sub2_25.method4871(false);
		this.aClass122_Sub2_25.method4841(false);
		this.aClass122_Sub2_25.method4810();
		this.aClass122_Sub2_25.method4811(1);
		this.aClass122_Sub2_25.method4857(0.0F, 0.0F, 0.0F, arg1);
		this.aClass122_Sub2_25.method4860(34165, 34165);
		this.aClass122_Sub2_25.method4811(0);
		this.aClass122_Sub2_25.method4859(0);
		for (@Pc(155) int local155 = 0; local155 < 6; local155++) {
			@Pc(164) int local164 = local155 + 34069;
			local7.method2434(arg2, local164);
			this.aClass122_Sub2_25.aClass66_Sub1_4.method1514(0, 0, arg2.anInt4756, arg2.anInt4756);
			local7.method2434(arg0, local164);
			this.aClass122_Sub2_25.aClass66_Sub1_5.method1514(0, 0, arg0.anInt4756, arg0.anInt4756);
			local7.method2434(this.aClass66_Sub4_1, local164);
			this.aClass122_Sub2_25.method4811(1);
			this.aClass122_Sub2_25.method4864(this.aClass122_Sub2_25.aClass66_Sub1_5);
			this.aClass122_Sub2_25.method4811(0);
			this.aClass122_Sub2_25.method4864(this.aClass122_Sub2_25.aClass66_Sub1_4);
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
			this.aClass122_Sub2_25.method4811(1);
			this.aClass122_Sub2_25.method4864(null);
			this.aClass122_Sub2_25.method4811(0);
			this.aClass122_Sub2_25.method4864(null);
		}
		this.aClass122_Sub2_25.method4811(1);
		this.aClass122_Sub2_25.method4860(8448, 8448);
		this.aClass122_Sub2_25.method4811(0);
		local7.method2429(0);
		local3.glPopAttrib();
		this.aClass122_Sub2_25.method4865(local7);
		this.aClass122_Sub2_25.method4768(Static202.anIntArray345[0], Static202.anIntArray345[1], Static202.anIntArray345[2], Static202.anIntArray345[3]);
		this.aClass66_Sub4_1.method4045();
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Lclient!pi;")
	@Override
	public Class66_Sub4 method5316() {
		return this.aClass66_Sub4_1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)I")
	public int method3540() {
		return this.aClass66_Sub4_1.anInt4756;
	}
}
