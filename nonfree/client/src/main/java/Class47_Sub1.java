import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!ka;)Lclient!ka;")
	@Override
	public Class3_Sub4_Sub9 method1648(@OriginalArg(1) Class3_Sub4_Sub9 arg0) {
		return new Class3_Sub4_Sub9_Sub1(arg0.anInterface7_3, arg0.method3818(), arg0.anInt4516);
	}
}
