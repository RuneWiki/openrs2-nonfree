import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class Class60_Sub1_Sub5 extends Class60_Sub1 {

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class60_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9048 = arg0;
		super.aByte135 = (byte) arg3;
		super.anInt9057 = arg2;
		super.aByte134 = (byte) arg4;
		super.anInt9051 = arg1;
		this.aShort113 = (short) arg5;
		this.aShort112 = (short) arg6;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7912() {
		return Static488.aBooleanArrayArray4[(super.anInt9048 >> Static594.anInt9440) + Static382.anInt6636 - Static506.anInt8446][Static382.anInt6636 + (super.anInt9057 >> Static594.anInt9440) - Static676.anInt10368];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public final void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method7925(@OriginalArg(0) Class75 arg0) {
		return Static484.method7210(super.aByte134, this.method7922(), super.anInt9057 >> Static594.anInt9440, super.anInt9048 >> Static594.anInt9440);
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B[Lclient!ta;)I")
	@Override
	public final int method7923(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method7910(super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440, arg0);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
	@Override
	public final void method7917() {
		throw new IllegalStateException();
	}
}
