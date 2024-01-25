import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class249 {

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!lp;")
	public Class140 aClass140_38;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "Lclient!lp;")
	private Class140 aClass140_39;

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
	private int anInt7128;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Ljava/lang/String;")
	private String aString67 = "null";

	static {
		new Class174("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Z")
	public boolean method5766(@OriginalArg(0) int arg0) {
		if (this.aClass140_38 == null) {
			return false;
		}
		if (this.aClass140_39 == null) {
			this.method5776();
		}
		@Pc(22) Class3_Sub30 local22 = (Class3_Sub30) this.aClass140_39.method3490((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5767(@OriginalArg(0) String arg0) {
		if (this.aClass140_38 == null) {
			return false;
		}
		if (this.aClass140_39 == null) {
			this.method5771();
		}
		for (@Pc(30) Class3_Sub2 local30 = (Class3_Sub2) this.aClass140_39.method3490(Static85.method1530(arg0)); local30 != null; local30 = (Class3_Sub2) this.aClass140_39.method3491()) {
			if (local30.aString1.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!nj;)V")
	public void method5770(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4096();
			if (local10 == 0) {
				return;
			}
			this.method5772(local10, arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	private void method5771() {
		this.aClass140_39 = new Class140(this.aClass140_38.method3487());
		for (@Pc(28) Class3_Sub35 local28 = (Class3_Sub35) this.aClass140_38.method3486(); local28 != null; local28 = (Class3_Sub35) this.aClass140_38.method3485()) {
			@Pc(39) Class3_Sub2 local39 = new Class3_Sub2(local28.aString52, (int) local28.aLong248);
			this.aClass140_39.method3494(Static85.method1530(local28.aString52), local39);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!nj;)V")
	private void method5772(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub25 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static331.method5972(arg1.method4097());
		} else if (arg0 == 2) {
			this.aChar5 = Static331.method5972(arg1.method4097());
		} else if (arg0 == 3) {
			this.aString67 = arg1.method4073();
		} else if (arg0 == 4) {
			this.anInt7128 = arg1.method4108();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(51) int local51 = arg1.method4083();
			this.aClass140_38 = new Class140(Static342.method4774(local51));
			for (@Pc(61) int local61 = 0; local61 < local51; local61++) {
				@Pc(67) int local67 = arg1.method4108();
				@Pc(81) Class3 local81;
				if (arg0 == 5) {
					local81 = new Class3_Sub35(arg1.method4073());
				} else {
					local81 = new Class3_Sub30(arg1.method4108());
				}
				this.aClass140_38.method3494((long) local67, local81);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)I")
	public int method5775(@OriginalArg(1) int arg0) {
		if (this.aClass140_38 == null) {
			return this.anInt7128;
		} else {
			@Pc(22) Class3_Sub30 local22 = (Class3_Sub30) this.aClass140_38.method3490((long) arg0);
			return local22 == null ? this.anInt7128 : local22.anInt3957;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	private void method5776() {
		this.aClass140_39 = new Class140(this.aClass140_38.method3487());
		for (@Pc(20) Class3_Sub30 local20 = (Class3_Sub30) this.aClass140_38.method3486(); local20 != null; local20 = (Class3_Sub30) this.aClass140_38.method3485()) {
			@Pc(29) Class3_Sub30 local29 = new Class3_Sub30((int) local20.aLong248);
			this.aClass140_39.method3494((long) local20.anInt3957, local29);
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5777(@OriginalArg(1) int arg0) {
		if (this.aClass140_38 == null) {
			return this.aString67;
		} else {
			@Pc(27) Class3_Sub35 local27 = (Class3_Sub35) this.aClass140_38.method3490((long) arg0);
			return local27 == null ? this.aString67 : local27.aString52;
		}
	}
}
