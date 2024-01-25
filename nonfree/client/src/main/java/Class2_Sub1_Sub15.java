import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "Lclient!pd;")
	public final Class11_Sub5_Sub4 aClass11_Sub5_Sub4_1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class2_Sub1_Sub15(@OriginalArg(0) Class11_Sub5_Sub4 arg0) {
		this.aClass11_Sub5_Sub4_1 = arg0;
	}
}
