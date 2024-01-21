import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!ga", name = "bc", descriptor = "I")
	private int anInt987;

	@OriginalMember(owner = "client!ga", name = "ec", descriptor = "Lclient!se;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "(I)I")
	public int method670() {
		return super.aByteArray16[super.anInt976++] - this.aClass71_1.method1835() & 0xFF;
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "(II)I")
	public int method671(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt987 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt987 & 0x7);
		this.anInt987 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (Static50.anIntArray138[local18] & super.aByteArray16[local6++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray16[local6] & Static50.anIntArray138[local18];
		} else {
			local26 += super.aByteArray16[local6] >> local18 - arg0 & Static50.anIntArray138[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)V")
	public void method672() {
		this.anInt987 = super.anInt976 * 8;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(IB)V")
	public void method673(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt976++] = (byte) (arg0 + this.aClass71_1.method1835());
	}

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "(II)I")
	public int method674(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt987;
	}

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "(I)V")
	public void method675() {
		super.anInt976 = (this.anInt987 + 7) / 8;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([IB)V")
	public void method676(@OriginalArg(0) int[] arg0) {
		this.aClass71_1 = new Class71(arg0);
	}
}
