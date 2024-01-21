import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "[Lclient!mb;")
	private Class62[] aClass62Array14;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)I")
	public int method327() {
		return this.anIntArray37 == null ? 0 : this.anIntArray37.length;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method329(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1534();
			if (local9 == 0) {
				return;
			}
			this.method333(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)Lclient!mb;")
	public Class62 method330() {
		@Pc(9) Class62 local9 = Static206.method277(80);
		local9.method1871(this.aClass62Array14[0]);
		for (@Pc(19) int local19 = 1; local19 < this.aClass62Array14.length; local19++) {
			local9.method1871(Static50.aClass62_347);
			local9.method1871(this.aClass62Array14[local19]);
		}
		return local9.method1852();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!kd;I)V")
	private void method333(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass62Array14 = arg0.method1538().method1839(60);
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		if (arg1 == 2) {
			local28 = arg0.method1534();
			this.anIntArray36 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray36[local38] = arg0.method1557();
			}
		} else if (arg1 == 3) {
			local28 = arg0.method1534();
			this.anIntArrayArray5 = new int[local28][];
			this.anIntArray37 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				@Pc(44) int local44 = arg0.method1557();
				this.anIntArray37[local38] = local44;
				this.anIntArrayArray5[local38] = new int[Static157.anIntArray287[local44]];
				for (@Pc(59) int local59 = 0; local59 < Static157.anIntArray287[local44]; local59++) {
					this.anIntArrayArray5[local38][local59] = arg0.method1557();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!kd;)Lclient!mb;")
	public Class62 method334(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(9) Class62 local9 = Static206.method277(80);
		if (this.anIntArray37 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray37.length; local14++) {
				local9.method1871(this.aClass62Array14[local14]);
				local9.method1871(Static86.method2379(arg0.method1530(Static19.anIntArray39[this.anIntArray37[local14]]), this.anIntArrayArray5[local14], this.anIntArray37[local14]));
			}
		}
		local9.method1871(this.aClass62Array14[this.aClass62Array14.length - 1]);
		return local9.method1852();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I")
	public int method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray37 == null || arg0 < 0 || arg0 > this.anIntArray37.length) {
			return -1;
		} else if (this.anIntArrayArray5[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray5[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray5[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B[ILclient!kd;)V")
	public void method338(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (this.anIntArray37 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray37.length; local11++) {
			if (arg0.length <= local11) {
				return;
			}
			@Pc(28) int local28 = Static135.anIntArray255[this.method339(local11)];
			if (local28 > 0) {
				arg1.method1542((long) arg0[local11], local28);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)I")
	public int method339(@OriginalArg(0) int arg0) {
		return this.anIntArray37 == null || arg0 < 0 || arg0 > this.anIntArray37.length ? -1 : this.anIntArray37[arg0];
	}
}
