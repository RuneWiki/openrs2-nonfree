import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class127 {

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	private final int anInt3650;

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
	private final int anInt3645;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "Z")
	private final boolean aBoolean301;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(ZIIZ)V")
	public Class127(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3650 = arg1;
		this.aBoolean302 = arg3;
		this.anInt3645 = arg2;
		this.aBoolean301 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)I")
	public int method3411() {
		return this.anInt3650;
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)Z")
	public boolean method3412() {
		return this.aBoolean301;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)I")
	public int method3416() {
		return this.anInt3645;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Z")
	public boolean method3418() {
		return this.aBoolean302;
	}
}
