import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!le", name = "Nb", descriptor = "Lclient!ne;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!le", name = "Ob", descriptor = "I")
	private int anInt2439;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
	public void method1711(@OriginalArg(0) int arg0) {
		super.aByteArray35[super.anInt2385++] = (byte) (arg0 + this.aClass55_1.method1881());
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(BI)I")
	public int method1713(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2439 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2439 & 0x7);
		this.anInt2439 += arg0;
		@Pc(34) int local34 = 0;
		while (local18 < arg0) {
			local34 += (Static67.anIntArray180[local18] & super.aByteArray35[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local34 += super.aByteArray35[local10] & Static67.anIntArray180[local18];
		} else {
			local34 += super.aByteArray35[local10] >> local18 - arg0 & Static67.anIntArray180[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "(B)V")
	public void method1714() {
		this.anInt2439 = super.anInt2385 * 8;
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "(II)I")
	public int method1716(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2439;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(B)V")
	public void method1717() {
		super.anInt2385 = (this.anInt2439 + 7) / 8;
	}

	@OriginalMember(owner = "client!le", name = "u", descriptor = "(I)I")
	public int method1720() {
		return super.aByteArray35[super.anInt2385++] - this.aClass55_1.method1881() & 0xFF;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IZ)V")
	public void method1721(@OriginalArg(0) int[] arg0) {
		this.aClass55_1 = new Class55(arg0);
	}
}
