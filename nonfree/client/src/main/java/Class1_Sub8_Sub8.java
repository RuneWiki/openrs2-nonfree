import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class1_Sub8_Sub8 extends Class1_Sub8 {

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Lclient!jf;")
	public final Class11_Sub1_Sub1_Sub4 aClass11_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!jf;)V")
	public Class1_Sub8_Sub8(@OriginalArg(0) Class11_Sub1_Sub1_Sub4 arg0) {
		this.aClass11_Sub1_Sub1_Sub4_1 = arg0;
	}
}
