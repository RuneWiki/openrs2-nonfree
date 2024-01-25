import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class176_Sub1 extends Class176 {

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!pm;)Lclient!pm;")
	@Override
	public Class4_Sub5_Sub6 method3973(@OriginalArg(1) Class4_Sub5_Sub6 arg0) {
		return new Class4_Sub5_Sub6_Sub2(arg0.anInterface27_3, arg0.method7154(), arg0.anInt8241);
	}
}
