import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
	public final int anInt269;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	public final int anInt258;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt269 = arg0;
		this.anInt258 = arg1;
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
	public int method256() {
		return this.anInt269 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z")
	public boolean method257(@OriginalArg(0) int arg0) {
		return (this.anInt269 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z")
	public boolean method258() {
		return (this.anInt269 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z")
	public boolean method260() {
		return (this.anInt269 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)I")
	public int method261() {
		return Static199.method5391(this.anInt269);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
	public boolean method262() {
		return (this.anInt269 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Z")
	public boolean method263() {
		return (this.anInt269 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z")
	public boolean method264() {
		return (this.anInt269 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)Z")
	public boolean method266() {
		return (this.anInt269 >> 21 & 0x1) != 0;
	}
}
