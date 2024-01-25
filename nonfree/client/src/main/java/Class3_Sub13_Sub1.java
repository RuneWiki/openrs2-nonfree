import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!ko", name = "Kb", descriptor = "I")
	public int anInt5181;

	@OriginalMember(owner = "client!ko", name = "pb", descriptor = "Z")
	public boolean aBoolean415 = false;

	@OriginalMember(owner = "client!ko", name = "Fb", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!ko", name = "Bb", descriptor = "Z")
	public boolean aBoolean416 = false;

	@OriginalMember(owner = "client!ko", name = "Cb", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ko", name = "Nb", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) Class221 arg0) {
		super.anInt5148 = 3;
		super.anInt5149 = 3;
		this.method4479(true);
		super.aBoolean406 = true;
		super.anInt5135 = 127;
		super.aBoolean399 = true;
		super.anInt5152 = 0;
		super.anInt5156 = 2;
		super.anInt5131 = 127;
		super.anInt5155 = 0;
		super.anInt5139 = 127;
		super.aBoolean398 = true;
		super.aBoolean411 = true;
		super.anInt5158 = 0;
		super.aBoolean413 = true;
		super.anInt5153 = 127;
		super.aBoolean414 = false;
		super.aBoolean404 = true;
		super.anInt5145 = 0;
		super.anInt5159 = 0;
		super.aBoolean400 = true;
		super.aBoolean403 = true;
		super.aBoolean409 = true;
		super.aBoolean402 = true;
		super.anInt5154 = 127;
		super.anInt5133 = 1;
		if (Static597.anInt9433 < 96) {
			Static75.method1683(0);
		} else {
			Static75.method1683(2);
		}
		super.lb = false;
		super.anInt5151 = 2;
		super.anInt5137 = 0;
		super.anInt5161 = 0;
		super.anInt5150 = 0;
		super.anInt5130 = 2;
		super.aBoolean405 = true;
		super.anInt5162 = Static142.anInt3029 == 1 ? 2 : 4;
		super.aBoolean412 = true;
		super.aBoolean408 = false;
		super.aBoolean407 = false;
		@Pc(148) Class235 local148 = null;
		try {
			@Pc(154) Class192 local154 = arg0.method5200("", true);
			while (local154.anInt5186 == 0) {
				Static374.method5521(1L);
			}
			if (local154.anInt5186 == 1) {
				local148 = (Class235) local154.anObject30;
				@Pc(176) byte[] local176 = new byte[(int) local148.method5483()];
				@Pc(191) int local191;
				for (@Pc(178) int local178 = 0; local178 < local176.length; local178 += local191) {
					local191 = local148.method5490(local176, local178, local176.length - local178);
					if (local191 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4482(new Class3_Sub11(local176));
			}
		} catch (@Pc(216) Exception local216) {
		}
		try {
			if (local148 != null) {
				local148.method5488();
			}
		} catch (@Pc(223) Exception local223) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4466() {
		this.method4479(true);
		super.aBoolean413 = true;
		super.aBoolean409 = false;
		super.aBoolean414 = false;
		super.anInt5133 = 0;
		super.anInt5145 = super.anInt5159 = 0;
		super.aBoolean403 = false;
		super.aBoolean398 = false;
		super.aBoolean400 = false;
		super.aBoolean410 = false;
		super.aBoolean404 = false;
		super.aBoolean402 = false;
		super.aBoolean406 = false;
		super.aBoolean399 = false;
		super.anInt5156 = super.anInt5152 = 0;
		Static75.method1683(0);
		super.anInt5161 = 0;
		super.aBoolean408 = false;
		super.aBoolean412 = true;
		this.method4472();
		this.method4477(2);
		super.anInt5149 = 2;
		Static385.method5693();
		Static578.method7669();
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
	public void method4468() {
		this.method4479(true);
		super.aBoolean398 = true;
		super.aBoolean403 = true;
		super.aBoolean400 = true;
		super.aBoolean409 = true;
		super.aBoolean414 = false;
		super.aBoolean404 = false;
		super.anInt5156 = super.anInt5152 = 1;
		super.anInt5133 = 1;
		super.aBoolean413 = true;
		super.aBoolean399 = true;
		super.anInt5145 = super.anInt5159 = 0;
		super.aBoolean406 = true;
		super.aBoolean410 = true;
		super.aBoolean402 = true;
		if (Static597.anInt9433 <= 95) {
			Static75.method1683(0);
		} else {
			Static75.method1683(1);
		}
		super.aBoolean412 = true;
		super.anInt5161 = 0;
		super.aBoolean408 = false;
		this.method4472();
		this.method4477(1);
		super.anInt5149 = 3;
		Static385.method5693();
		Static578.method7669();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
	public void method4469(@OriginalArg(1) boolean arg0) {
		this.method4479(false);
		super.aBoolean404 = false;
		super.aBoolean406 = false;
		super.anInt5145 = super.anInt5159 = 0;
		super.aBoolean400 = false;
		super.aBoolean398 = false;
		super.aBoolean409 = false;
		super.aBoolean410 = false;
		super.aBoolean399 = false;
		super.anInt5156 = super.anInt5152 = 0;
		super.aBoolean403 = false;
		super.aBoolean413 = false;
		super.aBoolean402 = false;
		super.aBoolean414 = false;
		super.anInt5133 = 0;
		Static75.method1683(0);
		super.aBoolean408 = false;
		super.aBoolean412 = false;
		super.anInt5161 = 0;
		this.method4472();
		this.method4477(2);
		super.anInt5149 = 1;
		if (arg0) {
			Static385.method5693();
		}
		Static578.method7669();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!n;B)V")
	public void method4470(@OriginalArg(0) Class221 arg0) {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(13) Class192 local13 = arg0.method5200("", true);
			while (local13.anInt5186 == 0) {
				Static374.method5521(1L);
			}
			if (local13.anInt5186 == 1) {
				local7 = (Class235) local13.anObject30;
				@Pc(37) Class3_Sub11 local37 = new Class3_Sub11(Static551.method7383());
				this.method4462(local37);
				local7.method5486(local37.aByteArray36, local37.anInt3520, 0);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local7 != null) {
				local7.method5488();
			}
		} catch (@Pc(66) Exception local66) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)Z")
	public boolean method4471(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean401 : true;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	private void method4472() {
		if (Static142.anInt3029 <= 1) {
			super.anInt5162 = 2;
		} else {
			super.anInt5162 = 4;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)I")
	private int method4474(@OriginalArg(0) int arg0) {
		@Pc(12) byte local12;
		if (arg0 > 12000) {
			local12 = 4;
			this.method4475();
		} else if (arg0 > 5000) {
			local12 = 3;
			this.method4468();
		} else if (arg0 > 2000) {
			local12 = 2;
			this.method4466();
		} else {
			this.method4469(true);
			local12 = 1;
		}
		if (Static260.anInt4932 != 2) {
			super.anInt5130 = 2;
			Static137.method2648(2);
		}
		this.method4470(Static409.aClass221_6);
		return local12;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	public void method4475() {
		this.method4479(true);
		super.aBoolean404 = true;
		super.anInt5156 = super.anInt5152 = 2;
		super.aBoolean402 = true;
		super.aBoolean413 = true;
		super.aBoolean414 = true;
		super.anInt5133 = 1;
		super.aBoolean399 = true;
		super.aBoolean409 = true;
		super.aBoolean406 = true;
		super.aBoolean398 = true;
		super.aBoolean403 = true;
		super.aBoolean400 = true;
		super.aBoolean410 = true;
		super.anInt5145 = super.anInt5159 = 0;
		if (Static597.anInt9433 <= 95) {
			Static75.method1683(0);
		} else {
			Static75.method1683(2);
		}
		super.aBoolean408 = false;
		super.anInt5161 = 0;
		super.aBoolean412 = true;
		this.method4472();
		this.method4477(0);
		super.anInt5149 = 4;
		Static385.method5693();
		Static578.method7669();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIB)I")
	private int method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(24) byte local24;
		if (arg1 > 20000) {
			this.method4475();
			local24 = 4;
		} else if (arg1 > 10000) {
			this.method4468();
			local24 = 3;
		} else if (arg1 <= 5000) {
			local24 = 1;
			this.method4469(true);
		} else {
			this.method4466();
			local24 = 2;
		}
		if (arg0 != Static260.anInt4932) {
			super.anInt5130 = arg0;
			Static137.method2648(arg0);
		}
		this.method4470(Static409.aClass221_6);
		return local24;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)V")
	public void method4477(@OriginalArg(0) int arg0) {
		super.anInt5137 = arg0;
		Static14.aBoolean20 = true;
		Static182.aClass54Array1 = null;
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)I")
	public int method4478() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static409.aClass221_6.aBoolean485 && !Static409.aClass221_6.aBoolean483) {
			if (Static342.aString82.startsWith("win")) {
				local11 = true;
				if (!Static342.aString85.startsWith("amd64") && !Static342.aString85.startsWith("x86_64")) {
					local7 = true;
				}
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean418) {
			local11 = false;
		}
		if (this.aBoolean415) {
			local9 = false;
		}
		if (this.aBoolean419) {
			local7 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method4480();
		}
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		@Pc(75) int local75 = -1;
		if (local7) {
			try {
				local71 = Static109.method2274(2, 1000);
			} catch (@Pc(84) Exception local84) {
			}
		}
		if (local11) {
			try {
				local75 = Static109.method2274(3, 1000);
				if (Static260.anInt4932 == 3) {
					@Pc(98) Class216 local98 = Static4.aClass43_1.method7186();
					@Pc(103) long local103 = local98.aLong168 & 0xFFFFFFFFFFFFL;
					@Pc(106) int local106 = local98.anInt5947;
					if (local106 == 4318) {
						local9 &= local103 >= 64425238954L;
					} else if (local106 == 4098) {
						local9 &= local103 >= 60129613779L;
					}
				}
			} catch (@Pc(142) Exception local142) {
			}
		}
		if (local9) {
			try {
				local73 = Static109.method2274(1, 1000);
			} catch (@Pc(152) Exception local152) {
			}
		}
		if (local71 == -1 && local73 == -1 && local75 == -1) {
			return this.method4480();
		}
		local73 = (int) ((float) local73 * 1.1F);
		local75 = (int) ((float) local75 * 1.1F);
		if (local75 < local71 && local73 < local71) {
			return this.method4474(local71);
		} else if (local73 >= local75) {
			return this.method4476(1, local73);
		} else {
			return this.method4476(3, local75);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BZ)V")
	public void method4479(@OriginalArg(1) boolean arg0) {
		super.aBoolean401 = arg0;
		if (Static476.aClass69_5 != null) {
			Static476.aClass69_5.method2178(!this.method4485(Static260.anInt4932));
		}
	}

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "(I)I")
	private int method4480() {
		@Pc(12) byte local12;
		if (Static597.anInt9433 < 96) {
			local12 = 1;
			this.method4469(true);
		} else {
			@Pc(21) int local21 = Static493.method5819();
			if (local21 <= 100) {
				local12 = 4;
				this.method4475();
			} else if (local21 <= 500) {
				local12 = 3;
				this.method4468();
			} else if (local21 > 1000) {
				local12 = 1;
				this.method4469(true);
			} else {
				local12 = 2;
				this.method4466();
			}
		}
		if (Static260.anInt4932 != 0) {
			super.anInt5130 = 0;
			Static137.method2648(0);
		}
		this.method4470(Static409.aClass221_6);
		return local12;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(BI)I")
	public int method4481(@OriginalArg(1) int arg0) {
		if (this.aBoolean416) {
			return 0;
		} else if (this.method4485(arg0)) {
			return super.aBoolean403 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!qh;)V")
	private void method4482(@OriginalArg(1) Class3_Sub11 arg0) {
		if (arg0.aByteArray36.length - arg0.anInt3520 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method3118();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(37) byte local37;
		if (local21 == 22) {
			local37 = 45;
		} else if (local21 == 21) {
			local37 = 44;
		} else if (local21 == 20) {
			local37 = 43;
		} else if (local21 == 19) {
			local37 = 42;
		} else if (local21 == 18) {
			local37 = 41;
		} else if (local21 == 17) {
			local37 = 40;
		} else if (local21 == 16) {
			local37 = 38;
		} else if (local21 == 15) {
			local37 = 37;
		} else if (local21 == 14) {
			local37 = 36;
		} else if (local21 == 13) {
			local37 = 35;
		} else if (local21 == 12) {
			local37 = 34;
		} else if (local21 == 11) {
			local37 = 33;
		} else if (local21 == 10) {
			local37 = 32;
		} else if (local21 == 9) {
			local37 = 31;
		} else if (local21 == 8) {
			local37 = 30;
		} else if (local21 == 7) {
			local37 = 29;
		} else if (local21 == 6) {
			local37 = 28;
		} else if (local21 == 5) {
			local37 = 28;
		} else if (local21 == 4) {
			local37 = 24;
		} else if (local21 == 3) {
			local37 = 23;
		} else if (local21 == 2) {
			local37 = 22;
		} else if (local21 == 1) {
			local37 = 23;
		} else {
			local37 = 19;
		}
		if (arg0.aByteArray36.length - arg0.anInt3520 < local37) {
			return;
		}
		super.anInt5148 = arg0.method3118();
		if (super.anInt5148 < 1) {
			super.anInt5148 = 1;
		} else if (super.anInt5148 > 4) {
			super.anInt5148 = 4;
		}
		this.method4479(arg0.method3118() == 1);
		super.aBoolean403 = arg0.method3118() == 1;
		super.aBoolean413 = arg0.method3118() == 1;
		super.aBoolean409 = arg0.method3118() == 1;
		super.anInt5133 = arg0.method3118() == 1 ? 1 : 0;
		super.aBoolean402 = arg0.method3118() == 1;
		super.aBoolean398 = arg0.method3118() == 1;
		super.aBoolean400 = arg0.method3118() == 1;
		super.anInt5156 = arg0.method3118();
		if (super.anInt5156 > 2) {
			super.anInt5156 = 2;
		}
		if (local21 >= 17) {
			super.anInt5152 = arg0.method3118();
		}
		if (local21 >= 2) {
			super.aBoolean406 = arg0.method3118() == 1;
			if (local21 >= 17) {
				super.aBoolean414 = arg0.method3118() == 1;
			}
		} else {
			super.aBoolean406 = arg0.method3118() == 1;
			arg0.method3118();
		}
		super.aBoolean404 = arg0.method3118() == 1;
		super.aBoolean399 = arg0.method3118() == 1;
		super.anInt5145 = arg0.method3118();
		if (super.anInt5145 > 2) {
			super.anInt5145 = 2;
		}
		super.anInt5159 = super.anInt5145;
		super.aBoolean411 = arg0.method3118() == 1;
		super.anInt5153 = arg0.method3118();
		if (super.anInt5153 > 127) {
			super.anInt5153 = 127;
		}
		if (local21 >= 20) {
			super.anInt5135 = arg0.method3118();
			if (super.anInt5135 > 127) {
				super.anInt5135 = 127;
			}
		} else {
			super.anInt5135 = super.anInt5153;
		}
		super.anInt5154 = arg0.method3118();
		super.anInt5139 = arg0.method3118();
		if (super.anInt5139 > 127) {
			super.anInt5139 = 127;
		}
		if (local21 < 21) {
			super.anInt5131 = super.anInt5154;
		} else {
			super.anInt5131 = arg0.method3118();
			if (super.anInt5131 > 127) {
				super.anInt5131 = 127;
			}
		}
		if (local21 >= 1) {
			super.anInt5155 = arg0.method3109();
			super.anInt5158 = arg0.method3109();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method3118();
		}
		@Pc(566) int local566;
		if (local21 >= 4) {
			local566 = arg0.method3118();
			if (local566 < 0 || local566 > 2) {
				local566 = 0;
			}
			if (Static597.anInt9433 < 96) {
				local566 = 0;
			}
			Static75.method1683(local566);
		}
		if (local21 >= 5) {
			super.anInt5150 = arg0.method3116();
		}
		local566 = 0;
		if (local21 >= 6) {
			super.anInt5151 = local566 = arg0.method3118();
		}
		if (super.anInt5151 != 1 && super.anInt5151 != 2) {
			super.anInt5151 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean407 = arg0.method3118() == 1;
		}
		if (local21 >= 8) {
			super.lb = arg0.method3118() == 1;
		}
		if (local21 >= 9) {
			super.anInt5161 = arg0.method3118();
		}
		if (super.anInt5161 < 0 || super.anInt5161 > Static462.method6403(Static597.anInt9433)) {
			super.anInt5161 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean408 = arg0.method3118() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean405 = arg0.method3118() != 0;
		}
		if (local21 >= 12) {
			super.anInt5133 = arg0.method3118();
		}
		if (super.anInt5133 < 0 || super.anInt5133 > 2) {
			super.anInt5133 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean412 = arg0.method3118() == 1;
		}
		if (local21 >= 14) {
			super.anInt5130 = arg0.method3118();
		} else if (local566 == 0) {
			super.anInt5130 = 2;
		} else {
			super.anInt5130 = 1;
		}
		if (super.anInt5130 < 0 || super.anInt5130 > 5) {
			super.anInt5130 = 2;
		}
		if (local21 >= 15) {
			super.anInt5162 = arg0.method3118();
			if (super.anInt5162 < 0 || super.anInt5162 > 4) {
				super.anInt5162 = Static142.anInt3029 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean410 = arg0.method3118() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean410 = false;
				}
			} catch (@Pc(841) Throwable local841) {
			}
		}
		if (local21 < 17 && super.anInt5130 == 0) {
			super.anInt5130 = 2;
		}
		if (local21 >= 18) {
			super.anInt5149 = arg0.method3118();
			if (super.anInt5149 < 0 || super.anInt5149 > 4) {
				super.anInt5149 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt5137 = arg0.method3118();
		} else if (super.anInt5149 == 1 || super.anInt5149 == 2) {
			super.anInt5137 = 2;
		} else if (super.anInt5149 == 3) {
			super.anInt5137 = 1;
		} else {
			super.anInt5137 = 0;
		}
		if (local21 >= 22) {
			super.anInt5134 = arg0.method3118();
		}
		if (super.anInt5130 == 0 && Static597.anInt9433 < 96 && super.anInt5149 != 1 && super.anInt5149 != 0) {
			this.method4469(false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(BI)I")
	public int method4483(@OriginalArg(1) int arg0) {
		if (Static107.method5738(arg0) && !Static276.method4414(Static246.anInt4542)) {
			return Static597.anInt9433 < 96 && Static345.method5249(arg0) && super.anInt5137 == 0 ? 1 : super.anInt5137;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)Z")
	public boolean method4485(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean417 ? super.aBoolean401 : true;
	}
}
