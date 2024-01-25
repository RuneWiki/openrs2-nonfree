import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!ria;)Lclient!ria;")
	@Override
	public Class3_Sub6_Sub4 method958(@OriginalArg(1) Class3_Sub6_Sub4 arg0) {
		return new Class3_Sub6_Sub4_Sub1(arg0.anInterface25_3, arg0.method6818(), arg0.anInt8104);
	}
}
