import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class152_Sub1 extends Class152 {

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[32896];

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Lclient!vm;")
	private Class208 aClass208_2;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!oq", name = "I", descriptor = "Z")
	private boolean aBoolean263;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
	private int anInt4652 = 0;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!bo;")
	private final Class24 aClass24_22 = new Class24(16);

	@OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
	private int anInt4667 = 0;

	@OriginalMember(owner = "client!oq", name = "L", descriptor = "Lclient!m;")
	private final Class127 aClass127_24 = new Class127();

	@OriginalMember(owner = "client!oq", name = "R", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!oq", name = "H", descriptor = "Lclient!eg;")
	private final Class55 aClass55_4;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	private final int anInt4649;

	@OriginalMember(owner = "client!oq", name = "K", descriptor = "Z")
	private boolean aBoolean264;

	@OriginalMember(owner = "client!oq", name = "J", descriptor = "Lclient!m;")
	private Class127 aClass127_23;

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "Lclient!eg;")
	private final Class55 aClass55_3;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	private final int anInt4653;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	private final int anInt4655;

	@OriginalMember(owner = "client!oq", name = "Q", descriptor = "Z")
	private final boolean aBoolean266;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "Lclient!pq;")
	private final Class163 aClass163_3;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "Lclient!ha;")
	private final Class78 aClass78_2;

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "Lclient!pd;")
	private Class3_Sub7_Sub17 aClass3_Sub7_Sub17_1;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray75[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILclient!eg;Lclient!eg;Lclient!pq;Lclient!ha;IIZ)V")
	public Class152_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass55_4 = arg1;
		this.anInt4649 = arg0;
		if (this.aClass55_4 == null) {
			this.aBoolean264 = false;
		} else {
			this.aBoolean264 = true;
			this.aClass127_23 = new Class127();
		}
		this.aClass55_3 = arg2;
		this.anInt4653 = arg6;
		this.anInt4655 = arg5;
		this.aBoolean266 = arg7;
		this.aClass163_3 = arg3;
		this.aClass78_2 = arg4;
		if (this.aClass55_3 != null) {
			this.aClass3_Sub7_Sub17_1 = this.aClass78_2.method1936(this.anInt4649, this.aClass55_3);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
	public int method3967() {
		if (this.aClass208_2 == null) {
			return 0;
		} else if (this.aBoolean264) {
			@Pc(26) Class3 local26 = this.aClass127_23.method3402();
			return local26 == null ? 0 : (int) local26.aLong211;
		} else {
			return this.aClass208_2.anInt6511;
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
	public void method3968() {
		if (this.aClass127_23 == null || this.method3962() == null) {
			return;
		}
		for (@Pc(19) Class3 local19 = this.aClass127_24.method3402(); local19 != null; local19 = this.aClass127_24.method3400()) {
			@Pc(25) int local25 = (int) local19.aLong211;
			if (local25 < 0 || this.aClass208_2.anInt6504 <= local25 || this.aClass208_2.anIntArray542[local25] == 0) {
				local19.method5717();
			} else {
				if (this.aByteArray74[local25] == 0) {
					this.method3978(1, local25);
				}
				if (this.aByteArray74[local25] == -1) {
					this.method3978(2, local25);
				}
				if (this.aByteArray74[local25] == 1) {
					local19.method5717();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)I")
	public int method3969() {
		if (this.method3962() == null) {
			return this.aClass3_Sub7_Sub17_1 == null ? 0 : this.aClass3_Sub7_Sub17_1.method4375();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)V")
	public void method3970() {
		if (this.aClass55_4 != null) {
			this.aBoolean263 = true;
			if (this.aClass127_23 == null) {
				this.aClass127_23 = new Class127();
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class208 method3962() {
		if (this.aClass208_2 != null) {
			return this.aClass208_2;
		}
		if (this.aClass3_Sub7_Sub17_1 == null) {
			if (this.aClass163_3.method4168()) {
				return null;
			}
			this.aClass3_Sub7_Sub17_1 = this.aClass163_3.method4167((byte) 0, this.anInt4649, true, 255);
		}
		if (this.aClass3_Sub7_Sub17_1.aBoolean300) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass3_Sub7_Sub17_1.method4374();
		if (this.aClass3_Sub7_Sub17_1 instanceof Class3_Sub7_Sub17_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass208_2 = new Class208(local51, this.anInt4655);
				if (this.aClass208_2.anInt6513 != this.anInt4653) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass208_2 = null;
				if (this.aClass163_3.method4168()) {
					this.aClass3_Sub7_Sub17_1 = null;
				} else {
					this.aClass3_Sub7_Sub17_1 = this.aClass163_3.method4167((byte) 0, this.anInt4649, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass208_2 = new Class208(local51, this.anInt4655);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass163_3.method4173();
				this.aClass208_2 = null;
				if (this.aClass163_3.method4168()) {
					this.aClass3_Sub7_Sub17_1 = null;
				} else {
					this.aClass3_Sub7_Sub17_1 = this.aClass163_3.method4167((byte) 0, this.anInt4649, true, 255);
				}
				return null;
			}
			if (this.aClass55_3 != null) {
				this.aClass78_2.method1935(this.anInt4649, local51, this.aClass55_3);
			}
		}
		this.aClass3_Sub7_Sub17_1 = null;
		if (this.aClass55_4 != null) {
			this.aByteArray74 = new byte[this.aClass208_2.anInt6504];
			this.anInt4652 = 0;
		}
		return this.aClass208_2;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
	@Override
	public int method3963(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub7_Sub17 local16 = (Class3_Sub7_Sub17) this.aClass24_22.method609((long) arg0);
		return local16 == null ? 0 : local16.method4375();
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3964(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub7_Sub17 local19 = this.method3978(0, arg0);
		if (local19 == null) {
			return null;
		} else {
			@Pc(27) byte[] local27 = local19.method4374();
			local19.method5717();
			return local27;
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(II)V")
	@Override
	public void method3965(@OriginalArg(0) int arg0) {
		if (this.aClass55_4 == null) {
			return;
		}
		for (@Pc(16) Class3 local16 = this.aClass127_24.method3402(); local16 != null; local16 = this.aClass127_24.method3400()) {
			if (local16.aLong211 == (long) arg0) {
				return;
			}
		}
		@Pc(36) Class3 local36 = new Class3();
		local36.aLong211 = arg0;
		this.aClass127_24.method3387(local36);
	}

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)V")
	public void method3974() {
		if (this.aClass127_23 != null) {
			if (this.method3962() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class3 local26;
			@Pc(32) int local32;
			@Pc(122) Class3 local122;
			if (this.aBoolean264) {
				local21 = true;
				for (local26 = this.aClass127_23.method3402(); local26 != null; local26 = this.aClass127_23.method3400()) {
					local32 = (int) local26.aLong211;
					if (this.aByteArray74[local32] == 0) {
						this.method3978(1, local32);
					}
					if (this.aByteArray74[local32] == 0) {
						local21 = false;
					} else {
						local26.method5717();
					}
				}
				while (this.aClass208_2.anIntArray542.length > this.anInt4667) {
					if (this.aClass208_2.anIntArray542[this.anInt4667] == 0) {
						this.anInt4667++;
					} else {
						if (this.aClass78_2.anInt2365 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray74[this.anInt4667] == 0) {
							this.method3978(1, this.anInt4667);
						}
						if (this.aByteArray74[this.anInt4667] == 0) {
							local122 = new Class3();
							local122.aLong211 = this.anInt4667;
							this.aClass127_23.method3387(local122);
							local21 = false;
						}
						this.anInt4667++;
					}
				}
				if (local21) {
					this.aBoolean264 = false;
					this.anInt4667 = 0;
				}
			} else if (this.aBoolean263) {
				local21 = true;
				for (local26 = this.aClass127_23.method3402(); local26 != null; local26 = this.aClass127_23.method3400()) {
					local32 = (int) local26.aLong211;
					if (this.aByteArray74[local32] != 1) {
						this.method3978(2, local32);
					}
					if (this.aByteArray74[local32] == 1) {
						local26.method5717();
					} else {
						local21 = false;
					}
				}
				while (this.aClass208_2.anIntArray542.length > this.anInt4667) {
					if (this.aClass208_2.anIntArray542[this.anInt4667] == 0) {
						this.anInt4667++;
					} else {
						if (this.aClass163_3.method4165()) {
							local21 = false;
							break;
						}
						if (this.aByteArray74[this.anInt4667] != 1) {
							this.method3978(2, this.anInt4667);
						}
						if (this.aByteArray74[this.anInt4667] != 1) {
							local122 = new Class3();
							local122.aLong211 = this.anInt4667;
							this.aClass127_23.method3387(local122);
							local21 = false;
						}
						this.anInt4667++;
					}
				}
				if (local21) {
					this.aBoolean263 = false;
					this.anInt4667 = 0;
				}
			} else {
				this.aClass127_23 = null;
			}
		}
		if (!this.aBoolean266 || Static53.method898() < this.aLong154) {
			return;
		}
		for (@Pc(316) Class3_Sub7_Sub17 local316 = (Class3_Sub7_Sub17) this.aClass24_22.method595(); local316 != null; local316 = (Class3_Sub7_Sub17) this.aClass24_22.method602()) {
			if (!local316.aBoolean300) {
				if (local316.aBoolean298) {
					if (!local316.aBoolean299) {
						throw new RuntimeException();
					}
					local316.method5717();
				} else {
					local316.aBoolean298 = true;
				}
			}
		}
		this.aLong154 = Static53.method898() + 1000L;
	}

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)I")
	public int method3976() {
		return this.anInt4652;
	}

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)I")
	public int method3977() {
		return this.aClass208_2 == null ? 0 : this.aClass208_2.anInt6511;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Lclient!pd;")
	private Class3_Sub7_Sub17 method3978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class3_Sub7_Sub17 local21 = (Class3_Sub7_Sub17) this.aClass24_22.method609((long) arg1);
		if (local21 != null && arg0 == 0 && !local21.aBoolean299 && local21.aBoolean300) {
			local21.method5717();
			local21 = null;
		}
		if (local21 == null) {
			if (arg0 == 0) {
				if (this.aClass55_4 == null || this.aByteArray74[arg1] == -1) {
					if (this.aClass163_3.method4168()) {
						return null;
					}
					local21 = this.aClass163_3.method4167((byte) 2, arg1, true, this.anInt4649);
				} else {
					local21 = this.aClass78_2.method1936(arg1, this.aClass55_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass55_4 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass78_2.method1938(arg1, this.aClass55_4);
			} else if (arg0 == 2) {
				if (this.aClass55_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray74[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass163_3.method4165()) {
					return null;
				}
				local21 = this.aClass163_3.method4167((byte) 2, arg1, false, this.anInt4649);
			} else {
				throw new RuntimeException();
			}
			this.aClass24_22.method598((long) arg1, local21);
		}
		if (local21.aBoolean300) {
			return null;
		}
		@Pc(162) byte[] local162 = local21.method4374();
		@Pc(191) int local191;
		@Pc(287) Class3_Sub7_Sub17_Sub2 local287;
		if (!(local21 instanceof Class3_Sub7_Sub17_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static212.aCRC32_2.reset();
				Static212.aCRC32_2.update(local162, 0, local162.length - 2);
				local191 = (int) Static212.aCRC32_2.getValue();
				if (this.aClass208_2.anIntArray547[arg1] != local191) {
					throw new RuntimeException();
				}
				this.aClass163_3.anInt4855 = 0;
				this.aClass163_3.anInt4856 = 0;
			} catch (@Pc(343) RuntimeException local343) {
				this.aClass163_3.method4173();
				local21.method5717();
				if (local21.aBoolean299 && !this.aClass163_3.method4168()) {
					local287 = this.aClass163_3.method4167((byte) 2, arg1, true, this.anInt4649);
					this.aClass24_22.method598((long) arg1, local287);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass208_2.anIntArray543[arg1] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass208_2.anIntArray543[arg1];
			if (this.aClass55_4 != null) {
				this.aClass78_2.method1935(arg1, local162, this.aClass55_4);
				if (this.aByteArray74[arg1] != 1) {
					this.anInt4652++;
					this.aByteArray74[arg1] = 1;
				}
			}
			if (!local21.aBoolean299) {
				local21.method5717();
			}
			return local21;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static212.aCRC32_2.reset();
			Static212.aCRC32_2.update(local162, 0, local162.length - 2);
			local191 = (int) Static212.aCRC32_2.getValue();
			if (local191 != this.aClass208_2.anIntArray547[arg1]) {
				throw new RuntimeException();
			}
			@Pc(222) int local222 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if (local222 != (this.aClass208_2.anIntArray543[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray74[arg1] != 1) {
				this.anInt4652++;
				this.aByteArray74[arg1] = 1;
			}
			if (!local21.aBoolean299) {
				local21.method5717();
			}
			return local21;
		} catch (@Pc(261) Exception local261) {
			this.aByteArray74[arg1] = -1;
			local21.method5717();
			if (local21.aBoolean299 && !this.aClass163_3.method4168()) {
				local287 = this.aClass163_3.method4167((byte) 2, arg1, true, this.anInt4649);
				this.aClass24_22.method598((long) arg1, local287);
			}
			return null;
		}
	}
}
