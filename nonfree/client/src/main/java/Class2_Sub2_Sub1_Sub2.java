import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class2_Sub2_Sub1_Sub2 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "[[I")
	protected int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "S")
	protected short aShort12;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "[I")
	protected int[] anIntArray108;

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "S")
	protected short aShort13;

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "[[I")
	protected int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "S")
	protected short aShort14;

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "S")
	protected short aShort15;

	@OriginalMember(owner = "client!cd", name = "yb", descriptor = "[I")
	protected int[] anIntArray112;

	@OriginalMember(owner = "client!cd", name = "Ab", descriptor = "[I")
	protected int[] anIntArray113;

	@OriginalMember(owner = "client!cd", name = "Cb", descriptor = "S")
	protected short aShort16;

	@OriginalMember(owner = "client!cd", name = "Db", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!cd", name = "Fb", descriptor = "S")
	protected short aShort18;

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "Z")
	protected boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
	protected int anInt859 = 0;

	@OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
	protected int anInt861 = 0;

	@OriginalMember(owner = "client!cd", name = "Eb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)Lclient!cd;")
	public abstract Class2_Sub2_Sub1_Sub2 method582(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
	public final void method584(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static22.anIntArray110[arg0];
		@Pc(7) int local7 = Static22.anIntArray109[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt861; local9++) {
			@Pc(26) int local26 = this.anIntArray113[local9] * local7 - this.anIntArray112[local9] * local3 >> 16;
			this.anIntArray112[local9] = this.anIntArray113[local9] * local3 + this.anIntArray112[local9] * local7 >> 16;
			this.anIntArray113[local9] = local26;
		}
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public final void method585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt861; local1++) {
			this.anIntArray108[local1] += arg0;
			this.anIntArray113[local1] += arg1;
			this.anIntArray112[local1] += arg2;
		}
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	public final void method586() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt861; local1++) {
			@Pc(7) int local7 = this.anIntArray108[local1];
			this.anIntArray108[local1] = this.anIntArray112[local1];
			this.anIntArray112[local1] = -local7;
		}
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)Lclient!cd;")
	public abstract Class2_Sub2_Sub1_Sub2 method587(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
	public final void method589() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt861; local1++) {
			@Pc(7) int local7 = this.anIntArray112[local1];
			this.anIntArray112[local1] = this.anIntArray108[local1];
			this.anIntArray108[local1] = -local7;
		}
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!kf;I)V")
	public abstract void method590(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
	public final void method592() {
		if (this.aBoolean45) {
			return;
		}
		this.aBoolean45 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt861; local24++) {
			@Pc(30) int local30 = this.anIntArray108[local24];
			@Pc(35) int local35 = this.anIntArray113[local24];
			@Pc(40) int local40 = this.anIntArray112[local24];
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
		this.aShort17 = (short) local8;
		this.aShort13 = (short) local14;
		super.aShort32 = (short) local10;
		this.aShort15 = (short) local16;
		this.aShort12 = (short) local12;
		this.aShort14 = (short) local18;
		this.aShort18 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort16 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[IIIIZI)Lclient!cd;")
	public abstract Class2_Sub2_Sub1_Sub2 method593(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
	public final void method594() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt861; local1++) {
			this.anIntArray108[local1] = -this.anIntArray108[local1];
			this.anIntArray112[local1] = -this.anIntArray112[local1];
		}
		this.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "()I")
	public final int method595() {
		this.method592();
		return this.aShort18;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!kf;ILclient!kf;I[I)V")
	public abstract void method596(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
	public final void method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt861; local1++) {
			this.anIntArray108[local1] = this.anIntArray108[local1] * arg0 / 128;
			this.anIntArray113[local1] = this.anIntArray113[local1] * arg1 / 128;
			this.anIntArray112[local1] = this.anIntArray112[local1] * arg2 / 128;
		}
		this.aBoolean45 = false;
	}
}
