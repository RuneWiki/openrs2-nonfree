import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class4_Sub6_Sub5 extends Class4_Sub6 {

	@OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
	private int anInt1235;

	static {
		new Class159("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	public Class4_Sub6_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1235 = 4096;
		this.anInt1235 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1235 = (arg1.method3440() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			Static359.method763(local9, 0, Static31.anInt797, this.anInt1235);
		}
		return local9;
	}
}
