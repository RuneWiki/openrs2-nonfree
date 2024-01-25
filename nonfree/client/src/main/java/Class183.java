import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class183 {

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!kn;")
	private final Class140 aClass140_8 = new Class140();

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private final int anInt5340;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	private int anInt5339;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!qo;")
	private final Class196 aClass196_27;

	static {
		new Class242("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class183(@OriginalArg(0) int arg0) {
		this.anInt5340 = arg0;
		this.anInt5339 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass196_27 = new Class196(local16);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Object;Lclient!dt;)V")
	public void method4100(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface2 arg1) {
		this.method4110(arg1, arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!dt;B)V")
	private void method4102(@OriginalArg(0) Interface2 arg0) {
		@Pc(13) long local13 = arg0.method1870();
		for (@Pc(22) Class4_Sub1_Sub5 local22 = (Class4_Sub1_Sub5) this.aClass196_27.method4477(local13); local22 != null; local22 = (Class4_Sub1_Sub5) this.aClass196_27.method4479()) {
			if (local22.anInterface2_3.method1869(arg0)) {
				this.method4107(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method4103() {
		this.aClass140_8.method3013();
		this.aClass196_27.method4471();
		this.anInt5339 = this.anInt5340;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
	public int method4104() {
		return this.anInt5340;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
	public void method4105() {
		if (Static282.aClass119_1 == null) {
			return;
		}
		for (@Pc(13) Class4_Sub1_Sub5 local13 = (Class4_Sub1_Sub5) this.aClass140_8.method3014(); local13 != null; local13 = (Class4_Sub1_Sub5) this.aClass140_8.method3018()) {
			if (local13.method5864()) {
				if (local13.method5865() == null) {
					local13.method5854();
					local13.method5863();
					this.anInt5339 += local13.anInt7609;
				}
			} else if ((long) 5 < ++local13.aLong226) {
				@Pc(58) Class4_Sub1_Sub5 local58 = Static282.aClass119_1.method4307(local13);
				this.aClass196_27.method4474(local13.aLong225, local58);
				Static235.method3263(local58, local13);
				local13.method5854();
				local13.method5863();
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ck;I)V")
	private void method4107(@OriginalArg(0) Class4_Sub1_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method5854();
			arg0.method5863();
			this.anInt5339 += arg0.anInt7609;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I")
	public int method4108() {
		return this.anInt5339;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!dt;Ljava/lang/Object;I)V")
	private void method4110(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt5340 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4102(arg0);
		this.anInt5339--;
		while (this.anInt5339 < 0) {
			@Pc(32) Class4_Sub1_Sub5 local32 = (Class4_Sub1_Sub5) this.aClass140_8.method3016();
			this.method4107(local32);
		}
		@Pc(48) Class4_Sub1_Sub5_Sub2 local48 = new Class4_Sub1_Sub5_Sub2(arg0, arg1, 1);
		this.aClass196_27.method4474(arg0.method1870(), local48);
		this.aClass140_8.method3015(local48);
		local48.aLong226 = 0L;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!dt;)Ljava/lang/Object;")
	public Object method4111(@OriginalArg(1) Interface2 arg0) {
		@Pc(9) long local9 = arg0.method1870();
		for (@Pc(21) Class4_Sub1_Sub5 local21 = (Class4_Sub1_Sub5) this.aClass196_27.method4477(local9); local21 != null; local21 = (Class4_Sub1_Sub5) this.aClass196_27.method4479()) {
			if (local21.anInterface2_3.method1869(arg0)) {
				@Pc(33) Object local33 = local21.method5865();
				if (local33 != null) {
					if (local21.method5864()) {
						@Pc(72) Class4_Sub1_Sub5_Sub2 local72 = new Class4_Sub1_Sub5_Sub2(arg0, local33, local21.anInt7609);
						this.aClass196_27.method4474(local21.aLong225, local72);
						this.aClass140_8.method3015(local72);
						local72.aLong226 = 0L;
						local21.method5854();
						local21.method5863();
					} else {
						this.aClass140_8.method3015(local21);
						local21.aLong226 = 0L;
					}
					return local33;
				}
				local21.method5854();
				local21.method5863();
				this.anInt5339 += local21.anInt7609;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public void method4112() {
		for (@Pc(11) Class4_Sub1_Sub5 local11 = (Class4_Sub1_Sub5) this.aClass140_8.method3014(); local11 != null; local11 = (Class4_Sub1_Sub5) this.aClass140_8.method3018()) {
			if (local11.method5864()) {
				local11.method5854();
				local11.method5863();
				this.anInt5339 += local11.anInt7609;
			}
		}
	}
}
