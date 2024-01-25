import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!qfa", name = "gb", descriptor = "Lclient!bd;")
	public Class28 aClass28_2;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!sp;)V")
	public Class38_Sub2(@OriginalArg(0) Class90_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass28_2 = new Class28(arg0);
		super.aClass24_Sub1_46 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_50 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_43 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_42 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_48 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_44 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_47 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_41 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_45 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
		super.aClass24_Sub1_49 = new Class24_Sub1_Sub1(super.aClass90_Sub2_13);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	@Override
	public void method5973() {
		this.aClass28_2 = new Class28((Class90_Sub2_Sub2) super.aClass90_Sub2_13);
	}
}
