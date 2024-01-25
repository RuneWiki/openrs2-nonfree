import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cr", name = "B", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "[I")
	public int[] anIntArray144;

	@OriginalMember(owner = "client!cr", name = "L", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ia;)V")
	public void method1143(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1171();
			if (local7 == 0) {
				return;
			}
			this.method1145(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ia;Z)V")
	private void method1145(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.aString13 = arg1.method1201();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(48) byte local48;
		if (arg0 == 2) {
			local26 = arg1.method1171();
			this.anIntArray144 = new int[local26];
			this.aCharArray3 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray144[local36] = arg1.method1177();
				local48 = arg1.method1212();
				this.aCharArray3[local36] = local48 == 0 ? 0 : Static231.method3516(local48);
			}
		} else if (arg0 == 3) {
			local26 = arg1.method1171();
			this.aCharArray2 = new char[local26];
			this.anIntArray143 = new int[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray143[local36] = arg1.method1177();
				local48 = arg1.method1212();
				this.aCharArray2[local36] = local48 == 0 ? 0 : Static231.method3516(local48);
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public void method1147() {
		@Pc(4) int local4;
		if (this.anIntArray143 != null) {
			for (local4 = 0; local4 < this.anIntArray143.length; local4++) {
				this.anIntArray143[local4] |= 0x8000;
			}
		}
		if (this.anIntArray144 != null) {
			for (local4 = 0; local4 < this.anIntArray144.length; local4++) {
				this.anIntArray144[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(CI)I")
	public int method1149(@OriginalArg(0) char arg0) {
		if (this.anIntArray143 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray143.length; local18++) {
			if (this.aCharArray2[local18] == arg0) {
				return this.anIntArray143[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IC)I")
	public int method1150(@OriginalArg(1) char arg0) {
		if (this.anIntArray144 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray144.length; local10++) {
			if (arg0 == this.aCharArray3[local10]) {
				return this.anIntArray144[local10];
			}
		}
		return -1;
	}
}
