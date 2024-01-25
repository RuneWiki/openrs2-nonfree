import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class87 {

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	private int anInt2187;

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "Lclient!pl;")
	private final Class273 aClass273_6;

	@OriginalMember(owner = "client!eda", name = "l", descriptor = "Lclient!vu;")
	private final Class368 aClass368_1;

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
	private final int anInt2195;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(I)V")
	public Class87(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(II)V")
	public Class87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass368_1 = new Class368();
		this.anInt2195 = arg0;
		this.anInt2187 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && local14 < arg1; local14 += local14) {
		}
		this.aClass273_6 = new Class273(local14);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method1792(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method1804(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)V")
	public void method1793(@OriginalArg(1) int arg0) {
		if (Static438.aClass208_3 == null) {
			return;
		}
		for (@Pc(13) Class5_Sub5_Sub2 local13 = (Class5_Sub5_Sub2) this.aClass368_1.method8702(); local13 != null; local13 = (Class5_Sub5_Sub2) this.aClass368_1.method8710()) {
			if (local13.method4147()) {
				if (local13.method4145() == null) {
					local13.method9047();
					local13.method8952();
					this.anInt2187 += local13.anInt4570;
				}
			} else if ((long) arg0 < ++local13.aLong274) {
				@Pc(35) Class5_Sub5_Sub2 local35 = Static438.aClass208_3.method6296(local13);
				this.aClass273_6.method6585(local13.aLong278, local35);
				Static447.method6737(local35, local13);
				local13.method9047();
				local13.method8952();
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1794() {
		@Pc(11) Class5_Sub5_Sub2 local11 = (Class5_Sub5_Sub2) this.aClass273_6.method6577();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method4145();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class5_Sub5_Sub2 local23 = local11;
			local11 = (Class5_Sub5_Sub2) this.aClass273_6.method6589();
			local23.method9047();
			local23.method8952();
			this.anInt2187 += local23.anInt4570;
		}
		return null;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)I")
	public int method1795() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class5_Sub5_Sub2 local19 = (Class5_Sub5_Sub2) this.aClass368_1.method8702(); local19 != null; local19 = (Class5_Sub5_Sub2) this.aClass368_1.method8710()) {
			if (!local19.method4147()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
	public void method1796() {
		for (@Pc(19) Class5_Sub5_Sub2 local19 = (Class5_Sub5_Sub2) this.aClass368_1.method8702(); local19 != null; local19 = (Class5_Sub5_Sub2) this.aClass368_1.method8710()) {
			if (local19.method4147()) {
				local19.method9047();
				local19.method8952();
				this.anInt2187 += local19.anInt4570;
			}
		}
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1797() {
		@Pc(16) Class5_Sub5_Sub2 local16 = (Class5_Sub5_Sub2) this.aClass273_6.method6589();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method4145();
			if (local22 != null) {
				return local22;
			}
			@Pc(28) Class5_Sub5_Sub2 local28 = local16;
			local16 = (Class5_Sub5_Sub2) this.aClass273_6.method6589();
			local28.method9047();
			local28.method8952();
			this.anInt2187 += local28.anInt4570;
		}
		return null;
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)I")
	public int method1799() {
		return this.anInt2187;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(JI)V")
	private void method1800(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub5_Sub2 local10 = (Class5_Sub5_Sub2) this.aClass273_6.method6581(arg0);
		this.method1806(local10);
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
	public void method1801() {
		this.aClass368_1.method8703();
		this.aClass273_6.method6586();
		this.anInt2187 = this.anInt2195;
	}

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "(B)I")
	public int method1803() {
		return this.anInt2195;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJLjava/lang/Object;I)V")
	public void method1804(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) int arg2) {
		if (arg2 > this.anInt2195) {
			throw new IllegalStateException("s>cs");
		}
		this.method1800(arg0);
		this.anInt2187 -= arg2;
		while (this.anInt2187 < 0) {
			@Pc(33) Class5_Sub5_Sub2 local33 = (Class5_Sub5_Sub2) this.aClass368_1.method8705();
			this.method1806(local33);
		}
		@Pc(49) Class5_Sub5_Sub2_Sub2 local49 = new Class5_Sub5_Sub2_Sub2(arg1, arg2);
		this.aClass273_6.method6585(arg0, local49);
		this.aClass368_1.method8709(local49);
		local49.aLong274 = 0L;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method1805(@OriginalArg(1) long arg0) {
		@Pc(16) Class5_Sub5_Sub2 local16 = (Class5_Sub5_Sub2) this.aClass273_6.method6581(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method4145();
		if (local24 == null) {
			local16.method9047();
			local16.method8952();
			this.anInt2187 += local16.anInt4570;
			return null;
		}
		if (local16.method4147()) {
			@Pc(61) Class5_Sub5_Sub2_Sub2 local61 = new Class5_Sub5_Sub2_Sub2(local24, local16.anInt4570);
			this.aClass273_6.method6585(local16.aLong278, local61);
			this.aClass368_1.method8709(local61);
			local61.aLong274 = 0L;
			local16.method9047();
			local16.method8952();
		} else {
			this.aClass368_1.method8709(local16);
			local16.aLong274 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!eg;B)V")
	private void method1806(@OriginalArg(0) Class5_Sub5_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method9047();
			arg0.method8952();
			this.anInt2187 += arg0.anInt4570;
		}
	}
}
