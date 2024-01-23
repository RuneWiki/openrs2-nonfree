import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class8() {
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class8(@OriginalArg(0) Class8 arg0) {
		this.anInt154 = arg0.anInt154;
		this.anInt151 = arg0.anInt151;
		this.anInt150 = arg0.anInt150;
		this.anInt153 = arg0.anInt153;
	}
}
