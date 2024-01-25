import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class5_Sub3_Sub21 extends Class5_Sub3 {

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "[I")
	public int[] anIntArray591;

	@OriginalMember(owner = "client!waa", name = "u", descriptor = "[C")
	public char[] aCharArray16;

	@OriginalMember(owner = "client!waa", name = "v", descriptor = "[C")
	public char[] aCharArray17;

	@OriginalMember(owner = "client!waa", name = "x", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!waa", name = "C", descriptor = "[I")
	public int[] anIntArray592;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!mc;Z)V")
	public void method8690(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7816();
			if (local11 == 0) {
				return;
			}
			this.method8695(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(CB)I")
	public int method8691(@OriginalArg(0) char arg0) {
		if (this.anIntArray592 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray592.length; local10++) {
			if (arg0 == this.aCharArray17[local10]) {
				return this.anIntArray592[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(CB)I")
	public int method8692(@OriginalArg(0) char arg0) {
		if (this.anIntArray591 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray591.length; local15++) {
			if (arg0 == this.aCharArray16[local15]) {
				return this.anIntArray591[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public void method8693() {
		@Pc(4) int local4;
		if (this.anIntArray592 != null) {
			for (local4 = 0; local4 < this.anIntArray592.length; local4++) {
				this.anIntArray592[local4] |= 0x8000;
			}
		}
		if (this.anIntArray591 != null) {
			for (local4 = 0; local4 < this.anIntArray591.length; local4++) {
				this.anIntArray591[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILclient!mc;)V")
	private void method8695(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.aString117 = arg1.method7847();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(37) byte local37;
		if (arg0 == 2) {
			local15 = arg1.method7816();
			this.aCharArray16 = new char[local15];
			this.anIntArray591 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray591[local25] = arg1.method7860();
				local37 = arg1.method7861();
				this.aCharArray16[local25] = local37 == 0 ? 0 : Static144.method2600(local37);
			}
		} else if (arg0 == 3) {
			local15 = arg1.method7816();
			this.aCharArray17 = new char[local15];
			this.anIntArray592 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray592[local25] = arg1.method7860();
				local37 = arg1.method7861();
				this.aCharArray17[local25] = local37 == 0 ? 0 : Static144.method2600(local37);
			}
		}
	}
}
