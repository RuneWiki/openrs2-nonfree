import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class2_Sub5_Sub11 extends Class2_Sub5 {

	@OriginalMember(owner = "client!js", name = "y", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!js", name = "E", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!js", name = "G", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!js", name = "I", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!js", name = "O", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(Lclient!ud;I)V")
	public void method4411(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6904();
			if (local3 == 0) {
				return;
			}
			this.method4413(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ud;I)V")
	private void method4413(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.aString53 = arg1.method6903();
			return;
		}
		@Pc(16) int local16;
		@Pc(26) int local26;
		@Pc(38) byte local38;
		if (arg0 == 2) {
			local16 = arg1.method6904();
			this.anIntArray361 = new int[local16];
			this.aCharArray7 = new char[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray361[local26] = arg1.method6884();
				local38 = arg1.method6908();
				this.aCharArray7[local26] = local38 == 0 ? 0 : Static448.method6635(local38);
			}
		} else if (arg0 == 3) {
			local16 = arg1.method6904();
			this.aCharArray6 = new char[local16];
			this.anIntArray360 = new int[local16];
			for (local26 = 0; local26 < local16; local26++) {
				this.anIntArray360[local26] = arg1.method6884();
				local38 = arg1.method6908();
				this.aCharArray6[local26] = local38 == 0 ? 0 : Static448.method6635(local38);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(CI)I")
	public int method4415(@OriginalArg(0) char arg0) {
		if (this.anIntArray360 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray360.length; local10++) {
			if (arg0 == this.aCharArray6[local10]) {
				return this.anIntArray360[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!js", name = "i", descriptor = "(I)V")
	public void method4416() {
		@Pc(14) int local14;
		if (this.anIntArray360 != null) {
			for (local14 = 0; local14 < this.anIntArray360.length; local14++) {
				this.anIntArray360[local14] |= 0x8000;
			}
		}
		if (this.anIntArray361 != null) {
			for (local14 = 0; local14 < this.anIntArray361.length; local14++) {
				this.anIntArray361[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(CI)I")
	public int method4417(@OriginalArg(0) char arg0) {
		if (this.anIntArray361 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray361.length; local15++) {
			if (this.aCharArray7[local15] == arg0) {
				return this.anIntArray361[local15];
			}
		}
		return -1;
	}
}
