import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class77 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	public int anInt2216;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public int anInt2220;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "B")
	private byte aByte6;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public int anInt2224;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class77() {
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class77(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aByte6 = arg0.method1829();
		this.anInt2224 = arg0.method1879();
		this.anInt2216 = arg0.method1860();
		this.anInt2220 = arg0.method1860();
		this.anInt2223 = arg0.method1860();
		this.anInt2219 = arg0.method1860();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I")
	public int method1988() {
		return (this.aByte6 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)I")
	public int method1992() {
		return this.aByte6 & 0x7;
	}
}
