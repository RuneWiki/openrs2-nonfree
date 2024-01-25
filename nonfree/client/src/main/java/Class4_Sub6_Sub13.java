import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class4_Sub6_Sub13 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "Lclient!up;")
	public final Class21_Sub1_Sub1_Sub5 aClass21_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class4_Sub6_Sub13(@OriginalArg(0) Class21_Sub1_Sub1_Sub5 arg0) {
		this.aClass21_Sub1_Sub1_Sub5_1 = arg0;
	}
}
