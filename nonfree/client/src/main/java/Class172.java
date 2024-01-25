import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class172 {

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	private int anInt5412;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!pf;")
	private Class156 aClass156_93;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Lclient!bg;")
	private Class11_Sub4_Sub1_Sub1 aClass11_Sub4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!fk;")
	private final Class74 aClass74_7 = new Class74();

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "Lclient!fk;")
	private final Class74 aClass74_8 = new Class74();

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!fk;")
	private final Class74 aClass74_9 = new Class74();

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "Lclient!fk;")
	private final Class74 aClass74_10 = new Class74();

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!kh;")
	private final Class11_Sub25 aClass11_Sub25_6 = new Class11_Sub25(4);

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	public volatile int anInt5413 = 0;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public volatile int anInt5414 = 0;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "B")
	private byte aByte68 = 0;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "Lclient!kh;")
	private final Class11_Sub25 aClass11_Sub25_7 = new Class11_Sub25(8);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZIBI)Lclient!bg;")
	public Class11_Sub4_Sub1_Sub1 method4566(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg3 << 16));
		@Pc(14) Class11_Sub4_Sub1_Sub1 local14 = new Class11_Sub4_Sub1_Sub1();
		local14.aBoolean360 = arg1;
		local14.aByte2 = arg2;
		local14.aLong208 = local10;
		if (arg1) {
			if (this.method4573() >= 20) {
				throw new RuntimeException();
			}
			this.aClass74_7.method1290(local14);
		} else if (this.method4575() < 20) {
			this.aClass74_9.method1290(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public void method4567() {
		try {
			this.aClass156_93.method4190();
		} catch (@Pc(13) Exception local13) {
		}
		this.aByte68 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5413++;
		this.anInt5414 = -1;
		this.aClass156_93 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
	public boolean method4568() {
		return this.method4575() >= 20;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	public void method4570() {
		if (this.aClass156_93 == null) {
			return;
		}
		try {
			this.aClass11_Sub25_6.anInt6076 = 0;
			this.aClass11_Sub25_6.method5186(7);
			this.aClass11_Sub25_6.method5180(0);
			this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass156_93.method4190();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt5413++;
			this.anInt5414 = -2;
			this.aClass156_93 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Z")
	public boolean method4571() {
		return this.method4573() >= 20;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
	public void method4572() {
		if (this.aClass156_93 != null) {
			this.aClass156_93.method4192();
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I")
	public int method4573() {
		return this.aClass74_7.method1301() + this.aClass74_8.method1301();
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Z")
	public boolean method4574() {
		@Pc(18) int local18;
		if (this.aClass156_93 != null) {
			@Pc(11) long local11 = Static268.method4627();
			local18 = (int) (local11 - this.aLong154);
			this.aLong154 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt5412 += local18;
			if (this.anInt5412 > 30000) {
				try {
					this.aClass156_93.method4190();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass156_93 = null;
			}
		}
		if (this.aClass156_93 == null) {
			return this.method4573() == 0 && this.method4575() == 0;
		}
		try {
			this.aClass156_93.method4186();
			for (@Pc(77) Class11_Sub4_Sub1_Sub1 local77 = (Class11_Sub4_Sub1_Sub1) this.aClass74_7.method1294(); local77 != null; local77 = (Class11_Sub4_Sub1_Sub1) this.aClass74_7.method1288()) {
				this.aClass11_Sub25_6.anInt6076 = 0;
				this.aClass11_Sub25_6.method5186(1);
				this.aClass11_Sub25_6.method5180((int) local77.aLong208);
				this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
				this.aClass74_8.method1290(local77);
			}
			for (@Pc(129) Class11_Sub4_Sub1_Sub1 local129 = (Class11_Sub4_Sub1_Sub1) this.aClass74_9.method1294(); local129 != null; local129 = (Class11_Sub4_Sub1_Sub1) this.aClass74_9.method1288()) {
				this.aClass11_Sub25_6.anInt6076 = 0;
				this.aClass11_Sub25_6.method5186(0);
				this.aClass11_Sub25_6.method5180((int) local129.aLong208);
				this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
				this.aClass74_10.method1290(local129);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(178) int local178 = this.aClass156_93.method4193();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt5412 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass11_Sub4_Sub1_Sub1_2 == null) {
					local191 = 8;
				} else if (this.aClass11_Sub4_Sub1_Sub1_2.anInt371 == 0) {
					local191 = 1;
				}
				@Pc(213) int local213;
				@Pc(241) int local241;
				@Pc(306) int local306;
				if (local191 > 0) {
					local213 = local191 - this.aClass11_Sub25_7.anInt6076;
					if (local213 > local178) {
						local213 = local178;
					}
					this.aClass156_93.method4189(local213, this.aClass11_Sub25_7.aByteArray93, this.aClass11_Sub25_7.anInt6076);
					if (this.aByte68 != 0) {
						for (local241 = 0; local241 < local213; local241++) {
							this.aClass11_Sub25_7.aByteArray93[this.aClass11_Sub25_7.anInt6076 + local241] ^= this.aByte68;
						}
					}
					this.aClass11_Sub25_7.anInt6076 += local213;
					if (this.aClass11_Sub25_7.anInt6076 >= local191) {
						if (this.aClass11_Sub4_Sub1_Sub1_2 == null) {
							this.aClass11_Sub25_7.anInt6076 = 0;
							local241 = this.aClass11_Sub25_7.method5185();
							local306 = this.aClass11_Sub25_7.method5187();
							@Pc(311) int local311 = this.aClass11_Sub25_7.method5185();
							@Pc(316) int local316 = this.aClass11_Sub25_7.method5198();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) ((local241 << 16) + local306);
							@Pc(348) Class11_Sub4_Sub1_Sub1 local348;
							if (local331) {
								for (local348 = (Class11_Sub4_Sub1_Sub1) this.aClass74_10.method1294(); local348 != null && local338 != local348.aLong208; local348 = (Class11_Sub4_Sub1_Sub1) this.aClass74_10.method1288()) {
								}
							} else {
								for (local348 = (Class11_Sub4_Sub1_Sub1) this.aClass74_8.method1294(); local348 != null && local348.aLong208 != local338; local348 = (Class11_Sub4_Sub1_Sub1) this.aClass74_8.method1288()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							this.aClass11_Sub4_Sub1_Sub1_2 = local348;
							@Pc(411) int local411 = local320 == 0 ? 5 : 9;
							this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1 = new Class11_Sub25(this.aClass11_Sub4_Sub1_Sub1_2.aByte2 + local316 + local411);
							this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.method5186(local320);
							this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.method5168(local316);
							this.aClass11_Sub25_7.anInt6076 = 0;
							this.aClass11_Sub4_Sub1_Sub1_2.anInt371 = 8;
						} else if (this.aClass11_Sub4_Sub1_Sub1_2.anInt371 != 0) {
							throw new IOException();
						} else if (this.aClass11_Sub25_7.aByteArray93[0] == -1) {
							this.aClass11_Sub4_Sub1_Sub1_2.anInt371 = 1;
							this.aClass11_Sub25_7.anInt6076 = 0;
						} else {
							this.aClass11_Sub4_Sub1_Sub1_2 = null;
						}
					}
				} else {
					local213 = this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.aByteArray93.length - this.aClass11_Sub4_Sub1_Sub1_2.aByte2;
					local241 = 512 - this.aClass11_Sub4_Sub1_Sub1_2.anInt371;
					if (local213 - this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076 < local241) {
						local241 = local213 - this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076;
					}
					if (local241 > local178) {
						local241 = local178;
					}
					this.aClass156_93.method4189(local241, this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.aByteArray93, this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076);
					if (this.aByte68 != 0) {
						for (local306 = 0; local306 < local241; local306++) {
							this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.aByteArray93[this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076 + local306] = (byte) (this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.aByteArray93[this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076 + local306] ^ this.aByte68);
						}
					}
					this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076 += local241;
					this.aClass11_Sub4_Sub1_Sub1_2.anInt371 += local241;
					if (this.aClass11_Sub4_Sub1_Sub1_2.aClass11_Sub25_1.anInt6076 == local213) {
						this.aClass11_Sub4_Sub1_Sub1_2.method5580();
						this.aClass11_Sub4_Sub1_Sub1_2.aBoolean359 = false;
						this.aClass11_Sub4_Sub1_Sub1_2 = null;
					} else if (this.aClass11_Sub4_Sub1_Sub1_2.anInt371 == 512) {
						this.aClass11_Sub4_Sub1_Sub1_2.anInt371 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass156_93.method4190();
			} catch (@Pc(633) Exception local633) {
			}
			this.anInt5413++;
			this.anInt5414 = -2;
			this.aClass156_93 = null;
			return this.method4573() == 0 && this.method4575() == 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
	private int method4575() {
		return this.aClass74_9.method1301() + this.aClass74_10.method1301();
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V")
	private void method4578() {
		if (this.aClass156_93 == null) {
			return;
		}
		try {
			this.aClass11_Sub25_6.anInt6076 = 0;
			this.aClass11_Sub25_6.method5186(6);
			this.aClass11_Sub25_6.method5180(3);
			this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass156_93.method4190();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5414 = -2;
			this.aClass156_93 = null;
			this.anInt5413++;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	public void method4579() {
		if (this.aClass156_93 != null) {
			this.aClass156_93.method4190();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLclient!pf;)V")
	public void method4580(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class156 arg1) {
		if (this.aClass156_93 != null) {
			try {
				this.aClass156_93.method4190();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass156_93 = null;
		}
		this.aClass156_93 = arg1;
		this.method4578();
		this.method4581(arg0);
		this.aClass11_Sub25_7.anInt6076 = 0;
		this.aClass11_Sub4_Sub1_Sub1_2 = null;
		while (true) {
			@Pc(44) Class11_Sub4_Sub1_Sub1 local44 = (Class11_Sub4_Sub1_Sub1) this.aClass74_8.method1293();
			if (local44 == null) {
				while (true) {
					local44 = (Class11_Sub4_Sub1_Sub1) this.aClass74_10.method1293();
					if (local44 == null) {
						if (this.aByte68 != 0) {
							try {
								this.aClass11_Sub25_6.anInt6076 = 0;
								this.aClass11_Sub25_6.method5186(4);
								this.aClass11_Sub25_6.method5186(this.aByte68);
								this.aClass11_Sub25_6.method5204(0);
								this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass156_93.method4190();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt5413++;
								this.anInt5414 = -2;
								this.aClass156_93 = null;
							}
						}
						this.anInt5412 = 0;
						this.aLong154 = Static268.method4627();
						return;
					}
					this.aClass74_9.method1290(local44);
				}
			}
			this.aClass74_7.method1290(local44);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
	public void method4581(@OriginalArg(1) boolean arg0) {
		if (this.aClass156_93 == null) {
			return;
		}
		try {
			this.aClass11_Sub25_6.anInt6076 = 0;
			this.aClass11_Sub25_6.method5186(arg0 ? 2 : 3);
			this.aClass11_Sub25_6.method5180(0);
			this.aClass156_93.method4183(this.aClass11_Sub25_6.aByteArray93, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass156_93.method4190();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt5414 = -2;
			this.aClass156_93 = null;
			this.anInt5413++;
		}
	}
}
