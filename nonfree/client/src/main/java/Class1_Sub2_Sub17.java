import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "Lclient!ia;")
	public Class51 aClass51_1414;

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!sj", name = "P", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!sj", name = "W", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!k;II)V")
	private void method3184(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass51_1414 = arg0.method3781();
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local19 = arg0.method3793();
			this.anIntArray311 = new int[local19];
			this.anIntArray310 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray311[local29] = arg0.method3805();
				local42 = arg0.method3793();
				if (local42 == 0) {
					this.anIntArray310[local29] = -1;
				} else {
					this.anIntArray310[local29] = local42;
				}
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local19 = arg0.method3793();
		this.anIntArray308 = new int[local19];
		this.anIntArray309 = new int[local19];
		for (local29 = 0; local29 < local19; local29++) {
			this.anIntArray309[local29] = arg0.method3805();
			local42 = arg0.method3793();
			if (local42 == 0) {
				this.anIntArray308[local29] = -1;
			} else {
				this.anIntArray308[local29] = local42;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!k;)V")
	public void method3185(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3793();
			if (local9 == 0) {
				return;
			}
			this.method3184(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)I")
	public int method3186(@OriginalArg(0) int arg0) {
		if (this.anIntArray311 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray311.length; local12++) {
			if (arg0 == this.anIntArray310[local12]) {
				return this.anIntArray311[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BI)I")
	public int method3189(@OriginalArg(1) int arg0) {
		if (this.anIntArray309 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray309.length; local20++) {
			if (this.anIntArray308[local20] == arg0) {
				return this.anIntArray309[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
	public void method3190() {
		@Pc(15) int local15;
		if (this.anIntArray309 != null) {
			for (local15 = 0; local15 < this.anIntArray309.length; local15++) {
				this.anIntArray309[local15] |= 0x8000;
			}
		}
		if (this.anIntArray311 != null) {
			for (local15 = 0; local15 < this.anIntArray311.length; local15++) {
				this.anIntArray311[local15] |= 0x8000;
			}
		}
	}
}
