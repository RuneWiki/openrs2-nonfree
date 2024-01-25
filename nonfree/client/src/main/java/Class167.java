import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class167 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	private final int anInt5093;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!mo;")
	private final Class221 aClass221_12;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "Lclient!gd;")
	private final Class120 aClass120_6;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V")
	public Class167(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass120_6 = new Class120();
		this.anInt5097 = arg0;
		this.anInt5093 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && local14 < arg1; local14 += local14) {
		}
		this.aClass221_12 = new Class221(local14);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZLclient!tt;)V")
	private void method3960(@OriginalArg(1) Class4_Sub6_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method8193();
			arg0.method7880();
			this.anInt5097 += arg0.anInt4125;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method3961() {
		this.aClass120_6.method2665();
		this.aClass221_12.method5078();
		this.anInt5097 = this.anInt5093;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method3962() {
		@Pc(11) Class4_Sub6_Sub4 local11 = (Class4_Sub6_Sub4) this.aClass221_12.method5072();
		while (local11 != null) {
			@Pc(23) Object local23 = local11.method3257();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class4_Sub6_Sub4 local27 = local11;
			local11 = (Class4_Sub6_Sub4) this.aClass221_12.method5071();
			local27.method8193();
			local27.method7880();
			this.anInt5097 += local27.anInt4125;
		}
		return null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public void method3964(@OriginalArg(1) int arg0) {
		if (Static418.aClass40_5 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub6_Sub4 local13 = (Class4_Sub6_Sub4) this.aClass120_6.method2674(); local13 != null; local13 = (Class4_Sub6_Sub4) this.aClass120_6.method2671()) {
			if (local13.method3254()) {
				if (local13.method3257() == null) {
					local13.method8193();
					local13.method7880();
					this.anInt5097++;
				}
			} else if (++local13.aLong286 > (long) arg0) {
				@Pc(35) Class4_Sub6_Sub4 local35 = Static418.aClass40_5.method7128(local13);
				this.aClass221_12.method5073(local35, local13.aLong295);
				Static513.method7332(local13, local35);
				local13.method8193();
				local13.method7880();
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method3965() {
		@Pc(17) Class4_Sub6_Sub4 local17 = (Class4_Sub6_Sub4) this.aClass221_12.method5071();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method3257();
			if (local23 != null) {
				return local23;
			}
			@Pc(27) Class4_Sub6_Sub4 local27 = local17;
			local17 = (Class4_Sub6_Sub4) this.aClass221_12.method5071();
			local27.method8193();
			local27.method7880();
			this.anInt5097 += local27.anInt4125;
		}
		return null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method3966(@OriginalArg(0) long arg0) {
		@Pc(10) Class4_Sub6_Sub4 local10 = (Class4_Sub6_Sub4) this.aClass221_12.method5075(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3257();
		if (local18 == null) {
			local10.method8193();
			local10.method7880();
			this.anInt5097 += local10.anInt4125;
			return null;
		}
		if (local10.method3254()) {
			@Pc(56) Class4_Sub6_Sub4_Sub2 local56 = new Class4_Sub6_Sub4_Sub2(local18, local10.anInt4125);
			this.aClass221_12.method5073(local56, local10.aLong295);
			this.aClass120_6.method2669(local56);
			local56.aLong286 = 0L;
			local10.method8193();
			local10.method7880();
		} else {
			this.aClass120_6.method2669(local10);
			local10.aLong286 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(JI)V")
	private void method3967(@OriginalArg(0) long arg0) {
		@Pc(12) Class4_Sub6_Sub4 local12 = (Class4_Sub6_Sub4) this.aClass221_12.method5075(arg0);
		this.method3960(local12);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
	public void method3969(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5093 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method3967(arg1);
		this.anInt5097 -= arg2;
		while (this.anInt5097 < 0) {
			@Pc(36) Class4_Sub6_Sub4 local36 = (Class4_Sub6_Sub4) this.aClass120_6.method2667();
			this.method3960(local36);
		}
		@Pc(52) Class4_Sub6_Sub4_Sub2 local52 = new Class4_Sub6_Sub4_Sub2(arg0, arg2);
		this.aClass221_12.method5073(local52, arg1);
		this.aClass120_6.method2669(local52);
		local52.aLong286 = 0L;
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)I")
	public int method3970() {
		return this.anInt5093;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)I")
	public int method3973() {
		return this.anInt5097;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(JZLjava/lang/Object;)V")
	public void method3974(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method3969(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public void method3975() {
		for (@Pc(7) Class4_Sub6_Sub4 local7 = (Class4_Sub6_Sub4) this.aClass120_6.method2674(); local7 != null; local7 = (Class4_Sub6_Sub4) this.aClass120_6.method2671()) {
			if (local7.method3254()) {
				local7.method8193();
				local7.method7880();
				this.anInt5097 += local7.anInt4125;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)I")
	public int method3976() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class4_Sub6_Sub4 local18 = (Class4_Sub6_Sub4) this.aClass120_6.method2674(); local18 != null; local18 = (Class4_Sub6_Sub4) this.aClass120_6.method2671()) {
			if (!local18.method3254()) {
				local12++;
			}
		}
		return local12;
	}
}
