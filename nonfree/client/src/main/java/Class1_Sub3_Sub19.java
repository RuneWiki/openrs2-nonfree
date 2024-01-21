import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "[Lclient!vd;")
	private Class92[] aClass92Array21;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!ka;)V")
	public void method2377(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3010();
			if (local16 == 0) {
				return;
			}
			this.method2378(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!ka;B)V")
	private void method2378(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aClass92Array21 = arg1.method3022().method3229(60);
			return;
		}
		@Pc(14) int local14;
		@Pc(24) int local24;
		if (arg0 == 2) {
			local14 = arg1.method3010();
			this.anIntArray287 = new int[local14];
			for (local24 = 0; local24 < local14; local24++) {
				this.anIntArray287[local24] = arg1.method3023();
			}
		} else if (arg0 == 3) {
			local14 = arg1.method3010();
			this.anIntArray286 = new int[local14];
			this.anIntArrayArray27 = new int[local14][];
			for (local24 = 0; local24 < local14; local24++) {
				@Pc(30) int local30 = arg1.method3023();
				this.anIntArray286[local24] = local30;
				this.anIntArrayArray27[local24] = new int[Static202.anIntArray359[local30]];
				for (@Pc(45) int local45 = 0; local45 < Static202.anIntArray359[local30]; local45++) {
					this.anIntArrayArray27[local24][local45] = arg1.method3023();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I")
	public int method2381(@OriginalArg(0) int arg0) {
		return this.anIntArray286 == null || arg0 < 0 || arg0 > this.anIntArray286.length ? -1 : this.anIntArray286[arg0];
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)I")
	public int method2382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray286 == null || arg0 < 0 || this.anIntArray286.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray27[arg0] == null || arg1 < 0 || this.anIntArrayArray27[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray27[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ka;B)Lclient!vd;")
	public Class92 method2383(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(14) Class92 local14 = Static193.method2265(80);
		if (this.anIntArray286 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray286.length; local19++) {
				local14.method3237(this.aClass92Array21[local19]);
				local14.method3237(Static19.method428(this.anIntArray286[local19], this.anIntArrayArray27[local19], arg0.method3051(Static164.anIntArray301[this.anIntArray286[local19]])));
			}
		}
		local14.method3237(this.aClass92Array21[this.aClass92Array21.length - 1]);
		return local14.method3219();
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I")
	public int method2384() {
		return this.anIntArray286 == null ? 0 : this.anIntArray286.length;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)Lclient!vd;")
	public Class92 method2385() {
		@Pc(9) Class92 local9 = Static193.method2265(80);
		local9.method3237(this.aClass92Array21[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aClass92Array21.length; local24++) {
			local9.method3237(Static94.aClass92_877);
			local9.method3237(this.aClass92Array21[local24]);
		}
		return local9.method3219();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!ka;I[I)V")
	public void method2387(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray286 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; this.anIntArray286.length > local11 && arg1.length > local11; local11++) {
			@Pc(20) int local20 = Static58.anIntArray117[this.method2381(local11)];
			if (local20 > 0) {
				arg0.method3044(local20, (long) arg1[local11]);
			}
		}
	}
}
