import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class3_Sub1_Sub5_Sub3 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	public int anInt1169;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
	public int anInt1170;

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
	public int anInt1171;

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "[B")
	public byte[] aByteArray22;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5_Sub3() {
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(III)V")
	private Class3_Sub1_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1171 = this.anInt1168 = arg0;
		this.anInt1169 = this.anInt1167 = arg1;
		this.anInt1170 = this.anInt1172 = 0;
		this.aByteArray22 = new byte[arg0 * arg1];
		this.anIntArray132 = new int[arg2];
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "()V")
	public void method810() {
		@Pc(6) byte[] local6 = new byte[this.anInt1168 * this.anInt1167];
		@Pc(8) int local8 = 0;
		for (@Pc(13) int local13 = this.anInt1167 - 1; local13 >= 0; local13--) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt1168; local16++) {
				local6[local8++] = this.aByteArray22[local16 + local13 * this.anInt1168];
			}
		}
		this.aByteArray22 = local6;
		this.anInt1172 = this.anInt1169 - this.anInt1167 - this.anInt1172;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "()V")
	public void method811() {
		@Pc(6) byte[] local6 = new byte[this.anInt1168 * this.anInt1167];
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < this.anInt1167; local10++) {
			for (@Pc(16) int local16 = this.anInt1168 - 1; local16 >= 0; local16--) {
				local6[local8++] = this.aByteArray22[local16 + local10 * this.anInt1168];
			}
		}
		this.aByteArray22 = local6;
		this.anInt1170 = this.anInt1171 - this.anInt1168 - this.anInt1170;
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "()Lclient!gf;")
	public Class3_Sub1_Sub5_Sub3 method812() {
		@Pc(10) Class3_Sub1_Sub5_Sub3 local10 = new Class3_Sub1_Sub5_Sub3(this.anInt1168, this.anInt1167, this.anIntArray132.length);
		local10.anInt1171 = this.anInt1171;
		local10.anInt1169 = this.anInt1169;
		local10.anInt1170 = this.anInt1170;
		local10.anInt1172 = this.anInt1172;
		@Pc(30) int local30 = this.aByteArray22.length;
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			local10.aByteArray22[local32] = this.aByteArray22[local32];
		}
		local30 = this.anIntArray132.length;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local10.anIntArray132[local51] = this.anIntArray132[local51];
		}
		return local10;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)V")
	public void method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt1170;
		arg1 += this.anInt1172;
		@Pc(15) int local15 = arg0 + arg1 * Static84.anInt1934;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt1167;
		@Pc(23) int local23 = this.anInt1168;
		@Pc(27) int local27 = Static84.anInt1934 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static84.anInt1936) {
			local36 = Static84.anInt1936 - arg1;
			local20 -= local36;
			arg1 = Static84.anInt1936;
			local17 = local36 * local23;
			local15 += local36 * Static84.anInt1934;
		}
		if (arg1 + local20 > Static84.anInt1932) {
			local20 -= arg1 + local20 - Static84.anInt1932;
		}
		if (arg0 < Static84.anInt1935) {
			local36 = Static84.anInt1935 - arg0;
			local23 -= local36;
			arg0 = Static84.anInt1935;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static84.anInt1937) {
			local36 = arg0 + local23 - Static84.anInt1937;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static129.method816(Static84.anIntArray256, this.aByteArray22, this.anIntArray132, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "()V")
	public void method814() {
		if (this.anInt1168 == this.anInt1171 && this.anInt1167 == this.anInt1169) {
			return;
		}
		@Pc(17) byte[] local17 = new byte[this.anInt1171 * this.anInt1169];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.anInt1167; local21++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1168; local24++) {
				local17[local24 + this.anInt1170 + (local21 + this.anInt1172) * this.anInt1171] = this.aByteArray22[local19++];
			}
		}
		this.aByteArray22 = local17;
		this.anInt1168 = this.anInt1171;
		this.anInt1167 = this.anInt1169;
		this.anInt1170 = 0;
		this.anInt1172 = 0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public void method815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray132.length; local1++) {
			@Pc(11) int local11 = this.anIntArray132[local1] >> 16 & 0xFF;
			local11 += arg0;
			if (local11 < 0) {
				local11 = 0;
			} else if (local11 > 255) {
				local11 = 255;
			}
			@Pc(34) int local34 = this.anIntArray132[local1] >> 8 & 0xFF;
			local34 += arg1;
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			@Pc(55) int local55 = this.anIntArray132[local1] & 0xFF;
			local55 += arg2;
			if (local55 < 0) {
				local55 = 0;
			} else if (local55 > 255) {
				local55 = 255;
			}
			this.anIntArray132[local1] = (local11 << 16) + (local34 << 8) + local55;
		}
	}
}
