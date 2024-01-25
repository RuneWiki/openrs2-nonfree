import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class214 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "I")
	public int anInt5680;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int anInt5682;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public int anInt5678 = -1;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!jaa;")
	public final Class181 aClass181_10;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class214(@OriginalArg(0) Class4_Sub3_Sub3_Sub3 arg0) {
		this.aClass181_10 = new Class181_Sub2(arg0, false);
	}
}
