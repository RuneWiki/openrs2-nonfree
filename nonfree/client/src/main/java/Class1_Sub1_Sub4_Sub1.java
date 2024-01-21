import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!je", name = "U", descriptor = "S")
	protected short aShort11;

	@OriginalMember(owner = "client!je", name = "W", descriptor = "[[I")
	protected int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "S")
	protected short aShort12;

	@OriginalMember(owner = "client!je", name = "Y", descriptor = "[I")
	protected int[] anIntArray66;

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "[I")
	protected int[] anIntArray67;

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "S")
	protected short aShort13;

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "S")
	protected short aShort14;

	@OriginalMember(owner = "client!je", name = "fb", descriptor = "S")
	protected short aShort15;

	@OriginalMember(owner = "client!je", name = "gb", descriptor = "[I")
	protected int[] anIntArray68;

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "S")
	protected short aShort16;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "[[I")
	protected int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!je", name = "nb", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
	protected int anInt915 = 0;

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!je", name = "db", descriptor = "Z")
	protected boolean aBoolean36 = false;

	@OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
	protected int anInt917 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!j;I)V")
	public abstract void method718(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
	public final void method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt915; local1++) {
			this.anIntArray67[local1] = this.anIntArray67[local1] * arg0 / 128;
			this.anIntArray66[local1] = this.anIntArray66[local1] * arg1 / 128;
			this.anIntArray68[local1] = this.anIntArray68[local1] * arg2 / 128;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public final void method720(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static84.anIntArray70[arg0];
		@Pc(7) int local7 = Static84.anIntArray69[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt915; local9++) {
			@Pc(26) int local26 = this.anIntArray66[local9] * local7 - this.anIntArray68[local9] * local3 >> 16;
			this.anIntArray68[local9] = this.anIntArray66[local9] * local3 + this.anIntArray68[local9] * local7 >> 16;
			this.anIntArray66[local9] = local26;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	public final void method723() {
		if (this.aBoolean36) {
			return;
		}
		this.aBoolean36 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt915; local24++) {
			@Pc(30) int local30 = this.anIntArray67[local24];
			@Pc(35) int local35 = this.anIntArray66[local24];
			@Pc(40) int local40 = this.anIntArray68[local24];
			if (local30 < local8) {
				local8 = local30;
			}
			if (local30 > local14) {
				local14 = local30;
			}
			if (local35 < local10) {
				local10 = local35;
			}
			if (local35 > local16) {
				local16 = local35;
			}
			if (local40 < local12) {
				local12 = local40;
			}
			if (local40 > local18) {
				local18 = local40;
			}
			@Pc(78) int local78 = local30 * local30 + local40 * local40;
			if (local78 > local20) {
				local20 = local78;
			}
			local78 = local30 * local30 + local40 * local40 + local35 * local35;
			if (local78 > local22) {
				local22 = local78;
			}
		}
		this.aShort15 = (short) local8;
		this.aShort11 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort13 = (short) local16;
		this.aShort14 = (short) local12;
		this.aShort17 = (short) local18;
		this.aShort16 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort12 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)Lclient!je;")
	public abstract Class1_Sub1_Sub4_Sub1 method724(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
	public final void method726() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt915; local1++) {
			@Pc(7) int local7 = this.anIntArray67[local1];
			this.anIntArray67[local1] = this.anIntArray68[local1];
			this.anIntArray68[local1] = -local7;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	public final void method727() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt915; local1++) {
			@Pc(7) int local7 = this.anIntArray68[local1];
			this.anIntArray68[local1] = this.anIntArray67[local1];
			this.anIntArray67[local1] = -local7;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(III)V")
	public final void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt915; local1++) {
			this.anIntArray67[local1] += arg0;
			this.anIntArray66[local1] += arg1;
			this.anIntArray68[local1] += arg2;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
	public final void method729(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static84.anIntArray70[arg0];
		@Pc(7) int local7 = Static84.anIntArray69[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt915; local9++) {
			@Pc(26) int local26 = this.anIntArray66[local9] * local3 + this.anIntArray67[local9] * local7 >> 16;
			this.anIntArray66[local9] = this.anIntArray66[local9] * local7 - this.anIntArray67[local9] * local3 >> 16;
			this.anIntArray67[local9] = local26;
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
	public final void method730() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt915; local1++) {
			this.anIntArray67[local1] = -this.anIntArray67[local1];
			this.anIntArray68[local1] = -this.anIntArray68[local1];
		}
		this.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([[IIIIZI)Lclient!je;")
	public abstract Class1_Sub1_Sub4_Sub1 method731(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!j;ILclient!j;I[I)V")
	public abstract void method732(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(Z)Lclient!je;")
	public abstract Class1_Sub1_Sub4_Sub1 method733(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()I")
	public final int method734() {
		this.method723();
		return this.aShort16;
	}
}
