import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class49 {

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	public int anInt940;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public int anInt941;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
	public int anInt946;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
	public int anInt948;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
	public int anInt952;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class49() {
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!dga;)V")
	public Class49(@OriginalArg(0) Class6_Sub14 arg0) {
		this.aByte13 = arg0.method6034();
		this.anInt941 = arg0.method6006();
		this.anInt948 = arg0.method6027();
		this.anInt952 = arg0.method6027();
		this.anInt940 = arg0.method6027();
		this.anInt946 = arg0.method6027();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)I")
	public int method752() {
		return (this.aByte13 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Z)I")
	public int method754() {
		return this.aByte13 & 0x7;
	}
}
