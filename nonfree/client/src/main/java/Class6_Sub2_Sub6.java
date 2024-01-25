import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class6_Sub2_Sub6 extends Class6_Sub2 {

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient!qha;")
	public final Class60_Sub1_Sub1_Sub5 aClass60_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class6_Sub2_Sub6(@OriginalArg(0) Class60_Sub1_Sub1_Sub5 arg0) {
		this.aClass60_Sub1_Sub1_Sub5_1 = arg0;
	}
}
