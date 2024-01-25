import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class62 {

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public int anInt2052;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_19 = new Class307(64);

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_20 = new Class307(50);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!pba;")
	public final Class285 aClass285_1 = new Class285(250);

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Lclient!hga;")
	private final Class158 aClass158_1 = new Class158();

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "Z")
	private boolean aBoolean151;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!qh;")
	private final Class309 aClass309_3;

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "Lclient!ik;")
	public final Class182 aClass182_22;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!hc;")
	private final Class150 aClass150_1;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "Lclient!ik;")
	private final Class182 aClass182_21;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
	public final int anInt2040;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	public final int anInt2047;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray6;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!qh;IZLclient!hc;Lclient!ik;Lclient!ik;)V")
	public Class62(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class150 arg3, @OriginalArg(4) Class182 arg4, @OriginalArg(5) Class182 arg5) {
		this.aBoolean151 = arg2;
		this.aClass309_3 = arg0;
		this.aClass182_22 = arg5;
		this.aClass150_1 = arg3;
		this.aClass182_21 = arg4;
		this.anInt2040 = arg1;
		if (this.aClass182_21 == null) {
			this.anInt2047 = 0;
		} else {
			@Pc(59) int local59 = this.aClass182_21.method3956() - 1;
			this.anInt2047 = local59 * 256 + this.aClass182_21.method3970(local59);
		}
		if (Static326.aClass309_5 == this.aClass309_3) {
			this.aStringArray5 = new String[] { null, null, Static430.aClass257_8.method5699(this.anInt2040), null, null, Static430.aClass257_22.method5699(this.anInt2040) };
		} else {
			this.aStringArray5 = new String[] { null, null, Static430.aClass257_8.method5699(this.anInt2040), null, null, null };
		}
		this.aStringArray6 = new String[] { null, null, null, null, Static430.aClass257_9.method5699(this.anInt2040) };
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ha;Lclient!ha;Lclient!bfa;IZLclient!da;ZIIZI)Lclient!kw;")
	public Class178 method1883(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class57 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class178 local16 = this.method1889(arg3, arg7, arg0, arg2, arg10, arg8, arg4);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) Class275 local26 = this.method1887(arg4);
		if (arg8 > 1 && local26.anIntArray540 != null) {
			@Pc(36) int local36 = -1;
			for (@Pc(38) int local38 = 0; local38 < 10; local38++) {
				if (arg8 >= local26.anIntArray541[local38] && local26.anIntArray541[local38] != 0) {
					local36 = local26.anIntArray540[local38];
				}
			}
			if (local36 != -1) {
				local26 = this.method1887(local36);
			}
		}
		@Pc(91) int[] local91 = local26.method6297(arg3, arg6, arg7, arg2, arg0, arg8, arg9, arg1, arg10);
		if (local91 == null) {
			return null;
		}
		@Pc(107) Class178 local107;
		if (arg5) {
			local107 = arg1.method9367(local91, 36, 32, 36);
		} else {
			local107 = arg2.method9367(local91, 36, 32, 36);
		}
		if (!arg5) {
			@Pc(132) Class158 local132 = new Class158();
			local132.anInt3813 = arg10;
			local132.aBoolean237 = arg3 != null;
			local132.anInt3805 = arg8;
			local132.anInt3809 = arg4;
			local132.anInt3806 = arg2.anInt11007;
			local132.anInt3808 = arg7;
			local132.anInt3807 = arg0;
			this.aClass285_1.method6612(local107, local132);
		}
		return local107;
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V")
	public void method1884() {
		@Pc(6) Class285 local6 = this.aClass285_1;
		synchronized (this.aClass285_1) {
			this.aClass285_1.method6613();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1885() {
		@Pc(2) Class307 local2 = this.aClass307_19;
		synchronized (this.aClass307_19) {
			this.aClass307_19.method6998();
		}
		local2 = this.aClass307_20;
		synchronized (this.aClass307_20) {
			this.aClass307_20.method6998();
		}
		@Pc(36) Class285 local36 = this.aClass285_1;
		synchronized (this.aClass285_1) {
			this.aClass285_1.method6614();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	public void method1886(@OriginalArg(0) int arg0) {
		this.anInt2052 = arg0;
		@Pc(9) Class307 local9 = this.aClass307_20;
		synchronized (this.aClass307_20) {
			this.aClass307_20.method7006();
		}
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)Lclient!of;")
	public Class275 method1887(@OriginalArg(1) int arg0) {
		@Pc(8) Class307 local8 = this.aClass307_19;
		@Pc(18) Class275 local18;
		synchronized (this.aClass307_19) {
			local18 = (Class275) this.aClass307_19.method7002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class182 local32 = this.aClass182_21;
		@Pc(45) byte[] local45;
		synchronized (this.aClass182_21) {
			local45 = this.aClass182_21.method3985(Static438.method5836(arg0), Static194.method3005(arg0));
		}
		local18 = new Class275();
		local18.anInt7260 = arg0;
		local18.aClass62_1 = this;
		local18.aStringArray29 = (String[]) this.aStringArray5.clone();
		local18.aStringArray30 = (String[]) this.aStringArray6.clone();
		if (local45 != null) {
			local18.method6286(new Class3_Sub2(local45));
		}
		local18.method6293();
		if (local18.anInt7228 != -1) {
			local18.method6299(this.method1887(local18.anInt7266), this.method1887(local18.anInt7228));
		}
		if (local18.anInt7247 != -1) {
			local18.method6290(this.method1887(local18.anInt7247), this.method1887(local18.anInt7291));
		}
		if (local18.anInt7270 != -1) {
			local18.method6296(this.method1887(local18.anInt7270), this.method1887(local18.anInt7254));
		}
		if (!this.aBoolean151 && local18.aBoolean490) {
			local18.aString94 = Static430.aClass257_5.method5699(this.anInt2040);
			local18.aBoolean491 = false;
			local18.aStringArray30 = this.aStringArray6;
			local18.aStringArray29 = this.aStringArray5;
			local18.anInt7265 = 0;
			local18.lb = null;
			if (local18.aClass313_38 != null) {
				@Pc(189) boolean local189 = false;
				for (@Pc(194) Class3 local194 = local18.aClass313_38.method7103(); local194 != null; local194 = local18.aClass313_38.method7110()) {
					@Pc(204) Class303 local204 = this.aClass150_1.method3385((int) local194.aLong345);
					if (local204.aBoolean548) {
						local194.method9596();
					} else {
						local189 = true;
					}
				}
				if (!local189) {
					local18.aClass313_38 = null;
				}
			}
		}
		@Pc(235) Class307 local235 = this.aClass307_19;
		synchronized (this.aClass307_19) {
			this.aClass307_19.method7000(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
	public void method1888() {
		@Pc(10) Class307 local10 = this.aClass307_20;
		synchronized (this.aClass307_20) {
			this.aClass307_20.method7006();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!bfa;IBILclient!ha;III)Lclient!kw;")
	public Class178 method1889(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass158_1.anInt3806 = arg3.anInt11007;
		this.aClass158_1.aBoolean237 = arg0 != null;
		this.aClass158_1.anInt3809 = arg6;
		this.aClass158_1.anInt3807 = arg2;
		this.aClass158_1.anInt3808 = arg1;
		this.aClass158_1.anInt3805 = arg5;
		this.aClass158_1.anInt3813 = arg4;
		return (Class178) this.aClass285_1.method6607(this.aClass158_1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method1891() {
		@Pc(6) Class307 local6 = this.aClass307_19;
		synchronized (this.aClass307_19) {
			this.aClass307_19.method7006();
		}
		local6 = this.aClass307_20;
		synchronized (this.aClass307_20) {
			this.aClass307_20.method7006();
		}
		@Pc(42) Class285 local42 = this.aClass285_1;
		synchronized (this.aClass285_1) {
			this.aClass285_1.method6613();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZB)V")
	public void method1892(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean151 != arg0) {
			this.aBoolean151 = arg0;
			this.method1891();
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
	public void method1893() {
		@Pc(2) Class307 local2 = this.aClass307_19;
		synchronized (this.aClass307_19) {
			this.aClass307_19.method6995(5);
		}
		local2 = this.aClass307_20;
		synchronized (this.aClass307_20) {
			this.aClass307_20.method6995(5);
		}
		@Pc(45) Class285 local45 = this.aClass285_1;
		synchronized (this.aClass285_1) {
			this.aClass285_1.method6616();
		}
	}
}
