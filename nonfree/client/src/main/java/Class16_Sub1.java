import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!av", name = "hb", descriptor = "Lclient!eda;")
	public Class77 aClass77_1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!hh;)V")
	public Class16_Sub1(@OriginalArg(0) Class122_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass77_1 = new Class77(arg0);
		super.aClass145_Sub1_60 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_52 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_57 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_51 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_59 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_53 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_54 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_58 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_55 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
		super.aClass145_Sub1_56 = new Class145_Sub1_Sub1(super.aClass122_Sub1_18);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
	@Override
	public void method7158() {
		this.aClass77_1 = new Class77((Class122_Sub1_Sub1) super.aClass122_Sub1_18);
	}
}
