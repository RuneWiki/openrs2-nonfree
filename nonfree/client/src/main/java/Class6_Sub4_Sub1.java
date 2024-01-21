import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!la", name = "Yb", descriptor = "Lclient!ef;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!la", name = "qc", descriptor = "I")
	private int anInt1981;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!la", name = "j", descriptor = "(B)I")
	public int method1340() {
		return super.aByteArray27[super.anInt1949++] - this.aClass23_1.method798() & 0xFF;
	}

	@OriginalMember(owner = "client!la", name = "k", descriptor = "(B)V")
	public void method1341() {
		super.anInt1949 = (this.anInt1981 + 7) / 8;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([II)V")
	public void method1343(@OriginalArg(0) int[] arg0) {
		this.aClass23_1 = new Class23(arg0);
	}

	@OriginalMember(owner = "client!la", name = "l", descriptor = "(B)V")
	public void method1344() {
		this.anInt1981 = super.anInt1949 * 8;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)V")
	public void method1347(@OriginalArg(1) int arg0) {
		super.aByteArray27[super.anInt1949++] = (byte) (arg0 + this.aClass23_1.method798());
	}

	@OriginalMember(owner = "client!la", name = "n", descriptor = "(II)I")
	public int method1348(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1981;
	}

	@OriginalMember(owner = "client!la", name = "o", descriptor = "(II)I")
	public int method1349(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1981 >> 3;
		@Pc(20) int local20 = 0;
		@Pc(27) int local27 = 8 - (this.anInt1981 & 0x7);
		this.anInt1981 += arg0;
		while (arg0 > local27) {
			local20 += (super.aByteArray27[local10++] & Static37.anIntArray141[local27]) << arg0 - local27;
			arg0 -= local27;
			local27 = 8;
		}
		if (local27 == arg0) {
			local20 += Static37.anIntArray141[local27] & super.aByteArray27[local10];
		} else {
			local20 += super.aByteArray27[local10] >> local27 - arg0 & Static37.anIntArray141[arg0];
		}
		return local20;
	}
}
