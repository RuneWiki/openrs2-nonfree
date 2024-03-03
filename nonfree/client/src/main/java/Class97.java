import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class97 {

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "Lclient!h;")
	public static final Class89 aClass89_108 = new Class89(59, -2);

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_60 = new Class79("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_61 = new Class79("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	public static int anInt2590 = -50;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_62 = new Class79("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
	public static int anInt2592 = -1;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_18 = new Class98(4);

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "Lclient!wc;")
	private final Class246 aClass246_1 = new Class246();

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
	private final int anInt2585;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!ad;")
	private final Class4 aClass4_55;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V", line = 298)
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2585 = arg0;
		this.anInt2576 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass4_55 = new Class4(local16);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!iq;Ljava/lang/Object;)V", line = 3)
	public void method2585(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) Object arg1) {
		this.method2590(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 16)
	public void method2586() {
		this.aClass246_1.method6343();
		this.aClass4_55.method81();
		this.anInt2576 = this.anInt2585;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!bq;B)V", line = 48)
	private void method2588(@OriginalArg(0) Class2_Sub2_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method6469();
			arg0.method6144();
			this.anInt2576 += arg0.anInt5030;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I", line = 66)
	public int method2589() {
		return this.anInt2576;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!iq;Ljava/lang/Object;II)V", line = 81)
	private void method2590(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt2585 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2595(arg0);
		this.anInt2576--;
		while (this.anInt2576 < 0) {
			@Pc(36) Class2_Sub2_Sub2 local36 = (Class2_Sub2_Sub2) this.aClass246_1.method6340();
			this.method2588(local36);
		}
		@Pc(61) Class2_Sub2_Sub2_Sub2 local61 = new Class2_Sub2_Sub2_Sub2(arg0, arg1, 1);
		this.aClass4_55.method87(local61, arg0.method1781());
		this.aClass246_1.method6342(local61);
		local61.aLong215 = 0L;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)V", line = 111)
	public void method2591() {
		if (Class188.aClass236_1 == null) {
			return;
		}
		for (@Pc(19) Class2_Sub2_Sub2 local19 = (Class2_Sub2_Sub2) this.aClass246_1.method6338(); local19 != null; local19 = (Class2_Sub2_Sub2) this.aClass246_1.method6337()) {
			if (local19.method4626()) {
				if (local19.method4627() == null) {
					local19.method6469();
					local19.method6144();
					this.anInt2576 += local19.anInt5030;
				}
			} else if ((long) 5 < ++local19.aLong215) {
				@Pc(66) Class2_Sub2_Sub2 local66 = Class188.aClass236_1.method6031(local19);
				this.aClass4_55.method87(local66, local19.aLong232);
				Static136.method2698(local19, local66);
				local19.method6469();
				local19.method6144();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 163)
	public void method2592() {
		for (@Pc(7) Class2_Sub2_Sub2 local7 = (Class2_Sub2_Sub2) this.aClass246_1.method6338(); local7 != null; local7 = (Class2_Sub2_Sub2) this.aClass246_1.method6337()) {
			if (local7.method4626()) {
				local7.method6469();
				local7.method6144();
				this.anInt2576 += local7.anInt5030;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)I", line = 205)
	public int method2594() {
		return this.anInt2585;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!iq;)V", line = 221)
	private void method2595(@OriginalArg(1) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1781();
		for (@Pc(25) Class2_Sub2_Sub2 local25 = (Class2_Sub2_Sub2) this.aClass4_55.method90(local11); local25 != null; local25 = (Class2_Sub2_Sub2) this.aClass4_55.method82()) {
			if (local25.anInterface7_3.method1780(arg0)) {
				this.method2588(local25);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!iq;I)Ljava/lang/Object;", line = 334)
	public Object method2598(@OriginalArg(0) Interface7 arg0) {
		@Pc(11) long local11 = arg0.method1781();
		for (@Pc(18) Class2_Sub2_Sub2 local18 = (Class2_Sub2_Sub2) this.aClass4_55.method90(local11); local18 != null; local18 = (Class2_Sub2_Sub2) this.aClass4_55.method82()) {
			if (local18.anInterface7_3.method1780(arg0)) {
				@Pc(30) Object local30 = local18.method4627();
				if (local30 != null) {
					if (local18.method4626()) {
						@Pc(59) Class2_Sub2_Sub2_Sub2 local59 = new Class2_Sub2_Sub2_Sub2(arg0, local30, local18.anInt5030);
						this.aClass4_55.method87(local59, local18.aLong232);
						this.aClass246_1.method6342(local59);
						local59.aLong215 = 0L;
						local18.method6469();
						local18.method6144();
					} else {
						this.aClass246_1.method6342(local18);
						local18.aLong215 = 0L;
					}
					return local30;
				}
				local18.method6469();
				local18.method6144();
				this.anInt2576 += local18.anInt5030;
			}
		}
		return null;
	}
}
