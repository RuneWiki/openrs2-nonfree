import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class113 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public int anInt3758;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "B")
	private byte aByte47;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	public int anInt3761;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
	public int anInt3765;

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	public int anInt3766;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	public int anInt3767;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class113() {
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class113(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aByte47 = arg0.method5175();
		this.anInt3766 = arg0.method5211();
		this.anInt3767 = arg0.method5172();
		this.anInt3765 = arg0.method5172();
		this.anInt3761 = arg0.method5172();
		this.anInt3758 = arg0.method5172();
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I")
	public int method3492() {
		return this.aByte47 & 0x7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)I")
	public int method3496() {
		return (this.aByte47 & 0x8) == 8 ? 1 : 0;
	}
}
