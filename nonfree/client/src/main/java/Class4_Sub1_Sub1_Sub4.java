import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public abstract class Class4_Sub1_Sub1_Sub4 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "S")
	protected short aShort30;

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "[I")
	protected int[] anIntArray371;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "S")
	protected short aShort31;

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "S")
	protected short aShort32;

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "S")
	protected short aShort33;

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "S")
	protected short aShort34;

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "S")
	protected short aShort35;

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "[[I")
	protected int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "[[I")
	protected int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "S")
	protected short aShort36;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "[I")
	protected int[] anIntArray374;

	@OriginalMember(owner = "client!dg", name = "kb", descriptor = "[I")
	protected int[] anIntArray375;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "Z")
	protected boolean aBoolean147 = false;

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
	protected int anInt3722 = 0;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
	protected int anInt3726 = 0;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()V")
	public final void method2824() {
		if (this.aBoolean147) {
			return;
		}
		this.aBoolean147 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt3726; local24++) {
			@Pc(30) int local30 = this.anIntArray375[local24];
			@Pc(35) int local35 = this.anIntArray371[local24];
			@Pc(40) int local40 = this.anIntArray374[local24];
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
		this.aShort31 = (short) local8;
		this.aShort34 = (short) local14;
		super.aShort29 = (short) local10;
		this.aShort33 = (short) local16;
		this.aShort36 = (short) local12;
		this.aShort32 = (short) local18;
		this.aShort35 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort30 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([[IIIIZI)Lclient!dg;")
	public abstract Class4_Sub1_Sub1_Sub4 method2825(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	public final void method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3726; local1++) {
			this.anIntArray375[local1] = this.anIntArray375[local1] * arg0 / 128;
			this.anIntArray371[local1] = this.anIntArray371[local1] * arg1 / 128;
			this.anIntArray374[local1] = this.anIntArray374[local1] * arg2 / 128;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)Lclient!dg;")
	public abstract Class4_Sub1_Sub1_Sub4 method2828(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)V")
	public final void method2829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3726; local1++) {
			this.anIntArray375[local1] += arg0;
			this.anIntArray371[local1] += arg1;
			this.anIntArray374[local1] += arg2;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method2830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
	public final void method2831(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static34.anIntArray373[arg0];
		@Pc(7) int local7 = Static34.anIntArray372[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3726; local9++) {
			@Pc(26) int local26 = this.anIntArray371[local9] * local7 - this.anIntArray374[local9] * local3 >> 16;
			this.anIntArray374[local9] = this.anIntArray371[local9] * local3 + this.anIntArray374[local9] * local7 >> 16;
			this.anIntArray371[local9] = local26;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ef;I)V")
	public abstract void method2832(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)Lclient!dg;")
	public abstract Class4_Sub1_Sub1_Sub4 method2833(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
	public final int method2834() {
		this.method2824();
		return this.aShort35;
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)V")
	public final void method2835(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static34.anIntArray373[arg0];
		@Pc(7) int local7 = Static34.anIntArray372[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3726; local9++) {
			@Pc(26) int local26 = this.anIntArray371[local9] * local3 + this.anIntArray375[local9] * local7 >> 16;
			this.anIntArray371[local9] = this.anIntArray371[local9] * local7 - this.anIntArray375[local9] * local3 >> 16;
			this.anIntArray375[local9] = local26;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()V")
	public final void method2836() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3726; local1++) {
			this.anIntArray375[local1] = -this.anIntArray375[local1];
			this.anIntArray374[local1] = -this.anIntArray374[local1];
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ef;ILclient!ef;I[I)V")
	public abstract void method2837(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
	public final void method2838() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3726; local1++) {
			@Pc(7) int local7 = this.anIntArray374[local1];
			this.anIntArray374[local1] = this.anIntArray375[local1];
			this.anIntArray375[local1] = -local7;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "()V")
	public final void method2839() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3726; local1++) {
			@Pc(7) int local7 = this.anIntArray375[local1];
			this.anIntArray375[local1] = this.anIntArray374[local1];
			this.anIntArray374[local1] = -local7;
		}
		this.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);
}
