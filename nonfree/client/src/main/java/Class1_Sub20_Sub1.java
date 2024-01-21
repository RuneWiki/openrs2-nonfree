import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub20_Sub1 extends Class1_Sub20 {

	@OriginalMember(owner = "client!ua", name = "Vb", descriptor = "Lclient!ue;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!ua", name = "nc", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class1_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(II)V")
	public void method2108(@OriginalArg(0) int arg0) {
		super.aByteArray36[super.anInt2951++] = (byte) (arg0 + this.aClass76_1.method2166());
	}

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "(I)V")
	public void method2111() {
		super.anInt2951 = (this.anInt2990 + 7) / 8;
	}

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "(I)V")
	public void method2113() {
		this.anInt2990 = super.anInt2951 * 8;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)I")
	public int method2115(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2990 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 8 - (this.anInt2990 & 0x7);
		this.anInt2990 += arg0;
		while (arg0 > local19) {
			local12 += (Static124.anIntArray454[local19] & super.aByteArray36[local6++]) << arg0 - local19;
			arg0 -= local19;
			local19 = 8;
		}
		if (arg0 == local19) {
			local12 += super.aByteArray36[local6] & Static124.anIntArray454[local19];
		} else {
			local12 += super.aByteArray36[local6] >> local19 - arg0 & Static124.anIntArray454[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "(I)I")
	public int method2116() {
		return super.aByteArray36[super.anInt2951++] - this.aClass76_1.method2166() & 0xFF;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([IZ)V")
	public void method2119(@OriginalArg(0) int[] arg0) {
		this.aClass76_1 = new Class76(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)I")
	public int method2122(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2990;
	}
}
