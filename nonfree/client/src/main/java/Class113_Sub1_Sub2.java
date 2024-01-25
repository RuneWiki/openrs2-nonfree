import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class113_Sub1_Sub2 extends Class113_Sub1 {

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_26;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "Lclient!ih;")
	private final Class18_Sub2 aClass18_Sub2_2;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!hj;I)V")
	public Class113_Sub1_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass2_Sub1_26 = arg0;
		this.aClass18_Sub2_2 = new Class18_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(FLclient!ih;ILclient!ih;)V")
	public void method4248(@OriginalArg(0) float arg0, @OriginalArg(1) Class18_Sub2 arg1, @OriginalArg(3) Class18_Sub2 arg2) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_26.anOpengl1;
		@Pc(7) Class211 local7 = this.aClass2_Sub1_26.aClass211_1;
		if (this.aClass2_Sub1_26.aClass18_Sub1_1.anInt439 != arg1.anInt2706 || this.aClass2_Sub1_26.aClass18_Sub1_1.anInt437 != arg1.anInt2706) {
			this.aClass2_Sub1_26.aClass18_Sub1_1 = new Class18_Sub1(this.aClass2_Sub1_26, 3553, 6408, arg1.anInt2706, arg1.anInt2706);
		}
		if (this.aClass2_Sub1_26.aClass18_Sub1_2.anInt439 != arg2.anInt2706 || this.aClass2_Sub1_26.aClass18_Sub1_2.anInt437 != arg2.anInt2706) {
			this.aClass2_Sub1_26.aClass18_Sub1_2 = new Class18_Sub1(this.aClass2_Sub1_26, 3553, 6408, arg2.anInt2706, arg2.anInt2706);
		}
		this.aClass2_Sub1_26.method3311(Static237.anIntArray596);
		this.aClass2_Sub1_26.method3327();
		this.aClass2_Sub1_26.method2339(local7);
		this.aClass2_Sub1_26.method2352();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass18_Sub2_2.anInt2706, this.aClass18_Sub2_2.anInt2706);
		this.aClass2_Sub1_26.method2333(false);
		this.aClass2_Sub1_26.method2358(false);
		this.aClass2_Sub1_26.method2370(false);
		this.aClass2_Sub1_26.method2344(false);
		this.aClass2_Sub1_26.method2357();
		this.aClass2_Sub1_26.method2373(1);
		this.aClass2_Sub1_26.method2315(0.0F, 0.0F, 0.0F, arg0);
		this.aClass2_Sub1_26.method2351(34165, 34165);
		this.aClass2_Sub1_26.method2373(0);
		this.aClass2_Sub1_26.method2340(0);
		for (@Pc(163) int local163 = 0; local163 < 6; local163++) {
			@Pc(172) int local172 = local163 + 34069;
			local7.method5533(arg1, local172);
			this.aClass2_Sub1_26.aClass18_Sub1_1.method501(0, 0, arg1.anInt2706, arg1.anInt2706);
			local7.method5533(arg2, local172);
			this.aClass2_Sub1_26.aClass18_Sub1_2.method501(0, 0, arg2.anInt2706, arg2.anInt2706);
			local7.method5533(this.aClass18_Sub2_2, local172);
			this.aClass2_Sub1_26.method2373(1);
			this.aClass2_Sub1_26.method2376(this.aClass2_Sub1_26.aClass18_Sub1_2);
			this.aClass2_Sub1_26.method2373(0);
			this.aClass2_Sub1_26.method2376(this.aClass2_Sub1_26.aClass18_Sub1_1);
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
			this.aClass2_Sub1_26.method2373(1);
			this.aClass2_Sub1_26.method2376(null);
			this.aClass2_Sub1_26.method2373(0);
			this.aClass2_Sub1_26.method2376(null);
		}
		this.aClass2_Sub1_26.method2373(1);
		this.aClass2_Sub1_26.method2351(8448, 8448);
		this.aClass2_Sub1_26.method2373(0);
		local7.method5532(0);
		local3.glPopAttrib();
		this.aClass2_Sub1_26.method2381(local7);
		this.aClass2_Sub1_26.method3250(Static237.anIntArray596[0], Static237.anIntArray596[1], Static237.anIntArray596[2], Static237.anIntArray596[3]);
		this.aClass18_Sub2_2.method4848();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Lclient!ih;")
	@Override
	public Class18_Sub2 method4247() {
		return this.aClass18_Sub2_2;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method4249() {
		return this.aClass18_Sub2_2.anInt2706;
	}
}
