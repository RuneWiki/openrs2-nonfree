import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class105 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public int anInt4159;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public int anInt4163;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public int anInt4164;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	public int anInt4171;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "B")
	private byte aByte13;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class105() {
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class105(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aByte13 = arg0.method1756();
		this.anInt4171 = arg0.method1764();
		this.anInt4159 = arg0.method1802();
		this.anInt4163 = arg0.method1802();
		this.anInt4167 = arg0.method1802();
		this.anInt4164 = arg0.method1802();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
	public int method3125() {
		return this.aByte13 & 0x7;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)I")
	public int method3134() {
		return (this.aByte13 & 0x8) == 8 ? 1 : 0;
	}
}
