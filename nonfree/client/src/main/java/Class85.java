import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dka")
public final class Class85 {

	@OriginalMember(owner = "client!dka", name = "p", descriptor = "Lclient!vl;")
	private Class388 aClass388_2;

	@OriginalMember(owner = "client!dka", name = "l", descriptor = "I")
	private final int anInt1990;

	@OriginalMember(owner = "client!dka", name = "v", descriptor = "Lclient!lba;")
	private final Class218 aClass218_9;

	@OriginalMember(owner = "client!dka", name = "i", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(II)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass388_2 = new Class388();
		this.anInt2005 = arg0;
		this.anInt1990 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0 && arg1 > local14; local14 += local14) {
		}
		this.aClass218_9 = new Class218(local14);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ILclient!ri;)V")
	private void method1734(@OriginalArg(1) Class2_Sub6_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method9872();
			arg0.method8698();
			this.anInt2005 += arg0.anInt6902;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/lang/Object;JII)V")
	public void method1735(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1990 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method1736(arg1);
		this.anInt2005 -= arg2;
		while (this.anInt2005 < 0) {
			@Pc(35) Class2_Sub6_Sub11 local35 = (Class2_Sub6_Sub11) this.aClass388_2.method9216();
			this.method1734(local35);
		}
		@Pc(51) Class2_Sub6_Sub11_Sub1 local51 = new Class2_Sub6_Sub11_Sub1(arg0, arg2);
		this.aClass218_9.method5099(local51, arg1);
		this.aClass388_2.method9215(local51);
		local51.aLong311 = 0L;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(IJ)V")
	public void method1736(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub6_Sub11 local18 = (Class2_Sub6_Sub11) this.aClass218_9.method5095(arg0, 0);
		this.method1734(local18);
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method1737(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub6_Sub11 local10 = (Class2_Sub6_Sub11) this.aClass218_9.method5095(arg0, 0);
		if (local10 == null) {
			return null;
		}
		@Pc(19) Object local19 = local10.method6201();
		if (local19 == null) {
			local10.method9872();
			local10.method8698();
			this.anInt2005 += local10.anInt6902;
			return null;
		}
		if (local10.method6204()) {
			@Pc(48) Class2_Sub6_Sub11_Sub1 local48 = new Class2_Sub6_Sub11_Sub1(local19, local10.anInt6902);
			this.aClass218_9.method5099(local48, local10.aLong352);
			this.aClass388_2.method9215(local48);
			local48.aLong311 = 0L;
			local10.method9872();
			local10.method8698();
		} else {
			this.aClass388_2.method9215(local10);
			local10.aLong311 = 0L;
		}
		return local19;
	}

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)I")
	public int method1738() {
		@Pc(13) int local13 = 0;
		for (@Pc(19) Class2_Sub6_Sub11 local19 = (Class2_Sub6_Sub11) this.aClass388_2.method9213(); local19 != null; local19 = (Class2_Sub6_Sub11) this.aClass388_2.method9212()) {
			if (!local19.method6204()) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "(I)I")
	public int method1739() {
		return this.anInt2005;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Z)I")
	public int method1740() {
		return this.anInt1990;
	}

	@OriginalMember(owner = "client!dka", name = "f", descriptor = "(I)V")
	public void method1741() {
		for (@Pc(7) Class2_Sub6_Sub11 local7 = (Class2_Sub6_Sub11) this.aClass388_2.method9213(); local7 != null; local7 = (Class2_Sub6_Sub11) this.aClass388_2.method9212()) {
			if (local7.method6204()) {
				local7.method9872();
				local7.method8698();
				this.anInt2005 += local7.anInt6902;
			}
		}
		if (-1 != -1) {
			Static119.anInt1991 = 31;
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ZI)V")
	public void method1742(@OriginalArg(1) int arg0) {
		if (Static311.aClass192_1 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub6_Sub11 local9 = (Class2_Sub6_Sub11) this.aClass388_2.method9213(); local9 != null; local9 = (Class2_Sub6_Sub11) this.aClass388_2.method9212()) {
			if (local9.method6204()) {
				if (local9.method6201() == null) {
					local9.method9872();
					local9.method8698();
					this.anInt2005 += local9.anInt6902;
				}
			} else if (++local9.aLong311 > (long) arg0) {
				@Pc(58) Class2_Sub6_Sub11 local58 = Static311.aClass192_1.method5483(local9);
				this.aClass218_9.method5099(local58, local9.aLong352);
				Static69.method1064(local9, local58);
				local9.method9872();
				local9.method8698();
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method1743() {
		@Pc(19) Class2_Sub6_Sub11 local19 = (Class2_Sub6_Sub11) this.aClass218_9.method5096();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method6201();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub6_Sub11 local29 = local19;
			local19 = (Class2_Sub6_Sub11) this.aClass218_9.method5096();
			local29.method9872();
			local29.method8698();
			this.anInt2005 += local29.anInt6902;
		}
		return null;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method1745(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		this.method1735(arg2, arg0, 1);
		if (arg1 != 16383) {
			this.aClass388_2 = null;
		}
	}

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "(I)V")
	public void method1748() {
		this.aClass388_2.method9211();
		this.aClass218_9.method5097();
		this.anInt2005 = this.anInt1990;
	}

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method1749() {
		@Pc(11) Class2_Sub6_Sub11 local11 = (Class2_Sub6_Sub11) this.aClass218_9.method5092();
		while (local11 != null) {
			@Pc(27) Object local27 = local11.method6201();
			if (local27 != null) {
				return local27;
			}
			@Pc(34) Class2_Sub6_Sub11 local34 = local11;
			local11 = (Class2_Sub6_Sub11) this.aClass218_9.method5096();
			local34.method9872();
			local34.method8698();
			this.anInt2005 += local34.anInt6902;
		}
		return null;
	}
}
