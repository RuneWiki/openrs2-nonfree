import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class5_Sub45 extends Class5 {

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
	public final int anInt8267;

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "I")
	public final int anInt8276;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V")
	public Class5_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8267 = arg0;
		this.anInt8276 = arg1;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)Z")
	public boolean method7126(@OriginalArg(1) int arg0) {
		return (this.anInt8267 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)Z")
	public boolean method7127() {
		return (this.anInt8267 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
	public boolean method7128() {
		return (this.anInt8267 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)Z")
	public boolean method7129() {
		return (this.anInt8267 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I")
	public int method7130() {
		return this.anInt8267 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)I")
	public int method7132() {
		return Static552.method7998(this.anInt8267);
	}
}
