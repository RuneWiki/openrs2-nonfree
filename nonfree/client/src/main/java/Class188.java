import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class188 {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!js", name = "g", descriptor = "I")
	public int anInt4949;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	private int anInt4951;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!js", name = "r", descriptor = "I")
	private int anInt4956;

	@OriginalMember(owner = "client!js", name = "u", descriptor = "I")
	public int anInt4959;

	@OriginalMember(owner = "client!js", name = "v", descriptor = "I")
	public int anInt4960;

	@OriginalMember(owner = "client!js", name = "w", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!js", name = "y", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!js", name = "A", descriptor = "I")
	private int anInt4963;

	@OriginalMember(owner = "client!js", name = "D", descriptor = "I")
	private int anInt4966;

	@OriginalMember(owner = "client!js", name = "F", descriptor = "I")
	public int anInt4968;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "Lclient!vt;")
	public Class378 aClass378_2;

	@OriginalMember(owner = "client!js", name = "M", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!js", name = "O", descriptor = "Lclient!tca;")
	private Class333 aClass333_18;

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "I")
	public int anInt4976;

	@OriginalMember(owner = "client!js", name = "Z", descriptor = "I")
	public int anInt4983;

	@OriginalMember(owner = "client!js", name = "f", descriptor = "I")
	public int anInt4948 = -1;

	@OriginalMember(owner = "client!js", name = "z", descriptor = "I")
	public int anInt4962 = -1;

	@OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
	public boolean aBoolean331 = true;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	private int anInt4946 = -1;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!js", name = "G", descriptor = "I")
	private int anInt4969 = -1;

	@OriginalMember(owner = "client!js", name = "o", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "I")
	public int anInt4971 = -1;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "I")
	public int anInt4950 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Z")
	public boolean aBoolean328 = true;

	@OriginalMember(owner = "client!js", name = "k", descriptor = "I")
	private int anInt4952 = -1;

	@OriginalMember(owner = "client!js", name = "C", descriptor = "I")
	public int anInt4965 = -1;

	@OriginalMember(owner = "client!js", name = "B", descriptor = "I")
	private int anInt4964 = -1;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "I")
	public int anInt4967 = 0;

	@OriginalMember(owner = "client!js", name = "x", descriptor = "I")
	private int anInt4961 = -1;

	@OriginalMember(owner = "client!js", name = "P", descriptor = "I")
	public int anInt4975 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
	public boolean aBoolean329 = true;

	@OriginalMember(owner = "client!js", name = "J", descriptor = "I")
	public int anInt4972 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!js", name = "R", descriptor = "I")
	public int anInt4977 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	public int anInt4947 = -1;

	@OriginalMember(owner = "client!js", name = "U", descriptor = "I")
	public int anInt4979 = -1;

	@OriginalMember(owner = "client!js", name = "W", descriptor = "I")
	public int anInt4980 = -1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!es;)Z")
	public boolean method4283(@OriginalArg(1) Interface6 arg0) {
		@Pc(22) int local22;
		if (this.anInt4969 == -1) {
			if (this.anInt4952 == -1) {
				return true;
			}
			local22 = arg0.method5777(this.anInt4952);
		} else {
			local22 = arg0.method5776(this.anInt4969);
		}
		if (local22 < this.anInt4951 || this.anInt4966 < local22) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt4946 == -1) {
			if (this.anInt4961 == -1) {
				return true;
			}
			local68 = arg0.method5777(this.anInt4961);
		} else {
			local68 = arg0.method5776(this.anInt4946);
		}
		return local68 >= this.anInt4956 && this.anInt4963 >= local68;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!dt;B)V")
	public void method4286(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7954();
			if (local9 == 0) {
				return;
			}
			this.method4289(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLclient!ha;)Lclient!hh;")
	public Class6 method4287(@OriginalArg(1) Class95 arg0) {
		@Pc(20) Class6 local20 = (Class6) this.aClass378_2.aClass295_70.method6470((long) (arg0.anInt9840 << 29 | 0x20000 | this.anInt4964));
		if (local20 != null) {
			return local20;
		}
		this.aClass378_2.aClass362_152.method8365(this.anInt4964);
		@Pc(48) Class370 local48 = Static688.method8590(this.aClass378_2.aClass362_152, this.anInt4964, 0);
		if (local48 != null) {
			local20 = arg0.method8008(local48, true);
			this.aClass378_2.aClass295_70.method6469((long) (arg0.anInt9840 << 29 | this.anInt4964 | 0x20000), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BII)I")
	public int method4288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass333_18 == null) {
			return arg1;
		} else {
			@Pc(22) Class3_Sub24 local22 = (Class3_Sub24) this.aClass333_18.method7489((long) arg0);
			return local22 == null ? arg1 : local22.anInt3846;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!dt;I)V")
	private void method4289(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4962 = arg0.method7951();
		} else if (arg1 == 2) {
			this.anInt4947 = arg0.method7951();
		} else if (arg1 == 3) {
			this.aString62 = arg0.method7922();
		} else if (arg1 == 4) {
			this.anInt4960 = arg0.method7945();
		} else if (arg1 == 5) {
			this.anInt4979 = arg0.method7945();
		} else if (arg1 == 6) {
			this.anInt4967 = arg0.method7954();
		} else {
			@Pc(148) int local148;
			if (arg1 == 7) {
				local148 = arg0.method7954();
				if ((local148 & 0x1) == 0) {
					this.aBoolean331 = false;
				}
				if ((local148 & 0x2) == 2) {
					this.aBoolean330 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean328 = arg0.method7954() == 1;
			} else if (arg1 == 9) {
				this.anInt4952 = arg0.method7951();
				if (this.anInt4952 == 65535) {
					this.anInt4952 = -1;
				}
				this.anInt4969 = arg0.method7951();
				if (this.anInt4969 == 65535) {
					this.anInt4969 = -1;
				}
				this.anInt4951 = arg0.method7895();
				this.anInt4966 = arg0.method7895();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray32[arg1 - 10] = arg0.method7922();
			} else {
				@Pc(156) int local156;
				@Pc(190) int local190;
				if (arg1 == 15) {
					local148 = arg0.method7954();
					this.anIntArray282 = new int[local148 * 2];
					for (local156 = 0; local156 < local148 * 2; local156++) {
						this.anIntArray282[local156] = arg0.method7918();
					}
					this.anInt4959 = arg0.method7895();
					@Pc(184) int local184 = arg0.method7954();
					this.anIntArray281 = new int[local184];
					for (local190 = 0; local190 < this.anIntArray281.length; local190++) {
						this.anIntArray281[local190] = arg0.method7895();
					}
					this.aByteArray42 = new byte[local148];
					for (@Pc(211) int local211 = 0; local211 < local148; local211++) {
						this.aByteArray42[local211] = arg0.method7960();
					}
				} else if (arg1 == 16) {
					this.aBoolean329 = false;
				} else if (arg1 == 17) {
					this.aString63 = arg0.method7922();
				} else if (arg1 == 18) {
					this.anInt4964 = arg0.method7951();
				} else if (arg1 == 19) {
					this.anInt4980 = arg0.method7951();
				} else if (arg1 == 20) {
					this.anInt4961 = arg0.method7951();
					if (this.anInt4961 == 65535) {
						this.anInt4961 = -1;
					}
					this.anInt4946 = arg0.method7951();
					if (this.anInt4946 == 65535) {
						this.anInt4946 = -1;
					}
					this.anInt4956 = arg0.method7895();
					this.anInt4963 = arg0.method7895();
				} else if (arg1 == 21) {
					this.anInt4983 = arg0.method7895();
				} else if (arg1 == 22) {
					this.anInt4949 = arg0.method7895();
				} else if (arg1 == 23) {
					this.anInt4971 = arg0.method7954();
					this.anInt4965 = arg0.method7954();
					this.anInt4948 = arg0.method7954();
				} else if (arg1 == 24) {
					this.anInt4954 = arg0.method7918();
					this.anInt4976 = arg0.method7918();
				} else if (arg1 == 249) {
					local148 = arg0.method7954();
					if (this.aClass333_18 == null) {
						local156 = Static585.method7772(local148);
						this.aClass333_18 = new Class333(local156);
					}
					for (local156 = 0; local156 < local148; local156++) {
						@Pc(333) boolean local333 = arg0.method7954() == 1;
						local190 = arg0.method7945();
						@Pc(346) Class3 local346;
						if (local333) {
							local346 = new Class3_Sub19(arg0.method7922());
						} else {
							local346 = new Class3_Sub24(arg0.method7895());
						}
						this.aClass333_18.method7488((long) local190, local346);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method4290(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass333_18 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub19 local16 = (Class3_Sub19) this.aClass333_18.method7489((long) arg1);
			return local16 == null ? arg0 : local16.aString42;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BZLclient!ha;)Lclient!hh;")
	public Class6 method4291(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class95 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt4947 : this.anInt4962;
		@Pc(18) int local18 = arg1.anInt9840 << 29 | local11;
		@Pc(27) Class6 local27 = (Class6) this.aClass378_2.aClass295_70.method6470((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass378_2.aClass362_152.method8365(local11)) {
			@Pc(53) Class370 local53 = Static688.method8590(this.aClass378_2.aClass362_152, local11, 0);
			if (local53 != null) {
				local27 = arg1.method8008(local53, true);
				this.aClass378_2.aClass295_70.method6469((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public void method4292() {
		if (this.anIntArray282 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray282.length; local6 += 2) {
			if (this.anIntArray282[local6] < this.anInt4977) {
				this.anInt4977 = this.anIntArray282[local6];
			} else if (this.anInt4972 < this.anIntArray282[local6]) {
				this.anInt4972 = this.anIntArray282[local6];
			}
			if (this.anInt4950 > this.anIntArray282[local6 + 1]) {
				this.anInt4950 = this.anIntArray282[local6 + 1];
			} else if (this.anIntArray282[local6 + 1] > this.anInt4975) {
				this.anInt4975 = this.anIntArray282[local6 + 1];
			}
		}
	}
}
