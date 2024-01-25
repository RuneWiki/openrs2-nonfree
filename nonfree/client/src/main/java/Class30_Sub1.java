import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!uf;)Lclient!uf;")
	@Override
	public Class2_Sub1_Sub5 method5233(@OriginalArg(1) Class2_Sub1_Sub5 arg0) {
		return new Class2_Sub1_Sub5_Sub1(arg0.method1597(), arg0.anInt1770);
	}
}
