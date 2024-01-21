import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "Lclient!dc;")
	public Class20 aClass20_1101;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)I")
	public int method2170(@OriginalArg(1) int arg0) {
		if (this.anIntArray313 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray313.length; local19++) {
			if (arg0 == this.anIntArray310[local19]) {
				return this.anIntArray313[local19];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!ce;)V")
	private void method2172(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		if (arg0 == 1) {
			this.aClass20_1101 = arg1.method3027();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(52) int local52;
		if (arg0 == 2) {
			local29 = arg1.method3062();
			this.anIntArray311 = new int[local29];
			this.anIntArray312 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray311[local39] = arg1.method3077();
				local52 = arg1.method3062();
				if (local52 == 0) {
					this.anIntArray312[local39] = -1;
				} else {
					this.anIntArray312[local39] = local52;
				}
			}
		} else if (arg0 == 3) {
			local29 = arg1.method3062();
			this.anIntArray313 = new int[local29];
			this.anIntArray310 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray313[local39] = arg1.method3077();
				local52 = arg1.method3062();
				if (local52 == 0) {
					this.anIntArray310[local39] = -1;
				} else {
					this.anIntArray310[local39] = local52;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
	public int method2174(@OriginalArg(0) int arg0) {
		if (this.anIntArray311 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray311.length; local20++) {
			if (arg0 == this.anIntArray312[local20]) {
				return this.anIntArray311[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ce;)V")
	public void method2175(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method2172(local5, arg0);
		}
	}
}
