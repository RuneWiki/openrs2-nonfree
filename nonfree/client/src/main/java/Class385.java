import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class385 {

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
	public int anInt10227;

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
	private int anInt10228;

	@OriginalMember(owner = "client!wba", name = "t", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!wba", name = "w", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!wba", name = "x", descriptor = "Lclient!jf;")
	public Class179 aClass179_2;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "I")
	private int anInt10219 = -1;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	public int anInt10218 = -1;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
	private int anInt10225 = 0;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "Z")
	public boolean aBoolean742 = false;

	@OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
	private int anInt10231 = 128;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
	private int anInt10224 = 0;

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
	private int anInt10233 = 0;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
	private int anInt10229 = 128;

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "B")
	public byte aByte148 = 0;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!gf;Lclient!s;IBIIILclient!s;ZIILclient!ha;I)Lclient!ka;")
	public Class114 method8526(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class88 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class143 arg9, @OriginalArg(12) int arg10) {
		return this.method8528(arg9, arg6, arg5, (byte) 2, arg2, arg4, arg3, arg7, arg0, true, arg8, arg10, arg1);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ha;ZIIILclient!gf;I)Lclient!ka;")
	public Class114 method8527(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class128 arg4, @OriginalArg(6) int arg5) {
		return this.method8528(arg0, (Class88) null, 0, (byte) 2, 0, arg1, arg5, arg2, arg4, false, 0, arg3, (Class88) null);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!ha;Lclient!s;IIBIIIILclient!gf;ZIILclient!s;)Lclient!ka;")
	private Class114 method8528(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class128 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class88 arg12) {
		@Pc(5) int local5 = arg11;
		@Pc(21) Class65 local21 = this.anInt10218 == -1 || arg7 == -1 ? null : arg8.method2686(this.anInt10218);
		@Pc(33) boolean local33 = arg9 & this.aByte148 != 0;
		if (local21 != null) {
			local5 = arg11 | local21.method1297(arg5, arg7, false);
		}
		if (local33) {
			local5 |= this.aByte148 == 3 ? 7 : 2;
		}
		if (this.anInt10231 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt10229 != 128 || this.anInt10225 != 0) {
			local5 |= 0x5;
		}
		@Pc(84) Class265 local84 = this.aClass179_2.aClass265_26;
		@Pc(104) Class114 local104;
		synchronized (this.aClass179_2.aClass265_26) {
			local104 = (Class114) this.aClass179_2.aClass265_26.method6577((long) (this.anInt10227 |= arg0.anInt7197 << 29));
		}
		if (local104 == null || arg0.method6226(local104.ua(), local5) != 0) {
			if (local104 != null) {
				local5 = arg0.method6204(local5, local104.ua());
			}
			@Pc(128) int local128 = local5;
			if (this.aShortArray144 != null) {
				local128 = local5 | 0x4000;
			}
			if (this.aShortArray141 != null) {
				local128 |= 0x8000;
			}
			@Pc(151) Class156 local151 = Static437.method6555(this.aClass179_2.aClass50_73, this.anInt10228);
			if (local151 == null) {
				return null;
			}
			if (local151.anInt3696 < 13) {
				local151.method3275();
			}
			local104 = arg0.method6203(local151, local128, this.aClass179_2.anInt4290, this.anInt10233 + 64, this.anInt10224 + 850);
			@Pc(184) int local184;
			if (this.aShortArray144 != null) {
				for (local184 = 0; local184 < this.aShortArray144.length; local184++) {
					local104.ia(this.aShortArray144[local184], this.aShortArray142[local184]);
				}
			}
			if (this.aShortArray141 != null) {
				for (local184 = 0; local184 < this.aShortArray141.length; local184++) {
					local104.aa(this.aShortArray141[local184], this.aShortArray143[local184]);
				}
			}
			local104.s(local5);
			@Pc(234) Class265 local234 = this.aClass179_2.aClass265_26;
			synchronized (this.aClass179_2.aClass265_26) {
				this.aClass179_2.aClass265_26.method6566(local104, (long) (this.anInt10227 |= arg0.anInt7197 << 29));
			}
		}
		@Pc(278) Class114 local278 = local21 == null ? local104.method8810(arg3, local5, true) : local21.method1300(0, arg6, arg3, local5, local104, arg7, arg5);
		if (this.anInt10229 != 128 || this.anInt10231 != 128) {
			local278.O(this.anInt10229, this.anInt10231, this.anInt10229);
		}
		if (this.anInt10225 != 0) {
			if (this.anInt10225 == 90) {
				local278.a(4096);
			}
			if (this.anInt10225 == 180) {
				local278.a(8192);
			}
			if (this.anInt10225 == 270) {
				local278.a(12288);
			}
		}
		if (local33) {
			local278.p(this.aByte148, this.anInt10219, arg1, arg12, arg2, arg10, arg4);
		}
		local278.s(arg11);
		return local278;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!rv;II)V")
	private void method8529(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt10228 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt10218 = arg0.method3698();
		} else if (arg1 == 4) {
			this.anInt10229 = arg0.method3698();
		} else if (arg1 == 5) {
			this.anInt10231 = arg0.method3698();
		} else if (arg1 == 6) {
			this.anInt10225 = arg0.method3698();
		} else if (arg1 == 7) {
			this.anInt10233 = arg0.method3642();
		} else if (arg1 == 8) {
			this.anInt10224 = arg0.method3642();
		} else if (arg1 == 9) {
			this.aByte148 = 3;
			this.anInt10219 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean742 = true;
		} else if (arg1 == 11) {
			this.aByte148 = 1;
		} else if (arg1 == 12) {
			this.aByte148 = 4;
		} else if (arg1 == 13) {
			this.aByte148 = 5;
		} else if (arg1 == 14) {
			this.aByte148 = 2;
			this.anInt10219 = arg0.method3642() * 256;
		} else if (arg1 == 15) {
			this.aByte148 = 3;
			this.anInt10219 = arg0.method3698();
		} else if (arg1 == 16) {
			this.aByte148 = 3;
			this.anInt10219 = arg0.method3671();
		} else {
			@Pc(109) int local109;
			@Pc(119) int local119;
			if (arg1 == 40) {
				local109 = arg0.method3642();
				this.aShortArray144 = new short[local109];
				this.aShortArray142 = new short[local109];
				for (local119 = 0; local119 < local109; local119++) {
					this.aShortArray144[local119] = (short) arg0.method3698();
					this.aShortArray142[local119] = (short) arg0.method3698();
				}
			} else if (arg1 == 41) {
				local109 = arg0.method3642();
				this.aShortArray141 = new short[local109];
				this.aShortArray143 = new short[local109];
				for (local119 = 0; local119 < local109; local119++) {
					this.aShortArray141[local119] = (short) arg0.method3698();
					this.aShortArray143[local119] = (short) arg0.method3698();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILclient!gf;IIILclient!ha;I)Lclient!ka;")
	public Class114 method8532(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class143 arg5, @OriginalArg(7) int arg6) {
		return this.method8528(arg5, (Class88) null, 0, arg0, 0, arg4, arg6, arg1, arg2, false, 0, arg3, (Class88) null);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method8533(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			this.method8529(arg0, local3);
		}
	}
}
