import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!vs;I)Lclient!vs;")
	@Override
	public Class4_Sub7_Sub8 method2155(@OriginalArg(0) Class4_Sub7_Sub8 arg0) {
		return new Class4_Sub7_Sub8_Sub1(arg0.anInterface11_3, arg0.method3887(), arg0.anInt4615);
	}
}
