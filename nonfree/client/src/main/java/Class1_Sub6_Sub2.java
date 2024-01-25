import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!jj", name = "Cb", descriptor = "Lclient!we;")
	private Class312 aClass312_1;

	@OriginalMember(owner = "client!jj", name = "Ib", descriptor = "I")
	private int anInt4574;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)V")
	public void method3972() {
		this.anInt4574 = super.anInt4555 * 8;
	}

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(II)V")
	public void method3973(@OriginalArg(0) int arg0) {
		super.aByteArray66[super.anInt4555++] = (byte) (this.aClass312_1.method7381() + arg0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[B)V")
	public void method3974(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray66[super.anInt4555++] - this.aClass312_1.method7381());
		}
	}

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "(I)Z")
	public boolean method3975() {
		@Pc(22) int local22 = super.aByteArray66[super.anInt4555] - this.aClass312_1.method7379() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(II)I")
	public int method3976(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt4574 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt4574 & 0x7);
		this.anInt4574 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.aByteArray66[local10++] & Static284.anIntArray535[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray66[local10] & Static284.anIntArray535[local18];
		} else {
			local26 += super.aByteArray66[local10] >> local18 - arg0 & Static284.anIntArray535[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "(I)V")
	public void method3977() {
		super.anInt4555 = (this.anInt4574 + 7) / 8;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IB)V")
	public void method3978(@OriginalArg(0) int[] arg0) {
		this.aClass312_1 = new Class312(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "(I)I")
	public int method3979() {
		@Pc(21) int local21 = super.aByteArray66[super.anInt4555++] - this.aClass312_1.method7381() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray66[super.anInt4555++] - this.aClass312_1.method7381() & 0xFF);
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "(II)I")
	public int method3980(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4574;
	}
}
