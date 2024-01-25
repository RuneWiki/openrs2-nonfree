import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class Class4_Sub1_Sub5 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mha", name = "z", descriptor = "S")
	public short aShort106;

	@OriginalMember(owner = "client!mha", name = "A", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class4_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.anInt9805 = arg0;
		this.aShort106 = (short) arg6;
		super.anInt9797 = arg1;
		super.anInt9803 = arg2;
		this.aShort107 = (short) arg5;
		super.aByte138 = (byte) arg4;
		super.aByte139 = (byte) arg3;
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8343(@OriginalArg(1) Class100 arg0) {
		return Static662.method9083(super.anInt9803 >> Static314.anInt5377, super.anInt9805 >> Static314.anInt5377, super.aByte138, this.method8347());
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "([Lclient!ih;Z)I")
	@Override
	public final int method8349(@OriginalArg(0) Class5_Sub12[] arg0) {
		return this.method8346(arg0, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8352(@OriginalArg(0) int arg0) {
		if (arg0 >= -19) {
			this.method8354(true, -128, (Class100) null, 78, (Class4_Sub1) null, 57, -5);
		}
		return Static407.aBooleanArrayArray8[Static553.anInt8738 + (super.anInt9805 >> Static314.anInt5377) - Static220.anInt3838][(super.anInt9803 >> Static314.anInt5377) + Static553.anInt8738 - Static377.anInt6335];
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)V")
	@Override
	public final void method8351(@OriginalArg(0) byte arg0) {
		if (arg0 < -41) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!mha", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method8339() {
		return false;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	@Override
	public final void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 > -10) {
			Static362.method8358();
		}
		throw new IllegalStateException();
	}
}
