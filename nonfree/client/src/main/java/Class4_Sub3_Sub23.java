import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class4_Sub3_Sub23 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "Ljava/lang/String;")
	public String aString369;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
	public int[] anIntArray677;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!fd;)V")
	public void method4809(@OriginalArg(1) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4666();
			if (local5 == 0) {
				return;
			}
			this.method4816(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(CI)I")
	public int method4811(@OriginalArg(0) char arg0) {
		if (this.anIntArray676 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray676.length; local20++) {
			if (this.aCharArray5[local20] == arg0) {
				return this.anIntArray676[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(CI)I")
	public int method4814(@OriginalArg(0) char arg0) {
		if (this.anIntArray677 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray677.length; local21++) {
			if (this.aCharArray4[local21] == arg0) {
				return this.anIntArray677[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	public void method4815() {
		@Pc(8) int local8;
		if (this.anIntArray676 != null) {
			for (local8 = 0; local8 < this.anIntArray676.length; local8++) {
				this.anIntArray676[local8] |= 0x8000;
			}
		}
		if (this.anIntArray677 != null) {
			for (local8 = 0; local8 < this.anIntArray677.length; local8++) {
				this.anIntArray677[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method4816(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString369 = arg0.method4630();
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		@Pc(69) byte local69;
		if (arg1 == 2) {
			local39 = arg0.method4666();
			this.anIntArray677 = new int[local39];
			this.aCharArray4 = new char[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray677[local49] = arg0.method4653();
				local69 = arg0.method4674();
				this.aCharArray4[local49] = local69 == 0 ? 0 : Static219.method3559(local69);
			}
		} else if (arg1 == 3) {
			local39 = arg0.method4666();
			this.aCharArray5 = new char[local39];
			this.anIntArray676 = new int[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray676[local49] = arg0.method4653();
				local69 = arg0.method4674();
				this.aCharArray5[local49] = local69 == 0 ? 0 : Static219.method3559(local69);
			}
		} else if (arg1 != 4) {
		}
	}
}
