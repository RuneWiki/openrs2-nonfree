import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!t", name = "Jb", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!t", name = "Pb", descriptor = "Lclient!lf;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(ZI)V")
	public void method1799(@OriginalArg(1) int arg0) {
		super.aByteArray38[super.anInt2799++] = (byte) (arg0 + this.aClass47_1.method1129());
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IZ)I")
	public int method1801(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt2835 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = 8 - (this.anInt2835 & 0x7);
		this.anInt2835 += arg0;
		while (arg0 > local25) {
			local17 += (Static66.anIntArray234[local25] & super.aByteArray38[local15++]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local17 += super.aByteArray38[local15] & Static66.anIntArray234[local25];
		} else {
			local17 += super.aByteArray38[local15] >> local25 - arg0 & Static66.anIntArray234[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!t", name = "u", descriptor = "(I)V")
	public void method1806() {
		super.anInt2799 = (this.anInt2835 + 7) / 8;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "(II)I")
	public int method1807(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2835;
	}

	@OriginalMember(owner = "client!t", name = "v", descriptor = "(I)I")
	public int method1809() {
		return super.aByteArray38[super.anInt2799++] - this.aClass47_1.method1129() & 0xFF;
	}

	@OriginalMember(owner = "client!t", name = "k", descriptor = "(B)V")
	public void method1810() {
		this.anInt2835 = super.anInt2799 * 8;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[I)V")
	public void method1811(@OriginalArg(1) int[] arg0) {
		this.aClass47_1 = new Class47(arg0);
	}
}
