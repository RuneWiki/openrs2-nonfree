import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public abstract class Class2_Sub1_Sub3_Sub3 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "[[I")
	protected int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "[[I")
	protected int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "[I")
	protected int[] anIntArray80;

	@OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
	protected int anInt1003;

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
	private int anInt1005;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
	protected int anInt1006;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
	protected int[] anIntArray83;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
	protected int anInt1007;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "[I")
	protected int[] anIntArray84;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
	protected int anInt1009;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
	protected int anInt1004 = 0;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
	protected int anInt1008 = 0;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Lclient!bh;")
	public abstract Class2_Sub1_Sub3_Sub3 method809(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!aa;ILclient!aa;I[I)V")
	public abstract void method810(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	public final void method811(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static17.anIntArray81[arg0];
		@Pc(7) int local7 = Static17.anIntArray82[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1008; local9++) {
			@Pc(26) int local26 = this.anIntArray80[local9] * local7 - this.anIntArray84[local9] * local3 >> 16;
			this.anIntArray84[local9] = this.anIntArray80[local9] * local3 + this.anIntArray84[local9] * local7 >> 16;
			this.anIntArray80[local9] = local26;
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	protected final void method813() {
		if (this.anInt1007 == 2) {
			return;
		}
		this.anInt1007 = 2;
		this.anInt1006 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1008; local12++) {
			@Pc(18) int local18 = this.anIntArray83[local12];
			@Pc(23) int local23 = this.anIntArray80[local12];
			@Pc(28) int local28 = this.anIntArray84[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1006) {
				this.anInt1006 = local40;
			}
		}
		this.anInt1006 = (int) (Math.sqrt((double) this.anInt1006) + 0.99D);
		this.anInt1009 = this.anInt1006;
		this.anInt1003 = this.anInt1006 + this.anInt1006;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([[IIIIZI)Lclient!bh;")
	public abstract Class2_Sub1_Sub3_Sub3 method814(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
	public final void method815() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1008; local1++) {
			@Pc(7) int local7 = this.anIntArray84[local1];
			this.anIntArray84[local1] = this.anIntArray83[local1];
			this.anIntArray83[local1] = -local7;
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!aa;I)V")
	public abstract void method816(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()V")
	public final void method817() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1008; local1++) {
			@Pc(7) int local7 = this.anIntArray83[local1];
			this.anIntArray83[local1] = this.anIntArray84[local1];
			this.anIntArray84[local1] = -local7;
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)Lclient!bh;")
	public abstract Class2_Sub1_Sub3_Sub3 method819(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "()V")
	public final void method820() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1008; local1++) {
			this.anIntArray83[local1] = -this.anIntArray83[local1];
			this.anIntArray84[local1] = -this.anIntArray84[local1];
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public final void method821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1008; local1++) {
			this.anIntArray83[local1] = this.anIntArray83[local1] * arg0 / 128;
			this.anIntArray80[local1] = this.anIntArray80[local1] * arg1 / 128;
			this.anIntArray84[local1] = this.anIntArray84[local1] * arg2 / 128;
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)V")
	public final void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1008; local1++) {
			this.anIntArray83[local1] += arg0;
			this.anIntArray80[local1] += arg1;
			this.anIntArray84[local1] += arg2;
		}
		this.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bh;)Lclient!bh;")
	public abstract Class2_Sub1_Sub3_Sub3 method824(@OriginalArg(0) Class2_Sub1_Sub3_Sub3 arg0);

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "()V")
	public final void method825() {
		if (this.anInt1007 == 1) {
			return;
		}
		this.anInt1007 = 1;
		super.anInt3614 = 0;
		this.anInt1005 = 0;
		this.anInt1006 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1008; local18++) {
			@Pc(24) int local24 = this.anIntArray83[local18];
			@Pc(29) int local29 = this.anIntArray80[local18];
			@Pc(34) int local34 = this.anIntArray84[local18];
			if (-local29 > super.anInt3614) {
				super.anInt3614 = -local29;
			}
			if (local29 > this.anInt1005) {
				this.anInt1005 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1006) {
				this.anInt1006 = local58;
			}
		}
		this.anInt1006 = (int) (Math.sqrt((double) this.anInt1006) + 0.99D);
		this.anInt1009 = (int) (Math.sqrt((double) (this.anInt1006 * this.anInt1006 + super.anInt3614 * super.anInt3614)) + 0.99D);
		this.anInt1003 = this.anInt1009 + (int) (Math.sqrt((double) (this.anInt1006 * this.anInt1006 + this.anInt1005 * this.anInt1005)) + 0.99D);
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "()I")
	public final int method826() {
		this.method825();
		return this.anInt1006;
	}
}
