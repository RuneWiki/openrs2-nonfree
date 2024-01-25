import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class169 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "B")
	private byte aByte66;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public int anInt4760;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public int anInt4762;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public int anInt4769;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class169() {
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class169(@OriginalArg(0) Class6_Sub10 arg0) {
		this.aByte66 = arg0.method3992();
		this.anInt4767 = arg0.method4021();
		this.anInt4768 = arg0.method3979();
		this.anInt4760 = arg0.method3979();
		this.anInt4762 = arg0.method3979();
		this.anInt4769 = arg0.method3979();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I")
	public int method4410() {
		return (this.aByte66 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)I")
	public int method4411() {
		return this.aByte66 & 0x7;
	}
}
