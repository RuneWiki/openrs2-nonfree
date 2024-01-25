import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class179 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!qi;")
	public Class208 aClass208_29;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!qi;")
	private Class208 aClass208_30;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	private int anInt4893;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljava/lang/String;")
	private String aString54 = "null";

	static {
		new Class142("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3897(@OriginalArg(1) String arg0) {
		if (this.aClass208_29 == null) {
			return false;
		}
		if (this.aClass208_30 == null) {
			this.method3902();
		}
		for (@Pc(30) Class1_Sub47 local30 = (Class1_Sub47) this.aClass208_30.method4405(Static387.method4982(arg0)); local30 != null; local30 = (Class1_Sub47) this.aClass208_30.method4415()) {
			if (local30.aString69.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static95.method5199(arg1.method2917());
		} else if (arg0 == 2) {
			this.aChar3 = Static95.method5199(arg1.method2917());
		} else if (arg0 == 3) {
			this.aString54 = arg1.method2914();
		} else if (arg0 == 4) {
			this.anInt4893 = arg1.method2877();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(58) int local58 = arg1.method2896();
			this.aClass208_29 = new Class208(Static191.method2764(local58));
			for (@Pc(68) int local68 = 0; local68 < local58; local68++) {
				@Pc(74) int local74 = arg1.method2877();
				@Pc(86) Class1 local86;
				if (arg0 == 5) {
					local86 = new Class1_Sub25(arg1.method2914());
				} else {
					local86 = new Class1_Sub18(arg1.method2877());
				}
				this.aClass208_29.method4413((long) local74, local86);
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3900(@OriginalArg(1) int arg0) {
		if (this.aClass208_29 == null) {
			return this.aString54;
		} else {
			@Pc(17) Class1_Sub25 local17 = (Class1_Sub25) this.aClass208_29.method4405((long) arg0);
			return local17 == null ? this.aString54 : local17.aString39;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Z")
	public boolean method3901(@OriginalArg(0) int arg0) {
		if (this.aClass208_29 == null) {
			return false;
		}
		if (this.aClass208_30 == null) {
			this.method3906();
		}
		@Pc(30) Class1_Sub18 local30 = (Class1_Sub18) this.aClass208_30.method4405((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	private void method3902() {
		this.aClass208_30 = new Class208(this.aClass208_29.method4412());
		for (@Pc(28) Class1_Sub25 local28 = (Class1_Sub25) this.aClass208_29.method4414(); local28 != null; local28 = (Class1_Sub25) this.aClass208_29.method4410()) {
			@Pc(39) Class1_Sub47 local39 = new Class1_Sub47(local28.aString39, (int) local28.aLong236);
			this.aClass208_30.method4413(Static387.method4982(local28.aString39), local39);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)I")
	public int method3903(@OriginalArg(0) int arg0) {
		if (this.aClass208_29 == null) {
			return this.anInt4893;
		} else {
			@Pc(17) Class1_Sub18 local17 = (Class1_Sub18) this.aClass208_29.method4405((long) arg0);
			return local17 == null ? this.anInt4893 : local17.anInt2354;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method3904(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method3898(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	private void method3906() {
		this.aClass208_30 = new Class208(this.aClass208_29.method4412());
		for (@Pc(24) Class1_Sub18 local24 = (Class1_Sub18) this.aClass208_29.method4414(); local24 != null; local24 = (Class1_Sub18) this.aClass208_29.method4410()) {
			@Pc(33) Class1_Sub18 local33 = new Class1_Sub18((int) local24.aLong236);
			this.aClass208_30.method4413((long) local24.anInt2354, local33);
		}
	}
}
