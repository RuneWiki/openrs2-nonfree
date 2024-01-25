import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class250 {

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!paa", name = "n", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
	private int anInt7019;

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "Lclient!ar;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
	public int anInt7020;

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Z")
	public boolean aBoolean484 = false;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	private int anInt7013 = 0;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	private int anInt7014 = 128;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
	private int anInt7017 = 0;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "B")
	public byte aByte99 = 0;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
	private int anInt7011 = 128;

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "I")
	private int anInt7021 = -1;

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
	private int anInt7024 = 0;

	@OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
	public int anInt7025 = -1;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!jb;IILclient!i;Lclient!i;BZILclient!r;III)Lclient!da;")
	public Class52 method5607(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class127 arg4, @OriginalArg(5) Class127 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class31 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method5614(arg8, arg3, arg7, arg6, true, arg5, arg0, arg1, arg4, arg10, arg9, (byte) 2, arg2);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!r;IIILclient!jb;I)Lclient!da;")
	public Class52 method5608(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class155 arg4, @OriginalArg(6) int arg5) {
		return this.method5614(arg1, arg3, arg0, 0, false, null, arg5, arg4, null, arg2, 0, (byte) 5, 0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!jb;ILclient!r;III)Lclient!da;")
	public Class52 method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5614(arg5, arg0, arg3, 0, false, null, arg4, arg1, null, arg2, 0, (byte) 2, 0);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!ie;)V")
	public void method5611(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6814();
			if (local13 == 0) {
				return;
			}
			this.method5612(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ie;II)V")
	private void method5612(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7019 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt7025 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt7014 = arg0.method6811();
		} else if (arg1 == 5) {
			this.anInt7011 = arg0.method6811();
		} else if (arg1 == 6) {
			this.anInt7024 = arg0.method6811();
		} else if (arg1 == 7) {
			this.anInt7013 = arg0.method6814();
		} else if (arg1 == 8) {
			this.anInt7017 = arg0.method6814();
		} else if (arg1 == 9) {
			this.aByte99 = 3;
			this.anInt7021 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean484 = true;
		} else if (arg1 == 11) {
			this.aByte99 = 1;
		} else if (arg1 == 12) {
			this.aByte99 = 4;
		} else if (arg1 == 13) {
			this.aByte99 = 5;
		} else if (arg1 == 14) {
			this.aByte99 = 2;
			this.anInt7021 = arg0.method6814() * 256;
		} else if (arg1 == 15) {
			this.aByte99 = 3;
			this.anInt7021 = arg0.method6811();
		} else if (arg1 == 16) {
			this.aByte99 = 3;
			this.anInt7021 = arg0.method6816();
		} else {
			@Pc(129) int local129;
			@Pc(139) int local139;
			if (arg1 == 40) {
				local129 = arg0.method6814();
				this.aShortArray104 = new short[local129];
				this.aShortArray101 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray104[local139] = (short) arg0.method6811();
					this.aShortArray101[local139] = (short) arg0.method6811();
				}
			} else if (arg1 == 41) {
				local129 = arg0.method6814();
				this.aShortArray103 = new short[local129];
				this.aShortArray102 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray102[local139] = (short) arg0.method6811();
					this.aShortArray103[local139] = (short) arg0.method6811();
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IBILclient!r;IZLclient!i;ILclient!jb;Lclient!i;IIBI)Lclient!da;")
	private Class52 method5614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class127 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class155 arg7, @OriginalArg(9) Class127 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg0;
		@Pc(30) Class270 local30 = this.anInt7025 == -1 || arg1 == -1 ? null : arg7.method3820(this.anInt7025);
		@Pc(39) boolean local39 = arg4 & this.aByte99 != 0;
		if (local30 != null) {
			local7 = arg0 | local30.method6008(arg9, false, arg1);
		}
		if (local39) {
			local7 |= this.aByte99 == 3 ? 7 : 2;
		}
		if (this.anInt7011 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt7014 != 128 || this.anInt7024 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class342 local85 = this.aClass23_2.aClass342_11;
		@Pc(105) Class52 local105;
		synchronized (this.aClass23_2.aClass342_11) {
			local105 = (Class52) this.aClass23_2.aClass342_11.method7684((long) (this.anInt7020 |= arg2.anInt10222 << 29));
		}
		if (local105 == null || arg2.method8050(local105.PA(), local7) != 0) {
			if (local105 != null) {
				local7 = arg2.method8039(local7, local105.PA());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray104 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray102 != null) {
				local132 |= 0x8000;
			}
			@Pc(155) Class332 local155 = Static326.method4807(this.anInt7019, this.aClass23_2.aClass284_7);
			if (local155 == null) {
				return null;
			}
			if (local155.anInt9539 < 13) {
				local155.method7503();
			}
			local105 = arg2.method8046(local155, local132, this.aClass23_2.anInt224, this.anInt7013 + 64, this.anInt7017 + 850);
			@Pc(188) int local188;
			if (this.aShortArray104 != null) {
				for (local188 = 0; local188 < this.aShortArray104.length; local188++) {
					local105.d(this.aShortArray104[local188], this.aShortArray101[local188]);
				}
			}
			if (this.aShortArray102 != null) {
				for (local188 = 0; local188 < this.aShortArray102.length; local188++) {
					local105.DA(this.aShortArray102[local188], this.aShortArray103[local188]);
				}
			}
			local105.SA(local7);
			@Pc(244) Class342 local244 = this.aClass23_2.aClass342_11;
			synchronized (this.aClass23_2.aClass342_11) {
				this.aClass23_2.aClass342_11.method7683(local105, (long) (this.anInt7020 |= arg2.anInt10222 << 29));
			}
		}
		@Pc(288) Class52 local288 = local30 == null ? local105.method7618(arg11, local7, true) : local30.method6006(arg6, arg9, arg1, 0, local105, arg11, local7);
		if (this.anInt7014 != 128 || this.anInt7011 != 128) {
			local288.R(this.anInt7014, this.anInt7011, this.anInt7014);
		}
		if (this.anInt7024 != 0) {
			if (this.anInt7024 == 90) {
				local288.M(4096);
			}
			if (this.anInt7024 == 180) {
				local288.M(8192);
			}
			if (this.anInt7024 == 270) {
				local288.M(12288);
			}
		}
		if (local39) {
			local288.ba(this.aByte99, this.anInt7021, arg5, arg8, arg3, arg12, arg10);
		}
		local288.SA(arg0);
		return local288;
	}
}
