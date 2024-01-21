import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public abstract class Class3_Sub1_Sub4_Sub5 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
	protected int[] anIntArray245;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "S")
	protected short aShort22;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "S")
	protected short aShort23;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "[[I")
	protected int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "[I")
	protected int[] anIntArray247;

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "[[I")
	protected int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "S")
	protected short aShort24;

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "[I")
	protected int[] anIntArray248;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "S")
	protected short aShort25;

	@OriginalMember(owner = "client!o", name = "sb", descriptor = "S")
	protected short aShort26;

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "S")
	protected short aShort27;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "S")
	protected short aShort28;

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "Z")
	protected boolean aBoolean167 = false;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
	protected int anInt2426 = 0;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
	protected int anInt2428 = 0;

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public final void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2426; local1++) {
			this.anIntArray248[local1] += arg0;
			this.anIntArray247[local1] += arg1;
			this.anIntArray245[local1] += arg2;
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
	public final void method1880() {
		if (this.aBoolean167) {
			return;
		}
		this.aBoolean167 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt2426; local24++) {
			@Pc(30) int local30 = this.anIntArray248[local24];
			@Pc(35) int local35 = this.anIntArray247[local24];
			@Pc(40) int local40 = this.anIntArray245[local24];
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
		this.aShort27 = (short) local8;
		this.aShort26 = (short) local14;
		super.aShort32 = (short) local10;
		this.aShort28 = (short) local16;
		this.aShort22 = (short) local12;
		this.aShort23 = (short) local18;
		this.aShort25 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort24 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
	public final void method1882() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2426; local1++) {
			this.anIntArray248[local1] = -this.anIntArray248[local1];
			this.anIntArray245[local1] = -this.anIntArray245[local1];
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lclient!o;")
	public abstract Class3_Sub1_Sub4_Sub5 method1883(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!nc;ILclient!nc;I[I)V")
	public abstract void method1884(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
	public final void method1885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2426; local1++) {
			this.anIntArray248[local1] = this.anIntArray248[local1] * arg0 / 128;
			this.anIntArray247[local1] = this.anIntArray247[local1] * arg1 / 128;
			this.anIntArray245[local1] = this.anIntArray245[local1] * arg2 / 128;
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)Lclient!o;")
	public abstract Class3_Sub1_Sub4_Sub5 method1886(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!o", name = "k", descriptor = "(I)V")
	public final void method1887(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static114.anIntArray246[arg0];
		@Pc(7) int local7 = Static114.anIntArray249[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2426; local9++) {
			@Pc(26) int local26 = this.anIntArray247[local9] * local7 - this.anIntArray245[local9] * local3 >> 16;
			this.anIntArray245[local9] = this.anIntArray247[local9] * local3 + this.anIntArray245[local9] * local7 >> 16;
			this.anIntArray247[local9] = local26;
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([[IIIIZI)Lclient!o;")
	public abstract Class3_Sub1_Sub4_Sub5 method1888(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
	public final void method1890() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2426; local1++) {
			@Pc(7) int local7 = this.anIntArray245[local1];
			this.anIntArray245[local1] = this.anIntArray248[local1];
			this.anIntArray248[local1] = -local7;
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!nc;I)V")
	public abstract void method1891(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!o", name = "e", descriptor = "()V")
	public final void method1892() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2426; local1++) {
			@Pc(7) int local7 = this.anIntArray248[local1];
			this.anIntArray248[local1] = this.anIntArray245[local1];
			this.anIntArray245[local1] = -local7;
		}
		this.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "()I")
	public final int method1893() {
		this.method1880();
		return this.aShort25;
	}
}
