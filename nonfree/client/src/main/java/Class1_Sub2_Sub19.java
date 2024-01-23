import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Lclient!sc;")
	public Class107 aClass107_1333;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong177 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	public int method3685() {
		return (int) (super.aLong177 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)J")
	public long method3688() {
		return Long.MAX_VALUE & super.aLong174;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public void method3689() {
		super.aLong174 = Static209.method3309() + 500L | Long.MIN_VALUE & super.aLong174;
		Static171.aClass85_5.method2432(this);
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)I")
	public int method3690() {
		return (int) super.aLong177;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public void method3691() {
		super.aLong174 |= Long.MIN_VALUE;
		if (this.method3688() == 0L) {
			Static100.aClass85_3.method2432(this);
		}
	}
}
