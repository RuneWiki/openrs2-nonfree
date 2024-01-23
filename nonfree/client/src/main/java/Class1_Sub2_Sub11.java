import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!in", name = "H", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	public int anInt2282;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong202 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)I")
	public int method1851() {
		return (int) this.aLong202;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public void method1853() {
		this.aLong197 = Static252.method3964() + 500L | this.aLong197 & Long.MIN_VALUE;
		Static12.aClass17_1.method462(this);
	}

	@OriginalMember(owner = "client!in", name = "f", descriptor = "(I)I")
	public int method1854() {
		return (int) (this.aLong202 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V")
	public void method1859() {
		this.aLong197 |= Long.MIN_VALUE;
		if (this.method1860() == 0L) {
			Static51.aClass17_3.method462(this);
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(B)J")
	public long method1860() {
		return Long.MAX_VALUE & this.aLong197;
	}
}
