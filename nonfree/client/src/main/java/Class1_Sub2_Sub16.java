import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "[C")
	public char[] aCharArray14;

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "Ljava/lang/String;")
	public String aString157;

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "[C")
	public char[] aCharArray15;

	@OriginalMember(owner = "client!rl", name = "X", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!jj;I)V")
	public void method3722(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3122();
			if (local17 == 0) {
				return;
			}
			this.method3727(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	public void method3725() {
		@Pc(7) int local7;
		if (this.anIntArray572 != null) {
			for (local7 = 0; local7 < this.anIntArray572.length; local7++) {
				this.anIntArray572[local7] |= 0x8000;
			}
		}
		if (this.anIntArray573 != null) {
			for (local7 = 0; local7 < this.anIntArray573.length; local7++) {
				this.anIntArray573[local7] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(CI)I")
	public int method3726(@OriginalArg(0) char arg0) {
		if (this.anIntArray572 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray572.length; local14++) {
			if (this.aCharArray15[local14] == arg0) {
				return this.anIntArray572[local14];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!jj;I)V")
	private void method3727(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.aString157 = arg1.method3101();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(44) byte local44;
		if (arg0 == 2) {
			local20 = arg1.method3122();
			this.aCharArray14 = new char[local20];
			this.anIntArray573 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray573[local30] = arg1.method3107();
				local44 = arg1.method3082();
				this.aCharArray14[local30] = local44 == 0 ? 0 : Static217.method3483(local44);
			}
		} else if (arg0 == 3) {
			local20 = arg1.method3122();
			this.aCharArray15 = new char[local20];
			this.anIntArray572 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray572[local30] = arg1.method3107();
				local44 = arg1.method3082();
				this.aCharArray15[local30] = local44 == 0 ? 0 : Static217.method3483(local44);
			}
		} else if (arg0 == 4) {
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IC)I")
	public int method3730(@OriginalArg(1) char arg0) {
		if (this.anIntArray573 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray573.length; local21++) {
			if (arg0 == this.aCharArray14[local21]) {
				return this.anIntArray573[local21];
			}
		}
		return -1;
	}
}
