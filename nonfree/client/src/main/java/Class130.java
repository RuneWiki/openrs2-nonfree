import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class130 {

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
	public int anInt2702;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!au;")
	private final Class21 aClass21_28 = new Class21(64);

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "Lclient!au;")
	public final Class21 aClass21_29 = new Class21(50);

	@OriginalMember(owner = "client!gs", name = "t", descriptor = "Lclient!si;")
	public final Class312 aClass312_1 = new Class312(250);

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "Lclient!ee;")
	private final Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_36;

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!mv;")
	public final Class229 aClass229_37;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Lclient!ke;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
	public final int anInt2699;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!gs", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!sea;IZLclient!ke;Lclient!mv;Lclient!mv;)V")
	public Class130(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class191 arg3, @OriginalArg(4) Class229 arg4, @OriginalArg(5) Class229 arg5) {
		this.aClass229_36 = arg4;
		this.aClass229_37 = arg5;
		this.aBoolean192 = arg2;
		this.aClass191_1 = arg3;
		this.anInt2697 = arg1;
		if (this.aClass229_36 == null) {
			this.anInt2699 = 0;
		} else {
			@Pc(49) int local49 = this.aClass229_36.method4952() - 1;
			this.anInt2699 = this.aClass229_36.method4981(local49) + local49 * 256;
		}
		this.aStringArray17 = new String[] { null, null, Static229.aClass159_9.method2776(this.anInt2697), null, null };
		this.aStringArray16 = new String[] { null, null, null, null, Static229.aClass159_10.method2776(this.anInt2697) };
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)Lclient!im;")
	public Class164 method2311(@OriginalArg(0) int arg0) {
		@Pc(8) Class21 local8 = this.aClass21_28;
		@Pc(18) Class164 local18;
		synchronized (this.aClass21_28) {
			local18 = (Class164) this.aClass21_28.method324((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class229 local31 = this.aClass229_36;
		@Pc(54) byte[] local54;
		synchronized (this.aClass229_36) {
			local54 = this.aClass229_36.method4980(Static310.method4445(arg0), Static442.method5787(arg0));
		}
		local18 = new Class164();
		local18.anInt3836 = arg0;
		local18.aClass130_1 = this;
		local18.aStringArray22 = new String[] { null, null, Static229.aClass159_9.method2776(this.anInt2697), null, null };
		local18.aStringArray23 = new String[] { null, null, null, null, Static229.aClass159_10.method2776(this.anInt2697) };
		if (local54 != null) {
			local18.method3330(new Class2_Sub7(local54));
		}
		local18.method3326();
		if (local18.anInt3874 != -1) {
			local18.method3325(this.method2311(local18.anInt3852), this.method2311(local18.anInt3874));
		}
		if (local18.anInt3888 != -1) {
			local18.method3318(this.method2311(local18.anInt3846), this.method2311(local18.anInt3888));
		}
		if (!this.aBoolean192 && local18.aBoolean292) {
			local18.aString48 = Static229.aClass159_7.method2776(this.anInt2697);
			local18.aStringArray23 = this.aStringArray16;
			local18.aBoolean291 = false;
			local18.aStringArray22 = this.aStringArray17;
			local18.anInt3830 = 0;
			local18.anIntArray282 = null;
			if (local18.aClass90_11 != null) {
				@Pc(212) boolean local212 = false;
				for (@Pc(219) Class2 local219 = local18.aClass90_11.method1676(); local219 != null; local219 = local18.aClass90_11.method1680()) {
					@Pc(229) Class57 local229 = this.aClass191_1.method3971((int) local219.aLong268);
					if (local229.aBoolean64) {
						local219.method7657();
					} else {
						local212 = true;
					}
				}
				if (!local212) {
					local18.aClass90_11 = null;
				}
			}
		}
		@Pc(256) Class21 local256 = this.aClass21_28;
		synchronized (this.aClass21_28) {
			this.aClass21_28.method317(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public void method2312() {
		@Pc(2) Class21 local2 = this.aClass21_29;
		synchronized (this.aClass21_29) {
			this.aClass21_29.method313();
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public void method2313() {
		@Pc(2) Class312 local2 = this.aClass312_1;
		synchronized (this.aClass312_1) {
			this.aClass312_1.method6269();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!rm;Lclient!r;IIIIB)Lclient!f;")
	public Class38 method2314(@OriginalArg(0) int arg0, @OriginalArg(1) Class300 arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass87_1.anInt2002 = arg3;
		this.aClass87_1.anInt1994 = arg2.anInt8492;
		this.aClass87_1.aBoolean130 = arg1 != null;
		this.aClass87_1.anInt2003 = arg4;
		this.aClass87_1.anInt2001 = arg5;
		this.aClass87_1.anInt1997 = arg0;
		this.aClass87_1.anInt1996 = arg6;
		return (Class38) this.aClass312_1.method6266(this.aClass87_1);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V")
	public void method2315(@OriginalArg(0) int arg0) {
		this.anInt2702 = arg0;
		@Pc(13) Class21 local13 = this.aClass21_29;
		synchronized (this.aClass21_29) {
			this.aClass21_29.method313();
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	public void method2316() {
		@Pc(6) Class21 local6 = this.aClass21_28;
		synchronized (this.aClass21_28) {
			this.aClass21_28.method323(5);
		}
		local6 = this.aClass21_29;
		synchronized (this.aClass21_29) {
			this.aClass21_29.method323(5);
		}
		@Pc(42) Class312 local42 = this.aClass312_1;
		synchronized (this.aClass312_1) {
			this.aClass312_1.method6268();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!la;BZIILclient!rm;ZLclient!r;ILclient!r;I)Lclient!f;")
	public Class38 method2318(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class300 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class162 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class162 arg9, @OriginalArg(11) int arg10) {
		@Pc(34) Class38 local34 = this.method2314(arg10, arg5, arg7, arg4, arg0, arg8, arg3);
		if (local34 != null) {
			return local34;
		}
		@Pc(43) Class164 local43 = this.method2311(arg10);
		if (arg8 > 1 && local43.anIntArray285 != null) {
			@Pc(53) int local53 = -1;
			for (@Pc(55) int local55 = 0; local55 < 10; local55++) {
				if (arg8 >= local43.anIntArray283[local55] && local43.anIntArray283[local55] != 0) {
					local53 = local43.anIntArray285[local55];
				}
			}
			if (local53 != -1) {
				local43 = this.method2311(local53);
			}
		}
		@Pc(105) int[] local105 = local43.method3316(arg7, arg4, arg9, arg0, arg8, arg3, arg1, arg6, arg5);
		if (local105 == null) {
			return null;
		}
		@Pc(119) Class38 local119;
		if (arg2) {
			local119 = arg9.method6879(local105, 36, 36, 32);
		} else {
			local119 = arg7.method6879(local105, 36, 36, 32);
		}
		if (!arg2) {
			@Pc(135) Class87 local135 = new Class87();
			local135.anInt2003 = arg0;
			local135.aBoolean130 = arg5 != null;
			local135.anInt1994 = arg7.anInt8492;
			local135.anInt2002 = arg4;
			local135.anInt1997 = arg10;
			local135.anInt1996 = arg3;
			local135.anInt2001 = arg8;
			this.aClass312_1.method6260(local119, local135);
		}
		return local119;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public void method2319() {
		@Pc(6) Class21 local6 = this.aClass21_28;
		synchronized (this.aClass21_28) {
			this.aClass21_28.method314();
		}
		local6 = this.aClass21_29;
		synchronized (this.aClass21_29) {
			this.aClass21_29.method314();
		}
		@Pc(40) Class312 local40 = this.aClass312_1;
		synchronized (this.aClass312_1) {
			this.aClass312_1.method6265();
		}
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V")
	public void method2320() {
		@Pc(2) Class21 local2 = this.aClass21_28;
		synchronized (this.aClass21_28) {
			this.aClass21_28.method313();
		}
		local2 = this.aClass21_29;
		synchronized (this.aClass21_29) {
			this.aClass21_29.method313();
		}
		@Pc(36) Class312 local36 = this.aClass312_1;
		synchronized (this.aClass312_1) {
			this.aClass312_1.method6269();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZB)V")
	public void method2321(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean192) {
			this.aBoolean192 = arg0;
			this.method2320();
		}
	}
}
