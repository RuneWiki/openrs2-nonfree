import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vea", name = "Bb", descriptor = "I")
	public int anInt9322;

	@OriginalMember(owner = "client!vea", name = "Fb", descriptor = "Z")
	public boolean aBoolean666 = false;

	@OriginalMember(owner = "client!vea", name = "Db", descriptor = "Z")
	public boolean aBoolean665 = false;

	@OriginalMember(owner = "client!vea", name = "qb", descriptor = "Z")
	public boolean aBoolean663 = false;

	@OriginalMember(owner = "client!vea", name = "ub", descriptor = "Z")
	public boolean aBoolean664 = false;

	@OriginalMember(owner = "client!vea", name = "kb", descriptor = "Z")
	public boolean aBoolean662 = false;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!ii;)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class161 arg0) {
		super.anInt9299 = 3;
		super.anInt9283 = 3;
		this.method7660(true);
		super.aBoolean654 = true;
		super.anInt9294 = 0;
		super.aBoolean650 = true;
		super.aBoolean655 = false;
		super.anInt9302 = 1;
		super.anInt9278 = 127;
		super.anInt9298 = 127;
		super.aBoolean648 = true;
		super.aBoolean647 = true;
		super.aBoolean644 = true;
		super.aBoolean649 = true;
		super.anInt9279 = 0;
		super.anInt9297 = 0;
		super.aBoolean652 = true;
		super.anInt9305 = 0;
		super.anInt9282 = 127;
		super.anInt9296 = 0;
		super.aBoolean646 = true;
		super.aBoolean656 = true;
		super.anInt9288 = 2;
		super.aBoolean657 = true;
		super.anInt9295 = 127;
		super.anInt9277 = 127;
		if (Static87.anInt2262 < 96) {
			Static46.method736(0);
		} else {
			Static46.method736(2);
		}
		super.aBoolean659 = false;
		super.anInt9285 = 2;
		super.aBoolean651 = false;
		super.aBoolean653 = true;
		super.aBoolean645 = false;
		super.anInt9286 = 0;
		super.anInt9291 = 0;
		super.anInt9303 = 0;
		super.anInt9300 = Static536.anInt9062 == 1 ? 2 : 4;
		super.aBoolean660 = true;
		super.anInt9290 = 2;
		@Pc(148) Class23 local148 = null;
		try {
			@Pc(154) Class299 local154 = arg0.method3815("", true);
			while (local154.anInt7985 == 0) {
				Static55.method845(1L);
			}
			if (local154.anInt7985 == 1) {
				local148 = (Class23) local154.anObject41;
				@Pc(179) byte[] local179 = new byte[(int) local148.method498()];
				@Pc(193) int local193;
				for (@Pc(181) int local181 = 0; local181 < local179.length; local181 += local193) {
					local193 = local148.method492(local179.length - local181, local181, local179);
					if (local193 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method7658(new Class4_Sub9(local179));
			}
		} catch (@Pc(219) Exception local219) {
		}
		try {
			if (local148 != null) {
				local148.method495();
			}
		} catch (@Pc(226) Exception local226) {
		}
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "(II)Z")
	public boolean method7648(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean658 : true;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V")
	public void method7649() {
		this.method7660(true);
		super.aBoolean654 = true;
		super.aBoolean646 = true;
		super.aBoolean649 = true;
		super.anInt9279 = super.anInt9297 = 0;
		super.aBoolean661 = true;
		super.aBoolean652 = true;
		super.aBoolean657 = true;
		super.aBoolean656 = true;
		super.anInt9302 = 1;
		super.aBoolean648 = true;
		super.aBoolean644 = true;
		super.aBoolean647 = true;
		super.anInt9288 = super.anInt9294 = 2;
		super.aBoolean655 = true;
		if (Static87.anInt2262 > 95) {
			Static46.method736(2);
		} else {
			Static46.method736(0);
		}
		super.anInt9286 = 0;
		super.aBoolean645 = false;
		super.aBoolean653 = true;
		this.method7664();
		this.method7650(0);
		super.anInt9283 = 4;
		Static271.method4381();
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "(II)V")
	public void method7650(@OriginalArg(0) int arg0) {
		super.anInt9303 = arg0;
		Static235.aClass242Array1 = null;
		Static179.aBoolean296 = true;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	public void method7651() {
		this.method7660(false);
		super.aBoolean657 = false;
		super.aBoolean655 = false;
		super.aBoolean649 = false;
		super.aBoolean656 = false;
		super.aBoolean652 = false;
		super.aBoolean654 = false;
		super.anInt9302 = 0;
		super.aBoolean647 = false;
		super.anInt9279 = super.anInt9297 = 0;
		super.aBoolean644 = false;
		super.aBoolean646 = false;
		super.aBoolean648 = false;
		super.aBoolean661 = false;
		super.anInt9288 = super.anInt9294 = 0;
		Static46.method736(0);
		super.anInt9286 = 0;
		super.aBoolean645 = false;
		super.aBoolean653 = false;
		this.method7664();
		this.method7650(2);
		super.anInt9283 = 1;
		Static271.method4381();
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(II)Z")
	public boolean method7652(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean663 ? super.aBoolean658 : true;
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	public void method7656() {
		this.method7660(true);
		super.aBoolean647 = false;
		super.aBoolean652 = false;
		super.aBoolean648 = false;
		super.aBoolean654 = false;
		super.aBoolean657 = false;
		super.anInt9302 = 0;
		super.anInt9279 = super.anInt9297 = 0;
		super.aBoolean656 = true;
		super.aBoolean644 = false;
		super.anInt9288 = super.anInt9294 = 0;
		super.aBoolean655 = false;
		super.aBoolean661 = false;
		super.aBoolean649 = false;
		super.aBoolean646 = false;
		Static46.method736(0);
		super.aBoolean645 = false;
		super.aBoolean653 = true;
		super.anInt9286 = 0;
		this.method7664();
		this.method7650(2);
		super.anInt9283 = 2;
		Static271.method4381();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)I")
	public int method7657(@OriginalArg(1) int arg0) {
		if (Static588.method7928(arg0) && !Static388.method5709(Static598.anInt9831)) {
			return Static87.anInt2262 < 96 && Static358.method5266(arg0) && super.anInt9303 == 0 ? 1 : super.anInt9303;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!eh;Z)V")
	private void method7658(@OriginalArg(0) Class4_Sub9 arg0) {
		if (arg0.aByteArray97.length - arg0.anInt7219 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method6015();
		if (local20 < 0 || local20 > 22) {
			return;
		}
		@Pc(39) byte local39;
		if (local20 == 22) {
			local39 = 45;
		} else if (local20 == 21) {
			local39 = 44;
		} else if (local20 == 20) {
			local39 = 43;
		} else if (local20 == 19) {
			local39 = 42;
		} else if (local20 == 18) {
			local39 = 41;
		} else if (local20 == 17) {
			local39 = 40;
		} else if (local20 == 16) {
			local39 = 38;
		} else if (local20 == 15) {
			local39 = 37;
		} else if (local20 == 14) {
			local39 = 36;
		} else if (local20 == 13) {
			local39 = 35;
		} else if (local20 == 12) {
			local39 = 34;
		} else if (local20 == 11) {
			local39 = 33;
		} else if (local20 == 10) {
			local39 = 32;
		} else if (local20 == 9) {
			local39 = 31;
		} else if (local20 == 8) {
			local39 = 30;
		} else if (local20 == 7) {
			local39 = 29;
		} else if (local20 == 6) {
			local39 = 28;
		} else if (local20 == 5) {
			local39 = 28;
		} else if (local20 == 4) {
			local39 = 24;
		} else if (local20 == 3) {
			local39 = 23;
		} else if (local20 == 2) {
			local39 = 22;
		} else if (local20 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (arg0.aByteArray97.length - arg0.anInt7219 < local39) {
			return;
		}
		super.anInt9299 = arg0.method6015();
		if (super.anInt9299 < 1) {
			super.anInt9299 = 1;
		} else if (super.anInt9299 > 4) {
			super.anInt9299 = 4;
		}
		this.method7660(arg0.method6015() == 1);
		super.aBoolean646 = arg0.method6015() == 1;
		super.aBoolean656 = arg0.method6015() == 1;
		super.aBoolean647 = arg0.method6015() == 1;
		super.anInt9302 = arg0.method6015() == 1 ? 1 : 0;
		super.aBoolean652 = arg0.method6015() == 1;
		super.aBoolean644 = arg0.method6015() == 1;
		super.aBoolean649 = arg0.method6015() == 1;
		super.anInt9288 = arg0.method6015();
		if (super.anInt9288 > 2) {
			super.anInt9288 = 2;
		}
		if (local20 >= 17) {
			super.anInt9294 = arg0.method6015();
		}
		if (local20 < 2) {
			super.aBoolean654 = arg0.method6015() == 1;
			arg0.method6015();
		} else {
			super.aBoolean654 = arg0.method6015() == 1;
			if (local20 >= 17) {
				super.aBoolean655 = arg0.method6015() == 1;
			}
		}
		super.aBoolean648 = arg0.method6015() == 1;
		super.aBoolean657 = arg0.method6015() == 1;
		super.anInt9279 = arg0.method6015();
		if (super.anInt9279 > 2) {
			super.anInt9279 = 2;
		}
		super.anInt9297 = super.anInt9279;
		super.aBoolean650 = arg0.method6015() == 1;
		super.anInt9298 = arg0.method6015();
		if (super.anInt9298 > 127) {
			super.anInt9298 = 127;
		}
		if (local20 < 20) {
			super.anInt9282 = super.anInt9298;
		} else {
			super.anInt9282 = arg0.method6015();
			if (super.anInt9282 > 127) {
				super.anInt9282 = 127;
			}
		}
		super.anInt9295 = arg0.method6015();
		super.anInt9277 = arg0.method6015();
		if (super.anInt9277 > 127) {
			super.anInt9277 = 127;
		}
		if (local20 >= 21) {
			super.anInt9278 = arg0.method6015();
			if (super.anInt9278 > 127) {
				super.anInt9278 = 127;
			}
		} else {
			super.anInt9278 = super.anInt9295;
		}
		if (local20 >= 1) {
			super.anInt9305 = arg0.method5982();
			super.anInt9296 = arg0.method5982();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method6015();
		}
		@Pc(558) int local558;
		if (local20 >= 4) {
			local558 = arg0.method6015();
			if (local558 < 0 || local558 > 2) {
				local558 = 0;
			}
			if (Static87.anInt2262 < 96) {
				local558 = 0;
			}
			Static46.method736(local558);
		}
		if (local20 >= 5) {
			super.anInt9291 = arg0.method6026();
		}
		local558 = 0;
		if (local20 >= 6) {
			super.anInt9290 = local558 = arg0.method6015();
		}
		if (super.anInt9290 != 1 && super.anInt9290 != 2) {
			super.anInt9290 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean659 = arg0.method6015() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean651 = arg0.method6015() == 1;
		}
		if (local20 >= 9) {
			super.anInt9286 = arg0.method6015();
		}
		if (super.anInt9286 < 0 || super.anInt9286 > Static437.method6209(Static87.anInt2262)) {
			super.anInt9286 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean645 = arg0.method6015() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean660 = arg0.method6015() != 0;
		}
		if (local20 >= 12) {
			super.anInt9302 = arg0.method6015();
		}
		if (super.anInt9302 < 0 || super.anInt9302 > 2) {
			super.anInt9302 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean653 = arg0.method6015() == 1;
		}
		if (local20 >= 14) {
			super.anInt9285 = arg0.method6015();
		} else if (local558 == 0) {
			super.anInt9285 = 2;
		} else {
			super.anInt9285 = 1;
		}
		if (super.anInt9285 < 0 || super.anInt9285 > 5) {
			super.anInt9285 = 2;
		}
		if (local20 >= 15) {
			super.anInt9300 = arg0.method6015();
			if (super.anInt9300 < 0 || super.anInt9300 > 4) {
				super.anInt9300 = Static536.anInt9062 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean661 = arg0.method6015() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean661 = false;
				}
			} catch (@Pc(830) Throwable local830) {
			}
		}
		if (local20 < 17 && super.anInt9285 == 0) {
			super.anInt9285 = 2;
		}
		if (local20 >= 18) {
			super.anInt9283 = arg0.method6015();
			if (super.anInt9283 < 0 || super.anInt9283 > 4) {
				super.anInt9283 = 0;
			}
		}
		if (local20 >= 19) {
			super.anInt9303 = arg0.method6015();
		} else if (super.anInt9283 == 1 || super.anInt9283 == 2) {
			super.anInt9303 = 2;
		} else if (super.anInt9283 == 3) {
			super.anInt9303 = 1;
		} else {
			super.anInt9303 = 0;
		}
		if (local20 >= 22) {
			super.anInt9289 = arg0.method6015();
		}
		if (super.anInt9285 == 0 && Static87.anInt2262 < 96 && super.anInt9283 != 1 && super.anInt9283 != 0) {
			this.method7651();
		}
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V")
	public void method7659() {
		this.method7660(true);
		super.anInt9288 = super.anInt9294 = 1;
		super.anInt9302 = 1;
		super.aBoolean657 = true;
		super.aBoolean654 = true;
		super.aBoolean646 = true;
		super.aBoolean649 = true;
		super.aBoolean655 = false;
		super.aBoolean661 = true;
		super.aBoolean644 = true;
		super.aBoolean648 = false;
		super.aBoolean647 = true;
		super.anInt9279 = super.anInt9297 = 0;
		super.aBoolean656 = true;
		super.aBoolean652 = true;
		if (Static87.anInt2262 <= 95) {
			Static46.method736(0);
		} else {
			Static46.method736(1);
		}
		super.aBoolean645 = false;
		super.aBoolean653 = true;
		super.anInt9286 = 0;
		this.method7664();
		this.method7650(1);
		super.anInt9283 = 3;
		Static271.method4381();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZB)V")
	public void method7660(@OriginalArg(0) boolean arg0) {
		super.aBoolean658 = arg0;
		if (Static553.aClass288_4 != null) {
			Static553.aClass288_4.method6421(!this.method7652(Static403.anInt6994));
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!ii;)V")
	public void method7661(@OriginalArg(1) Class161 arg0) {
		@Pc(15) Class23 local15 = null;
		try {
			@Pc(21) Class299 local21 = arg0.method3815("", true);
			while (local21.anInt7985 == 0) {
				Static55.method845(1L);
			}
			if (local21.anInt7985 == 1) {
				local15 = (Class23) local21.anObject41;
				@Pc(43) Class4_Sub9 local43 = new Class4_Sub9(Static12.method272());
				this.method7639(local43);
				local15.method496(0, local43.aByteArray97, local43.anInt7219);
			}
		} catch (@Pc(57) Exception local57) {
		}
		try {
			if (local15 != null) {
				local15.method495();
			}
		} catch (@Pc(64) Exception local64) {
		}
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(Z)I")
	public int method7662() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static147.aClass161_4.aBoolean344 && !Static147.aClass161_4.aBoolean345) {
			if (Static222.aString49.startsWith("win")) {
				local9 = true;
				local11 = true;
				if (!Static222.aString52.startsWith("amd64") && !Static222.aString52.startsWith("x86_64")) {
					local7 = true;
				}
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean665) {
			local9 = false;
		}
		if (this.aBoolean662) {
			local11 = false;
		}
		if (this.aBoolean664) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method7665();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		if (local7) {
			try {
				local66 = Static279.method4429(1000, 2);
			} catch (@Pc(79) Exception local79) {
			}
		}
		if (local11) {
			try {
				local70 = Static279.method4429(1000, 3);
				if (Static403.anInt6994 == 3) {
					@Pc(93) Class105 local93 = Static185.aClass66_14.method6836();
					@Pc(98) long local98 = local93.aLong72 & 0xFFFFFFFFFFFFL;
					@Pc(101) int local101 = local93.anInt3145;
					if (local101 == 4318) {
						local9 &= local98 >= 64425238954L;
					} else if (local101 == 4098) {
						local9 &= local98 >= 60129613779L;
					}
				}
			} catch (@Pc(135) Exception local135) {
			}
		}
		if (local9) {
			try {
				local68 = Static279.method4429(1000, 1);
			} catch (@Pc(145) Exception local145) {
			}
		}
		if (local66 == -1 && local68 == -1 && local70 == -1) {
			return this.method7665();
		}
		local68 = (int) ((float) local68 * 1.1F);
		local70 = (int) ((float) local70 * 1.1F);
		if (local70 < local66 && local68 < local66) {
			return this.method7663(local66);
		} else if (local68 >= local70) {
			return this.method7666(local68, 1);
		} else {
			return this.method7666(local70, 3);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZ)I")
	private int method7663(@OriginalArg(0) int arg0) {
		@Pc(23) byte local23;
		if (arg0 > 12000) {
			this.method7649();
			local23 = 4;
		} else if (arg0 > 5000) {
			local23 = 3;
			this.method7659();
		} else if (arg0 > 2000) {
			this.method7656();
			local23 = 2;
		} else {
			this.method7651();
			local23 = 1;
		}
		if (Static403.anInt6994 != 2) {
			super.anInt9285 = 2;
			Static8.method7640(2);
		}
		this.method7661(Static147.aClass161_4);
		return local23;
	}

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "(I)V")
	private void method7664() {
		if (Static536.anInt9062 <= 1) {
			super.anInt9300 = 2;
		} else {
			super.anInt9300 = 4;
		}
	}

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "(I)I")
	private int method7665() {
		@Pc(34) byte local34;
		if (Static87.anInt2262 >= 96) {
			@Pc(19) int local19 = Static437.method6210();
			if (local19 <= 100) {
				this.method7649();
				local34 = 4;
			} else if (local19 <= 500) {
				this.method7659();
				local34 = 3;
			} else if (local19 <= 1000) {
				local34 = 2;
				this.method7656();
			} else {
				local34 = 1;
				this.method7651();
			}
		} else {
			local34 = 1;
			this.method7651();
		}
		if (Static403.anInt6994 != 0) {
			super.anInt9285 = 0;
			Static8.method7640(0);
		}
		this.method7661(Static147.aClass161_4);
		return local34;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(III)I")
	private int method7666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte local13;
		if (arg0 > 20000) {
			this.method7649();
			local13 = 4;
		} else if (arg0 > 10000) {
			local13 = 3;
			this.method7659();
		} else if (arg0 <= 5000) {
			this.method7651();
			local13 = 1;
		} else {
			this.method7656();
			local13 = 2;
		}
		if (Static403.anInt6994 != arg1) {
			super.anInt9285 = arg1;
			Static8.method7640(arg1);
		}
		this.method7661(Static147.aClass161_4);
		return local13;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(BI)I")
	public int method7667(@OriginalArg(1) int arg0) {
		if (this.aBoolean666) {
			return 0;
		} else if (this.method7652(arg0)) {
			return super.aBoolean646 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
