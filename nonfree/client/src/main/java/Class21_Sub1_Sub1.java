import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_33;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Lclient!bl;")
	private final Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!fu;I)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass63_Sub2_33 = arg0;
		this.aClass20_Sub1_1 = new Class20_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)I")
	public int method4177() {
		return this.aClass20_Sub1_1.anInt628;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lclient!bl;")
	@Override
	public Class20_Sub1 method4646() {
		return this.aClass20_Sub1_1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BFLclient!bl;Lclient!bl;)V")
	public void method4178(@OriginalArg(1) float arg0, @OriginalArg(2) Class20_Sub1 arg1, @OriginalArg(3) Class20_Sub1 arg2) {
		@Pc(3) opengl local3 = this.aClass63_Sub2_33.anOpengl2;
		@Pc(7) Class99 local7 = this.aClass63_Sub2_33.aClass99_3;
		if (arg1.anInt628 != this.aClass63_Sub2_33.aClass20_Sub4_4.anInt6337 || this.aClass63_Sub2_33.aClass20_Sub4_4.anInt6336 != arg1.anInt628) {
			this.aClass63_Sub2_33.aClass20_Sub4_4 = new Class20_Sub4(this.aClass63_Sub2_33, 3553, 6408, arg1.anInt628, arg1.anInt628);
		}
		if (this.aClass63_Sub2_33.aClass20_Sub4_5.anInt6337 != arg2.anInt628 || arg2.anInt628 != this.aClass63_Sub2_33.aClass20_Sub4_5.anInt6336) {
			this.aClass63_Sub2_33.aClass20_Sub4_5 = new Class20_Sub4(this.aClass63_Sub2_33, 3553, 6408, arg2.anInt628, arg2.anInt628);
		}
		this.aClass63_Sub2_33.method1962(Static274.anIntArray913);
		this.aClass63_Sub2_33.method1967();
		this.aClass63_Sub2_33.method2077(local7);
		this.aClass63_Sub2_33.method2075();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass20_Sub1_1.anInt628, this.aClass20_Sub1_1.anInt628);
		this.aClass63_Sub2_33.method2118(false);
		this.aClass63_Sub2_33.method2085(false);
		this.aClass63_Sub2_33.method2073(false);
		this.aClass63_Sub2_33.method2103(false);
		this.aClass63_Sub2_33.method2089();
		this.aClass63_Sub2_33.method2115(1);
		this.aClass63_Sub2_33.method2098(0.0F, 0.0F, 0.0F, arg0);
		this.aClass63_Sub2_33.method2091(34165, 34165);
		this.aClass63_Sub2_33.method2115(0);
		this.aClass63_Sub2_33.method2122(0);
		for (@Pc(170) int local170 = 0; local170 < 6; local170++) {
			@Pc(177) int local177 = local170 + 34069;
			local7.method2533(arg1, local177);
			this.aClass63_Sub2_33.aClass20_Sub4_4.method5509(0, 0, arg1.anInt628, arg1.anInt628);
			local7.method2533(arg2, local177);
			this.aClass63_Sub2_33.aClass20_Sub4_5.method5509(0, 0, arg2.anInt628, arg2.anInt628);
			local7.method2533(this.aClass20_Sub1_1, local177);
			this.aClass63_Sub2_33.method2115(1);
			this.aClass63_Sub2_33.method2068(this.aClass63_Sub2_33.aClass20_Sub4_5);
			this.aClass63_Sub2_33.method2115(0);
			this.aClass63_Sub2_33.method2068(this.aClass63_Sub2_33.aClass20_Sub4_4);
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
			this.aClass63_Sub2_33.method2115(1);
			this.aClass63_Sub2_33.method2068(null);
			this.aClass63_Sub2_33.method2115(0);
			this.aClass63_Sub2_33.method2068(null);
		}
		this.aClass63_Sub2_33.method2115(1);
		this.aClass63_Sub2_33.method2091(8448, 8448);
		this.aClass63_Sub2_33.method2115(0);
		local7.method2534(0);
		local3.glPopAttrib();
		this.aClass63_Sub2_33.method2119(local7);
		this.aClass63_Sub2_33.method1958(Static274.anIntArray913[0], Static274.anIntArray913[1], Static274.anIntArray913[2], Static274.anIntArray913[3]);
		this.aClass20_Sub1_1.method5504();
	}
}
