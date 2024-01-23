import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "[Lclient!ia;")
	private Class51[] aClass51Array21;

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!mj", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!mj", name = "Z", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)Lclient!ia;")
	public Class51 method2272() {
		@Pc(9) Class51 local9 = Static158.method2687(80);
		if (this.aClass51Array21 == null) {
			return Static206.aClass51_1512;
		}
		local9.method1404(this.aClass51Array21[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aClass51Array21.length; local29++) {
			local9.method1404(Static167.aClass51_1279);
			local9.method1404(this.aClass51Array21[local29]);
		}
		return local9.method1434();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!k;)Lclient!ia;")
	public Class51 method2273(@OriginalArg(1) Class1_Sub16 arg0) {
		@Pc(5) Class51 local5 = Static158.method2687(80);
		if (this.anIntArray190 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray190.length; local10++) {
				local5.method1404(this.aClass51Array21[local10]);
				local5.method1404(Static152.method2616(this.anIntArray190[local10], this.anIntArrayArray17[local10], arg0.method3820(Static27.anIntArray44[this.anIntArray190[local10]])));
			}
		}
		local5.method1404(this.aClass51Array21[this.aClass51Array21.length - 1]);
		return local5.method1434();
	}

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)I")
	public int method2276() {
		return this.anIntArray190 == null ? 0 : this.anIntArray190.length;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBI)I")
	public int method2277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray190 == null || arg1 < 0 || this.anIntArray190.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray17[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray17[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray17[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZILclient!k;)V")
	private void method2278(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		if (arg0 == 1) {
			this.aClass51Array21 = arg1.method3781().method1409(60);
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (arg0 == 2) {
			local20 = arg1.method3793();
			this.anIntArray191 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray191[local30] = arg1.method3805();
			}
		} else if (arg0 == 3) {
			local20 = arg1.method3793();
			this.anIntArray190 = new int[local20];
			this.anIntArrayArray17 = new int[local20][];
			for (local30 = 0; local30 < local20; local30++) {
				@Pc(36) int local36 = arg1.method3805();
				this.anIntArray190[local30] = local36;
				this.anIntArrayArray17[local30] = new int[Static230.anIntArray378[local36]];
				for (@Pc(51) int local51 = 0; local51 < Static230.anIntArray378[local36]; local51++) {
					this.anIntArrayArray17[local30][local51] = arg1.method3805();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
	public int method2279(@OriginalArg(1) int arg0) {
		return this.anIntArray190 == null || arg0 < 0 || this.anIntArray190.length < arg0 ? -1 : this.anIntArray190[arg0];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!k;I[I)V")
	public void method2281(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int[] arg1) {
		if (this.anIntArray190 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray190.length; local15++) {
			if (local15 >= arg1.length) {
				return;
			}
			@Pc(24) int local24 = Static46.anIntArray64[this.method2279(local15)];
			if (local24 > 0) {
				arg0.method3767((long) arg1[local15], local24);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!k;)V")
	public void method2282(@OriginalArg(1) Class1_Sub16 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3793();
			if (local18 == 0) {
				return;
			}
			this.method2278(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
	public void method2284() {
		if (this.anIntArray191 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray191.length; local10++) {
				this.anIntArray191[local10] |= 0x8000;
			}
		}
	}
}
