import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class118 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public int anInt2940;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public int anInt2941;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public int anInt2942;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class118() {
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!fk;)V")
	public Class118(@OriginalArg(0) Class118 arg0) {
		this.anInt2940 = arg0.anInt2940;
		this.anInt2942 = arg0.anInt2942;
		this.anInt2941 = arg0.anInt2941;
	}
}
