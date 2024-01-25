import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class40 {

	@OriginalMember(owner = "client!bja", name = "h", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!bja", name = "f", descriptor = "Lclient!qu;")
	public final Class104 aClass104_1;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class40(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0) {
		this.aClass104_1 = new Class104_Sub2(arg0, false);
	}
}
