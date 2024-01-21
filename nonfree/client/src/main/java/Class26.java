import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class26 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public int anInt987;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public int anInt989;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class26() {
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class26(@OriginalArg(0) Class26 arg0) {
		this.anInt987 = arg0.anInt987;
		this.anInt988 = arg0.anInt988;
		this.anInt985 = arg0.anInt985;
		this.anInt989 = arg0.anInt989;
	}
}
