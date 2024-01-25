import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class342 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!ce;")
	private final Class49 aClass49_11;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	private final int anInt9775;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private int anInt9780;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Lclient!sba;")
	private final Class297 aClass297_36;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class342(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(II)V")
	public Class342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass49_11 = new Class49();
		this.anInt9780 = arg0;
		this.anInt9775 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass297_36 = new Class297(local14);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method7683(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method7686(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
	public Object method7684(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub7_Sub6 local10 = (Class3_Sub7_Sub6) this.aClass297_36.method6531(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(23) Object local23 = local10.method7415();
		if (local23 == null) {
			local10.method8128();
			local10.method8136();
			this.anInt9780 += local10.anInt9446;
			return null;
		}
		if (local10.method7412()) {
			@Pc(51) Class3_Sub7_Sub6_Sub1 local51 = new Class3_Sub7_Sub6_Sub1(local23, local10.anInt9446);
			this.aClass297_36.method6537(local10.aLong262, local51);
			this.aClass49_11.method1455(local51);
			local51.aLong263 = 0L;
			local10.method8128();
			local10.method8136();
		} else {
			this.aClass49_11.method1455(local10);
			local10.aLong263 = 0L;
		}
		return local23;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IJ)V")
	private void method7685(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub7_Sub6 local10 = (Class3_Sub7_Sub6) this.aClass297_36.method6531(arg0);
		this.method7691(local10);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;IJI)V")
	public void method7686(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (this.anInt9775 < arg2) {
			throw new IllegalStateException("s>cs");
		}
		this.method7685(arg1);
		this.anInt9780 -= arg2;
		while (this.anInt9780 < 0) {
			@Pc(32) Class3_Sub7_Sub6 local32 = (Class3_Sub7_Sub6) this.aClass49_11.method1452();
			this.method7691(local32);
		}
		@Pc(45) Class3_Sub7_Sub6_Sub1 local45 = new Class3_Sub7_Sub6_Sub1(arg0, arg2);
		this.aClass297_36.method6537(arg1, local45);
		this.aClass49_11.method1455(local45);
		local45.aLong263 = 0;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	public void method7687() {
		for (@Pc(16) Class3_Sub7_Sub6 local16 = (Class3_Sub7_Sub6) this.aClass49_11.method1448(); local16 != null; local16 = (Class3_Sub7_Sub6) this.aClass49_11.method1451()) {
			if (local16.method7412()) {
				local16.method8128();
				local16.method8136();
				this.anInt9780 += local16.anInt9446;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method7689() {
		@Pc(16) Class3_Sub7_Sub6 local16 = (Class3_Sub7_Sub6) this.aClass297_36.method6529();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method7415();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class3_Sub7_Sub6 local26 = local16;
			local16 = (Class3_Sub7_Sub6) this.aClass297_36.method6532();
			local26.method8128();
			local26.method8136();
			this.anInt9780 += local26.anInt9446;
		}
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)I")
	public int method7690() {
		return this.anInt9775;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLclient!vaa;)V")
	private void method7691(@OriginalArg(1) Class3_Sub7_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method8128();
			arg0.method8136();
			this.anInt9780 += arg0.anInt9446;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
	public int method7692() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class3_Sub7_Sub6 local18 = (Class3_Sub7_Sub6) this.aClass49_11.method1448(); local18 != null; local18 = (Class3_Sub7_Sub6) this.aClass49_11.method1451()) {
			if (!local18.method7412()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
	public void method7693() {
		this.aClass49_11.method1450();
		this.aClass297_36.method6535();
		this.anInt9780 = this.anInt9775;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method7695() {
		@Pc(11) Class3_Sub7_Sub6 local11 = (Class3_Sub7_Sub6) this.aClass297_36.method6532();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7415();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class3_Sub7_Sub6 local23 = local11;
			local11 = (Class3_Sub7_Sub6) this.aClass297_36.method6532();
			local23.method8128();
			local23.method8136();
			this.anInt9780 += local23.anInt9446;
		}
		return null;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)I")
	public int method7696() {
		return this.anInt9780;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	public void method7697(@OriginalArg(1) int arg0) {
		if (Static49.aClass187_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub7_Sub6 local9 = (Class3_Sub7_Sub6) this.aClass49_11.method1448(); local9 != null; local9 = (Class3_Sub7_Sub6) this.aClass49_11.method1451()) {
			if (local9.method7412()) {
				if (local9.method7415() == null) {
					local9.method8128();
					local9.method8136();
					this.anInt9780++;
				}
			} else if ((long) arg0 < ++local9.aLong263) {
				@Pc(31) Class3_Sub7_Sub6 local31 = Static49.aClass187_1.method4633(local9);
				this.aClass297_36.method6537(local9.aLong262, local31);
				Static578.method7856(local9, local31);
				local9.method8128();
				local9.method8136();
			}
		}
	}
}
