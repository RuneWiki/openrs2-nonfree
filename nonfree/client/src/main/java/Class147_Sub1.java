import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "[Lclient!ofa;")
	public final Class241[] aClass241Array1;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "([Lclient!ofa;)V")
	public Class147_Sub1(@OriginalArg(0) Class241[] arg0) {
		this.aClass241Array1 = arg0;
	}
}
