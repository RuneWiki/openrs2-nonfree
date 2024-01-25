import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class41 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!pf;")
	private final Class179 aClass179_1 = new Class179();

	@OriginalMember(owner = "client!co", name = "t", descriptor = "I")
	private int anInt1166;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "I")
	private final int anInt1165;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!wb;")
	private final Class243 aClass243_4;

	static {
		new Class62("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt1166 = arg0;
		this.anInt1165 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass243_4 = new Class243(local14);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
	public Object method823(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub7_Sub1 local18 = (Class2_Sub7_Sub1) this.aClass243_4.method5967(arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Object local26 = local18.method2352();
		if (local26 == null) {
			local18.method6130();
			local18.method6085();
			this.anInt1166 += local18.anInt2931;
			return null;
		}
		if (local18.method2353()) {
			@Pc(54) Class2_Sub7_Sub1_Sub2 local54 = new Class2_Sub7_Sub1_Sub2(local26, local18.anInt2931);
			this.aClass243_4.method5968(local18.aLong213, local54);
			this.aClass179_1.method4491(local54);
			local54.aLong209 = 0L;
			local18.method6130();
			local18.method6085();
		} else {
			this.aClass179_1.method4491(local18);
			local18.aLong209 = 0L;
		}
		return local26;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)I")
	public int method824() {
		return this.anInt1165;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public void method825() {
		this.aClass179_1.method4489();
		this.aClass243_4.method5970();
		this.anInt1166 = this.anInt1165;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	public void method826(@OriginalArg(0) int arg0) {
		if (Static136.aClass92_2 == null) {
			return;
		}
		for (@Pc(18) Class2_Sub7_Sub1 local18 = (Class2_Sub7_Sub1) this.aClass179_1.method4487(); local18 != null; local18 = (Class2_Sub7_Sub1) this.aClass179_1.method4494()) {
			if (local18.method2353()) {
				if (local18.method2352() == null) {
					local18.method6130();
					local18.method6085();
					this.anInt1166++;
				}
			} else if ((long) arg0 < ++local18.aLong209) {
				@Pc(40) Class2_Sub7_Sub1 local40 = Static136.aClass92_2.method3774(local18);
				this.aClass243_4.method5968(local18.aLong213, local40);
				Static323.method5214(local18, local40);
				local18.method6130();
				local18.method6085();
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	public int method827() {
		@Pc(12) int local12 = 0;
		for (@Pc(18) Class2_Sub7_Sub1 local18 = (Class2_Sub7_Sub1) this.aClass179_1.method4487(); local18 != null; local18 = (Class2_Sub7_Sub1) this.aClass179_1.method4494()) {
			if (!local18.method2353()) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!cm;)V")
	private void method828(@OriginalArg(1) Class2_Sub7_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method6130();
			arg0.method6085();
			this.anInt1166 += arg0.anInt2931;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public void method829() {
		for (@Pc(16) Class2_Sub7_Sub1 local16 = (Class2_Sub7_Sub1) this.aClass179_1.method4487(); local16 != null; local16 = (Class2_Sub7_Sub1) this.aClass179_1.method4494()) {
			if (local16.method2353()) {
				local16.method6130();
				local16.method6085();
				this.anInt1166 += local16.anInt2931;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method832(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method835(arg0, arg1);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method833() {
		@Pc(18) Class2_Sub7_Sub1 local18 = (Class2_Sub7_Sub1) this.aClass243_4.method5973();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method2352();
			if (local24 != null) {
				return local24;
			}
			@Pc(30) Class2_Sub7_Sub1 local30 = local18;
			local18 = (Class2_Sub7_Sub1) this.aClass243_4.method5973();
			local30.method6130();
			local30.method6085();
			this.anInt1166 += local18.anInt2931;
		}
		return null;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)I")
	public int method834() {
		return this.anInt1166;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(JILjava/lang/Object;I)V")
	private void method835(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt1165 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method838(arg0);
		this.anInt1166--;
		while (this.anInt1166 < 0) {
			@Pc(32) Class2_Sub7_Sub1 local32 = (Class2_Sub7_Sub1) this.aClass179_1.method4490();
			this.method828(local32);
		}
		@Pc(49) Class2_Sub7_Sub1_Sub2 local49 = new Class2_Sub7_Sub1_Sub2(arg1, 1);
		this.aClass243_4.method5968(arg0, local49);
		this.aClass179_1.method4491(local49);
		local49.aLong209 = 0L;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public Object method836() {
		@Pc(11) Class2_Sub7_Sub1 local11 = (Class2_Sub7_Sub1) this.aClass243_4.method5975();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method2352();
			if (local17 != null) {
				return local17;
			}
			@Pc(21) Class2_Sub7_Sub1 local21 = local11;
			local11 = (Class2_Sub7_Sub1) this.aClass243_4.method5973();
			local21.method6130();
			local21.method6085();
			this.anInt1166 += local11.anInt2931;
		}
		return null;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(JB)V")
	private void method838(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub7_Sub1 local10 = (Class2_Sub7_Sub1) this.aClass243_4.method5967(arg0);
		this.method828(local10);
	}
}
