import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!vs", name = "hb", descriptor = "Lclient!rt;")
	public Class261 aClass261_2;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!jba;)V")
	public Class16_Sub2(@OriginalArg(0) Class122_Sub1 arg0) {
		super(arg0);
		this.aClass261_2 = new Class261(arg0);
		super.aClass145_Sub1_60 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_52 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_57 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_51 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_59 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_53 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_54 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_58 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_55 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
		super.aClass145_Sub1_56 = new Class145_Sub1_Sub2(super.aClass122_Sub1_18);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method7158() {
		this.aClass261_2 = new Class261(super.aClass122_Sub1_18);
	}
}
