import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class173 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!bu;")
	public Class30 aClass30_4;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt4835;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public int anInt4838;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Z")
	public boolean aBoolean355 = false;

	static {
		new Class62("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method4352(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4835 = arg0.method5753();
		} else if (arg1 == 2) {
			this.anInt4838 = arg0.method5736();
		} else if (arg1 == 3) {
			this.aBoolean355 = true;
		} else if (arg1 == 4) {
			this.anInt4835 = -1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)Z")
	public boolean method4354() {
		return this.aClass30_4.aClass83_17.method1958(this.anInt4835);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLclient!vt;)V")
	public void method4355(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method4352(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IILclient!oj;Z)Lclient!rg;")
	public Class27 method4358(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(29) long local29 = (long) (arg0 << 16 | this.anInt4835 | (arg2 ? 262144 : 0) | arg1.anInt3038 << 19);
		@Pc(37) Class27 local37 = (Class27) this.aClass30_4.aClass41_5.method823(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass30_4.aClass83_17.method1958(this.anInt4835)) {
			@Pc(61) Class128 local61 = Static399.method3370(this.aClass30_4.aClass83_17, this.anInt4835, 0);
			if (local61 != null) {
				local61.anInt3862 = local61.anInt3866 = local61.anInt3867 = local61.anInt3864 = 0;
				if (arg2) {
					local61.method3375();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method3374();
				}
			}
			local37 = arg1.method2527(local61);
			if (local37 != null) {
				this.aClass30_4.aClass41_5.method832(local29, local37);
			}
			return local37;
		} else {
			return null;
		}
	}
}
