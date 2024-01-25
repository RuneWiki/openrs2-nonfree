import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class4_Sub6(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return false;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8147(arg0);
		super.aClass95_Sub1_23.method8129(arg1);
	}
}
