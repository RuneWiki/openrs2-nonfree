import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "Lclient!rf;")
	private Class300 aClass300_1;

	@OriginalMember(owner = "client!maa", name = "N", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
	private int anInt5999 = 0;

	@OriginalMember(owner = "client!maa", name = "F", descriptor = "Lclient!tba;")
	private final Class323 aClass323_21 = new Class323(16);

	@OriginalMember(owner = "client!maa", name = "O", descriptor = "I")
	private int anInt6010 = 0;

	@OriginalMember(owner = "client!maa", name = "K", descriptor = "Lclient!fh;")
	private final Class114 aClass114_30 = new Class114();

	@OriginalMember(owner = "client!maa", name = "Q", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!maa", name = "B", descriptor = "Lclient!uj;")
	private final Class349 aClass349_2;

	@OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
	private final int anInt6008;

	@OriginalMember(owner = "client!maa", name = "M", descriptor = "Z")
	private boolean aBoolean427;

	@OriginalMember(owner = "client!maa", name = "L", descriptor = "Lclient!fh;")
	private Class114 aClass114_31;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "I")
	private final int anInt5992;

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
	private final int anInt5991;

	@OriginalMember(owner = "client!maa", name = "P", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "Lclient!fi;")
	private final Class116 aClass116_3;

	@OriginalMember(owner = "client!maa", name = "p", descriptor = "Lclient!uj;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!maa", name = "h", descriptor = "[B")
	private final byte[] aByteArray57;

	@OriginalMember(owner = "client!maa", name = "E", descriptor = "Lclient!sw;")
	private final Class322 aClass322_3;

	@OriginalMember(owner = "client!maa", name = "y", descriptor = "Lclient!uaa;")
	private Class2_Sub7_Sub9 aClass2_Sub7_Sub9_1;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(ILclient!uj;Lclient!uj;Lclient!sw;Lclient!fi;I[BIZ)V")
	public Class87_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) Class349 arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) Class116 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass349_2 = arg1;
		this.anInt6008 = arg0;
		if (this.aClass349_2 == null) {
			this.aBoolean427 = false;
		} else {
			this.aBoolean427 = true;
			this.aClass114_31 = new Class114();
		}
		this.anInt5992 = arg5;
		this.anInt5991 = arg7;
		this.aBoolean429 = arg8;
		this.aClass116_3 = arg4;
		this.aClass349_1 = arg2;
		this.aByteArray57 = arg6;
		this.aClass322_3 = arg3;
		if (this.aClass349_1 != null) {
			this.aClass2_Sub7_Sub9_1 = this.aClass116_3.method2776(this.anInt6008, this.aClass349_1);
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
	public void method5176() {
		if (this.aClass114_31 != null) {
			if (this.method5169() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class2 local26;
			@Pc(32) int local32;
			@Pc(117) Class2 local117;
			if (this.aBoolean427) {
				local21 = true;
				for (local26 = this.aClass114_31.method2772(); local26 != null; local26 = this.aClass114_31.method2762()) {
					local32 = (int) local26.aLong278;
					if (this.aByteArray56[local32] == 0) {
						this.method5186(local32, 1);
					}
					if (this.aByteArray56[local32] == 0) {
						local21 = false;
					} else {
						local26.method8920();
					}
				}
				while (this.aClass300_1.anIntArray570.length > this.anInt6010) {
					if (this.aClass300_1.anIntArray570[this.anInt6010] == 0) {
						this.anInt6010++;
					} else {
						if (this.aClass116_3.anInt3274 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray56[this.anInt6010] == 0) {
							this.method5186(this.anInt6010, 1);
						}
						if (this.aByteArray56[this.anInt6010] == 0) {
							local117 = new Class2();
							local117.aLong278 = (long) this.anInt6010;
							local21 = false;
							this.aClass114_31.method2771(local117);
						}
						this.anInt6010++;
					}
				}
				if (local21) {
					this.anInt6010 = 0;
					this.aBoolean427 = false;
				}
			} else if (this.aBoolean428) {
				local21 = true;
				for (local26 = this.aClass114_31.method2772(); local26 != null; local26 = this.aClass114_31.method2762()) {
					local32 = (int) local26.aLong278;
					if (this.aByteArray56[local32] != 1) {
						this.method5186(local32, 2);
					}
					if (this.aByteArray56[local32] == 1) {
						local26.method8920();
					} else {
						local21 = false;
					}
				}
				while (this.aClass300_1.anIntArray570.length > this.anInt6010) {
					if (this.aClass300_1.anIntArray570[this.anInt6010] == 0) {
						this.anInt6010++;
					} else {
						if (this.aClass322_3.method7437()) {
							local21 = false;
							break;
						}
						if (this.aByteArray56[this.anInt6010] != 1) {
							this.method5186(this.anInt6010, 2);
						}
						if (this.aByteArray56[this.anInt6010] != 1) {
							local117 = new Class2();
							local117.aLong278 = (long) this.anInt6010;
							local21 = false;
							this.aClass114_31.method2771(local117);
						}
						this.anInt6010++;
					}
				}
				if (local21) {
					this.aBoolean428 = false;
					this.anInt6010 = 0;
				}
			} else {
				this.aClass114_31 = null;
			}
		}
		if (!this.aBoolean429 || Static48.method1203() < this.aLong153) {
			return;
		}
		for (@Pc(323) Class2_Sub7_Sub9 local323 = (Class2_Sub7_Sub9) this.aClass323_21.method7480(); local323 != null; local323 = (Class2_Sub7_Sub9) this.aClass323_21.method7482()) {
			if (!local323.aBoolean672) {
				if (local323.aBoolean671) {
					if (!local323.aBoolean670) {
						throw new RuntimeException();
					}
					local323.method8920();
				} else {
					local323.aBoolean671 = true;
				}
			}
		}
		this.aLong153 = Static48.method1203() + 1000L;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method5170(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub7_Sub9 local9 = this.method5186(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method7965();
			local9.method8920();
			return local17;
		}
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
	public void method5177() {
		if (this.aClass114_31 == null || this.method5169() == null) {
			return;
		}
		for (@Pc(27) Class2 local27 = this.aClass114_30.method2772(); local27 != null; local27 = this.aClass114_30.method2762()) {
			@Pc(33) int local33 = (int) local27.aLong278;
			if (local33 < 0 || local33 >= this.aClass300_1.anInt7893 || this.aClass300_1.anIntArray570[local33] == 0) {
				local27.method8920();
			} else {
				if (this.aByteArray56[local33] == 0) {
					this.method5186(local33, 1);
				}
				if (this.aByteArray56[local33] == -1) {
					this.method5186(local33, 2);
				}
				if (this.aByteArray56[local33] == 1) {
					local27.method8920();
				}
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Lclient!rf;")
	@Override
	public Class300 method5169() {
		if (this.aClass300_1 != null) {
			return this.aClass300_1;
		}
		if (this.aClass2_Sub7_Sub9_1 == null) {
			if (this.aClass322_3.method7429()) {
				return null;
			}
			this.aClass2_Sub7_Sub9_1 = this.aClass322_3.method7428(255, true, this.anInt6008, (byte) 0);
		}
		if (this.aClass2_Sub7_Sub9_1.aBoolean672) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass2_Sub7_Sub9_1.method7965();
		if (this.aClass2_Sub7_Sub9_1 instanceof Class2_Sub7_Sub9_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass300_1 = new Class300(local43, this.anInt5992, this.aByteArray57);
				if (this.aClass300_1.anInt7891 != this.anInt5991) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass300_1 = null;
				if (this.aClass322_3.method7429()) {
					this.aClass2_Sub7_Sub9_1 = null;
				} else {
					this.aClass2_Sub7_Sub9_1 = this.aClass322_3.method7428(255, true, this.anInt6008, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass300_1 = new Class300(local43, this.anInt5992, this.aByteArray57);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass322_3.method7441();
				this.aClass300_1 = null;
				if (this.aClass322_3.method7429()) {
					this.aClass2_Sub7_Sub9_1 = null;
				} else {
					this.aClass2_Sub7_Sub9_1 = this.aClass322_3.method7428(255, true, this.anInt6008, (byte) 0);
				}
				return null;
			}
			if (this.aClass349_1 != null) {
				this.aClass116_3.method2779(this.anInt6008, local43, this.aClass349_1);
			}
		}
		this.aClass2_Sub7_Sub9_1 = null;
		if (this.aClass349_2 != null) {
			this.aByteArray56 = new byte[this.aClass300_1.anInt7893];
			this.anInt5999 = 0;
		}
		return this.aClass300_1;
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)I")
	public int method5179() {
		if (this.method5169() == null) {
			return this.aClass2_Sub7_Sub9_1 == null ? 0 : this.aClass2_Sub7_Sub9_1.method7966();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)I")
	public int method5180() {
		return this.anInt5999;
	}

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(II)I")
	@Override
	public int method5174(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub7_Sub9 local16 = (Class2_Sub7_Sub9) this.aClass323_21.method7484((long) arg0);
		return local16 == null ? 0 : local16.method7966();
	}

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)I")
	public int method5183() {
		if (this.aClass300_1 == null) {
			return 0;
		} else if (this.aBoolean427) {
			@Pc(25) Class2 local25 = this.aClass114_31.method2772();
			return local25 == null ? 0 : (int) local25.aLong278;
		} else {
			return this.aClass300_1.anInt7892;
		}
	}

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)V")
	public void method5184() {
		if (this.aClass349_2 != null) {
			this.aBoolean428 = true;
			if (this.aClass114_31 == null) {
				this.aClass114_31 = new Class114();
			}
		}
	}

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "(B)I")
	public int method5185() {
		return this.aClass300_1 == null ? 0 : this.aClass300_1.anInt7892;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZII)Lclient!uaa;")
	private Class2_Sub7_Sub9 method5186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class2_Sub7_Sub9 local19 = (Class2_Sub7_Sub9) this.aClass323_21.method7484((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean670 && local19.aBoolean672) {
			local19.method8920();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass349_2 == null || this.aByteArray56[arg0] == -1) {
					if (this.aClass322_3.method7429()) {
						return null;
					}
					local19 = this.aClass322_3.method7428(this.anInt6008, true, arg0, (byte) 2);
				} else {
					local19 = this.aClass116_3.method2776(arg0, this.aClass349_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass349_2 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass116_3.method2778(this.aClass349_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass349_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray56[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass322_3.method7437()) {
					return null;
				}
				local19 = this.aClass322_3.method7428(this.anInt6008, false, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass323_21.method7477(local19, (long) arg0);
		}
		if (local19.aBoolean672) {
			return null;
		}
		@Pc(159) byte[] local159 = local19.method7965();
		@Pc(188) int local188;
		@Pc(215) byte[] local215;
		@Pc(228) byte[] local228;
		@Pc(230) int local230;
		@Pc(286) Class2_Sub7_Sub9_Sub2 local286;
		if (!(local19 instanceof Class2_Sub7_Sub9_Sub1)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static220.aCRC32_1.reset();
				Static220.aCRC32_1.update(local159, 0, local159.length - 2);
				local188 = (int) Static220.aCRC32_1.getValue();
				if (local188 != this.aClass300_1.anIntArray567[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass300_1.aByteArrayArray20 != null && this.aClass300_1.aByteArrayArray20[arg0] != null) {
					local215 = this.aClass300_1.aByteArrayArray20[arg0];
					local228 = Static595.method8390(local159.length - 2, 0, local159);
					for (local230 = 0; local230 < 64; local230++) {
						if (local215[local230] != local228[local230]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass322_3.anInt8638 = 0;
				this.aClass322_3.anInt8639 = 0;
			} catch (@Pc(261) RuntimeException local261) {
				this.aClass322_3.method7441();
				local19.method8920();
				if (local19.aBoolean670 && !this.aClass322_3.method7429()) {
					local286 = this.aClass322_3.method7428(this.anInt6008, true, arg0, (byte) 2);
					this.aClass323_21.method7477(local286, (long) arg0);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass300_1.anIntArray572[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass300_1.anIntArray572[arg0];
			if (this.aClass349_2 != null) {
				this.aClass116_3.method2779(arg0, local159, this.aClass349_2);
				if (this.aByteArray56[arg0] != 1) {
					this.anInt5999++;
					this.aByteArray56[arg0] = 1;
				}
			}
			if (!local19.aBoolean670) {
				local19.method8920();
			}
			return local19;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static220.aCRC32_1.reset();
			Static220.aCRC32_1.update(local159, 0, local159.length - 2);
			local188 = (int) Static220.aCRC32_1.getValue();
			if (this.aClass300_1.anIntArray567[arg0] != local188) {
				throw new RuntimeException();
			}
			if (this.aClass300_1.aByteArrayArray20 != null && this.aClass300_1.aByteArrayArray20[arg0] != null) {
				local215 = this.aClass300_1.aByteArrayArray20[arg0];
				local228 = Static595.method8390(local159.length - 2, 0, local159);
				for (local230 = 0; local230 < 64; local230++) {
					if (local228[local230] != local215[local230]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(469) int local469 = (local159[local159.length - 1] & 0xFF) + ((local159[local159.length - 2] & 0xFF) << 8);
			if ((this.aClass300_1.anIntArray572[arg0] & 0xFFFF) != local469) {
				throw new RuntimeException();
			}
			if (this.aByteArray56[arg0] != 1) {
				this.anInt5999++;
				this.aByteArray56[arg0] = 1;
			}
			if (!local19.aBoolean670) {
				local19.method8920();
			}
			return local19;
		} catch (@Pc(508) Exception local508) {
			this.aByteArray56[arg0] = -1;
			local19.method8920();
			if (local19.aBoolean670 && !this.aClass322_3.method7429()) {
				local286 = this.aClass322_3.method7428(this.anInt6008, true, arg0, (byte) 2);
				this.aClass323_21.method7477(local286, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5172(@OriginalArg(0) int arg0) {
		if (this.aClass349_2 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass114_30.method2772(); local14 != null; local14 = this.aClass114_30.method2762()) {
			if ((long) arg0 == local14.aLong278) {
				return;
			}
		}
		@Pc(45) Class2 local45 = new Class2();
		local45.aLong278 = (long) arg0;
		this.aClass114_30.method2771(local45);
	}
}
