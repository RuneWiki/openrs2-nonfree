import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!um;)Lclient!um;")
	@Override
	public Class6_Sub5_Sub11 method2474(@OriginalArg(1) Class6_Sub5_Sub11 arg0) {
		return new Class6_Sub5_Sub11_Sub1(arg0.method7818(), arg0.anInt9811);
	}
}
