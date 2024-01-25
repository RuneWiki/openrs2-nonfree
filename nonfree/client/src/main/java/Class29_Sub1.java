import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lclient!ar;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!uaa", name = "G", descriptor = "Z")
	private boolean aBoolean680;

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
	private int anInt8771 = 0;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lclient!kea;")
	private final Class187 aClass187_39 = new Class187(16);

	@OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
	private int anInt8784 = 0;

	@OriginalMember(owner = "client!uaa", name = "H", descriptor = "Lclient!wba;")
	private final Class353 aClass353_59 = new Class353();

	@OriginalMember(owner = "client!uaa", name = "M", descriptor = "J")
	private long aLong265 = 0L;

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
	private final int anInt8774;

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lclient!wo;")
	private final Class360 aClass360_4;

	@OriginalMember(owner = "client!uaa", name = "I", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!uaa", name = "K", descriptor = "Lclient!wba;")
	private Class353 aClass353_60;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "Lclient!wo;")
	private final Class360 aClass360_5;

	@OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
	private final int anInt8783;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
	private final int anInt8768;

	@OriginalMember(owner = "client!uaa", name = "D", descriptor = "[B")
	private final byte[] aByteArray93;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lclient!aga;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!uaa", name = "L", descriptor = "Z")
	private final boolean aBoolean682;

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "Lclient!n;")
	private final Class229 aClass229_3;

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "Lclient!dga;")
	private Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILclient!wo;Lclient!wo;Lclient!aga;Lclient!n;I[BIZ)V")
	public Class29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class360 arg1, @OriginalArg(2) Class360 arg2, @OriginalArg(3) Class9 arg3, @OriginalArg(4) Class229 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt8774 = arg0;
		this.aClass360_4 = arg1;
		if (this.aClass360_4 == null) {
			this.aBoolean681 = false;
		} else {
			this.aBoolean681 = true;
			this.aClass353_60 = new Class353();
		}
		this.aClass360_5 = arg2;
		this.anInt8783 = arg7;
		this.anInt8768 = arg5;
		this.aByteArray93 = arg6;
		this.aClass9_3 = arg3;
		this.aBoolean682 = arg8;
		this.aClass229_3 = arg4;
		if (this.aClass360_5 != null) {
			this.aClass1_Sub6_Sub2_1 = this.aClass229_3.method4674(this.anInt8774, this.aClass360_5);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(IB)I")
	@Override
	public int method7183(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub6_Sub2 local11 = (Class1_Sub6_Sub2) this.aClass187_39.method3797((long) arg0);
		return local11 == null ? 0 : local11.method7269();
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)I")
	public int method7186() {
		if (this.method7185() == null) {
			return this.aClass1_Sub6_Sub2_1 == null ? 0 : this.aClass1_Sub6_Sub2_1.method7269();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
	public int method7187() {
		return this.aClass16_2 == null ? 0 : this.aClass16_2.anInt297;
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
	public int method7188() {
		if (this.aClass16_2 == null) {
			return 0;
		} else if (this.aBoolean681) {
			@Pc(25) Class1 local25 = this.aClass353_60.method7677();
			return local25 == null ? 0 : (int) local25.aLong301;
		} else {
			return this.aClass16_2.anInt297;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V")
	public void method7189() {
		if (this.aClass353_60 != null) {
			if (this.method7185() == null) {
				return;
			}
			@Pc(29) boolean local29;
			@Pc(34) Class1 local34;
			@Pc(40) int local40;
			@Pc(136) Class1 local136;
			if (this.aBoolean681) {
				local29 = true;
				for (local34 = this.aClass353_60.method7677(); local34 != null; local34 = this.aClass353_60.method7687()) {
					local40 = (int) local34.aLong301;
					if (this.aByteArray94[local40] == 0) {
						this.method7192(local40, 1);
					}
					if (this.aByteArray94[local40] == 0) {
						local29 = false;
					} else {
						local34.method7859();
					}
				}
				while (this.aClass16_2.anIntArray32.length > this.anInt8784) {
					if (this.aClass16_2.anIntArray32[this.anInt8784] == 0) {
						this.anInt8784++;
					} else {
						if (this.aClass229_3.anInt5697 >= 250) {
							local29 = false;
							break;
						}
						if (this.aByteArray94[this.anInt8784] == 0) {
							this.method7192(this.anInt8784, 1);
						}
						if (this.aByteArray94[this.anInt8784] == 0) {
							local136 = new Class1();
							local136.aLong301 = this.anInt8784;
							this.aClass353_60.method7679(local136);
							local29 = false;
						}
						this.anInt8784++;
					}
				}
				if (local29) {
					this.aBoolean681 = false;
					this.anInt8784 = 0;
				}
			} else if (this.aBoolean680) {
				local29 = true;
				for (local34 = this.aClass353_60.method7677(); local34 != null; local34 = this.aClass353_60.method7687()) {
					local40 = (int) local34.aLong301;
					if (this.aByteArray94[local40] != 1) {
						this.method7192(local40, 2);
					}
					if (this.aByteArray94[local40] == 1) {
						local34.method7859();
					} else {
						local29 = false;
					}
				}
				while (this.aClass16_2.anIntArray32.length > this.anInt8784) {
					if (this.aClass16_2.anIntArray32[this.anInt8784] == 0) {
						this.anInt8784++;
					} else {
						if (this.aClass9_3.method143()) {
							local29 = false;
							break;
						}
						if (this.aByteArray94[this.anInt8784] != 1) {
							this.method7192(this.anInt8784, 2);
						}
						if (this.aByteArray94[this.anInt8784] != 1) {
							local136 = new Class1();
							local136.aLong301 = this.anInt8784;
							local29 = false;
							this.aClass353_60.method7679(local136);
						}
						this.anInt8784++;
					}
				}
				if (local29) {
					this.aBoolean680 = false;
					this.anInt8784 = 0;
				}
			} else {
				this.aClass353_60 = null;
			}
		}
		if (!this.aBoolean682 || Static413.method5668() < this.aLong265) {
			return;
		}
		for (@Pc(325) Class1_Sub6_Sub2 local325 = (Class1_Sub6_Sub2) this.aClass187_39.method3799(); local325 != null; local325 = (Class1_Sub6_Sub2) this.aClass187_39.method3805()) {
			if (!local325.aBoolean688) {
				if (local325.aBoolean691) {
					if (!local325.aBoolean689) {
						throw new RuntimeException();
					}
					local325.method7859();
				} else {
					local325.aBoolean691 = true;
				}
			}
		}
		this.aLong265 = Static413.method5668() + 1000L;
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)I")
	public int method7190() {
		return this.anInt8771;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public void method7191() {
		if (this.aClass360_4 != null) {
			this.aBoolean680 = true;
			if (this.aClass353_60 == null) {
				this.aClass353_60 = new Class353();
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BII)Lclient!dga;")
	private Class1_Sub6_Sub2 method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub6_Sub2 local13 = (Class1_Sub6_Sub2) this.aClass187_39.method3797((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean689 && local13.aBoolean688) {
			local13.method7859();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass360_4 == null || this.aByteArray94[arg0] == -1) {
					if (this.aClass9_3.method136()) {
						return null;
					}
					local13 = this.aClass9_3.method140(this.anInt8774, arg0, (byte) 2, true);
				} else {
					local13 = this.aClass229_3.method4674(arg0, this.aClass360_4);
				}
			} else if (arg1 == 1) {
				if (this.aClass360_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass229_3.method4675(arg0, this.aClass360_4);
			} else if (arg1 == 2) {
				if (this.aClass360_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray94[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass9_3.method143()) {
					return null;
				}
				local13 = this.aClass9_3.method140(this.anInt8774, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass187_39.method3795(local13, (long) arg0);
		}
		if (local13.aBoolean688) {
			return null;
		}
		@Pc(152) byte[] local152 = local13.method7266();
		@Pc(187) int local187;
		@Pc(214) byte[] local214;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(333) Class1_Sub6_Sub2_Sub2 local333;
		if (!(local13 instanceof Class1_Sub6_Sub2_Sub1)) {
			try {
				label157: {
					if (local152 != null && local152.length > 2) {
						Static204.aCRC32_1.reset();
						Static204.aCRC32_1.update(local152, 0, local152.length - 2);
						local187 = (int) Static204.aCRC32_1.getValue();
						if (local187 != this.aClass16_2.anIntArray31[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass16_2.aByteArrayArray1 == null || this.aClass16_2.aByteArrayArray1[arg0] == null) {
							break label157;
						}
						local214 = this.aClass16_2.aByteArrayArray1[arg0];
						local223 = Static532.method7304(local152.length - 2, local152, 0);
						local225 = 0;
						while (true) {
							if (local225 >= 64) {
								break label157;
							}
							if (local223[local225] != local214[local225]) {
								throw new RuntimeException();
							}
							local225++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass9_3.anInt190 = 0;
				this.aClass9_3.anInt191 = 0;
			} catch (@Pc(437) RuntimeException local437) {
				this.aClass9_3.method138();
				local13.method7859();
				if (local13.aBoolean689 && !this.aClass9_3.method136()) {
					local333 = this.aClass9_3.method140(this.anInt8774, arg0, (byte) 2, true);
					this.aClass187_39.method3795(local333, (long) arg0);
				}
				return null;
			}
			local152[local152.length - 2] = (byte) (this.aClass16_2.anIntArray36[arg0] >>> 8);
			local152[local152.length - 1] = (byte) this.aClass16_2.anIntArray36[arg0];
			if (this.aClass360_4 != null) {
				this.aClass229_3.method4677(arg0, local152, this.aClass360_4);
				if (this.aByteArray94[arg0] != 1) {
					this.anInt8771++;
					this.aByteArray94[arg0] = 1;
				}
			}
			if (!local13.aBoolean689) {
				local13.method7859();
			}
			return local13;
		}
		try {
			if (local152 == null || local152.length <= 2) {
				throw new RuntimeException();
			}
			Static204.aCRC32_1.reset();
			Static204.aCRC32_1.update(local152, 0, local152.length - 2);
			local187 = (int) Static204.aCRC32_1.getValue();
			if (this.aClass16_2.anIntArray31[arg0] != local187) {
				throw new RuntimeException();
			}
			if (this.aClass16_2.aByteArrayArray1 != null && this.aClass16_2.aByteArrayArray1[arg0] != null) {
				local214 = this.aClass16_2.aByteArrayArray1[arg0];
				local223 = Static532.method7304(local152.length - 2, local152, 0);
				for (local225 = 0; local225 < 64; local225++) {
					if (local223[local225] != local214[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(266) int local266 = (local152[local152.length - 1] & 0xFF) + ((local152[local152.length - 2] & 0xFF) << 8);
			if ((this.aClass16_2.anIntArray36[arg0] & 0xFFFF) != local266) {
				throw new RuntimeException();
			}
			if (this.aByteArray94[arg0] != 1) {
				this.anInt8771++;
				this.aByteArray94[arg0] = 1;
			}
			if (!local13.aBoolean689) {
				local13.method7859();
			}
			return local13;
		} catch (@Pc(307) Exception local307) {
			this.aByteArray94[arg0] = -1;
			local13.method7859();
			if (local13.aBoolean689 && !this.aClass9_3.method136()) {
				local333 = this.aClass9_3.method140(this.anInt8774, arg0, (byte) 2, true);
				this.aClass187_39.method3795(local333, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V")
	@Override
	public void method7184(@OriginalArg(1) int arg0) {
		if (this.aClass360_4 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass353_59.method7677(); local14 != null; local14 = this.aClass353_59.method7687()) {
			if (local14.aLong301 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong301 = arg0;
		this.aClass353_59.method7679(local38);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Lclient!ar;")
	@Override
	public Class16 method7185() {
		if (this.aClass16_2 != null) {
			return this.aClass16_2;
		}
		if (this.aClass1_Sub6_Sub2_1 == null) {
			if (this.aClass9_3.method136()) {
				return null;
			}
			this.aClass1_Sub6_Sub2_1 = this.aClass9_3.method140(255, this.anInt8774, (byte) 0, true);
		}
		if (this.aClass1_Sub6_Sub2_1.aBoolean688) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub6_Sub2_1.method7266();
		if (this.aClass1_Sub6_Sub2_1 instanceof Class1_Sub6_Sub2_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass16_2 = new Class16(local43, this.anInt8768, this.aByteArray93);
				if (this.aClass16_2.anInt295 != this.anInt8783) {
					throw new RuntimeException();
				}
			} catch (@Pc(74) RuntimeException local74) {
				this.aClass16_2 = null;
				if (this.aClass9_3.method136()) {
					this.aClass1_Sub6_Sub2_1 = null;
				} else {
					this.aClass1_Sub6_Sub2_1 = this.aClass9_3.method140(255, this.anInt8774, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass16_2 = new Class16(local43, this.anInt8768, this.aByteArray93);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass9_3.method138();
				this.aClass16_2 = null;
				if (this.aClass9_3.method136()) {
					this.aClass1_Sub6_Sub2_1 = null;
				} else {
					this.aClass1_Sub6_Sub2_1 = this.aClass9_3.method140(255, this.anInt8774, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass360_5 != null) {
				this.aClass229_3.method4677(this.anInt8774, local43, this.aClass360_5);
			}
		}
		if (this.aClass360_4 != null) {
			this.anInt8771 = 0;
			this.aByteArray94 = new byte[this.aClass16_2.anInt298];
		}
		this.aClass1_Sub6_Sub2_1 = null;
		return this.aClass16_2;
	}

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V")
	public void method7194() {
		if (this.aClass353_60 == null || this.method7185() == null) {
			return;
		}
		for (@Pc(23) Class1 local23 = this.aClass353_59.method7677(); local23 != null; local23 = this.aClass353_59.method7687()) {
			@Pc(29) int local29 = (int) local23.aLong301;
			if (local29 < 0 || local29 >= this.aClass16_2.anInt298 || this.aClass16_2.anIntArray32[local29] == 0) {
				local23.method7859();
			} else {
				if (this.aByteArray94[local29] == 0) {
					this.method7192(local29, 1);
				}
				if (this.aByteArray94[local29] == -1) {
					this.method7192(local29, 2);
				}
				if (this.aByteArray94[local29] == 1) {
					local23.method7859();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method7181(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub6_Sub2 local9 = this.method7192(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.method7266();
			local9.method7859();
			return local26;
		}
	}
}
