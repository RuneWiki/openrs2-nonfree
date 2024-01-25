import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class290 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "[[Lclient!ag;")
	private Class11[][] aClass11ArrayArray1;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "Lclient!wr;")
	private final Class42_Sub1 aClass42_Sub1_16;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Lclient!uw;")
	private final Class215_Sub3 aClass215_Sub3_2;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	public final int anInt8770;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
	private final int anInt8781;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
	private final int anInt8769;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "[B")
	public final byte[] aByteArray109;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
	private final int anInt8780;

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
	private final int anInt8778;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!wr;Lclient!uw;)V")
	public Class290(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class215_Sub3 arg1) {
		this.aClass42_Sub1_16 = arg0;
		this.aClass215_Sub3_2 = arg1;
		this.anInt8770 = (this.aClass215_Sub3_2.anInt9451 * this.aClass215_Sub3_2.anInt9452 >> this.aClass42_Sub1_16.anInt7103) + 2;
		this.anInt8781 = (this.aClass215_Sub3_2.anInt9450 * this.aClass215_Sub3_2.anInt9451 >> this.aClass42_Sub1_16.anInt7103) + 2;
		this.anInt8769 = this.aClass42_Sub1_16.anInt7103 + 7 - this.aClass215_Sub3_2.anInt9453;
		this.aByteArray109 = new byte[this.anInt8770 * this.anInt8781];
		this.anInt8780 = this.aClass215_Sub3_2.anInt9452 >> this.anInt8769;
		this.anInt8778 = this.aClass215_Sub3_2.anInt9450 >> this.anInt8769;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!k;I)V")
	public void method7200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub4_Sub10 arg2) {
		@Pc(17) Class12_Sub4_Sub10_Sub1 local17 = (Class12_Sub4_Sub10_Sub1) arg2;
		arg0 += local17.anInt4523 + 1;
		arg1 += local17.anInt4519 + 1;
		@Pc(38) int local38 = arg1 * this.anInt8770 + arg0;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local17.anInt4525;
		@Pc(46) int local46 = local17.anInt4517;
		@Pc(52) int local52 = this.anInt8770 - local46;
		@Pc(54) int local54 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local43 -= local61;
			local40 = local46 * local61;
			arg1 = 1;
			local38 += this.anInt8770 * local61;
		}
		if (this.anInt8781 <= local43 + arg1) {
			local61 = local43 + arg1 + 1 - this.anInt8781;
			local43 -= local61;
		}
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			arg0 = 1;
			local38 += local61;
			local46 -= local61;
			local52 += local61;
			local40 += local61;
			local54 = local61;
		}
		if (local46 + arg0 >= this.anInt8770) {
			local61 = arg0 + local46 + 1 - this.anInt8770;
			local54 += local61;
			local52 += local61;
			local46 -= local61;
		}
		if (local46 > 0 && local43 > 0) {
			Static116.method2389(local40, local54, local43, local17.aByteArray52, this.aByteArray109, local38, local52, local46);
			this.method7201(arg0, arg1, local46, local43);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIII)V")
	private void method7201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass11ArrayArray1 == null) {
			return;
		}
		@Pc(20) int local20 = arg0 - 1 >> 7;
		@Pc(30) int local30 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg1 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local20; local48 <= local30; local48++) {
			@Pc(55) Class11[] local55 = this.aClass11ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean6 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIILclient!k;)V")
	public void method7202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub4_Sub10 arg2) {
		@Pc(6) Class12_Sub4_Sub10_Sub1 local6 = (Class12_Sub4_Sub10_Sub1) arg2;
		arg0 += local6.anInt4519 + 1;
		arg1 += local6.anInt4523 + 1;
		@Pc(28) int local28 = arg1 + arg0 * this.anInt8770;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt4525;
		@Pc(36) int local36 = local6.anInt4517;
		@Pc(42) int local42 = this.anInt8770 - local36;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local28 += this.anInt8770 * local51;
			local30 = local36 * local51;
			local33 -= local51;
			arg0 = 1;
		}
		if (this.anInt8781 <= arg0 + local33) {
			local51 = local33 + arg0 + 1 - this.anInt8781;
			local33 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local42 += local51;
			arg1 = 1;
			local30 += local51;
			local36 -= local51;
			local28 += local51;
			local44 = local51;
		}
		if (local36 + arg1 >= this.anInt8770) {
			local51 = arg1 + local36 + 1 - this.anInt8770;
			local42 += local51;
			local36 -= local51;
			local44 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static425.method6544(local44, local30, local28, local36, local6.aByteArray52, local42, this.aByteArray109, local33);
			this.method7201(arg1, arg0, local36, local33);
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(IIILclient!k;)Z")
	public boolean method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class12_Sub4_Sub10 arg2) {
		@Pc(6) Class12_Sub4_Sub10_Sub1 local6 = (Class12_Sub4_Sub10_Sub1) arg2;
		arg1 += local6.anInt4519 + 1;
		arg0 += local6.anInt4523 + 1;
		@Pc(27) int local27 = arg1 * this.anInt8770 + arg0;
		@Pc(30) int local30 = local6.anInt4525;
		@Pc(33) int local33 = local6.anInt4517;
		@Pc(39) int local39 = this.anInt8770 - local33;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local30 -= local46;
			arg1 = 1;
			local27 += this.anInt8770 * local46;
		}
		if (local30 + arg1 >= this.anInt8781) {
			local46 = arg1 + local30 + 1 - this.anInt8781;
			local30 -= local46;
		}
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			local27 += local46;
			local39 += local46;
			arg0 = 1;
			local33 -= local46;
		}
		if (local33 + arg0 >= this.anInt8770) {
			local46 = arg0 + local33 + 1 - this.anInt8770;
			local33 -= local46;
			local39 += local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt8770 * 7;
			return Static13.method355(local39, local27, this.aByteArray109, local30, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public void method7205() {
		this.aClass11ArrayArray1 = new Class11[this.anInt8780][this.anInt8778];
		for (@Pc(18) int local18 = 0; local18 < this.anInt8778; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt8780; local22++) {
				this.aClass11ArrayArray1[local22][local18] = new Class11(this.aClass42_Sub1_16, this, this.aClass215_Sub3_2, local22, local18, this.anInt8769, local22 * 128 + 1, local18 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[[ZIIZ)V")
	public void method7207(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass42_Sub1_16.method5886(false);
		this.aClass42_Sub1_16.method5885(false);
		this.aClass42_Sub1_16.method5955(1);
		this.aClass42_Sub1_16.method5979(1);
		this.aClass42_Sub1_16.method5997(-2, false, false);
		@Pc(46) float local46 = 1.0F / (float) (this.aClass42_Sub1_16.anInt7115 * 128);
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(66) int local66;
		if (arg4) {
			for (local50 = 0; local50 < this.anInt8778; local50++) {
				local57 = local50 << this.anInt8769;
				local64 = local50 + 1 << this.anInt8769;
				label83: for (local66 = 0; local66 < this.anInt8780; local66++) {
					@Pc(326) int local326 = local66 << this.anInt8769;
					@Pc(333) int local333 = local66 + 1 << this.anInt8769;
					for (@Pc(335) int local335 = local326; local335 < local333; local335++) {
						if (local335 - arg3 >= -arg2 && arg2 >= local335 - arg3) {
							for (@Pc(351) int local351 = local57; local351 < local64; local351++) {
								if (-arg2 <= local351 - arg0 && arg2 >= local351 - arg0 && arg1[arg2 + local335 - arg3][local351 + arg2 - arg0]) {
									@Pc(391) Class91_Sub2 local391 = this.aClass42_Sub1_16.method5903();
									local391.method5504(1.0F, local46, local46);
									local391.TA(-local66, -local50, 0);
									this.aClass42_Sub1_16.method5918(Static261.aClass299_2);
									this.aClass11ArrayArray1[local66][local50].method297();
									continue label83;
								}
							}
						}
					}
				}
			}
		} else {
			for (local50 = 0; local50 < this.anInt8778; local50++) {
				local57 = local50 << this.anInt8769;
				local64 = local50 + 1 << this.anInt8769;
				for (local66 = 0; local66 < this.anInt8780; local66++) {
					@Pc(75) Class11 local75 = this.aClass11ArrayArray1[local66][local50];
					@Pc(84) Interface18 local84 = this.aClass42_Sub1_16.method5901(local75.anInt165 * 3);
					@Pc(89) Buffer local89 = local84.method7895();
					if (local89 != null) {
						@Pc(97) Stream local97 = this.aClass42_Sub1_16.method5871(local89);
						@Pc(99) int local99 = 0;
						@Pc(104) int local104 = local66 << this.anInt8769;
						@Pc(111) int local111 = local66 + 1 << this.anInt8769;
						for (@Pc(113) int local113 = local57; local113 < local64; local113++) {
							if (local113 - arg0 >= -arg2 && local113 - arg0 <= arg2) {
								@Pc(139) int local139 = local104 + local113 * this.aClass215_Sub3_2.anInt9452;
								for (@Pc(141) int local141 = local104; local141 < local111; local141++) {
									if (local141 - arg3 >= -arg2 && arg2 >= local141 - arg3 && arg1[local141 + arg2 - arg3][local113 + arg2 - arg0]) {
										@Pc(183) short[] local183 = this.aClass215_Sub3_2.aShortArrayArray12[local139];
										if (local183 != null) {
											@Pc(189) int local189;
											if (Stream.c()) {
												for (local189 = 0; local189 < local183.length; local189++) {
													local97.a(local183[local189] & 0xFFFF);
													local99++;
												}
											} else {
												for (local189 = 0; local189 < local183.length; local189++) {
													local99++;
													local97.d(local183[local189] & 0xFFFF);
												}
											}
										}
									}
									local139++;
								}
							}
						}
						local97.a();
						if (local84.method7899() && local99 > 0) {
							@Pc(260) Class91_Sub2 local260 = this.aClass42_Sub1_16.method5903();
							local260.method5504(1.0F, local46, local46);
							local260.TA(-local66, -local50, 0);
							this.aClass42_Sub1_16.method5918(Static261.aClass299_2);
							local75.method294(local84, local99 / 3);
						}
					}
				}
			}
		}
		this.aClass42_Sub1_16.method5966();
	}
}
