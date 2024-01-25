import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class100 {

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Lclient!ub;")
	private final Class252 aClass252_3 = new Class252();

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	private int anInt3217;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	private final int anInt3211;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "Lclient!hl;")
	private final Class96 aClass96_21;

	static {
		new Class21("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
		new Class21("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		new Class21("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt3217 = arg0;
		this.anInt3211 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass96_21 = new Class96(local16);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/Object;Lclient!tp;I)V")
	public void method2870(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface8 arg1) {
		this.method2874(arg1, arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)V")
	public void method2871() {
		if (Static126.aClass233_1 == null) {
			return;
		}
		for (@Pc(17) Class4_Sub1_Sub1 local17 = (Class4_Sub1_Sub1) this.aClass252_3.method5697(); local17 != null; local17 = (Class4_Sub1_Sub1) this.aClass252_3.method5700()) {
			if (local17.method1229()) {
				if (local17.method1230() == null) {
					local17.method6330();
					local17.method5985();
					this.anInt3217 += local17.anInt1339;
				}
			} else if ((long) 5 < ++local17.aLong219) {
				@Pc(45) Class4_Sub1_Sub1 local45 = Static126.aClass233_1.method5346(local17);
				this.aClass96_21.method2805(local17.aLong228, local45);
				Static295.method4509(local17, local45);
				local17.method6330();
				local17.method5985();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ac;I)V")
	private void method2873(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method6330();
			arg0.method5985();
			this.anInt3217 += arg0.anInt1339;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!tp;Ljava/lang/Object;I)V")
	private void method2874(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt3211 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2880(arg0);
		this.anInt3217--;
		while (this.anInt3217 < 0) {
			@Pc(36) Class4_Sub1_Sub1 local36 = (Class4_Sub1_Sub1) this.aClass252_3.method5698();
			this.method2873(local36);
		}
		@Pc(53) Class4_Sub1_Sub1_Sub2 local53 = new Class4_Sub1_Sub1_Sub2(arg0, arg1, 1);
		this.aClass96_21.method2805(arg0.method1150(), local53);
		this.aClass252_3.method5694(local53);
		local53.aLong219 = 0L;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!tp;I)Ljava/lang/Object;")
	public Object method2875(@OriginalArg(0) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method1150();
		for (@Pc(16) Class4_Sub1_Sub1 local16 = (Class4_Sub1_Sub1) this.aClass96_21.method2797(local9); local16 != null; local16 = (Class4_Sub1_Sub1) this.aClass96_21.method2803()) {
			if (local16.anInterface8_3.method1151(arg0)) {
				@Pc(28) Object local28 = local16.method1230();
				if (local28 != null) {
					if (local16.method1229()) {
						@Pc(57) Class4_Sub1_Sub1_Sub2 local57 = new Class4_Sub1_Sub1_Sub2(arg0, local28, local16.anInt1339);
						this.aClass96_21.method2805(local16.aLong228, local57);
						this.aClass252_3.method5694(local57);
						local57.aLong219 = 0L;
						local16.method6330();
						local16.method5985();
					} else {
						this.aClass252_3.method5694(local16);
						local16.aLong219 = 0L;
					}
					return local28;
				}
				local16.method6330();
				local16.method5985();
				this.anInt3217 += local16.anInt1339;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
	public void method2876() {
		for (@Pc(11) Class4_Sub1_Sub1 local11 = (Class4_Sub1_Sub1) this.aClass252_3.method5697(); local11 != null; local11 = (Class4_Sub1_Sub1) this.aClass252_3.method5700()) {
			if (local11.method1229()) {
				local11.method6330();
				local11.method5985();
				this.anInt3217 += local11.anInt1339;
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I")
	public int method2877() {
		return this.anInt3211;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I")
	public int method2878() {
		return this.anInt3217;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public void method2879() {
		this.aClass252_3.method5696();
		this.aClass96_21.method2799();
		this.anInt3217 = this.anInt3211;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lclient!tp;I)V")
	private void method2880(@OriginalArg(0) Interface8 arg0) {
		@Pc(9) long local9 = arg0.method1150();
		for (@Pc(20) Class4_Sub1_Sub1 local20 = (Class4_Sub1_Sub1) this.aClass96_21.method2797(local9); local20 != null; local20 = (Class4_Sub1_Sub1) this.aClass96_21.method2803()) {
			if (local20.anInterface8_3.method1151(arg0)) {
				this.method2873(local20);
				return;
			}
		}
	}
}
