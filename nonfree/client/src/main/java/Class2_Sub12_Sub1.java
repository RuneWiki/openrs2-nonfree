import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!oc", name = "Cb", descriptor = "Lclient!j;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!oc", name = "Qb", descriptor = "I")
	private int anInt1985;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(B)I")
	public int method1417() {
		return super.aByteArray20[super.anInt1939++] - this.aClass30_1.method896() & 0xFF;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(IB)I")
	public int method1418(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt1985 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt1985 & 0x7);
		this.anInt1985 += arg0;
		@Pc(28) int local28 = 0;
		while (arg0 > local15) {
			local28 += (super.aByteArray20[local8++] & Static10.anIntArray21[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local28 += super.aByteArray20[local8] & Static10.anIntArray21[local15];
		} else {
			local28 += super.aByteArray20[local8] >> local15 - arg0 & Static10.anIntArray21[arg0];
		}
		return local28;
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(IB)I")
	public int method1419(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1985;
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(II)V")
	public void method1422(@OriginalArg(1) int arg0) {
		super.aByteArray20[super.anInt1939++] = (byte) (this.aClass30_1.method896() + arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B[I)V")
	public void method1424(@OriginalArg(1) int[] arg0) {
		this.aClass30_1 = new Class30(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(B)V")
	public void method1425() {
		super.anInt1939 = (this.anInt1985 + 7) / 8;
	}

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "(I)V")
	public void method1427() {
		this.anInt1985 = super.anInt1939 * 8;
	}
}
