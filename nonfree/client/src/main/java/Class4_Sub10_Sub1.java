import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class4_Sub10_Sub1 extends Class4_Sub10 {

	@OriginalMember(owner = "client!fd", name = "uc", descriptor = "I")
	private int anInt954;

	@OriginalMember(owner = "client!fd", name = "Hc", descriptor = "Lclient!cb;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "(I)V")
	public void method606() {
		super.anInt931 = (this.anInt954 + 7) / 8;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)I")
	public int method608(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt954 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt954 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt954 += arg0;
		while (arg0 > local18) {
			local20 += (Static1.anIntArray2[local18] & super.aByteArray17[local6++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static1.anIntArray2[local18] & super.aByteArray17[local6];
		} else {
			local20 += super.aByteArray17[local6] >> local18 - arg0 & Static1.anIntArray2[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(IB)I")
	public int method609(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt954;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B[I)V")
	public void method610(@OriginalArg(1) int[] arg0) {
		this.aClass12_1 = new Class12(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(BI)V")
	public void method611(@OriginalArg(1) int arg0) {
		super.aByteArray17[super.anInt931++] = (byte) (this.aClass12_1.method163() + arg0);
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "(I)V")
	public void method613() {
		this.anInt954 = super.anInt931 * 8;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(B)I")
	public int method614() {
		return super.aByteArray17[super.anInt931++] - this.aClass12_1.method163() & 0xFF;
	}
}
