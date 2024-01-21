import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class2_Sub1_Sub9_Sub3 extends Class2_Sub1_Sub9 {

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!qd", name = "Y", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
	public int anInt2486;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub9_Sub3() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(III)V")
	private Class2_Sub1_Sub9_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2486 = this.anInt2487 = arg0;
		this.anInt2483 = this.anInt2482 = arg1;
		this.anInt2485 = this.anInt2484 = 0;
		this.aByteArray34 = new byte[arg0 * arg1];
		this.anIntArray322 = new int[arg2];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray322.length; local1++) {
			@Pc(11) int local11 = this.anIntArray322[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray322[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray322[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray322[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	public void method1493() {
		@Pc(6) byte[] local6 = new byte[this.anInt2487 * this.anInt2482];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt2482 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2487; local16++) {
				local6[local8++] = this.aByteArray34[local16 + local13 * this.anInt2487];
			}
		}
		this.aByteArray34 = local6;
		this.anInt2484 = this.anInt2483 - this.anInt2482 - this.anInt2484;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public void method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2485;
		arg1 += this.anInt2484;
		@Pc(15) int local15 = arg0 + arg1 * Static99.anInt2978;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2482;
		@Pc(23) int local23 = this.anInt2487;
		@Pc(27) int local27 = Static99.anInt2978 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static99.anInt2974) {
			local36 = Static99.anInt2974 - arg1;
			local20 -= local36;
			arg1 = Static99.anInt2974;
			local17 = local36 * local23;
			local15 += local36 * Static99.anInt2978;
		}
		if (arg1 + local20 > Static99.anInt2976) {
			local20 -= arg1 + local20 - Static99.anInt2976;
		}
		if (arg0 < Static99.anInt2977) {
			local36 = Static99.anInt2977 - arg0;
			local23 -= local36;
			arg0 = Static99.anInt2977;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static99.anInt2979) {
			local36 = arg0 + local23 - Static99.anInt2979;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static132.method1497(Static99.anIntArray388, this.aByteArray34, this.anIntArray322, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
	public void method1495() {
		if (this.anInt2487 == this.anInt2486 && this.anInt2482 == this.anInt2483) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt2486 * this.anInt2483];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt2482; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt2487; local24++) {
				local17[local24 + this.anInt2485 + (local21 + this.anInt2484) * this.anInt2486] = this.aByteArray34[local19++];
			}
		}
		this.aByteArray34 = local17;
		this.anInt2487 = this.anInt2486;
		this.anInt2482 = this.anInt2483;
		this.anInt2485 = 0;
		this.anInt2484 = 0;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "()V")
	public void method1496() {
		@Pc(6) byte[] local6 = new byte[this.anInt2487 * this.anInt2482];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt2482; local10++) {
			for (@Pc(16) int local16 = this.anInt2487 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray34[local16 + local10 * this.anInt2487];
			}
		}
		this.aByteArray34 = local6;
		this.anInt2485 = this.anInt2486 - this.anInt2487 - this.anInt2485;
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "()Lclient!qd;")
	public Class2_Sub1_Sub9_Sub3 method1498() {
		@Pc(10) Class2_Sub1_Sub9_Sub3 local10 = new Class2_Sub1_Sub9_Sub3(this.anInt2487, this.anInt2482, this.anIntArray322.length);
		local10.anInt2486 = this.anInt2486;
		local10.anInt2483 = this.anInt2483;
		local10.anInt2485 = this.anInt2485;
		local10.anInt2484 = this.anInt2484;
		@Pc(30) int local30 = this.aByteArray34.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray34[local32] = this.aByteArray34[local32];
		}
		local30 = this.anIntArray322.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray322[local51] = this.anIntArray322[local51];
		}
		return local10;
	}
}
