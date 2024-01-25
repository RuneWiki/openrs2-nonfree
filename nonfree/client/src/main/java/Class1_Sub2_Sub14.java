import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!rc", name = "I", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)I")
	public int method4800(@OriginalArg(0) char arg0) {
		if (this.anIntArray530 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray530.length; local10++) {
			if (arg0 == this.aCharArray8[local10]) {
				return this.anIntArray530[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(CI)I")
	public int method4802(@OriginalArg(0) char arg0) {
		if (this.anIntArray531 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray531.length; local10++) {
			if (arg0 == this.aCharArray7[local10]) {
				return this.anIntArray531[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public void method4803() {
		@Pc(16) int local16;
		if (this.anIntArray531 != null) {
			for (local16 = 0; local16 < this.anIntArray531.length; local16++) {
				this.anIntArray531[local16] |= 0x8000;
			}
		}
		if (this.anIntArray530 != null) {
			for (local16 = 0; local16 < this.anIntArray530.length; local16++) {
				this.anIntArray530[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!hp;I)V")
	private void method4804(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString58 = arg0.method5401();
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(41) byte local41;
		if (arg1 == 2) {
			local19 = arg0.method5366();
			this.anIntArray530 = new int[local19];
			this.aCharArray8 = new char[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray530[local29] = arg0.method5362();
				local41 = arg0.method5416();
				this.aCharArray8[local29] = local41 == 0 ? 0 : Static246.method4274(local41);
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local19 = arg0.method5366();
		this.aCharArray7 = new char[local19];
		this.anIntArray531 = new int[local19];
		for (local29 = 0; local29 < local19; local29++) {
			this.anIntArray531[local29] = arg0.method5362();
			local41 = arg0.method5416();
			this.aCharArray7[local29] = local41 == 0 ? 0 : Static246.method4274(local41);
		}
		return;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!hp;B)V")
	public void method4805(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5366();
			if (local7 == 0) {
				return;
			}
			this.method4804(arg0, local7);
		}
	}
}
