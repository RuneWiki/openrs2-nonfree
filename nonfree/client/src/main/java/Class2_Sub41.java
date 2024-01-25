import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
	public final int anInt8112;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public final int anInt8108;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(II)V")
	public Class2_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8112 = arg1;
		this.anInt8108 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Z")
	public boolean method6876() {
		return (this.anInt8108 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Z")
	public boolean method6877() {
		return (this.anInt8108 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
	public int method6879() {
		return this.anInt8108 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)I")
	public int method6880() {
		return Static251.method3441(this.anInt8108);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
	public boolean method6881() {
		return (this.anInt8108 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Z")
	public boolean method6882(@OriginalArg(0) int arg0) {
		return (this.anInt8108 >> arg0 + 1 & 0x1) != 0;
	}
}
