import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class27 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "()V")
	public Class27() {
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!ek;)V")
	public Class27(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aByte8 = arg0.method7011();
		this.anInt1044 = arg0.method7054();
		this.anInt1043 = arg0.method6990();
		this.anInt1051 = arg0.method6990();
		this.anInt1042 = arg0.method6990();
		this.anInt1050 = arg0.method6990();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)I")
	public int method912() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)I")
	public int method916() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}
