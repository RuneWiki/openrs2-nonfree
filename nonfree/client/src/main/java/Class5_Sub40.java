import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	public final int anInt6805;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	public final int anInt6801;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Class5_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6805 = arg0;
		this.anInt6801 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
	public boolean method5380(@OriginalArg(1) int arg0) {
		return (this.anInt6805 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Z")
	public boolean method5381() {
		return (this.anInt6805 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z")
	public boolean method5382() {
		return (this.anInt6805 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
	public int method5383() {
		return this.anInt6805 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)I")
	public int method5384() {
		return Static142.method2036(this.anInt6805);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
	public boolean method5386() {
		return (this.anInt6805 >> 22 & 0x1) != 0;
	}
}
