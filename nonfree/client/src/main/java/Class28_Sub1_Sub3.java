import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class Class28_Sub1_Sub3 extends Class28_Sub1 {

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V")
	protected Class28_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte173 = (byte) arg4;
		super.anInt10729 = arg0;
		super.aByte174 = (byte) arg3;
		this.aShort92 = (short) arg5;
		super.anInt10731 = arg2;
		super.anInt10722 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method9295(@OriginalArg(1) Class13 arg0) {
		return Static304.method4669(super.anInt10729 >> Static391.anInt10262, super.anInt10731 >> Static391.anInt10262, super.aByte173);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[Lclient!uca;)I")
	@Override
	public final int method9298(@OriginalArg(1) Class3_Sub15[] arg0) {
		return this.method9279(super.anInt10731 >> Static391.anInt10262, arg0, super.anInt10729 >> Static391.anInt10262);
	}

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method9280() {
		return Static430.aBooleanArrayArray7[(super.anInt10729 >> Static391.anInt10262) + Static7.anInt94 - Static220.anInt4183][Static7.anInt94 + (super.anInt10731 >> Static391.anInt10262) - Static547.anInt8968];
	}
}
