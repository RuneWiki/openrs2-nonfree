import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!nb;I)Lclient!nb;")
	@Override
	public Class2_Sub5_Sub2 method1705(@OriginalArg(0) Class2_Sub5_Sub2 arg0) {
		return new Class2_Sub5_Sub2_Sub1(arg0.anInterface7_3, arg0.method2955(), arg0.anInt3676);
	}
}
