import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "I")
	public int anInt2449;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	public int anInt2451;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4_Sub3() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2446 = this.anInt2448 = arg0;
		this.anInt2451 = this.anInt2450 = arg1;
		this.anInt2447 = this.anInt2449 = 0;
		this.aByteArray62 = new byte[arg0 * arg1];
		this.anIntArray318 = new int[arg2];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public void method1479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2447;
		arg1 += this.anInt2449;
		@Pc(15) int local15 = arg0 + arg1 * Static43.anInt2925;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2450;
		@Pc(23) int local23 = this.anInt2448;
		@Pc(27) int local27 = Static43.anInt2925 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static43.anInt2926) {
			local36 = Static43.anInt2926 - arg1;
			local20 -= local36;
			arg1 = Static43.anInt2926;
			local17 = local36 * local23;
			local15 += local36 * Static43.anInt2925;
		}
		if (arg1 + local20 > Static43.anInt2929) {
			local20 -= arg1 + local20 - Static43.anInt2929;
		}
		if (arg0 < Static43.anInt2927) {
			local36 = Static43.anInt2927 - arg0;
			local23 -= local36;
			arg0 = Static43.anInt2927;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static43.anInt2928) {
			local36 = arg0 + local23 - Static43.anInt2928;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static114.method1482(Static43.anIntArray417, this.aByteArray62, this.anIntArray318, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	public void method1480() {
		@Pc(6) byte[] local6 = new byte[this.anInt2448 * this.anInt2450];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2450 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2448; local16++) {
				local6[local8++] = this.aByteArray62[local16 + local13 * this.anInt2448];
			}
		}
		this.aByteArray62 = local6;
		this.anInt2449 = this.anInt2451 - this.anInt2450 - this.anInt2449;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
	public void method1481() {
		@Pc(6) byte[] local6 = new byte[this.anInt2448 * this.anInt2450];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2450; local10++) {
			for (@Pc(16) int local16 = this.anInt2448 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray62[local16 + local10 * this.anInt2448];
			}
		}
		this.aByteArray62 = local6;
		this.anInt2447 = this.anInt2446 - this.anInt2448 - this.anInt2447;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "()V")
	public void method1483() {
		if (this.anInt2448 == this.anInt2446 && this.anInt2450 == this.anInt2451) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2446 * this.anInt2451];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2450; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2448; local24++) {
				local17[local24 + this.anInt2447 + (local21 + this.anInt2449) * this.anInt2446] = this.aByteArray62[local19++];
			}
		}
		this.aByteArray62 = local17;
		this.anInt2448 = this.anInt2446;
		this.anInt2450 = this.anInt2451;
		this.anInt2447 = 0;
		this.anInt2449 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "()Lclient!qd;")
	public Class2_Sub1_Sub4_Sub3 method1484() {
		@Pc(10) Class2_Sub1_Sub4_Sub3 local10 = new Class2_Sub1_Sub4_Sub3(this.anInt2448, this.anInt2450, this.anIntArray318.length);
		local10.anInt2446 = this.anInt2446;
		local10.anInt2451 = this.anInt2451;
		local10.anInt2447 = this.anInt2447;
		local10.anInt2449 = this.anInt2449;
		@Pc(30) int local30 = this.aByteArray62.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray62[local32] = this.aByteArray62[local32];
		}
		local30 = this.anIntArray318.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray318[local51] = this.anIntArray318[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray318.length; local1++) {
			@Pc(11) int local11 = this.anIntArray318[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray318[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray318[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray318[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
