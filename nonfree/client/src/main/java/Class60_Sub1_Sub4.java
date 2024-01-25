import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public abstract class Class60_Sub1_Sub4 extends Class60_Sub1 {

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIII)V")
	public Class60_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte134 = (byte) arg4;
		super.anInt9048 = arg0;
		super.aByte135 = (byte) arg3;
		super.anInt9057 = arg2;
		super.anInt9051 = arg1;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public final void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B[Lclient!ta;)I")
	@Override
	public final int method7923(@OriginalArg(1) Class6_Sub10[] arg0) {
		return this.method7910(super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440, arg0);
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method7912() {
		return Static488.aBooleanArrayArray4[Static382.anInt6636 + (super.anInt9048 >> Static594.anInt9440) - Static506.anInt8446][(super.anInt9057 >> Static594.anInt9440) - (Static676.anInt10368 - Static382.anInt6636)];
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V")
	@Override
	public final void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(Lclient!ha;B)Z")
	@Override
	public final boolean method7925(@OriginalArg(0) Class75 arg0) {
		@Pc(25) Class123 local25 = Static664.method8832(super.aByte135, super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440);
		return local25 != null && local25.aClass60_Sub1_Sub1_1.aBoolean637 ? Static484.method7210(super.aByte135, local25.aClass60_Sub1_Sub1_1.method7922() + this.method7922(), super.anInt9057 >> Static594.anInt9440, super.anInt9048 >> Static594.anInt9440) : Static240.method4227(super.aByte135, super.anInt9057 >> Static594.anInt9440, super.anInt9048 >> Static594.anInt9440);
	}

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "(I)Z")
	@Override
	public final boolean method7914() {
		return false;
	}
}
