import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public final class Class160_Sub4 extends Class160 {

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class160_Sub4(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	@Override
	public void method8061() {
		super.aClass100_Sub3_40.method8674(false);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8062() {
		return true;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8065(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_40.method8674(true);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!gb;II)V")
	@Override
	public void method8067(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		super.aClass100_Sub3_40.method8743(arg0);
		super.aClass100_Sub3_40.method8671(arg1);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8066(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
