import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "Lclient!km;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
	private boolean aBoolean219;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
	private int anInt2894 = 0;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Lclient!lp;")
	private final Class140 aClass140_22 = new Class140(16);

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
	private int anInt2895 = 0;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Lclient!ps;")
	private final Class193 aClass193_25 = new Class193();

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	private final int anInt2888;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!vc;")
	private final Class253 aClass253_3;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "Lclient!ps;")
	private Class193 aClass193_26;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "Lclient!pq;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Lclient!vc;")
	private final Class253 aClass253_2;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
	private final int anInt2887;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "Z")
	private final boolean aBoolean221;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "Lclient!qc;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	private final int anInt2880;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Lclient!mb;")
	private Class3_Sub3_Sub11 aClass3_Sub3_Sub11_1;

	static {
		new Class174("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILclient!vc;Lclient!vc;Lclient!pq;Lclient!qc;IIZ)V")
	public Class101_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(2) Class253 arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(4) Class196 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2888 = arg0;
		this.aClass253_3 = arg1;
		if (this.aClass253_3 == null) {
			this.aBoolean220 = false;
		} else {
			this.aBoolean220 = true;
			this.aClass193_26 = new Class193();
		}
		this.aClass191_1 = arg3;
		this.aClass253_2 = arg2;
		this.anInt2887 = arg6;
		this.aBoolean221 = arg7;
		this.aClass196_1 = arg4;
		this.anInt2880 = arg5;
		if (this.aClass253_2 != null) {
			this.aClass3_Sub3_Sub11_1 = this.aClass196_1.method4601(this.anInt2888, this.aClass253_2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
	public int method2459() {
		return this.anInt2894;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method2457(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub3_Sub11 local9 = this.method2460(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5280();
			local9.method6288();
			return local17;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZ)Lclient!mb;")
	private Class3_Sub3_Sub11 method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub3_Sub11 local13 = (Class3_Sub3_Sub11) this.aClass140_22.method3490((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean438 && local13.aBoolean437) {
			local13.method6288();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass253_3 == null || this.aByteArray55[arg0] == -1) {
					if (this.aClass191_1.method4500()) {
						return null;
					}
					local13 = this.aClass191_1.method4504(true, (byte) 2, arg0, this.anInt2888);
				} else {
					local13 = this.aClass196_1.method4601(arg0, this.aClass253_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass253_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass196_1.method4604(arg0, this.aClass253_3);
			} else if (arg1 == 2) {
				if (this.aClass253_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray55[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass191_1.method4503()) {
					return null;
				}
				local13 = this.aClass191_1.method4504(false, (byte) 2, arg0, this.anInt2888);
			} else {
				throw new RuntimeException();
			}
			this.aClass140_22.method3494((long) arg0, local13);
		}
		if (local13.aBoolean437) {
			return null;
		}
		@Pc(155) byte[] local155 = local13.method5280();
		@Pc(189) int local189;
		@Pc(291) Class3_Sub3_Sub11_Sub1 local291;
		if (!(local13 instanceof Class3_Sub3_Sub11_Sub2)) {
			try {
				if (local155 == null || local155.length <= 2) {
					throw new RuntimeException();
				}
				Static212.aCRC32_1.reset();
				Static212.aCRC32_1.update(local155, 0, local155.length - 2);
				local189 = (int) Static212.aCRC32_1.getValue();
				if (this.aClass132_1.anIntArray233[arg0] != local189) {
					throw new RuntimeException();
				}
				this.aClass191_1.anInt5450 = 0;
				this.aClass191_1.anInt5451 = 0;
			} catch (@Pc(351) RuntimeException local351) {
				this.aClass191_1.method4498();
				local13.method6288();
				if (local13.aBoolean438 && !this.aClass191_1.method4500()) {
					local291 = this.aClass191_1.method4504(true, (byte) 2, arg0, this.anInt2888);
					this.aClass140_22.method3494((long) arg0, local291);
				}
				return null;
			}
			local155[local155.length - 2] = (byte) (this.aClass132_1.anIntArray237[arg0] >>> 8);
			local155[local155.length - 1] = (byte) this.aClass132_1.anIntArray237[arg0];
			if (this.aClass253_3 != null) {
				this.aClass196_1.method4602(local155, this.aClass253_3, arg0);
				if (this.aByteArray55[arg0] != 1) {
					this.anInt2894++;
					this.aByteArray55[arg0] = 1;
				}
			}
			if (!local13.aBoolean438) {
				local13.method6288();
			}
			return local13;
		}
		try {
			if (local155 == null || local155.length <= 2) {
				throw new RuntimeException();
			}
			Static212.aCRC32_1.reset();
			Static212.aCRC32_1.update(local155, 0, local155.length - 2);
			local189 = (int) Static212.aCRC32_1.getValue();
			if (this.aClass132_1.anIntArray233[arg0] != local189) {
				throw new RuntimeException();
			}
			@Pc(220) int local220 = ((local155[local155.length - 2] & 0xFF) << 8) + (local155[local155.length - 1] & 0xFF);
			if (local220 != (this.aClass132_1.anIntArray237[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray55[arg0] != 1) {
				this.anInt2894++;
				this.aByteArray55[arg0] = 1;
			}
			if (!local13.aBoolean438) {
				local13.method6288();
			}
			return local13;
		} catch (@Pc(265) Exception local265) {
			this.aByteArray55[arg0] = -1;
			local13.method6288();
			if (local13.aBoolean438 && !this.aClass191_1.method4500()) {
				local291 = this.aClass191_1.method4504(true, (byte) 2, arg0, this.anInt2888);
				this.aClass140_22.method3494((long) arg0, local291);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	public void method2461() {
		if (this.aClass253_3 != null) {
			this.aBoolean219 = true;
			if (this.aClass193_26 == null) {
				this.aClass193_26 = new Class193();
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	@Override
	public void method2454(@OriginalArg(0) int arg0) {
		if (this.aClass253_3 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass193_25.method4519(); local14 != null; local14 = this.aClass193_25.method4525()) {
			if (local14.aLong248 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class3 local44 = new Class3();
		local44.aLong248 = arg0;
		this.aClass193_25.method4527(local44);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I")
	@Override
	public int method2458(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub3_Sub11 local11 = (Class3_Sub3_Sub11) this.aClass140_22.method3490((long) arg0);
		return local11 == null ? 0 : local11.method5282();
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	public void method2463() {
		if (this.aClass193_26 != null) {
			if (this.method2455() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class3 local31;
			@Pc(37) int local37;
			@Pc(122) Class3 local122;
			if (this.aBoolean220) {
				local26 = true;
				for (local31 = this.aClass193_26.method4519(); local31 != null; local31 = this.aClass193_26.method4525()) {
					local37 = (int) local31.aLong248;
					if (this.aByteArray55[local37] == 0) {
						this.method2460(local37, 1);
					}
					if (this.aByteArray55[local37] == 0) {
						local26 = false;
					} else {
						local31.method6288();
					}
				}
				while (this.aClass132_1.anIntArray234.length > this.anInt2895) {
					if (this.aClass132_1.anIntArray234[this.anInt2895] == 0) {
						this.anInt2895++;
					} else {
						if (this.aClass196_1.anInt5544 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray55[this.anInt2895] == 0) {
							this.method2460(this.anInt2895, 1);
						}
						if (this.aByteArray55[this.anInt2895] == 0) {
							local122 = new Class3();
							local122.aLong248 = this.anInt2895;
							this.aClass193_26.method4527(local122);
							local26 = false;
						}
						this.anInt2895++;
					}
				}
				if (local26) {
					this.aBoolean220 = false;
					this.anInt2895 = 0;
				}
			} else if (this.aBoolean219) {
				local26 = true;
				for (local31 = this.aClass193_26.method4519(); local31 != null; local31 = this.aClass193_26.method4525()) {
					local37 = (int) local31.aLong248;
					if (this.aByteArray55[local37] != 1) {
						this.method2460(local37, 2);
					}
					if (this.aByteArray55[local37] == 1) {
						local31.method6288();
					} else {
						local26 = false;
					}
				}
				while (this.anInt2895 < this.aClass132_1.anIntArray234.length) {
					if (this.aClass132_1.anIntArray234[this.anInt2895] == 0) {
						this.anInt2895++;
					} else {
						if (this.aClass191_1.method4503()) {
							local26 = false;
							break;
						}
						if (this.aByteArray55[this.anInt2895] != 1) {
							this.method2460(this.anInt2895, 2);
						}
						if (this.aByteArray55[this.anInt2895] != 1) {
							local122 = new Class3();
							local122.aLong248 = this.anInt2895;
							local26 = false;
							this.aClass193_26.method4527(local122);
						}
						this.anInt2895++;
					}
				}
				if (local26) {
					this.aBoolean219 = false;
					this.anInt2895 = 0;
				}
			} else {
				this.aClass193_26 = null;
			}
		}
		if (!this.aBoolean221 || this.aLong107 > Static354.method4966()) {
			return;
		}
		for (@Pc(311) Class3_Sub3_Sub11 local311 = (Class3_Sub3_Sub11) this.aClass140_22.method3486(); local311 != null; local311 = (Class3_Sub3_Sub11) this.aClass140_22.method3485()) {
			if (!local311.aBoolean437) {
				if (local311.aBoolean436) {
					if (!local311.aBoolean438) {
						throw new RuntimeException();
					}
					local311.method6288();
				} else {
					local311.aBoolean436 = true;
				}
			}
		}
		this.aLong107 = Static354.method4966() + 1000L;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method2464() {
		if (this.aClass193_26 == null || this.method2455() == null) {
			return;
		}
		for (@Pc(19) Class3 local19 = this.aClass193_25.method4519(); local19 != null; local19 = this.aClass193_25.method4525()) {
			@Pc(32) int local32 = (int) local19.aLong248;
			if (local32 < 0 || local32 >= this.aClass132_1.anInt3727 || this.aClass132_1.anIntArray234[local32] == 0) {
				local19.method6288();
			} else {
				if (this.aByteArray55[local32] == 0) {
					this.method2460(local32, 1);
				}
				if (this.aByteArray55[local32] == -1) {
					this.method2460(local32, 2);
				}
				if (this.aByteArray55[local32] == 1) {
					local19.method6288();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
	public int method2465() {
		if (this.method2455() == null) {
			return this.aClass3_Sub3_Sub11_1 == null ? 0 : this.aClass3_Sub3_Sub11_1.method5282();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)I")
	public int method2467() {
		return this.aClass132_1 == null ? 0 : this.aClass132_1.anInt3728;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)I")
	public int method2468() {
		if (this.aClass132_1 == null) {
			return 0;
		} else if (this.aBoolean220) {
			@Pc(26) Class3 local26 = this.aClass193_26.method4519();
			return local26 == null ? 0 : (int) local26.aLong248;
		} else {
			return this.aClass132_1.anInt3728;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lclient!km;")
	@Override
	public Class132 method2455() {
		if (this.aClass132_1 != null) {
			return this.aClass132_1;
		}
		if (this.aClass3_Sub3_Sub11_1 == null) {
			if (this.aClass191_1.method4500()) {
				return null;
			}
			this.aClass3_Sub3_Sub11_1 = this.aClass191_1.method4504(true, (byte) 0, this.anInt2888, 255);
		}
		if (this.aClass3_Sub3_Sub11_1.aBoolean437) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass3_Sub3_Sub11_1.method5280();
		if (this.aClass3_Sub3_Sub11_1 instanceof Class3_Sub3_Sub11_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass132_1 = new Class132(local48, this.anInt2880);
				if (this.aClass132_1.anInt3729 != this.anInt2887) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass132_1 = null;
				if (this.aClass191_1.method4500()) {
					this.aClass3_Sub3_Sub11_1 = null;
				} else {
					this.aClass3_Sub3_Sub11_1 = this.aClass191_1.method4504(true, (byte) 0, this.anInt2888, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass132_1 = new Class132(local48, this.anInt2880);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass191_1.method4498();
				this.aClass132_1 = null;
				if (this.aClass191_1.method4500()) {
					this.aClass3_Sub3_Sub11_1 = null;
				} else {
					this.aClass3_Sub3_Sub11_1 = this.aClass191_1.method4504(true, (byte) 0, this.anInt2888, 255);
				}
				return null;
			}
			if (this.aClass253_2 != null) {
				this.aClass196_1.method4602(local48, this.aClass253_2, this.anInt2888);
			}
		}
		if (this.aClass253_3 != null) {
			this.aByteArray55 = new byte[this.aClass132_1.anInt3727];
			this.anInt2894 = 0;
		}
		this.aClass3_Sub3_Sub11_1 = null;
		return this.aClass132_1;
	}
}
