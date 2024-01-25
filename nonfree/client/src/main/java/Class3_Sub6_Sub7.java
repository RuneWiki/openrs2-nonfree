import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class3_Sub6_Sub7 extends Class3_Sub6 {

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	public int anInt1782;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	public int anInt1789;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
	public int anInt1790;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IJ)V")
	public Class3_Sub6_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong309 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)J")
	public long method1703() {
		return super.aLong309 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)J")
	public long method1708() {
		return super.aLong290 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
	public void method1709() {
		super.aLong290 = super.aLong290 & Long.MIN_VALUE | Static131.method2268() + 500L;
		Static136.aClass258_2.method5936(this);
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
	public int method1710() {
		return (int) (super.aLong309 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V")
	public void method1712() {
		super.aLong290 |= Long.MIN_VALUE;
		if (this.method1708() == 0L) {
			Static610.aClass258_8.method5936(this);
		}
	}
}
