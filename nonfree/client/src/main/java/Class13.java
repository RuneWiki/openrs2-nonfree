import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class13 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "B")
	private byte aByte1;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class13() {
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class13(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aByte1 = arg0.method6438();
		this.anInt450 = arg0.method6485();
		this.anInt447 = arg0.method6442();
		this.anInt449 = arg0.method6442();
		this.anInt454 = arg0.method6442();
		this.anInt448 = arg0.method6442();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I")
	public int method391() {
		return this.aByte1 & 0x7;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
	public int method396() {
		return (this.aByte1 & 0x8) == 8 ? 1 : 0;
	}
}
