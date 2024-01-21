import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public abstract class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!w", name = "Z", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!w", name = "bb", descriptor = "[I")
	protected int[] anIntArray191;

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "S")
	protected short aShort18;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "[[I")
	protected int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!w", name = "hb", descriptor = "S")
	protected short aShort19;

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "[[I")
	protected int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!w", name = "kb", descriptor = "[I")
	protected int[] anIntArray193;

	@OriginalMember(owner = "client!w", name = "mb", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!w", name = "ob", descriptor = "[I")
	protected int[] anIntArray195;

	@OriginalMember(owner = "client!w", name = "pb", descriptor = "S")
	protected short aShort21;

	@OriginalMember(owner = "client!w", name = "sb", descriptor = "S")
	protected short aShort22;

	@OriginalMember(owner = "client!w", name = "tb", descriptor = "S")
	protected short aShort23;

	@OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
	protected int anInt1623 = 0;

	@OriginalMember(owner = "client!w", name = "ab", descriptor = "Z")
	protected boolean aBoolean78 = false;

	@OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
	protected int anInt1622 = 0;

	@OriginalMember(owner = "client!w", name = "lb", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	public final void method1070() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1623; local1++) {
			this.anIntArray195[local1] = -this.anIntArray195[local1];
			this.anIntArray191[local1] = -this.anIntArray191[local1];
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([[IIIIZI)Lclient!w;")
	public abstract Class1_Sub1_Sub1_Sub2 method1072(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
	public final void method1073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1623; local1++) {
			this.anIntArray195[local1] += arg0;
			this.anIntArray193[local1] += arg1;
			this.anIntArray191[local1] += arg2;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	public final void method1074() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1623; local1++) {
			@Pc(7) int local7 = this.anIntArray195[local1];
			this.anIntArray195[local1] = this.anIntArray191[local1];
			this.anIntArray191[local1] = -local7;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)Lclient!w;")
	public abstract Class1_Sub1_Sub1_Sub2 method1076(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!la;I)V")
	public abstract void method1077(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
	public final void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1623; local1++) {
			this.anIntArray195[local1] = this.anIntArray195[local1] * arg0 / 128;
			this.anIntArray193[local1] = this.anIntArray193[local1] * arg1 / 128;
			this.anIntArray191[local1] = this.anIntArray191[local1] * arg2 / 128;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "(I)V")
	public final void method1079(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static175.anIntArray194[arg0];
		@Pc(7) int local7 = Static175.anIntArray192[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1623; local9++) {
			@Pc(26) int local26 = this.anIntArray193[local9] * local7 - this.anIntArray191[local9] * local3 >> 16;
			this.anIntArray191[local9] = this.anIntArray193[local9] * local3 + this.anIntArray191[local9] * local7 >> 16;
			this.anIntArray193[local9] = local26;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()I")
	public final int method1080() {
		this.method1085();
		return this.aShort17;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "()V")
	public final void method1081() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1623; local1++) {
			@Pc(7) int local7 = this.anIntArray191[local1];
			this.anIntArray191[local1] = this.anIntArray195[local1];
			this.anIntArray195[local1] = -local7;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)Lclient!w;")
	public abstract Class1_Sub1_Sub1_Sub2 method1083(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!w", name = "j", descriptor = "(I)V")
	public final void method1084(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static175.anIntArray194[arg0];
		@Pc(7) int local7 = Static175.anIntArray192[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1623; local9++) {
			@Pc(26) int local26 = this.anIntArray193[local9] * local3 + this.anIntArray195[local9] * local7 >> 16;
			this.anIntArray193[local9] = this.anIntArray193[local9] * local7 - this.anIntArray195[local9] * local3 >> 16;
			this.anIntArray195[local9] = local26;
		}
		this.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "()V")
	public final void method1085() {
		if (this.aBoolean78) {
			return;
		}
		this.aBoolean78 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1623; local24++) {
			@Pc(30) int local30 = this.anIntArray195[local24];
			@Pc(35) int local35 = this.anIntArray193[local24];
			@Pc(40) int local40 = this.anIntArray191[local24];
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
		this.aShort22 = (short) local8;
		this.aShort21 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort23 = (short) local16;
		this.aShort20 = (short) local12;
		this.aShort19 = (short) local18;
		this.aShort17 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort18 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!la;ILclient!la;I[I)V")
	public abstract void method1086(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);
}
