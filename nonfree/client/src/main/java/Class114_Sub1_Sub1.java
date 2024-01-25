import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class114_Sub1_Sub1 extends Class114_Sub1 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_23;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!hp;")
	private final Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!h;I)V")
	public Class114_Sub1_Sub1(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass32_Sub2_23 = arg0;
		this.aClass20_Sub2_1 = new Class20_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
	public int method3121() {
		return this.aClass20_Sub2_1.anInt2660;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lclient!hp;")
	@Override
	public Class20_Sub2 method4118() {
		return this.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(FILclient!hp;Lclient!hp;)V")
	public void method3122(@OriginalArg(0) float arg0, @OriginalArg(2) Class20_Sub2 arg1, @OriginalArg(3) Class20_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_23.anOpengl2;
		@Pc(7) Class11 local7 = this.aClass32_Sub2_23.aClass11_1;
		if (arg2.anInt2660 != this.aClass32_Sub2_23.aClass20_Sub1_4.anInt1599 || arg2.anInt2660 != this.aClass32_Sub2_23.aClass20_Sub1_4.anInt1601) {
			this.aClass32_Sub2_23.aClass20_Sub1_4 = new Class20_Sub1(this.aClass32_Sub2_23, 3553, 6408, arg2.anInt2660, arg2.anInt2660);
		}
		if (this.aClass32_Sub2_23.aClass20_Sub1_2.anInt1599 != arg1.anInt2660 || arg1.anInt2660 != this.aClass32_Sub2_23.aClass20_Sub1_2.anInt1601) {
			this.aClass32_Sub2_23.aClass20_Sub1_2 = new Class20_Sub1(this.aClass32_Sub2_23, 3553, 6408, arg1.anInt2660, arg1.anInt2660);
		}
		this.aClass32_Sub2_23.method2174(Static155.anIntArray312);
		this.aClass32_Sub2_23.method2184();
		this.aClass32_Sub2_23.method2316(local7);
		this.aClass32_Sub2_23.method2268();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass20_Sub2_1.anInt2660, this.aClass20_Sub2_1.anInt2660);
		this.aClass32_Sub2_23.method2312(false);
		this.aClass32_Sub2_23.method2250(false);
		this.aClass32_Sub2_23.method2262(false);
		this.aClass32_Sub2_23.method2281(false);
		this.aClass32_Sub2_23.method2258();
		this.aClass32_Sub2_23.method2314(1);
		this.aClass32_Sub2_23.method2308(0.0F, 0.0F, 0.0F, arg0);
		this.aClass32_Sub2_23.method2255(34165, 34165);
		this.aClass32_Sub2_23.method2314(0);
		this.aClass32_Sub2_23.method2282(0);
		for (@Pc(164) int local164 = 0; local164 < 6; local164++) {
			@Pc(174) int local174 = local164 + 34069;
			local7.method347(arg2, local174);
			this.aClass32_Sub2_23.aClass20_Sub1_4.method1385(0, 0, arg2.anInt2660, arg2.anInt2660);
			local7.method347(arg1, local174);
			this.aClass32_Sub2_23.aClass20_Sub1_2.method1385(0, 0, arg1.anInt2660, arg1.anInt2660);
			local7.method347(this.aClass20_Sub2_1, local174);
			this.aClass32_Sub2_23.method2314(1);
			this.aClass32_Sub2_23.method2287(this.aClass32_Sub2_23.aClass20_Sub1_2);
			this.aClass32_Sub2_23.method2314(0);
			this.aClass32_Sub2_23.method2287(this.aClass32_Sub2_23.aClass20_Sub1_4);
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
			this.aClass32_Sub2_23.method2314(1);
			this.aClass32_Sub2_23.method2287(null);
			this.aClass32_Sub2_23.method2314(0);
			this.aClass32_Sub2_23.method2287(null);
		}
		this.aClass32_Sub2_23.method2314(1);
		this.aClass32_Sub2_23.method2255(8448, 8448);
		this.aClass32_Sub2_23.method2314(0);
		local7.method345(0);
		local3.glPopAttrib();
		this.aClass32_Sub2_23.method2302(local7);
		this.aClass32_Sub2_23.method2226(Static155.anIntArray312[0], Static155.anIntArray312[1], Static155.anIntArray312[2], Static155.anIntArray312[3]);
		this.aClass20_Sub2_1.method5507();
	}
}
