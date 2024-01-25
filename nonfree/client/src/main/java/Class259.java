import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class259 {

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
	public int anInt6868;

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
	public int anInt6870;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
	public int anInt6871;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "B")
	private byte aByte96;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "()V")
	public Class259() {
	}

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class259(@OriginalArg(0) Class3_Sub11 arg0) {
		this.aByte96 = arg0.method3096();
		this.anInt6875 = arg0.method3109();
		this.anInt6871 = arg0.method3116();
		this.anInt6870 = arg0.method3116();
		this.anInt6876 = arg0.method3116();
		this.anInt6868 = arg0.method3116();
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
	public int method5870() {
		return (this.aByte96 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)I")
	public int method5871() {
		return this.aByte96 & 0x7;
	}
}
