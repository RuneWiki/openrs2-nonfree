import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
	private int anInt7609;

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	private int anInt7614;

	@OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
	private int anInt7615;

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	private int anInt7616;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!oga;I)V")
	@Override
	public void method8329(@OriginalArg(0) Class267 arg0) {
		arg0.method5950(this.anInt7615, this.anInt7616, this.anInt7609, this.anInt7614);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!es;)V")
	@Override
	public void method8334(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt7614 = arg0.method8850();
		this.anInt7615 = arg0.method8850();
		this.anInt7616 = arg0.method8865();
		this.anInt7609 = arg0.method8865();
	}
}
