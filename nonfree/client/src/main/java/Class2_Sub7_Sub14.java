import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class2_Sub7_Sub14 extends Class2_Sub7 {

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Lclient!iga;")
	public final Class16_Sub1_Sub1_Sub5 aClass16_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!iga;)V")
	public Class2_Sub7_Sub14(@OriginalArg(0) Class16_Sub1_Sub1_Sub5 arg0) {
		this.aClass16_Sub1_Sub1_Sub5_1 = arg0;
	}
}
