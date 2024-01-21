import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!df", name = "N", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "[I")
	private final int[] anIntArray36 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	public int anInt762 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!me;)V")
	public void method530(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1402();
			if (local14 == 0) {
				return;
			}
			this.method533(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method532() {
		@Pc(8) Class2_Sub3_Sub5_Sub3[] local8 = new Class2_Sub3_Sub5_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray36[local12] != -1) {
				local8[local10++] = Static99.method1637(Static145.aClass10_115, this.anIntArray36[local12]);
			}
		}
		@Pc(42) Class2_Sub3_Sub5_Sub3 local42 = new Class2_Sub3_Sub5_Sub3(local8, local10);
		@Pc(52) int local52;
		if (this.aShortArray2 != null) {
			for (local52 = 0; local52 < this.aShortArray2.length; local52++) {
				local42.method1644(this.aShortArray2[local52], this.aShortArray4[local52]);
			}
		}
		if (this.aShortArray3 != null) {
			for (local52 = 0; local52 < this.aShortArray3.length; local52++) {
				local42.method1648(this.aShortArray3[local52], this.aShortArray5[local52]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!me;I)V")
	private void method533(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt762 = arg1.method1402();
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (arg0 == 2) {
			local45 = arg1.method1402();
			this.anIntArray35 = new int[local45];
			for (local55 = 0; local55 < local45; local55++) {
				this.anIntArray35[local55] = arg1.method1397();
			}
		} else if (arg0 == 3) {
			this.aBoolean32 = true;
		} else if (arg0 == 40) {
			local45 = arg1.method1402();
			this.aShortArray4 = new short[local45];
			this.aShortArray2 = new short[local45];
			for (local55 = 0; local55 < local45; local55++) {
				this.aShortArray2[local55] = (short) arg1.method1397();
				this.aShortArray4[local55] = (short) arg1.method1397();
			}
		} else if (arg0 == 41) {
			local45 = arg1.method1402();
			this.aShortArray5 = new short[local45];
			this.aShortArray3 = new short[local45];
			for (local55 = 0; local55 < local45; local55++) {
				this.aShortArray3[local55] = (short) arg1.method1397();
				this.aShortArray5[local55] = (short) arg1.method1397();
			}
			return;
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray36[arg0 - 60] = arg1.method1397();
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
	public boolean method534() {
		if (this.anIntArray35 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray35.length; local22++) {
			if (!Static145.aClass10_115.method1596(0, this.anIntArray35[local22])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lclient!mc;")
	public Class2_Sub3_Sub5_Sub3 method535() {
		if (this.anIntArray35 == null) {
			return null;
		}
		@Pc(15) Class2_Sub3_Sub5_Sub3[] local15 = new Class2_Sub3_Sub5_Sub3[this.anIntArray35.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray35.length; local17++) {
			local15[local17] = Static99.method1637(Static145.aClass10_115, this.anIntArray35[local17]);
		}
		@Pc(43) Class2_Sub3_Sub5_Sub3 local43;
		if (local15.length == 1) {
			local43 = local15[0];
		} else {
			local43 = new Class2_Sub3_Sub5_Sub3(local15, local15.length);
		}
		@Pc(57) int local57;
		if (this.aShortArray2 != null) {
			for (local57 = 0; local57 < this.aShortArray2.length; local57++) {
				local43.method1644(this.aShortArray2[local57], this.aShortArray4[local57]);
			}
		}
		if (this.aShortArray3 != null) {
			for (local57 = 0; local57 < this.aShortArray3.length; local57++) {
				local43.method1648(this.aShortArray3[local57], this.aShortArray5[local57]);
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Z")
	public boolean method537() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray36[local14] != -1 && !Static145.aClass10_115.method1596(0, this.anIntArray36[local14])) {
				local7 = false;
			}
		}
		return local7;
	}
}
