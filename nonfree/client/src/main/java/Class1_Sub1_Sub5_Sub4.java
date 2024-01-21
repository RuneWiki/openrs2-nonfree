import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public abstract class Class1_Sub1_Sub5_Sub4 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "[[I")
	protected int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "[I")
	protected int[] anIntArray99;

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "[I")
	protected int[] anIntArray100;

	@OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
	protected int anInt1527;

	@OriginalMember(owner = "client!rg", name = "fb", descriptor = "[[I")
	protected int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
	protected int anInt1528;

	@OriginalMember(owner = "client!rg", name = "jb", descriptor = "I")
	protected int anInt1530;

	@OriginalMember(owner = "client!rg", name = "lb", descriptor = "[I")
	protected int[] anIntArray103;

	@OriginalMember(owner = "client!rg", name = "mb", descriptor = "I")
	private int anInt1531;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	protected int anInt1532;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
	protected int anInt1526 = 0;

	@OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
	protected int anInt1529 = 0;

	@OriginalMember(owner = "client!rg", name = "ob", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)Lclient!rg;")
	public abstract Class1_Sub1_Sub5_Sub4 method995(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public final void method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1529; local1++) {
			this.anIntArray99[local1] += arg0;
			this.anIntArray103[local1] += arg1;
			this.anIntArray100[local1] += arg2;
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()I")
	public final int method998() {
		this.method1008();
		return this.anInt1532;
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V")
	public final void method999(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static140.anIntArray102[arg0];
		@Pc(7) int local7 = Static140.anIntArray101[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1529; local9++) {
			@Pc(26) int local26 = this.anIntArray103[local9] * local7 - this.anIntArray100[local9] * local3 >> 16;
			this.anIntArray100[local9] = this.anIntArray103[local9] * local3 + this.anIntArray100[local9] * local7 >> 16;
			this.anIntArray103[local9] = local26;
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!t;I)V")
	public abstract void method1000(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([[IIIIZI)Lclient!rg;")
	public abstract Class1_Sub1_Sub5_Sub4 method1001(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!rg;)Lclient!rg;")
	public abstract Class1_Sub1_Sub5_Sub4 method1002(@OriginalArg(0) Class1_Sub1_Sub5_Sub4 arg0);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
	protected final void method1003() {
		if (this.anInt1528 == 2) {
			return;
		}
		this.anInt1528 = 2;
		this.anInt1532 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt1529; local12++) {
			@Pc(18) int local18 = this.anIntArray99[local12];
			@Pc(23) int local23 = this.anIntArray103[local12];
			@Pc(28) int local28 = this.anIntArray100[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt1532) {
				this.anInt1532 = local40;
			}
		}
		this.anInt1532 = (int) (Math.sqrt((double) this.anInt1532) + 0.99D);
		this.anInt1530 = this.anInt1532;
		this.anInt1527 = this.anInt1532 + this.anInt1532;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!t;ILclient!t;I[I)V")
	public abstract void method1004(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
	public final void method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1529; local1++) {
			this.anIntArray99[local1] = this.anIntArray99[local1] * arg0 / 128;
			this.anIntArray103[local1] = this.anIntArray103[local1] * arg1 / 128;
			this.anIntArray100[local1] = this.anIntArray100[local1] * arg2 / 128;
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "()V")
	public final void method1006() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1529; local1++) {
			@Pc(7) int local7 = this.anIntArray99[local1];
			this.anIntArray99[local1] = this.anIntArray100[local1];
			this.anIntArray100[local1] = -local7;
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "()V")
	public final void method1008() {
		if (this.anInt1528 == 1) {
			return;
		}
		this.anInt1528 = 1;
		super.anInt4233 = 0;
		this.anInt1531 = 0;
		this.anInt1532 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt1529; local18++) {
			@Pc(24) int local24 = this.anIntArray99[local18];
			@Pc(29) int local29 = this.anIntArray103[local18];
			@Pc(34) int local34 = this.anIntArray100[local18];
			if (-local29 > super.anInt4233) {
				super.anInt4233 = -local29;
			}
			if (local29 > this.anInt1531) {
				this.anInt1531 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt1532) {
				this.anInt1532 = local58;
			}
		}
		this.anInt1532 = (int) (Math.sqrt((double) this.anInt1532) + 0.99D);
		this.anInt1530 = (int) (Math.sqrt((double) (this.anInt1532 * this.anInt1532 + super.anInt4233 * super.anInt4233)) + 0.99D);
		this.anInt1527 = this.anInt1530 + (int) (Math.sqrt((double) (this.anInt1532 * this.anInt1532 + this.anInt1531 * this.anInt1531)) + 0.99D);
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "()V")
	public final void method1009() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1529; local1++) {
			this.anIntArray99[local1] = -this.anIntArray99[local1];
			this.anIntArray100[local1] = -this.anIntArray100[local1];
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "()V")
	public final void method1011() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1529; local1++) {
			@Pc(7) int local7 = this.anIntArray100[local1];
			this.anIntArray100[local1] = this.anIntArray99[local1];
			this.anIntArray99[local1] = -local7;
		}
		this.anInt1528 = 0;
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(Z)Lclient!rg;")
	public abstract Class1_Sub1_Sub5_Sub4 method1012(@OriginalArg(0) boolean arg0);
}
