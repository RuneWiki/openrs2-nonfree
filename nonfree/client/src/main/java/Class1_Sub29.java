import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public abstract class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_273;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_118;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "[I")
	public static final int[] anIntArray537;

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
	public static final int[] anIntArray536;

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
	protected int anInt7210;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	protected int anInt7202;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	private final int anInt7207;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	private final int anInt7199;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "F")
	protected float aFloat90;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	protected int anInt7209;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray4[local4] = new Rectangle();
		}
		aClass67_273 = new Class67(19, 20);
		aClass142_118 = new Class142("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
		new Class142("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
		anIntArray537 = new int[16384];
		anIntArray536 = new int[16384];
		@Pc(43) double local43 = 3.834951969714103E-4D;
		for (@Pc(45) int local45 = 0; local45 < 16384; local45++) {
			anIntArray537[local45] = (int) (Math.sin((double) local45 * local43) * 32768.0D);
			anIntArray536[local45] = (int) (Math.cos((double) local45 * local43) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.anInt7210 = arg0;
		this.anInt7202 = arg2;
		this.anInt7207 = arg3;
		this.anInt7199 = arg4;
		this.aFloat90 = arg5;
		this.anInt7209 = arg1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	public final int method5834() {
		return this.anInt7209;
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "(I)I")
	public final int method5836() {
		return this.anInt7199;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)I")
	public final int method5837() {
		return this.anInt7210;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)I")
	public final int method5838() {
		return this.anInt7202;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)V")
	public abstract void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)I")
	public final int method5840() {
		return this.anInt7207;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)F")
	public final float method5841() {
		return this.aFloat90;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(FI)V")
	public abstract void method5842(@OriginalArg(0) float arg0);
}
