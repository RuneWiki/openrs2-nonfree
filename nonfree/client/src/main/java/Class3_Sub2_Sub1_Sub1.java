import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public abstract class Class3_Sub2_Sub1_Sub1 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "S")
	protected short aShort11;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "S")
	protected short aShort12;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
	protected int[] anIntArray54;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "[[I")
	protected int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "[I")
	protected int[] anIntArray55;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "S")
	protected short aShort13;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "S")
	protected short aShort14;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "S")
	protected short aShort15;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "S")
	protected short aShort16;

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "[I")
	protected int[] anIntArray56;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "[[I")
	protected int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!d", name = "pb", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
	protected int anInt216 = 0;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
	protected int anInt215 = 0;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "Z")
	protected boolean aBoolean15 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ma;ILclient!ma;I[I)V")
	public abstract void method188(@OriginalArg(0) Class3_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public final void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt215; local1++) {
			this.anIntArray54[local1] += arg0;
			this.anIntArray56[local1] += arg1;
			this.anIntArray55[local1] += arg2;
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public final void method190() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt215; local1++) {
			@Pc(7) int local7 = this.anIntArray54[local1];
			this.anIntArray54[local1] = this.anIntArray55[local1];
			this.anIntArray55[local1] = -local7;
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
	public final void method191() {
		if (this.aBoolean15) {
			return;
		}
		this.aBoolean15 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt215; local24++) {
			@Pc(30) int local30 = this.anIntArray54[local24];
			@Pc(35) int local35 = this.anIntArray56[local24];
			@Pc(40) int local40 = this.anIntArray55[local24];
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
		this.aShort14 = (short) local8;
		this.aShort15 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort13 = (short) local16;
		this.aShort16 = (short) local12;
		this.aShort12 = (short) local18;
		this.aShort11 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort17 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)Lclient!d;")
	public abstract Class3_Sub2_Sub1_Sub1 method194(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([[IIIIZI)Lclient!d;")
	public abstract Class3_Sub2_Sub1_Sub1 method195(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ma;I)V")
	public abstract void method196(@OriginalArg(0) Class3_Sub2_Sub13 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	public final void method197(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static25.anIntArray53[arg0];
		@Pc(7) int local7 = Static25.anIntArray52[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt215; local9++) {
			@Pc(26) int local26 = this.anIntArray56[local9] * local3 + this.anIntArray54[local9] * local7 >> 16;
			this.anIntArray56[local9] = this.anIntArray56[local9] * local7 - this.anIntArray54[local9] * local3 >> 16;
			this.anIntArray54[local9] = local26;
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)Lclient!d;")
	public abstract Class3_Sub2_Sub1_Sub1 method199(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()I")
	public final int method200() {
		this.method191();
		return this.aShort11;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()V")
	public final void method201() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt215; local1++) {
			this.anIntArray54[local1] = -this.anIntArray54[local1];
			this.anIntArray55[local1] = -this.anIntArray55[local1];
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
	public final void method202(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static25.anIntArray53[arg0];
		@Pc(7) int local7 = Static25.anIntArray52[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt215; local9++) {
			@Pc(26) int local26 = this.anIntArray56[local9] * local7 - this.anIntArray55[local9] * local3 >> 16;
			this.anIntArray55[local9] = this.anIntArray56[local9] * local3 + this.anIntArray55[local9] * local7 >> 16;
			this.anIntArray56[local9] = local26;
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(III)V")
	public final void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt215; local1++) {
			this.anIntArray54[local1] = this.anIntArray54[local1] * arg0 / 128;
			this.anIntArray56[local1] = this.anIntArray56[local1] * arg1 / 128;
			this.anIntArray55[local1] = this.anIntArray55[local1] * arg2 / 128;
		}
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()V")
	public final void method204() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt215; local1++) {
			@Pc(7) int local7 = this.anIntArray55[local1];
			this.anIntArray55[local1] = this.anIntArray54[local1];
			this.anIntArray54[local1] = -local7;
		}
		this.aBoolean15 = false;
	}
}
