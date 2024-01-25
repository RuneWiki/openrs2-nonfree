import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class336 {

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	public int anInt10113;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!jr;")
	private final Class169 aClass169_59 = new Class169(64);

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!jr;")
	public final Class169 aClass169_60 = new Class169(50);

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!pq;")
	public final Class268 aClass268_1 = new Class268(250);

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!nia;")
	private final Class225 aClass225_1 = new Class225();

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!dc;")
	private final Class70 aClass70_2;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!in;")
	public final Class157 aClass157_275;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public final int anInt10112;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_274;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public final int anInt10100;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray43;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!sj;IZLclient!dc;Lclient!in;Lclient!in;)V")
	public Class336(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(5) Class157 arg5) {
		this.aBoolean693 = arg2;
		this.aClass70_2 = arg3;
		this.aClass157_275 = arg5;
		this.anInt10112 = arg1;
		this.aClass157_274 = arg4;
		if (this.aClass157_274 == null) {
			this.anInt10100 = 0;
		} else {
			@Pc(49) int local49 = this.aClass157_274.method4568() - 1;
			this.anInt10100 = this.aClass157_274.method4561(local49) + local49 * 256;
		}
		this.aStringArray42 = new String[] { null, null, Static588.aClass351_9.method8691(this.anInt10112), null, null };
		this.aStringArray43 = new String[] { null, null, null, null, Static588.aClass351_10.method8691(this.anInt10112) };
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public void method8414() {
		@Pc(2) Class169 local2 = this.aClass169_60;
		synchronized (this.aClass169_60) {
			this.aClass169_60.method5009();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ha;IILclient!da;Lclient!oo;IZBLclient!ha;IZI)Lclient!mi;")
	public Class46 method8416(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class68 arg3, @OriginalArg(4) Class249 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) Class20 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class46 local16 = this.method8425(arg10, arg8, arg2, arg1, arg5, arg7, arg4);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class301 local25 = this.method8424(arg8);
		if (arg2 > 1 && local25.anIntArray601 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg2 >= local25.anIntArray603[local35] && local25.anIntArray603[local35] != 0) {
					local33 = local25.anIntArray601[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method8424(local33);
			}
		}
		@Pc(93) int[] local93 = local25.method7708(arg2, arg9, arg1, arg7, arg0, arg3, arg4, arg5, arg10);
		if (local93 == null) {
			return null;
		}
		@Pc(108) Class46 local108;
		if (arg6) {
			local108 = arg0.method7265(36, local93, 36, 32);
		} else {
			local108 = arg7.method7265(36, local93, 36, 32);
		}
		if (!arg6) {
			@Pc(125) Class225 local125 = new Class225();
			local125.anInt7361 = arg1;
			local125.aBoolean538 = arg4 != null;
			local125.anInt7365 = arg2;
			local125.anInt7367 = arg8;
			local125.anInt7360 = arg5;
			local125.anInt7366 = arg7.anInt8557;
			local125.anInt7368 = arg10;
			this.aClass268_1.method6926(local108, local125);
		}
		return local108;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V")
	public void method8418(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean693 != arg0) {
			this.aBoolean693 = arg0;
			this.method8423();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public void method8420() {
		@Pc(6) Class268 local6 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6923();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
	public void method8421() {
		@Pc(6) Class169 local6 = this.aClass169_59;
		synchronized (this.aClass169_59) {
			this.aClass169_59.method4997(5);
		}
		local6 = this.aClass169_60;
		synchronized (this.aClass169_60) {
			this.aClass169_60.method4997(5);
		}
		@Pc(44) Class268 local44 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6924();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public void method8422() {
		@Pc(6) Class169 local6 = this.aClass169_59;
		synchronized (this.aClass169_59) {
			this.aClass169_59.method5006();
		}
		local6 = this.aClass169_60;
		synchronized (this.aClass169_60) {
			this.aClass169_60.method5006();
		}
		@Pc(36) Class268 local36 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6922();
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public void method8423() {
		@Pc(2) Class169 local2 = this.aClass169_59;
		synchronized (this.aClass169_59) {
			this.aClass169_59.method5009();
		}
		local2 = this.aClass169_60;
		synchronized (this.aClass169_60) {
			this.aClass169_60.method5009();
		}
		@Pc(42) Class268 local42 = this.aClass268_1;
		synchronized (this.aClass268_1) {
			this.aClass268_1.method6923();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!rq;")
	public Class301 method8424(@OriginalArg(1) int arg0) {
		@Pc(8) Class169 local8 = this.aClass169_59;
		@Pc(18) Class301 local18;
		synchronized (this.aClass169_59) {
			local18 = (Class301) this.aClass169_59.method5002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class157 local31 = this.aClass157_274;
		@Pc(44) byte[] local44;
		synchronized (this.aClass157_274) {
			local44 = this.aClass157_274.method4564(Static258.method4738(arg0), Static553.method8246(arg0));
		}
		local18 = new Class301();
		local18.aClass336_1 = this;
		local18.anInt9179 = arg0;
		local18.aStringArray40 = new String[] { null, null, Static588.aClass351_9.method8691(this.anInt10112), null, null };
		local18.aStringArray39 = new String[] { null, null, null, null, Static588.aClass351_10.method8691(this.anInt10112) };
		if (local44 != null) {
			local18.method7715(new Class2_Sub11(local44));
		}
		local18.method7709();
		if (local18.anInt9230 != -1) {
			local18.method7716(this.method8424(local18.anInt9171), this.method8424(local18.anInt9230));
		}
		if (local18.anInt9212 != -1) {
			local18.method7702(this.method8424(local18.anInt9184), this.method8424(local18.anInt9212));
		}
		if (!this.aBoolean693 && local18.aBoolean661) {
			local18.aString97 = Static588.aClass351_7.method8691(this.anInt10112);
			local18.anInt9225 = 0;
			local18.aStringArray40 = this.aStringArray42;
			local18.aStringArray39 = this.aStringArray43;
			local18.aBoolean660 = false;
			local18.anIntArray602 = null;
			if (local18.aClass99_69 != null) {
				@Pc(205) boolean local205 = false;
				for (@Pc(210) Class2 local210 = local18.aClass99_69.method3060(); local210 != null; local210 = local18.aClass99_69.method3058()) {
					@Pc(220) Class335 local220 = this.aClass70_2.method2496((int) local210.aLong278);
					if (local220.aBoolean692) {
						local210.method9253();
					} else {
						local205 = true;
					}
				}
				if (!local205) {
					local18.aClass99_69 = null;
				}
			}
		}
		@Pc(245) Class169 local245 = this.aClass169_59;
		synchronized (this.aClass169_59) {
			this.aClass169_59.method5001(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBIIIILclient!ha;Lclient!oo;)Lclient!mi;")
	public Class46 method8425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) Class249 arg6) {
		this.aClass225_1.anInt7367 = arg1;
		this.aClass225_1.anInt7365 = arg2;
		this.aClass225_1.anInt7366 = arg5.anInt8557;
		this.aClass225_1.anInt7360 = arg4;
		this.aClass225_1.aBoolean538 = arg6 != null;
		this.aClass225_1.anInt7361 = arg3;
		this.aClass225_1.anInt7368 = arg0;
		return (Class46) this.aClass268_1.method6918(this.aClass225_1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	public void method8426(@OriginalArg(0) int arg0) {
		this.anInt10113 = arg0;
		@Pc(9) Class169 local9 = this.aClass169_60;
		synchronized (this.aClass169_60) {
			this.aClass169_60.method5009();
		}
	}
}
