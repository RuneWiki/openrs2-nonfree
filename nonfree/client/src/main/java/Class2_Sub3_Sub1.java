import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public abstract class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!as", name = "u", descriptor = "[I")
	public static final int[] anIntArray578 = new int[120];

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Lclient!gj;")
	public final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "I")
	public final int anInt8160;

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) (Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D + (double) local14);
			local7 += local27;
			anIntArray578[local9] = local7 / 4;
		}
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!gj;I)V")
	protected Class2_Sub3_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		this.anInterface8_3 = arg0;
		this.anInt8160 = arg1;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6757();

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
	public abstract boolean method6758();
}
