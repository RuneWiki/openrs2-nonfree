import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class112 {

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "Lclient!bj;")
	private final Class30 aClass30_5;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	private int anInt4228;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
	private final int anInt4229;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "Lclient!sga;")
	private final Class307 aClass307_24;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(II)V")
	public Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass30_5 = new Class30();
		this.anInt4228 = arg0;
		this.anInt4229 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass307_24 = new Class307(local14);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class112(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	public int method3630() {
		return this.anInt4229;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
	public void method3631(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt4229 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method3634(arg1);
		this.anInt4228 -= arg2;
		while (this.anInt4228 < 0) {
			@Pc(32) Class3_Sub1_Sub14 local32 = (Class3_Sub1_Sub14) this.aClass30_5.method781();
			this.method3642(local32);
		}
		@Pc(50) Class3_Sub1_Sub14_Sub2 local50 = new Class3_Sub1_Sub14_Sub2(arg0, arg2);
		this.aClass307_24.method7425(arg1, local50);
		this.aClass30_5.method779(local50);
		local50.aLong275 = 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
	public int method3632() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class3_Sub1_Sub14 local13 = (Class3_Sub1_Sub14) this.aClass30_5.method780(); local13 != null; local13 = (Class3_Sub1_Sub14) this.aClass30_5.method783()) {
			if (!local13.method7618()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZJ)V")
	private void method3634(@OriginalArg(1) long arg0) {
		@Pc(15) Class3_Sub1_Sub14 local15 = (Class3_Sub1_Sub14) this.aClass307_24.method7424(arg0);
		this.method3642(local15);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	public int method3635() {
		return this.anInt4228;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method3636(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method3631(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public void method3637(@OriginalArg(1) int arg0) {
		if (Static247.aClass185_1 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub1_Sub14 local13 = (Class3_Sub1_Sub14) this.aClass30_5.method780(); local13 != null; local13 = (Class3_Sub1_Sub14) this.aClass30_5.method783()) {
			if (local13.method7618()) {
				if (local13.method7617() == null) {
					local13.method8671();
					local13.method8621();
					this.anInt4228 += local13.anInt9225;
				}
			} else if (++local13.aLong275 > (long) arg0) {
				@Pc(39) Class3_Sub1_Sub14 local39 = Static247.aClass185_1.method5112(local13);
				this.aClass307_24.method7425(local13.aLong277, local39);
				Static445.method6741(local39, local13);
				local13.method8671();
				local13.method8621();
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public void method3638() {
		this.aClass30_5.method778();
		this.aClass307_24.method7427();
		this.anInt4228 = this.anInt4229;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method3639() {
		@Pc(11) Class3_Sub1_Sub14 local11 = (Class3_Sub1_Sub14) this.aClass307_24.method7428();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7617();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub1_Sub14 local23 = local11;
			local11 = (Class3_Sub1_Sub14) this.aClass307_24.method7428();
			local23.method8671();
			local23.method8621();
			this.anInt4228 += local23.anInt9225;
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3640(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub1_Sub14 local10 = (Class3_Sub1_Sub14) this.aClass307_24.method7424(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method7617();
		if (local18 == null) {
			local10.method8671();
			local10.method8621();
			this.anInt4228 += local10.anInt9225;
			return null;
		}
		if (local10.method7618()) {
			@Pc(64) Class3_Sub1_Sub14_Sub2 local64 = new Class3_Sub1_Sub14_Sub2(local18, local10.anInt9225);
			this.aClass307_24.method7425(local10.aLong277, local64);
			this.aClass30_5.method779(local64);
			local64.aLong275 = 0L;
			local10.method8671();
			local10.method8621();
		} else {
			this.aClass30_5.method779(local10);
			local10.aLong275 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method3641() {
		@Pc(19) Class3_Sub1_Sub14 local19 = (Class3_Sub1_Sub14) this.aClass307_24.method7421();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method7617();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class3_Sub1_Sub14 local29 = local19;
			local19 = (Class3_Sub1_Sub14) this.aClass307_24.method7428();
			local29.method8671();
			local29.method8621();
			this.anInt4228 += local29.anInt9225;
		}
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!tia;)V")
	private void method3642(@OriginalArg(1) Class3_Sub1_Sub14 arg0) {
		if (arg0 != null) {
			arg0.method8671();
			arg0.method8621();
			this.anInt4228 += arg0.anInt9225;
		}
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
	public void method3643() {
		for (@Pc(16) Class3_Sub1_Sub14 local16 = (Class3_Sub1_Sub14) this.aClass30_5.method780(); local16 != null; local16 = (Class3_Sub1_Sub14) this.aClass30_5.method783()) {
			if (local16.method7618()) {
				local16.method8671();
				local16.method8621();
				this.anInt4228 += local16.anInt9225;
			}
		}
	}
}
