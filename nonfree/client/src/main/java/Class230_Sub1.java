import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class230_Sub1 extends Class230 {

	@OriginalMember(owner = "client!uu", name = "Z", descriptor = "Z")
	public boolean aBoolean623 = false;

	@OriginalMember(owner = "client!uu", name = "db", descriptor = "Z")
	public boolean aBoolean624 = false;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!ci;)V")
	public Class230_Sub1(@OriginalArg(0) Class42 arg0) {
		super.anInt7304 = 3;
		this.method5649(true);
		super.anInt7316 = 0;
		super.aBoolean605 = true;
		super.anInt7307 = 0;
		super.anInt7315 = 2;
		super.anInt7305 = 0;
		super.anInt7311 = 255;
		super.aBoolean611 = true;
		super.anInt7296 = 1;
		super.aBoolean619 = false;
		super.anInt7306 = 127;
		super.aBoolean613 = true;
		super.aBoolean606 = true;
		super.anInt7298 = 127;
		super.anInt7303 = 0;
		super.aBoolean607 = true;
		super.aBoolean622 = true;
		super.aBoolean609 = true;
		super.aBoolean604 = true;
		super.aBoolean614 = true;
		super.anInt7312 = 0;
		super.aBoolean616 = true;
		if (Static188.anInt3481 < 96) {
			Static403.method5490(0);
		} else {
			Static403.method5490(2);
		}
		super.aBoolean612 = false;
		super.anInt7294 = 0;
		super.aBoolean618 = true;
		super.anInt7309 = Static398.anInt7109 == 1 ? 2 : 4;
		super.aBoolean621 = false;
		super.anInt7310 = 0;
		super.aBoolean615 = true;
		super.anInt7313 = 2;
		super.aBoolean608 = false;
		super.anInt7301 = 2;
		@Pc(129) Class110 local129 = null;
		try {
			@Pc(134) Class159 local134 = arg0.method661("");
			while (local134.anInt4271 == 0) {
				Static366.method5214(1L);
			}
			if (local134.anInt4271 == 1) {
				local129 = (Class110) local134.anObject8;
				@Pc(161) byte[] local161 = new byte[(int) local129.method2360()];
				@Pc(176) int local176;
				for (@Pc(163) int local163 = 0; local163 < local161.length; local163 += local176) {
					local176 = local129.method2359(local161, local163, local161.length - local163);
					if (local176 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method5643(new Class1_Sub14(local161));
			}
		} catch (@Pc(205) Exception local205) {
		}
		try {
			if (local129 != null) {
				local129.method2357();
			}
		} catch (@Pc(212) Exception local212) {
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!ti;B)V")
	private void method5643(@OriginalArg(0) Class1_Sub14 arg0) {
		if (arg0.aByteArray65.length - arg0.anInt5695 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method4548();
		if (local19 < 0 || local19 > 17) {
			return;
		}
		@Pc(40) byte local40;
		if (local19 == 17) {
			local40 = 40;
		} else if (local19 == 16) {
			local40 = 38;
		} else if (local19 == 15) {
			local40 = 37;
		} else if (local19 == 14) {
			local40 = 36;
		} else if (local19 == 13) {
			local40 = 35;
		} else if (local19 == 12) {
			local40 = 34;
		} else if (local19 == 11) {
			local40 = 33;
		} else if (local19 == 10) {
			local40 = 32;
		} else if (local19 == 9) {
			local40 = 31;
		} else if (local19 == 8) {
			local40 = 30;
		} else if (local19 == 7) {
			local40 = 29;
		} else if (local19 == 6) {
			local40 = 28;
		} else if (local19 == 5) {
			local40 = 28;
		} else if (local19 == 4) {
			local40 = 24;
		} else if (local19 == 3) {
			local40 = 23;
		} else if (local19 == 2) {
			local40 = 22;
		} else if (local19 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (arg0.aByteArray65.length - arg0.anInt5695 < local40) {
			return;
		}
		super.anInt7304 = arg0.method4548();
		if (super.anInt7304 < 1) {
			super.anInt7304 = 1;
		} else if (super.anInt7304 > 4) {
			super.anInt7304 = 4;
		}
		this.method5649(arg0.method4548() == 1);
		super.aBoolean611 = arg0.method4548() == 1;
		super.aBoolean609 = arg0.method4548() == 1;
		super.aBoolean604 = arg0.method4548() == 1;
		super.anInt7296 = arg0.method4548() == 1 ? 1 : 0;
		super.aBoolean614 = arg0.method4548() == 1;
		super.aBoolean605 = arg0.method4548() == 1;
		super.aBoolean613 = arg0.method4548() == 1;
		super.anInt7315 = arg0.method4548();
		if (super.anInt7315 > 2) {
			super.anInt7315 = 2;
		}
		if (local19 >= 17) {
			super.anInt7316 = arg0.method4548();
		}
		if (local19 >= 2) {
			super.aBoolean606 = arg0.method4548() == 1;
			if (local19 >= 17) {
				super.aBoolean619 = arg0.method4548() == 1;
			}
		} else {
			super.aBoolean606 = arg0.method4548() == 1;
			arg0.method4548();
		}
		super.aBoolean616 = arg0.method4548() == 1;
		super.aBoolean622 = arg0.method4548() == 1;
		super.anInt7307 = arg0.method4548();
		if (super.anInt7307 > 2) {
			super.anInt7307 = 2;
		}
		super.anInt7312 = super.anInt7307;
		super.aBoolean607 = arg0.method4548() == 1;
		super.anInt7298 = arg0.method4548();
		if (super.anInt7298 > 127) {
			super.anInt7298 = 127;
		}
		super.anInt7311 = arg0.method4548();
		super.anInt7306 = arg0.method4548();
		if (super.anInt7306 > 127) {
			super.anInt7306 = 127;
		}
		if (local19 >= 1) {
			super.anInt7305 = arg0.method4498();
			super.anInt7303 = arg0.method4498();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method4548();
		}
		if (local19 >= 4) {
			@Pc(467) int local467 = arg0.method4548();
			if (local467 < 0 || local467 > 2) {
				local467 = 0;
			}
			if (Static188.anInt3481 < 96) {
				local467 = 0;
			}
			Static403.method5490(local467);
		}
		if (local19 >= 5) {
			super.anInt7310 = arg0.method4500();
		}
		@Pc(509) int local509 = 0;
		if (local19 >= 6) {
			super.anInt7301 = local509 = arg0.method4548();
		}
		if (super.anInt7301 != 1 && super.anInt7301 != 2) {
			super.anInt7301 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean608 = arg0.method4548() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean621 = arg0.method4548() == 1;
		}
		if (local19 >= 9) {
			super.anInt7294 = arg0.method4548();
		}
		if (super.anInt7294 < 0 || super.anInt7294 > Static219.method3244(Static188.anInt3481)) {
			super.anInt7294 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean612 = arg0.method4548() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean618 = arg0.method4548() != 0;
		}
		if (local19 >= 12) {
			super.anInt7296 = arg0.method4548();
		}
		if (super.anInt7296 < 0 || super.anInt7296 > 2) {
			super.anInt7296 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean615 = arg0.method4548() == 1;
		}
		if (local19 >= 14) {
			super.anInt7313 = arg0.method4548();
		} else if (local509 == 0) {
			super.anInt7313 = 2;
		} else {
			super.anInt7313 = 1;
		}
		if (super.anInt7313 < 0 || super.anInt7313 > 3) {
			super.anInt7313 = 2;
		}
		if (local19 >= 15) {
			super.anInt7309 = arg0.method4548();
			if (super.anInt7309 < 0 || super.anInt7309 > 4) {
				super.anInt7309 = Static398.anInt7109 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean617 = arg0.method4548() == 1;
		}
		if (local19 < 17 && super.anInt7313 == 0) {
			super.anInt7313 = 2;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
	public boolean method5644(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean624 ? super.aBoolean620 : true;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I")
	public int method5647(@OriginalArg(0) int arg0) {
		if (this.aBoolean623) {
			return 0;
		} else if (this.method5644(arg0)) {
			return super.aBoolean611 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Lclient!ti;")
	public Class1_Sub14 method5648() {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(41);
		local8.method4553(17);
		local8.method4553(super.anInt7304);
		local8.method4553(super.aBoolean620 ? 1 : 0);
		local8.method4553(super.aBoolean611 ? 1 : 0);
		local8.method4553(super.aBoolean609 ? 1 : 0);
		local8.method4553(super.aBoolean604 ? 1 : 0);
		local8.method4553(0);
		local8.method4553(super.aBoolean614 ? 1 : 0);
		local8.method4553(super.aBoolean605 ? 1 : 0);
		local8.method4553(super.aBoolean613 ? 1 : 0);
		local8.method4553(super.anInt7315);
		local8.method4553(super.anInt7316);
		local8.method4553(super.aBoolean606 ? 1 : 0);
		local8.method4553(super.aBoolean619 ? 1 : 0);
		local8.method4553(super.aBoolean616 ? 1 : 0);
		local8.method4553(super.aBoolean622 ? 1 : 0);
		local8.method4553(super.anInt7307);
		local8.method4553(super.aBoolean607 ? 1 : 0);
		local8.method4553(super.anInt7298);
		local8.method4553(super.anInt7311);
		local8.method4553(super.anInt7306);
		local8.method4504(super.anInt7305);
		local8.method4504(super.anInt7303);
		local8.method4553(Static235.method3424());
		local8.method4522(super.anInt7310);
		local8.method4553(super.anInt7301);
		local8.method4553(super.aBoolean608 ? 1 : 0);
		local8.method4553(super.aBoolean621 ? 1 : 0);
		local8.method4553(super.anInt7294);
		local8.method4553(super.aBoolean612 ? 1 : 0);
		local8.method4553(super.aBoolean618 ? 1 : 0);
		local8.method4553(super.anInt7296);
		local8.method4553(super.aBoolean615 ? 1 : 0);
		local8.method4553(super.anInt7313);
		local8.method4553(super.anInt7309);
		local8.method4553(super.aBoolean617 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)V")
	public void method5649(@OriginalArg(0) boolean arg0) {
		super.aBoolean620 = arg0;
		if (Static251.aClass207_2 != null) {
			Static251.aClass207_2.method4980(!this.method5644(Static146.anInt2664));
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z")
	public boolean method5650(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean620 : true;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!ci;)V")
	public void method5651(@OriginalArg(1) Class42 arg0) {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(12) Class159 local12 = arg0.method661("");
			while (local12.anInt4271 == 0) {
				Static366.method5214(1L);
			}
			if (local12.anInt4271 == 1) {
				local7 = (Class110) local12.anObject8;
				@Pc(44) Class1_Sub14 local44 = this.method5648();
				local7.method2355(local44.aByteArray65, local44.anInt5695, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local7 != null) {
				local7.method2357();
			}
		} catch (@Pc(61) Exception local61) {
		}
	}
}
