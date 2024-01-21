import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public abstract class Class3_Sub1_Sub5_Sub3 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!vf", name = "ab", descriptor = "S")
	protected short aShort15;

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "[[I")
	protected int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "S")
	protected short aShort16;

	@OriginalMember(owner = "client!vf", name = "eb", descriptor = "[I")
	protected int[] anIntArray240;

	@OriginalMember(owner = "client!vf", name = "fb", descriptor = "[[I")
	protected int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!vf", name = "hb", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!vf", name = "lb", descriptor = "S")
	protected short aShort18;

	@OriginalMember(owner = "client!vf", name = "ob", descriptor = "S")
	protected short aShort19;

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "[I")
	protected int[] anIntArray242;

	@OriginalMember(owner = "client!vf", name = "rb", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!vf", name = "sb", descriptor = "[I")
	protected int[] anIntArray243;

	@OriginalMember(owner = "client!vf", name = "tb", descriptor = "S")
	protected short aShort21;

	@OriginalMember(owner = "client!vf", name = "kb", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
	protected int anInt1937 = 0;

	@OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
	protected int anInt1935 = 0;

	@OriginalMember(owner = "client!vf", name = "pb", descriptor = "Z")
	protected boolean aBoolean76 = false;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)V")
	public final void method1369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1935; local1++) {
			this.anIntArray242[local1] = this.anIntArray242[local1] * arg0 / 128;
			this.anIntArray243[local1] = this.anIntArray243[local1] * arg1 / 128;
			this.anIntArray240[local1] = this.anIntArray240[local1] * arg2 / 128;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Lclient!vf;")
	public abstract Class3_Sub1_Sub5_Sub3 method1371(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	public final void method1373() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1935; local1++) {
			@Pc(7) int local7 = this.anIntArray240[local1];
			this.anIntArray240[local1] = this.anIntArray242[local1];
			this.anIntArray242[local1] = -local7;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
	public final void method1374() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1935; local1++) {
			@Pc(7) int local7 = this.anIntArray242[local1];
			this.anIntArray242[local1] = this.anIntArray240[local1];
			this.anIntArray240[local1] = -local7;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)Lclient!vf;")
	public abstract Class3_Sub1_Sub5_Sub3 method1375(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
	public final void method1376(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static189.anIntArray241[arg0];
		@Pc(7) int local7 = Static189.anIntArray239[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1935; local9++) {
			@Pc(26) int local26 = this.anIntArray243[local9] * local7 - this.anIntArray240[local9] * local3 >> 16;
			this.anIntArray240[local9] = this.anIntArray243[local9] * local3 + this.anIntArray240[local9] * local7 >> 16;
			this.anIntArray243[local9] = local26;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!e;ILclient!e;I[I)V")
	public abstract void method1377(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()I")
	public final int method1378() {
		this.method1385();
		return this.aShort15;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([[IIIIZI)Lclient!vf;")
	public abstract Class3_Sub1_Sub5_Sub3 method1379(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "()V")
	public final void method1380() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1935; local1++) {
			this.anIntArray242[local1] = -this.anIntArray242[local1];
			this.anIntArray240[local1] = -this.anIntArray240[local1];
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
	public final void method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1935; local1++) {
			this.anIntArray242[local1] += arg0;
			this.anIntArray243[local1] += arg1;
			this.anIntArray240[local1] += arg2;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!e;I)V")
	public abstract void method1383(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	public final void method1384(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static189.anIntArray241[arg0];
		@Pc(7) int local7 = Static189.anIntArray239[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1935; local9++) {
			@Pc(26) int local26 = this.anIntArray243[local9] * local3 + this.anIntArray242[local9] * local7 >> 16;
			this.anIntArray243[local9] = this.anIntArray243[local9] * local7 - this.anIntArray242[local9] * local3 >> 16;
			this.anIntArray242[local9] = local26;
		}
		this.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "()V")
	public final void method1385() {
		if (this.aBoolean76) {
			return;
		}
		this.aBoolean76 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1935; local24++) {
			@Pc(30) int local30 = this.anIntArray242[local24];
			@Pc(35) int local35 = this.anIntArray243[local24];
			@Pc(40) int local40 = this.anIntArray240[local24];
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
		this.aShort19 = (short) local8;
		this.aShort17 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort18 = (short) local16;
		this.aShort16 = (short) local12;
		this.aShort21 = (short) local18;
		this.aShort15 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort20 = (short) (Math.sqrt((double) local22) + 0.99D);
	}
}
