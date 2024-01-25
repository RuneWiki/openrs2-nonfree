import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!qn;")
	private Class207 aClass207_1;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Z")
	private boolean aBoolean214;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	private int anInt2746 = 0;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Lclient!mn;")
	private final Class163 aClass163_12 = new Class163(16);

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
	private int anInt2762 = 0;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Lclient!ar;")
	private final Class14 aClass14_23 = new Class14();

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	private final int anInt2748;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "Lclient!va;")
	private final Class248 aClass248_3;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "Z")
	private boolean aBoolean213;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Lclient!ar;")
	private Class14 aClass14_24;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!ug;")
	private final Class243 aClass243_3;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!br;")
	private final Class30 aClass30_2;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	private final int anInt2758;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	private final int anInt2761;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "Lclient!va;")
	private final Class248 aClass248_2;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Lclient!rn;")
	private Class2_Sub5_Sub6 aClass2_Sub5_Sub6_1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(ILclient!va;Lclient!va;Lclient!ug;Lclient!br;IIZ)V")
	public Class94_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class248 arg2, @OriginalArg(3) Class243 arg3, @OriginalArg(4) Class30 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2748 = arg0;
		this.aClass248_3 = arg1;
		if (this.aClass248_3 == null) {
			this.aBoolean213 = false;
		} else {
			this.aBoolean213 = true;
			this.aClass14_24 = new Class14();
		}
		this.aClass243_3 = arg3;
		this.aClass30_2 = arg4;
		this.anInt2758 = arg6;
		this.aBoolean215 = arg7;
		this.anInt2761 = arg5;
		this.aClass248_2 = arg2;
		if (this.aClass248_2 != null) {
			this.aClass2_Sub5_Sub6_1 = this.aClass30_2.method572(this.aClass248_2, this.anInt2748);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	public void method2181() {
		if (this.aClass248_3 != null) {
			this.aBoolean214 = true;
			if (this.aClass14_24 == null) {
				this.aClass14_24 = new Class14();
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	public void method2182() {
		if (this.aClass14_24 != null) {
			if (this.method2180() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class2 local23;
			@Pc(29) int local29;
			@Pc(117) Class2 local117;
			if (this.aBoolean213) {
				local18 = true;
				for (local23 = this.aClass14_24.method309(); local23 != null; local23 = this.aClass14_24.method311()) {
					local29 = (int) local23.aLong227;
					if (this.aByteArray58[local29] == 0) {
						this.method2183(local29, 1);
					}
					if (this.aByteArray58[local29] == 0) {
						local18 = false;
					} else {
						local23.method5866();
					}
				}
				while (this.aClass207_1.anIntArray472.length > this.anInt2762) {
					if (this.aClass207_1.anIntArray472[this.anInt2762] == 0) {
						this.anInt2762++;
					} else {
						if (this.aClass30_2.anInt663 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray58[this.anInt2762] == 0) {
							this.method2183(this.anInt2762, 1);
						}
						if (this.aByteArray58[this.anInt2762] == 0) {
							local117 = new Class2();
							local117.aLong227 = this.anInt2762;
							local18 = false;
							this.aClass14_24.method300(local117);
						}
						this.anInt2762++;
					}
				}
				if (local18) {
					this.aBoolean213 = false;
					this.anInt2762 = 0;
				}
			} else if (this.aBoolean214) {
				local18 = true;
				for (local23 = this.aClass14_24.method309(); local23 != null; local23 = this.aClass14_24.method311()) {
					local29 = (int) local23.aLong227;
					if (this.aByteArray58[local29] != 1) {
						this.method2183(local29, 2);
					}
					if (this.aByteArray58[local29] == 1) {
						local23.method5866();
					} else {
						local18 = false;
					}
				}
				while (this.anInt2762 < this.aClass207_1.anIntArray472.length) {
					if (this.aClass207_1.anIntArray472[this.anInt2762] == 0) {
						this.anInt2762++;
					} else {
						if (this.aClass243_3.method5235()) {
							local18 = false;
							break;
						}
						if (this.aByteArray58[this.anInt2762] != 1) {
							this.method2183(this.anInt2762, 2);
						}
						if (this.aByteArray58[this.anInt2762] != 1) {
							local117 = new Class2();
							local117.aLong227 = this.anInt2762;
							this.aClass14_24.method300(local117);
							local18 = false;
						}
						this.anInt2762++;
					}
				}
				if (local18) {
					this.aBoolean214 = false;
					this.anInt2762 = 0;
				}
			} else {
				this.aClass14_24 = null;
			}
		}
		if (!this.aBoolean215 || Static21.method458() < this.aLong79) {
			return;
		}
		for (@Pc(314) Class2_Sub5_Sub6 local314 = (Class2_Sub5_Sub6) this.aClass163_12.method3771(); local314 != null; local314 = (Class2_Sub5_Sub6) this.aClass163_12.method3770()) {
			if (!local314.aBoolean336) {
				if (local314.aBoolean338) {
					if (!local314.aBoolean337) {
						throw new RuntimeException();
					}
					local314.method5866();
				} else {
					local314.aBoolean338 = true;
				}
			}
		}
		this.aLong79 = Static21.method458() + 1000L;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)Lclient!rn;")
	private Class2_Sub5_Sub6 method2183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class2_Sub5_Sub6 local15 = (Class2_Sub5_Sub6) this.aClass163_12.method3769((long) arg0);
		if (local15 != null && arg1 == 0 && !local15.aBoolean337 && local15.aBoolean336) {
			local15.method5866();
			local15 = null;
		}
		if (local15 == null) {
			if (arg1 == 0) {
				if (this.aClass248_3 == null || this.aByteArray58[arg0] == -1) {
					if (this.aClass243_3.method5231()) {
						return null;
					}
					local15 = this.aClass243_3.method5238(this.anInt2748, true, (byte) 2, arg0);
				} else {
					local15 = this.aClass30_2.method572(this.aClass248_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass248_3 == null) {
					throw new RuntimeException();
				}
				local15 = this.aClass30_2.method571(arg0, this.aClass248_3);
			} else if (arg1 == 2) {
				if (this.aClass248_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray58[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass243_3.method5235()) {
					return null;
				}
				local15 = this.aClass243_3.method5238(this.anInt2748, false, (byte) 2, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass163_12.method3764((long) arg0, local15);
		}
		if (local15.aBoolean336) {
			return null;
		}
		@Pc(166) byte[] local166 = local15.method3782();
		@Pc(195) int local195;
		@Pc(247) Class2_Sub5_Sub6_Sub1 local247;
		if (!(local15 instanceof Class2_Sub5_Sub6_Sub2)) {
			try {
				if (local166 == null || local166.length <= 2) {
					throw new RuntimeException();
				}
				Static208.aCRC32_1.reset();
				Static208.aCRC32_1.update(local166, 0, local166.length - 2);
				local195 = (int) Static208.aCRC32_1.getValue();
				if (local195 != this.aClass207_1.anIntArray470[arg0]) {
					throw new RuntimeException();
				}
				this.aClass243_3.anInt6617 = 0;
				this.aClass243_3.anInt6618 = 0;
			} catch (@Pc(220) RuntimeException local220) {
				this.aClass243_3.method5227();
				local15.method5866();
				if (local15.aBoolean337 && !this.aClass243_3.method5231()) {
					local247 = this.aClass243_3.method5238(this.anInt2748, true, (byte) 2, arg0);
					this.aClass163_12.method3764((long) arg0, local247);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass207_1.anIntArray469[arg0] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass207_1.anIntArray469[arg0];
			if (this.aClass248_3 != null) {
				this.aClass30_2.method569(arg0, local166, this.aClass248_3);
				if (this.aByteArray58[arg0] != 1) {
					this.anInt2746++;
					this.aByteArray58[arg0] = 1;
				}
			}
			if (!local15.aBoolean337) {
				local15.method5866();
			}
			return local15;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static208.aCRC32_1.reset();
			Static208.aCRC32_1.update(local166, 0, local166.length - 2);
			local195 = (int) Static208.aCRC32_1.getValue();
			if (this.aClass207_1.anIntArray470[arg0] != local195) {
				throw new RuntimeException();
			}
			@Pc(375) int local375 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if ((this.aClass207_1.anIntArray469[arg0] & 0xFFFF) != local375) {
				throw new RuntimeException();
			}
			if (this.aByteArray58[arg0] != 1) {
				this.anInt2746++;
				this.aByteArray58[arg0] = 1;
			}
			if (!local15.aBoolean337) {
				local15.method5866();
			}
			return local15;
		} catch (@Pc(416) Exception local416) {
			this.aByteArray58[arg0] = -1;
			local15.method5866();
			if (local15.aBoolean337 && !this.aClass243_3.method5231()) {
				local247 = this.aClass243_3.method5238(this.anInt2748, true, (byte) 2, arg0);
				this.aClass163_12.method3764((long) arg0, local247);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	public void method2184() {
		if (this.aClass14_24 == null || this.method2180() == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass14_23.method309(); local23 != null; local23 = this.aClass14_23.method311()) {
			@Pc(29) int local29 = (int) local23.aLong227;
			if (local29 < 0 || this.aClass207_1.anInt5649 <= local29 || this.aClass207_1.anIntArray472[local29] == 0) {
				local23.method5866();
			} else {
				if (this.aByteArray58[local29] == 0) {
					this.method2183(local29, 1);
				}
				if (this.aByteArray58[local29] == -1) {
					this.method2183(local29, 2);
				}
				if (this.aByteArray58[local29] == 1) {
					local23.method5866();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
	@Override
	public void method2176(@OriginalArg(1) int arg0) {
		if (this.aClass248_3 == null) {
			return;
		}
		for (@Pc(20) Class2 local20 = this.aClass14_23.method309(); local20 != null; local20 = this.aClass14_23.method311()) {
			if ((long) arg0 == local20.aLong227) {
				return;
			}
		}
		@Pc(40) Class2 local40 = new Class2();
		local40.aLong227 = arg0;
		this.aClass14_23.method300(local40);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)I")
	public int method2185() {
		if (this.aClass207_1 == null) {
			return 0;
		} else if (this.aBoolean213) {
			@Pc(20) Class2 local20 = this.aClass14_24.method309();
			return local20 == null ? 0 : (int) local20.aLong227;
		} else {
			return this.aClass207_1.anInt5653;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method2178(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub5_Sub6 local14 = this.method2183(arg0, 0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method3782();
			local14.method5866();
			return local22;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I")
	@Override
	public int method2179(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub5_Sub6 local17 = (Class2_Sub5_Sub6) this.aClass163_12.method3769((long) arg0);
		return local17 == null ? 0 : local17.method3780();
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)I")
	public int method2186() {
		return this.anInt2746;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
	public int method2188() {
		return this.aClass207_1 == null ? 0 : this.aClass207_1.anInt5653;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Lclient!qn;")
	@Override
	public Class207 method2180() {
		if (this.aClass207_1 != null) {
			return this.aClass207_1;
		}
		if (this.aClass2_Sub5_Sub6_1 == null) {
			if (this.aClass243_3.method5231()) {
				return null;
			}
			this.aClass2_Sub5_Sub6_1 = this.aClass243_3.method5238(255, true, (byte) 0, this.anInt2748);
		}
		if (this.aClass2_Sub5_Sub6_1.aBoolean336) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass2_Sub5_Sub6_1.method3782();
		if (this.aClass2_Sub5_Sub6_1 instanceof Class2_Sub5_Sub6_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass207_1 = new Class207(local48, this.anInt2761);
				if (this.aClass207_1.anInt5647 != this.anInt2758) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass207_1 = null;
				if (this.aClass243_3.method5231()) {
					this.aClass2_Sub5_Sub6_1 = null;
				} else {
					this.aClass2_Sub5_Sub6_1 = this.aClass243_3.method5238(255, true, (byte) 0, this.anInt2748);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass207_1 = new Class207(local48, this.anInt2761);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass243_3.method5227();
				this.aClass207_1 = null;
				if (this.aClass243_3.method5231()) {
					this.aClass2_Sub5_Sub6_1 = null;
				} else {
					this.aClass2_Sub5_Sub6_1 = this.aClass243_3.method5238(255, true, (byte) 0, this.anInt2748);
				}
				return null;
			}
			if (this.aClass248_2 != null) {
				this.aClass30_2.method569(this.anInt2748, local48, this.aClass248_2);
			}
		}
		this.aClass2_Sub5_Sub6_1 = null;
		if (this.aClass248_3 != null) {
			this.aByteArray58 = new byte[this.aClass207_1.anInt5649];
			this.anInt2746 = 0;
		}
		return this.aClass207_1;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)I")
	public int method2189() {
		if (this.method2180() == null) {
			return this.aClass2_Sub5_Sub6_1 == null ? 0 : this.aClass2_Sub5_Sub6_1.method3780();
		} else {
			return 100;
		}
	}
}
