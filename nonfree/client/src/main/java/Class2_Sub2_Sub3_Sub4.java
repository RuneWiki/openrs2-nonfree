import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public abstract class Class2_Sub2_Sub3_Sub4 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "[I")
	protected int[] anIntArray132;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "S")
	protected short aShort14;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "[I")
	protected int[] anIntArray133;

	@OriginalMember(owner = "client!ue", name = "eb", descriptor = "[[I")
	protected int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
	protected int[] anIntArray134;

	@OriginalMember(owner = "client!ue", name = "ib", descriptor = "S")
	protected short aShort15;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "S")
	protected short aShort16;

	@OriginalMember(owner = "client!ue", name = "lb", descriptor = "[[I")
	protected int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ue", name = "pb", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!ue", name = "rb", descriptor = "S")
	protected short aShort18;

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "S")
	protected short aShort19;

	@OriginalMember(owner = "client!ue", name = "tb", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!ue", name = "mb", descriptor = "I")
	protected int anInt1306 = 0;

	@OriginalMember(owner = "client!ue", name = "qb", descriptor = "Z")
	protected boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
	protected int anInt1305 = 0;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)Lclient!ue;")
	public abstract Class2_Sub2_Sub3_Sub4 method1041(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public final void method1042() {
		if (this.aBoolean54) {
			return;
		}
		this.aBoolean54 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1306; local24++) {
			@Pc(30) int local30 = this.anIntArray134[local24];
			@Pc(35) int local35 = this.anIntArray132[local24];
			@Pc(40) int local40 = this.anIntArray133[local24];
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
		this.aShort20 = (short) local8;
		this.aShort14 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort19 = (short) local16;
		this.aShort16 = (short) local12;
		this.aShort15 = (short) local18;
		this.aShort18 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort17 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public final void method1043(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static166.anIntArray131[arg0];
		@Pc(7) int local7 = Static166.anIntArray135[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1306; local9++) {
			@Pc(26) int local26 = this.anIntArray132[local9] * local7 - this.anIntArray133[local9] * local3 >> 16;
			this.anIntArray133[local9] = this.anIntArray132[local9] * local3 + this.anIntArray133[local9] * local7 >> 16;
			this.anIntArray132[local9] = local26;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public final void method1044(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static166.anIntArray131[arg0];
		@Pc(7) int local7 = Static166.anIntArray135[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1306; local9++) {
			@Pc(26) int local26 = this.anIntArray132[local9] * local3 + this.anIntArray134[local9] * local7 >> 16;
			this.anIntArray132[local9] = this.anIntArray132[local9] * local7 - this.anIntArray134[local9] * local3 >> 16;
			this.anIntArray134[local9] = local26;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)Lclient!ue;")
	public abstract Class2_Sub2_Sub3_Sub4 method1045(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public final void method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1306; local1++) {
			this.anIntArray134[local1] += arg0;
			this.anIntArray132[local1] += arg1;
			this.anIntArray133[local1] += arg2;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public final void method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1306; local1++) {
			this.anIntArray134[local1] = this.anIntArray134[local1] * arg0 / 128;
			this.anIntArray132[local1] = this.anIntArray132[local1] * arg1 / 128;
			this.anIntArray133[local1] = this.anIntArray133[local1] * arg2 / 128;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()I")
	public final int method1049() {
		this.method1042();
		return this.aShort18;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
	public final void method1050() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1306; local1++) {
			this.anIntArray134[local1] = -this.anIntArray134[local1];
			this.anIntArray133[local1] = -this.anIntArray133[local1];
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
	public final void method1051() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1306; local1++) {
			@Pc(7) int local7 = this.anIntArray133[local1];
			this.anIntArray133[local1] = this.anIntArray134[local1];
			this.anIntArray134[local1] = -local7;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIIIIII)V")
	public abstract void method1052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	public final void method1053() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1306; local1++) {
			@Pc(7) int local7 = this.anIntArray134[local1];
			this.anIntArray134[local1] = this.anIntArray133[local1];
			this.anIntArray133[local1] = -local7;
		}
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!td;ILclient!td;I[I)V")
	public abstract void method1054(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!td;I)V")
	public abstract void method1056(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([[IIIIZI)Lclient!ue;")
	public abstract Class2_Sub2_Sub3_Sub4 method1057(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);
}
