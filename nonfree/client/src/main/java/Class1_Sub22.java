import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
	public final int anInt3451;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	public final int anInt3449;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3451 = arg0;
		this.anInt3449 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I")
	public int method2807() {
		return Static253.method3893(this.anInt3451);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Z")
	public boolean method2808(@OriginalArg(1) int arg0) {
		return (this.anInt3451 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)Z")
	public boolean method2810() {
		return (this.anInt3451 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)I")
	public int method2812() {
		return this.anInt3451 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
	public boolean method2813() {
		return (this.anInt3451 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)Z")
	public boolean method2815() {
		return (this.anInt3451 & 0x1) != 0;
	}
}
