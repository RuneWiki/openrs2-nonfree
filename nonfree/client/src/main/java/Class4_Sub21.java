import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!on", name = "J", descriptor = "I")
	public int anInt3947;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "I")
	public int anInt3939;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(II)V")
	public Class4_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3947 = arg0;
		this.anInt3939 = arg1;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(B)Z")
	public boolean method3278() {
		return (this.anInt3947 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)Z")
	public boolean method3279(@OriginalArg(0) int arg0) {
		return (this.anInt3947 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
	public boolean method3282() {
		return (this.anInt3947 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(B)I")
	public int method3284() {
		return this.anInt3947 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I")
	public int method3286() {
		return Static248.method3919(this.anInt3947);
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(B)Z")
	public boolean method3287() {
		return (this.anInt3947 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)Z")
	public boolean method3288() {
		return (this.anInt3947 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Z")
	public boolean method3292() {
		return (this.anInt3947 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Z")
	public boolean method3293() {
		return (this.anInt3947 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!on", name = "h", descriptor = "(I)Z")
	public boolean method3295() {
		return (this.anInt3947 >> 30 & 0x1) != 0;
	}
}
