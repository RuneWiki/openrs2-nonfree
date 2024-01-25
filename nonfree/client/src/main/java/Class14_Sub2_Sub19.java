import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class14_Sub2_Sub19 extends Class14_Sub2 {

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "[C")
	public char[] aCharArray11;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "[I")
	public int[] anIntArray538;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
	public int[] anIntArray539;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Ljava/lang/String;")
	public String aString111;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[C")
	public char[] aCharArray12;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(CI)I")
	public int method8531(@OriginalArg(0) char arg0) {
		if (this.anIntArray538 == null) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray538.length; local19++) {
			if (arg0 == this.aCharArray12[local19]) {
				return this.anIntArray538[local19];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method8533(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7695(121);
			if (local12 == 0) {
				return;
			}
			this.method8539(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZC)I")
	public int method8535(@OriginalArg(1) char arg0) {
		if (this.anIntArray539 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anIntArray539.length; local11++) {
			if (this.aCharArray11[local11] == arg0) {
				return this.anIntArray539[local11];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method8537() {
		@Pc(4) int local4;
		if (this.anIntArray539 != null) {
			for (local4 = 0; local4 < this.anIntArray539.length; local4++) {
				this.anIntArray539[local4] |= 0x8000;
			}
		}
		if (this.anIntArray538 != null) {
			for (local4 = 0; local4 < this.anIntArray538.length; local4++) {
				this.anIntArray538[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method8539(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString111 = arg0.method7703(0);
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		@Pc(66) byte local66;
		if (arg1 == 2) {
			local42 = arg0.method7695(94);
			this.aCharArray12 = new char[local42];
			this.anIntArray538 = new int[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.anIntArray538[local52] = arg0.method7717(-1978450544);
				local66 = arg0.method7720();
				this.aCharArray12[local52] = local66 == 0 ? 0 : Static223.method3822(local66);
			}
		} else if (arg1 == 3) {
			local42 = arg0.method7695(123);
			this.anIntArray539 = new int[local42];
			this.aCharArray11 = new char[local42];
			for (local52 = 0; local52 < local42; local52++) {
				this.anIntArray539[local52] = arg0.method7717(-1978450544);
				local66 = arg0.method7720();
				this.aCharArray11[local52] = local66 == 0 ? 0 : Static223.method3822(local66);
			}
			return;
		}
	}
}
