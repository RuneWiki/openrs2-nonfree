import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class110 {

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!ok;")
	public Class190 aClass190_3;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt2706;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
	public boolean aBoolean195 = false;

	static {
		new Class231("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!qq;ZZI)Lclient!ig;")
	public Class12 method2477(@OriginalArg(0) Class28 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(31) long local31 = (long) (arg0.anInt3899 << 19 | (arg1 ? 262144 : 0) | this.anInt2706 | arg2 << 16);
		@Pc(39) Class12 local39 = (Class12) this.aClass190_3.aClass220_44.method4990(local31);
		if (local39 != null) {
			return local39;
		} else if (this.aClass190_3.aClass158_64.method3686(this.anInt2706)) {
			@Pc(61) Class77 local61 = Static455.method1703(this.aClass190_3.aClass158_64, this.anInt2706, 0);
			if (local61 != null) {
				local61.anInt1843 = local61.anInt1845 = local61.anInt1847 = local61.anInt1846 = 0;
				if (arg1) {
					local61.method1705();
				}
				for (@Pc(81) int local81 = 0; local81 < arg2; local81++) {
					local61.method1710();
				}
			}
			local39 = arg0.method3540(local61);
			if (local39 != null) {
				this.aClass190_3.aClass220_44.method4996(local39, local31);
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!ha;B)V")
	private void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt2706 = arg1.method3108();
		} else if (arg0 == 2) {
			this.anInt2708 = arg1.method3078();
		} else if (arg0 == 3) {
			this.aBoolean195 = true;
		} else if (arg0 == 4) {
			this.anInt2706 = -1;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!ha;)V")
	public void method2479(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method2478(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Z")
	public boolean method2481() {
		return this.aClass190_3.aClass158_64.method3686(this.anInt2706);
	}
}
