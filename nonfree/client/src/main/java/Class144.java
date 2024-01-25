import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class144 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!qh;")
	public Class199 aClass199_117;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	private int anInt4033;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!qh;")
	private Class199 aClass199_118;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Ljava/lang/String;")
	private String aString48 = "null";

	static {
		new Class119("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)I")
	public int method3277(@OriginalArg(1) int arg0) {
		if (this.aClass199_117 == null) {
			return this.anInt4033;
		} else {
			@Pc(17) Class1_Sub26 local17 = (Class1_Sub26) this.aClass199_117.method4387((long) arg0);
			return local17 == null ? this.anInt4033 : local17.anInt3459;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3278(@OriginalArg(0) int arg0) {
		if (this.aClass199_117 == null) {
			return this.aString48;
		} else {
			@Pc(22) Class1_Sub33 local22 = (Class1_Sub33) this.aClass199_117.method4387((long) arg0);
			return local22 == null ? this.aString48 : local22.aString60;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ug;IB)V")
	private void method3279(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static276.method3830(arg0.method5367());
		} else if (arg1 == 2) {
			this.aChar3 = Static276.method3830(arg0.method5367());
		} else if (arg1 == 3) {
			this.aString48 = arg0.method5381();
		} else if (arg1 == 4) {
			this.anInt4033 = arg0.method5355();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(51) int local51 = arg0.method5335();
			this.aClass199_117 = new Class199(Static191.method2740(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg0.method5355();
				@Pc(79) Class1 local79;
				if (arg1 == 5) {
					local79 = new Class1_Sub33(arg0.method5381());
				} else {
					local79 = new Class1_Sub26(arg0.method5355());
				}
				this.aClass199_117.method4383((long) local67, local79);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method3280(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method3279(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Z")
	public boolean method3282(@OriginalArg(0) int arg0) {
		if (this.aClass199_117 == null) {
			return false;
		}
		if (this.aClass199_118 == null) {
			this.method3284();
		}
		@Pc(22) Class1_Sub26 local22 = (Class1_Sub26) this.aClass199_118.method4387((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3283(@OriginalArg(1) String arg0) {
		if (this.aClass199_117 == null) {
			return false;
		}
		if (this.aClass199_118 == null) {
			this.method3285();
		}
		for (@Pc(31) Class1_Sub13 local31 = (Class1_Sub13) this.aClass199_118.method4387(Static396.method5183(arg0)); local31 != null; local31 = (Class1_Sub13) this.aClass199_118.method4389()) {
			if (local31.aString10.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	private void method3284() {
		this.aClass199_118 = new Class199(this.aClass199_117.method4386());
		for (@Pc(20) Class1_Sub26 local20 = (Class1_Sub26) this.aClass199_117.method4392(); local20 != null; local20 = (Class1_Sub26) this.aClass199_117.method4393()) {
			@Pc(29) Class1_Sub26 local29 = new Class1_Sub26((int) local20.aLong230);
			this.aClass199_118.method4383((long) local20.anInt3459, local29);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	private void method3285() {
		this.aClass199_118 = new Class199(this.aClass199_117.method4386());
		for (@Pc(20) Class1_Sub33 local20 = (Class1_Sub33) this.aClass199_117.method4392(); local20 != null; local20 = (Class1_Sub33) this.aClass199_117.method4393()) {
			@Pc(31) Class1_Sub13 local31 = new Class1_Sub13(local20.aString60, (int) local20.aLong230);
			this.aClass199_118.method4383(Static396.method5183(local20.aString60), local31);
		}
	}
}
