import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class2_Sub6_Sub11 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
	private int anInt2346;

	static {
		new Class221("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub11() {
		this(4096);
	}

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub11(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2346 = 4096;
		this.anInt2346 = arg0;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			Static406.method5655(local9, 0, Static151.anInt2711, this.anInt2346);
		}
		return local9;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2346 = (arg0.method4240() << 12) / 255;
		}
	}
}
