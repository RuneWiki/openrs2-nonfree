import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class67 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "B")
	private byte aByte40;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
	public int anInt2092;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public int anInt2093;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public int anInt2094;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public int anInt2096;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class67() {
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class67(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aByte40 = arg0.method1212();
		this.anInt2092 = arg0.method1177();
		this.anInt2093 = arg0.method1188();
		this.anInt2094 = arg0.method1188();
		this.anInt2096 = arg0.method1188();
		this.anInt2089 = arg0.method1188();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)I")
	public int method1563() {
		return this.aByte40 & 0x7;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I")
	public int method1565() {
		return (this.aByte40 & 0x8) == 8 ? 1 : 0;
	}
}
