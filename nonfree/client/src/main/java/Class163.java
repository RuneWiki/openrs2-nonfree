import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class163 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public int anInt5027;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	private int anInt5032;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	private int anInt5029 = 0;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	public int anInt5031 = -1;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	private int anInt5035 = 128;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	private int anInt5034 = 0;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	private int anInt5036 = 128;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	private int anInt5037 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIBLclient!ea;II)Lclient!ts;")
	public Class112 method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg3;
		@Pc(20) Class89 local20 = this.anInt5031 == -1 || arg0 == -1 ? null : Static162.method2849(this.anInt5031);
		if (local20 != null) {
			local5 = arg3 | local20.method2269(arg0, false, arg1);
		}
		if (this.anInt5036 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt5035 != 128 || this.anInt5029 != 0) {
			local5 |= 0x5;
		}
		@Pc(66) Class109 local66 = Static128.aClass109_42;
		@Pc(84) Class112 local84;
		synchronized (Static128.aClass109_42) {
			local84 = (Class112) Static128.aClass109_42.method2857((long) (this.anInt5027 |= arg2.anInt5811 << 29));
		}
		if (local84 == null || arg2.method5181(local84.method4308(), local5) != 0) {
			if (local84 != null) {
				local5 = arg2.method5165(local5, local84.method4308());
			}
			@Pc(108) int local108 = local5;
			if (this.aShortArray88 != null) {
				local108 = local5 | 0x2000;
			}
			if (this.aShortArray87 != null) {
				local108 |= 0x4000;
			}
			@Pc(129) Class177 local129 = Static292.method2236(this.anInt5032, Static130.aClass93_108);
			if (local129 == null) {
				return null;
			}
			local84 = arg2.method5201(local129, local108, Static82.anInt1533, this.anInt5037 + 64, this.anInt5034 - -850);
			@Pc(152) int local152;
			if (this.aShortArray88 != null) {
				for (local152 = 0; local152 < this.aShortArray88.length; local152++) {
					local84.method4351(this.aShortArray88[local152], this.aShortArray86[local152]);
				}
			}
			if (this.aShortArray87 != null) {
				for (local152 = 0; local152 < this.aShortArray87.length; local152++) {
					local84.method4319(this.aShortArray87[local152], this.aShortArray89[local152]);
				}
			}
			local84.method4339(local5);
			@Pc(200) Class109 local200 = Static128.aClass109_42;
			synchronized (Static128.aClass109_42) {
				Static128.aClass109_42.method2855((long) (this.anInt5027 |= arg2.anInt5811 << 29), local84);
			}
		}
		@Pc(244) Class112 local244 = local20 == null ? local84.method4349((byte) 2, local5, true) : local20.method2270(local5, arg0, 0, arg1, arg4, (byte) 2, local84);
		if (this.anInt5035 != 128 || this.anInt5036 != 128) {
			local244.method4332(this.anInt5035, this.anInt5036, this.anInt5035);
		}
		if (this.anInt5029 != 0) {
			if (this.anInt5029 == 90) {
				local244.method4309(4096);
			}
			if (this.anInt5029 == 180) {
				local244.method4309(8192);
			}
			if (this.anInt5029 == 270) {
				local244.method4309(12288);
			}
		}
		local244.method4339(arg3);
		return local244;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method4487(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5115();
			if (local11 == 0) {
				return;
			}
			this.method4489(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!rg;ZI)V")
	private void method4489(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5032 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt5031 = arg0.method5106();
		} else if (arg1 == 4) {
			this.anInt5035 = arg0.method5106();
		} else if (arg1 == 5) {
			this.anInt5036 = arg0.method5106();
		} else if (arg1 == 6) {
			this.anInt5029 = arg0.method5106();
		} else if (arg1 == 7) {
			this.anInt5037 = arg0.method5115();
		} else if (arg1 == 8) {
			this.anInt5034 = arg0.method5115();
		} else if (arg1 == 9) {
			this.aBoolean417 = true;
		} else if (arg1 == 10) {
			this.aBoolean418 = true;
		} else {
			@Pc(74) int local74;
			@Pc(84) int local84;
			if (arg1 == 40) {
				local74 = arg0.method5115();
				this.aShortArray88 = new short[local74];
				this.aShortArray86 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray88[local84] = (short) arg0.method5106();
					this.aShortArray86[local84] = (short) arg0.method5106();
				}
			} else if (arg1 == 41) {
				local74 = arg0.method5115();
				this.aShortArray89 = new short[local74];
				this.aShortArray87 = new short[local74];
				for (local84 = 0; local84 < local74; local84++) {
					this.aShortArray87[local84] = (short) arg0.method5106();
					this.aShortArray89[local84] = (short) arg0.method5106();
				}
				return;
			}
		}
	}
}
