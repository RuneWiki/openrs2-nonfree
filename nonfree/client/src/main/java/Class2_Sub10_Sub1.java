import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!r", name = "Ib", descriptor = "I")
	private int anInt2209;

	@OriginalMember(owner = "client!r", name = "Zb", descriptor = "Lclient!ld;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(II)V")
	public void method1533(@OriginalArg(0) int arg0) {
		super.aByteArray27[super.anInt2187++] = (byte) (this.aClass44_1.method1014() + arg0);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IZ)I")
	public int method1535(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2209;
	}

	@OriginalMember(owner = "client!r", name = "r", descriptor = "(I)I")
	public int method1536() {
		return super.aByteArray27[super.anInt2187++] - this.aClass44_1.method1014() & 0xFF;
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(B)V")
	public void method1537() {
		super.anInt2187 = (this.anInt2209 + 7) / 8;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(BI)I")
	public int method1538(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2209 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2209 & 0x7);
		this.anInt2209 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (Static63.anIntArray174[local18] & super.aByteArray27[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray27[local10] & Static63.anIntArray174[local18];
		} else {
			local26 += super.aByteArray27[local10] >> local18 - arg0 & Static63.anIntArray174[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!r", name = "t", descriptor = "(I)V")
	public void method1540() {
		this.anInt2209 = super.anInt2187 * 8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([II)V")
	public void method1541(@OriginalArg(0) int[] arg0) {
		this.aClass44_1 = new Class44(arg0);
	}
}
