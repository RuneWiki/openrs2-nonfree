import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class25_Sub2_Sub2_Sub1 extends Class25_Sub2_Sub2 {

	@OriginalMember(owner = "client!bba", name = "K", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!bba", name = "V", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!bba", name = "Z", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!bba", name = "bb", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!bba", name = "eb", descriptor = "Lclient!iu;")
	private Class25_Sub7 aClass25_Sub7_1;

	@OriginalMember(owner = "client!bba", name = "hb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!bba", name = "rb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bba", name = "sb", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!bba", name = "Db", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!bba", name = "Eb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!bba", name = "Gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!bba", name = "jb", descriptor = "I")
	private int anInt509 = -1;

	@OriginalMember(owner = "client!bba", name = "R", descriptor = "I")
	private int anInt496 = 0;

	@OriginalMember(owner = "client!bba", name = "xb", descriptor = "I")
	private int anInt520 = 0;

	@OriginalMember(owner = "client!bba", name = "tb", descriptor = "I")
	private int anInt516 = 0;

	@OriginalMember(owner = "client!bba", name = "vb", descriptor = "I")
	private int anInt518 = 0;

	@OriginalMember(owner = "client!bba", name = "zb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bba", name = "qb", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bba", name = "Ab", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!bba", name = "Bb", descriptor = "I")
	public final int anInt522;

	@OriginalMember(owner = "client!bba", name = "cb", descriptor = "I")
	private final int anInt505;

	@OriginalMember(owner = "client!bba", name = "Hb", descriptor = "I")
	private final int anInt525;

	@OriginalMember(owner = "client!bba", name = "W", descriptor = "I")
	private final int anInt500;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
	public final int anInt490;

	@OriginalMember(owner = "client!bba", name = "P", descriptor = "I")
	private final int anInt494;

	@OriginalMember(owner = "client!bba", name = "wb", descriptor = "I")
	public final int anInt519;

	@OriginalMember(owner = "client!bba", name = "N", descriptor = "I")
	public final int anInt493;

	@OriginalMember(owner = "client!bba", name = "ib", descriptor = "Lclient!qg;")
	private final Class270 aClass270_1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class25_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static78.method3298(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean37 = arg12;
		this.aBoolean35 = false;
		this.anInt522 = arg11;
		this.anInt505 = arg5;
		this.anInt525 = arg8;
		this.anInt500 = arg9;
		this.anInt490 = arg7;
		this.anInt494 = arg0;
		this.anInt519 = arg6;
		this.anInt493 = arg10;
		@Pc(85) int local85 = Static386.aClass23_1.method228(this.anInt494).anInt7025;
		if (local85 == -1) {
			this.aClass270_1 = null;
		} else {
			this.aClass270_1 = Static245.aClass155_1.method3820(local85);
		}
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		return arg0 <= 108 ? 64 : this.anInt516;
	}

	@OriginalMember(owner = "client!bba", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return this.anInt496;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(11) Class52 local11 = this.method480(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class42 local18 = arg0.method8052();
		local18.oa(this.anInt515);
		local18.ZA(this.anInt504);
		local18.U((int) this.aDouble7, (int) this.aDouble3, (int) this.aDouble4);
		this.method479(arg0, local18, local11);
		if (Static547.aBoolean631) {
			local11.method7619(local18, null, Static150.anInt3469, 0);
		} else {
			local11.method7617(local18, null, 0);
		}
		if (this.aClass25_Sub7_1 != null) {
			@Pc(65) Class323 local65 = this.aClass25_Sub7_1.method3777();
			if (Static547.aBoolean631) {
				arg0.method8070(local65, Static150.anInt3469);
			} else {
				arg0.method8090(local65);
			}
		}
		this.aBoolean36 = local11.LA();
		this.anInt496 = local11.J();
		this.anInt516 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!bba", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean36;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)V")
	@Override
	public void method6661() {
		super.aShort107 = super.aShort109 = (short) (this.aDouble4 / 512.0D);
		super.aShort106 = super.aShort108 = (short) (this.aDouble7 / 512.0D);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	@Override
	public void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass25_Sub7_1 != null) {
			this.aClass25_Sub7_1.method3778();
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
	public void method475() {
		if (this.aClass25_Sub7_1 != null) {
			this.aClass25_Sub7_1.method3778();
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)V")
	@Override
	public void method6644() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIII)V")
	public void method477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean35) {
			local9 = arg2 - super.anInt8476;
			@Pc(16) double local16 = (double) (arg3 - super.anInt8482);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble7 = (double) this.anInt500 * local9 / local25 + (double) super.anInt8476;
			this.aDouble4 = local16 * (double) this.anInt500 / local25 + (double) super.anInt8482;
			if (this.aBoolean37) {
				this.aDouble3 = Static78.method3298((int) this.aDouble7, super.aByte117, (int) this.aDouble4) - this.anInt505;
			} else {
				this.aDouble3 = super.anInt8480;
			}
		}
		local9 = this.anInt490 + 1 - arg0;
		this.aDouble1 = ((double) arg2 - this.aDouble7) / local9;
		this.aDouble8 = ((double) arg3 - this.aDouble4) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble1 * this.aDouble1);
		if (this.anInt525 == -1) {
			this.aDouble2 = ((double) arg1 - this.aDouble3) / local9;
		} else {
			if (!this.aBoolean35) {
				this.aDouble2 = -this.aDouble6 * Math.tan((double) this.anInt525 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg1 - this.aDouble2 * local9 - this.aDouble3) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(II)V")
	public void method478(@OriginalArg(0) int arg0) {
		this.aDouble7 += this.aDouble1 * (double) arg0;
		this.aBoolean35 = true;
		this.aDouble4 += (double) arg0 * this.aDouble8;
		if (this.aBoolean37) {
			this.aDouble3 = Static78.method3298((int) this.aDouble7, super.aByte117, (int) this.aDouble4) - this.anInt505;
		} else if (this.anInt525 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble2;
		} else {
			this.aDouble3 += (double) arg0 * this.aDouble2 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble5;
			this.aDouble2 += this.aDouble5 * (double) arg0;
		}
		this.anInt504 = (int) (Math.atan2(this.aDouble1, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt515 = (int) (Math.atan2(this.aDouble2, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass270_1 == null) {
			return;
		}
		this.anInt520 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass270_1.anIntArray445[this.anInt518] >= this.anInt520) {
						return;
					}
					this.anInt520 -= this.aClass270_1.anIntArray445[this.anInt518];
					this.anInt518++;
					if (this.anInt518 >= this.aClass270_1.anIntArray443.length) {
						this.anInt518 -= this.aClass270_1.anInt7683;
						if (this.anInt518 < 0 || this.anInt518 >= this.aClass270_1.anIntArray443.length) {
							this.anInt518 = 0;
						}
					}
					this.anInt509 = this.anInt518 + 1;
				} while (this.anInt509 < this.aClass270_1.anIntArray443.length);
				this.anInt509 -= this.aClass270_1.anInt7683;
			} while (this.anInt509 >= 0 && this.aClass270_1.anIntArray443.length > this.anInt509);
			this.anInt509 = -1;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!r;Lclient!q;BLclient!da;)V")
	private void method479(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class52 arg2) {
		arg2.method7614(arg1);
		@Pc(13) Class317[] local13 = arg2.method7613();
		@Pc(16) Class280[] local16 = arg2.method7636();
		if ((this.aClass25_Sub7_1 == null || this.aClass25_Sub7_1.aBoolean304) && (local13 != null || local16 != null)) {
			this.aClass25_Sub7_1 = Static236.method3776(Static397.anInt6998, true);
		}
		if (this.aClass25_Sub7_1 != null) {
			this.aClass25_Sub7_1.method3784(arg0, (long) Static397.anInt6998, local13, local16);
			this.aClass25_Sub7_1.method3786(super.aByte117, super.aShort106, super.aShort108, super.aShort107, super.aShort109);
		}
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6643() {
		return false;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!r;I)Lclient!da;")
	private Class52 method480(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class250 local15 = Static386.aClass23_1.method228(this.anInt494);
		return local15.method5609(this.anInt518, Static245.aClass155_1, this.anInt509, arg0, this.anInt520, arg1);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
		@Pc(9) Class52 local9 = this.method480(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class42 local15 = arg0.method8052();
		local15.oa(this.anInt515);
		local15.ZA(this.anInt504);
		local15.U((int) this.aDouble7, (int) this.aDouble3, (int) this.aDouble4);
		this.anInt496 = local9.J();
		this.anInt516 = local9.RA();
		this.method479(arg0, local15, local9);
	}
}
