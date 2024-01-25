import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class74_Sub9 extends Class74 {

	@OriginalMember(owner = "client!po", name = "w", descriptor = "Lclient!wv;")
	private final Class378 aClass378_8;

	@OriginalMember(owner = "client!po", name = "t", descriptor = "Lclient!eea;")
	private final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_7;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "Lclient!tea;")
	private final Class319 aClass319_1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!eea;Lclient!eq;Lclient!wv;)V")
	public Class74_Sub9(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) Class378 arg2) {
		super(arg0);
		this.aClass378_8 = arg2;
		this.aClass87_Sub1_Sub1_7 = arg0;
		if (arg1 != null && this.aClass378_8.method8579() && this.aClass87_Sub1_Sub1_7.aBoolean238) {
			this.aClass319_1 = Static576.method8007(arg1.method2567("transparent_water", "gl"), this.aClass87_Sub1_Sub1_7);
		} else {
			this.aClass319_1 = null;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return this.aClass319_1 != null;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
		super.aClass87_Sub1_22.method5133(Static591.aClass300_5, Static148.aClass300_3);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass378_8.aBoolean758) {
			@Pc(49) float local49 = (float) (super.aClass87_Sub1_22.anInt6123 % 4000) / 4000.0F;
			super.aClass87_Sub1_22.method5079(this.aClass378_8.anInterface11_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local49, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(21) int local21 = super.aClass87_Sub1_22.anInt6123 % 4000 * 16 / 4000;
			super.aClass87_Sub1_22.method5079(this.aClass378_8.anInterface26Array1[local21]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		super.aClass87_Sub1_22.method5131(0, Static516.aClass315_3);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass319_1.anInt8990);
		OpenGL.glEnable(34336);
		super.aClass87_Sub1_22.method5131(0, Static508.aClass315_2);
	}
}
