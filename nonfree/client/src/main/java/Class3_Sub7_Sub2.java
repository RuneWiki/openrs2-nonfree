import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "[C")
	private static char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!baa", name = "u", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!baa", name = "r", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!baa", name = "D", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!baa", name = "A", descriptor = "Ljava/lang/String;")
	public String aString11;

	static {
		for (@Pc(69) int local69 = 0; local69 < 26; local69++) {
			aCharArray3[local69] = (char) (local69 + 65);
		}
		for (@Pc(83) int local83 = 26; local83 < 52; local83++) {
			aCharArray3[local83] = (char) (local83 + 97 - 26);
		}
		for (@Pc(99) int local99 = 52; local99 < 62; local99++) {
			aCharArray3[local99] = (char) (local99 + 48 - 52);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public void method1089() {
		@Pc(19) int local19;
		if (this.anIntArray70 != null) {
			for (local19 = 0; local19 < this.anIntArray70.length; local19++) {
				this.anIntArray70[local19] |= 0x8000;
			}
		}
		if (this.anIntArray71 != null) {
			for (local19 = 0; local19 < this.anIntArray71.length; local19++) {
				this.anIntArray71[local19] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IC)I")
	public int method1091(@OriginalArg(1) char arg0) {
		if (this.anIntArray70 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray70.length; local13++) {
			if (this.aCharArray2[local13] == arg0) {
				return this.anIntArray70[local13];
			}
		}
		if (17526 != 17526) {
			aCharArray3 = null;
		}
		return -1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZLclient!ika;)V")
	public void method1093(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2048(255);
			if (local14 == 0) {
				return;
			}
			this.method1095(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!ika;BI)V")
	private void method1095(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString11 = arg0.method2014();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(51) byte local51;
		if (arg1 == 2) {
			local26 = arg0.method2048(255);
			this.anIntArray71 = new int[local26];
			this.aCharArray1 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray71[local36] = arg0.method2028(-14795);
				local51 = arg0.method2022();
				this.aCharArray1[local36] = local51 == 0 ? 0 : Static309.method4582(local51);
			}
		} else if (arg1 == 3) {
			local26 = arg0.method2048(255);
			this.anIntArray70 = new int[local26];
			this.aCharArray2 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray70[local36] = arg0.method2028(-14795);
				local51 = arg0.method2022();
				this.aCharArray2[local36] = local51 == 0 ? 0 : Static309.method4582(local51);
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(CI)I")
	public int method1096(@OriginalArg(0) char arg0) {
		if (this.anIntArray71 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray71.length; local13++) {
			if (arg0 == this.aCharArray1[local13]) {
				return this.anIntArray71[local13];
			}
		}
		return -1;
	}
}
