import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	private int anInt8291;

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "I")
	private int anInt8292;

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
	private int anInt8293;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	private int anInt8294;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
	public int anInt8295;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	public int anInt8297;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
	private int anInt8299;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
	private int anInt8300;

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
	private int anInt8301;

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
	private int anInt8302;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
	private int anInt8303;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
	private int anInt8304;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
	private int anInt8307;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
	public int anInt8308;

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
	private int anInt8309;

	@OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
	private int anInt8310;

	@OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
	private int anInt8312;

	@OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
	private int anInt8313;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
	private int anInt8314;

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
	public int anInt8317;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "Z")
	public boolean aBoolean609 = false;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
	private int anInt8298 = 0;

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "J")
	private final long aLong202;

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "Lclient!dg;")
	public final Class69 aClass69_2;

	@OriginalMember(owner = "client!ru", name = "L", descriptor = "Lclient!hm;")
	public final Class5_Sub2 aClass5_Sub2_8;

	@OriginalMember(owner = "client!ru", name = "O", descriptor = "Lclient!sf;")
	public Class284 aClass284_1;

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "Lclient!qo;")
	public final Class267 aClass267_7;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!oa;Lclient!dg;Lclient!hm;J)V")
	public Class5_Sub7(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class5_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aLong202 = arg3;
		this.aClass69_2 = arg1;
		this.aClass5_Sub2_8 = arg2;
		this.aClass284_1 = this.aClass69_2.method2012();
		if (!arg0.method5449() && this.aClass284_1.anInt8536 != -1) {
			this.aClass284_1 = Static364.method6163(this.aClass284_1.anInt8536);
		}
		this.aClass267_7 = new Class267();
		this.anInt8298 = (int) ((double) this.anInt8298 + Math.random() * 64.0D);
		this.method6922();
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	public void method6922() {
		this.anInt8302 = this.aClass69_2.anInt2233;
		this.anInt8291 = this.aClass69_2.anInt2219;
		this.anInt8314 = this.aClass69_2.anInt2215;
		this.anInt8307 = this.aClass69_2.anInt2228;
		this.anInt8304 = this.aClass69_2.anInt2216;
		this.anInt8301 = this.aClass69_2.anInt2217;
		this.anInt8292 = this.aClass69_2.anInt2224;
		this.anInt8294 = this.aClass69_2.anInt2218;
		this.anInt8293 = this.aClass69_2.anInt2229;
		if (this.anInt8291 == this.anInt8294 && this.anInt8307 == this.anInt8294 && this.anInt8292 == this.anInt8301 && this.anInt8293 == this.anInt8292 && this.anInt8302 == this.anInt8314 && this.anInt8302 == this.anInt8304) {
			this.aBoolean608 = true;
			return;
		}
		this.aBoolean608 = false;
		@Pc(109) int local109 = (this.anInt8294 + this.anInt8291 + this.anInt8307) / 3;
		@Pc(120) int local120 = (this.anInt8292 + this.anInt8301 + this.anInt8293) / 3;
		@Pc(132) int local132 = (this.anInt8304 + this.anInt8314 + this.anInt8302) / 3;
		if (local109 == this.anInt8297 && this.anInt8308 == local120 && this.anInt8295 == local132) {
			return;
		}
		this.anInt8295 = local132;
		this.anInt8308 = local120;
		this.anInt8297 = local109;
		@Pc(164) int local164 = this.anInt8294 - this.anInt8291;
		@Pc(171) int local171 = this.anInt8292 - this.anInt8301;
		@Pc(177) int local177 = this.anInt8302 - this.anInt8314;
		@Pc(184) int local184 = this.anInt8307 - this.anInt8291;
		@Pc(191) int local191 = this.anInt8293 - this.anInt8301;
		@Pc(197) int local197 = this.anInt8304 - this.anInt8314;
		this.anInt8300 = local197 * local171 - local191 * local177;
		this.anInt8299 = local191 * local164 - local171 * local184;
		this.anInt8310 = local177 * local184 - local164 * local197;
		while (this.anInt8300 > 32767 || this.anInt8310 > 32767 || this.anInt8299 > 32767 || this.anInt8300 < -32767 || this.anInt8310 < -32767 || this.anInt8299 < -32767) {
			this.anInt8310 >>= 0x1;
			this.anInt8300 >>= 0x1;
			this.anInt8299 >>= 0x1;
		}
		@Pc(296) int local296 = (int) Math.sqrt((double) (this.anInt8300 * this.anInt8300 + this.anInt8310 * this.anInt8310 + this.anInt8299 * this.anInt8299));
		if (local296 <= 0) {
			local296 = 1;
		}
		this.anInt8300 = this.anInt8300 * 32767 / local296;
		this.anInt8310 = this.anInt8310 * 32767 / local296;
		this.anInt8299 = this.anInt8299 * 32767 / local296;
		if (this.aClass284_1.aShort122 <= 0 && this.aClass284_1.lb <= 0) {
			return;
		}
		@Pc(349) int local349 = (int) (Math.atan2((double) this.anInt8299, (double) this.anInt8300) * 2607.5945876176133D);
		@Pc(370) int local370 = (int) (Math.atan2((double) this.anInt8310, Math.sqrt((double) (this.anInt8299 * this.anInt8299 + this.anInt8300 * this.anInt8300))) * 2607.5945876176133D);
		this.anInt8309 = this.aClass284_1.aShort122 - this.aClass284_1.aShort124;
		this.anInt8303 = this.aClass284_1.aShort124 + local349 - (this.anInt8309 >> 1);
		this.anInt8313 = this.aClass284_1.lb - this.aClass284_1.aShort123;
		this.anInt8312 = local370 + this.aClass284_1.aShort123 - (this.anInt8313 >> 1);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBLclient!oa;JZ)V")
	public void method6923(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(54) int local54;
		if (this.aBoolean609) {
			arg3 = false;
		} else if (Static217.anInt3896 < this.aClass284_1.anInt8517) {
			arg3 = false;
		} else if (Static38.anIntArray77[Static217.anInt3896] < Static92.anInt9034) {
			arg3 = false;
		} else if (this.aBoolean608) {
			arg3 = false;
		} else if (this.aClass284_1.anInt8515 != -1) {
			local54 = (int) (arg2 - this.aLong202);
			if (this.aClass284_1.aBoolean639 || this.aClass284_1.anInt8515 >= local54) {
				local54 %= this.aClass284_1.anInt8515;
			} else {
				arg3 = false;
			}
			if (!this.aClass284_1.aBoolean638 && this.aClass284_1.anInt8513 > local54) {
				arg3 = false;
			}
			if (this.aClass284_1.aBoolean638 && this.aClass284_1.anInt8513 <= local54) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt8298 += (int) (((double) this.aClass284_1.anInt8541 + Math.random() * (double) (this.aClass284_1.anInt8527 - this.aClass284_1.anInt8541)) * (double) arg0);
			if (this.anInt8298 > 63) {
				local54 = this.anInt8298 >> 6;
				this.anInt8298 &= 0x3F;
				for (@Pc(151) int local151 = 0; local151 < local54; local151++) {
					@Pc(215) int local215;
					@Pc(221) int local221;
					@Pc(227) int local227;
					@Pc(172) int local172;
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(195) int local195;
					@Pc(203) int local203;
					@Pc(207) int local207;
					if (this.aClass284_1.aShort122 <= 0 && this.aClass284_1.lb <= 0) {
						local221 = this.anInt8310;
						local215 = this.anInt8300;
						local227 = this.anInt8299;
					} else {
						local172 = this.anInt8303 + (int) ((double) this.anInt8309 * Math.random());
						@Pc(176) int local176 = local172 & 0x3FFF;
						local180 = Class179.anIntArray756[local176];
						local184 = Class179.anIntArray757[local176];
						local195 = this.anInt8312 + (int) (Math.random() * (double) this.anInt8313);
						@Pc(199) int local199 = local195 & 0x1FFF;
						local203 = Class179.anIntArray756[local199];
						local207 = Class179.anIntArray757[local199];
						local215 = local184 * local203 >> 13;
						local221 = (local207 << 1) * -1;
						local227 = local180 * local203 >> 13;
					}
					local172 = (int) (Math.random() * 65535.0D);
					local180 = (int) (Math.random() * 65535.0D);
					if (local180 + local172 > 65535) {
						local180 = 65535 - local180;
						local172 = 65535 - local172;
					}
					local184 = 65535 - local172 - local180;
					local195 = (int) ((long) local172 * (long) this.anInt8291 + (long) this.anInt8294 * (long) local180 + (long) local184 * (long) this.anInt8307 >> 16);
					local203 = (int) ((long) this.anInt8292 * (long) local180 + (long) local172 * (long) this.anInt8301 + (long) this.anInt8293 * (long) local184 >> 16);
					local207 = (int) ((long) this.anInt8304 * (long) local184 + (long) this.anInt8314 * (long) local172 + (long) local180 * (long) this.anInt8302 >> 16);
					@Pc(362) int local362 = (int) (Math.random() * (double) (this.aClass284_1.anInt8509 - this.aClass284_1.anInt8518)) + this.aClass284_1.anInt8518;
					@Pc(379) int local379 = (int) (Math.random() * (double) (this.aClass284_1.anInt8496 - this.aClass284_1.anInt8516)) + this.aClass284_1.anInt8516;
					@Pc(397) int local397 = this.aClass284_1.anInt8508 + (int) ((double) (this.aClass284_1.anInt8519 - this.aClass284_1.anInt8508) * Math.random());
					@Pc(461) int local461;
					if (this.aClass284_1.aBoolean637) {
						@Pc(403) double local403 = Math.random();
						local461 = (int) ((double) this.aClass284_1.anInt8523 * Math.random() + (double) this.aClass284_1.anInt8504) << 24 | (int) ((double) this.aClass284_1.anInt8494 + (double) this.aClass284_1.anInt8546 * local403) | (int) ((double) this.aClass284_1.anInt8498 * local403 + (double) this.aClass284_1.anInt8526) << 16 | (int) ((double) this.aClass284_1.anInt8512 + (double) this.aClass284_1.anInt8501 * local403) << 8;
					} else {
						local461 = (int) ((double) this.aClass284_1.anInt8494 + (double) this.aClass284_1.anInt8546 * Math.random()) | (int) ((double) this.aClass284_1.anInt8526 + Math.random() * (double) this.aClass284_1.anInt8498) << 16 | (int) ((double) this.aClass284_1.anInt8512 + (double) this.aClass284_1.anInt8501 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass284_1.anInt8523 + (double) this.aClass284_1.anInt8504) << 24;
					}
					@Pc(525) int local525 = this.aClass284_1.anInt8524;
					if (!arg1.method5449() && !this.aClass284_1.aBoolean634) {
						local525 = -1;
					}
					if (Static186.anInt4087 == Static14.anInt593) {
						new Class5_Sub1_Sub1_Sub1(this, local195, local203, local207, local215, local221, local227, local362, local379, local461, local397, local525, this.aClass284_1.aBoolean635, this.aClass284_1.aBoolean633);
					} else {
						@Pc(565) Class5_Sub1_Sub1_Sub1 local565 = Static432.aClass5_Sub1_Sub1_Sub1Array2[Static14.anInt593];
						Static14.anInt593 = Static14.anInt593 + 1 & 0x3FF;
						local565.method5147(this, local195, local203, local207, local215, local221, local227, local362, local379, local461, local397, local525, this.aClass284_1.aBoolean635, this.aClass284_1.aBoolean633);
					}
				}
			}
		}
		this.anInt8317 = 0;
		for (@Pc(608) Class5_Sub1_Sub1_Sub1 local608 = (Class5_Sub1_Sub1_Sub1) this.aClass267_7.method6544(); local608 != null; local608 = (Class5_Sub1_Sub1_Sub1) this.aClass267_7.method6543()) {
			local608.method5144(arg2, arg0);
			this.anInt8317++;
		}
		Static334.anInt6216 += this.anInt8317;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!oa;JB)V")
	public void method6924(@OriginalArg(0) Class9 arg0, @OriginalArg(1) long arg1) {
		for (@Pc(17) Class5_Sub1_Sub1_Sub1 local17 = (Class5_Sub1_Sub1_Sub1) this.aClass267_7.method6544(); local17 != null; local17 = (Class5_Sub1_Sub1_Sub1) this.aClass267_7.method6543()) {
			local17.method5145(arg0, arg1);
		}
	}
}
