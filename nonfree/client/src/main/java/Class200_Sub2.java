import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class200_Sub2 extends Class200 {

	@OriginalMember(owner = "client!nn", name = "pb", descriptor = "Lclient!ee;")
	public Class80 aClass80_2;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!hr;)V")
	public Class200_Sub2(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
		this.aClass80_2 = new Class80(arg0);
		super.aClass97_Sub1_58 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_57 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_59 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_55 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_56 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_60 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_52 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_51 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_53 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
		super.aClass97_Sub1_54 = new Class97_Sub1_Sub1(super.aClass4_Sub1_14);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
		this.aClass80_2 = new Class80(super.aClass4_Sub1_14);
	}
}
