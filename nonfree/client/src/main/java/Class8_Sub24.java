import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class8_Sub24 extends Class8 {

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
	public int anInt4411;

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public int anInt4398;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V")
	public Class8_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4411 = arg0;
		this.anInt4398 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
	public boolean method3349() {
		return (this.anInt4411 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public int method3350() {
		return Static253.method3798(this.anInt4411);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
	public boolean method3352(@OriginalArg(1) int arg0) {
		return (this.anInt4411 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Z")
	public boolean method3353() {
		return (this.anInt4411 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Z)I")
	public int method3355() {
		return this.anInt4411 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)Z")
	public boolean method3357() {
		return (this.anInt4411 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z")
	public boolean method3358() {
		return (this.anInt4411 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z")
	public boolean method3359() {
		return (this.anInt4411 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Z")
	public boolean method3360() {
		return (this.anInt4411 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(Z)Z")
	public boolean method3361() {
		return (this.anInt4411 >> 21 & 0x1) != 0;
	}
}
