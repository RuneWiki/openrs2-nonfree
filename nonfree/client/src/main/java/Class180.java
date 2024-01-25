import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class180 {

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "Lclient!cga;")
	private Class52 aClass52_2;

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
	private int anInt5271;

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "Lclient!pi;")
	private Class6_Sub5_Sub3_Sub2 aClass6_Sub5_Sub3_Sub2_2;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!pw;")
	private final Class256 aClass256_3 = new Class256();

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "Lclient!pw;")
	private final Class256 aClass256_4 = new Class256();

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "Lclient!pw;")
	private final Class256 aClass256_5 = new Class256();

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "Lclient!pw;")
	private final Class256 aClass256_6 = new Class256();

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "Lclient!jr;")
	private final Class6_Sub12 aClass6_Sub12_2 = new Class6_Sub12(4);

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "B")
	private byte aByte71 = 0;

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
	public volatile int anInt5272 = 0;

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
	public volatile int anInt5273 = 0;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "Lclient!jr;")
	private final Class6_Sub12 aClass6_Sub12_3 = new Class6_Sub12(8);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)Z")
	public boolean method4344() {
		return this.method4356() >= 20;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(B)V")
	public void method4346() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub12_2.anInt7556 = 0;
			this.aClass6_Sub12_2.method6047(7);
			this.aClass6_Sub12_2.method6059(0);
			this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass52_2.method971();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass52_2 = null;
			this.anInt5273 = -2;
			this.anInt5272++;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
	private void method4347() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub12_2.anInt7556 = 0;
			this.aClass6_Sub12_2.method6047(6);
			this.aClass6_Sub12_2.method6059(3);
			this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass52_2.method971();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5272++;
			this.anInt5273 = -2;
			this.aClass52_2 = null;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)I")
	public int method4348() {
		return this.aClass256_3.method5903() + this.aClass256_4.method5903();
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZB)V")
	public void method4349(@OriginalArg(0) boolean arg0) {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub12_2.anInt7556 = 0;
			this.aClass6_Sub12_2.method6047(arg0 ? 2 : 3);
			this.aClass6_Sub12_2.method6059(0);
			this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass52_2.method971();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass52_2 = null;
			this.anInt5272++;
			this.anInt5273 = -2;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!cga;Z)V")
	public void method4350(@OriginalArg(1) Class52 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass52_2 != null) {
			try {
				this.aClass52_2.method971();
			} catch (@Pc(18) Exception local18) {
			}
			this.aClass52_2 = null;
		}
		this.aClass52_2 = arg0;
		this.method4347();
		this.method4349(arg1);
		this.aClass6_Sub5_Sub3_Sub2_2 = null;
		this.aClass6_Sub12_3.anInt7556 = 0;
		while (true) {
			@Pc(48) Class6_Sub5_Sub3_Sub2 local48 = (Class6_Sub5_Sub3_Sub2) this.aClass256_4.method5904();
			if (local48 == null) {
				while (true) {
					local48 = (Class6_Sub5_Sub3_Sub2) this.aClass256_6.method5904();
					if (local48 == null) {
						if (this.aByte71 != 0) {
							try {
								this.aClass6_Sub12_2.anInt7556 = 0;
								this.aClass6_Sub12_2.method6047(4);
								this.aClass6_Sub12_2.method6047(this.aByte71);
								this.aClass6_Sub12_2.method6032(0);
								this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass52_2.method971();
								} catch (@Pc(115) Exception local115) {
								}
								this.aClass52_2 = null;
								this.anInt5272++;
								this.anInt5273 = -2;
							}
						}
						this.anInt5271 = 0;
						this.aLong109 = Static416.method5922();
						return;
					}
					this.aClass256_5.method5906(local48);
				}
			}
			this.aClass256_3.method5906(local48);
		}
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(B)V")
	public void method4351() {
		try {
			this.aClass52_2.method971();
		} catch (@Pc(11) Exception local11) {
		}
		this.aClass52_2 = null;
		this.anInt5273 = -1;
		this.anInt5272++;
		this.aByte71 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)Z")
	public boolean method4352() {
		@Pc(19) int local19;
		if (this.aClass52_2 != null) {
			@Pc(13) long local13 = Static416.method5922();
			local19 = (int) (local13 - this.aLong109);
			if (local19 > 200) {
				local19 = 200;
			}
			this.aLong109 = local13;
			this.anInt5271 += local19;
			if (this.anInt5271 > 30000) {
				try {
					this.aClass52_2.method971();
				} catch (@Pc(47) Exception local47) {
				}
				this.aClass52_2 = null;
			}
		}
		if (this.aClass52_2 == null) {
			return this.method4348() == 0 && this.method4356() == 0;
		}
		try {
			this.aClass52_2.method972();
			for (@Pc(77) Class6_Sub5_Sub3_Sub2 local77 = (Class6_Sub5_Sub3_Sub2) this.aClass256_3.method5902(); local77 != null; local77 = (Class6_Sub5_Sub3_Sub2) this.aClass256_3.method5901()) {
				this.aClass6_Sub12_2.anInt7556 = 0;
				this.aClass6_Sub12_2.method6047(1);
				this.aClass6_Sub12_2.method6059((int) local77.aLong242);
				this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
				this.aClass256_4.method5906(local77);
			}
			for (@Pc(129) Class6_Sub5_Sub3_Sub2 local129 = (Class6_Sub5_Sub3_Sub2) this.aClass256_5.method5902(); local129 != null; local129 = (Class6_Sub5_Sub3_Sub2) this.aClass256_5.method5901()) {
				this.aClass6_Sub12_2.anInt7556 = 0;
				this.aClass6_Sub12_2.method6047(0);
				this.aClass6_Sub12_2.method6059((int) local129.aLong242);
				this.aClass52_2.method973(4, this.aClass6_Sub12_2.aByteArray97);
				this.aClass256_6.method5906(local129);
			}
			for (local19 = 0; local19 < 100; local19++) {
				@Pc(185) int local185 = this.aClass52_2.method968();
				if (local185 < 0) {
					throw new IOException();
				}
				if (local185 == 0) {
					break;
				}
				this.anInt5271 = 0;
				@Pc(198) byte local198 = 0;
				if (this.aClass6_Sub5_Sub3_Sub2_2 == null) {
					local198 = 8;
				} else if (this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 == 0) {
					local198 = 1;
				}
				@Pc(229) int local229;
				@Pc(236) int local236;
				@Pc(279) int local279;
				if (local198 <= 0) {
					local229 = this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.aByteArray97.length - this.aClass6_Sub5_Sub3_Sub2_2.aByte84;
					local236 = 512 - this.aClass6_Sub5_Sub3_Sub2_2.anInt7227;
					if (local229 - this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556 < local236) {
						local236 = local229 - this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556;
					}
					if (local236 > local185) {
						local236 = local185;
					}
					this.aClass52_2.method970(this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556, this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.aByteArray97, local236);
					if (this.aByte71 != 0) {
						for (local279 = 0; local279 < local236; local279++) {
							this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.aByteArray97[local279 + this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556] ^= this.aByte71;
						}
					}
					this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556 += local236;
					this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 += local236;
					if (local229 == this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.anInt7556) {
						this.aClass6_Sub5_Sub3_Sub2_2.method7814();
						this.aClass6_Sub5_Sub3_Sub2_2.aBoolean492 = false;
						this.aClass6_Sub5_Sub3_Sub2_2 = null;
					} else if (this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 == 512) {
						this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 = 0;
					}
				} else {
					local229 = local198 - this.aClass6_Sub12_3.anInt7556;
					if (local185 < local229) {
						local229 = local185;
					}
					this.aClass52_2.method970(this.aClass6_Sub12_3.anInt7556, this.aClass6_Sub12_3.aByteArray97, local229);
					if (this.aByte71 != 0) {
						for (local236 = 0; local236 < local229; local236++) {
							this.aClass6_Sub12_3.aByteArray97[local236 + this.aClass6_Sub12_3.anInt7556] ^= this.aByte71;
						}
					}
					this.aClass6_Sub12_3.anInt7556 += local229;
					if (local198 <= this.aClass6_Sub12_3.anInt7556) {
						if (this.aClass6_Sub5_Sub3_Sub2_2 == null) {
							this.aClass6_Sub12_3.anInt7556 = 0;
							local236 = this.aClass6_Sub12_3.method6019();
							local279 = this.aClass6_Sub12_3.method6044();
							@Pc(454) int local454 = this.aClass6_Sub12_3.method6019();
							@Pc(459) int local459 = this.aClass6_Sub12_3.method6015();
							@Pc(463) int local463 = local454 & 0x7F;
							@Pc(471) boolean local471 = (local454 & 0x80) != 0;
							@Pc(479) long local479 = (long) ((local236 << 16) + local279);
							@Pc(489) Class6_Sub5_Sub3_Sub2 local489;
							if (local471) {
								for (local489 = (Class6_Sub5_Sub3_Sub2) this.aClass256_6.method5902(); local489 != null && local479 != local489.aLong242; local489 = (Class6_Sub5_Sub3_Sub2) this.aClass256_6.method5901()) {
								}
							} else {
								for (local489 = (Class6_Sub5_Sub3_Sub2) this.aClass256_4.method5902(); local489 != null && local489.aLong242 != local479; local489 = (Class6_Sub5_Sub3_Sub2) this.aClass256_4.method5901()) {
								}
							}
							if (local489 == null) {
								throw new IOException();
							}
							this.aClass6_Sub5_Sub3_Sub2_2 = local489;
							@Pc(545) int local545 = local463 == 0 ? 5 : 9;
							this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5 = new Class6_Sub12(local545 + local459 + this.aClass6_Sub5_Sub3_Sub2_2.aByte84);
							this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.method6047(local463);
							this.aClass6_Sub5_Sub3_Sub2_2.aClass6_Sub12_5.method6042(local459);
							this.aClass6_Sub12_3.anInt7556 = 0;
							this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 = 8;
						} else if (this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub12_3.aByteArray97[0] == -1) {
							this.aClass6_Sub12_3.anInt7556 = 0;
							this.aClass6_Sub5_Sub3_Sub2_2.anInt7227 = 1;
						} else {
							this.aClass6_Sub5_Sub3_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass52_2.method971();
			} catch (@Pc(627) Exception local627) {
			}
			this.anInt5272++;
			this.anInt5273 = -2;
			this.aClass52_2 = null;
			return this.method4348() == 0 && this.method4356() == 0;
		}
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)Z")
	public boolean method4353() {
		return this.method4348() >= 20;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZZIB)Lclient!pi;")
	public Class6_Sub5_Sub3_Sub2 method4354(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(14) Class6_Sub5_Sub3_Sub2 local14 = new Class6_Sub5_Sub3_Sub2();
		local14.aLong242 = local10;
		local14.aByte84 = arg3;
		local14.aBoolean493 = arg1;
		if (arg1) {
			if (this.method4348() >= 20) {
				throw new RuntimeException();
			}
			this.aClass256_3.method5906(local14);
		} else if (this.method4356() < 20) {
			this.aClass256_5.method5906(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "(B)V")
	public void method4355() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method971();
		}
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)I")
	private int method4356() {
		return this.aClass256_5.method5903() + this.aClass256_6.method5903();
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(B)V")
	public void method4357() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method975();
		}
	}
}
