import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
	public Class2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt428 = arg1;
		this.anInt419 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z")
	public boolean method329() {
		return (this.anInt419 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)Z")
	public boolean method330() {
		return (this.anInt419 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public boolean method331(@OriginalArg(0) int arg0) {
		return (this.anInt419 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
	public boolean method332() {
		return (this.anInt419 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z")
	public boolean method334() {
		return (this.anInt419 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Z")
	public boolean method336() {
		return (this.anInt419 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)Z")
	public boolean method338() {
		return (this.anInt419 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)Z")
	public boolean method339() {
		return (this.anInt419 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)I")
	public int method340() {
		return Static55.method1069(this.anInt419);
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)I")
	public int method341() {
		return this.anInt419 >> 18 & 0x7;
	}
}
