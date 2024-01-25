import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class81 {

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "Z")
	private final boolean aBoolean130;

	@OriginalMember(owner = "client!dia", name = "h", descriptor = "Z")
	private final boolean aBoolean131;

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "I")
	private final int anInt1623;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "I")
	private final int anInt1621;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ZIIZ)V")
	public Class81(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean130 = arg0;
		this.aBoolean131 = arg3;
		this.anInt1623 = arg2;
		this.anInt1621 = arg1;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
	public int method1518() {
		return this.anInt1621;
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(I)Z")
	public boolean method1520() {
		return this.aBoolean130;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)Z")
	public boolean method1521() {
		return this.aBoolean131;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)I")
	public int method1523() {
		return this.anInt1623;
	}
}
