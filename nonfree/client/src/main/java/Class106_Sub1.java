import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "Lclient!po;")
	private Class180 aClass180_2;

	@OriginalMember(owner = "client!ks", name = "U", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	private int anInt3364 = 0;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!sq;")
	private final Class214 aClass214_17 = new Class214(16);

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
	private int anInt3369 = 0;

	@OriginalMember(owner = "client!ks", name = "R", descriptor = "Lclient!sm;")
	private final Class210 aClass210_25 = new Class210();

	@OriginalMember(owner = "client!ks", name = "W", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "Lclient!nk;")
	private final Class161 aClass161_3;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	private final int anInt3357;

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "Lclient!sm;")
	private Class210 aClass210_24;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "Lclient!fb;")
	private final Class70 aClass70_4;

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "Z")
	private final boolean aBoolean246;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!bo;")
	private final Class23 aClass23_3;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
	private final int anInt3359;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	private final int anInt3353;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "Lclient!nk;")
	private final Class161 aClass161_2;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Lclient!di;")
	private Class2_Sub1_Sub3 aClass2_Sub1_Sub3_1;

	static {
		new Class221("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILclient!nk;Lclient!nk;Lclient!bo;Lclient!fb;IIZ)V")
	public Class106_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class23 arg3, @OriginalArg(4) Class70 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass161_3 = arg1;
		this.anInt3357 = arg0;
		if (this.aClass161_3 == null) {
			this.aBoolean244 = false;
		} else {
			this.aBoolean244 = true;
			this.aClass210_24 = new Class210();
		}
		this.aClass70_4 = arg4;
		this.aBoolean246 = arg7;
		this.aClass23_3 = arg3;
		this.anInt3359 = arg6;
		this.anInt3353 = arg5;
		this.aClass161_2 = arg2;
		if (this.aClass161_2 != null) {
			this.aClass2_Sub1_Sub3_1 = this.aClass70_4.method1547(this.anInt3357, this.aClass161_2);
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)I")
	public int method3060() {
		if (this.method3052() == null) {
			return this.aClass2_Sub1_Sub3_1 == null ? 0 : this.aClass2_Sub1_Sub3_1.method4854();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)I")
	public int method3061() {
		if (this.aClass180_2 == null) {
			return 0;
		} else if (this.aBoolean244) {
			@Pc(28) Class2 local28 = this.aClass210_24.method5035();
			return local28 == null ? 0 : (int) local28.aLong208;
		} else {
			return this.aClass180_2.anInt4943;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
	@Override
	public int method3051(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub1_Sub3 local11 = (Class2_Sub1_Sub3) this.aClass214_17.method5059((long) arg0);
		return local11 == null ? 0 : local11.method4854();
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V")
	public void method3063() {
		if (this.aClass161_3 != null) {
			this.aBoolean245 = true;
			if (this.aClass210_24 == null) {
				this.aClass210_24 = new Class210();
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)I")
	public int method3065() {
		return this.aClass180_2 == null ? 0 : this.aClass180_2.anInt4943;
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	public void method3067() {
		if (this.aClass210_24 != null) {
			if (this.method3052() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class2 local30;
			@Pc(36) int local36;
			@Pc(124) Class2 local124;
			if (this.aBoolean244) {
				local25 = true;
				for (local30 = this.aClass210_24.method5035(); local30 != null; local30 = this.aClass210_24.method5037()) {
					local36 = (int) local30.aLong208;
					if (this.aByteArray55[local36] == 0) {
						this.method3072(1, local36);
					}
					if (this.aByteArray55[local36] == 0) {
						local25 = false;
					} else {
						local30.method5745();
					}
				}
				while (this.aClass180_2.anIntArray613.length > this.anInt3369) {
					if (this.aClass180_2.anIntArray613[this.anInt3369] == 0) {
						this.anInt3369++;
					} else {
						if (this.aClass70_4.anInt1719 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray55[this.anInt3369] == 0) {
							this.method3072(1, this.anInt3369);
						}
						if (this.aByteArray55[this.anInt3369] == 0) {
							local124 = new Class2();
							local124.aLong208 = this.anInt3369;
							this.aClass210_24.method5044(local124);
							local25 = false;
						}
						this.anInt3369++;
					}
				}
				if (local25) {
					this.anInt3369 = 0;
					this.aBoolean244 = false;
				}
			} else if (this.aBoolean245) {
				local25 = true;
				for (local30 = this.aClass210_24.method5035(); local30 != null; local30 = this.aClass210_24.method5037()) {
					local36 = (int) local30.aLong208;
					if (this.aByteArray55[local36] != 1) {
						this.method3072(2, local36);
					}
					if (this.aByteArray55[local36] == 1) {
						local30.method5745();
					} else {
						local25 = false;
					}
				}
				while (this.aClass180_2.anIntArray613.length > this.anInt3369) {
					if (this.aClass180_2.anIntArray613[this.anInt3369] == 0) {
						this.anInt3369++;
					} else {
						if (this.aClass23_3.method644()) {
							local25 = false;
							break;
						}
						if (this.aByteArray55[this.anInt3369] != 1) {
							this.method3072(2, this.anInt3369);
						}
						if (this.aByteArray55[this.anInt3369] != 1) {
							local124 = new Class2();
							local124.aLong208 = this.anInt3369;
							local25 = false;
							this.aClass210_24.method5044(local124);
						}
						this.anInt3369++;
					}
				}
				if (local25) {
					this.aBoolean245 = false;
					this.anInt3369 = 0;
				}
			} else {
				this.aClass210_24 = null;
			}
		}
		if (!this.aBoolean246 || Static51.method979() < this.aLong111) {
			return;
		}
		for (@Pc(317) Class2_Sub1_Sub3 local317 = (Class2_Sub1_Sub3) this.aClass214_17.method5060(); local317 != null; local317 = (Class2_Sub1_Sub3) this.aClass214_17.method5064()) {
			if (!local317.aBoolean434) {
				if (local317.aBoolean433) {
					if (!local317.aBoolean432) {
						throw new RuntimeException();
					}
					local317.method5745();
				} else {
					local317.aBoolean433 = true;
				}
			}
		}
		this.aLong111 = Static51.method979() + 1000L;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method3056(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub1_Sub3 local16 = this.method3072(0, arg0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method4856();
			local16.method5745();
			return local24;
		}
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
	public void method3069() {
		if (this.aClass210_24 == null || this.method3052() == null) {
			return;
		}
		for (@Pc(19) Class2 local19 = this.aClass210_25.method5035(); local19 != null; local19 = this.aClass210_25.method5037()) {
			@Pc(27) int local27 = (int) local19.aLong208;
			if (local27 < 0 || this.aClass180_2.anInt4944 <= local27 || this.aClass180_2.anIntArray613[local27] == 0) {
				local19.method5745();
			} else {
				if (this.aByteArray55[local27] == 0) {
					this.method3072(1, local27);
				}
				if (this.aByteArray55[local27] == -1) {
					this.method3072(2, local27);
				}
				if (this.aByteArray55[local27] == 1) {
					local19.method5745();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(B)I")
	public int method3070() {
		return this.anInt3364;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
	@Override
	public void method3053(@OriginalArg(0) int arg0) {
		if (this.aClass161_3 == null) {
			return;
		}
		for (@Pc(24) Class2 local24 = this.aClass210_25.method5035(); local24 != null; local24 = this.aClass210_25.method5037()) {
			if (local24.aLong208 == (long) arg0) {
				return;
			}
		}
		@Pc(48) Class2 local48 = new Class2();
		local48.aLong208 = arg0;
		this.aClass210_25.method5044(local48);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Lclient!po;")
	@Override
	public Class180 method3052() {
		if (this.aClass180_2 != null) {
			return this.aClass180_2;
		}
		if (this.aClass2_Sub1_Sub3_1 == null) {
			if (this.aClass23_3.method632()) {
				return null;
			}
			this.aClass2_Sub1_Sub3_1 = this.aClass23_3.method639(255, true, this.anInt3357, (byte) 0);
		}
		if (this.aClass2_Sub1_Sub3_1.aBoolean434) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass2_Sub1_Sub3_1.method4856();
		if (this.aClass2_Sub1_Sub3_1 instanceof Class2_Sub1_Sub3_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass180_2 = new Class180(local48, this.anInt3353);
				if (this.anInt3359 != this.aClass180_2.anInt4942) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass180_2 = null;
				if (this.aClass23_3.method632()) {
					this.aClass2_Sub1_Sub3_1 = null;
				} else {
					this.aClass2_Sub1_Sub3_1 = this.aClass23_3.method639(255, true, this.anInt3357, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass180_2 = new Class180(local48, this.anInt3353);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass23_3.method637();
				this.aClass180_2 = null;
				if (this.aClass23_3.method632()) {
					this.aClass2_Sub1_Sub3_1 = null;
				} else {
					this.aClass2_Sub1_Sub3_1 = this.aClass23_3.method639(255, true, this.anInt3357, (byte) 0);
				}
				return null;
			}
			if (this.aClass161_2 != null) {
				this.aClass70_4.method1548(local48, this.anInt3357, this.aClass161_2);
			}
		}
		if (this.aClass161_3 != null) {
			this.aByteArray55 = new byte[this.aClass180_2.anInt4944];
			this.anInt3364 = 0;
		}
		this.aClass2_Sub1_Sub3_1 = null;
		return this.aClass180_2;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)Lclient!di;")
	private Class2_Sub1_Sub3 method3072(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub1_Sub3 local13 = (Class2_Sub1_Sub3) this.aClass214_17.method5059((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean432 && local13.aBoolean434) {
			local13.method5745();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass161_3 == null || this.aByteArray55[arg1] == -1) {
					if (this.aClass23_3.method632()) {
						return null;
					}
					local13 = this.aClass23_3.method639(this.anInt3357, true, arg1, (byte) 2);
				} else {
					local13 = this.aClass70_4.method1547(arg1, this.aClass161_3);
				}
			} else if (arg0 == 1) {
				if (this.aClass161_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass70_4.method1546(this.aClass161_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass161_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray55[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass23_3.method644()) {
					return null;
				}
				local13 = this.aClass23_3.method639(this.anInt3357, false, arg1, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass214_17.method5065((long) arg1, local13);
		}
		if (local13.aBoolean434) {
			return null;
		}
		@Pc(159) byte[] local159 = local13.method4856();
		@Pc(186) int local186;
		@Pc(232) Class2_Sub1_Sub3_Sub1 local232;
		if (!(local13 instanceof Class2_Sub1_Sub3_Sub2)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static178.aCRC32_1.reset();
				Static178.aCRC32_1.update(local159, 0, local159.length - 2);
				local186 = (int) Static178.aCRC32_1.getValue();
				if (this.aClass180_2.anIntArray617[arg1] != local186) {
					throw new RuntimeException();
				}
				this.aClass23_3.anInt568 = 0;
				this.aClass23_3.anInt569 = 0;
			} catch (@Pc(207) RuntimeException local207) {
				this.aClass23_3.method637();
				local13.method5745();
				if (local13.aBoolean432 && !this.aClass23_3.method632()) {
					local232 = this.aClass23_3.method639(this.anInt3357, true, arg1, (byte) 2);
					this.aClass214_17.method5065((long) arg1, local232);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass180_2.anIntArray616[arg1] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass180_2.anIntArray616[arg1];
			if (this.aClass161_3 != null) {
				this.aClass70_4.method1548(local159, arg1, this.aClass161_3);
				if (this.aByteArray55[arg1] != 1) {
					this.anInt3364++;
					this.aByteArray55[arg1] = 1;
				}
			}
			if (!local13.aBoolean432) {
				local13.method5745();
			}
			return local13;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static178.aCRC32_1.reset();
			Static178.aCRC32_1.update(local159, 0, local159.length - 2);
			local186 = (int) Static178.aCRC32_1.getValue();
			if (local186 != this.aClass180_2.anIntArray617[arg1]) {
				throw new RuntimeException();
			}
			@Pc(363) int local363 = ((local159[local159.length - 2] & 0xFF) << 8) + (local159[local159.length - 1] & 0xFF);
			if (local363 != (this.aClass180_2.anIntArray616[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray55[arg1] != 1) {
				this.anInt3364++;
				this.aByteArray55[arg1] = 1;
			}
			if (!local13.aBoolean432) {
				local13.method5745();
			}
			return local13;
		} catch (@Pc(408) Exception local408) {
			this.aByteArray55[arg1] = -1;
			local13.method5745();
			if (local13.aBoolean432 && !this.aClass23_3.method632()) {
				local232 = this.aClass23_3.method639(this.anInt3357, true, arg1, (byte) 2);
				this.aClass214_17.method5065((long) arg1, local232);
			}
			return null;
		}
	}
}
