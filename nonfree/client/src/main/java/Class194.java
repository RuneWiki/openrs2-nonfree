import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class194 {

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_29;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public final int anInt5999;

	static {
		new Class45("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
		aRectangleArray2 = new Rectangle[100];
		for (@Pc(31) int local31 = 0; local31 < 100; local31++) {
			aRectangleArray2[local31] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!mh;II)V")
	public Class194(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub3_29 = arg0;
		this.anInt5999 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub3_29.method5248(this.anInt5999);
		super.finalize();
	}
}
