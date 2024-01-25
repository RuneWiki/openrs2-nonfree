import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class1_Sub8_Sub5 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "Lclient!aj;")
	public final Class11_Sub1_Sub1_Sub1 aClass11_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!aj;)V")
	public Class1_Sub8_Sub5(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0) {
		this.aClass11_Sub1_Sub1_Sub1_1 = arg0;
	}
}
