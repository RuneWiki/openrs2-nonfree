import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class61 {

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public int anInt2788;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public int anInt2791;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public int anInt2792;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public int anInt2793;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class61() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ea;)V")
	public Class61(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aByte6 = arg0.method186();
		this.anInt2792 = arg0.method163();
		this.anInt2791 = arg0.method185();
		this.anInt2788 = arg0.method185();
		this.anInt2793 = arg0.method185();
		this.anInt2795 = arg0.method185();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	public int method1956() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	public int method1960() {
		return this.aByte6 & 0x7;
	}
}
