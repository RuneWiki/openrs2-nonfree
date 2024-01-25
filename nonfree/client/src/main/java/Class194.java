import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class194 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public int anInt4888;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public int anInt4891;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!ik;")
	public Class122 aClass122_2;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Z")
	public boolean aBoolean356 = false;

	static {
		new Class15("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ya;BIZ)Lclient!l;")
	public Class95 method3883(@OriginalArg(0) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) (arg1 << 16 | this.anInt4888 | (arg2 ? 262144 : 0) | arg0.anInt6589 << 19);
		@Pc(38) Class95 local38 = (Class95) this.aClass122_2.aClass137_30.method2744(local24);
		if (local38 != null) {
			return local38;
		} else if (this.aClass122_2.aClass211_43.method4382(this.anInt4888)) {
			@Pc(60) Class216 local60 = Static465.method4465(this.aClass122_2.aClass211_43, this.anInt4888, 0);
			if (local60 != null) {
				local60.anInt5509 = local60.anInt5510 = local60.anInt5507 = local60.anInt5511 = 0;
				if (arg2) {
					local60.method4471();
				}
				for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
					local60.method4472();
				}
			}
			local38 = arg0.method5379(local60);
			if (local38 != null) {
				this.aClass122_2.aClass137_30.method2732(local24, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLclient!fh;)V")
	public void method3887(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5007();
			if (local13 == 0) {
				return;
			}
			this.method3889(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZLclient!fh;)V")
	private void method3889(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt4888 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt4891 = arg1.method5008();
		} else if (arg0 == 3) {
			this.aBoolean356 = true;
		} else if (arg0 == 4) {
			this.anInt4888 = -1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z")
	public boolean method3890() {
		return this.aClass122_2.aClass211_43.method4382(this.anInt4888);
	}
}
