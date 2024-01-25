import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class181 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public int anInt4704;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public int anInt4710;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public int anInt4714;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public int anInt4715;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "B")
	private byte aByte59;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class181() {
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class181(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aByte59 = arg0.method5600();
		this.anInt4704 = arg0.method5598();
		this.anInt4714 = arg0.method5603();
		this.anInt4710 = arg0.method5603();
		this.anInt4713 = arg0.method5603();
		this.anInt4715 = arg0.method5603();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
	public int method3745() {
		return (this.aByte59 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)I")
	public int method3748() {
		return this.aByte59 & 0x7;
	}
}
