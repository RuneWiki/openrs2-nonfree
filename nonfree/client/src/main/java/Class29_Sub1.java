import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!kb;I)Lclient!kb;")
	@Override
	public Class6_Sub2_Sub9 method990(@OriginalArg(0) Class6_Sub2_Sub9 arg0) {
		return new Class6_Sub2_Sub9_Sub1(arg0.anInterface21_3, arg0.method4703(), arg0.anInt5462);
	}
}
