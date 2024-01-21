import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class5_Sub1_Sub10_Sub1 extends Class5_Sub1_Sub10 {

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
	public int anInt1350;

	@OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
	public int anInt1351;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	public int anInt1352;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
	public int anInt1354;

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub10_Sub1() {
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
	private Class5_Sub1_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1353 = this.anInt1350 = arg0;
		this.anInt1354 = this.anInt1351 = arg1;
		this.anInt1352 = this.anInt1355 = 0;
		this.aByteArray8 = new byte[arg0 * arg1];
		this.anIntArray154 = new int[arg2];
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()Lclient!ia;")
	public Class5_Sub1_Sub10_Sub1 method916() {
		@Pc(10) Class5_Sub1_Sub10_Sub1 local10 = new Class5_Sub1_Sub10_Sub1(this.anInt1350, this.anInt1351, this.anIntArray154.length);
		local10.anInt1353 = this.anInt1353;
		local10.anInt1354 = this.anInt1354;
		local10.anInt1352 = this.anInt1352;
		local10.anInt1355 = this.anInt1355;
		@Pc(30) int local30 = this.aByteArray8.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray8[local32] = this.aByteArray8[local32];
		}
		local30 = this.anIntArray154.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray154[local51] = this.anIntArray154[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
	public void method917() {
		if (this.anInt1350 == this.anInt1353 && this.anInt1351 == this.anInt1354) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1353 * this.anInt1354];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1351; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1350; local24++) {
				local17[local24 + this.anInt1352 + (local21 + this.anInt1355) * this.anInt1353] = this.aByteArray8[local19++];
			}
		}
		this.aByteArray8 = local17;
		this.anInt1350 = this.anInt1353;
		this.anInt1351 = this.anInt1354;
		this.anInt1352 = 0;
		this.anInt1355 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "()V")
	public void method918() {
		@Pc(6) byte[] local6 = new byte[this.anInt1350 * this.anInt1351];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1351; local10++) {
			for (@Pc(16) int local16 = this.anInt1350 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray8[local16 + local10 * this.anInt1350];
			}
		}
		this.aByteArray8 = local6;
		this.anInt1352 = this.anInt1353 - this.anInt1350 - this.anInt1352;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "()V")
	public void method920() {
		@Pc(6) byte[] local6 = new byte[this.anInt1350 * this.anInt1351];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1351 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1350; local16++) {
				local6[local8++] = this.aByteArray8[local16 + local13 * this.anInt1350];
			}
		}
		this.aByteArray8 = local6;
		this.anInt1355 = this.anInt1354 - this.anInt1351 - this.anInt1355;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
	public void method921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1352;
		arg1 += this.anInt1355;
		@Pc(15) int local15 = arg0 + arg1 * Static52.anInt3020;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1351;
		@Pc(23) int local23 = this.anInt1350;
		@Pc(27) int local27 = Static52.anInt3020 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static52.anInt3016) {
			local36 = Static52.anInt3016 - arg1;
			local20 -= local36;
			arg1 = Static52.anInt3016;
			local17 = local36 * local23;
			local15 += local36 * Static52.anInt3020;
		}
		if (arg1 + local20 > Static52.anInt3019) {
			local20 -= arg1 + local20 - Static52.anInt3019;
		}
		if (arg0 < Static52.anInt3017) {
			local36 = Static52.anInt3017 - arg0;
			local23 -= local36;
			arg0 = Static52.anInt3017;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static52.anInt3018) {
			local36 = arg0 + local23 - Static52.anInt3018;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static123.method919(Static52.anIntArray309, this.aByteArray8, this.anIntArray154, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public void method922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray154.length; local1++) {
			@Pc(11) int local11 = this.anIntArray154[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray154[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray154[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray154[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
