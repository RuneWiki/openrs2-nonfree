import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class112 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!sr;")
	public Class230 aClass230_4;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Z")
	public boolean aBoolean175 = false;

	static {
		new Class231("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method2315(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2811 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt2808 = arg0.method6145();
		} else if (arg1 == 3) {
			this.aBoolean175 = true;
		} else if (arg1 == 4) {
			this.anInt2811 = -1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!hw;)V")
	public void method2316(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6138();
			if (local13 == 0) {
				return;
			}
			this.method2315(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
	public boolean method2319() {
		return this.aClass230_4.aClass171_90.method3666(this.anInt2811);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!za;I)Lclient!o;")
	public Class41 method2320(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2) {
		@Pc(22) long local22 = (long) (this.anInt2811 | arg1 << 16 | (arg0 ? 262144 : 0) | arg2.anInt7407 << 19);
		@Pc(30) Class41 local30 = (Class41) this.aClass230_4.aClass188_52.method4158(local22);
		if (local30 != null) {
			return local30;
		} else if (this.aClass230_4.aClass171_90.method3666(this.anInt2811)) {
			@Pc(59) Class190 local59 = Static470.method4242(this.aClass230_4.aClass171_90, this.anInt2811, 0);
			if (local59 != null) {
				local59.anInt5314 = local59.anInt5311 = local59.anInt5310 = local59.anInt5315 = 0;
				if (arg0) {
					local59.method4233();
				}
				for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
					local59.method4231();
				}
			}
			local30 = arg2.method5986(local59);
			if (local30 != null) {
				this.aClass230_4.aClass188_52.method4155(local22, local30);
			}
			return local30;
		} else {
			return null;
		}
	}
}
