import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class257 {

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Lclient!et;")
	private final Class65 aClass65_9 = new Class65();

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	private final int anInt7272;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
	private int anInt7262;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!lp;")
	private final Class140 aClass140_41;

	static {
		new Class174("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class257(@OriginalArg(0) int arg0) {
		this.anInt7272 = arg0;
		this.anInt7262 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass140_41 = new Class140(local16);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
	public int method5875() {
		return this.anInt7272;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!sv;Ljava/lang/Object;I)V")
	private void method5876(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt7272 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5885(arg0);
		this.anInt7262--;
		while (this.anInt7262 < 0) {
			@Pc(36) Class3_Sub3_Sub2 local36 = (Class3_Sub3_Sub2) this.aClass65_9.method1685();
			this.method5883(local36);
		}
		@Pc(53) Class3_Sub3_Sub2_Sub1 local53 = new Class3_Sub3_Sub2_Sub1(arg0, arg1, 1);
		this.aClass140_41.method3494(arg0.method1707(), local53);
		this.aClass65_9.method1686(local53);
		local53.aLong243 = 0L;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public void method5878() {
		for (@Pc(15) Class3_Sub3_Sub2 local15 = (Class3_Sub3_Sub2) this.aClass65_9.method1684(); local15 != null; local15 = (Class3_Sub3_Sub2) this.aClass65_9.method1688()) {
			if (local15.method4696()) {
				local15.method6288();
				local15.method6102();
				this.anInt7262 += local15.anInt5648;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Object;BLclient!sv;)V")
	public void method5880(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface11 arg1) {
		this.method5876(arg1, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public void method5881() {
		if (Static320.aClass40_2 == null) {
			return;
		}
		for (@Pc(13) Class3_Sub3_Sub2 local13 = (Class3_Sub3_Sub2) this.aClass65_9.method1684(); local13 != null; local13 = (Class3_Sub3_Sub2) this.aClass65_9.method1688()) {
			if (local13.method4696()) {
				if (local13.method4695() == null) {
					local13.method6288();
					local13.method6102();
					this.anInt7262 += local13.anInt5648;
				}
			} else if ((long) 5 < ++local13.aLong243) {
				@Pc(54) Class3_Sub3_Sub2 local54 = Static320.aClass40_2.method1162(local13);
				this.aClass140_41.method3494(local13.aLong248, local54);
				Static357.method4981(local54, local13);
				local13.method6288();
				local13.method6102();
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!cb;)V")
	private void method5883(@OriginalArg(1) Class3_Sub3_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method6288();
			arg0.method6102();
			this.anInt7262 += arg0.anInt5648;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!sv;)Ljava/lang/Object;")
	public Object method5884(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1707();
		for (@Pc(22) Class3_Sub3_Sub2 local22 = (Class3_Sub3_Sub2) this.aClass140_41.method3490(local9); local22 != null; local22 = (Class3_Sub3_Sub2) this.aClass140_41.method3491()) {
			if (local22.anInterface11_3.method1708(arg0)) {
				@Pc(34) Object local34 = local22.method4695();
				if (local34 != null) {
					if (local22.method4696()) {
						@Pc(65) Class3_Sub3_Sub2_Sub1 local65 = new Class3_Sub3_Sub2_Sub1(arg0, local34, local22.anInt5648);
						this.aClass140_41.method3494(local22.aLong248, local65);
						this.aClass65_9.method1686(local65);
						local65.aLong243 = 0L;
						local22.method6288();
						local22.method6102();
					} else {
						this.aClass65_9.method1686(local22);
						local22.aLong243 = 0L;
					}
					return local34;
				}
				local22.method6288();
				local22.method6102();
				this.anInt7262 += local22.anInt5648;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!sv;)V")
	private void method5885(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method1707();
		for (@Pc(23) Class3_Sub3_Sub2 local23 = (Class3_Sub3_Sub2) this.aClass140_41.method3490(local9); local23 != null; local23 = (Class3_Sub3_Sub2) this.aClass140_41.method3491()) {
			if (local23.anInterface11_3.method1708(arg0)) {
				this.method5883(local23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	public void method5886() {
		this.aClass65_9.method1687();
		this.aClass140_41.method3488();
		this.anInt7262 = this.anInt7272;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)I")
	public int method5887() {
		return this.anInt7262;
	}
}
