import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!bda;)Lclient!bda;")
	@Override
	public Class6_Sub5_Sub3 method7976(@OriginalArg(1) Class6_Sub5_Sub3 arg0) {
		return new Class6_Sub5_Sub3_Sub1(arg0.method2977(), arg0.anInt3508);
	}
}
