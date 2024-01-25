import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ck;I)Lclient!ck;")
	@Override
	public Class4_Sub1_Sub5 method4307(@OriginalArg(0) Class4_Sub1_Sub5 arg0) {
		return new Class4_Sub1_Sub5_Sub1(arg0.anInterface2_3, arg0.method5865(), arg0.anInt7609);
	}
}
