import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "Lclient!sq;")
	private Class226 aClass226_1;

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
	private int anInt2803 = 0;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Lclient!vg;")
	private final Class252 aClass252_18 = new Class252(16);

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
	private int anInt2807 = 0;

	@OriginalMember(owner = "client!ho", name = "K", descriptor = "Lclient!nv;")
	private final Class177 aClass177_16 = new Class177();

	@OriginalMember(owner = "client!ho", name = "O", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	private final int anInt2788;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!cn;")
	private final Class35 aClass35_3;

	@OriginalMember(owner = "client!ho", name = "N", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!ho", name = "L", descriptor = "Lclient!nv;")
	private Class177 aClass177_17;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	private final int anInt2790;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private final int anInt2798;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "Lclient!cn;")
	private final Class35 aClass35_2;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "Lclient!gf;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "Lclient!ru;")
	private final Class216 aClass216_1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "Z")
	private final boolean aBoolean181;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "Lclient!p;")
	private Class5_Sub2_Sub3 aClass5_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILclient!cn;Lclient!cn;Lclient!gf;Lclient!ru;IIZ)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class87 arg3, @OriginalArg(4) Class216 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2788 = arg0;
		this.aClass35_3 = arg1;
		if (this.aClass35_3 == null) {
			this.aBoolean180 = false;
		} else {
			this.aBoolean180 = true;
			this.aClass177_17 = new Class177();
		}
		this.anInt2790 = arg5;
		this.anInt2798 = arg6;
		this.aClass35_2 = arg2;
		this.aClass87_1 = arg3;
		this.aClass216_1 = arg4;
		this.aBoolean181 = arg7;
		if (this.aClass35_2 != null) {
			this.aClass5_Sub2_Sub3_1 = this.aClass216_1.method4711(this.aClass35_2, this.anInt2788);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public int method2265() {
		if (this.method2260() == null) {
			return this.aClass5_Sub2_Sub3_1 == null ? 0 : this.aClass5_Sub2_Sub3_1.method4878();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)I")
	public int method2266() {
		if (this.aClass226_1 == null) {
			return 0;
		} else if (this.aBoolean180) {
			@Pc(25) Class5 local25 = this.aClass177_17.method3618();
			return local25 == null ? 0 : (int) local25.aLong234;
		} else {
			return this.aClass226_1.anInt6261;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I")
	@Override
	public int method2257(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub3 local11 = (Class5_Sub2_Sub3) this.aClass252_18.method5659((long) arg0);
		return local11 == null ? 0 : local11.method4878();
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)V")
	public void method2267() {
		if (this.aClass35_3 != null) {
			this.aBoolean179 = true;
			if (this.aClass177_17 == null) {
				this.aClass177_17 = new Class177();
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Lclient!sq;")
	@Override
	public Class226 method2260() {
		if (this.aClass226_1 != null) {
			return this.aClass226_1;
		}
		if (this.aClass5_Sub2_Sub3_1 == null) {
			if (this.aClass87_1.method1872()) {
				return null;
			}
			this.aClass5_Sub2_Sub3_1 = this.aClass87_1.method1865((byte) 0, 255, this.anInt2788, true);
		}
		if (this.aClass5_Sub2_Sub3_1.aBoolean403) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass5_Sub2_Sub3_1.method4877();
		if (this.aClass5_Sub2_Sub3_1 instanceof Class5_Sub2_Sub3_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass226_1 = new Class226(local49, this.anInt2790);
				if (this.aClass226_1.anInt6260 != this.anInt2798) {
					throw new RuntimeException();
				}
			} catch (@Pc(82) RuntimeException local82) {
				this.aClass226_1 = null;
				if (this.aClass87_1.method1872()) {
					this.aClass5_Sub2_Sub3_1 = null;
				} else {
					this.aClass5_Sub2_Sub3_1 = this.aClass87_1.method1865((byte) 0, 255, this.anInt2788, true);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass226_1 = new Class226(local49, this.anInt2790);
			} catch (@Pc(124) RuntimeException local124) {
				this.aClass87_1.method1863();
				this.aClass226_1 = null;
				if (this.aClass87_1.method1872()) {
					this.aClass5_Sub2_Sub3_1 = null;
				} else {
					this.aClass5_Sub2_Sub3_1 = this.aClass87_1.method1865((byte) 0, 255, this.anInt2788, true);
				}
				return null;
			}
			if (this.aClass35_2 != null) {
				this.aClass216_1.method4709(this.anInt2788, local49, this.aClass35_2);
			}
		}
		this.aClass5_Sub2_Sub3_1 = null;
		if (this.aClass35_3 != null) {
			this.anInt2803 = 0;
			this.aByteArray38 = new byte[this.aClass226_1.anInt6258];
		}
		return this.aClass226_1;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2263(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub2_Sub3 local9 = this.method2270(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method4877();
			local9.method6003();
			return local19;
		}
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(B)I")
	public int method2268() {
		return this.aClass226_1 == null ? 0 : this.aClass226_1.anInt6261;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public void method2269() {
		if (this.aClass177_17 == null || this.method2260() == null) {
			return;
		}
		for (@Pc(19) Class5 local19 = this.aClass177_16.method3618(); local19 != null; local19 = this.aClass177_16.method3619()) {
			@Pc(25) int local25 = (int) local19.aLong234;
			if (local25 < 0 || this.aClass226_1.anInt6258 <= local25 || this.aClass226_1.anIntArray438[local25] == 0) {
				local19.method6003();
			} else {
				if (this.aByteArray38[local25] == 0) {
					this.method2270(local25, 1);
				}
				if (this.aByteArray38[local25] == -1) {
					this.method2270(local25, 2);
				}
				if (this.aByteArray38[local25] == 1) {
					local19.method6003();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lclient!p;")
	private Class5_Sub2_Sub3 method2270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub3 local13 = (Class5_Sub2_Sub3) this.aClass252_18.method5659((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean404 && local13.aBoolean403) {
			local13.method6003();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass35_3 == null || this.aByteArray38[arg0] == -1) {
					if (this.aClass87_1.method1872()) {
						return null;
					}
					local13 = this.aClass87_1.method1865((byte) 2, this.anInt2788, arg0, true);
				} else {
					local13 = this.aClass216_1.method4711(this.aClass35_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass35_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass216_1.method4710(arg0, this.aClass35_3);
			} else if (arg1 == 2) {
				if (this.aClass35_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray38[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass87_1.method1873()) {
					return null;
				}
				local13 = this.aClass87_1.method1865((byte) 2, this.anInt2788, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass252_18.method5658(local13, (long) arg0);
		}
		if (local13.aBoolean403) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method4877();
		@Pc(189) int local189;
		@Pc(237) Class5_Sub2_Sub3_Sub2 local237;
		if (!(local13 instanceof Class5_Sub2_Sub3_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static214.aCRC32_1.reset();
				Static214.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static214.aCRC32_1.getValue();
				if (local189 != this.aClass226_1.anIntArray441[arg0]) {
					throw new RuntimeException();
				}
				this.aClass87_1.anInt2328 = 0;
				this.aClass87_1.anInt2327 = 0;
			} catch (@Pc(210) RuntimeException local210) {
				this.aClass87_1.method1863();
				local13.method6003();
				if (local13.aBoolean404 && !this.aClass87_1.method1872()) {
					local237 = this.aClass87_1.method1865((byte) 2, this.anInt2788, arg0, true);
					this.aClass252_18.method5658(local237, (long) arg0);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass226_1.anIntArray440[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass226_1.anIntArray440[arg0];
			if (this.aClass35_3 != null) {
				this.aClass216_1.method4709(arg0, local162, this.aClass35_3);
				if (this.aByteArray38[arg0] != 1) {
					this.anInt2803++;
					this.aByteArray38[arg0] = 1;
				}
			}
			if (!local13.aBoolean404) {
				local13.method6003();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static214.aCRC32_1.reset();
			Static214.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static214.aCRC32_1.getValue();
			if (local189 != this.aClass226_1.anIntArray441[arg0]) {
				throw new RuntimeException();
			}
			@Pc(368) int local368 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if (local368 != (this.aClass226_1.anIntArray440[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray38[arg0] != 1) {
				this.anInt2803++;
				this.aByteArray38[arg0] = 1;
			}
			if (!local13.aBoolean404) {
				local13.method6003();
			}
			return local13;
		} catch (@Pc(413) Exception local413) {
			this.aByteArray38[arg0] = -1;
			local13.method6003();
			if (local13.aBoolean404 && !this.aClass87_1.method1872()) {
				local237 = this.aClass87_1.method1865((byte) 2, this.anInt2788, arg0, true);
				this.aClass252_18.method5658(local237, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
	@Override
	public void method2259(@OriginalArg(1) int arg0) {
		if (this.aClass35_3 == null) {
			return;
		}
		for (@Pc(14) Class5 local14 = this.aClass177_16.method3618(); local14 != null; local14 = this.aClass177_16.method3619()) {
			if (local14.aLong234 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class5 local38 = new Class5();
		local38.aLong234 = arg0;
		this.aClass177_16.method3615(local38);
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	public void method2272() {
		if (this.aClass177_17 != null) {
			if (this.method2260() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class5 local23;
			@Pc(29) int local29;
			@Pc(120) Class5 local120;
			if (this.aBoolean180) {
				local18 = true;
				for (local23 = this.aClass177_17.method3618(); local23 != null; local23 = this.aClass177_17.method3619()) {
					local29 = (int) local23.aLong234;
					if (this.aByteArray38[local29] == 0) {
						this.method2270(local29, 1);
					}
					if (this.aByteArray38[local29] == 0) {
						local18 = false;
					} else {
						local23.method6003();
					}
				}
				while (this.aClass226_1.anIntArray438.length > this.anInt2807) {
					if (this.aClass226_1.anIntArray438[this.anInt2807] == 0) {
						this.anInt2807++;
					} else {
						if (this.aClass216_1.anInt5918 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray38[this.anInt2807] == 0) {
							this.method2270(this.anInt2807, 1);
						}
						if (this.aByteArray38[this.anInt2807] == 0) {
							local120 = new Class5();
							local120.aLong234 = this.anInt2807;
							this.aClass177_17.method3615(local120);
							local18 = false;
						}
						this.anInt2807++;
					}
				}
				if (local18) {
					this.aBoolean180 = false;
					this.anInt2807 = 0;
				}
			} else if (this.aBoolean179) {
				local18 = true;
				for (local23 = this.aClass177_17.method3618(); local23 != null; local23 = this.aClass177_17.method3619()) {
					local29 = (int) local23.aLong234;
					if (this.aByteArray38[local29] != 1) {
						this.method2270(local29, 2);
					}
					if (this.aByteArray38[local29] == 1) {
						local23.method6003();
					} else {
						local18 = false;
					}
				}
				while (this.aClass226_1.anIntArray438.length > this.anInt2807) {
					if (this.aClass226_1.anIntArray438[this.anInt2807] == 0) {
						this.anInt2807++;
					} else {
						if (this.aClass87_1.method1873()) {
							local18 = false;
							break;
						}
						if (this.aByteArray38[this.anInt2807] != 1) {
							this.method2270(this.anInt2807, 2);
						}
						if (this.aByteArray38[this.anInt2807] != 1) {
							local120 = new Class5();
							local120.aLong234 = this.anInt2807;
							local18 = false;
							this.aClass177_17.method3615(local120);
						}
						this.anInt2807++;
					}
				}
				if (local18) {
					this.aBoolean179 = false;
					this.anInt2807 = 0;
				}
			} else {
				this.aClass177_17 = null;
			}
		}
		if (!this.aBoolean181 || this.aLong89 > Static446.method5903()) {
			return;
		}
		for (@Pc(325) Class5_Sub2_Sub3 local325 = (Class5_Sub2_Sub3) this.aClass252_18.method5660(); local325 != null; local325 = (Class5_Sub2_Sub3) this.aClass252_18.method5666()) {
			if (!local325.aBoolean403) {
				if (local325.aBoolean405) {
					if (!local325.aBoolean404) {
						throw new RuntimeException();
					}
					local325.method6003();
				} else {
					local325.aBoolean405 = true;
				}
			}
		}
		this.aLong89 = Static446.method5903() + 1000L;
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)I")
	public int method2273() {
		return this.anInt2803;
	}
}
