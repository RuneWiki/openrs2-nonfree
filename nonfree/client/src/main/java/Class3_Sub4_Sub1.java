import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ag", name = "Cb", descriptor = "Lclient!fe;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!ag", name = "Mb", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([II)V")
	public void method225(@OriginalArg(0) int[] arg0) {
		this.aClass27_1 = new Class27(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "(I)I")
	public int method226() {
		return super.aByteArray5[super.anInt232++] - this.aClass27_1.method915() & 0xFF;
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(Z)V")
	public void method227() {
		this.anInt277 = super.anInt232 * 8;
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(II)I")
	public int method228(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt277 >> 3;
		@Pc(14) int local14 = 8 - (this.anInt277 & 0x7);
		this.anInt277 += arg0;
		@Pc(34) int local34 = 0;
		while (arg0 > local14) {
			local34 += (super.aByteArray5[local6++] & Static50.anIntArray128[local14]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (arg0 == local14) {
			local34 += Static50.anIntArray128[local14] & super.aByteArray5[local6];
		} else {
			local34 += super.aByteArray5[local6] >> local14 - arg0 & Static50.anIntArray128[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "(B)V")
	public void method231() {
		super.anInt232 = (this.anInt277 + 7) / 8;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)I")
	public int method232(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt277;
	}

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "(II)V")
	public void method233(@OriginalArg(0) int arg0) {
		super.aByteArray5[super.anInt232++] = (byte) (this.aClass27_1.method915() + arg0);
	}
}
