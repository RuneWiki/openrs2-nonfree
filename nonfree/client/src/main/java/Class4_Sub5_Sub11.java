import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class4_Sub5_Sub11 extends Class4_Sub5 {

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
	public int anInt4425;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
	public int anInt4427;

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
	public int anInt4429;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IJ)V")
	public Class4_Sub5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong307 = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)J")
	public long method3952() {
		return super.aLong307 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)J")
	public long method3953() {
		return super.aLong306 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
	public void method3955() {
		super.aLong306 |= Long.MIN_VALUE;
		if (this.method3953() == 0L) {
			Static205.aClass367_2.method8310(this);
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V")
	public void method3956() {
		super.aLong306 = super.aLong306 & Long.MIN_VALUE | Static429.method5935() + 500L;
		Static587.aClass367_13.method8310(this);
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Z)I")
	public int method3957() {
		return (int) (super.aLong307 >>> 56 & 0xFFL);
	}
}
