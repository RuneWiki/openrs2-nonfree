import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class3_Sub11_Sub4 extends Class3_Sub11 {

	@OriginalMember(owner = "client!dca", name = "t", descriptor = "B")
	private byte aByte31;

	@OriginalMember(owner = "client!dca", name = "s", descriptor = "Z")
	private boolean aBoolean132;

	@OriginalMember(owner = "client!dca", name = "v", descriptor = "B")
	private byte aByte32;

	@OriginalMember(owner = "client!dca", name = "w", descriptor = "B")
	private byte aByte33;

	@OriginalMember(owner = "client!dca", name = "r", descriptor = "B")
	private byte aByte34;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.aByte104 = this.aByte32;
		arg0.aByte105 = this.aByte34;
		arg0.aByte106 = this.aByte31;
		arg0.aBoolean549 = this.aBoolean132;
		arg0.aByte107 = this.aByte33;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aBoolean132 = arg0.method5322(-125) == 1;
		this.aByte31 = arg0.method5288();
		this.aByte34 = arg0.method5288();
		this.aByte33 = arg0.method5288();
		this.aByte32 = arg0.method5288();
	}
}
