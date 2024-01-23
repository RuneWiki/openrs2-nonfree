import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!tg", name = "J", descriptor = "[I")
	public int[] anIntArray468;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "Ljava/lang/String;")
	public String aString170;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
	public void method4001() {
		@Pc(16) int local16;
		if (this.anIntArray467 != null) {
			for (local16 = 0; local16 < this.anIntArray467.length; local16++) {
				this.anIntArray467[local16] |= 0x8000;
			}
		}
		if (this.anIntArray468 != null) {
			for (local16 = 0; local16 < this.anIntArray468.length; local16++) {
				this.anIntArray468[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!sb;I)V")
	private void method4003(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString170 = arg0.method2605();
			return;
		}
		@Pc(11) int local11;
		@Pc(21) int local21;
		@Pc(35) byte local35;
		if (arg1 == 2) {
			local11 = arg0.method2595();
			this.anIntArray468 = new int[local11];
			this.aCharArray7 = new char[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray468[local21] = arg0.method2593();
				local35 = arg0.method2598();
				this.aCharArray7[local21] = local35 == 0 ? 0 : Static16.method215(local35);
			}
		} else if (arg1 == 3) {
			local11 = arg0.method2595();
			this.aCharArray8 = new char[local11];
			this.anIntArray467 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray467[local21] = arg0.method2593();
				local35 = arg0.method2598();
				this.aCharArray8[local21] = local35 == 0 ? 0 : Static16.method215(local35);
			}
		} else if (arg1 == 4) {
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(CI)I")
	public int method4008(@OriginalArg(0) char arg0) {
		if (this.anIntArray468 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray468.length; local21++) {
			if (arg0 == this.aCharArray7[local21]) {
				return this.anIntArray468[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(CI)I")
	public int method4009(@OriginalArg(0) char arg0) {
		if (this.anIntArray467 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray467.length; local14++) {
			if (arg0 == this.aCharArray8[local14]) {
				return this.anIntArray467[local14];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method4011(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2595();
			if (local5 == 0) {
				return;
			}
			this.method4003(arg0, local5);
		}
	}
}
