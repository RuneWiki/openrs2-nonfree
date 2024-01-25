import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class99 {

	@OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
	public int anInt3101;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Lclient!mga;")
	private final Class223 aClass223_21 = new Class223(64);

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "Lclient!mga;")
	public final Class223 aClass223_22 = new Class223(50);

	@OriginalMember(owner = "client!faa", name = "v", descriptor = "Lclient!jea;")
	public final Class175 aClass175_1 = new Class175(250);

	@OriginalMember(owner = "client!faa", name = "w", descriptor = "Lclient!rf;")
	private final Class289 aClass289_1 = new Class289();

	@OriginalMember(owner = "client!faa", name = "x", descriptor = "Lclient!ia;")
	private final Class152 aClass152_2;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!bi;")
	public final Class31 aClass31_28;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
	public final int anInt3095;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "Lclient!bi;")
	private final Class31 aClass31_29;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
	public final int anInt3088;

	@OriginalMember(owner = "client!faa", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray9;

	@OriginalMember(owner = "client!faa", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray8;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!pca;IZLclient!ia;Lclient!bi;Lclient!bi;)V")
	public Class99(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class152 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) Class31 arg5) {
		this.aClass152_2 = arg3;
		this.aClass31_28 = arg5;
		this.aBoolean243 = arg2;
		this.anInt3095 = arg1;
		this.aClass31_29 = arg4;
		if (this.aClass31_29 == null) {
			this.anInt3088 = 0;
		} else {
			@Pc(49) int local49 = this.aClass31_29.method675() - 1;
			this.anInt3088 = this.aClass31_29.method657(local49) + local49 * 256;
		}
		this.aStringArray9 = new String[] { null, null, Static275.aClass198_6.method4407(this.anInt3095), null, null };
		this.aStringArray8 = new String[] { null, null, null, null, Static275.aClass198_7.method4407(this.anInt3095) };
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)V")
	public void method2789(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean243) {
			this.aBoolean243 = arg0;
			this.method2793();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!ta;ZLclient!oa;ZIILclient!oa;ILclient!wi;II)Lclient!xa;")
	public Class13 method2790(@OriginalArg(1) Class91 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class66 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class355 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class13 local16 = this.method2794(arg10, arg8, arg4, arg6, arg9, arg5, arg7);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) Class222 local32 = this.method2798(arg7);
		if (arg9 > 1 && local32.anIntArray475 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (local32.anIntArray477[local42] <= arg9 && local32.anIntArray477[local42] != 0) {
					local40 = local32.anIntArray475[local42];
				}
			}
			if (local40 != -1) {
				local32 = this.method2798(local40);
			}
		}
		@Pc(89) int[] local89 = local32.method4919(arg5, arg0, arg2, arg8, arg1, arg6, arg10, arg9, arg4);
		if (local89 == null) {
			return null;
		}
		@Pc(103) Class13 local103;
		if (arg3) {
			local103 = arg2.method6843(local89, 36, 36, 32);
		} else {
			local103 = arg6.method6843(local89, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(119) Class289 local119 = new Class289();
			local119.aBoolean544 = arg8 != null;
			local119.anInt7766 = arg4;
			local119.anInt7764 = arg6.anInt8223;
			local119.anInt7762 = arg5;
			local119.anInt7763 = arg7;
			local119.anInt7760 = arg9;
			local119.anInt7765 = arg10;
			this.aClass175_1.method4088(local103, local119);
		}
		return local103;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	public void method2791() {
		@Pc(14) Class175 local14 = this.aClass175_1;
		synchronized (this.aClass175_1) {
			this.aClass175_1.method4091();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	public void method2792() {
		@Pc(6) Class223 local6 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method4941();
		}
		local6 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method4941();
		}
		@Pc(42) Class175 local42 = this.aClass175_1;
		synchronized (this.aClass175_1) {
			this.aClass175_1.method4089();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	public void method2793() {
		@Pc(6) Class223 local6 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method4932();
		}
		local6 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method4932();
		}
		@Pc(43) Class175 local43 = this.aClass175_1;
		synchronized (this.aClass175_1) {
			this.aClass175_1.method4091();
		}
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!wi;ILclient!oa;IIIB)Lclient!xa;")
	public Class13 method2794(@OriginalArg(0) int arg0, @OriginalArg(1) Class355 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass289_1.anInt7764 = arg3.anInt8223;
		this.aClass289_1.anInt7765 = arg0;
		this.aClass289_1.aBoolean544 = arg1 != null;
		this.aClass289_1.anInt7760 = arg4;
		this.aClass289_1.anInt7762 = arg5;
		this.aClass289_1.anInt7763 = arg6;
		this.aClass289_1.anInt7766 = arg2;
		return (Class13) this.aClass175_1.method4098(this.aClass289_1);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V")
	public void method2796() {
		@Pc(6) Class223 local6 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method4933(5);
		}
		local6 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method4933(5);
		}
		@Pc(38) Class175 local38 = this.aClass175_1;
		synchronized (this.aClass175_1) {
			this.aClass175_1.method4085();
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
	public void method2797() {
		@Pc(6) Class223 local6 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method4932();
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)Lclient!mfa;")
	public Class222 method2798(@OriginalArg(0) int arg0) {
		@Pc(8) Class223 local8 = this.aClass223_21;
		@Pc(18) Class222 local18;
		synchronized (this.aClass223_21) {
			local18 = (Class222) this.aClass223_21.method4943((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class31 local31 = this.aClass31_29;
		@Pc(44) byte[] local44;
		synchronized (this.aClass31_29) {
			local44 = this.aClass31_29.method667(Static44.method726(arg0), Static19.method384(arg0));
		}
		local18 = new Class222();
		local18.aClass99_2 = this;
		local18.anInt5818 = arg0;
		local18.aStringArray27 = new String[] { null, null, Static275.aClass198_6.method4407(this.anInt3095), null, null };
		local18.aStringArray28 = new String[] { null, null, null, null, Static275.aClass198_7.method4407(this.anInt3095) };
		if (local44 != null) {
			local18.method4925(new Class4_Sub9(local44));
		}
		local18.method4917();
		if (local18.anInt5784 != -1) {
			local18.method4926(this.method2798(local18.anInt5784), this.method2798(local18.anInt5815));
		}
		if (local18.anInt5806 != -1) {
			local18.method4927(this.method2798(local18.anInt5806), this.method2798(local18.anInt5829));
		}
		if (!this.aBoolean243 && local18.aBoolean432) {
			local18.aString72 = Static275.aClass198_4.method4407(this.anInt3095);
			local18.anInt5832 = 0;
			local18.aStringArray28 = this.aStringArray8;
			local18.aBoolean433 = false;
			local18.aStringArray27 = this.aStringArray9;
			local18.anIntArray476 = null;
			if (local18.aClass183_21 != null) {
				@Pc(198) boolean local198 = false;
				for (@Pc(203) Class4 local203 = local18.aClass183_21.method4286(); local203 != null; local203 = local18.aClass183_21.method4283()) {
					@Pc(213) Class59 local213 = this.aClass152_2.method3679((int) local203.aLong307);
					if (local213.aBoolean138) {
						local203.method8013();
					} else {
						local198 = true;
					}
				}
				if (!local198) {
					local18.aClass183_21 = null;
				}
			}
		}
		@Pc(238) Class223 local238 = this.aClass223_21;
		synchronized (this.aClass223_21) {
			this.aClass223_21.method4938((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)V")
	public void method2799(@OriginalArg(1) int arg0) {
		this.anInt3101 = arg0;
		@Pc(9) Class223 local9 = this.aClass223_22;
		synchronized (this.aClass223_22) {
			this.aClass223_22.method4932();
		}
	}
}
