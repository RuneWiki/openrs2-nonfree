import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class11_Sub1_Sub2_Sub1 extends Class11_Sub1_Sub2 {

	@OriginalMember(owner = "client!re", name = "R", descriptor = "I")
	public int anInt7873;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "I")
	public int anInt7875;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
	public int anInt7882;

	@OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
	public int anInt7886;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	public int anInt7870 = -1;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	public int anInt7871 = -1;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Z")
	private boolean aBoolean595 = false;

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
	private int anInt7885 = 0;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "I")
	public int anInt7877 = 0;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIII)V")
	public Class11_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(6) Class34 local6 = arg2.method6848();
		local6.NA(super.anInt8902, super.anInt8908 - 10, super.anInt8906);
		@Pc(33) Class52 local33 = Static230.aClass225_1.method4857(this.anInt7882).method4783(0, 0, -1, null, 131072, this.anInt7886, arg2, null);
		if (local33 != null && (Static594.aBoolean718 ? local33.method7392(arg1, arg0, local6, true, Static18.anInt503) : local33.method7402(arg1, arg0, local6, true))) {
			return true;
		}
		if (this.anInt7870 != -1) {
			local33 = Static230.aClass225_1.method4857(this.anInt7870).method4783(0, 0, -1, null, 131072, this.anInt7875, arg2, null);
			if (local33 != null && (Static594.aBoolean718 ? local33.method7392(arg1, arg0, local6, true, Static18.anInt503) : local33.method7402(arg1, arg0, local6, true))) {
				return true;
			}
		}
		if (this.anInt7871 != -1) {
			local33 = Static230.aClass225_1.method4857(this.anInt7871).method4783(0, 0, -1, null, 131072, this.anInt7873, arg2, null);
			if (local33 != null && (Static594.aBoolean718 ? local33.method7392(arg1, arg0, local6, true, Static18.anInt503) : local33.method7402(arg1, arg0, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		@Pc(17) Class21 local17 = Static488.method6717(super.aByte113, super.anInt8902 >> Static166.anInt7796, super.anInt8906 >> Static166.anInt7796);
		if (local17 != null && local17.aClass11_Sub1_Sub1_1.aBoolean574) {
			@Pc(28) int local28 = local17.aClass11_Sub1_Sub1_1.method7212();
			if (this.anInt7877 != local28) {
				super.anInt8908 -= this.anInt7877;
				super.anInt8908 += local28;
				this.anInt7877 = local28;
			}
		}
		@Pc(55) Class34 local55 = arg0.method6848();
		local55.Y();
		if (local17 == null || !local17.aClass11_Sub1_Sub1_1.aBoolean574) {
			@Pc(74) Class129 local74 = Static310.aClass129Array5[super.aByte112];
			@Pc(79) int local79 = this.anInt7885 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method6480(super.anInt8906 + local91, local86 + super.anInt8902);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(124) int local124 = local74.method6480(local112 + super.anInt8906, local107 + super.anInt8902);
			@Pc(129) int local129 = -local79 / 2;
			@Pc(133) int local133 = local79 / 2;
			@Pc(146) int local146 = local74.method6480(super.anInt8906 + local133, local129 + super.anInt8902);
			@Pc(150) int local150 = local79 / 2;
			@Pc(154) int local154 = local79 / 2;
			@Pc(167) int local167 = local74.method6480(super.anInt8906 + local154, super.anInt8902 - -local150);
			@Pc(178) int local178 = local103 >= local124 ? local124 : local103;
			@Pc(189) int local189 = local146 >= local167 ? local167 : local146;
			@Pc(200) int local200 = local124 >= local167 ? local167 : local124;
			if (local79 != 0) {
				@Pc(219) int local219 = (int) (Math.atan2((double) (local178 - local189), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local219 != 0) {
					local55.w(local219);
				}
			}
			@Pc(238) int local238 = local103 >= local146 ? local146 : local103;
			@Pc(242) int local242 = local167 + local103;
			if (local79 != 0) {
				@Pc(260) int local260 = (int) (Math.atan2((double) (local238 - local200), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local260 != 0) {
					local55.AA(-local260);
				}
			}
			if (local242 > local146 + local124) {
				local242 = local146 + local124;
			}
			local242 = (local242 >> 1) - super.anInt8908;
			if (local242 != 0) {
				local55.U(0, local242, 0);
			}
		}
		local55.U(super.anInt8902, super.anInt8908 - 10, super.anInt8906);
		@Pc(315) Class11_Sub2 local315 = Static586.method7842(3);
		this.anInt7885 = 0;
		this.aBoolean595 = false;
		@Pc(342) Class52 local342;
		if (this.anInt7871 != -1) {
			local342 = Static230.aClass225_1.method4857(this.anInt7871).method4783(0, 0, -1, null, 2048, this.anInt7873, arg0, null);
			if (local342 != null) {
				if (Static594.aBoolean718) {
					local342.method7405(local55, local315.aClass11_Sub4Array1[2], Static18.anInt503, 0);
				} else {
					local342.method7413(local55, local315.aClass11_Sub4Array1[2], 0);
				}
				this.aBoolean595 |= local342.LA();
				this.anInt7885 = local342.RA();
			}
		}
		if (this.anInt7870 != -1) {
			local342 = Static230.aClass225_1.method4857(this.anInt7870).method4783(0, 0, -1, null, 2048, this.anInt7875, arg0, null);
			if (local342 != null) {
				if (Static594.aBoolean718) {
					local342.method7405(local55, local315.aClass11_Sub4Array1[1], Static18.anInt503, 0);
				} else {
					local342.method7413(local55, local315.aClass11_Sub4Array1[1], 0);
				}
				this.aBoolean595 |= local342.LA();
				if (local342.RA() > this.anInt7885) {
					this.anInt7885 = local342.RA();
				}
			}
		}
		local342 = Static230.aClass225_1.method4857(this.anInt7882).method4783(0, 0, -1, null, 2048, this.anInt7886, arg0, null);
		if (local342 != null) {
			if (Static594.aBoolean718) {
				local342.method7405(local55, local315.aClass11_Sub4Array1[0], Static18.anInt503, 0);
			} else {
				local342.method7413(local55, local315.aClass11_Sub4Array1[0], 0);
			}
			this.aBoolean595 |= local342.LA();
			if (local342.RA() > this.anInt7885) {
				this.anInt7885 = local342.RA();
			}
		}
		return local315;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7217() {
		return this.aBoolean595;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
	@Override
	public int method7208(@OriginalArg(0) int arg0) {
		if (arg0 != 6329) {
			Static446.aClass83_169 = null;
		}
		return this.anInt7885;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)I")
	@Override
	public int method7212() {
		return -10;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7209() {
		return false;
	}
}
