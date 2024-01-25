import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class230 {

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!pf;")
	private final Class179 aClass179_12 = new Class179();

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	private final int anInt6500;

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
	private int anInt6493;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!wb;")
	private final Class243 aClass243_33;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	public Class230(@OriginalArg(0) int arg0) {
		this.anInt6500 = arg0;
		this.anInt6493 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass243_33 = new Class243(local16);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I")
	public int method5595() {
		return this.anInt6493;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!gf;B)V")
	private void method5597(@OriginalArg(0) Class2_Sub7_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method6130();
			arg0.method6085();
			this.anInt6493 += arg0.anInt5759;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!vl;)Ljava/lang/Object;")
	public Object method5600(@OriginalArg(1) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method6110();
		for (@Pc(24) Class2_Sub7_Sub5 local24 = (Class2_Sub7_Sub5) this.aClass243_33.method5967(local9); local24 != null; local24 = (Class2_Sub7_Sub5) this.aClass243_33.method5971()) {
			if (local24.anInterface10_3.method6111(arg0)) {
				@Pc(38) Object local38 = local24.method5095();
				if (local38 != null) {
					if (local24.method5096()) {
						@Pc(67) Class2_Sub7_Sub5_Sub1 local67 = new Class2_Sub7_Sub5_Sub1(arg0, local38, local24.anInt5759);
						this.aClass243_33.method5968(local24.aLong213, local67);
						this.aClass179_12.method4491(local67);
						local67.aLong209 = 0L;
						local24.method6130();
						local24.method6085();
					} else {
						this.aClass179_12.method4491(local24);
						local24.aLong209 = 0L;
					}
					return local38;
				}
				local24.method6130();
				local24.method6085();
				this.anInt6493 += local24.anInt5759;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
	public int method5601() {
		return this.anInt6500;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
	public void method5602() {
		this.aClass179_12.method4489();
		this.aClass243_33.method5970();
		this.anInt6493 = this.anInt6500;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!vl;)V")
	private void method5603(@OriginalArg(1) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method6110();
		for (@Pc(24) Class2_Sub7_Sub5 local24 = (Class2_Sub7_Sub5) this.aClass243_33.method5967(local9); local24 != null; local24 = (Class2_Sub7_Sub5) this.aClass243_33.method5971()) {
			if (local24.anInterface10_3.method6111(arg0)) {
				this.method5597(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)V")
	public void method5604() {
		if (Static210.aClass235_3 == null) {
			return;
		}
		for (@Pc(9) Class2_Sub7_Sub5 local9 = (Class2_Sub7_Sub5) this.aClass179_12.method4487(); local9 != null; local9 = (Class2_Sub7_Sub5) this.aClass179_12.method4494()) {
			if (local9.method5096()) {
				if (local9.method5095() == null) {
					local9.method6130();
					local9.method6085();
					this.anInt6493 += local9.anInt5759;
				}
			} else if (++local9.aLong209 > (long) 5) {
				@Pc(54) Class2_Sub7_Sub5 local54 = Static210.aClass235_3.method5691(local9);
				this.aClass243_33.method5968(local9.aLong213, local54);
				Static323.method5214(local9, local54);
				local9.method6130();
				local9.method6085();
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
	public void method5605() {
		for (@Pc(13) Class2_Sub7_Sub5 local13 = (Class2_Sub7_Sub5) this.aClass179_12.method4487(); local13 != null; local13 = (Class2_Sub7_Sub5) this.aClass179_12.method4494()) {
			if (local13.method5096()) {
				local13.method6130();
				local13.method6085();
				this.anInt6493 += local13.anInt5759;
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Object;BLclient!vl;I)V")
	private void method5606(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface10 arg1) {
		if (this.anInt6500 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5603(arg1);
		this.anInt6493--;
		while (this.anInt6493 < 0) {
			@Pc(36) Class2_Sub7_Sub5 local36 = (Class2_Sub7_Sub5) this.aClass179_12.method4490();
			this.method5597(local36);
		}
		@Pc(53) Class2_Sub7_Sub5_Sub1 local53 = new Class2_Sub7_Sub5_Sub1(arg1, arg0, 1);
		this.aClass243_33.method5968(arg1.method6110(), local53);
		this.aClass179_12.method4491(local53);
		local53.aLong209 = 0L;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/Object;ILclient!vl;)V")
	public void method5607(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface10 arg1) {
		this.method5606(arg0, arg1);
	}
}
