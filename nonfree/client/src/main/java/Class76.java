import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class76 {

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!dha", name = "j", descriptor = "I")
	public int anInt1844;

	@OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
	public int anInt1845;

	@OriginalMember(owner = "client!dha", name = "c", descriptor = "B")
	private byte aByte26;

	@OriginalMember(owner = "client!dha", name = "i", descriptor = "I")
	public int anInt1846;

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
	public int anInt1848;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class76(@OriginalArg(0) Class14_Sub21 arg0) {
		this.aByte26 = arg0.method7720();
		this.anInt1848 = arg0.method7717(-1978450544);
		this.anInt1841 = arg0.method7748();
		this.anInt1844 = arg0.method7748();
		this.anInt1845 = arg0.method7748();
		this.anInt1846 = arg0.method7748();
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)I")
	public int method1766() {
		return (this.aByte26 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)I")
	public int method1767() {
		return this.aByte26 & 0x7;
	}
}
