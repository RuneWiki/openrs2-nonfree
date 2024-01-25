import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class304 {

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "Z")
	private final boolean aBoolean694;

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
	private final int anInt8026;

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "Z")
	private final boolean aBoolean693;

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
	private final int anInt8031;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(ZIIZ)V")
	public Class304(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean694 = arg3;
		this.anInt8026 = arg2;
		this.aBoolean693 = arg0;
		this.anInt8031 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)Z")
	public boolean method7164() {
		return this.aBoolean693;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)Z")
	public boolean method7166() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)I")
	public int method7168() {
		return this.anInt8026;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)I")
	public int method7171() {
		return this.anInt8031;
	}
}
