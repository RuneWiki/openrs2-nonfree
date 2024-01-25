import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "[I")
	public static final int[] anIntArray564 = new int[256];

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "Lclient!sv;")
	private Class312 aClass312_2;

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!rfa", name = "I", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "I")
	private int anInt8294 = 0;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!mp;")
	private final Class222 aClass222_33 = new Class222(16);

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
	private int anInt8301 = 0;

	@OriginalMember(owner = "client!rfa", name = "K", descriptor = "Lclient!nt;")
	private final Class238 aClass238_55 = new Class238();

	@OriginalMember(owner = "client!rfa", name = "N", descriptor = "J")
	private long aLong227 = 0L;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lclient!pk;")
	private final Class262 aClass262_2;

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
	private final int anInt8291;

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "Z")
	private boolean aBoolean619;

	@OriginalMember(owner = "client!rfa", name = "M", descriptor = "Lclient!nt;")
	private Class238 aClass238_56;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "Lclient!tl;")
	private final Class325 aClass325_3;

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "Lclient!kha;")
	private final Class190 aClass190_3;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "Lclient!pk;")
	private final Class262 aClass262_3;

	@OriginalMember(owner = "client!rfa", name = "O", descriptor = "Z")
	private final boolean aBoolean620;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	private final int anInt8287;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "I")
	private final int anInt8288;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "Lclient!kt;")
	private Class2_Sub5_Sub6 aClass2_Sub5_Sub6_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray564[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(ILclient!pk;Lclient!pk;Lclient!kha;Lclient!tl;I[BIZ)V")
	public Class167_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class262 arg1, @OriginalArg(2) Class262 arg2, @OriginalArg(3) Class190 arg3, @OriginalArg(4) Class325 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass262_2 = arg1;
		this.anInt8291 = arg0;
		if (this.aClass262_2 == null) {
			this.aBoolean619 = false;
		} else {
			this.aBoolean619 = true;
			this.aClass238_56 = new Class238();
		}
		this.aClass325_3 = arg4;
		this.aClass190_3 = arg3;
		this.aClass262_3 = arg2;
		this.aBoolean620 = arg8;
		this.anInt8287 = arg7;
		this.aByteArray78 = arg6;
		this.anInt8288 = arg5;
		if (this.aClass262_3 != null) {
			this.aClass2_Sub5_Sub6_1 = this.aClass325_3.method7650(this.aClass262_3, this.anInt8291);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IB)[B")
	@Override
	public byte[] method6955(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub5_Sub6 local9 = this.method6966(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4188();
			local9.method8599();
			return local25;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)V")
	@Override
	public void method6957(@OriginalArg(1) int arg0) {
		if (this.aClass262_2 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass238_55.method5833(); local14 != null; local14 = this.aClass238_55.method5838()) {
			if ((long) arg0 == local14.aLong287) {
				return;
			}
		}
		@Pc(41) Class2 local41 = new Class2();
		local41.aLong287 = arg0;
		this.aClass238_55.method5837(local41);
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)V")
	public void method6958() {
		if (this.aClass262_2 != null) {
			this.aBoolean618 = true;
			if (this.aClass238_56 == null) {
				this.aClass238_56 = new Class238();
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)I")
	public int method6959() {
		if (this.aClass312_2 == null) {
			return 0;
		} else if (this.aBoolean619) {
			@Pc(29) Class2 local29 = this.aClass238_56.method5833();
			return local29 == null ? 0 : (int) local29.aLong287;
		} else {
			return this.aClass312_2.anInt8895;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)I")
	public int method6960() {
		return this.aClass312_2 == null ? 0 : this.aClass312_2.anInt8895;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)I")
	public int method6961() {
		return this.anInt8294;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)Lclient!sv;")
	@Override
	public Class312 method6953() {
		if (this.aClass312_2 != null) {
			return this.aClass312_2;
		}
		if (this.aClass2_Sub5_Sub6_1 == null) {
			if (this.aClass190_3.method4613()) {
				return null;
			}
			this.aClass2_Sub5_Sub6_1 = this.aClass190_3.method4607((byte) 0, this.anInt8291, 255, true);
		}
		if (this.aClass2_Sub5_Sub6_1.aBoolean400) {
			return null;
		}
		@Pc(41) byte[] local41 = this.aClass2_Sub5_Sub6_1.method4188();
		if (this.aClass2_Sub5_Sub6_1 instanceof Class2_Sub5_Sub6_Sub2) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass312_2 = new Class312(local41, this.anInt8288, this.aByteArray78);
				if (this.aClass312_2.anInt8893 != this.anInt8287) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass312_2 = null;
				if (this.aClass190_3.method4613()) {
					this.aClass2_Sub5_Sub6_1 = null;
				} else {
					this.aClass2_Sub5_Sub6_1 = this.aClass190_3.method4607((byte) 0, this.anInt8291, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass312_2 = new Class312(local41, this.anInt8288, this.aByteArray78);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass190_3.method4604();
				this.aClass312_2 = null;
				if (this.aClass190_3.method4613()) {
					this.aClass2_Sub5_Sub6_1 = null;
				} else {
					this.aClass2_Sub5_Sub6_1 = this.aClass190_3.method4607((byte) 0, this.anInt8291, 255, true);
				}
				return null;
			}
			if (this.aClass262_3 != null) {
				this.aClass325_3.method7652(this.aClass262_3, local41, this.anInt8291);
			}
		}
		if (this.aClass262_2 != null) {
			this.anInt8294 = 0;
			this.aByteArray79 = new byte[this.aClass312_2.anInt8892];
		}
		this.aClass2_Sub5_Sub6_1 = null;
		return this.aClass312_2;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I")
	@Override
	public int method6954(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub5_Sub6 local15 = (Class2_Sub5_Sub6) this.aClass222_33.method5468((long) arg0);
		return local15 == null ? 0 : local15.method4186();
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)I")
	public int method6963() {
		if (this.method6953() == null) {
			return this.aClass2_Sub5_Sub6_1 == null ? 0 : this.aClass2_Sub5_Sub6_1.method4186();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
	public void method6964() {
		if (this.aClass238_56 != null) {
			if (this.method6953() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class2 local26;
			@Pc(32) int local32;
			@Pc(124) Class2 local124;
			if (this.aBoolean619) {
				local21 = true;
				for (local26 = this.aClass238_56.method5833(); local26 != null; local26 = this.aClass238_56.method5838()) {
					local32 = (int) local26.aLong287;
					if (this.aByteArray79[local32] == 0) {
						this.method6966(local32, 1);
					}
					if (this.aByteArray79[local32] == 0) {
						local21 = false;
					} else {
						local26.method8599();
					}
				}
				while (this.aClass312_2.anIntArray620.length > this.anInt8301) {
					if (this.aClass312_2.anIntArray620[this.anInt8301] == 0) {
						this.anInt8301++;
					} else {
						if (this.aClass325_3.anInt9100 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray79[this.anInt8301] == 0) {
							this.method6966(this.anInt8301, 1);
						}
						if (this.aByteArray79[this.anInt8301] == 0) {
							local124 = new Class2();
							local124.aLong287 = this.anInt8301;
							this.aClass238_56.method5837(local124);
							local21 = false;
						}
						this.anInt8301++;
					}
				}
				if (local21) {
					this.anInt8301 = 0;
					this.aBoolean619 = false;
				}
			} else if (this.aBoolean618) {
				local21 = true;
				for (local26 = this.aClass238_56.method5833(); local26 != null; local26 = this.aClass238_56.method5838()) {
					local32 = (int) local26.aLong287;
					if (this.aByteArray79[local32] != 1) {
						this.method6966(local32, 2);
					}
					if (this.aByteArray79[local32] == 1) {
						local26.method8599();
					} else {
						local21 = false;
					}
				}
				while (this.anInt8301 < this.aClass312_2.anIntArray620.length) {
					if (this.aClass312_2.anIntArray620[this.anInt8301] == 0) {
						this.anInt8301++;
					} else {
						if (this.aClass190_3.method4614()) {
							local21 = false;
							break;
						}
						if (this.aByteArray79[this.anInt8301] != 1) {
							this.method6966(this.anInt8301, 2);
						}
						if (this.aByteArray79[this.anInt8301] != 1) {
							local124 = new Class2();
							local124.aLong287 = this.anInt8301;
							this.aClass238_56.method5837(local124);
							local21 = false;
						}
						this.anInt8301++;
					}
				}
				if (local21) {
					this.anInt8301 = 0;
					this.aBoolean618 = false;
				}
			} else {
				this.aClass238_56 = null;
			}
		}
		if (!this.aBoolean620 || this.aLong227 > Static438.method6517()) {
			return;
		}
		for (@Pc(337) Class2_Sub5_Sub6 local337 = (Class2_Sub5_Sub6) this.aClass222_33.method5474(); local337 != null; local337 = (Class2_Sub5_Sub6) this.aClass222_33.method5472()) {
			if (!local337.aBoolean400) {
				if (local337.aBoolean402) {
					if (!local337.aBoolean401) {
						throw new RuntimeException();
					}
					local337.method8599();
				} else {
					local337.aBoolean402 = true;
				}
			}
		}
		this.aLong227 = Static438.method6517() + 1000L;
	}

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)V")
	public void method6965() {
		if (this.aClass238_56 == null || this.method6953() == null) {
			return;
		}
		for (@Pc(19) Class2 local19 = this.aClass238_55.method5833(); local19 != null; local19 = this.aClass238_55.method5838()) {
			@Pc(25) int local25 = (int) local19.aLong287;
			if (local25 < 0 || this.aClass312_2.anInt8892 <= local25 || this.aClass312_2.anIntArray620[local25] == 0) {
				local19.method8599();
			} else {
				if (this.aByteArray79[local25] == 0) {
					this.method6966(local25, 1);
				}
				if (this.aByteArray79[local25] == -1) {
					this.method6966(local25, 2);
				}
				if (this.aByteArray79[local25] == 1) {
					local19.method8599();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IBI)Lclient!kt;")
	private Class2_Sub5_Sub6 method6966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class2_Sub5_Sub6 local11 = (Class2_Sub5_Sub6) this.aClass222_33.method5468((long) arg0);
		if (local11 != null && arg1 == 0 && !local11.aBoolean401 && local11.aBoolean400) {
			local11.method8599();
			local11 = null;
		}
		if (local11 == null) {
			if (arg1 == 0) {
				if (this.aClass262_2 == null || this.aByteArray79[arg0] == -1) {
					if (this.aClass190_3.method4613()) {
						return null;
					}
					local11 = this.aClass190_3.method4607((byte) 2, arg0, this.anInt8291, true);
				} else {
					local11 = this.aClass325_3.method7650(this.aClass262_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass262_2 == null) {
					throw new RuntimeException();
				}
				local11 = this.aClass325_3.method7649(arg0, this.aClass262_2);
			} else if (arg1 == 2) {
				if (this.aClass262_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray79[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass190_3.method4614()) {
					return null;
				}
				local11 = this.aClass190_3.method4607((byte) 2, arg0, this.anInt8291, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass222_33.method5476(local11, (long) arg0);
		}
		if (local11.aBoolean400) {
			return null;
		}
		@Pc(154) byte[] local154 = local11.method4188();
		@Pc(181) int local181;
		@Pc(208) byte[] local208;
		@Pc(217) byte[] local217;
		@Pc(219) int local219;
		@Pc(276) Class2_Sub5_Sub6_Sub1 local276;
		if (!(local11 instanceof Class2_Sub5_Sub6_Sub2)) {
			try {
				if (local154 == null || local154.length <= 2) {
					throw new RuntimeException();
				}
				Static462.aCRC32_1.reset();
				Static462.aCRC32_1.update(local154, 0, local154.length - 2);
				local181 = (int) Static462.aCRC32_1.getValue();
				if (local181 != this.aClass312_2.anIntArray619[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass312_2.aByteArrayArray22 != null && this.aClass312_2.aByteArrayArray22[arg0] != null) {
					local208 = this.aClass312_2.aByteArrayArray22[arg0];
					local217 = Static575.method7996(local154.length - 2, local154, 0);
					for (local219 = 0; local219 < 64; local219++) {
						if (local208[local219] != local217[local219]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass190_3.anInt5525 = 0;
				this.aClass190_3.anInt5524 = 0;
			} catch (@Pc(247) RuntimeException local247) {
				this.aClass190_3.method4604();
				local11.method8599();
				if (local11.aBoolean401 && !this.aClass190_3.method4613()) {
					local276 = this.aClass190_3.method4607((byte) 2, arg0, this.anInt8291, true);
					this.aClass222_33.method5476(local276, (long) arg0);
				}
				return null;
			}
			local154[local154.length - 2] = (byte) (this.aClass312_2.anIntArray618[arg0] >>> 8);
			local154[local154.length - 1] = (byte) this.aClass312_2.anIntArray618[arg0];
			if (this.aClass262_2 != null) {
				this.aClass325_3.method7652(this.aClass262_2, local154, arg0);
				if (this.aByteArray79[arg0] != 1) {
					this.anInt8294++;
					this.aByteArray79[arg0] = 1;
				}
			}
			if (!local11.aBoolean401) {
				local11.method8599();
			}
			return local11;
		}
		try {
			if (local154 == null || local154.length <= 2) {
				throw new RuntimeException();
			}
			Static462.aCRC32_1.reset();
			Static462.aCRC32_1.update(local154, 0, local154.length - 2);
			local181 = (int) Static462.aCRC32_1.getValue();
			if (local181 != this.aClass312_2.anIntArray619[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass312_2.aByteArrayArray22 != null && this.aClass312_2.aByteArrayArray22[arg0] != null) {
				local208 = this.aClass312_2.aByteArrayArray22[arg0];
				local217 = Static575.method7996(local154.length - 2, local154, 0);
				for (local219 = 0; local219 < 64; local219++) {
					if (local217[local219] != local208[local219]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(453) int local453 = ((local154[local154.length - 2] & 0xFF) << 8) + (local154[local154.length - 1] & 0xFF);
			if ((this.aClass312_2.anIntArray618[arg0] & 0xFFFF) != local453) {
				throw new RuntimeException();
			}
			if (this.aByteArray79[arg0] != 1) {
				this.anInt8294++;
				this.aByteArray79[arg0] = 1;
			}
			if (!local11.aBoolean401) {
				local11.method8599();
			}
			return local11;
		} catch (@Pc(500) Exception local500) {
			this.aByteArray79[arg0] = -1;
			local11.method8599();
			if (local11.aBoolean401 && !this.aClass190_3.method4613()) {
				local276 = this.aClass190_3.method4607((byte) 2, arg0, this.anInt8291, true);
				this.aClass222_33.method5476(local276, (long) arg0);
			}
			return null;
		}
	}
}
