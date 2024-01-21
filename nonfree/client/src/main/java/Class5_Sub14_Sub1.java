import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class5_Sub14_Sub1 extends Class5_Sub14 {

	@OriginalMember(owner = "client!na", name = "gc", descriptor = "I")
	private int anInt2263;

	@OriginalMember(owner = "client!na", name = "ic", descriptor = "Lclient!de;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(IB)V")
	public void method1489(@OriginalArg(0) int arg0) {
		super.aByteArray33[super.anInt2199++] = (byte) (this.aClass17_1.method511() + arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[I)V")
	public void method1490(@OriginalArg(1) int[] arg0) {
		this.aClass17_1 = new Class17(arg0);
	}

	@OriginalMember(owner = "client!na", name = "s", descriptor = "(I)I")
	public int method1491() {
		return super.aByteArray33[super.anInt2199++] - this.aClass17_1.method511() & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "p", descriptor = "(II)I")
	public int method1492(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt2263 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2263 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt2263 += arg0;
		while (arg0 > local18) {
			local20 += (Static12.anIntArray57[local18] & super.aByteArray33[local6++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += super.aByteArray33[local6] & Static12.anIntArray57[local18];
		} else {
			local20 += super.aByteArray33[local6] >> local18 - arg0 & Static12.anIntArray57[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!na", name = "t", descriptor = "(I)V")
	public void method1493() {
		this.anInt2263 = super.anInt2199 * 8;
	}

	@OriginalMember(owner = "client!na", name = "q", descriptor = "(II)I")
	public int method1495(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2263;
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(I)V")
	public void method1499() {
		super.anInt2199 = (this.anInt2263 + 7) / 8;
	}
}
