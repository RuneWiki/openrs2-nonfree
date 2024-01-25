import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ck", name = "Hb", descriptor = "Lclient!bs;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!ck", name = "Kb", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([IB)V")
	public void method851(@OriginalArg(0) int[] arg0) {
		this.aClass35_1 = new Class35(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "(I)Z")
	public boolean method853() {
		@Pc(22) int local22 = super.aByteArray42[super.anInt3121] - this.aClass35_1.method549() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "(I)V")
	public void method854() {
		this.anInt957 = super.anInt3121 * 8;
	}

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "(I)I")
	public int method855() {
		@Pc(22) int local22 = super.aByteArray42[super.anInt3121++] - this.aClass35_1.method548() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray42[super.anInt3121++] - this.aClass35_1.method548() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)V")
	public void method856(@OriginalArg(1) int arg0) {
		super.aByteArray42[super.anInt3121++] = (byte) (this.aClass35_1.method548() + arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[B)V")
	public void method857(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray42[super.anInt3121++] - this.aClass35_1.method548());
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "(IB)I")
	public int method858(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt957;
	}

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "(II)I")
	public int method859(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt957 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt957 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt957 += arg0;
		while (local18 < arg0) {
			local20 += (super.aByteArray42[local10++] & Static26.anIntArray38[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static26.anIntArray38[local18] & super.aByteArray42[local10];
		} else {
			local20 += super.aByteArray42[local10] >> local18 - arg0 & Static26.anIntArray38[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(Z)V")
	public void method860() {
		super.anInt3121 = (this.anInt957 + 7) / 8;
	}
}
