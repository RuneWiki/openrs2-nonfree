import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
	public int anInt3724;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
	public int anInt3725;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
	public int anInt3727;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub4_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong217 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I")
	public int method3476() {
		return (int) super.aLong217;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)I")
	public int method3478() {
		return (int) (super.aLong217 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V")
	public void method3480() {
		super.aLong211 |= Long.MIN_VALUE;
		if (this.method3482() == 0L) {
			Static158.aClass89_3.method2720(this);
		}
	}

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V")
	public void method3481() {
		super.aLong211 = super.aLong211 & Long.MIN_VALUE | Static183.method3462() + 500L;
		Static239.aClass89_6.method2720(this);
	}

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)J")
	public long method3482() {
		return Long.MAX_VALUE & super.aLong211;
	}
}
