import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
	public final int anInt3441;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public final int anInt3442;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V")
	public Class2_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3441 = arg0;
		this.anInt3442 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)Z")
	public boolean method3009() {
		return (this.anInt3441 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)I")
	public int method3010() {
		return Static257.method3645(this.anInt3441);
	}

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)I")
	public int method3012() {
		return this.anInt3441 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)Z")
	public boolean method3014() {
		return (this.anInt3441 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)Z")
	public boolean method3015() {
		return (this.anInt3441 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	public boolean method3016(@OriginalArg(1) int arg0) {
		return (this.anInt3441 >> arg0 + 1 & 0x1) != 0;
	}
}
