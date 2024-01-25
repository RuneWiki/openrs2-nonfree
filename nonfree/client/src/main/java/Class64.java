import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class64 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "B")
	private byte aByte12;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt1716;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class64() {
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fb;)V")
	public Class64(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aByte12 = arg0.method3621();
		this.anInt1715 = arg0.method3649();
		this.anInt1716 = arg0.method3642();
		this.anInt1723 = arg0.method3642();
		this.anInt1720 = arg0.method3642();
		this.anInt1725 = arg0.method3642();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
	public int method1384() {
		return (this.aByte12 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	public int method1385() {
		return this.aByte12 & 0x7;
	}
}
