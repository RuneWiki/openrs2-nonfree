import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!hd;I)Lclient!hd;")
	@Override
	public Class7_Sub4_Sub7 method5183(@OriginalArg(0) Class7_Sub4_Sub7 arg0) {
		return new Class7_Sub4_Sub7_Sub1(arg0.method4298(), arg0.anInt5366);
	}
}
