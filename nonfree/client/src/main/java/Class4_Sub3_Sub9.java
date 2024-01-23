import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class4_Sub3_Sub9 extends Class4_Sub3 {

	@OriginalMember(owner = "client!g", name = "A", descriptor = "I")
	public int anInt1993;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(II)V")
	public Class4_Sub3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong217 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
	public int method1515() {
		return (int) (this.aLong217 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	public int method1516() {
		return (int) this.aLong217;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	public void method1519() {
		this.aLong218 = Static101.method1677() + 500L | this.aLong218 & Long.MIN_VALUE;
		Static21.aClass178_4.method4370(this);
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)V")
	public void method1520() {
		this.aLong218 |= Long.MIN_VALUE;
		if (this.method1522() == 0L) {
			Static135.aClass178_11.method4370(this);
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)J")
	public long method1522() {
		return this.aLong218 & Long.MAX_VALUE;
	}
}
