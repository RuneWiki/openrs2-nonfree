import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class9_Sub10 extends Class9 {

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "Lclient!ad;")
	private final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_10;

	@OriginalMember(owner = "client!tca", name = "k", descriptor = "Lclient!ob;")
	private final Class242 aClass242_8;

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "Lclient!ar;")
	private final Class19 aClass19_5;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!ad;Lclient!vo;Lclient!ob;)V")
	public Class9_Sub10(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class242 arg2) {
		super(arg0);
		this.aClass7_Sub1_Sub1_10 = arg0;
		this.aClass242_8 = arg2;
		if (arg1 != null && this.aClass242_8.method5534() && this.aClass7_Sub1_Sub1_10.aBoolean75) {
			this.aClass19_5 = Static202.method3285(arg1.method7956("transparent_water", "gl"), this.aClass7_Sub1_Sub1_10);
		} else {
			this.aClass19_5 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass242_8.aBoolean489) {
			@Pc(48) float local48 = (float) (super.aClass7_Sub1_23.anInt7377 % 4000) / 4000.0F;
			super.aClass7_Sub1_23.method5694(this.aClass242_8.anInterface23_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local48, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(22) int local22 = super.aClass7_Sub1_23.anInt7377 % 4000 * 16 / 4000;
			super.aClass7_Sub1_23.method5694(this.aClass242_8.anInterface4Array2[local22]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
		super.aClass7_Sub1_23.method5764(Static563.aClass95_5, Static371.aClass95_1);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass19_5.anInt954);
		OpenGL.glEnable(34336);
		super.aClass7_Sub1_23.method5681(0, Static410.aClass61_6);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return this.aClass19_5 != null;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
		super.aClass7_Sub1_23.method5681(0, Static411.aClass61_5);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
