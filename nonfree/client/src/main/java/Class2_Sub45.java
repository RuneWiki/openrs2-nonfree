import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
	public final int anInt7337;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public final int anInt7334;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
	public Class2_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7337 = arg0;
		this.anInt7334 = arg1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Z")
	public boolean method5897() {
		return (this.anInt7337 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Z")
	public boolean method5898(@OriginalArg(1) int arg0) {
		return (this.anInt7337 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
	public boolean method5899() {
		return (this.anInt7337 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
	public int method5901() {
		return Static286.method4051(this.anInt7337);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)Z")
	public boolean method5902() {
		return (this.anInt7337 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
	public int method5903() {
		return this.anInt7337 >> 18 & 0x7;
	}
}
