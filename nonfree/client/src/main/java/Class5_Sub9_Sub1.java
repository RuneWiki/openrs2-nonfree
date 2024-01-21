import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class5_Sub9_Sub1 extends Class5_Sub9 {

	@OriginalMember(owner = "client!na", name = "Xb", descriptor = "I")
	private int anInt2156;

	@OriginalMember(owner = "client!na", name = "ec", descriptor = "Lclient!id;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
	public Class5_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(II)I")
	public int method1456(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = 8 - (this.anInt2156 & 0x7);
		@Pc(16) int local16 = this.anInt2156 >> 3;
		this.anInt2156 += arg0;
		@Pc(32) int local32 = 0;
		while (arg0 > local11) {
			local32 += (Static114.anIntArray472[local11] & super.aByteArray28[local16++]) << arg0 - local11;
			arg0 -= local11;
			local11 = 8;
		}
		if (arg0 == local11) {
			local32 += super.aByteArray28[local16] & Static114.anIntArray472[local11];
		} else {
			local32 += super.aByteArray28[local16] >> local11 - arg0 & Static114.anIntArray472[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!na", name = "v", descriptor = "(I)I")
	public int method1458() {
		return super.aByteArray28[super.anInt2140++] - this.aClass35_1.method981() & 0xFF;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(IB)I")
	public int method1459(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2156;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B[I)V")
	public void method1460(@OriginalArg(1) int[] arg0) {
		this.aClass35_1 = new Class35(arg0);
	}

	@OriginalMember(owner = "client!na", name = "w", descriptor = "(I)V")
	public void method1462() {
		this.anInt2156 = super.anInt2140 * 8;
	}

	@OriginalMember(owner = "client!na", name = "x", descriptor = "(I)V")
	public void method1464() {
		super.anInt2140 = (this.anInt2156 + 7) / 8;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(BI)V")
	public void method1466(@OriginalArg(1) int arg0) {
		super.aByteArray28[super.anInt2140++] = (byte) (this.aClass35_1.method981() + arg0);
	}
}
