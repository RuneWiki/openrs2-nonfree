import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class2_Sub4_Sub1_Sub3 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!df", name = "Eb", descriptor = "[I")
	protected int[] anIntArray147;

	@OriginalMember(owner = "client!df", name = "Fb", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!df", name = "Gb", descriptor = "[[I")
	protected int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!df", name = "Lb", descriptor = "S")
	protected short aShort21;

	@OriginalMember(owner = "client!df", name = "Nb", descriptor = "[[I")
	protected int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!df", name = "Pb", descriptor = "[I")
	protected int[] anIntArray149;

	@OriginalMember(owner = "client!df", name = "Sb", descriptor = "S")
	protected short aShort22;

	@OriginalMember(owner = "client!df", name = "Tb", descriptor = "S")
	protected short aShort23;

	@OriginalMember(owner = "client!df", name = "Ub", descriptor = "S")
	protected short aShort24;

	@OriginalMember(owner = "client!df", name = "Wb", descriptor = "[I")
	protected int[] anIntArray151;

	@OriginalMember(owner = "client!df", name = "Xb", descriptor = "S")
	protected short aShort25;

	@OriginalMember(owner = "client!df", name = "Yb", descriptor = "S")
	protected short aShort26;

	@OriginalMember(owner = "client!df", name = "Kb", descriptor = "I")
	protected int anInt1776 = 0;

	@OriginalMember(owner = "client!df", name = "Hb", descriptor = "I")
	protected int anInt1775 = 0;

	@OriginalMember(owner = "client!df", name = "Rb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!df", name = "Ib", descriptor = "Z")
	protected boolean aBoolean88 = false;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public final void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1776; local1++) {
			this.anIntArray147[local1] = this.anIntArray147[local1] * arg0 / 128;
			this.anIntArray151[local1] = this.anIntArray151[local1] * arg1 / 128;
			this.anIntArray149[local1] = this.anIntArray149[local1] * arg2 / 128;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public final void method1190() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1776; local1++) {
			@Pc(7) int local7 = this.anIntArray149[local1];
			this.anIntArray149[local1] = this.anIntArray147[local1];
			this.anIntArray147[local1] = -local7;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public final void method1191(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static37.anIntArray148[arg0];
		@Pc(7) int local7 = Static37.anIntArray150[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1776; local9++) {
			@Pc(26) int local26 = this.anIntArray151[local9] * local7 - this.anIntArray149[local9] * local3 >> 16;
			this.anIntArray149[local9] = this.anIntArray151[local9] * local3 + this.anIntArray149[local9] * local7 >> 16;
			this.anIntArray151[local9] = local26;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([[IIIIZI)Lclient!df;")
	public abstract Class2_Sub4_Sub1_Sub3 method1192(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	public final void method1193() {
		if (this.aBoolean88) {
			return;
		}
		this.aBoolean88 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1776; local24++) {
			@Pc(30) int local30 = this.anIntArray147[local24];
			@Pc(35) int local35 = this.anIntArray151[local24];
			@Pc(40) int local40 = this.anIntArray149[local24];
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
		this.aShort21 = (short) local8;
		this.aShort23 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort20 = (short) local16;
		this.aShort26 = (short) local12;
		this.aShort25 = (short) local18;
		this.aShort22 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort24 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(Z)Lclient!df;")
	public abstract Class2_Sub4_Sub1_Sub3 method1194(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	public final void method1195() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1776; local1++) {
			@Pc(7) int local7 = this.anIntArray147[local1];
			this.anIntArray147[local1] = this.anIntArray149[local1];
			this.anIntArray149[local1] = -local7;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!dc;I)V")
	public abstract void method1196(@OriginalArg(0) Class2_Sub4_Sub5 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public final void method1197() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1776; local1++) {
			this.anIntArray147[local1] = -this.anIntArray147[local1];
			this.anIntArray149[local1] = -this.anIntArray149[local1];
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!dc;ILclient!dc;I[I)V")
	public abstract void method1198(@OriginalArg(0) Class2_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub4_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public final void method1199(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static37.anIntArray148[arg0];
		@Pc(7) int local7 = Static37.anIntArray150[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1776; local9++) {
			@Pc(26) int local26 = this.anIntArray151[local9] * local3 + this.anIntArray147[local9] * local7 >> 16;
			this.anIntArray151[local9] = this.anIntArray151[local9] * local7 - this.anIntArray147[local9] * local3 >> 16;
			this.anIntArray147[local9] = local26;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
	public final void method1200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1776; local1++) {
			this.anIntArray147[local1] += arg0;
			this.anIntArray151[local1] += arg1;
			this.anIntArray149[local1] += arg2;
		}
		this.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(Z)Lclient!df;")
	public abstract Class2_Sub4_Sub1_Sub3 method1201(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
	public final int method1203() {
		this.method1193();
		return this.aShort22;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);
}
