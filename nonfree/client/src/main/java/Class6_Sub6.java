import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	private final int anInt1294;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "F")
	protected float aFloat35;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private final int anInt1291;

	@OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
	protected int anInt1302;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
	protected int anInt1295;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	protected int anInt1297;

	static {
		new Class231("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIF)V")
	public Class6_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt1294 = arg4;
		this.aFloat35 = arg5;
		this.anInt1291 = arg3;
		this.anInt1302 = arg2;
		this.anInt1295 = arg0;
		this.anInt1297 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	public final int method1162() {
		return this.anInt1291;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)I")
	public final int method1163() {
		return this.anInt1295;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZF)V")
	public abstract void method1165(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)F")
	public final float method1166() {
		return this.aFloat35;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	public final int method1169() {
		return this.anInt1302;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I")
	public final int method1170() {
		return this.anInt1297;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
	public abstract void method1171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)I")
	public final int method1172() {
		return this.anInt1294;
	}
}
