import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public abstract class Class3_Sub2_Sub1_Sub2 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "S")
	protected short aShort17;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[[I")
	protected int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "S")
	protected short aShort18;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "S")
	protected short aShort19;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "S")
	protected short aShort21;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "S")
	protected short aShort22;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "[I")
	protected int[] anIntArray256;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "[I")
	protected int[] anIntArray257;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "[I")
	protected int[] anIntArray258;

	@OriginalMember(owner = "client!fd", name = "cb", descriptor = "[[I")
	protected int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!fd", name = "db", descriptor = "S")
	protected short aShort23;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "Z")
	protected boolean aBoolean109 = false;

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
	protected int anInt2604 = 0;

	@OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
	protected int anInt2606 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public final void method1785() {
		if (this.aBoolean109) {
			return;
		}
		this.aBoolean109 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt2604; local24++) {
			@Pc(30) int local30 = this.anIntArray257[local24];
			@Pc(35) int local35 = this.anIntArray256[local24];
			@Pc(40) int local40 = this.anIntArray258[local24];
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
		this.aShort18 = (short) local8;
		this.aShort19 = (short) local14;
		super.aShort34 = (short) local10;
		this.aShort17 = (short) local16;
		this.aShort23 = (short) local12;
		this.aShort21 = (short) local18;
		this.aShort20 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort22 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
	public final void method1786() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2604; local1++) {
			@Pc(7) int local7 = this.anIntArray257[local1];
			this.anIntArray257[local1] = this.anIntArray258[local1];
			this.anIntArray258[local1] = -local7;
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([[IIIIZI)Lclient!fd;")
	public abstract Class3_Sub2_Sub1_Sub2 method1787(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)Lclient!fd;")
	public abstract Class3_Sub2_Sub1_Sub2 method1789(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
	public final void method1790() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2604; local1++) {
			@Pc(7) int local7 = this.anIntArray258[local1];
			this.anIntArray258[local1] = this.anIntArray257[local1];
			this.anIntArray257[local1] = -local7;
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
	public final int method1791() {
		this.method1785();
		return this.aShort20;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public final void method1792(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static45.anIntArray259[arg0];
		@Pc(7) int local7 = Static45.anIntArray260[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2604; local9++) {
			@Pc(26) int local26 = this.anIntArray256[local9] * local7 - this.anIntArray258[local9] * local3 >> 16;
			this.anIntArray258[local9] = this.anIntArray256[local9] * local3 + this.anIntArray258[local9] * local7 >> 16;
			this.anIntArray256[local9] = local26;
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)Lclient!fd;")
	public abstract Class3_Sub2_Sub1_Sub2 method1793(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!eg;I)V")
	public abstract void method1795(@OriginalArg(0) Class3_Sub2_Sub4 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
	public final void method1797() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2604; local1++) {
			this.anIntArray257[local1] = -this.anIntArray257[local1];
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!eg;ILclient!eg;I[I)V")
	public abstract void method1798(@OriginalArg(0) Class3_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	public final void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2604; local1++) {
			this.anIntArray257[local1] = this.anIntArray257[local1] * arg0 / 128;
			this.anIntArray256[local1] = this.anIntArray256[local1] * arg1 / 128;
			this.anIntArray258[local1] = this.anIntArray258[local1] * arg2 / 128;
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public final void method1800(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static45.anIntArray259[arg0];
		@Pc(7) int local7 = Static45.anIntArray260[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2604; local9++) {
			@Pc(26) int local26 = this.anIntArray256[local9] * local3 + this.anIntArray257[local9] * local7 >> 16;
			this.anIntArray256[local9] = this.anIntArray256[local9] * local7 - this.anIntArray257[local9] * local3 >> 16;
			this.anIntArray257[local9] = local26;
		}
		this.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
	public final void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2604; local1++) {
			this.anIntArray257[local1] += arg0;
			this.anIntArray256[local1] += arg1;
			this.anIntArray258[local1] += arg2;
		}
		this.aBoolean109 = false;
	}
}
