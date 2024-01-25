import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!rj", name = "lb", descriptor = "Ljava/lang/String;")
	public static String lb = "";

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "Z")
	public boolean aBoolean476 = false;

	@OriginalMember(owner = "client!rj", name = "ib", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class106_Sub1(@OriginalArg(0) Class124 arg0) {
		super.anInt5698 = 3;
		this.method4435(true);
		super.anInt5677 = 2;
		super.anInt5682 = 127;
		super.aBoolean471 = true;
		super.anInt5675 = 0;
		super.aBoolean461 = true;
		super.anInt5678 = 1;
		super.aBoolean475 = true;
		super.aBoolean465 = true;
		super.aBoolean462 = true;
		super.anInt5686 = 0;
		super.aBoolean473 = true;
		super.anInt5683 = 0;
		super.aBoolean468 = true;
		super.aBoolean460 = false;
		super.aBoolean466 = true;
		super.aBoolean469 = true;
		super.anInt5685 = 0;
		super.anInt5700 = 0;
		super.anInt5696 = 127;
		super.aBoolean474 = true;
		super.anInt5694 = 255;
		if (Static144.anInt2437 < 96) {
			Static154.method4419(0);
		} else {
			Static154.method4419(2);
		}
		super.anInt5679 = 2;
		super.anInt5684 = 0;
		super.aBoolean467 = true;
		super.aBoolean459 = false;
		super.anInt5688 = Static302.anInt5050 == 1 ? 2 : 4;
		super.anInt5680 = 2;
		super.aBoolean470 = false;
		super.aBoolean472 = true;
		super.anInt5681 = 0;
		super.aBoolean458 = false;
		@Pc(129) Class220 local129 = null;
		try {
			@Pc(134) Class215 local134 = arg0.method2523("");
			while (local134.anInt5791 == 0) {
				Static252.method2874(1L);
			}
			if (local134.anInt5791 == 1) {
				local129 = (Class220) local134.anObject10;
				@Pc(158) byte[] local158 = new byte[(int) local129.method4583()];
				@Pc(173) int local173;
				for (@Pc(160) int local160 = 0; local160 < local158.length; local160 += local173) {
					local173 = local129.method4585(local160, local158.length - local160, local158);
					if (local173 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4437(new Class1_Sub11(local158));
			}
		} catch (@Pc(203) Exception local203) {
		}
		try {
			if (local129 != null) {
				local129.method4584();
			}
		} catch (@Pc(210) Exception local210) {
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method4429(@OriginalArg(0) Class124 arg0) {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(19) Class215 local19 = arg0.method2523("");
			while (local19.anInt5791 == 0) {
				Static252.method2874(1L);
			}
			if (local19.anInt5791 == 1) {
				local7 = (Class220) local19.anObject10;
				@Pc(41) Class1_Sub11 local41 = this.method4431();
				local7.method4582(local41.anInt5766, 0, local41.aByteArray64);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method4584();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I")
	public int method4430(@OriginalArg(0) int arg0) {
		if (this.aBoolean476) {
			return 0;
		} else if (this.method4438(arg0)) {
			return super.aBoolean462 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Lclient!dh;")
	public Class1_Sub11 method4431() {
		@Pc(8) Class1_Sub11 local8 = new Class1_Sub11(41);
		local8.method4445(17);
		local8.method4445(super.anInt5698);
		local8.method4445(super.aBoolean464 ? 1 : 0);
		local8.method4445(super.aBoolean462 ? 1 : 0);
		local8.method4445(super.aBoolean465 ? 1 : 0);
		local8.method4445(super.aBoolean468 ? 1 : 0);
		local8.method4445(0);
		local8.method4445(super.aBoolean471 ? 1 : 0);
		local8.method4445(super.aBoolean475 ? 1 : 0);
		local8.method4445(super.aBoolean473 ? 1 : 0);
		local8.method4445(super.anInt5677);
		local8.method4445(super.anInt5686);
		local8.method4445(super.aBoolean461 ? 1 : 0);
		local8.method4445(super.aBoolean460 ? 1 : 0);
		local8.method4445(super.aBoolean466 ? 1 : 0);
		local8.method4445(super.aBoolean474 ? 1 : 0);
		local8.method4445(super.anInt5685);
		local8.method4445(super.aBoolean469 ? 1 : 0);
		local8.method4445(super.anInt5696);
		local8.method4445(super.anInt5694);
		local8.method4445(super.anInt5682);
		local8.method4448(super.anInt5700);
		local8.method4448(super.anInt5683);
		local8.method4445(Static218.method4375());
		local8.method4450(super.anInt5681);
		local8.method4445(super.anInt5679);
		local8.method4445(super.aBoolean458 ? 1 : 0);
		local8.method4445(super.aBoolean470 ? 1 : 0);
		local8.method4445(super.anInt5684);
		local8.method4445(super.aBoolean459 ? 1 : 0);
		local8.method4445(super.aBoolean472 ? 1 : 0);
		local8.method4445(super.anInt5678);
		local8.method4445(super.aBoolean467 ? 1 : 0);
		local8.method4445(super.anInt5680);
		local8.method4445(super.anInt5688);
		local8.method4445(super.aBoolean463 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)V")
	public void method4435(@OriginalArg(1) boolean arg0) {
		super.aBoolean464 = arg0;
		if (Static259.aClass95_3 != null) {
			Static259.aClass95_3.method1823(!this.method4438(Static410.anInt6680));
		}
	}

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(II)Z")
	public boolean method4436(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean464 : true;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLclient!dh;)V")
	private void method4437(@OriginalArg(1) Class1_Sub11 arg0) {
		if (arg0.aByteArray64.length - arg0.anInt5766 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4463();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 17) {
			local34 = 40;
		} else if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray64.length - arg0.anInt5766) {
			return;
		}
		super.anInt5698 = arg0.method4463();
		if (super.anInt5698 < 1) {
			super.anInt5698 = 1;
		} else if (super.anInt5698 > 4) {
			super.anInt5698 = 4;
		}
		this.method4435(arg0.method4463() == 1);
		super.aBoolean462 = arg0.method4463() == 1;
		super.aBoolean465 = arg0.method4463() == 1;
		super.aBoolean468 = arg0.method4463() == 1;
		super.anInt5678 = arg0.method4463() == 1 ? 1 : 0;
		super.aBoolean471 = arg0.method4463() == 1;
		super.aBoolean475 = arg0.method4463() == 1;
		super.aBoolean473 = arg0.method4463() == 1;
		super.anInt5677 = arg0.method4463();
		if (super.anInt5677 > 2) {
			super.anInt5677 = 2;
		}
		if (local21 >= 17) {
			super.anInt5686 = arg0.method4463();
		}
		if (local21 < 2) {
			super.aBoolean461 = arg0.method4463() == 1;
			arg0.method4463();
		} else {
			super.aBoolean461 = arg0.method4463() == 1;
			if (local21 >= 17) {
				super.aBoolean460 = arg0.method4463() == 1;
			}
		}
		super.aBoolean466 = arg0.method4463() == 1;
		super.aBoolean474 = arg0.method4463() == 1;
		super.anInt5685 = arg0.method4463();
		if (super.anInt5685 > 2) {
			super.anInt5685 = 2;
		}
		super.anInt5675 = super.anInt5685;
		super.aBoolean469 = arg0.method4463() == 1;
		super.anInt5696 = arg0.method4463();
		if (super.anInt5696 > 127) {
			super.anInt5696 = 127;
		}
		super.anInt5694 = arg0.method4463();
		super.anInt5682 = arg0.method4463();
		if (super.anInt5682 > 127) {
			super.anInt5682 = 127;
		}
		if (local21 >= 1) {
			super.anInt5700 = arg0.method4485();
			super.anInt5683 = arg0.method4485();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4463();
		}
		@Pc(477) int local477;
		if (local21 >= 4) {
			local477 = arg0.method4463();
			if (local477 < 0 || local477 > 2) {
				local477 = 0;
			}
			if (Static144.anInt2437 < 96) {
				local477 = 0;
			}
			Static154.method4419(local477);
		}
		if (local21 >= 5) {
			super.anInt5681 = arg0.method4487();
		}
		local477 = 0;
		if (local21 >= 6) {
			super.anInt5679 = local477 = arg0.method4463();
		}
		if (super.anInt5679 != 1 && super.anInt5679 != 2) {
			super.anInt5679 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean458 = arg0.method4463() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean470 = arg0.method4463() == 1;
		}
		if (local21 >= 9) {
			super.anInt5684 = arg0.method4463();
		}
		if (super.anInt5684 < 0 || super.anInt5684 > Static203.method2772(Static144.anInt2437)) {
			super.anInt5684 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean459 = arg0.method4463() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean472 = arg0.method4463() != 0;
		}
		if (local21 >= 12) {
			super.anInt5678 = arg0.method4463();
		}
		if (super.anInt5678 < 0 || super.anInt5678 > 2) {
			super.anInt5678 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean467 = arg0.method4463() == 1;
		}
		if (local21 >= 14) {
			super.anInt5680 = arg0.method4463();
		} else if (local477 == 0) {
			super.anInt5680 = 2;
		} else {
			super.anInt5680 = 1;
		}
		if (super.anInt5680 < 0 || super.anInt5680 > 3) {
			super.anInt5680 = 2;
		}
		if (local21 >= 15) {
			super.anInt5688 = arg0.method4463();
			if (super.anInt5688 < 0 || super.anInt5688 > 4) {
				super.anInt5688 = Static302.anInt5050 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean463 = arg0.method4463() == 1;
		}
		if (local21 < 17 && super.anInt5680 == 0) {
			super.anInt5680 = 2;
		}
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(II)Z")
	public boolean method4438(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean477 ? super.aBoolean464 : true;
	}
}
