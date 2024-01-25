import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class121 {

	@OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
	public int anInt4101;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "Lclient!vg;")
	private final Class342 aClass342_76 = new Class342(64);

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "Lclient!vg;")
	public final Class342 aClass342_77 = new Class342(50);

	@OriginalMember(owner = "client!hca", name = "x", descriptor = "Lclient!mj;")
	public final Class207 aClass207_1 = new Class207(250);

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "Lclient!oa;")
	private final Class234 aClass234_1 = new Class234();

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!hca", name = "m", descriptor = "Z")
	private boolean aBoolean282;

	@OriginalMember(owner = "client!hca", name = "C", descriptor = "Lclient!bca;")
	private final Class27 aClass27_2;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Lclient!ri;")
	public final Class284 aClass284_57;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "Lclient!ri;")
	private final Class284 aClass284_58;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public final int anInt4085;

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray14;

	@OriginalMember(owner = "client!hca", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!ei;IZLclient!bca;Lclient!ri;Lclient!ri;)V")
	public Class121(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class27 arg3, @OriginalArg(4) Class284 arg4, @OriginalArg(5) Class284 arg5) {
		this.anInt4097 = arg1;
		this.aBoolean282 = arg2;
		this.aClass27_2 = arg3;
		this.aClass284_57 = arg5;
		this.aClass284_58 = arg4;
		if (this.aClass284_58 == null) {
			this.anInt4085 = 0;
		} else {
			@Pc(49) int local49 = this.aClass284_58.method6322() - 1;
			this.anInt4085 = local49 * 256 + this.aClass284_58.method6354(local49);
		}
		this.aStringArray14 = new String[] { null, null, Static573.aClass350_11.method7730(this.anInt4097), null, null };
		this.aStringArray15 = new String[] { null, null, null, null, Static573.aClass350_12.method7730(this.anInt4097) };
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public void method3316() {
		@Pc(13) Class342 local13 = this.aClass342_76;
		synchronized (this.aClass342_76) {
			this.aClass342_76.method7687();
		}
		local13 = this.aClass342_77;
		synchronized (this.aClass342_77) {
			this.aClass342_77.method7687();
		}
		@Pc(45) Class207 local45 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4900();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V")
	public void method3317(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean282 != arg0) {
			this.aBoolean282 = arg0;
			this.method3324();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
	public void method3318() {
		@Pc(8) Class342 local8 = this.aClass342_77;
		synchronized (this.aClass342_77) {
			this.aClass342_77.method7693();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!r;ZLclient!hq;Lclient!r;Lclient!la;ZIIIII)Lclient!f;")
	public Class73 method3319(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) Class63 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(16) Class73 local16 = this.method3328(arg10, arg7, arg8, arg4, arg3, arg0, arg9);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class133 local31 = this.method3327(arg7);
		if (arg0 > 1 && local31.anIntArray200 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (local31.anIntArray201[local43] <= arg0 && local31.anIntArray201[local43] != 0) {
					local41 = local31.anIntArray200[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method3327(local41);
			}
		}
		@Pc(88) int[] local88 = local31.method3543(arg0, arg4, arg5, arg3, arg10, arg6, arg9, arg8, arg1);
		if (local88 == null) {
			return null;
		}
		@Pc(102) Class73 local102;
		if (arg2) {
			local102 = arg1.method8033(local88, 36, 36, 32);
		} else {
			local102 = arg4.method8033(local88, 36, 36, 32);
		}
		if (!arg2) {
			@Pc(118) Class234 local118 = new Class234();
			local118.anInt6511 = arg9;
			local118.anInt6508 = arg7;
			local118.anInt6512 = arg0;
			local118.anInt6510 = arg4.anInt10222;
			local118.anInt6506 = arg8;
			local118.anInt6515 = arg10;
			local118.aBoolean460 = arg3 != null;
			this.aClass207_1.method4897(local102, local118);
		}
		return local102;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
	public void method3323() {
		@Pc(2) Class207 local2 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4907();
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V")
	public void method3324() {
		@Pc(2) Class342 local2 = this.aClass342_76;
		synchronized (this.aClass342_76) {
			this.aClass342_76.method7693();
		}
		local2 = this.aClass342_77;
		synchronized (this.aClass342_77) {
			this.aClass342_77.method7693();
		}
		@Pc(40) Class207 local40 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4907();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
	public void method3325(@OriginalArg(0) int arg0) {
		this.anInt4101 = arg0;
		@Pc(13) Class342 local13 = this.aClass342_77;
		synchronized (this.aClass342_77) {
			this.aClass342_77.method7693();
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IB)V")
	public void method3326() {
		@Pc(12) Class342 local12 = this.aClass342_76;
		synchronized (this.aClass342_76) {
			this.aClass342_76.method7697(5);
		}
		local12 = this.aClass342_77;
		synchronized (this.aClass342_77) {
			this.aClass342_77.method7697(5);
		}
		@Pc(44) Class207 local44 = this.aClass207_1;
		synchronized (this.aClass207_1) {
			this.aClass207_1.method4906();
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(IB)Lclient!hu;")
	public Class133 method3327(@OriginalArg(0) int arg0) {
		@Pc(14) Class342 local14 = this.aClass342_76;
		@Pc(24) Class133 local24;
		synchronized (this.aClass342_76) {
			local24 = (Class133) this.aClass342_76.method7684((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class284 local37 = this.aClass284_58;
		@Pc(50) byte[] local50;
		synchronized (this.aClass284_58) {
			local50 = this.aClass284_58.method6331(Static87.method6547(arg0), Static461.method6342(arg0));
		}
		local24 = new Class133();
		local24.aClass121_1 = this;
		local24.anInt4419 = arg0;
		local24.aStringArray18 = new String[] { null, null, Static573.aClass350_11.method7730(this.anInt4097), null, null };
		local24.aStringArray19 = new String[] { null, null, null, null, Static573.aClass350_12.method7730(this.anInt4097) };
		if (local50 != null) {
			local24.method3546(new Class3_Sub26(local50));
		}
		local24.method3552();
		if (local24.anInt4388 != -1) {
			local24.method3556(this.method3327(local24.anInt4388), this.method3327(local24.anInt4427));
		}
		if (local24.anInt4440 != -1) {
			local24.method3547(this.method3327(local24.anInt4440), this.method3327(local24.anInt4446));
		}
		if (!this.aBoolean282 && local24.aBoolean290) {
			local24.aString106 = Static573.aClass350_9.method7730(this.anInt4097);
			local24.aStringArray19 = this.aStringArray15;
			local24.anInt4390 = 0;
			local24.aBoolean289 = false;
			local24.anIntArray199 = null;
			local24.aStringArray18 = this.aStringArray14;
			if (local24.aClass297_17 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class3 local209 = local24.aClass297_17.method6529(); local209 != null; local209 = local24.aClass297_17.method6532()) {
					@Pc(219) Class41 local219 = this.aClass27_2.method483((int) local209.aLong262);
					if (local219.aBoolean108) {
						local209.method8128();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local24.aClass297_17 = null;
				}
			}
		}
		@Pc(244) Class342 local244 = this.aClass342_76;
		synchronized (this.aClass342_76) {
			this.aClass342_76.method7683(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIILclient!r;Lclient!hq;II)Lclient!f;")
	public Class73 method3328(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass234_1.anInt6508 = arg1;
		this.aClass234_1.anInt6511 = arg6;
		this.aClass234_1.anInt6506 = arg2;
		this.aClass234_1.anInt6515 = arg0;
		this.aClass234_1.aBoolean460 = arg4 != null;
		this.aClass234_1.anInt6510 = arg3.anInt10222;
		this.aClass234_1.anInt6512 = arg5;
		return (Class73) this.aClass207_1.method4898(this.aClass234_1);
	}
}
