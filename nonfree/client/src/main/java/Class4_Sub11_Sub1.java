import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class4_Sub11_Sub1 extends Class4_Sub11 {

	@OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
	private int anInt1522;

	@OriginalMember(owner = "client!dc", name = "Sb", descriptor = "Lclient!ip;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "(I)Z")
	public boolean method1528() {
		@Pc(16) int local16 = super.aByteArray68[super.anInt5831] - this.aClass159_2.method3626() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([IB)V")
	public void method1529(@OriginalArg(0) int[] arg0) {
		this.aClass159_2 = new Class159(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "(II)I")
	public int method1530(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = this.anInt1522 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt1522 & 0x7);
		this.anInt1522 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local23) {
			local31 += (Static577.anIntArray541[local23] & super.aByteArray68[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += Static577.anIntArray541[local23] & super.aByteArray68[local15];
		} else {
			local31 += super.aByteArray68[local15] >> local23 - arg0 & Static577.anIntArray541[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "(I)V")
	public void method1531() {
		this.anInt1522 = super.anInt5831 * 8;
	}

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "(I)I")
	public int method1532() {
		@Pc(22) int local22 = super.aByteArray68[super.anInt5831++] - this.aClass159_2.method3624() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray68[super.anInt5831++] - this.aClass159_2.method3624() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(IB)I")
	public int method1533(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1522;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!ip;)V")
	public void method1534(@OriginalArg(1) Class159 arg0) {
		this.aClass159_2 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "(B)V")
	public void method1537() {
		super.anInt5831 = (this.anInt1522 + 7) / 8;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II[BI)V")
	public void method1539(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray68[super.anInt5831++] - this.aClass159_2.method3624());
		}
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "(II)V")
	public void method1540(@OriginalArg(0) int arg0) {
		super.aByteArray68[super.anInt5831++] = (byte) (arg0 + this.aClass159_2.method3624());
	}
}
