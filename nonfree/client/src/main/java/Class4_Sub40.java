import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
	public final int anInt8126;

	@OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
	public final int anInt8121;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(II)V")
	public Class4_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8126 = arg0;
		this.anInt8121 = arg1;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
	public boolean method6324() {
		return (this.anInt8126 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)Z")
	public boolean method6325() {
		return (this.anInt8126 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZ)Z")
	public boolean method6326(@OriginalArg(0) int arg0) {
		return (this.anInt8126 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
	public int method6328() {
		return this.anInt8126 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)I")
	public int method6330() {
		return Static366.method5529(this.anInt8126);
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(Z)Z")
	public boolean method6332() {
		return (this.anInt8126 & 0x1) != 0;
	}
}
