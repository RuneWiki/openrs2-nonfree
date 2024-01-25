import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class6_Sub37_Sub1 extends Class6_Sub37 {

	@OriginalMember(owner = "client!nq", name = "pb", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!nq", name = "rb", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!nq", name = "qb", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!nq", name = "nb", descriptor = "Z")
	public boolean aBoolean416 = false;

	@OriginalMember(owner = "client!nq", name = "Ab", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!nq", name = "wb", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!cr;)V")
	public Class6_Sub37_Sub1(@OriginalArg(0) Class57 arg0) {
		super.anInt6063 = 3;
		super.anInt6064 = 3;
		this.method5169(true);
		super.aBoolean405 = true;
		super.anInt6066 = 0;
		super.aBoolean406 = true;
		super.anInt6040 = 2;
		super.aBoolean403 = true;
		super.aBoolean410 = true;
		super.anInt6057 = 0;
		super.anInt6049 = 127;
		super.anInt6047 = 127;
		super.anInt6056 = 127;
		super.anInt6042 = 1;
		super.aBoolean399 = false;
		super.anInt6044 = 0;
		super.anInt6052 = 0;
		super.aBoolean408 = true;
		super.aBoolean396 = true;
		super.aBoolean397 = true;
		super.anInt6060 = 127;
		super.aBoolean402 = true;
		super.aBoolean413 = true;
		super.anInt6058 = 127;
		super.aBoolean400 = true;
		super.anInt6048 = 0;
		if (Static31.anInt551 >= 96) {
			Static186.method2764(2);
		} else {
			Static186.method2764(0);
		}
		super.anInt6045 = 2;
		super.anInt6053 = Static164.anInt2901 == 1 ? 2 : 4;
		super.aBoolean407 = false;
		super.aBoolean409 = true;
		super.aBoolean411 = false;
		super.anInt6046 = 2;
		super.anInt6050 = 0;
		super.anInt6061 = 0;
		super.aBoolean398 = true;
		super.anInt6054 = 0;
		super.aBoolean412 = false;
		@Pc(150) Class133 local150 = null;
		try {
			@Pc(156) Class278 local156 = arg0.method929(true, "");
			while (local156.anInt7757 == 0) {
				Static149.method2211(1L);
			}
			if (local156.anInt7757 == 1) {
				local150 = (Class133) local156.anObject24;
				@Pc(178) byte[] local178 = new byte[(int) local150.method2789()];
				@Pc(192) int local192;
				for (@Pc(180) int local180 = 0; local180 < local178.length; local180 += local192) {
					local192 = local150.method2787(local178, local180, local178.length - local180);
					if (local192 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method5168(new Class6_Sub14(local178));
			}
		} catch (@Pc(222) Exception local222) {
		}
		try {
			if (local150 != null) {
				local150.method2788();
			}
		} catch (@Pc(229) Exception local229) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)I")
	public int method5154() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static152.aClass57_4.aBoolean74 && !Static152.aClass57_4.aBoolean75) {
			if (Static70.aString18.startsWith("win")) {
				if (!Static70.aString15.startsWith("amd64") && !Static70.aString15.startsWith("x86_64")) {
					local7 = true;
				}
				local11 = true;
				local9 = true;
			} else {
				local9 = true;
			}
		}
		if (this.aBoolean418) {
			local9 = false;
		}
		if (this.aBoolean420) {
			local7 = false;
		}
		if (this.aBoolean419) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return this.method5157();
		}
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		if (local7) {
			try {
				local66 = Static137.method2054(2, 1000);
			} catch (@Pc(77) Exception local77) {
			}
		}
		@Pc(80) int local80 = -1;
		if (local11) {
			try {
				local80 = Static137.method2054(3, 1000);
				if (Static567.anInt9503 == 3) {
					@Pc(93) Class282 local93 = Static176.aClass121_5.method7124();
					@Pc(98) long local98 = local93.aLong197 & 0xFFFFFFFFFFFFL;
					@Pc(101) int local101 = local93.anInt7766;
					if (local101 == 4318) {
						local9 &= local98 >= 64425238954L;
					} else if (local101 == 4098) {
						local9 &= local98 >= 60129613779L;
					}
				}
			} catch (@Pc(141) Exception local141) {
			}
		}
		if (local9) {
			try {
				local68 = Static137.method2054(1, 1000);
			} catch (@Pc(151) Exception local151) {
			}
		}
		if (local66 == -1 && local68 == -1 && local80 == -1) {
			return this.method5157();
		}
		local80 = (int) ((float) local80 * 1.1F);
		local68 = (int) ((float) local68 * 1.1F);
		if (local80 < local66 && local68 < local66) {
			return this.method5166(local66);
		} else if (local80 <= local68) {
			return this.method5167(local68, 1);
		} else {
			return this.method5167(local80, 3);
		}
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	public void method5155() {
		this.method5169(true);
		super.aBoolean405 = true;
		super.anInt6048 = super.anInt6052 = 0;
		super.aBoolean400 = true;
		super.aBoolean410 = true;
		super.aBoolean396 = true;
		super.aBoolean401 = true;
		super.aBoolean399 = true;
		super.aBoolean403 = true;
		super.anInt6042 = 1;
		super.aBoolean406 = true;
		super.aBoolean408 = true;
		super.aBoolean413 = true;
		super.anInt6040 = super.anInt6044 = 2;
		super.aBoolean402 = true;
		if (Static31.anInt551 > 95) {
			Static186.method2764(2);
		} else {
			Static186.method2764(0);
		}
		super.anInt6061 = 0;
		super.aBoolean411 = false;
		super.aBoolean409 = true;
		this.method5163();
		this.method5162(0);
		super.anInt6063 = 4;
		Static321.method4977();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)I")
	public int method5156(@OriginalArg(0) int arg0) {
		if (Static542.method7492(arg0) && !Static569.method7793(Static146.anInt2581)) {
			return Static31.anInt551 < 96 && Static256.method3623(arg0) && super.anInt6050 == 0 ? 1 : super.anInt6050;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I")
	private int method5157() {
		@Pc(12) byte local12;
		if (Static31.anInt551 < 96) {
			local12 = 1;
			this.method5170();
		} else {
			@Pc(20) int local20 = Static222.method3235();
			if (local20 <= 100) {
				local12 = 4;
				this.method5155();
			} else if (local20 <= 500) {
				this.method5164();
				local12 = 3;
			} else if (local20 <= 1000) {
				this.method5158();
				local12 = 2;
			} else {
				this.method5170();
				local12 = 1;
			}
		}
		if (Static567.anInt9503 != 0) {
			super.anInt6046 = 0;
			Static360.method5340(0);
		}
		this.method5160(Static152.aClass57_4);
		return local12;
	}

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "(I)V")
	public void method5158() {
		this.method5169(true);
		super.aBoolean413 = false;
		super.aBoolean408 = false;
		super.anInt6042 = 0;
		super.aBoolean405 = false;
		super.anInt6048 = super.anInt6052 = 0;
		super.aBoolean406 = false;
		super.aBoolean410 = false;
		super.anInt6040 = super.anInt6044 = 0;
		super.aBoolean402 = true;
		super.aBoolean403 = false;
		super.aBoolean401 = false;
		super.aBoolean399 = false;
		super.aBoolean396 = false;
		super.aBoolean400 = false;
		Static186.method2764(0);
		super.aBoolean409 = true;
		super.anInt6061 = 0;
		super.aBoolean411 = false;
		this.method5163();
		this.method5162(2);
		super.anInt6063 = 2;
		Static321.method4977();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)I")
	public int method5159(@OriginalArg(1) int arg0) {
		if (this.aBoolean416) {
			return 0;
		} else if (this.method5165(arg0)) {
			return super.aBoolean400 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!cr;)V")
	public void method5160(@OriginalArg(1) Class57 arg0) {
		@Pc(7) Class133 local7 = null;
		try {
			@Pc(13) Class278 local13 = arg0.method929(true, "");
			while (local13.anInt7757 == 0) {
				Static149.method2211(1L);
			}
			if (local13.anInt7757 == 1) {
				local7 = (Class133) local13.anObject24;
				@Pc(39) Class6_Sub14 local39 = new Class6_Sub14(Static186.method2766());
				this.method5146(local39);
				local7.method2786(local39.aByteArray88, 0, local39.anInt7244);
			}
		} catch (@Pc(53) Exception local53) {
		}
		try {
			if (local7 != null) {
				local7.method2788();
			}
		} catch (@Pc(63) Exception local63) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)Z")
	public boolean method5161(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean404 : true;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(ZI)V")
	public void method5162(@OriginalArg(1) int arg0) {
		Static505.aBoolean576 = true;
		Static399.aClass199Array1 = null;
		super.anInt6050 = arg0;
	}

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "(I)V")
	private void method5163() {
		if (Static164.anInt2901 <= 1) {
			super.anInt6053 = 2;
		} else {
			super.anInt6053 = 4;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	public void method5164() {
		this.method5169(true);
		super.aBoolean403 = true;
		super.aBoolean401 = true;
		super.aBoolean410 = true;
		super.aBoolean396 = false;
		super.aBoolean402 = true;
		super.anInt6048 = super.anInt6052 = 0;
		super.aBoolean400 = true;
		super.aBoolean413 = true;
		super.anInt6042 = 1;
		super.aBoolean405 = true;
		super.aBoolean406 = true;
		super.anInt6040 = super.anInt6044 = 1;
		super.aBoolean408 = true;
		super.aBoolean399 = false;
		if (Static31.anInt551 > 95) {
			Static186.method2764(1);
		} else {
			Static186.method2764(0);
		}
		super.anInt6061 = 0;
		super.aBoolean409 = true;
		super.aBoolean411 = false;
		this.method5163();
		this.method5162(1);
		super.anInt6063 = 3;
		Static321.method4977();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)Z")
	public boolean method5165(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean417 ? super.aBoolean404 : true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)I")
	private int method5166(@OriginalArg(1) int arg0) {
		@Pc(32) byte local32;
		if (arg0 > 12000) {
			this.method5155();
			local32 = 4;
		} else if (arg0 > 5000) {
			this.method5164();
			local32 = 3;
		} else if (arg0 > 2000) {
			this.method5158();
			local32 = 2;
		} else {
			local32 = 1;
			this.method5170();
		}
		if (Static567.anInt9503 != 2) {
			super.anInt6046 = 2;
			Static360.method5340(2);
		}
		this.method5160(Static152.aClass57_4);
		return local32;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IBI)I")
	private int method5167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20;
		if (arg0 > 20000) {
			this.method5155();
			local20 = 4;
		} else if (arg0 > 10000) {
			this.method5164();
			local20 = 3;
		} else if (arg0 > 5000) {
			local20 = 2;
			this.method5158();
		} else {
			local20 = 1;
			this.method5170();
		}
		if (arg1 != Static567.anInt9503) {
			super.anInt6046 = arg1;
			Static360.method5340(arg1);
		}
		this.method5160(Static152.aClass57_4);
		return local20;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Lclient!dga;B)V")
	private void method5168(@OriginalArg(0) Class6_Sub14 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt7244 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method6041();
		if (local19 < 0 || local19 > 22) {
			return;
		}
		@Pc(32) byte local32;
		if (local19 == 22) {
			local32 = 45;
		} else if (local19 == 21) {
			local32 = 44;
		} else if (local19 == 20) {
			local32 = 43;
		} else if (local19 == 19) {
			local32 = 42;
		} else if (local19 == 18) {
			local32 = 41;
		} else if (local19 == 17) {
			local32 = 40;
		} else if (local19 == 16) {
			local32 = 38;
		} else if (local19 == 15) {
			local32 = 37;
		} else if (local19 == 14) {
			local32 = 36;
		} else if (local19 == 13) {
			local32 = 35;
		} else if (local19 == 12) {
			local32 = 34;
		} else if (local19 == 11) {
			local32 = 33;
		} else if (local19 == 10) {
			local32 = 32;
		} else if (local19 == 9) {
			local32 = 31;
		} else if (local19 == 8) {
			local32 = 30;
		} else if (local19 == 7) {
			local32 = 29;
		} else if (local19 == 6) {
			local32 = 28;
		} else if (local19 == 5) {
			local32 = 28;
		} else if (local19 == 4) {
			local32 = 24;
		} else if (local19 == 3) {
			local32 = 23;
		} else if (local19 == 2) {
			local32 = 22;
		} else if (local19 == 1) {
			local32 = 23;
		} else {
			local32 = 19;
		}
		if (local32 > arg0.aByteArray88.length - arg0.anInt7244) {
			return;
		}
		super.anInt6064 = arg0.method6041();
		if (super.anInt6064 < 1) {
			super.anInt6064 = 1;
		} else if (super.anInt6064 > 4) {
			super.anInt6064 = 4;
		}
		this.method5169(arg0.method6041() == 1);
		super.aBoolean400 = arg0.method6041() == 1;
		super.aBoolean402 = arg0.method6041() == 1;
		super.aBoolean405 = arg0.method6041() == 1;
		super.anInt6042 = arg0.method6041() == 1 ? 1 : 0;
		super.aBoolean410 = arg0.method6041() == 1;
		super.aBoolean408 = arg0.method6041() == 1;
		super.aBoolean413 = arg0.method6041() == 1;
		super.anInt6040 = arg0.method6041();
		if (super.anInt6040 > 2) {
			super.anInt6040 = 2;
		}
		if (local19 >= 17) {
			super.anInt6044 = arg0.method6041();
		}
		if (local19 < 2) {
			super.aBoolean403 = arg0.method6041() == 1;
			arg0.method6041();
		} else {
			super.aBoolean403 = arg0.method6041() == 1;
			if (local19 >= 17) {
				super.aBoolean399 = arg0.method6041() == 1;
			}
		}
		super.aBoolean396 = arg0.method6041() == 1;
		super.aBoolean406 = arg0.method6041() == 1;
		super.anInt6048 = arg0.method6041();
		if (super.anInt6048 > 2) {
			super.anInt6048 = 2;
		}
		super.anInt6052 = super.anInt6048;
		super.aBoolean397 = arg0.method6041() == 1;
		super.anInt6047 = arg0.method6041();
		if (super.anInt6047 > 127) {
			super.anInt6047 = 127;
		}
		if (local19 >= 20) {
			super.anInt6049 = arg0.method6041();
			if (super.anInt6049 > 127) {
				super.anInt6049 = 127;
			}
		} else {
			super.anInt6049 = super.anInt6047;
		}
		super.anInt6060 = arg0.method6041();
		super.anInt6058 = arg0.method6041();
		if (super.anInt6058 > 127) {
			super.anInt6058 = 127;
		}
		if (local19 < 21) {
			super.anInt6056 = super.anInt6060;
		} else {
			super.anInt6056 = arg0.method6041();
			if (super.anInt6056 > 127) {
				super.anInt6056 = 127;
			}
		}
		if (local19 >= 1) {
			super.anInt6057 = arg0.method6006();
			super.anInt6066 = arg0.method6006();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method6041();
		}
		@Pc(550) int local550;
		if (local19 >= 4) {
			local550 = arg0.method6041();
			if (local550 < 0 || local550 > 2) {
				local550 = 0;
			}
			if (Static31.anInt551 < 96) {
				local550 = 0;
			}
			Static186.method2764(local550);
		}
		if (local19 >= 5) {
			super.anInt6054 = arg0.method6027();
		}
		local550 = 0;
		if (local19 >= 6) {
			super.anInt6045 = local550 = arg0.method6041();
		}
		if (super.anInt6045 != 1 && super.anInt6045 != 2) {
			super.anInt6045 = 2;
		}
		if (local19 >= 7) {
			super.aBoolean407 = arg0.method6041() == 1;
		}
		if (local19 >= 8) {
			super.aBoolean412 = arg0.method6041() == 1;
		}
		if (local19 >= 9) {
			super.anInt6061 = arg0.method6041();
		}
		if (super.anInt6061 < 0 || super.anInt6061 > Static224.method3261(Static31.anInt551)) {
			super.anInt6061 = 0;
		}
		if (local19 >= 10) {
			super.aBoolean411 = arg0.method6041() != 0;
		}
		if (local19 >= 11) {
			super.aBoolean398 = arg0.method6041() != 0;
		}
		if (local19 >= 12) {
			super.anInt6042 = arg0.method6041();
		}
		if (super.anInt6042 < 0 || super.anInt6042 > 2) {
			super.anInt6042 = 1;
		}
		if (local19 >= 13) {
			super.aBoolean409 = arg0.method6041() == 1;
		}
		if (local19 >= 14) {
			super.anInt6046 = arg0.method6041();
		} else if (local550 == 0) {
			super.anInt6046 = 2;
		} else {
			super.anInt6046 = 1;
		}
		if (super.anInt6046 < 0 || super.anInt6046 > 5) {
			super.anInt6046 = 2;
		}
		if (local19 >= 15) {
			super.anInt6053 = arg0.method6041();
			if (super.anInt6053 < 0 || super.anInt6053 > 4) {
				super.anInt6053 = Static164.anInt2901 == 1 ? 2 : 4;
			}
		}
		if (local19 >= 16) {
			super.aBoolean401 = arg0.method6041() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean401 = false;
				}
			} catch (@Pc(827) Throwable local827) {
			}
		}
		if (local19 < 17 && super.anInt6046 == 0) {
			super.anInt6046 = 2;
		}
		if (local19 >= 18) {
			super.anInt6063 = arg0.method6041();
			if (super.anInt6063 < 0 || super.anInt6063 > 4) {
				super.anInt6063 = 0;
			}
		}
		if (local19 >= 19) {
			super.anInt6050 = arg0.method6041();
		} else if (super.anInt6063 == 1 || super.anInt6063 == 2) {
			super.anInt6050 = 2;
		} else if (super.anInt6063 == 3) {
			super.anInt6050 = 1;
		} else {
			super.anInt6050 = 0;
		}
		if (local19 >= 22) {
			super.anInt6062 = arg0.method6041();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V")
	public void method5169(@OriginalArg(0) boolean arg0) {
		super.aBoolean404 = arg0;
		if (Static260.aClass100_1 != null) {
			Static260.aClass100_1.method2007(!this.method5165(Static567.anInt9503));
		}
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)V")
	public void method5170() {
		this.method5169(false);
		super.aBoolean410 = false;
		super.aBoolean396 = false;
		super.anInt6048 = super.anInt6052 = 0;
		super.aBoolean399 = false;
		super.aBoolean413 = false;
		super.aBoolean406 = false;
		super.aBoolean408 = false;
		super.anInt6040 = super.anInt6044 = 0;
		super.aBoolean400 = false;
		super.aBoolean403 = false;
		super.aBoolean405 = false;
		super.anInt6042 = 0;
		super.aBoolean401 = false;
		super.aBoolean402 = false;
		Static186.method2764(0);
		super.aBoolean411 = false;
		super.aBoolean409 = false;
		super.anInt6061 = 0;
		this.method5163();
		this.method5162(2);
		super.anInt6063 = 1;
		Static321.method4977();
	}
}
