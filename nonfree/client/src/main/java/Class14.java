import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public final class Class14 implements Interface18 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
	public final int anInt393;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I)V")
	public Class14(@OriginalArg(0) int arg0) {
		this.anInt393 = arg0;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static198.aClass146_43;
	}
}
