import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class305 {

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	private final int anInt8288;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
	private final boolean aBoolean601;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	private final int anInt8289;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(ZIIZ)V")
	public Class305(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean602 = arg0;
		this.anInt8288 = arg1;
		this.aBoolean601 = arg3;
		this.anInt8289 = arg2;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	public boolean method7217() {
		return this.aBoolean601;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
	public int method7218() {
		return this.anInt8289;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Z")
	public boolean method7220() {
		return this.aBoolean602;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)I")
	public int method7222() {
		return this.anInt8288;
	}
}
