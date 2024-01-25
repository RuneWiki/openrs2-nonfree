import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!cda", name = "Ib", descriptor = "Lclient!caa;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!cda", name = "Nb", descriptor = "I")
	private int anInt1505;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "(IB)V")
	public void method1489(@OriginalArg(0) int arg0) {
		super.aByteArray86[super.anInt7869++] = (byte) (this.aClass40_1.method1282() + arg0);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II[BI)V")
	public void method1490(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = (byte) (super.aByteArray86[super.anInt7869++] - this.aClass40_1.method1282());
		}
	}

	@OriginalMember(owner = "client!cda", name = "l", descriptor = "(B)V")
	public void method1491() {
		super.anInt7869 = (this.anInt1505 + 7) / 8;
	}

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "(B)Z")
	public boolean method1493() {
		@Pc(17) int local17 = super.aByteArray86[super.anInt7869] - this.aClass40_1.method1283() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!cda", name = "E", descriptor = "(I)I")
	public int method1494() {
		@Pc(29) int local29 = super.aByteArray86[super.anInt7869++] - this.aClass40_1.method1282() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray86[super.anInt7869++] - this.aClass40_1.method1282() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "(II)I")
	public int method1495(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1505;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[I)V")
	public void method1496(@OriginalArg(1) int[] arg0) {
		this.aClass40_1 = new Class40(arg0);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLclient!caa;)V")
	public void method1497(@OriginalArg(1) Class40 arg0) {
		this.aClass40_1 = arg0;
	}

	@OriginalMember(owner = "client!cda", name = "k", descriptor = "(II)I")
	public int method1499(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt1505 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt1505 & 0x7);
		@Pc(17) int local17 = 0;
		this.anInt1505 += arg0;
		while (local15 < arg0) {
			local17 += (super.aByteArray86[local8++] & Static377.anIntArray470[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local17 += Static377.anIntArray470[local15] & super.aByteArray86[local8];
		} else {
			local17 += super.aByteArray86[local8] >> local15 - arg0 & Static377.anIntArray470[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)V")
	public void method1500() {
		this.anInt1505 = super.anInt7869 * 8;
	}
}
