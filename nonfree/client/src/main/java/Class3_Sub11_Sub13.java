import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class3_Sub11_Sub13 extends Class3_Sub11 {

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	private int anInt10499;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "I")
	private int anInt10505;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	private int anInt10506;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	private int anInt10501 = -1;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt10501 = arg0.method5272();
		this.anInt10506 = arg0.method5312();
		this.anInt10505 = arg0.method5322(-7);
		this.anInt10499 = arg0.method5322(-53);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5846(this.anInt10501, this.anInt10506, this.anInt10505, this.anInt10499);
	}
}
