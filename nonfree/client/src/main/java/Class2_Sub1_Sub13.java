import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "Lclient!ij;")
	public final Class7_Sub4 aClass7_Sub4_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class2_Sub1_Sub13(@OriginalArg(0) Class7_Sub4 arg0) {
		this.aClass7_Sub4_1 = arg0;
	}
}
