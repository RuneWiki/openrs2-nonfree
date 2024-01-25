import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public abstract class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "[I")
	public static final int[] anIntArray319 = new int[120];

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Lclient!ck;")
	protected final Class65_Sub1 aClass65_Sub1_14;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray319[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class5_Sub34(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILclient!gha;ZLclient!gha;)V")
	public abstract void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub2 arg1, @OriginalArg(3) Class80_Sub2 arg2);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z")
	public final boolean method4736() {
		return this.aBoolean499;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
	public abstract boolean method4737();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	public abstract void method4738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
	public abstract void method4739(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
	public abstract void method4740();

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)I")
	public int method4741() {
		return 0;
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Z")
	public final boolean method4742() {
		return false;
	}

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)Z")
	public abstract boolean method4743();

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)I")
	public final int method4747() {
		return 1;
	}
}
