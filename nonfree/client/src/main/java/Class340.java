import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class340 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!rda;")
	private final Class300 aClass300_43;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	private final int anInt9491;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Lclient!ut;")
	private final Class358 aClass358_12;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	private int anInt9500;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
	public Class340(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(II)V")
	public Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass358_12 = new Class358();
		this.anInt9500 = arg0;
		this.anInt9491 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14 && arg1 > local14; local14 += local14) {
		}
		this.aClass300_43 = new Class300(local14);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JLjava/lang/Object;I)V")
	public void method7986(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		this.method8001(1, arg0, arg1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method7987() {
		this.aClass358_12.method8327();
		this.aClass300_43.method7189();
		this.anInt9500 = this.anInt9491;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(JB)V")
	private void method7988(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub3_Sub4 local10 = (Class5_Sub3_Sub4) this.aClass300_43.method7188(arg0);
		this.method7991(local10);
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7989() {
		@Pc(11) Class5_Sub3_Sub4 local11 = (Class5_Sub3_Sub4) this.aClass300_43.method7182();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method8129();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class5_Sub3_Sub4 local21 = local11;
			local11 = (Class5_Sub3_Sub4) this.aClass300_43.method7192();
			local21.method9052();
			local21.method8687();
			this.anInt9500 += local21.anInt9732;
		}
		return null;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)I")
	public int method7990() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class5_Sub3_Sub4 local11 = (Class5_Sub3_Sub4) this.aClass358_12.method8322(); local11 != null; local11 = (Class5_Sub3_Sub4) this.aClass358_12.method8328()) {
			if (!local11.method8131()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!pfa;)V")
	private void method7991(@OriginalArg(1) Class5_Sub3_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method9052();
			arg0.method8687();
			this.anInt9500 += arg0.anInt9732;
		}
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)I")
	public int method7992() {
		return this.anInt9500;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method7993() {
		@Pc(11) Class5_Sub3_Sub4 local11 = (Class5_Sub3_Sub4) this.aClass300_43.method7192();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method8129();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class5_Sub3_Sub4 local21 = local11;
			local11 = (Class5_Sub3_Sub4) this.aClass300_43.method7192();
			local21.method9052();
			local21.method8687();
			this.anInt9500 += local21.anInt9732;
		}
		return null;
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)I")
	public int method7994() {
		return this.anInt9491;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public void method7996(@OriginalArg(1) int arg0) {
		if (Static560.aClass214_1 == null) {
			return;
		}
		for (@Pc(13) Class5_Sub3_Sub4 local13 = (Class5_Sub3_Sub4) this.aClass358_12.method8322(); local13 != null; local13 = (Class5_Sub3_Sub4) this.aClass358_12.method8328()) {
			if (local13.method8131()) {
				if (local13.method8129() == null) {
					local13.method9052();
					local13.method8687();
					this.anInt9500 += local13.anInt9732;
				}
			} else if (++local13.aLong297 > (long) arg0) {
				@Pc(54) Class5_Sub3_Sub4 local54 = Static560.aClass214_1.method5272(local13);
				this.aClass300_43.method7191(local54, local13.aLong307);
				Static245.method705(local54, local13);
				local13.method9052();
				local13.method8687();
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(JB)Ljava/lang/Object;")
	public Object method7999(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub3_Sub4 local10 = (Class5_Sub3_Sub4) this.aClass300_43.method7188(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method8129();
		if (local18 == null) {
			local10.method9052();
			local10.method8687();
			this.anInt9500 += local10.anInt9732;
			return null;
		}
		if (local10.method8131()) {
			@Pc(60) Class5_Sub3_Sub4_Sub2 local60 = new Class5_Sub3_Sub4_Sub2(local18, local10.anInt9732);
			this.aClass300_43.method7191(local60, local10.aLong307);
			this.aClass358_12.method8329(local60);
			local60.aLong297 = 0L;
			local10.method9052();
			local10.method8687();
		} else {
			this.aClass358_12.method8329(local10);
			local10.aLong297 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method8000() {
		for (@Pc(13) Class5_Sub3_Sub4 local13 = (Class5_Sub3_Sub4) this.aClass358_12.method8322(); local13 != null; local13 = (Class5_Sub3_Sub4) this.aClass358_12.method8328()) {
			if (local13.method8131()) {
				local13.method9052();
				local13.method8687();
				this.anInt9500 += local13.anInt9732;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBJLjava/lang/Object;)V")
	public void method8001(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Object arg2) {
		if (this.anInt9491 < arg0) {
			throw new IllegalStateException("s>cs");
		}
		this.method7988(arg1);
		this.anInt9500 -= arg0;
		while (this.anInt9500 < 0) {
			@Pc(39) Class5_Sub3_Sub4 local39 = (Class5_Sub3_Sub4) this.aClass358_12.method8326();
			this.method7991(local39);
		}
		@Pc(52) Class5_Sub3_Sub4_Sub2 local52 = new Class5_Sub3_Sub4_Sub2(arg2, arg0);
		this.aClass300_43.method7191(local52, arg1);
		this.aClass358_12.method8329(local52);
		local52.aLong297 = 0L;
	}
}
