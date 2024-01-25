import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class277_Sub1 extends Class277 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "[C")
	private static final char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "Lclient!qia;")
	private Class287 aClass287_1;

	@OriginalMember(owner = "client!pv", name = "J", descriptor = "Z")
	private boolean aBoolean625;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	private int anInt7534 = 0;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Lclient!du;")
	private final Class81 aClass81_56 = new Class81(16);

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
	private int anInt7541 = 0;

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "Lclient!ro;")
	private final Class306 aClass306_42 = new Class306();

	@OriginalMember(owner = "client!pv", name = "K", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "Lclient!mi;")
	private final Class229 aClass229_4;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
	private final int anInt7532;

	@OriginalMember(owner = "client!pv", name = "I", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!pv", name = "H", descriptor = "Lclient!ro;")
	private Class306 aClass306_43;

	@OriginalMember(owner = "client!pv", name = "E", descriptor = "Lclient!tk;")
	private final Class331 aClass331_2;

	@OriginalMember(owner = "client!pv", name = "L", descriptor = "Z")
	private final boolean aBoolean626;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "Lclient!mi;")
	private final Class229 aClass229_3;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "Lclient!eia;")
	private final Class94 aClass94_2;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
	private final int anInt7536;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	private final int anInt7538;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "Lclient!nf;")
	private Class5_Sub4_Sub12 aClass5_Sub4_Sub12_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray4[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray4[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(34) int local34 = 52; local34 < 62; local34++) {
			aCharArray4[local34] = (char) (local34 + 48 - 52);
		}
		aCharArray4[63] = '/';
		aCharArray4[62] = '+';
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ILclient!mi;Lclient!mi;Lclient!tk;Lclient!eia;I[BIZ)V")
	public Class277_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class331 arg3, @OriginalArg(4) Class94 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass229_4 = arg1;
		this.anInt7532 = arg0;
		if (this.aClass229_4 == null) {
			this.aBoolean624 = false;
		} else {
			this.aBoolean624 = true;
			this.aClass306_43 = new Class306();
		}
		this.aClass331_2 = arg3;
		this.aBoolean626 = arg8;
		this.aClass229_3 = arg2;
		this.aClass94_2 = arg4;
		this.anInt7536 = arg5;
		this.anInt7538 = arg7;
		this.aByteArray66 = arg6;
		if (this.aClass229_3 != null) {
			this.aClass5_Sub4_Sub12_1 = this.aClass94_2.method1911(this.aClass229_3, this.anInt7532);
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)I")
	public int method6639() {
		if (this.method6635() == null) {
			return this.aClass5_Sub4_Sub12_1 == null ? 0 : this.aClass5_Sub4_Sub12_1.method4029();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method6636(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub4_Sub12 local9 = this.method6641(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4030();
			local9.method8911();
			return local17;
		}
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V")
	public void method6640() {
		if (this.aClass229_4 != null) {
			this.aBoolean625 = true;
			if (this.aClass306_43 == null) {
				this.aClass306_43 = new Class306();
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Lclient!nf;")
	private Class5_Sub4_Sub12 method6641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub4_Sub12 local13 = (Class5_Sub4_Sub12) this.aClass81_56.method1599((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean360 && local13.aBoolean358) {
			local13.method8911();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass229_4 == null || this.aByteArray65[arg0] == -1) {
					if (this.aClass331_2.method7804()) {
						return null;
					}
					local13 = this.aClass331_2.method7803(true, (byte) 2, this.anInt7532, arg0);
				} else {
					local13 = this.aClass94_2.method1911(this.aClass229_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass229_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass94_2.method1915(arg0, this.aClass229_4);
			} else if (arg1 == 2) {
				if (this.aClass229_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray65[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass331_2.method7794()) {
					return null;
				}
				local13 = this.aClass331_2.method7803(false, (byte) 2, this.anInt7532, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass81_56.method1607(local13, (long) arg0);
		}
		if (local13.aBoolean358) {
			return null;
		}
		@Pc(155) byte[] local155 = local13.method4030();
		@Pc(184) int local184;
		@Pc(215) byte[] local215;
		@Pc(224) byte[] local224;
		@Pc(226) int local226;
		@Pc(340) Class5_Sub4_Sub12_Sub1 local340;
		if (!(local13 instanceof Class5_Sub4_Sub12_Sub2)) {
			try {
				label157: {
					if (local155 != null && local155.length > 2) {
						Static176.aCRC32_1.reset();
						Static176.aCRC32_1.update(local155, 0, local155.length - 2);
						local184 = (int) Static176.aCRC32_1.getValue();
						if (local184 != this.aClass287_1.anIntArray633[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass287_1.aByteArrayArray20 == null || this.aClass287_1.aByteArrayArray20[arg0] == null) {
							break label157;
						}
						local215 = this.aClass287_1.aByteArrayArray20[arg0];
						local224 = Static39.method715(local155, local155.length - 2, 0);
						local226 = 0;
						while (true) {
							if (local226 >= 64) {
								break label157;
							}
							if (local215[local226] != local224[local226]) {
								throw new RuntimeException();
							}
							local226++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass331_2.anInt9150 = 0;
				this.aClass331_2.anInt9151 = 0;
			} catch (@Pc(448) RuntimeException local448) {
				this.aClass331_2.method7800();
				local13.method8911();
				if (local13.aBoolean360 && !this.aClass331_2.method7804()) {
					local340 = this.aClass331_2.method7803(true, (byte) 2, this.anInt7532, arg0);
					this.aClass81_56.method1607(local340, (long) arg0);
				}
				return null;
			}
			local155[local155.length - 2] = (byte) (this.aClass287_1.anIntArray627[arg0] >>> 8);
			local155[local155.length - 1] = (byte) this.aClass287_1.anIntArray627[arg0];
			if (this.aClass229_4 != null) {
				this.aClass94_2.method1909(arg0, this.aClass229_4, local155);
				if (this.aByteArray65[arg0] != 1) {
					this.anInt7534++;
					this.aByteArray65[arg0] = 1;
				}
			}
			if (!local13.aBoolean360) {
				local13.method8911();
			}
			return local13;
		}
		try {
			if (local155 == null || local155.length <= 2) {
				throw new RuntimeException();
			}
			Static176.aCRC32_1.reset();
			Static176.aCRC32_1.update(local155, 0, local155.length - 2);
			local184 = (int) Static176.aCRC32_1.getValue();
			if (local184 != this.aClass287_1.anIntArray633[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass287_1.aByteArrayArray20 != null && this.aClass287_1.aByteArrayArray20[arg0] != null) {
				local215 = this.aClass287_1.aByteArrayArray20[arg0];
				local224 = Static39.method715(local155, local155.length - 2, 0);
				for (local226 = 0; local226 < 64; local226++) {
					if (local224[local226] != local215[local226]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(269) int local269 = ((local155[local155.length - 2] & 0xFF) << 8) + (local155[local155.length - 1] & 0xFF);
			if (local269 != (this.aClass287_1.anIntArray627[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray65[arg0] != 1) {
				this.anInt7534++;
				this.aByteArray65[arg0] = 1;
			}
			if (!local13.aBoolean360) {
				local13.method8911();
			}
			return local13;
		} catch (@Pc(312) Exception local312) {
			this.aByteArray65[arg0] = -1;
			local13.method8911();
			if (local13.aBoolean360 && !this.aClass331_2.method7804()) {
				local340 = this.aClass331_2.method7803(true, (byte) 2, this.anInt7532, arg0);
				this.aClass81_56.method1607(local340, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)I")
	public int method6642() {
		return this.anInt7534;
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(I)I")
	public int method6643() {
		return this.aClass287_1 == null ? 0 : this.aClass287_1.anInt7869;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Lclient!qia;")
	@Override
	public Class287 method6635() {
		if (this.aClass287_1 != null) {
			return this.aClass287_1;
		}
		if (this.aClass5_Sub4_Sub12_1 == null) {
			if (this.aClass331_2.method7804()) {
				return null;
			}
			this.aClass5_Sub4_Sub12_1 = this.aClass331_2.method7803(true, (byte) 0, 255, this.anInt7532);
		}
		if (this.aClass5_Sub4_Sub12_1.aBoolean358) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass5_Sub4_Sub12_1.method4030();
		if (this.aClass5_Sub4_Sub12_1 instanceof Class5_Sub4_Sub12_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass287_1 = new Class287(local49, this.anInt7536, this.aByteArray66);
				if (this.aClass287_1.anInt7866 != this.anInt7538) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.aClass287_1 = null;
				if (this.aClass331_2.method7804()) {
					this.aClass5_Sub4_Sub12_1 = null;
				} else {
					this.aClass5_Sub4_Sub12_1 = this.aClass331_2.method7803(true, (byte) 0, 255, this.anInt7532);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass287_1 = new Class287(local49, this.anInt7536, this.aByteArray66);
			} catch (@Pc(124) RuntimeException local124) {
				this.aClass331_2.method7800();
				this.aClass287_1 = null;
				if (this.aClass331_2.method7804()) {
					this.aClass5_Sub4_Sub12_1 = null;
				} else {
					this.aClass5_Sub4_Sub12_1 = this.aClass331_2.method7803(true, (byte) 0, 255, this.anInt7532);
				}
				return null;
			}
			if (this.aClass229_3 != null) {
				this.aClass94_2.method1909(this.anInt7532, this.aClass229_3, local49);
			}
		}
		if (this.aClass229_4 != null) {
			this.aByteArray65 = new byte[this.aClass287_1.anInt7873];
			this.anInt7534 = 0;
		}
		this.aClass5_Sub4_Sub12_1 = null;
		return this.aClass287_1;
	}

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "(I)V")
	public void method6644() {
		if (this.aClass306_43 != null) {
			if (this.method6635() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class5 local30;
			@Pc(36) int local36;
			@Pc(135) Class5 local135;
			if (this.aBoolean624) {
				local25 = true;
				for (local30 = this.aClass306_43.method7313(); local30 != null; local30 = this.aClass306_43.method7301()) {
					local36 = (int) local30.aLong282;
					if (this.aByteArray65[local36] == 0) {
						this.method6641(local36, 1);
					}
					if (this.aByteArray65[local36] == 0) {
						local25 = false;
					} else {
						local30.method8911();
					}
				}
				while (this.aClass287_1.anIntArray629.length > this.anInt7541) {
					if (this.aClass287_1.anIntArray629[this.anInt7541] == 0) {
						this.anInt7541++;
					} else {
						if (this.aClass94_2.anInt2090 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray65[this.anInt7541] == 0) {
							this.method6641(this.anInt7541, 1);
						}
						if (this.aByteArray65[this.anInt7541] == 0) {
							local135 = new Class5();
							local135.aLong282 = (long) this.anInt7541;
							this.aClass306_43.method7303(local135);
							local25 = false;
						}
						this.anInt7541++;
					}
				}
				if (local25) {
					this.aBoolean624 = false;
					this.anInt7541 = 0;
				}
			} else if (this.aBoolean625) {
				local25 = true;
				for (local30 = this.aClass306_43.method7313(); local30 != null; local30 = this.aClass306_43.method7301()) {
					local36 = (int) local30.aLong282;
					if (this.aByteArray65[local36] != 1) {
						this.method6641(local36, 2);
					}
					if (this.aByteArray65[local36] == 1) {
						local30.method8911();
					} else {
						local25 = false;
					}
				}
				while (this.aClass287_1.anIntArray629.length > this.anInt7541) {
					if (this.aClass287_1.anIntArray629[this.anInt7541] == 0) {
						this.anInt7541++;
					} else {
						if (this.aClass331_2.method7794()) {
							local25 = false;
							break;
						}
						if (this.aByteArray65[this.anInt7541] != 1) {
							this.method6641(this.anInt7541, 2);
						}
						if (this.aByteArray65[this.anInt7541] != 1) {
							local135 = new Class5();
							local135.aLong282 = (long) this.anInt7541;
							local25 = false;
							this.aClass306_43.method7303(local135);
						}
						this.anInt7541++;
					}
				}
				if (local25) {
					this.anInt7541 = 0;
					this.aBoolean625 = false;
				}
			} else {
				this.aClass306_43 = null;
			}
		}
		if (!this.aBoolean626 || this.aLong213 > Static205.method3179()) {
			return;
		}
		for (@Pc(341) Class5_Sub4_Sub12 local341 = (Class5_Sub4_Sub12) this.aClass81_56.method1608(); local341 != null; local341 = (Class5_Sub4_Sub12) this.aClass81_56.method1610()) {
			if (!local341.aBoolean358) {
				if (local341.aBoolean359) {
					if (!local341.aBoolean360) {
						throw new RuntimeException();
					}
					local341.method8911();
				} else {
					local341.aBoolean359 = true;
				}
			}
		}
		this.aLong213 = Static205.method3179() + 1000L;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(II)I")
	@Override
	public int method6632(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub4_Sub12 local11 = (Class5_Sub4_Sub12) this.aClass81_56.method1599((long) arg0);
		return local11 == null ? 0 : local11.method4029();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V")
	@Override
	public void method6633(@OriginalArg(1) int arg0) {
		if (this.aClass229_4 == null) {
			return;
		}
		for (@Pc(18) Class5 local18 = this.aClass306_42.method7313(); local18 != null; local18 = this.aClass306_42.method7301()) {
			if ((long) arg0 == local18.aLong282) {
				return;
			}
		}
		@Pc(38) Class5 local38 = new Class5();
		local38.aLong282 = (long) arg0;
		this.aClass306_42.method7303(local38);
	}

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "(I)I")
	public int method6645() {
		if (this.aClass287_1 == null) {
			return 0;
		} else if (this.aBoolean624) {
			@Pc(25) Class5 local25 = this.aClass306_43.method7313();
			return local25 == null ? 0 : (int) local25.aLong282;
		} else {
			return this.aClass287_1.anInt7869;
		}
	}

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "(I)V")
	public void method6647() {
		if (this.aClass306_43 == null || this.method6635() == null) {
			return;
		}
		for (@Pc(19) Class5 local19 = this.aClass306_42.method7313(); local19 != null; local19 = this.aClass306_42.method7301()) {
			@Pc(25) int local25 = (int) local19.aLong282;
			if (local25 < 0 || this.aClass287_1.anInt7873 <= local25 || this.aClass287_1.anIntArray629[local25] == 0) {
				local19.method8911();
			} else {
				if (this.aByteArray65[local25] == 0) {
					this.method6641(local25, 1);
				}
				if (this.aByteArray65[local25] == -1) {
					this.method6641(local25, 2);
				}
				if (this.aByteArray65[local25] == 1) {
					local19.method8911();
				}
			}
		}
	}
}
