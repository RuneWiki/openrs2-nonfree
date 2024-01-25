import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class6_Sub15_Sub10 extends Class6_Sub15 {

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	private int anInt9444;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	private int anInt9448;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	private int anInt9449;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
	private int anInt9450;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!hia;)V")
	@Override
	public void method8716(@OriginalArg(1) Class145 arg0) {
		arg0.method3158(this.anInt9449, this.anInt9448, this.anInt9450, this.anInt9444);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!gga;)V")
	@Override
	public void method8714(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt9450 = arg0.method8369();
		this.anInt9448 = arg0.method8369();
		this.anInt9444 = arg0.method8374();
		this.anInt9449 = arg0.method8374();
	}
}
