import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ce", name = "Db", descriptor = "Lclient!lw;")
	private Class199 aClass199_2;

	@OriginalMember(owner = "client!ce", name = "Qb", descriptor = "I")
	private int anInt1472;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "(II)I")
	public int method1383(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anInt1472 >> 3;
		@Pc(25) int local25 = 8 - (this.anInt1472 & 0x7);
		this.anInt1472 += arg0;
		@Pc(33) int local33 = 0;
		while (local25 < arg0) {
			local33 += (super.aByteArray62[local17++] & Static498.anIntArray518[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (local25 == arg0) {
			local33 += super.aByteArray62[local17] & Static498.anIntArray518[local25];
		} else {
			local33 += super.aByteArray62[local17] >> local25 - arg0 & Static498.anIntArray518[arg0];
		}
		return local33;
	}

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "(I)V")
	public void method1384() {
		this.anInt1472 = super.anInt6128 * 8;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([IB)V")
	public void method1385(@OriginalArg(0) int[] arg0) {
		this.aClass199_2 = new Class199(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)V")
	public void method1386(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray62[super.anInt6128++] - this.aClass199_2.method4648());
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!lw;I)V")
	public void method1387(@OriginalArg(0) Class199 arg0) {
		this.aClass199_2 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "(II)V")
	public void method1388(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt6128++] = (byte) (arg0 + this.aClass199_2.method4648());
	}

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "(B)I")
	public int method1389() {
		@Pc(21) int local21 = super.aByteArray62[super.anInt6128++] - this.aClass199_2.method4648() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray62[super.anInt6128++] - this.aClass199_2.method4648() & 0xFF);
	}

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "(II)I")
	public int method1390(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1472;
	}

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "(I)Z")
	public boolean method1391() {
		@Pc(23) int local23 = super.aByteArray62[super.anInt6128] - this.aClass199_2.method4650() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "(B)V")
	public void method1392() {
		super.anInt6128 = (this.anInt1472 + 7) / 8;
	}
}
