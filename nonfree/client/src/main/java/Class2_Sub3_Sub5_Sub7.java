import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public abstract class Class2_Sub3_Sub5_Sub7 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "S")
	protected short aShort26;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "S")
	protected short aShort27;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
	protected int[] anIntArray315;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "[[I")
	protected int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "S")
	protected short aShort28;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "S")
	protected short aShort29;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "S")
	protected short aShort30;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "S")
	protected short aShort31;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "[I")
	protected int[] anIntArray317;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "S")
	protected short aShort32;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "[I")
	protected int[] anIntArray319;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "[[I")
	protected int[][] anIntArrayArray63;

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
	protected int anInt3494 = 0;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	protected int anInt3495 = 0;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "Z")
	protected boolean aBoolean144 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public final void method2299() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3494; local1++) {
			this.anIntArray317[local1] = -this.anIntArray317[local1];
			this.anIntArray319[local1] = -this.anIntArray319[local1];
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method2300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	public final void method2301() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3494; local1++) {
			@Pc(7) int local7 = this.anIntArray319[local1];
			this.anIntArray319[local1] = this.anIntArray317[local1];
			this.anIntArray317[local1] = -local7;
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()I")
	public final int method2302() {
		this.method2312();
		return this.aShort29;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ud;I)V")
	public abstract void method2303(@OriginalArg(0) Class2_Sub3_Sub16 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	public final void method2304() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3494; local1++) {
			@Pc(7) int local7 = this.anIntArray317[local1];
			this.anIntArray317[local1] = this.anIntArray319[local1];
			this.anIntArray319[local1] = -local7;
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public final void method2305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3494; local1++) {
			this.anIntArray317[local1] += arg0;
			this.anIntArray315[local1] += arg1;
			this.anIntArray319[local1] += arg2;
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Lclient!sa;")
	public abstract Class2_Sub3_Sub5_Sub7 method2306(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)Lclient!sa;")
	public abstract Class2_Sub3_Sub5_Sub7 method2307(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	public final void method2308(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static147.anIntArray316[arg0];
		@Pc(7) int local7 = Static147.anIntArray318[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3494; local9++) {
			@Pc(26) int local26 = this.anIntArray315[local9] * local7 - this.anIntArray319[local9] * local3 >> 16;
			this.anIntArray319[local9] = this.anIntArray315[local9] * local3 + this.anIntArray319[local9] * local7 >> 16;
			this.anIntArray315[local9] = local26;
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
	public final void method2309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3494; local1++) {
			this.anIntArray317[local1] = this.anIntArray317[local1] * arg0 / 128;
			this.anIntArray315[local1] = this.anIntArray315[local1] * arg1 / 128;
			this.anIntArray319[local1] = this.anIntArray319[local1] * arg2 / 128;
		}
		this.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([[IIIIZI)Lclient!sa;")
	public abstract Class2_Sub3_Sub5_Sub7 method2310(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ud;ILclient!ud;I[I)V")
	public abstract void method2311(@OriginalArg(0) Class2_Sub3_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "()V")
	public final void method2312() {
		if (this.aBoolean144) {
			return;
		}
		this.aBoolean144 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt3494; local24++) {
			@Pc(30) int local30 = this.anIntArray317[local24];
			@Pc(35) int local35 = this.anIntArray315[local24];
			@Pc(40) int local40 = this.anIntArray319[local24];
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
		this.aShort26 = (short) local8;
		this.aShort27 = (short) local14;
		super.aShort25 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort31 = (short) local12;
		this.aShort32 = (short) local18;
		this.aShort29 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort28 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);
}
