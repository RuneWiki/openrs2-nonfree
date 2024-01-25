import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class206 {

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	public int anInt5399;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "Lclient!jo;")
	private final Class126 aClass126_46 = new Class126(64);

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "Lclient!jo;")
	public final Class126 aClass126_47 = new Class126(50);

	@OriginalMember(owner = "client!qm", name = "v", descriptor = "Lclient!hq;")
	public final Class110 aClass110_1 = new Class110(250);

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Lclient!wv;")
	private final Class272 aClass272_1 = new Class272();

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!ok;")
	public final Class178 aClass178_97;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Lclient!pl;")
	private final Class193 aClass193_3;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Lclient!ok;")
	private final Class178 aClass178_98;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	public final int anInt5388;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public final int anInt5386;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray45;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray44;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!kr;IZLclient!pl;Lclient!ok;Lclient!ok;)V")
	public Class206(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class193 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) Class178 arg5) {
		this.aClass178_97 = arg5;
		this.aClass193_3 = arg3;
		this.aBoolean368 = arg2;
		this.aClass178_98 = arg4;
		this.anInt5388 = arg1;
		if (this.aClass178_98 == null) {
			this.anInt5386 = 0;
		} else {
			@Pc(49) int local49 = this.aClass178_98.method3832() - 1;
			this.anInt5386 = this.aClass178_98.method3833(local49) + local49 * 256;
		}
		this.aStringArray45 = new String[] { null, null, Static191.aClass55_72.method1205(this.anInt5388), null, null };
		this.aStringArray44 = new String[] { null, null, null, null, Static285.aClass55_104.method1205(this.anInt5388) };
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)V")
	public void method4315(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean368 != arg0) {
			this.aBoolean368 = arg0;
			this.method4321();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
	public void method4316() {
		@Pc(2) Class126 local2 = this.aClass126_46;
		synchronized (this.aClass126_46) {
			this.aClass126_46.method2821();
		}
		local2 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method2821();
		}
		@Pc(43) Class110 local43 = this.aClass110_1;
		synchronized (this.aClass110_1) {
			this.aClass110_1.method2369();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public void method4318() {
		@Pc(2) Class126 local2 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method2827();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lclient!cq;")
	public Class45 method4320(@OriginalArg(0) int arg0) {
		@Pc(8) Class126 local8 = this.aClass126_46;
		@Pc(18) Class45 local18;
		synchronized (this.aClass126_46) {
			local18 = (Class45) this.aClass126_46.method2822((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class178 local31 = this.aClass178_98;
		@Pc(48) byte[] local48;
		synchronized (this.aClass178_98) {
			local48 = this.aClass178_98.method3838(Static68.method1147(arg0), Static297.method3899(arg0));
		}
		local18 = new Class45();
		local18.aClass206_1 = this;
		local18.anInt964 = arg0;
		local18.aStringArray4 = new String[] { null, null, Static191.aClass55_72.method1205(this.anInt5388), null, null };
		local18.aStringArray5 = new String[] { null, null, null, null, Static285.aClass55_104.method1205(this.anInt5388) };
		if (local48 != null) {
			local18.method774(new Class7_Sub14(local48));
		}
		local18.method775();
		if (local18.anInt953 != -1) {
			local18.method765(this.method4320(local18.anInt962), this.method4320(local18.anInt953));
		}
		if (local18.anInt975 != -1) {
			local18.method760(this.method4320(local18.anInt974), this.method4320(local18.anInt975));
		}
		if (!this.aBoolean368 && local18.aBoolean61) {
			local18.aString6 = Static78.aClass55_36.method1205(this.anInt5388);
			local18.anIntArray81 = null;
			local18.anInt965 = 0;
			local18.aStringArray4 = this.aStringArray45;
			local18.aBoolean62 = false;
			local18.aStringArray5 = this.aStringArray44;
			if (local18.aClass164_7 != null) {
				@Pc(207) boolean local207 = false;
				for (@Pc(212) Class7 local212 = local18.aClass164_7.method3514(); local212 != null; local212 = local18.aClass164_7.method3519()) {
					@Pc(222) Class256 local222 = this.aClass193_3.method4068((int) local212.aLong230);
					if (local222.aBoolean468) {
						local212.method5802();
					} else {
						local207 = true;
					}
				}
				if (!local207) {
					local18.aClass164_7 = null;
				}
			}
		}
		@Pc(247) Class126 local247 = this.aClass126_46;
		synchronized (this.aClass126_46) {
			this.aClass126_46.method2824((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public void method4321() {
		@Pc(6) Class126 local6 = this.aClass126_46;
		synchronized (this.aClass126_46) {
			this.aClass126_46.method2827();
		}
		local6 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method2827();
		}
		@Pc(40) Class110 local40 = this.aClass110_1;
		synchronized (this.aClass110_1) {
			this.aClass110_1.method2363();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	public void method4322(@OriginalArg(0) int arg0) {
		this.anInt5399 = arg0;
		@Pc(15) Class126 local15 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method2827();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIILclient!ya;Lclient!fb;Z)Lclient!l;")
	public Class11 method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class51 arg5, @OriginalArg(6) Class75 arg6) {
		this.aClass272_1.anInt7534 = arg4;
		this.aClass272_1.anInt7535 = arg3;
		this.aClass272_1.anInt7532 = arg1;
		this.aClass272_1.anInt7537 = arg5.anInt6714;
		this.aClass272_1.aBoolean512 = arg6 != null;
		this.aClass272_1.anInt7539 = arg0;
		this.aClass272_1.anInt7540 = arg2;
		return (Class11) this.aClass110_1.method2359(this.aClass272_1);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
	public void method4325() {
		@Pc(2) Class110 local2 = this.aClass110_1;
		synchronized (this.aClass110_1) {
			this.aClass110_1.method2363();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!la;IIZZBIIILclient!fb;Lclient!ya;Lclient!ya;)Lclient!l;")
	public Class11 method4326(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class75 arg8, @OriginalArg(10) Class51 arg9, @OriginalArg(11) Class51 arg10) {
		@Pc(16) Class11 local16 = this.method4324(arg1, arg6, arg2, arg5, arg7, arg9, arg8);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class45 local25 = this.method4320(arg6);
		if (arg5 > 1 && local25.anIntArray82 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray83[local37] <= arg5 && local25.anIntArray83[local37] != 0) {
					local35 = local25.anIntArray82[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method4320(local35);
			}
		}
		@Pc(87) int[] local87 = local25.method768(arg4, arg5, arg8, arg7, arg1, arg0, arg2, arg9, arg10);
		if (local87 == null) {
			return null;
		}
		@Pc(109) Class11 local109;
		if (arg3) {
			local109 = arg10.method5310(local87, 36, 36, 32);
		} else {
			local109 = arg9.method5310(local87, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(125) Class272 local125 = new Class272();
			local125.anInt7539 = arg1;
			local125.anInt7535 = arg5;
			local125.anInt7540 = arg2;
			local125.anInt7532 = arg6;
			local125.anInt7534 = arg7;
			local125.aBoolean512 = arg8 != null;
			local125.anInt7537 = arg9.anInt6714;
			this.aClass110_1.method2365(local109, local125);
		}
		return local109;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
	public void method4327() {
		@Pc(10) Class126 local10 = this.aClass126_46;
		synchronized (this.aClass126_46) {
			this.aClass126_46.method2828(5);
		}
		local10 = this.aClass126_47;
		synchronized (this.aClass126_47) {
			this.aClass126_47.method2828(5);
		}
		@Pc(42) Class110 local42 = this.aClass110_1;
		synchronized (this.aClass110_1) {
			this.aClass110_1.method2360();
		}
	}
}
