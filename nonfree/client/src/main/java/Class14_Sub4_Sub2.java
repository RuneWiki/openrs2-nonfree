import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class14_Sub4_Sub2 extends Class14_Sub4 {

	@OriginalMember(owner = "client!hj", name = "Fb", descriptor = "Lclient!ik;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!hj", name = "Jb", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
	public Class14_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "(I)V")
	public void method2556() {
		this.anInt2677 = super.anInt2637 * 8;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IB)V")
	public void method2557(@OriginalArg(0) int arg0) {
		super.aByteArray74[super.anInt2637++] = (byte) (this.aClass93_1.method2729() + arg0);
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "(II)I")
	public int method2558(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2677 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt2677 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt2677 += arg0;
		while (arg0 > local17) {
			local19 += (Static342.anIntArray625[local17] & super.aByteArray74[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += super.aByteArray74[local10] & Static342.anIntArray625[local17];
		} else {
			local19 += super.aByteArray74[local10] >> local17 - arg0 & Static342.anIntArray625[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "(I)V")
	public void method2559() {
		super.anInt2637 = (this.anInt2677 + 7) / 8;
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(B)I")
	public int method2560() {
		return super.aByteArray74[super.anInt2637++] - this.aClass93_1.method2729() & 0xFF;
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "(II)I")
	public int method2562(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2677;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([BBII)V")
	public void method2563(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray74[super.anInt2637++] - this.aClass93_1.method2729());
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "([IB)V")
	public void method2564(@OriginalArg(0) int[] arg0) {
		this.aClass93_1 = new Class93(arg0);
	}
}
