import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class247 {

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	public int anInt7342;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "Lclient!oo;")
	private final Class264 aClass264_45 = new Class264(64);

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "Lclient!oo;")
	public final Class264 aClass264_46 = new Class264(50);

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!wj;")
	public final Class387 aClass387_1 = new Class387(250);

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Lclient!haa;")
	private final Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "Lclient!ega;")
	private final Class90 aClass90_2;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!wia;")
	private final Class386 aClass386_90;

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "Lclient!wia;")
	public final Class386 aClass386_91;

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Z")
	private boolean aBoolean509;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public final int anInt7335;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public final int anInt7328;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray26;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray25;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!dt;IZLclient!ega;Lclient!wia;Lclient!wia;)V")
	public Class247(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) Class386 arg4, @OriginalArg(5) Class386 arg5) {
		this.aClass90_2 = arg3;
		this.aClass386_90 = arg4;
		this.aClass386_91 = arg5;
		this.aBoolean509 = arg2;
		this.anInt7335 = arg1;
		if (this.aClass386_90 == null) {
			this.anInt7328 = 0;
		} else {
			@Pc(54) int local54 = this.aClass386_90.method9189() - 1;
			this.anInt7328 = this.aClass386_90.method9210(local54) + local54 * 256;
		}
		this.aStringArray26 = new String[] { null, null, Static514.aClass303_10.method7473(this.anInt7335), null, null };
		this.aStringArray25 = new String[] { null, null, null, null, Static514.aClass303_11.method7473(this.anInt7335) };
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public void method5952() {
		@Pc(2) Class264 local2 = this.aClass264_45;
		synchronized (this.aClass264_45) {
			this.aClass264_45.method6366(5);
		}
		local2 = this.aClass264_46;
		synchronized (this.aClass264_46) {
			this.aClass264_46.method6366(5);
		}
		@Pc(46) Class387 local46 = this.aClass387_1;
		synchronized (this.aClass387_1) {
			this.aClass387_1.method9221();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method5953() {
		@Pc(2) Class387 local2 = this.aClass387_1;
		synchronized (this.aClass387_1) {
			this.aClass387_1.method9226();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	public void method5955() {
		@Pc(12) Class264 local12 = this.aClass264_45;
		synchronized (this.aClass264_45) {
			this.aClass264_45.method6360();
		}
		local12 = this.aClass264_46;
		synchronized (this.aClass264_46) {
			this.aClass264_46.method6360();
		}
		@Pc(42) Class387 local42 = this.aClass387_1;
		synchronized (this.aClass387_1) {
			this.aClass387_1.method9226();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
	public void method5956(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean509 != arg0) {
			this.aBoolean509 = arg0;
			this.method5955();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!sq;IIILclient!ha;III)Lclient!jd;")
	public Class20 method5957(@OriginalArg(0) Class325 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class137 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass138_1.anInt3804 = arg4;
		this.aClass138_1.anInt3802 = arg6;
		this.aClass138_1.anInt3806 = arg5;
		this.aClass138_1.anInt3809 = arg2;
		this.aClass138_1.aBoolean280 = arg0 != null;
		this.aClass138_1.anInt3808 = arg3.anInt9522;
		this.aClass138_1.anInt3805 = arg1;
		return (Class20) this.aClass387_1.method9232(this.aClass138_1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V")
	public void method5958(@OriginalArg(1) int arg0) {
		this.anInt7342 = arg0;
		@Pc(15) Class264 local15 = this.aClass264_46;
		synchronized (this.aClass264_46) {
			this.aClass264_46.method6360();
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public void method5959() {
		@Pc(2) Class264 local2 = this.aClass264_45;
		synchronized (this.aClass264_45) {
			this.aClass264_45.method6368();
		}
		local2 = this.aClass264_46;
		synchronized (this.aClass264_46) {
			this.aClass264_46.method6368();
		}
		@Pc(42) Class387 local42 = this.aClass387_1;
		synchronized (this.aClass387_1) {
			this.aClass387_1.method9222();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ha;Lclient!sq;IIIILclient!da;Lclient!ha;ZIBZ)Lclient!jd;")
	public Class20 method5960(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class325 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class38 arg6, @OriginalArg(7) Class137 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class20 local16 = this.method5957(arg1, arg9, arg5, arg7, arg3, arg4, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class27 local25 = this.method5962(arg9);
		if (arg3 > 1 && local25.anIntArray70 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg3 >= local25.anIntArray73[local49] && local25.anIntArray73[local49] != 0) {
					local47 = local25.anIntArray70[local49];
				}
			}
			if (local47 != -1) {
				local25 = this.method5962(local47);
			}
		}
		@Pc(102) int[] local102 = local25.method822(arg6, arg3, arg8, arg7, arg0, arg5, arg4, arg2, arg1);
		if (local102 == null) {
			return null;
		}
		@Pc(117) Class20 local117;
		if (arg10) {
			local117 = arg0.method7885(32, 36, local102, 36);
		} else {
			local117 = arg7.method7885(32, 36, local102, 36);
		}
		if (!arg10) {
			@Pc(134) Class138 local134 = new Class138();
			local134.aBoolean280 = arg1 != null;
			local134.anInt3802 = arg2;
			local134.anInt3804 = arg3;
			local134.anInt3806 = arg4;
			local134.anInt3808 = arg7.anInt9522;
			local134.anInt3805 = arg9;
			local134.anInt3809 = arg5;
			this.aClass387_1.method9228(local117, local134);
		}
		return local117;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public void method5961() {
		@Pc(6) Class264 local6 = this.aClass264_46;
		synchronized (this.aClass264_46) {
			this.aClass264_46.method6360();
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lclient!bca;")
	public Class27 method5962(@OriginalArg(0) int arg0) {
		@Pc(8) Class264 local8 = this.aClass264_45;
		@Pc(18) Class27 local18;
		synchronized (this.aClass264_45) {
			local18 = (Class27) this.aClass264_45.method6367((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class386 local31 = this.aClass386_90;
		@Pc(44) byte[] local44;
		synchronized (this.aClass386_90) {
			local44 = this.aClass386_90.method9196(Static44.method950(arg0), Static286.method4075(arg0));
		}
		local18 = new Class27();
		local18.anInt947 = arg0;
		local18.aClass247_1 = this;
		local18.aStringArray2 = new String[] { null, null, Static514.aClass303_10.method7473(this.anInt7335), null, null };
		local18.aStringArray1 = new String[] { null, null, null, null, Static514.aClass303_11.method7473(this.anInt7335) };
		if (local44 != null) {
			local18.method821(new Class14_Sub29(local44));
		}
		local18.method820();
		if (local18.anInt916 != -1) {
			local18.method808(this.method5962(local18.anInt916), this.method5962(local18.anInt956));
		}
		if (local18.anInt900 != -1) {
			local18.method810(this.method5962(local18.anInt900), this.method5962(local18.anInt897));
		}
		if (local18.anInt906 != -1) {
			local18.method805(this.method5962(local18.anInt943), this.method5962(local18.anInt906));
		}
		if (!this.aBoolean509 && local18.aBoolean72) {
			local18.aString9 = Static514.aClass303_7.method7473(this.anInt7335);
			local18.aStringArray2 = this.aStringArray26;
			local18.aStringArray1 = this.aStringArray25;
			local18.aBoolean73 = false;
			local18.anIntArray72 = null;
			local18.anInt955 = 0;
			if (local18.aClass187_5 != null) {
				@Pc(221) boolean local221 = false;
				for (@Pc(226) Class14 local226 = local18.aClass187_5.method4079(); local226 != null; local226 = local18.aClass187_5.method4084()) {
					@Pc(236) Class341 local236 = this.aClass90_2.method2122((int) local226.aLong305);
					if (local236.aBoolean704) {
						local226.method9315();
					} else {
						local221 = true;
					}
				}
				if (!local221) {
					local18.aClass187_5 = null;
				}
			}
		}
		@Pc(261) Class264 local261 = this.aClass264_45;
		synchronized (this.aClass264_45) {
			this.aClass264_45.method6364((long) arg0, local18);
			return local18;
		}
	}
}
