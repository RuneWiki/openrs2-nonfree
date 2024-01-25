import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class Class13_Sub1_Sub2 extends Class13_Sub1 {

	@OriginalMember(owner = "client!c", name = "B", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIII)V")
	protected Class13_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort55 = (short) arg5;
		super.aByte127 = (byte) arg3;
		super.anInt10089 = arg2;
		super.anInt10090 = arg0;
		super.aByte126 = (byte) arg4;
		super.anInt10097 = arg1;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8406() {
		return Static223.method3048(super.anInt10089 >> Static609.anInt9827, super.anInt10090 >> Static609.anInt9827, super.aByte126);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Z")
	@Override
	public final boolean method8403() {
		return Static494.aBooleanArrayArray8[(super.anInt10090 >> Static609.anInt9827) + Static335.anInt5343 - Static566.anInt9234][(super.anInt10089 >> Static609.anInt9827) + Static335.anInt5343 - Static370.anInt5837];
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lclient!kb;)I")
	@Override
	public final int method8401(@OriginalArg(1) Class2_Sub24[] arg0) {
		return this.method8398(super.anInt10089 >> Static609.anInt9827, arg0, super.anInt10090 >> Static609.anInt9827);
	}
}
