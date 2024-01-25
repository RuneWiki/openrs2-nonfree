import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class78 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	public int anInt2265;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!fi;")
	public Class78 aClass78_1;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public int anInt2266;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	public int anInt2268;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	public int anInt2269;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	public int anInt2272;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public int anInt2274;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	public int anInt2277;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
	public int anInt2279;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "B")
	public final byte aByte17;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
	public final int anInt2271;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
	public final int anInt2275;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public final int anInt2278;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	private final int anInt2273;

	static {
		new Class182("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIB)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte17 = arg4;
		this.anInt2271 = arg3;
		this.anInt2275 = arg2;
		this.anInt2278 = arg1;
		this.anInt2273 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!fi;I)V")
	public Class78(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1) {
		this.aClass78_1 = arg0;
		this.anInt2278 = arg1 + this.aClass78_1.anInt2278;
		this.aByte17 = this.aClass78_1.aByte17;
		this.anInt2271 = arg1 + this.aClass78_1.anInt2271;
		this.anInt2275 = this.aClass78_1.anInt2275 + arg1;
		this.anInt2273 = this.aClass78_1.anInt2273;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Lclient!eq;")
	public Class70 method1971() {
		return Static24.method326(this.anInt2273);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)Lclient!fi;")
	public Class78 method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class78(this.anInt2273, arg0, arg2, arg1, this.aByte17);
	}
}
