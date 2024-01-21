import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!jd;")
	public Class46 aClass46_1237;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class4_Sub22() {
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class4_Sub22(@OriginalArg(0) Class46 arg0) {
		this.aClass46_1237 = arg0;
	}
}
