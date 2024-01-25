import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class229_Sub1 extends Class229 {

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!uj;")
	private Class349 aClass349_2;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	private int anInt5703 = 0;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!pl;")
	private final Class273 aClass273_17 = new Class273(16);

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	private int anInt5715 = 0;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "Lclient!tg;")
	private final Class330 aClass330_29 = new Class330();

	@OriginalMember(owner = "client!me", name = "O", descriptor = "J")
	private long aLong137 = 0L;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	private final int anInt5697;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!id;")
	private final Class157 aClass157_2;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!tg;")
	private Class330 aClass330_28;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	private final int anInt5711;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Lclient!rt;")
	private final Class309 aClass309_2;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!id;")
	private final Class157 aClass157_3;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private final int anInt5709;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "Z")
	private final boolean aBoolean416;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!ih;")
	private final Class161 aClass161_1;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!fo;")
	private Class5_Sub5_Sub8 aClass5_Sub5_Sub8_1;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILclient!id;Lclient!id;Lclient!rt;Lclient!ih;I[BIZ)V")
	public Class229_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class309 arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt5697 = arg0;
		this.aClass157_2 = arg1;
		if (this.aClass157_2 == null) {
			this.aBoolean415 = false;
		} else {
			this.aBoolean415 = true;
			this.aClass330_28 = new Class330();
		}
		this.anInt5711 = arg5;
		this.aClass309_2 = arg3;
		this.aClass157_3 = arg2;
		this.anInt5709 = arg7;
		this.aBoolean416 = arg8;
		this.aClass161_1 = arg4;
		this.aByteArray57 = arg6;
		if (this.aClass157_3 != null) {
			this.aClass5_Sub5_Sub8_1 = this.aClass161_1.method3863(this.anInt5697, this.aClass157_3);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)I")
	public int method5068() {
		if (this.aClass349_2 == null) {
			return 0;
		} else if (this.aBoolean415) {
			@Pc(26) Class5 local26 = this.aClass330_28.method7908();
			return local26 == null ? 0 : (int) local26.aLong278;
		} else {
			return this.aClass349_2.anInt9613;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)I")
	public int method5070() {
		return this.anInt5703;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)[B")
	@Override
	public byte[] method5063(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub5_Sub8 local9 = this.method5077(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method8529();
			local9.method9047();
			return local17;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public void method5072() {
		if (this.aClass157_2 != null) {
			this.aBoolean414 = true;
			if (this.aClass330_28 == null) {
				this.aClass330_28 = new Class330();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	public int method5073() {
		if (this.method5066() == null) {
			return this.aClass5_Sub5_Sub8_1 == null ? 0 : this.aClass5_Sub5_Sub8_1.method8531();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)I")
	public int method5074() {
		return this.aClass349_2 == null ? 0 : this.aClass349_2.anInt9613;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	@Override
	public void method5064(@OriginalArg(1) int arg0) {
		if (this.aClass157_2 == null) {
			return;
		}
		for (@Pc(22) Class5 local22 = this.aClass330_29.method7908(); local22 != null; local22 = this.aClass330_29.method7914()) {
			if ((long) arg0 == local22.aLong278) {
				return;
			}
		}
		@Pc(42) Class5 local42 = new Class5();
		local42.aLong278 = arg0;
		this.aClass330_29.method7917(local42);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Lclient!uj;")
	@Override
	public Class349 method5066() {
		if (this.aClass349_2 != null) {
			return this.aClass349_2;
		}
		if (this.aClass5_Sub5_Sub8_1 == null) {
			if (this.aClass309_2.method7413()) {
				return null;
			}
			this.aClass5_Sub5_Sub8_1 = this.aClass309_2.method7409(true, this.anInt5697, (byte) 0, 255);
		}
		if (this.aClass5_Sub5_Sub8_1.aBoolean706) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass5_Sub5_Sub8_1.method8529();
		if (this.aClass5_Sub5_Sub8_1 instanceof Class5_Sub5_Sub8_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass349_2 = new Class349(local50, this.anInt5711, this.aByteArray57);
				if (this.aClass349_2.anInt9620 != this.anInt5709) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass349_2 = null;
				if (this.aClass309_2.method7413()) {
					this.aClass5_Sub5_Sub8_1 = null;
				} else {
					this.aClass5_Sub5_Sub8_1 = this.aClass309_2.method7409(true, this.anInt5697, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass349_2 = new Class349(local50, this.anInt5711, this.aByteArray57);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass309_2.method7417();
				this.aClass349_2 = null;
				if (this.aClass309_2.method7413()) {
					this.aClass5_Sub5_Sub8_1 = null;
				} else {
					this.aClass5_Sub5_Sub8_1 = this.aClass309_2.method7409(true, this.anInt5697, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass157_3 != null) {
				this.aClass161_1.method3866(local50, this.aClass157_3, this.anInt5697);
			}
		}
		if (this.aClass157_2 != null) {
			this.anInt5703 = 0;
			this.aByteArray58 = new byte[this.aClass349_2.anInt9618];
		}
		this.aClass5_Sub5_Sub8_1 = null;
		return this.aClass349_2;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)Lclient!fo;")
	private Class5_Sub5_Sub8 method5077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub5_Sub8 local13 = (Class5_Sub5_Sub8) this.aClass273_17.method6581((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean707 && local13.aBoolean706) {
			local13.method9047();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass157_2 == null || this.aByteArray58[arg1] == -1) {
					if (this.aClass309_2.method7413()) {
						return null;
					}
					local13 = this.aClass309_2.method7409(true, arg1, (byte) 2, this.anInt5697);
				} else {
					local13 = this.aClass161_1.method3863(arg1, this.aClass157_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass157_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass161_1.method3859(arg1, this.aClass157_2);
			} else if (arg0 == 2) {
				if (this.aClass157_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray58[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass309_2.method7411()) {
					return null;
				}
				local13 = this.aClass309_2.method7409(false, arg1, (byte) 2, this.anInt5697);
			} else {
				throw new RuntimeException();
			}
			this.aClass273_17.method6585((long) arg1, local13);
		}
		if (local13.aBoolean706) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method8529();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(331) Class5_Sub5_Sub8_Sub2 local331;
		if (!(local13 instanceof Class5_Sub5_Sub8_Sub1)) {
			try {
				label157: {
					if (local162 != null && local162.length > 2) {
						Static501.aCRC32_1.reset();
						Static501.aCRC32_1.update(local162, 0, local162.length - 2);
						local189 = (int) Static501.aCRC32_1.getValue();
						if (local189 != this.aClass349_2.anIntArray528[arg1]) {
							throw new RuntimeException();
						}
						if (this.aClass349_2.aByteArrayArray24 == null || this.aClass349_2.aByteArrayArray24[arg1] == null) {
							break label157;
						}
						local216 = this.aClass349_2.aByteArrayArray24[arg1];
						local225 = Static430.method6207(local162.length - 2, 0, local162);
						local227 = 0;
						while (true) {
							if (local227 >= 64) {
								break label157;
							}
							if (local225[local227] != local216[local227]) {
								throw new RuntimeException();
							}
							local227++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass309_2.anInt8593 = 0;
				this.aClass309_2.anInt8592 = 0;
			} catch (@Pc(437) RuntimeException local437) {
				this.aClass309_2.method7417();
				local13.method9047();
				if (local13.aBoolean707 && !this.aClass309_2.method7413()) {
					local331 = this.aClass309_2.method7409(true, arg1, (byte) 2, this.anInt5697);
					this.aClass273_17.method6585((long) arg1, local331);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass349_2.anIntArray531[arg1] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass349_2.anIntArray531[arg1];
			if (this.aClass157_2 != null) {
				this.aClass161_1.method3866(local162, this.aClass157_2, arg1);
				if (this.aByteArray58[arg1] != 1) {
					this.anInt5703++;
					this.aByteArray58[arg1] = 1;
				}
			}
			if (!local13.aBoolean707) {
				local13.method9047();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static501.aCRC32_1.reset();
			Static501.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static501.aCRC32_1.getValue();
			if (this.aClass349_2.anIntArray528[arg1] != local189) {
				throw new RuntimeException();
			}
			if (this.aClass349_2.aByteArrayArray24 != null && this.aClass349_2.aByteArrayArray24[arg1] != null) {
				local216 = this.aClass349_2.aByteArrayArray24[arg1];
				local225 = Static430.method6207(local162.length - 2, 0, local162);
				for (local227 = 0; local227 < 64; local227++) {
					if (local216[local227] != local225[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(266) int local266 = ((local162[local162.length - 2] & 0xFF) << 8) + (local162[local162.length - 1] & 0xFF);
			if ((this.aClass349_2.anIntArray531[arg1] & 0xFFFF) != local266) {
				throw new RuntimeException();
			}
			if (this.aByteArray58[arg1] != 1) {
				this.anInt5703++;
				this.aByteArray58[arg1] = 1;
			}
			if (!local13.aBoolean707) {
				local13.method9047();
			}
			return local13;
		} catch (@Pc(305) Exception local305) {
			this.aByteArray58[arg1] = -1;
			local13.method9047();
			if (local13.aBoolean707 && !this.aClass309_2.method7413()) {
				local331 = this.aClass309_2.method7409(true, arg1, (byte) 2, this.anInt5697);
				this.aClass273_17.method6585((long) arg1, local331);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public void method5078() {
		if (this.aClass330_28 == null || this.method5066() == null) {
			return;
		}
		for (@Pc(19) Class5 local19 = this.aClass330_29.method7908(); local19 != null; local19 = this.aClass330_29.method7914()) {
			@Pc(27) int local27 = (int) local19.aLong278;
			if (local27 < 0 || local27 >= this.aClass349_2.anInt9618 || this.aClass349_2.anIntArray530[local27] == 0) {
				local19.method9047();
			} else {
				if (this.aByteArray58[local27] == 0) {
					this.method5077(1, local27);
				}
				if (this.aByteArray58[local27] == -1) {
					this.method5077(2, local27);
				}
				if (this.aByteArray58[local27] == 1) {
					local19.method9047();
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I")
	@Override
	public int method5067(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub5_Sub8 local11 = (Class5_Sub5_Sub8) this.aClass273_17.method6581((long) arg0);
		return local11 == null ? 0 : local11.method8531();
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
	public void method5079() {
		if (this.aClass330_28 != null) {
			if (this.method5066() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class5 local23;
			@Pc(29) int local29;
			@Pc(116) Class5 local116;
			if (this.aBoolean415) {
				local18 = true;
				for (local23 = this.aClass330_28.method7908(); local23 != null; local23 = this.aClass330_28.method7914()) {
					local29 = (int) local23.aLong278;
					if (this.aByteArray58[local29] == 0) {
						this.method5077(1, local29);
					}
					if (this.aByteArray58[local29] == 0) {
						local18 = false;
					} else {
						local23.method9047();
					}
				}
				while (this.anInt5715 < this.aClass349_2.anIntArray530.length) {
					if (this.aClass349_2.anIntArray530[this.anInt5715] == 0) {
						this.anInt5715++;
					} else {
						if (this.aClass161_1.anInt4261 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray58[this.anInt5715] == 0) {
							this.method5077(1, this.anInt5715);
						}
						if (this.aByteArray58[this.anInt5715] == 0) {
							local116 = new Class5();
							local116.aLong278 = this.anInt5715;
							local18 = false;
							this.aClass330_28.method7917(local116);
						}
						this.anInt5715++;
					}
				}
				if (local18) {
					this.aBoolean415 = false;
					this.anInt5715 = 0;
				}
			} else if (this.aBoolean414) {
				local18 = true;
				for (local23 = this.aClass330_28.method7908(); local23 != null; local23 = this.aClass330_28.method7914()) {
					local29 = (int) local23.aLong278;
					if (this.aByteArray58[local29] != 1) {
						this.method5077(2, local29);
					}
					if (this.aByteArray58[local29] == 1) {
						local23.method9047();
					} else {
						local18 = false;
					}
				}
				while (this.anInt5715 < this.aClass349_2.anIntArray530.length) {
					if (this.aClass349_2.anIntArray530[this.anInt5715] == 0) {
						this.anInt5715++;
					} else {
						if (this.aClass309_2.method7411()) {
							local18 = false;
							break;
						}
						if (this.aByteArray58[this.anInt5715] != 1) {
							this.method5077(2, this.anInt5715);
						}
						if (this.aByteArray58[this.anInt5715] != 1) {
							local116 = new Class5();
							local116.aLong278 = this.anInt5715;
							local18 = false;
							this.aClass330_28.method7917(local116);
						}
						this.anInt5715++;
					}
				}
				if (local18) {
					this.aBoolean414 = false;
					this.anInt5715 = 0;
				}
			} else {
				this.aClass330_28 = null;
			}
		}
		if (!this.aBoolean416 || Static95.method1587() < this.aLong137) {
			return;
		}
		for (@Pc(322) Class5_Sub5_Sub8 local322 = (Class5_Sub5_Sub8) this.aClass273_17.method6577(); local322 != null; local322 = (Class5_Sub5_Sub8) this.aClass273_17.method6589()) {
			if (!local322.aBoolean706) {
				if (local322.aBoolean708) {
					if (!local322.aBoolean707) {
						throw new RuntimeException();
					}
					local322.method9047();
				} else {
					local322.aBoolean708 = true;
				}
			}
		}
		this.aLong137 = Static95.method1587() + 1000L;
	}
}
