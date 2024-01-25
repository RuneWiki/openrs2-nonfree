import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class1_Sub4_Sub9 extends Class1_Sub4 {

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	public int anInt2148;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(II)V")
	public Class1_Sub4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong213 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(B)I")
	public int method1865() {
		return (int) super.aLong213;
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(B)J")
	public long method1867() {
		return Long.MAX_VALUE & super.aLong214;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	public void method1868() {
		super.aLong214 = Long.MIN_VALUE & super.aLong214 | Static162.method3252() + 500L;
		Static139.aClass159_6.method4262(this);
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	public void method1869() {
		super.aLong214 |= Long.MIN_VALUE;
		if (this.method1867() == 0L) {
			Static156.aClass159_5.method4262(this);
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)I")
	public int method1870() {
		return (int) (super.aLong213 >>> 32 & 0xFFL);
	}
}
