import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class127 {

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public int anInt2934;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Lclient!wq;")
	private final Class391 aClass391_17 = new Class391(64);

	@OriginalMember(owner = "client!fj", name = "v", descriptor = "Lclient!wq;")
	public final Class391 aClass391_18 = new Class391(50);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!wm;")
	public final Class389 aClass389_1 = new Class389(250);

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "Lclient!jea;")
	private final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!la;")
	private final Class208 aClass208_46;

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
	public final int anInt2928;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!la;")
	public final Class208 aClass208_47;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!un;")
	private final Class355 aClass355_2;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public final int anInt2923;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray23;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray22;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!to;IZLclient!un;Lclient!la;Lclient!la;)V")
	public Class127(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class355 arg3, @OriginalArg(4) Class208 arg4, @OriginalArg(5) Class208 arg5) {
		this.aClass208_46 = arg4;
		this.anInt2928 = arg1;
		this.aClass208_47 = arg5;
		this.aBoolean246 = arg2;
		this.aClass355_2 = arg3;
		if (this.aClass208_46 == null) {
			this.anInt2923 = 0;
		} else {
			@Pc(54) int local54 = this.aClass208_46.method4988() - 1;
			this.anInt2923 = this.aClass208_46.method5005(local54) + local54 * 256;
		}
		this.aStringArray23 = new String[] { null, null, Class335.lb.method8349(this.anInt2928), null, null };
		this.aStringArray22 = new String[] { null, null, null, null, Static582.aClass335_10.method8349(this.anInt2928) };
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!ha;ILclient!ee;Lclient!ha;ZLclient!da;IIIZI)Lclient!fs;")
	public Class134 method2495(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class80 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(16) Class134 local16 = this.method2502(arg3, arg9, arg2, arg8, arg4, arg0, arg7);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) Class204 local26 = this.method2501(arg7);
		if (arg2 > 1 && local26.anIntArray317 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg2 >= local26.anIntArray318[local40] && local26.anIntArray318[local40] != 0) {
					local38 = local26.anIntArray317[local40];
				}
			}
			if (local38 != -1) {
				local26 = this.method2501(local38);
			}
		}
		@Pc(102) int[] local102 = local26.method4862(arg8, arg0, arg5, arg3, arg2, arg6, arg9, arg1, arg4);
		if (local102 == null) {
			return null;
		}
		@Pc(118) Class134 local118;
		if (arg10) {
			local118 = arg1.method7679(36, local102, 36, 32);
		} else {
			local118 = arg4.method7679(36, local102, 36, 32);
		}
		if (!arg10) {
			@Pc(142) Class185 local142 = new Class185();
			local142.aBoolean377 = arg3 != null;
			local142.anInt4774 = arg0;
			local142.anInt4775 = arg2;
			local142.anInt4770 = arg4.anInt8956;
			local142.anInt4771 = arg7;
			local142.anInt4766 = arg9;
			local142.anInt4773 = arg8;
			this.aClass389_1.method9246(local142, local118);
		}
		return local118;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
	public void method2496() {
		@Pc(2) Class391 local2 = this.aClass391_17;
		synchronized (this.aClass391_17) {
			this.aClass391_17.method9274(5);
		}
		local2 = this.aClass391_18;
		synchronized (this.aClass391_18) {
			this.aClass391_18.method9274(5);
		}
		@Pc(38) Class389 local38 = this.aClass389_1;
		synchronized (this.aClass389_1) {
			this.aClass389_1.method9253();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)V")
	public void method2497(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean246) {
			this.aBoolean246 = arg0;
			this.method2504();
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	public void method2498() {
		@Pc(6) Class391 local6 = this.aClass391_17;
		synchronized (this.aClass391_17) {
			this.aClass391_17.method9286();
		}
		local6 = this.aClass391_18;
		synchronized (this.aClass391_18) {
			this.aClass391_18.method9286();
		}
		@Pc(40) Class389 local40 = this.aClass389_1;
		synchronized (this.aClass389_1) {
			this.aClass389_1.method9249();
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	public void method2500() {
		@Pc(6) Class389 local6 = this.aClass389_1;
		synchronized (this.aClass389_1) {
			this.aClass389_1.method9257();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)Lclient!ko;")
	public Class204 method2501(@OriginalArg(0) int arg0) {
		@Pc(8) Class391 local8 = this.aClass391_17;
		@Pc(18) Class204 local18;
		synchronized (this.aClass391_17) {
			local18 = (Class204) this.aClass391_17.method9275((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class208 local32 = this.aClass208_46;
		@Pc(45) byte[] local45;
		synchronized (this.aClass208_46) {
			local45 = this.aClass208_46.method4991(Static327.method4992(arg0), Static17.method293(arg0), -14);
		}
		local18 = new Class204();
		local18.anInt5704 = arg0;
		local18.aClass127_2 = this;
		local18.aStringArray36 = new String[] { null, null, Class335.lb.method8349(this.anInt2928), null, null };
		local18.aStringArray35 = new String[] { null, null, null, null, Static582.aClass335_10.method8349(this.anInt2928) };
		if (local45 != null) {
			local18.method4867(new Class5_Sub23(local45));
		}
		local18.method4864();
		if (local18.anInt5701 != -1) {
			local18.method4855(this.method2501(local18.anInt5724), this.method2501(local18.anInt5701));
		}
		if (local18.anInt5728 != -1) {
			local18.method4873(this.method2501(local18.anInt5708), this.method2501(local18.anInt5728));
		}
		if (local18.anInt5689 != -1) {
			local18.method4858(this.method2501(local18.anInt5678), this.method2501(local18.anInt5689));
		}
		if (!this.aBoolean246 && local18.aBoolean432) {
			local18.aString72 = Static582.aClass335_7.method8349(this.anInt2928);
			local18.aStringArray36 = this.aStringArray23;
			local18.anInt5696 = 0;
			local18.aBoolean433 = false;
			local18.aStringArray35 = this.aStringArray22;
			local18.anIntArray316 = null;
			if (local18.aClass291_22 != null) {
				@Pc(236) boolean local236 = false;
				for (@Pc(241) Class5 local241 = local18.aClass291_22.method6987(); local241 != null; local241 = local18.aClass291_22.method6989()) {
					@Pc(251) Class152 local251 = this.aClass355_2.method8693((int) local241.aLong314);
					if (local251.aBoolean270) {
						local241.method9327(1);
					} else {
						local236 = true;
					}
				}
				if (!local236) {
					local18.aClass291_22 = null;
				}
			}
		}
		@Pc(282) Class391 local282 = this.aClass391_17;
		synchronized (this.aClass391_17) {
			this.aClass391_17.method9273((long) arg0, local18, 1);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ee;IIIILclient!ha;II)Lclient!fs;")
	public Class134 method2502(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class57 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass185_1.anInt4770 = arg4.anInt8956;
		this.aClass185_1.anInt4774 = arg5;
		this.aClass185_1.anInt4773 = arg3;
		this.aClass185_1.aBoolean377 = arg0 != null;
		this.aClass185_1.anInt4771 = arg6;
		this.aClass185_1.anInt4775 = arg2;
		this.aClass185_1.anInt4766 = arg1;
		return (Class134) this.aClass389_1.method9250(this.aClass185_1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method2503() {
		@Pc(6) Class391 local6 = this.aClass391_18;
		synchronized (this.aClass391_18) {
			this.aClass391_18.method9276(0);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public void method2504() {
		@Pc(2) Class391 local2 = this.aClass391_17;
		synchronized (this.aClass391_17) {
			this.aClass391_17.method9276(0);
		}
		local2 = this.aClass391_18;
		synchronized (this.aClass391_18) {
			this.aClass391_18.method9276(0);
		}
		@Pc(44) Class389 local44 = this.aClass389_1;
		synchronized (this.aClass389_1) {
			this.aClass389_1.method9257();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public void method2505(@OriginalArg(1) int arg0) {
		this.anInt2934 = arg0;
		@Pc(9) Class391 local9 = this.aClass391_18;
		synchronized (this.aClass391_18) {
			this.aClass391_18.method9276(0);
		}
	}
}
