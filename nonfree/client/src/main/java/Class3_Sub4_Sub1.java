import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
	private int anInt1788;

	@OriginalMember(owner = "client!ih", name = "Tb", descriptor = "Lclient!c;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z[I)V")
	public void method1297(@OriginalArg(1) int[] arg0) {
		this.aClass15_1 = new Class15(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(II)V")
	public void method1298(@OriginalArg(0) int arg0) {
		super.aByteArray12[super.anInt1758++] = (byte) (arg0 + this.aClass15_1.method315());
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(II)I")
	public int method1299(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = this.anInt1788 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt1788 & 0x7);
		this.anInt1788 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local23) {
			local31 += (Static136.anIntArray200[local23] & super.aByteArray12[local16++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += Static136.anIntArray200[local23] & super.aByteArray12[local16];
		} else {
			local31 += super.aByteArray12[local16] >> local23 - arg0 & Static136.anIntArray200[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(B)V")
	public void method1302() {
		this.anInt1788 = super.anInt1758 * 8;
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(II)I")
	public int method1303(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1788;
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "(I)V")
	public void method1305() {
		super.anInt1758 = (this.anInt1788 + 7) / 8;
	}

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "(I)I")
	public int method1306() {
		return super.aByteArray12[super.anInt1758++] - this.aClass15_1.method315() & 0xFF;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[B)V")
	public void method1307(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray12[super.anInt1758++] - this.aClass15_1.method315());
		}
	}
}
