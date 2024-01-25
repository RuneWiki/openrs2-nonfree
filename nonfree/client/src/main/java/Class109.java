import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class109 {

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!we;")
	private final Class212 aClass212_3 = new Class212();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	private int anInt3219;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	private final int anInt3214;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!tn;")
	private final Class190 aClass190_17;

	static {
		new Class85("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		new Class85(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V")
	public Class109(@OriginalArg(0) int arg0) {
		this.anInt3219 = arg0;
		this.anInt3214 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass190_17 = new Class190(local14);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public Object method2848() {
		@Pc(11) Class5_Sub1_Sub5 local11 = (Class5_Sub1_Sub5) this.aClass190_17.method5465();
		while (local11 != null) {
			@Pc(19) Object local19 = local11.method3819();
			if (local19 != null) {
				return local19;
			}
			@Pc(25) Class5_Sub1_Sub5 local25 = local11;
			local11 = (Class5_Sub1_Sub5) this.aClass190_17.method5465();
			local25.method6005();
			local25.method5970();
			this.anInt3219++;
		}
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method2850() {
		for (@Pc(5) Class5_Sub1_Sub5 local5 = (Class5_Sub1_Sub5) this.aClass212_3.method5943(); local5 != null; local5 = (Class5_Sub1_Sub5) this.aClass212_3.method5939()) {
			if (local5.method3820()) {
				local5.method6005();
				local5.method5970();
				this.anInt3219++;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	public int method2853() {
		return this.anInt3214;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)I")
	public int method2854() {
		return this.anInt3219;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJLjava/lang/Object;)V")
	public void method2855(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		this.method2864(arg0);
		if (this.anInt3219 == 0) {
			@Pc(23) Class5_Sub1_Sub5 local23 = (Class5_Sub1_Sub5) this.aClass212_3.method5937();
			local23.method6005();
			local23.method5970();
		} else {
			this.anInt3219--;
		}
		@Pc(34) Class5_Sub1_Sub5_Sub1 local34 = new Class5_Sub1_Sub5_Sub1(arg1);
		this.aClass190_17.method5464(local34, arg0);
		this.aClass212_3.method5936(local34);
		local34.aLong234 = 0L;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
	public Object method2857(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub1_Sub5 local10 = (Class5_Sub1_Sub5) this.aClass190_17.method5466(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(22) Object local22 = local10.method3819();
		if (local22 == null) {
			local10.method6005();
			local10.method5970();
			this.anInt3219++;
			return null;
		}
		if (local10.method3820()) {
			@Pc(56) Class5_Sub1_Sub5_Sub1 local56 = new Class5_Sub1_Sub5_Sub1(local22);
			this.aClass190_17.method5464(local56, local10.aLong235);
			this.aClass212_3.method5936(local56);
			local56.aLong234 = 0L;
			local10.method6005();
			local10.method5970();
		} else {
			this.aClass212_3.method5936(local10);
			local10.aLong234 = 0L;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public void method2858() {
		this.aClass212_3.method5942();
		this.aClass190_17.method5472();
		this.anInt3219 = this.anInt3214;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public void method2859(@OriginalArg(0) int arg0) {
		if (Static84.aClass37_4 == null) {
			return;
		}
		for (@Pc(9) Class5_Sub1_Sub5 local9 = (Class5_Sub1_Sub5) this.aClass212_3.method5943(); local9 != null; local9 = (Class5_Sub1_Sub5) this.aClass212_3.method5939()) {
			if (local9.method3820()) {
				if (local9.method3819() == null) {
					local9.method6005();
					local9.method5970();
					this.anInt3219++;
				}
			} else if ((long) arg0 < ++local9.aLong234) {
				@Pc(51) Class5_Sub1_Sub5 local51 = Static84.aClass37_4.method6036(local9);
				this.aClass190_17.method5464(local51, local9.aLong235);
				Static102.method1827(local9, local51);
				local9.method6005();
				local9.method5970();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)I")
	public int method2862() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class5_Sub1_Sub5 local11 = (Class5_Sub1_Sub5) this.aClass212_3.method5943(); local11 != null; local11 = (Class5_Sub1_Sub5) this.aClass212_3.method5939()) {
			if (!local11.method3820()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
	private void method2864(@OriginalArg(0) long arg0) {
		@Pc(18) Class5_Sub1_Sub5 local18 = (Class5_Sub1_Sub5) this.aClass190_17.method5466(arg0);
		if (local18 != null) {
			local18.method6005();
			local18.method5970();
			this.anInt3219++;
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public Object method2865() {
		@Pc(19) Class5_Sub1_Sub5 local19 = (Class5_Sub1_Sub5) this.aClass190_17.method5471();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method3819();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class5_Sub1_Sub5 local31 = local19;
			local19 = (Class5_Sub1_Sub5) this.aClass190_17.method5465();
			local31.method6005();
			local31.method5970();
			this.anInt3219++;
		}
		return null;
	}
}
