import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "Lclient!ac;")
	public final Class4_Sub1_Sub1_Sub1 aClass4_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class6_Sub34(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0) {
		this.aClass4_Sub1_Sub1_Sub1_2 = arg0;
	}
}
