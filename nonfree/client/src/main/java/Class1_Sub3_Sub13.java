import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!np", name = "C", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "I")
	public int anInt4297;

	@OriginalMember(owner = "client!np", name = "L", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!np", name = "M", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong226 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
	public void method3458() {
		super.aLong216 = Static232.method3058() + 500L | super.aLong216 & Long.MIN_VALUE;
		Static58.aClass260_6.method5557(this);
	}

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
	public void method3459() {
		super.aLong216 |= Long.MIN_VALUE;
		if (this.method3462() == 0L) {
			Static446.aClass260_10.method5557(this);
		}
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "(I)I")
	public int method3460() {
		return (int) super.aLong226;
	}

	@OriginalMember(owner = "client!np", name = "i", descriptor = "(I)I")
	public int method3461() {
		return (int) (super.aLong226 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)J")
	public long method3462() {
		return Long.MAX_VALUE & super.aLong216;
	}
}
