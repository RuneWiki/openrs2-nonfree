import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class2_Sub8_Sub10 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
	public int anInt2698;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
	public int anInt2700;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
	public int anInt2702;

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(II)V")
	public Class2_Sub8_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong214 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public void method2043() {
		this.aLong212 = Static221.method3670() + 500L | Long.MIN_VALUE & this.aLong212;
		Static83.aClass37_7.method1144(this);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I")
	public int method2044() {
		return (int) (this.aLong214 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)I")
	public int method2046() {
		return (int) this.aLong214;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)J")
	public long method2050() {
		return this.aLong212 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
	public void method2052() {
		this.aLong212 |= Long.MIN_VALUE;
		if (this.method2050() == 0L) {
			Static247.aClass37_6.method1144(this);
		}
	}
}
