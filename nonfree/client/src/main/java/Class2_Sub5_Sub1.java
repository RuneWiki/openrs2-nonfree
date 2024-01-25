import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "Lclient!gda;")
	public final Class11_Sub1_Sub1_Sub4 aClass11_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!gda;)V")
	public Class2_Sub5_Sub1(@OriginalArg(0) Class11_Sub1_Sub1_Sub4 arg0) {
		this.aClass11_Sub1_Sub1_Sub4_1 = arg0;
	}
}
