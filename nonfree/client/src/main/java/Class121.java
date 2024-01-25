import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class121 {

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
	private final int anInt3470;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	private final int anInt3472;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ZIIZ)V")
	public Class121(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt3470 = arg2;
		this.anInt3472 = arg1;
		this.aBoolean266 = arg0;
		this.aBoolean267 = arg3;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
	public boolean method2965() {
		return this.aBoolean266;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
	public int method2968() {
		return this.anInt3472;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
	public boolean method2969() {
		return this.aBoolean267;
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
	public int method2971() {
		return this.anInt3470;
	}
}
