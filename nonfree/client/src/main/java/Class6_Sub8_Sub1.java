import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class6_Sub8_Sub1 extends Class6_Sub8 {

	@OriginalMember(owner = "client!bi", name = "Nb", descriptor = "I")
	private int anInt1595;

	@OriginalMember(owner = "client!bi", name = "Pb", descriptor = "Lclient!hj;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[BZ)V")
	public void method1506(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray102[super.anInt10061++] - this.aClass134_1.method3842());
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!hj;)V")
	public void method1507(@OriginalArg(1) Class134 arg0) {
		this.aClass134_1 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "(B)V")
	public void method1509() {
		super.anInt10061 = (this.anInt1595 + 7) / 8;
	}

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "(I)I")
	public int method1510() {
		@Pc(26) int local26 = super.aByteArray102[super.anInt10061++] - this.aClass134_1.method3842() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray102[super.anInt10061++] - this.aClass134_1.method3842() & 0xFF);
	}

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "(I)V")
	public void method1511() {
		this.anInt1595 = super.anInt10061 * 8;
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(BI)I")
	public int method1512(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1595 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt1595 & 0x7);
		this.anInt1595 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.aByteArray102[local10++] & Static149.anIntArray157[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += Static149.anIntArray157[local26] & super.aByteArray102[local10];
		} else {
			local34 += super.aByteArray102[local10] >> local26 - arg0 & Static149.anIntArray157[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "(II)I")
	public int method1513(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1595;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)V")
	public void method1514(@OriginalArg(0) int[] arg0) {
		this.aClass134_1 = new Class134(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "(B)Z")
	public boolean method1515() {
		@Pc(25) int local25 = super.aByteArray102[super.anInt10061] - this.aClass134_1.method3843() & 0xFF;
		return local25 >= 128;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)V")
	public void method1516(@OriginalArg(1) int arg0) {
		super.aByteArray102[super.anInt10061++] = (byte) (arg0 + this.aClass134_1.method3842());
	}
}
