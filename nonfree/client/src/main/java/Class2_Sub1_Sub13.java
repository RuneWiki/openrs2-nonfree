import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
	public int anInt1996;

	@OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
	private int anInt1998;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "[I")
	private final int[] anIntArray246 = new int[6];

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
	private int anInt1997 = 0;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
	private int anInt1990 = 0;

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
	private int anInt2001 = 128;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
	private int anInt1991 = 128;

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
	public int anInt2000 = -1;

	@OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
	private int anInt2004 = 0;

	@OriginalMember(owner = "client!nb", name = "ob", descriptor = "[I")
	private final int[] anIntArray247 = new int[6];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!g;B)V")
	public void method1431(@OriginalArg(0) Class2_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1281();
			if (local15 == 0) {
				return;
			}
			this.method1434(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method1433(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub2_Sub2 local13 = (Class2_Sub1_Sub2_Sub2) Static44.aClass54_11.method1634((long) this.anInt1996);
		if (local13 == null) {
			local13 = Static32.method722(Static79.aClass36_71, this.anInt1998);
			if (local13 == null) {
				return null;
			}
			for (@Pc(33) int local33 = 0; local33 < 6; local33++) {
				if (this.anIntArray246[0] != 0) {
					local13.method716(this.anIntArray246[local33], this.anIntArray247[local33]);
				}
			}
			local13.method693();
			local13.method712(this.anInt1997 + 64, this.anInt2004 + 850, -30, -50, -30, true);
			Static44.aClass54_11.method1637((long) this.anInt1996, local13);
		}
		@Pc(95) Class2_Sub1_Sub2_Sub2 local95;
		if (this.anInt2000 == -1 || arg0 == -1) {
			local95 = local13.method713(true);
		} else {
			local95 = Static69.method1439(this.anInt2000).method57(arg0, local13);
		}
		if (this.anInt2001 != 128 || this.anInt1991 != 128) {
			local95.method714(this.anInt2001, this.anInt1991, this.anInt2001);
		}
		if (this.anInt1990 != 0) {
			if (this.anInt1990 == 90) {
				local95.method694();
			}
			if (this.anInt1990 == 180) {
				local95.method694();
				local95.method694();
			}
			if (this.anInt1990 == 270) {
				local95.method694();
				local95.method694();
				local95.method694();
			}
		}
		return local95;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!g;I)V")
	private void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt1998 = arg1.method1273();
		} else if (arg0 == 2) {
			this.anInt2000 = arg1.method1273();
		} else if (arg0 == 4) {
			this.anInt2001 = arg1.method1273();
		} else if (arg0 == 5) {
			this.anInt1991 = arg1.method1273();
		} else if (arg0 == 6) {
			this.anInt1990 = arg1.method1273();
		} else if (arg0 == 7) {
			this.anInt1997 = arg1.method1281();
		} else if (arg0 == 8) {
			this.anInt2004 = arg1.method1281();
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray246[arg0 - 40] = arg1.method1273();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray247[arg0 - 50] = arg1.method1273();
		}
	}
}
