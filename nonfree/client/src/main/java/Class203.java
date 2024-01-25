import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class203 {

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!ov;")
	public Class281 aClass281_1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
	private int anInt5526 = 0;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	private int anInt5534 = 128;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "B")
	public byte aByte89 = 0;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	private int anInt5529 = -1;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	public int anInt5538 = -1;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private int anInt5537 = 128;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	private int anInt5525 = 0;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private int anInt5539 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method5001(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5527 = arg0.method7717(-1978450544);
		} else if (arg1 == 2) {
			this.anInt5538 = arg0.method7717(-1978450544);
		} else if (arg1 == 4) {
			this.anInt5537 = arg0.method7717(-1978450544);
		} else if (arg1 == 5) {
			this.anInt5534 = arg0.method7717(-1978450544);
		} else if (arg1 == 6) {
			this.anInt5539 = arg0.method7717(-1978450544);
		} else if (arg1 == 7) {
			this.anInt5525 = arg0.method7695(111);
		} else if (arg1 == 8) {
			this.anInt5526 = arg0.method7695(104);
		} else if (arg1 == 9) {
			this.anInt5529 = 8224;
			this.aByte89 = 3;
		} else if (arg1 == 10) {
			this.aBoolean402 = true;
		} else if (arg1 == 11) {
			this.aByte89 = 1;
		} else if (arg1 == 12) {
			this.aByte89 = 4;
		} else if (arg1 == 13) {
			this.aByte89 = 5;
		} else if (arg1 == 14) {
			this.aByte89 = 2;
			this.anInt5529 = arg0.method7695(101) * 256;
		} else if (arg1 == 15) {
			this.aByte89 = 3;
			this.anInt5529 = arg0.method7717(-1978450544);
		} else if (arg1 == 16) {
			this.aByte89 = 3;
			this.anInt5529 = arg0.method7748();
		} else {
			@Pc(129) int local129;
			@Pc(139) int local139;
			if (arg1 == 40) {
				local129 = arg0.method7695(126);
				this.aShortArray67 = new short[local129];
				this.aShortArray69 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray69[local139] = (short) arg0.method7717(-1978450544);
					this.aShortArray67[local139] = (short) arg0.method7717(-1978450544);
				}
				return;
			}
			if (arg1 == 41) {
				local129 = arg0.method7695(107);
				this.aShortArray68 = new short[local129];
				this.aShortArray70 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray70[local139] = (short) arg0.method7717(-1978450544);
					this.aShortArray68[local139] = (short) arg0.method7717(-1978450544);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBILclient!ha;Lclient!jaa;)Lclient!ka;")
	public Class129 method5003(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) Class181 arg3) {
		return this.method5005(arg0, arg1, 0, 0, arg3, (Class159) null, false, 0, (Class159) null, arg2);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IBIILclient!jaa;Lclient!s;ZIBLclient!s;Lclient!ha;)Lclient!ka;")
	public Class129 method5005(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) Class159 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class159 arg8, @OriginalArg(10) Class144 arg9) {
		@Pc(15) boolean local15 = arg6 & this.aByte89 != 0;
		@Pc(17) int local17 = arg0;
		if (arg4 != null) {
			local17 = arg0 | arg4.method8947();
		}
		if (local15) {
			local17 |= this.aByte89 == 3 ? 7 : 2;
		}
		if (this.anInt5534 != 128) {
			local17 |= 0x2;
		}
		if (this.anInt5537 != 128 || this.anInt5539 != 0) {
			local17 |= 0x5;
		}
		@Pc(70) Class317 local70 = this.aClass281_1.aClass317_53;
		@Pc(90) Class129 local90;
		synchronized (this.aClass281_1.aClass317_53) {
			local90 = (Class129) this.aClass281_1.aClass317_53.method7882((long) (this.anInt5532 |= arg9.anInt7839 << 29));
		}
		if (local90 == null || arg9.method6967(local90.ua(), local17) != 0) {
			if (local90 != null) {
				local17 = arg9.method6937(local17, local90.ua());
			}
			@Pc(126) int local126 = local17;
			if (this.aShortArray69 != null) {
				local126 = local17 | 0x4000;
			}
			if (this.aShortArray70 != null) {
				local126 |= 0x8000;
			}
			@Pc(149) Class72 local149 = Static227.method3839(this.aClass281_1.aClass310_98, this.anInt5527);
			if (local149 == null) {
				return null;
			}
			if (local149.anInt1744 < 13) {
				local149.method1689();
			}
			local90 = arg9.method6908(local149, local126, this.aClass281_1.anInt7543, this.anInt5525 + 64, this.anInt5526 + 850);
			@Pc(185) int local185;
			if (this.aShortArray69 != null) {
				for (local185 = 0; local185 < this.aShortArray69.length; local185++) {
					local90.ia(this.aShortArray69[local185], this.aShortArray67[local185]);
				}
			}
			if (this.aShortArray70 != null) {
				for (local185 = 0; local185 < this.aShortArray70.length; local185++) {
					local90.aa(this.aShortArray70[local185], this.aShortArray68[local185]);
				}
			}
			local90.s(local17);
			@Pc(243) Class317 local243 = this.aClass281_1.aClass317_53;
			synchronized (this.aClass281_1.aClass317_53) {
				this.aClass281_1.aClass317_53.method7875((long) (this.anInt5532 |= arg9.anInt7839 << 29), local90);
			}
		}
		@Pc(274) Class129 local274 = local90.method5288(arg1, local17, true);
		if (arg4 != null) {
			arg4.method8956(local274, 0);
		}
		if (this.anInt5537 != 128 || this.anInt5534 != 128) {
			local274.O(this.anInt5537, this.anInt5534, this.anInt5537);
		}
		if (this.anInt5539 != 0) {
			if (this.anInt5539 == 90) {
				local274.a(4096);
			}
			if (this.anInt5539 == 180) {
				local274.a(8192);
			}
			if (this.anInt5539 == 270) {
				local274.a(12288);
			}
		}
		if (local15) {
			local274.p(this.aByte89, this.anInt5529, arg5, arg8, arg3, arg7, arg2);
		}
		local274.s(arg0);
		return local274;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!jc;)V")
	public void method5007(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7695(123);
			if (local7 == 0) {
				return;
			}
			this.method5001(arg0, local7);
		}
	}
}
