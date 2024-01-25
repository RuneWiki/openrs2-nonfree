import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class60 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public int anInt2023;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public int anInt2024;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public int anInt2025;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public int anInt2026;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class60(@OriginalArg(0) Class60 arg0) {
		this.anInt2025 = arg0.anInt2025;
		this.anInt2023 = arg0.anInt2023;
		this.anInt2026 = arg0.anInt2026;
		this.anInt2024 = arg0.anInt2024;
	}
}
