import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class9 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	private final int anInt122;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
	private final int anInt123;

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Z")
	private final boolean aBoolean11;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(ZIIZ)V")
	public Class9(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt122 = arg1;
		this.anInt123 = arg2;
		this.aBoolean11 = arg0;
		this.aBoolean10 = arg3;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
	public int method183() {
		return this.anInt122;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Z")
	public boolean method185() {
		return this.aBoolean10;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
	public int method187() {
		return this.anInt123;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)Z")
	public boolean method189() {
		return this.aBoolean11;
	}
}
