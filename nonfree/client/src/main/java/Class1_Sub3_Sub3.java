import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "[I")
	public int[] anIntArray57;

	@OriginalMember(owner = "client!cj", name = "gb", descriptor = "Lclient!vd;")
	public Class92 aClass92_295;

	@OriginalMember(owner = "client!cj", name = "hb", descriptor = "[I")
	public int[] anIntArray58;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)I")
	public int method510(@OriginalArg(1) int arg0) {
		if (this.anIntArray55 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray55.length; local12++) {
			if (this.anIntArray56[local12] == arg0) {
				return this.anIntArray55[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!ka;)V")
	public void method513(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3010();
			if (local14 == 0) {
				return;
			}
			this.method516(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)I")
	public int method514(@OriginalArg(1) int arg0) {
		if (this.anIntArray57 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray57.length; local17++) {
			if (this.anIntArray58[local17] == arg0) {
				return this.anIntArray57[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!ka;I)V")
	private void method516(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass92_295 = arg0.method3022();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(54) int local54;
		if (arg1 == 2) {
			local31 = arg0.method3010();
			this.anIntArray55 = new int[local31];
			this.anIntArray56 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray55[local41] = arg0.method3023();
				local54 = arg0.method3010();
				if (local54 == 0) {
					this.anIntArray56[local41] = -1;
				} else {
					this.anIntArray56[local41] = local54;
				}
			}
		} else if (arg1 == 3) {
			local31 = arg0.method3010();
			this.anIntArray57 = new int[local31];
			this.anIntArray58 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray57[local41] = arg0.method3023();
				local54 = arg0.method3010();
				if (local54 == 0) {
					this.anIntArray58[local41] = -1;
				} else {
					this.anIntArray58[local41] = local54;
				}
			}
		}
	}
}
