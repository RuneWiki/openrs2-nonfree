import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class142 {

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
	private int anInt4292;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "Lclient!oi;")
	public Class19_Sub9 aClass19_Sub9_6;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "Lclient!r;")
	private Class3_Sub4_Sub13 aClass3_Sub4_Sub13_2;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "Lclient!ka;")
	private Class157 aClass157_3;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Lclient!mka;")
	private Class241 aClass241_1;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
	private int anInt4299 = 0;

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
	private int anInt4298 = -1;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	private int anInt4289 = 0;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Z")
	private boolean aBoolean357 = false;

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
	public final int anInt4301;

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "B")
	private final byte aByte76;

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "Lclient!bla;")
	private final Class19_Sub1 aClass19_Sub1_10;

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "I")
	public final int anInt4295;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
	public final int anInt4300;

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "B")
	private final byte aByte75;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "Lclient!js;")
	private final Class100 aClass100_7;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!ha;Lclient!hca;IIIILclient!bla;ZI)V")
	public Class142(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt4301 = arg2;
		this.aByte76 = (byte) arg4;
		this.aBoolean358 = arg8 != -1;
		this.aClass19_Sub1_10 = arg6;
		this.anInt4295 = arg1.anInt4397;
		this.aBoolean357 = arg7;
		this.anInt4300 = arg3;
		this.aByte75 = (byte) arg5;
		this.aBoolean355 = arg0.method7658() && arg1.aBoolean379 && !this.aBoolean357;
		this.aClass100_7 = new Class100_Sub1(arg6, false);
		this.method3543(1, false, arg8);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!bla;I)V")
	private void method3536(@OriginalArg(0) Class19_Sub1 arg0) {
		if (!this.aClass100_7.method8963()) {
			this.method3543(0, false, -1);
		} else if (this.aClass100_7.method8971(Static269.anInt4883 - this.anInt4292)) {
			if (Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() == 2) {
				this.aBoolean356 = false;
			}
			if (this.aClass100_7.method8959()) {
				this.aClass100_7.method8962(-1);
				this.aBoolean358 = false;
				this.method3543(0, false, -1);
			}
		}
		this.anInt4292 = Static269.anInt4883;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)I")
	public int method3537(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method3547(14);
		}
		return this.anInt4299;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method3538(@OriginalArg(0) Class67 arg0) {
		this.method3545(262144, true, arg0, true);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLclient!mka;)V")
	public void method3539(@OriginalArg(1) Class241 arg0) {
		this.aClass241_1 = arg0;
		this.aClass157_3 = null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BLclient!ha;)V")
	public void method3540(@OriginalArg(1) Class67 arg0) {
		if (this.aClass3_Sub4_Sub13_2 != null) {
			Static395.method5941(this.aClass3_Sub4_Sub13_2, this.aByte75, this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211, this.aBooleanArray14);
			this.aClass3_Sub4_Sub13_2 = null;
			this.aBooleanArray14 = null;
		}
	}

	@OriginalMember(owner = "client!gw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass19_Sub9_6 != null) {
			this.aClass19_Sub9_6.method6766();
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z")
	public boolean method3541() {
		return this.aBoolean355;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
	public int method3542() {
		return this.anInt4289;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBZI)V")
	private void method3543(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2;
		@Pc(9) boolean local9 = false;
		if (arg2 == -1) {
			@Pc(18) Class144 local18 = Static70.aClass323_1.method7792(this.anInt4295);
			@Pc(20) Class144 local20 = local18;
			if (local18.anIntArray239 != null) {
				local18 = local18.method3629(Static334.anInt5845 == 3 ? Static536.anInterface10_3 : Static577.aClass362_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.method3626()) {
				if (arg1 && this.aClass100_7.method8963() && local18.method3643(this.aClass100_7.method8976())) {
					return;
				}
				if (this.anInt4298 != local18.anInt4397) {
					local9 = local18.aBoolean370;
				}
				local7 = local18.method3631();
				if (local18.method3636()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			} else if (local20 != null && local20.method3626()) {
				if (arg1 && this.aClass100_7.method8963() && local20.method3643(this.aClass100_7.method8976())) {
					return;
				}
				if (this.anInt4298 != local18.anInt4397) {
					local9 = local20.aBoolean370;
				}
				local7 = local20.method3631();
				if (local20.method3636()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			}
		}
		if (local7 == -1) {
			this.aClass100_7.method8960();
		} else {
			this.aClass100_7.method8973(arg0, 0, local7, local9);
			this.aClass157_3 = null;
			this.aBoolean356 = false;
			this.anInt4292 = Static269.anInt4883;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ka;IIILclient!iu;IZLclient!ha;I)V")
	public void method3544(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class156[] local6 = arg0.method5214();
		@Pc(9) Class348[] local9 = arg0.method5222();
		if ((this.aClass19_Sub9_6 == null || this.aClass19_Sub9_6.aBoolean615) && (local6 != null || local9 != null)) {
			@Pc(32) Class144 local32 = Static70.aClass323_1.method7792(this.anInt4295);
			if (local32.anIntArray239 != null) {
				local32 = local32.method3629(Static334.anInt5845 == 3 ? Static536.anInterface10_3 : Static577.aClass362_1);
			}
			if (local32 != null) {
				this.aClass19_Sub9_6 = Static457.method6772(Static269.anInt4883, true);
			}
		}
		if (this.aClass19_Sub9_6 == null) {
			return;
		}
		arg0.method5226(arg3);
		if (arg5) {
			this.aClass19_Sub9_6.method6774(arg6, (long) Static269.anInt4883, local6, local9);
		} else {
			this.aClass19_Sub9_6.method6781((long) Static269.anInt4883);
		}
		this.aClass19_Sub9_6.method6768(this.aByte76, arg1, arg4, arg7, arg2);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BIZLclient!ha;Z)Lclient!ka;")
	public Class157 method3545(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class144 local11 = Static70.aClass323_1.method7792(this.anInt4295);
		if (local11.anIntArray239 != null) {
			local11 = local11.method3629(Static334.anInt5845 == 3 ? Static536.anInterface10_3 : Static577.aClass362_1);
		}
		if (local11 == null) {
			this.method3540(arg2);
			this.anInt4298 = -1;
			return null;
		}
		if (!this.aBoolean358 && this.anInt4298 != local11.anInt4397) {
			this.method3543(0, true, -1);
			this.aBoolean356 = false;
			this.aClass157_3 = null;
		}
		this.method3536(this.aClass19_Sub1_10);
		if (arg3) {
			arg3 &= !this.aBoolean356 & this.aBoolean355 & Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987() != 0;
		}
		if (arg1 && !arg3) {
			this.anInt4298 = local11.anInt4397;
			return null;
		}
		if (arg3) {
			Static395.method5941(this.aClass3_Sub4_Sub13_2, this.aByte75, this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211, this.aBooleanArray14);
			this.aBoolean356 = false;
		}
		@Pc(137) Class313 local137 = Static639.aClass313Array2[this.aByte75];
		@Pc(156) Class313 local156;
		if (this.aBoolean357) {
			local156 = Static167.aClass313Array1[0];
		} else {
			local156 = this.aByte75 < 3 ? Static639.aClass313Array2[this.aByte75 + 1] : null;
		}
		@Pc(164) Class157 local164 = null;
		if (this.aClass100_7.method8963()) {
			if (arg3) {
				arg0 |= 0x40000;
			}
			local164 = local11.method3638(this.aClass241_1, this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211, this.anInt4301 == 11 ? 10 : this.anInt4301, local137, this.anInt4301 == 11 ? this.anInt4300 + 4 : this.anInt4300, arg2, local137.method9096(this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211), arg0, local156, this.aClass100_7);
			if (local164 == null) {
				this.aBooleanArray14 = null;
				this.aClass3_Sub4_Sub13_2 = null;
				this.anInt4299 = 0;
				this.anInt4289 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray14 == null) {
						this.aBooleanArray14 = new boolean[4];
					}
					this.aClass3_Sub4_Sub13_2 = local164.ba(this.aClass3_Sub4_Sub13_2);
					Static108.method1948(this.aClass3_Sub4_Sub13_2, this.aByte75, this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211, this.aBooleanArray14);
					this.aBoolean356 = true;
				}
				this.anInt4289 = local164.fa();
				this.anInt4299 = local164.ma();
			}
			this.aClass157_3 = null;
		} else if (this.aClass157_3 != null && arg0 == (this.aClass157_3.ua() & arg0) && local11.anInt4397 == this.anInt4298) {
			local164 = this.aClass157_3;
		} else {
			if (this.aClass157_3 != null) {
				arg0 |= this.aClass157_3.ua();
			}
			@Pc(262) Class179 local262 = local11.method3634(this.aClass19_Sub1_10.anInt11204, arg2, arg3, arg0, local137.method9096(this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211), this.anInt4301 == 11 ? 10 : this.anInt4301, this.aClass19_Sub1_10.anInt11211, local156, this.anInt4301 == 11 ? this.anInt4300 + 4 : this.anInt4300, local137, this.aClass241_1);
			if (local262 == null) {
				this.aClass3_Sub4_Sub13_2 = null;
				this.anInt4299 = 0;
				this.anInt4289 = 0;
				this.aClass157_3 = null;
				this.aBooleanArray14 = null;
			} else {
				local164 = local262.aClass157_4;
				this.aClass157_3 = local262.aClass157_4;
				if (arg3) {
					this.aClass3_Sub4_Sub13_2 = local262.aClass3_Sub4_Sub13_3;
					this.aBooleanArray14 = null;
					Static108.method1948(this.aClass3_Sub4_Sub13_2, this.aByte75, this.aClass19_Sub1_10.anInt11204, this.aClass19_Sub1_10.anInt11211, (boolean[]) null);
					this.aBoolean356 = true;
				}
				this.anInt4289 = local164.fa();
				this.anInt4299 = local164.ma();
			}
		}
		this.anInt4298 = local11.anInt4397;
		return local164;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	public void method3547(@OriginalArg(0) int arg0) {
		this.aBoolean358 = true;
		this.method3543(1, false, arg0);
	}
}
