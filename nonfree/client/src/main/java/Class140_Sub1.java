import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class140_Sub1 extends Class140 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!naa;B)Lclient!naa;")
	@Override
	public Class6_Sub5_Sub1 method4313(@OriginalArg(0) Class6_Sub5_Sub1 arg0) {
		return new Class6_Sub5_Sub1_Sub1(arg0.anInterface23_3, arg0.method7751(), arg0.anInt9491);
	}
}
