import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class29 {

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "B")
	private byte aByte20;

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!sl;)V")
	public Class29(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aByte20 = arg0.method2860();
		this.anInt660 = arg0.method2825();
		this.anInt658 = arg0.method2881();
		this.anInt656 = arg0.method2881();
		this.anInt657 = arg0.method2881();
		this.anInt654 = arg0.method2881();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)I")
	public int method734() {
		return (this.aByte20 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	public int method736() {
		return this.aByte20 & 0x7;
	}
}
