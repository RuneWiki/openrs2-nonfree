import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class157 {

	@OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
	public int anInt4731;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Lclient!ad;")
	private final Class5 aClass5_40 = new Class5(64);

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "Lclient!ad;")
	public final Class5 aClass5_41 = new Class5(50);

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Lclient!ua;")
	public final Class231 aClass231_1 = new Class231(250);

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "Lclient!ke;")
	private final Class131 aClass131_1 = new Class131();

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!dn;")
	private final Class56 aClass56_64;

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "Lclient!dn;")
	public final Class56 aClass56_65;

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "Lclient!ep;")
	private final Class69 aClass69_1;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
	public final int anInt4718;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public final int anInt4724;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray108;

	@OriginalMember(owner = "client!mm", name = "G", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray109;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!gt;IZLclient!ep;Lclient!dn;Lclient!dn;)V")
	public Class157(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class56 arg4, @OriginalArg(5) Class56 arg5) {
		this.aClass56_64 = arg4;
		this.aClass56_65 = arg5;
		this.aClass69_1 = arg3;
		this.anInt4718 = arg1;
		this.aBoolean356 = arg2;
		if (this.aClass56_64 == null) {
			this.anInt4724 = 0;
		} else {
			@Pc(49) int local49 = this.aClass56_64.method1380() - 1;
			this.anInt4724 = local49 * 256 + this.aClass56_64.method1373(local49);
		}
		this.aStringArray108 = new String[] { null, null, Static389.aClass175_222.method4201(this.anInt4718), null, null };
		this.aStringArray109 = new String[] { null, null, null, null, Static21.aClass175_24.method4201(this.anInt4718) };
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Lclient!qe;")
	public Class191 method3832(@OriginalArg(0) int arg0) {
		@Pc(6) Class5 local6 = this.aClass5_40;
		@Pc(16) Class191 local16;
		synchronized (this.aClass5_40) {
			local16 = (Class191) this.aClass5_40.method104((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass56_64.method1384(Static294.method4289(arg0), Static163.method2866(arg0));
		local16 = new Class191();
		local16.anInt5851 = arg0;
		local16.aClass157_2 = this;
		local16.aStringArray139 = new String[] { null, null, Static389.aClass175_222.method4201(this.anInt4718), null, null };
		local16.aStringArray140 = new String[] { null, null, null, null, Static21.aClass175_24.method4201(this.anInt4718) };
		if (local45 != null) {
			local16.method4660(new Class3_Sub2(local45));
		}
		local16.method4659();
		if (local16.anInt5832 != -1) {
			local16.method4676(this.method3832(local16.anInt5832), this.method3832(local16.anInt5817));
		}
		if (local16.anInt5829 != -1) {
			local16.method4677(this.method3832(local16.anInt5807), this.method3832(local16.anInt5829));
		}
		if (!this.aBoolean356 && local16.aBoolean416) {
			local16.aString56 = Static4.aClass175_35.method4201(this.anInt4718);
			local16.anIntArray434 = null;
			local16.aBoolean415 = false;
			local16.aStringArray140 = this.aStringArray109;
			local16.aStringArray139 = this.aStringArray108;
			local16.anInt5838 = 0;
			if (local16.aClass127_29 != null) {
				@Pc(193) boolean local193 = false;
				for (@Pc(198) Class3 local198 = local16.aClass127_29.method3248(); local198 != null; local198 = local16.aClass127_29.method3252()) {
					@Pc(207) Class235 local207 = this.aClass69_1.method1740((int) local198.aLong227);
					if (local207.aBoolean491) {
						local198.method5987();
					} else {
						local193 = true;
					}
				}
				if (!local193) {
					local16.aClass127_29 = null;
				}
			}
		}
		@Pc(231) Class5 local231 = this.aClass5_40;
		synchronized (this.aClass5_40) {
			this.aClass5_40.method114((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLclient!ai;IIIIILclient!qa;)Lclient!f;")
	public Class22 method3834(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class75 arg6) {
		this.aClass131_1.aBoolean327 = arg0 != null;
		this.aClass131_1.anInt4121 = arg2;
		this.aClass131_1.anInt4125 = arg1;
		this.aClass131_1.anInt4123 = arg4;
		this.aClass131_1.anInt4126 = arg3;
		this.aClass131_1.anInt4120 = arg6.anInt3233;
		this.aClass131_1.anInt4124 = arg5;
		return (Class22) this.aClass231_1.method5358(this.aClass131_1);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)V")
	public void method3835(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean356) {
			this.aBoolean356 = arg0;
			this.method3836();
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public void method3836() {
		@Pc(6) Class5 local6 = this.aClass5_40;
		synchronized (this.aClass5_40) {
			this.aClass5_40.method116();
		}
		local6 = this.aClass5_41;
		synchronized (this.aClass5_41) {
			this.aClass5_41.method116();
		}
		@Pc(43) Class231 local43 = this.aClass231_1;
		synchronized (this.aClass231_1) {
			this.aClass231_1.method5360();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
	public void method3838(@OriginalArg(1) int arg0) {
		this.anInt4731 = arg0;
		@Pc(9) Class5 local9 = this.aClass5_41;
		synchronized (this.aClass5_41) {
			this.aClass5_41.method116();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!ai;IIIZLclient!qa;Lclient!qa;Lclient!oa;IZB)Lclient!f;")
	public Class22 method3839(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class75 arg6, @OriginalArg(7) Class75 arg7, @OriginalArg(8) Class65 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(14) Class22 local14 = this.method3834(arg1, arg9, arg2, arg4, arg3, arg0, arg7);
		if (local14 != null) {
			return local14;
		}
		@Pc(23) Class191 local23 = this.method3832(arg0);
		if (arg4 > 1 && local23.anIntArray433 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local23.anIntArray432[local35] <= arg4 && local23.anIntArray432[local35] != 0) {
					local33 = local23.anIntArray433[local35];
				}
			}
			if (local33 != -1) {
				local23 = this.method3832(local33);
			}
		}
		@Pc(77) int[] local77 = local23.method4667(arg4, arg5, arg2, arg8, arg7, arg3, arg1, arg9, arg6);
		if (local77 == null) {
			return null;
		}
		@Pc(91) Class22 local91;
		if (arg10) {
			local91 = arg6.method2640(local77, 36, 36, 32);
		} else {
			local91 = arg7.method2640(local77, 36, 36, 32);
		}
		if (!arg10) {
			@Pc(124) Class131 local124 = new Class131();
			local124.anInt4125 = arg9;
			local124.anInt4126 = arg4;
			local124.anInt4121 = arg2;
			local124.anInt4120 = arg7.anInt3233;
			local124.anInt4124 = arg0;
			local124.anInt4123 = arg3;
			local124.aBoolean327 = arg1 != null;
			this.aClass231_1.method5357(local124, local91);
		}
		return local91;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public void method3841() {
		@Pc(6) Class5 local6 = this.aClass5_40;
		synchronized (this.aClass5_40) {
			this.aClass5_40.method110();
		}
		local6 = this.aClass5_41;
		synchronized (this.aClass5_41) {
			this.aClass5_41.method110();
		}
		@Pc(44) Class231 local44 = this.aClass231_1;
		synchronized (this.aClass231_1) {
			this.aClass231_1.method5361();
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
	public void method3843() {
		@Pc(12) Class231 local12 = this.aClass231_1;
		synchronized (this.aClass231_1) {
			this.aClass231_1.method5360();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	public void method3844() {
		@Pc(2) Class5 local2 = this.aClass5_41;
		synchronized (this.aClass5_41) {
			this.aClass5_41.method116();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)V")
	public void method3845() {
		@Pc(6) Class5 local6 = this.aClass5_40;
		synchronized (this.aClass5_40) {
			this.aClass5_40.method106(5);
		}
		local6 = this.aClass5_41;
		synchronized (this.aClass5_41) {
			this.aClass5_41.method106(5);
		}
		@Pc(38) Class231 local38 = this.aClass231_1;
		synchronized (this.aClass231_1) {
			this.aClass231_1.method5359();
		}
	}
}
