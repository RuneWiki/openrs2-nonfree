import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class1_Sub3_Sub5_Sub1 extends Class1_Sub3_Sub5 {

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[16384];

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray19[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray18[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5072() {
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5070() {
		return this.anObject4;
	}
}
