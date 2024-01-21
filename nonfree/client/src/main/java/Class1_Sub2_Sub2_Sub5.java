import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public abstract class Class1_Sub2_Sub2_Sub5 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "S")
	protected short aShort28;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "S")
	protected short aShort29;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "S")
	protected short aShort30;

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "S")
	protected short aShort31;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "S")
	protected short aShort32;

	@OriginalMember(owner = "client!ia", name = "lb", descriptor = "S")
	protected short aShort33;

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "[[I")
	protected int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "[I")
	protected int[] anIntArray394;

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "[[I")
	protected int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ia", name = "rb", descriptor = "S")
	protected short aShort34;

	@OriginalMember(owner = "client!ia", name = "sb", descriptor = "[I")
	protected int[] anIntArray396;

	@OriginalMember(owner = "client!ia", name = "ub", descriptor = "[I")
	protected int[] anIntArray397;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
	protected int anInt3750 = 0;

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	protected int anInt3747 = 0;

	@OriginalMember(owner = "client!ia", name = "qb", descriptor = "Z")
	public boolean aBoolean287 = false;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "Z")
	protected boolean aBoolean286 = false;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
	public final void method2711() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3747; local1++) {
			this.anIntArray397[local1] = -this.anIntArray397[local1];
			this.anIntArray396[local1] = -this.anIntArray396[local1];
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([[IIIIZI)Lclient!ia;")
	public abstract Class1_Sub2_Sub2_Sub5 method2712(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Lclient!ia;")
	public abstract Class1_Sub2_Sub2_Sub5 method2713(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
	public final void method2714() {
		if (this.aBoolean286) {
			return;
		}
		this.aBoolean286 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt3747; local24++) {
			@Pc(30) int local30 = this.anIntArray397[local24];
			@Pc(35) int local35 = this.anIntArray394[local24];
			@Pc(40) int local40 = this.anIntArray396[local24];
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
		this.aShort29 = (short) local8;
		this.aShort30 = (short) local14;
		super.aShort27 = (short) local10;
		this.aShort32 = (short) local16;
		this.aShort33 = (short) local12;
		this.aShort31 = (short) local18;
		this.aShort34 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort28 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public final void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3747; local1++) {
			this.anIntArray397[local1] += arg0;
			this.anIntArray394[local1] += arg1;
			this.anIntArray396[local1] += arg2;
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public final void method2716(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static72.anIntArray395[arg0];
		@Pc(7) int local7 = Static72.anIntArray393[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3747; local9++) {
			@Pc(26) int local26 = this.anIntArray394[local9] * local7 - this.anIntArray396[local9] * local3 >> 16;
			this.anIntArray396[local9] = this.anIntArray394[local9] * local3 + this.anIntArray396[local9] * local7 >> 16;
			this.anIntArray394[local9] = local26;
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "()I")
	public final int method2717() {
		this.method2714();
		return this.aShort34;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "()V")
	public final void method2718() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3747; local1++) {
			@Pc(7) int local7 = this.anIntArray397[local1];
			this.anIntArray397[local1] = this.anIntArray396[local1];
			this.anIntArray396[local1] = -local7;
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
	public final void method2719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3747; local1++) {
			this.anIntArray397[local1] = this.anIntArray397[local1] * arg0 / 128;
			this.anIntArray394[local1] = this.anIntArray394[local1] * arg1 / 128;
			this.anIntArray396[local1] = this.anIntArray396[local1] * arg2 / 128;
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!f;I)V")
	public abstract void method2720(@OriginalArg(0) Class1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lclient!ia;")
	public abstract Class1_Sub2_Sub2_Sub5 method2721(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!f;ILclient!f;I[I)V")
	public abstract void method2722(@OriginalArg(0) Class1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public final void method2724(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static72.anIntArray395[arg0];
		@Pc(7) int local7 = Static72.anIntArray393[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3747; local9++) {
			@Pc(26) int local26 = this.anIntArray394[local9] * local3 + this.anIntArray397[local9] * local7 >> 16;
			this.anIntArray394[local9] = this.anIntArray394[local9] * local7 - this.anIntArray397[local9] * local3 >> 16;
			this.anIntArray397[local9] = local26;
		}
		this.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method2725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "()V")
	public final void method2726() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3747; local1++) {
			@Pc(7) int local7 = this.anIntArray396[local1];
			this.anIntArray396[local1] = this.anIntArray397[local1];
			this.anIntArray397[local1] = -local7;
		}
		this.aBoolean286 = false;
	}
}
