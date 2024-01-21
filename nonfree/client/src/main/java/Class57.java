import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class57 {

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	public int anInt2026;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "I")
	public int anInt2027;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class57() {
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!p;)V")
	public Class57(@OriginalArg(0) Class57 arg0) {
		this.anInt2027 = arg0.anInt2027;
		this.anInt2037 = arg0.anInt2037;
		this.anInt2029 = arg0.anInt2029;
		this.anInt2026 = arg0.anInt2026;
	}
}
