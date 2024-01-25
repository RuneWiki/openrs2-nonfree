import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class158 {

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public int anInt3831;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "B")
	private byte aByte40;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
	public int anInt3840;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class158() {
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class158(@OriginalArg(0) Class2_Sub16 arg0) {
		this.aByte40 = arg0.method5330();
		this.anInt3836 = arg0.method5312();
		this.anInt3840 = arg0.method5346();
		this.anInt3834 = arg0.method5346();
		this.anInt3831 = arg0.method5346();
		this.anInt3838 = arg0.method5346();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)I")
	public int method3519() {
		return this.aByte40 & 0x7;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
	public int method3523() {
		return (this.aByte40 & 0x8) == 8 ? 1 : 0;
	}
}
