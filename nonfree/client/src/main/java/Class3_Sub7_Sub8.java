import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class3_Sub7_Sub8 extends Class3_Sub7 {

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	public int anInt3667;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(II)V")
	public Class3_Sub7_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong240 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	public void method3217() {
		super.aLong231 = super.aLong231 & Long.MIN_VALUE | Static288.method4512() + 500L;
		Static347.aClass162_10.method3729(this);
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	public void method3219() {
		super.aLong231 |= Long.MIN_VALUE;
		if (this.method3221() == 0L) {
			Static146.aClass162_7.method3729(this);
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)I")
	public int method3220() {
		return (int) (super.aLong240 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)J")
	public long method3221() {
		return super.aLong231 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
	public int method3222() {
		return (int) super.aLong240;
	}
}
