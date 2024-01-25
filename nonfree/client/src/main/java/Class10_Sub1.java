import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Lclient!ne;")
	private Class178 aClass178_2;

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!rt", name = "P", descriptor = "Z")
	private boolean aBoolean439;

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
	private int anInt6409 = 0;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "Lclient!ru;")
	private final Class220 aClass220_35 = new Class220(16);

	@OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
	private int anInt6410 = 0;

	@OriginalMember(owner = "client!rt", name = "S", descriptor = "Lclient!nj;")
	private final Class181 aClass181_35 = new Class181();

	@OriginalMember(owner = "client!rt", name = "Z", descriptor = "J")
	private long aLong335 = 0L;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
	private final int anInt6397;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "Lclient!bh;")
	private final Class24 aClass24_3;

	@OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
	private boolean aBoolean438;

	@OriginalMember(owner = "client!rt", name = "W", descriptor = "Lclient!nj;")
	private Class181 aClass181_37;

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "Lclient!dp;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!rt", name = "ab", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
	private final int anInt6400;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!bh;")
	private final Class24 aClass24_2;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!un;")
	private final Class249 aClass249_3;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
	private final int anInt6396;

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "Lclient!vb;")
	private Class2_Sub1_Sub7 aClass2_Sub1_Sub7_1;

	static {
		new Class231("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILclient!bh;Lclient!bh;Lclient!un;Lclient!dp;IIZ)V")
	public Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) Class249 arg3, @OriginalArg(4) Class58 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6397 = arg0;
		this.aClass24_3 = arg1;
		if (this.aClass24_3 == null) {
			this.aBoolean438 = false;
		} else {
			this.aBoolean438 = true;
			this.aClass181_37 = new Class181();
		}
		this.aClass58_2 = arg4;
		this.aBoolean440 = arg7;
		this.anInt6400 = arg5;
		this.aClass24_2 = arg2;
		this.aClass249_3 = arg3;
		this.anInt6396 = arg6;
		if (this.aClass24_2 != null) {
			this.aClass2_Sub1_Sub7_1 = this.aClass58_2.method1157(this.anInt6397, this.aClass24_2);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lclient!ne;")
	@Override
	public Class178 method5076() {
		if (this.aClass178_2 != null) {
			return this.aClass178_2;
		}
		if (this.aClass2_Sub1_Sub7_1 == null) {
			if (this.aClass249_3.method5699()) {
				return null;
			}
			this.aClass2_Sub1_Sub7_1 = this.aClass249_3.method5700(true, 255, this.anInt6397, (byte) 0);
		}
		if (this.aClass2_Sub1_Sub7_1.aBoolean225) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass2_Sub1_Sub7_1.method2817();
		if (this.aClass2_Sub1_Sub7_1 instanceof Class2_Sub1_Sub7_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass178_2 = new Class178(local50, this.anInt6400);
				if (this.anInt6396 != this.aClass178_2.anInt4957) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass178_2 = null;
				if (this.aClass249_3.method5699()) {
					this.aClass2_Sub1_Sub7_1 = null;
				} else {
					this.aClass2_Sub1_Sub7_1 = this.aClass249_3.method5700(true, 255, this.anInt6397, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass178_2 = new Class178(local50, this.anInt6400);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass249_3.method5697();
				this.aClass178_2 = null;
				if (this.aClass249_3.method5699()) {
					this.aClass2_Sub1_Sub7_1 = null;
				} else {
					this.aClass2_Sub1_Sub7_1 = this.aClass249_3.method5700(true, 255, this.anInt6397, (byte) 0);
				}
				return null;
			}
			if (this.aClass24_2 != null) {
				this.aClass58_2.method1161(this.aClass24_2, this.anInt6397, local50);
			}
		}
		this.aClass2_Sub1_Sub7_1 = null;
		if (this.aClass24_3 != null) {
			this.anInt6409 = 0;
			this.aByteArray69 = new byte[this.aClass178_2.anInt4955];
		}
		return this.aClass178_2;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
	public int method5085() {
		if (this.method5076() == null) {
			return this.aClass2_Sub1_Sub7_1 == null ? 0 : this.aClass2_Sub1_Sub7_1.method2818();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method5077(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub7 local9 = this.method5093(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method2817();
			local9.method6260();
			return local17;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	@Override
	public void method5073(@OriginalArg(0) int arg0) {
		if (this.aClass24_3 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass181_35.method3972(); local14 != null; local14 = this.aClass181_35.method3975()) {
			if (local14.aLong401 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class2 local44 = new Class2();
		local44.aLong401 = arg0;
		this.aClass181_35.method3973(local44);
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
	public int method5086() {
		if (this.aClass178_2 == null) {
			return 0;
		} else if (this.aBoolean438) {
			@Pc(25) Class2 local25 = this.aClass181_37.method3972();
			return local25 == null ? 0 : (int) local25.aLong401;
		} else {
			return this.aClass178_2.anInt4953;
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
	public void method5089() {
		if (this.aClass181_37 != null) {
			if (this.method5076() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(127) Class2 local127;
			if (this.aBoolean438) {
				local26 = true;
				for (local31 = this.aClass181_37.method3972(); local31 != null; local31 = this.aClass181_37.method3975()) {
					local37 = (int) local31.aLong401;
					if (this.aByteArray69[local37] == 0) {
						this.method5093(local37, 1);
					}
					if (this.aByteArray69[local37] == 0) {
						local26 = false;
					} else {
						local31.method6260();
					}
				}
				while (this.aClass178_2.anIntArray414.length > this.anInt6410) {
					if (this.aClass178_2.anIntArray414[this.anInt6410] == 0) {
						this.anInt6410++;
					} else {
						if (this.aClass58_2.anInt1265 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray69[this.anInt6410] == 0) {
							this.method5093(this.anInt6410, 1);
						}
						if (this.aByteArray69[this.anInt6410] == 0) {
							local127 = new Class2();
							local127.aLong401 = this.anInt6410;
							this.aClass181_37.method3973(local127);
							local26 = false;
						}
						this.anInt6410++;
					}
				}
				if (local26) {
					this.anInt6410 = 0;
					this.aBoolean438 = false;
				}
			} else if (this.aBoolean439) {
				local26 = true;
				for (local31 = this.aClass181_37.method3972(); local31 != null; local31 = this.aClass181_37.method3975()) {
					local37 = (int) local31.aLong401;
					if (this.aByteArray69[local37] != 1) {
						this.method5093(local37, 2);
					}
					if (this.aByteArray69[local37] == 1) {
						local31.method6260();
					} else {
						local26 = false;
					}
				}
				while (this.aClass178_2.anIntArray414.length > this.anInt6410) {
					if (this.aClass178_2.anIntArray414[this.anInt6410] == 0) {
						this.anInt6410++;
					} else {
						if (this.aClass249_3.method5698()) {
							local26 = false;
							break;
						}
						if (this.aByteArray69[this.anInt6410] != 1) {
							this.method5093(this.anInt6410, 2);
						}
						if (this.aByteArray69[this.anInt6410] != 1) {
							local127 = new Class2();
							local127.aLong401 = this.anInt6410;
							this.aClass181_37.method3973(local127);
							local26 = false;
						}
						this.anInt6410++;
					}
				}
				if (local26) {
					this.aBoolean439 = false;
					this.anInt6410 = 0;
				}
			} else {
				this.aClass181_37 = null;
			}
		}
		if (!this.aBoolean440 || this.aLong335 > Static432.method5870()) {
			return;
		}
		for (@Pc(320) Class2_Sub1_Sub7 local320 = (Class2_Sub1_Sub7) this.aClass220_35.method5096(); local320 != null; local320 = (Class2_Sub1_Sub7) this.aClass220_35.method5098()) {
			if (!local320.aBoolean225) {
				if (local320.aBoolean227) {
					if (!local320.aBoolean226) {
						throw new RuntimeException();
					}
					local320.method6260();
				} else {
					local320.aBoolean227 = true;
				}
			}
		}
		this.aLong335 = Static432.method5870() + 1000L;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
	public void method5090() {
		if (this.aClass24_3 != null) {
			this.aBoolean439 = true;
			if (this.aClass181_37 == null) {
				this.aClass181_37 = new Class181();
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)I")
	public int method5091() {
		return this.anInt6409;
	}

	@OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)I")
	public int method5092() {
		return this.aClass178_2 == null ? 0 : this.aClass178_2.anInt4953;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lclient!vb;")
	private Class2_Sub1_Sub7 method5093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub1_Sub7 local13 = (Class2_Sub1_Sub7) this.aClass220_35.method5099((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean226 && local13.aBoolean225) {
			local13.method6260();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass24_3 == null || this.aByteArray69[arg0] == -1) {
					if (this.aClass249_3.method5699()) {
						return null;
					}
					local13 = this.aClass249_3.method5700(true, this.anInt6397, arg0, (byte) 2);
				} else {
					local13 = this.aClass58_2.method1157(arg0, this.aClass24_3);
				}
			} else if (arg1 == 1) {
				if (this.aClass24_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass58_2.method1162(arg0, this.aClass24_3);
			} else if (arg1 == 2) {
				if (this.aClass24_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray69[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass249_3.method5698()) {
					return null;
				}
				local13 = this.aClass249_3.method5700(false, this.anInt6397, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass220_35.method5104(local13, (long) arg0);
		}
		if (local13.aBoolean225) {
			return null;
		}
		@Pc(157) byte[] local157 = local13.method2817();
		@Pc(189) int local189;
		@Pc(289) Class2_Sub1_Sub7_Sub2 local289;
		if (!(local13 instanceof Class2_Sub1_Sub7_Sub1)) {
			try {
				if (local157 == null || local157.length <= 2) {
					throw new RuntimeException();
				}
				Static114.aCRC32_1.reset();
				Static114.aCRC32_1.update(local157, 0, local157.length - 2);
				local189 = (int) Static114.aCRC32_1.getValue();
				if (this.aClass178_2.anIntArray415[arg0] != local189) {
					throw new RuntimeException();
				}
				this.aClass249_3.anInt7128 = 0;
				this.aClass249_3.anInt7127 = 0;
			} catch (@Pc(345) RuntimeException local345) {
				this.aClass249_3.method5697();
				local13.method6260();
				if (local13.aBoolean226 && !this.aClass249_3.method5699()) {
					local289 = this.aClass249_3.method5700(true, this.anInt6397, arg0, (byte) 2);
					this.aClass220_35.method5104(local289, (long) arg0);
				}
				return null;
			}
			local157[local157.length - 2] = (byte) (this.aClass178_2.anIntArray410[arg0] >>> 8);
			local157[local157.length - 1] = (byte) this.aClass178_2.anIntArray410[arg0];
			if (this.aClass24_3 != null) {
				this.aClass58_2.method1161(this.aClass24_3, arg0, local157);
				if (this.aByteArray69[arg0] != 1) {
					this.anInt6409++;
					this.aByteArray69[arg0] = 1;
				}
			}
			if (!local13.aBoolean226) {
				local13.method6260();
			}
			return local13;
		}
		try {
			if (local157 == null || local157.length <= 2) {
				throw new RuntimeException();
			}
			Static114.aCRC32_1.reset();
			Static114.aCRC32_1.update(local157, 0, local157.length - 2);
			local189 = (int) Static114.aCRC32_1.getValue();
			if (local189 != this.aClass178_2.anIntArray415[arg0]) {
				throw new RuntimeException();
			}
			@Pc(220) int local220 = (local157[local157.length - 1] & 0xFF) + ((local157[local157.length - 2] & 0xFF) << 8);
			if (local220 != (this.aClass178_2.anIntArray410[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray69[arg0] != 1) {
				this.anInt6409++;
				this.aByteArray69[arg0] = 1;
			}
			if (!local13.aBoolean226) {
				local13.method6260();
			}
			return local13;
		} catch (@Pc(263) Exception local263) {
			this.aByteArray69[arg0] = -1;
			local13.method6260();
			if (local13.aBoolean226 && !this.aClass249_3.method5699()) {
				local289 = this.aClass249_3.method5700(true, this.anInt6397, arg0, (byte) 2);
				this.aClass220_35.method5104(local289, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
	public void method5094() {
		if (this.aClass181_37 == null || this.method5076() == null) {
			return;
		}
		for (@Pc(19) Class2 local19 = this.aClass181_35.method3972(); local19 != null; local19 = this.aClass181_35.method3975()) {
			@Pc(25) int local25 = (int) local19.aLong401;
			if (local25 < 0 || this.aClass178_2.anInt4955 <= local25 || this.aClass178_2.anIntArray414[local25] == 0) {
				local19.method6260();
			} else {
				if (this.aByteArray69[local25] == 0) {
					this.method5093(local25, 1);
				}
				if (this.aByteArray69[local25] == -1) {
					this.method5093(local25, 2);
				}
				if (this.aByteArray69[local25] == 1) {
					local19.method6260();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(II)I")
	@Override
	public int method5080(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub1_Sub7 local16 = (Class2_Sub1_Sub7) this.aClass220_35.method5099((long) arg0);
		return local16 == null ? 0 : local16.method2818();
	}
}
