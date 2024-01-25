import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class124 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "Lclient!wa;")
	private Class4_Sub4 aClass4_Sub4_27 = new Class4_Sub4();

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Lclient!se;")
	private final Class180 aClass180_7 = new Class180();

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
	private final int anInt3884;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "Lclient!dj;")
	private final Class43 aClass43_23;

	static {
		new Class159("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
	public Class124(@OriginalArg(0) int arg0) {
		this.anInt3885 = arg0;
		this.anInt3884 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass43_23 = new Class43(local19);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)Lclient!wa;")
	public Class4_Sub4 method3525(@OriginalArg(0) long arg0) {
		@Pc(16) Class4_Sub4 local16 = (Class4_Sub4) this.aClass43_23.method1273(arg0);
		if (local16 != null) {
			this.aClass180_7.method4840(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!wa;JZ)V")
	public void method3528(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3885 == 0) {
			@Pc(21) Class4_Sub4 local21 = this.aClass180_7.method4839();
			local21.method5687();
			local21.method5678();
			if (local21 == this.aClass4_Sub4_27) {
				local21 = this.aClass180_7.method4839();
				local21.method5687();
				local21.method5678();
			}
		} else {
			this.anInt3885--;
		}
		this.aClass43_23.method1276(arg0, arg1);
		this.aClass180_7.method4840(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method3529() {
		this.aClass180_7.method4841();
		this.aClass43_23.method1282();
		this.aClass4_Sub4_27 = new Class4_Sub4();
		this.anInt3885 = this.anInt3884;
	}
}
