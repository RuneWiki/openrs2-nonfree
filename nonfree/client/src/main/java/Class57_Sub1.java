import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V")
	private Class57_Sub1() {
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!g;B)Lclient!g;")
	@Override
	public Class6_Sub2_Sub7 method3134(@OriginalArg(0) Class6_Sub2_Sub7 arg0) {
		return new Class6_Sub2_Sub7_Sub2(arg0.anInterface22_3, arg0.method7670(), arg0.anInt8757);
	}
}
