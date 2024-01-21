import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class66 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
	public int anInt2837;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	public int anInt2842;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	public int anInt2846;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class66() {
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ni;)V")
	public Class66(@OriginalArg(0) Class66 arg0) {
		this.anInt2841 = arg0.anInt2841;
		this.anInt2846 = arg0.anInt2846;
		this.anInt2837 = arg0.anInt2837;
		this.anInt2842 = arg0.anInt2842;
	}
}
