import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class Class28_Sub1_Sub2 extends Class28_Sub1 {

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "S")
	public short aShort38;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "S")
	public short aShort37;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class28_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.aByte174 = (byte) arg3;
		super.aByte173 = (byte) arg4;
		this.aShort38 = (short) arg6;
		super.anInt10722 = arg1;
		super.anInt10729 = arg0;
		super.anInt10731 = arg2;
		this.aShort37 = (short) arg5;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	@Override
	public final void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "(I)Z")
	@Override
	public final boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9295(@OriginalArg(1) Class13 arg0) {
		return Static398.method5613(this.method9296(), super.anInt10731 >> Static391.anInt10262, super.anInt10729 >> Static391.anInt10262, super.aByte173);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B[Lclient!uca;)I")
	@Override
	public final int method9298(@OriginalArg(1) Class3_Sub15[] arg0) {
		return this.method9279(super.anInt10731 >> Static391.anInt10262, arg0, super.anInt10729 >> Static391.anInt10262);
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "(I)V")
	@Override
	public final void method9285() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9280() {
		return Static430.aBooleanArrayArray7[Static7.anInt94 + (super.anInt10729 >> Static391.anInt10262) - Static220.anInt4183][(super.anInt10731 >> Static391.anInt10262) + Static7.anInt94 - Static547.anInt8968];
	}
}
