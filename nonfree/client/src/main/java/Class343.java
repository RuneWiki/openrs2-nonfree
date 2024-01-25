import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class343 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public int anInt10016;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "B")
	private byte aByte141;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	public int anInt10017;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public int anInt10018;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public int anInt10019;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	public int anInt10023;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class343() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class343(@OriginalArg(0) Class5_Sub23 arg0) {
		this.aByte141 = arg0.method8488();
		this.anInt10016 = arg0.method8519();
		this.anInt10023 = arg0.method8527();
		this.anInt10017 = arg0.method8527();
		this.anInt10019 = arg0.method8527();
		this.anInt10018 = arg0.method8527();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
	public int method8611() {
		return (this.aByte141 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
	public int method8612() {
		return this.aByte141 & 0x7;
	}
}
