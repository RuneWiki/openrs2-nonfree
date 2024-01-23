import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class83 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "B")
	private byte aByte8;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public int anInt2226;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt2227;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class83(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte8 = arg0.method2598();
		this.anInt2226 = arg0.method2593();
		this.anInt2225 = arg0.method2647();
		this.anInt2227 = arg0.method2647();
		this.anInt2229 = arg0.method2647();
		this.anInt2223 = arg0.method2647();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	public int method1810() {
		return this.aByte8 & 0x7;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	public int method1811() {
		return (this.aByte8 & 0x8) == 8 ? 1 : 0;
	}
}
