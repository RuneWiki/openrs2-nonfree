import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class32 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!dm;")
	private final Class75 aClass75_1;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!gca;")
	private final Class118 aClass118_5;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	private final int anInt801;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class32(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass75_1 = new Class75();
		this.anInt801 = arg0;
		this.anInt790 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass118_5 = new Class118(local14);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/Object;J)V")
	public void method629(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method639(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method630(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub2_Sub5 local10 = (Class2_Sub2_Sub5) this.aClass118_5.method2595(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method4971();
		if (local18 == null) {
			local10.method8653();
			local10.method8271();
			this.anInt790 += local10.anInt5796;
			return null;
		}
		if (local10.method4970()) {
			@Pc(63) Class2_Sub2_Sub5_Sub1 local63 = new Class2_Sub2_Sub5_Sub1(local18, local10.anInt5796);
			this.aClass118_5.method2601(local63, local10.aLong280);
			this.aClass75_1.method1572(local63);
			local63.aLong269 = 0L;
			local10.method8653();
			local10.method8271();
		} else {
			this.aClass75_1.method1572(local10);
			local10.aLong269 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)V")
	private void method631(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub2_Sub5 local10 = (Class2_Sub2_Sub5) this.aClass118_5.method2595(arg0);
		this.method638(local10);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public void method632() {
		for (@Pc(15) Class2_Sub2_Sub5 local15 = (Class2_Sub2_Sub5) this.aClass75_1.method1573(); local15 != null; local15 = (Class2_Sub2_Sub5) this.aClass75_1.method1568()) {
			if (local15.method4970()) {
				local15.method8653();
				local15.method8271();
				this.anInt790 += local15.anInt5796;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
	public void method634(@OriginalArg(1) int arg0) {
		if (Static87.aClass111_1 == null) {
			return;
		}
		for (@Pc(21) Class2_Sub2_Sub5 local21 = (Class2_Sub2_Sub5) this.aClass75_1.method1573(); local21 != null; local21 = (Class2_Sub2_Sub5) this.aClass75_1.method1568()) {
			if (local21.method4970()) {
				if (local21.method4971() == null) {
					local21.method8653();
					local21.method8271();
					this.anInt790 += local21.anInt5796;
				}
			} else if ((long) arg0 < ++local21.aLong269) {
				@Pc(66) Class2_Sub2_Sub5 local66 = Static87.aClass111_1.method2512(local21);
				this.aClass118_5.method2601(local66, local21.aLong280);
				Static631.method8042(local21, local66);
				local21.method8653();
				local21.method8271();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method635() {
		@Pc(17) Class2_Sub2_Sub5 local17 = (Class2_Sub2_Sub5) this.aClass118_5.method2597();
		while (local17 != null) {
			@Pc(23) Object local23 = local17.method4971();
			if (local23 != null) {
				return local23;
			}
			@Pc(29) Class2_Sub2_Sub5 local29 = local17;
			local17 = (Class2_Sub2_Sub5) this.aClass118_5.method2597();
			local29.method8653();
			local29.method8271();
			this.anInt790 += local29.anInt5796;
		}
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I")
	public int method636() {
		return this.anInt790;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method637() {
		@Pc(11) Class2_Sub2_Sub5 local11 = (Class2_Sub2_Sub5) this.aClass118_5.method2596();
		while (local11 != null) {
			@Pc(20) Object local20 = local11.method4971();
			if (local20 != null) {
				return local20;
			}
			@Pc(24) Class2_Sub2_Sub5 local24 = local11;
			local11 = (Class2_Sub2_Sub5) this.aClass118_5.method2597();
			local24.method8653();
			local24.method8271();
			this.anInt790 += local24.anInt5796;
		}
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bia;I)V")
	private void method638(@OriginalArg(0) Class2_Sub2_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method8653();
			arg0.method8271();
			this.anInt790 += arg0.anInt5796;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void method639(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) int arg2) {
		if (this.anInt801 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method631(arg0);
		this.anInt790 -= arg2;
		while (this.anInt790 < 0) {
			@Pc(42) Class2_Sub2_Sub5 local42 = (Class2_Sub2_Sub5) this.aClass75_1.method1571();
			this.method638(local42);
		}
		@Pc(55) Class2_Sub2_Sub5_Sub1 local55 = new Class2_Sub2_Sub5_Sub1(arg1, arg2);
		this.aClass118_5.method2601(local55, arg0);
		this.aClass75_1.method1572(local55);
		local55.aLong269 = 0L;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	public void method640() {
		this.aClass75_1.method1567();
		this.aClass118_5.method2599();
		this.anInt790 = this.anInt801;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)I")
	public int method641() {
		@Pc(7) int local7 = 0;
		for (@Pc(21) Class2_Sub2_Sub5 local21 = (Class2_Sub2_Sub5) this.aClass75_1.method1573(); local21 != null; local21 = (Class2_Sub2_Sub5) this.aClass75_1.method1568()) {
			if (!local21.method4970()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)I")
	public int method642() {
		return this.anInt801;
	}
}
