import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!mb;")
	public Class62 aClass62_860;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)I")
	public int method1740(@OriginalArg(1) int arg0) {
		if (this.anIntArray231 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray231.length; local17++) {
			if (arg0 == this.anIntArray229[local17]) {
				return this.anIntArray231[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!kd;)V")
	public void method1742(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1534();
			if (local8 == 0) {
				return;
			}
			this.method1746(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I")
	public int method1744(@OriginalArg(1) int arg0) {
		if (this.anIntArray232 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray232.length; local20++) {
			if (this.anIntArray230[local20] == arg0) {
				return this.anIntArray232[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!kd;B)V")
	private void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 1) {
			this.aClass62_860 = arg1.method1538();
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(42) int local42;
		if (arg0 == 2) {
			local19 = arg1.method1534();
			this.anIntArray232 = new int[local19];
			this.anIntArray230 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray232[local29] = arg1.method1557();
				local42 = arg1.method1534();
				if (local42 == 0) {
					this.anIntArray230[local29] = -1;
				} else {
					this.anIntArray230[local29] = local42;
				}
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		local19 = arg1.method1534();
		this.anIntArray229 = new int[local19];
		this.anIntArray231 = new int[local19];
		for (local29 = 0; local29 < local19; local29++) {
			this.anIntArray231[local29] = arg1.method1557();
			local42 = arg1.method1534();
			if (local42 == 0) {
				this.anIntArray229[local29] = -1;
			} else {
				this.anIntArray229[local29] = local42;
			}
		}
		return;
	}
}
