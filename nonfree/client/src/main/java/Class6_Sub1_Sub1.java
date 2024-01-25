import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public abstract class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!lfa", name = "v", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16384];

	@OriginalMember(owner = "client!lfa", name = "y", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[16384];

	@OriginalMember(owner = "client!lfa", name = "z", descriptor = "Lclient!rl;")
	public final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
	public final int anInt3433;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray16[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray15[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lclient!rl;I)V")
	protected Class6_Sub1_Sub1(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1) {
		this.anInterface18_3 = arg0;
		this.anInt3433 = arg1;
	}

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2975();

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)Z")
	public abstract boolean method2976();
}
