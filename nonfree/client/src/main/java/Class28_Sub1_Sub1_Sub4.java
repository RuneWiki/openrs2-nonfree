import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class28_Sub1_Sub1_Sub4 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!pda", name = "db", descriptor = "Lclient!sp;")
	private Class28_Sub7 aClass28_Sub7_5;

	@OriginalMember(owner = "client!pda", name = "bb", descriptor = "I")
	private int anInt7500 = 0;

	@OriginalMember(owner = "client!pda", name = "ub", descriptor = "I")
	private int anInt7515 = 0;

	@OriginalMember(owner = "client!pda", name = "wb", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!pda", name = "vb", descriptor = "I")
	private int anInt7516 = 0;

	@OriginalMember(owner = "client!pda", name = "mb", descriptor = "I")
	private int anInt7509 = 0;

	@OriginalMember(owner = "client!pda", name = "gb", descriptor = "I")
	private final int anInt7504 = -1;

	@OriginalMember(owner = "client!pda", name = "fb", descriptor = "I")
	private int anInt7503 = 0;

	@OriginalMember(owner = "client!pda", name = "tb", descriptor = "Z")
	private boolean aBoolean557 = true;

	@OriginalMember(owner = "client!pda", name = "cb", descriptor = "I")
	private final int anInt7501;

	@OriginalMember(owner = "client!pda", name = "hb", descriptor = "I")
	public final int anInt7505;

	@OriginalMember(owner = "client!pda", name = "nb", descriptor = "Lclient!vq;")
	private Class372 aClass372_3;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class28_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7515 = arg12;
		this.anInt7501 = arg0;
		this.anInt7505 = arg1 + arg2;
		@Pc(53) Class144 local53 = Static354.aClass236_2.method5615(this.anInt7501);
		@Pc(56) int local56 = local53.anInt4332;
		if (local56 == -1) {
			this.aBoolean558 = true;
		} else {
			this.aClass372_3 = Static243.aClass343_3.method8356(local56);
			this.aBoolean558 = false;
		}
		if (this.anInt7505 == arg2) {
			Static548.method7844(this, this.aClass372_3, this.anInt7503);
		}
	}

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.anInt7503 = -55;
		}
		return this.anInt7509;
	}

	@OriginalMember(owner = "client!pda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub7_5 != null) {
			this.aClass28_Sub7_5.method7915();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "(I)V")
	@Override
	public void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ha;IZI)Lclient!ka;")
	private Class95 method6628(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class144 local8 = Static354.aClass236_2.method5615(arg2);
		@Pc(13) Class21 local13 = Static582.aClass21Array3[super.aByte174];
		@Pc(33) Class21 local33 = super.aByte173 >= 3 ? null : Static582.aClass21Array3[super.aByte173 + 1];
		return this.aBoolean558 ? local8.method3923(super.anInt10722, arg1, 0, super.anInt10729, -1, -1, Static243.aClass343_3, local13, super.anInt10731, local33, arg0) : local8.method3923(super.anInt10722, arg1, this.anInt7516, super.anInt10729, this.anInt7504, this.anInt7503, Static243.aClass343_3, local13, super.anInt10731, local33, arg0);
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(Z)V")
	public void method6629() {
		if (this.aClass28_Sub7_5 != null) {
			this.aClass28_Sub7_5.method7915();
		}
	}

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(23) Class95 local23 = this.method6628(arg0, (this.anInt7515 == 0 ? 0 : 5) | 0x800, this.anInt7501);
		if (local23 == null) {
			return null;
		}
		if (this.anInt7515 != 0) {
			local23.a(this.anInt7515 * 2048);
		}
		@Pc(46) Class239 local46 = arg0.method8447();
		local46.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
		this.method6631(local23, local46, arg0);
		@Pc(65) Class28_Sub3 local65 = Static4.method120(false, 1);
		if (Static443.aBoolean515) {
			local23.method5659(local46, local65.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
		} else {
			local23.method5653(local46, local65.aClass28_Sub8Array1[0], 0);
		}
		if (this.aClass28_Sub7_5 != null) {
			@Pc(93) Class84 local93 = this.aClass28_Sub7_5.method7917();
			if (Static443.aBoolean515) {
				arg0.method8506(local93, Static675.anInt10880);
			} else {
				arg0.method8499(local93);
			}
		}
		this.aBoolean557 = local23.F();
		this.anInt7500 = local23.fa();
		this.anInt7509 = local23.ma();
		return local65;
	}

	@OriginalMember(owner = "client!pda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IB)V")
	public void method6630(@OriginalArg(0) int arg0) {
		if (this.aBoolean558) {
			return;
		}
		this.anInt7516 += arg0;
		while (this.aClass372_3.anIntArray900[this.anInt7503] < this.anInt7516) {
			this.anInt7516 -= this.aClass372_3.anIntArray900[this.anInt7503];
			this.anInt7503++;
			if (this.aClass372_3.anIntArray901.length <= this.anInt7503) {
				this.aBoolean558 = true;
				break;
			}
		}
		if (!this.aBoolean558) {
			Static548.method7844(this, this.aClass372_3, this.anInt7503);
		}
	}

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
		@Pc(18) Class95 local18 = this.method6628(arg0, 0, this.anInt7501);
		if (local18 != null) {
			@Pc(23) Class239 local23 = arg0.method8447();
			local23.method9234(super.anInt10729, super.anInt10722, super.anInt10731);
			this.method6631(local18, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!ka;Lclient!uu;Lclient!ha;)V")
	private void method6631(@OriginalArg(1) Class95 arg0, @OriginalArg(2) Class239 arg1, @OriginalArg(3) Class13 arg2) {
		arg0.method5669(arg1);
		@Pc(17) Class49[] local17 = arg0.method5654();
		@Pc(20) Class197[] local20 = arg0.method5668();
		if ((this.aClass28_Sub7_5 == null || this.aClass28_Sub7_5.aBoolean709) && (local17 != null || local20 != null)) {
			this.aClass28_Sub7_5 = Static556.method7916(Static588.anInt9467, true);
		}
		if (this.aClass28_Sub7_5 != null) {
			this.aClass28_Sub7_5.method7910(arg2, (long) Static588.anInt9467, local17, local20);
			this.aClass28_Sub7_5.method7914(super.aByte174, super.aShort125, super.aShort124, super.aShort123, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!pda", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return this.anInt7500;
	}
}
