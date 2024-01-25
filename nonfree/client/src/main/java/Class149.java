import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class149 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
	public static final int[] anIntArray323 = new int[32];

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!bp;")
	private Class6_Sub1 aClass6_Sub1_32 = new Class6_Sub1();

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!po;")
	private final Class202 aClass202_3 = new Class202();

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private final int anInt3817;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Lclient!ke;")
	private final Class137 aClass137_23;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray323[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
	public Class149(@OriginalArg(0) int arg0) {
		this.anInt3818 = arg0;
		this.anInt3817 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass137_23 = new Class137(local19);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method3401() {
		this.aClass202_3.method4473();
		this.aClass137_23.method3178();
		this.aClass6_Sub1_32 = new Class6_Sub1();
		this.anInt3818 = this.anInt3817;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ)Lclient!bp;")
	public Class6_Sub1 method3402(@OriginalArg(1) long arg0) {
		@Pc(16) Class6_Sub1 local16 = (Class6_Sub1) this.aClass137_23.method3175(arg0);
		if (local16 != null) {
			this.aClass202_3.method4472(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BJLclient!bp;)V")
	public void method3404(@OriginalArg(1) long arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (this.anInt3818 == 0) {
			@Pc(11) Class6_Sub1 local11 = this.aClass202_3.method4470();
			local11.method5977();
			local11.method5984();
			if (local11 == this.aClass6_Sub1_32) {
				local11 = this.aClass202_3.method4470();
				local11.method5977();
				local11.method5984();
			}
		} else {
			this.anInt3818--;
		}
		this.aClass137_23.method3179(arg0, arg1);
		this.aClass202_3.method4472(arg1);
	}
}
