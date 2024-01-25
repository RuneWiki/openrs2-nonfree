import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public abstract class Class47_Sub5 extends Class47 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[16384];

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16384];

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public int anInt8487;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public int anInt8488;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public int anInt8486;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
	public final int anInt8494;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public final int anInt8492;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
	public int anInt8496;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	protected final int anInt8489;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray70[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray71[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class47_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8487 = arg5;
		this.anInt8488 = arg4;
		this.anInt8486 = arg0;
		this.anInt8494 = arg6;
		this.anInt8492 = arg3;
		this.anInt8496 = arg2;
		this.anInt8489 = arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public final void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)I")
	public abstract int method7171();

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)Z")
	@Override
	public final boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	@Override
	public final void method7162() {
		throw new IllegalStateException();
	}
}
