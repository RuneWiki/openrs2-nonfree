import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class212_Sub1 extends Class212 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!po;I)Lclient!po;")
	@Override
	public Class2_Sub5_Sub9 method5396(@OriginalArg(0) Class2_Sub5_Sub9 arg0) {
		return new Class2_Sub5_Sub9_Sub2(arg0.method5193(), arg0.anInt6695);
	}
}
