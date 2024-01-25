import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class132 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!vv;")
	private final Class261 aClass261_8 = new Class261();

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	private final int anInt3401;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	private int anInt3395;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!ew;")
	private final Class72 aClass72_22;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class132(@OriginalArg(0) int arg0) {
		this.anInt3401 = arg0;
		this.anInt3395 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass72_22 = new Class72(local14);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method2698() {
		this.aClass261_8.method5486();
		this.aClass72_22.method1650();
		this.anInt3395 = this.anInt3401;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method2699() {
		@Pc(11) Class2_Sub5_Sub9 local11 = (Class2_Sub5_Sub9) this.aClass72_22.method1649();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method5193();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class2_Sub5_Sub9 local21 = local11;
			local11 = (Class2_Sub5_Sub9) this.aClass72_22.method1649();
			local21.method5703();
			local21.method5621();
			this.anInt3395 += local11.anInt6695;
		}
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)I")
	public int method2700() {
		return this.anInt3401;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method2701(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub5_Sub9 local16 = (Class2_Sub5_Sub9) this.aClass72_22.method1659(arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(24) Object local24 = local16.method5193();
		if (local24 == null) {
			local16.method5703();
			local16.method5621();
			this.anInt3395 += local16.anInt6695;
			return null;
		}
		if (local16.method5190()) {
			@Pc(52) Class2_Sub5_Sub9_Sub1 local52 = new Class2_Sub5_Sub9_Sub1(local24, local16.anInt6695);
			this.aClass72_22.method1653(local52, local16.aLong225);
			this.aClass261_8.method5487(local52);
			local52.aLong220 = 0L;
			local16.method5703();
			local16.method5621();
		} else {
			this.aClass261_8.method5487(local16);
			local16.aLong220 = 0L;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method2702() {
		@Pc(11) Class2_Sub5_Sub9 local11 = (Class2_Sub5_Sub9) this.aClass72_22.method1655();
		while (local11 != null) {
			@Pc(25) Object local25 = local11.method5193();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) Class2_Sub5_Sub9 local29 = local11;
			local11 = (Class2_Sub5_Sub9) this.aClass72_22.method1649();
			local29.method5703();
			local29.method5621();
			this.anInt3395 += local11.anInt6695;
		}
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!po;B)V")
	private void method2704(@OriginalArg(0) Class2_Sub5_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method5703();
			arg0.method5621();
			this.anInt3395 += arg0.anInt6695;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(JI)V")
	private void method2705(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub5_Sub9 local16 = (Class2_Sub5_Sub9) this.aClass72_22.method1659(arg0);
		this.method2704(local16);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
	public int method2707() {
		return this.anInt3395;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method2708() {
		for (@Pc(7) Class2_Sub5_Sub9 local7 = (Class2_Sub5_Sub9) this.aClass261_8.method5489(); local7 != null; local7 = (Class2_Sub5_Sub9) this.aClass261_8.method5490()) {
			if (local7.method5190()) {
				local7.method5703();
				local7.method5621();
				this.anInt3395 += local7.anInt6695;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public int method2709() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class2_Sub5_Sub9 local13 = (Class2_Sub5_Sub9) this.aClass261_8.method5489(); local13 != null; local13 = (Class2_Sub5_Sub9) this.aClass261_8.method5490()) {
			if (!local13.method5190()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/Object;J)V")
	public void method2711(@OriginalArg(1) Object arg0, @OriginalArg(2) long arg1) {
		this.method2712(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILjava/lang/Object;J)V")
	private void method2712(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt3401 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2705(arg1);
		this.anInt3395--;
		while (this.anInt3395 < 0) {
			@Pc(36) Class2_Sub5_Sub9 local36 = (Class2_Sub5_Sub9) this.aClass261_8.method5485();
			this.method2704(local36);
		}
		@Pc(49) Class2_Sub5_Sub9_Sub1 local49 = new Class2_Sub5_Sub9_Sub1(arg0, 1);
		this.aClass72_22.method1653(local49, arg1);
		this.aClass261_8.method5487(local49);
		local49.aLong220 = 0L;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public void method2713(@OriginalArg(1) int arg0) {
		if (Static368.aClass212_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub5_Sub9 local13 = (Class2_Sub5_Sub9) this.aClass261_8.method5489(); local13 != null; local13 = (Class2_Sub5_Sub9) this.aClass261_8.method5490()) {
			if (local13.method5190()) {
				if (local13.method5193() == null) {
					local13.method5703();
					local13.method5621();
					this.anInt3395++;
				}
			} else if ((long) arg0 < ++local13.aLong220) {
				@Pc(55) Class2_Sub5_Sub9 local55 = Static368.aClass212_1.method5396(local13);
				this.aClass72_22.method1653(local55, local13.aLong225);
				Static46.method670(local13, local55);
				local13.method5703();
				local13.method5621();
			}
		}
	}
}
