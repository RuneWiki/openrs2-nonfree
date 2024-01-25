import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	public final int anInt3465;

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
	public final int anInt3464;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V")
	public Class1_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3465 = arg1;
		this.anInt3464 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
	public boolean method2815() {
		return (this.anInt3464 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)I")
	public int method2816() {
		return this.anInt3464 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
	public boolean method2817(@OriginalArg(0) int arg0) {
		return (this.anInt3464 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)Z")
	public boolean method2818() {
		return (this.anInt3464 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Z")
	public boolean method2819() {
		return (this.anInt3464 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)I")
	public int method2820() {
		return Static63.method1064(this.anInt3464);
	}
}
