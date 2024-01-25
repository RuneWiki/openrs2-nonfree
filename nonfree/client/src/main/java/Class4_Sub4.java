import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class4_Sub4(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8131(true);
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return true;
	}

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		super.aClass95_Sub1_23.method8131(false);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8147(arg0);
		super.aClass95_Sub1_23.method8129(arg1);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
