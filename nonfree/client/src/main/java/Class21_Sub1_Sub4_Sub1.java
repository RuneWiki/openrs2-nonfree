import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class21_Sub1_Sub4_Sub1 extends Class21_Sub1_Sub4 {

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
	public int anInt10567;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
	public int anInt10575;

	@OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
	public int anInt10578;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
	public int anInt10582;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
	public int anInt10568 = -1;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	private int anInt10569 = 0;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
	public int anInt10573 = -1;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "Z")
	private boolean aBoolean715 = false;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
	public int anInt10580 = 0;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIII)V")
	public Class21_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
	}

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return -10;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(17) Class192 local17 = Static216.method3513(super.aByte127, super.anInt10551 >> Static392.anInt3635, super.anInt10550 >> Static392.anInt3635);
		if (local17 != null && local17.aClass21_Sub1_Sub1_1.aBoolean662) {
			@Pc(30) int local30 = local17.aClass21_Sub1_Sub1_1.method8231();
			if (this.anInt10580 != local30) {
				super.anInt10554 -= this.anInt10580;
				super.anInt10554 += local30;
				this.anInt10580 = local30;
			}
		}
		@Pc(53) Class81 local53 = arg0.method7812();
		local53.Y();
		if (local17 == null || !local17.aClass21_Sub1_Sub1_1.aBoolean662) {
			@Pc(72) Class115 local72 = Static255.aClass115Array2[super.aByte128];
			@Pc(77) int local77 = this.anInt10569 << 1;
			@Pc(84) int local84 = -local77 / 2;
			@Pc(89) int local89 = -local77 / 2;
			@Pc(102) int local102 = local72.method8064(super.anInt10551 + local84, local89 + super.anInt10550);
			@Pc(106) int local106 = local77 / 2;
			@Pc(111) int local111 = -local77 / 2;
			@Pc(125) int local125 = local72.method8064(super.anInt10551 + local106, super.anInt10550 - -local111);
			@Pc(130) int local130 = -local77 / 2;
			@Pc(134) int local134 = local77 / 2;
			@Pc(147) int local147 = local72.method8064(super.anInt10551 + local130, super.anInt10550 - -local134);
			@Pc(151) int local151 = local77 / 2;
			@Pc(155) int local155 = local77 / 2;
			@Pc(167) int local167 = local72.method8064(local151 + super.anInt10551, local155 + super.anInt10550);
			@Pc(178) int local178 = local102 < local125 ? local102 : local125;
			@Pc(189) int local189 = local167 > local147 ? local147 : local167;
			@Pc(196) int local196 = local167 > local125 ? local125 : local167;
			if (local77 != 0) {
				@Pc(212) int local212 = (int) (Math.atan2((double) (local178 - local189), (double) local77) * 2607.5945876176133D) & 0x3FFF;
				if (local212 != 0) {
					local53.w(local212);
				}
			}
			@Pc(228) int local228 = local102 < local147 ? local102 : local147;
			@Pc(232) int local232 = local102 + local167;
			if (local77 != 0) {
				@Pc(248) int local248 = (int) (Math.atan2((double) (local228 - local196), (double) local77) * 2607.5945876176133D) & 0x3FFF;
				if (local248 != 0) {
					local53.AA(-local248);
				}
			}
			if (local147 + local125 < local232) {
				local232 = local125 + local147;
			}
			local232 = (local232 >> 1) - super.anInt10554;
			if (local232 != 0) {
				local53.U(0, local232, 0);
			}
		}
		local53.U(super.anInt10551, super.anInt10554 - 10, super.anInt10550);
		@Pc(295) Class21_Sub4 local295 = Static227.method3708(3);
		this.anInt10569 = 0;
		this.aBoolean715 = false;
		@Pc(331) Class65 local331;
		if (this.anInt10573 != -1) {
			local331 = Static338.aClass29_1.method977(this.anInt10573).method5327(null, null, -1, 0, 2048, this.anInt10575, arg0, 0);
			if (local331 != null) {
				if (Static263.aBoolean371) {
					local331.method7686(local53, local295.aClass21_Sub7Array1[2], Static18.anInt941, 0);
				} else {
					local331.method7679(local53, local295.aClass21_Sub7Array1[2], 0);
				}
				this.aBoolean715 |= local331.LA();
				this.anInt10569 = local331.RA();
			}
		}
		if (this.anInt10568 != -1) {
			local331 = Static338.aClass29_1.method977(this.anInt10568).method5327(null, null, -1, 0, 2048, this.anInt10578, arg0, 0);
			if (local331 != null) {
				if (Static263.aBoolean371) {
					local331.method7686(local53, local295.aClass21_Sub7Array1[1], Static18.anInt941, 0);
				} else {
					local331.method7679(local53, local295.aClass21_Sub7Array1[1], 0);
				}
				this.aBoolean715 |= local331.LA();
				if (local331.RA() > this.anInt10569) {
					this.anInt10569 = local331.RA();
				}
			}
		}
		local331 = Static338.aClass29_1.method977(this.anInt10567).method5327(null, null, -1, 0, 2048, this.anInt10582, arg0, 0);
		if (local331 != null) {
			if (Static263.aBoolean371) {
				local331.method7686(local53, local295.aClass21_Sub7Array1[0], Static18.anInt941, 0);
			} else {
				local331.method7679(local53, local295.aClass21_Sub7Array1[0], 0);
			}
			this.aBoolean715 |= local331.LA();
			if (local331.RA() > this.anInt10569) {
				this.anInt10569 = local331.RA();
			}
		}
		return local295;
	}

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean715;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(6) Class81 local6 = arg2.method7812();
		local6.NA(super.anInt10551, super.anInt10554 - 10, super.anInt10550);
		@Pc(33) Class65 local33 = Static338.aClass29_1.method977(this.anInt10567).method5327(null, null, -1, 0, 131072, this.anInt10582, arg2, 0);
		if (local33 != null && (Static263.aBoolean371 ? local33.method7685(arg0, arg1, local6, true, Static18.anInt941) : local33.method7684(arg0, arg1, local6, true))) {
			return true;
		}
		if (this.anInt10568 != -1) {
			local33 = Static338.aClass29_1.method977(this.anInt10568).method5327(null, null, -1, 0, 131072, this.anInt10578, arg2, 0);
			if (local33 != null && (Static263.aBoolean371 ? local33.method7685(arg0, arg1, local6, true, Static18.anInt941) : local33.method7684(arg0, arg1, local6, true))) {
				return true;
			}
		}
		if (this.anInt10573 != -1) {
			local33 = Static338.aClass29_1.method977(this.anInt10573).method5327(null, null, -1, 0, 131072, this.anInt10575, arg2, 0);
			if (local33 != null && (Static263.aBoolean371 ? local33.method7685(arg0, arg1, local6, true, Static18.anInt941) : local33.method7684(arg0, arg1, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 > -102) {
			this.method8233(null);
		}
		return this.anInt10569;
	}
}
