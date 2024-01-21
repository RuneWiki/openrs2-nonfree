import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public abstract class Class1_Sub2_Sub1_Sub4 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
	protected int[] anIntArray186;

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "[I")
	protected int[] anIntArray187;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "S")
	protected short aShort19;

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "S")
	protected short aShort20;

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
	protected int[] anIntArray188;

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "S")
	protected short aShort21;

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "[[I")
	protected int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "S")
	protected short aShort22;

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "S")
	protected short aShort23;

	@OriginalMember(owner = "client!oh", name = "db", descriptor = "S")
	protected short aShort24;

	@OriginalMember(owner = "client!oh", name = "hb", descriptor = "S")
	protected short aShort25;

	@OriginalMember(owner = "client!oh", name = "jb", descriptor = "[[I")
	protected int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
	protected int anInt1944 = 0;

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "Z")
	protected boolean aBoolean82 = false;

	@OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
	protected int anInt1943 = 0;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)Lclient!oh;")
	public abstract Class1_Sub2_Sub1_Sub4 method1446(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	public final void method1447(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static124.anIntArray190[arg0];
		@Pc(7) int local7 = Static124.anIntArray189[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1944; local9++) {
			@Pc(26) int local26 = this.anIntArray188[local9] * local7 - this.anIntArray187[local9] * local3 >> 16;
			this.anIntArray187[local9] = this.anIntArray188[local9] * local3 + this.anIntArray187[local9] * local7 >> 16;
			this.anIntArray188[local9] = local26;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fd;I)V")
	public abstract void method1448(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([[IIIIZI)Lclient!oh;")
	public abstract Class1_Sub2_Sub1_Sub4 method1449(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fd;ILclient!fd;I[I)V")
	public abstract void method1451(@OriginalArg(0) Class1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIII)V")
	public abstract void method1452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6);

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	public final void method1453() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1944; local1++) {
			@Pc(7) int local7 = this.anIntArray186[local1];
			this.anIntArray186[local1] = this.anIntArray187[local1];
			this.anIntArray187[local1] = -local7;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "()V")
	public final void method1454() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1944; local1++) {
			@Pc(7) int local7 = this.anIntArray187[local1];
			this.anIntArray187[local1] = this.anIntArray186[local1];
			this.anIntArray186[local1] = -local7;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "()V")
	public final void method1455() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1944; local1++) {
			this.anIntArray186[local1] = -this.anIntArray186[local1];
			this.anIntArray187[local1] = -this.anIntArray187[local1];
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "()I")
	public final int method1456() {
		this.method1459();
		return this.aShort24;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(III)V")
	public final void method1457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1944; local1++) {
			this.anIntArray186[local1] = this.anIntArray186[local1] * arg0 / 128;
			this.anIntArray188[local1] = this.anIntArray188[local1] * arg1 / 128;
			this.anIntArray187[local1] = this.anIntArray187[local1] * arg2 / 128;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(III)V")
	public final void method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1944; local1++) {
			this.anIntArray186[local1] += arg0;
			this.anIntArray188[local1] += arg1;
			this.anIntArray187[local1] += arg2;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "()V")
	public final void method1459() {
		if (this.aBoolean82) {
			return;
		}
		this.aBoolean82 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anInt1944; local24++) {
			@Pc(30) int local30 = this.anIntArray186[local24];
			@Pc(35) int local35 = this.anIntArray188[local24];
			@Pc(40) int local40 = this.anIntArray187[local24];
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
		this.aShort20 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort22 = (short) local16;
		this.aShort25 = (short) local12;
		this.aShort23 = (short) local18;
		this.aShort24 = (short) (Math.sqrt((double) local20) + 0.99D);
		this.aShort21 = (short) (Math.sqrt((double) local22) + 0.99D);
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	public final void method1460(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static124.anIntArray190[arg0];
		@Pc(7) int local7 = Static124.anIntArray189[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1944; local9++) {
			@Pc(26) int local26 = this.anIntArray188[local9] * local3 + this.anIntArray186[local9] * local7 >> 16;
			this.anIntArray188[local9] = this.anIntArray188[local9] * local7 - this.anIntArray186[local9] * local3 >> 16;
			this.anIntArray186[local9] = local26;
		}
		this.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(Z)Lclient!oh;")
	public abstract Class1_Sub2_Sub1_Sub4 method1461(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method1462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);
}
