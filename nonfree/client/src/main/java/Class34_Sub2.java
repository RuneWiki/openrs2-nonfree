import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "Lclient!mc;")
	private final Class90_Sub3_Sub1 aClass90_Sub3_Sub1_7;

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "Lclient!db;")
	private final Class66 aClass66_2;

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "Lclient!ch;")
	private final Class53 aClass53_5;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!mc;Lclient!pj;Lclient!db;)V")
	public Class34_Sub2(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class66 arg2) {
		super(arg0);
		this.aClass90_Sub3_Sub1_7 = arg0;
		this.aClass66_2 = arg2;
		if (this.aClass66_2.method1373() && this.aClass90_Sub3_Sub1_7.aBoolean430) {
			this.aClass53_5 = Static115.method1818(arg1.method5794("transparent_water", "gl"), this.aClass90_Sub3_Sub1_7);
		} else {
			this.aClass53_5 = null;
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7570(Static140.aClass214_2, Static74.aClass214_1);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return this.aClass53_5 != null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass66_2.aBoolean112) {
			@Pc(44) float local44 = (float) (super.aClass90_Sub3_19.anInt9563 % 4000) / 4000.0F;
			super.aClass90_Sub3_19.method7624(this.aClass66_2.anInterface11_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass90_Sub3_19.anInt9563 % 4000 * 16 / 4000;
			super.aClass90_Sub3_19.method7624(this.aClass66_2.anInterface7Array1[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass53_5.anInt1181);
		OpenGL.glEnable(34336);
		super.aClass90_Sub3_19.method7540(0, Static422.aClass150_7);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		super.aClass90_Sub3_19.method7540(0, Static393.aClass150_6);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
	}
}
