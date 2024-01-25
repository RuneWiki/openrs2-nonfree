import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!li", name = "nb", descriptor = "Lclient!rda;")
	public Class255 aClass255_2;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!fk;)V")
	public Class99_Sub2(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
		this.aClass255_2 = new Class255(arg0);
		super.aClass2_Sub1_41 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_42 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_50 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_48 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_47 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_43 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_45 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_46 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_49 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
		super.aClass2_Sub1_44 = new Class2_Sub1_Sub1(super.aClass5_Sub2_14);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.aClass255_2 = new Class255(super.aClass5_Sub2_14);
	}
}
