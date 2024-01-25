import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!hw;I)V")
	private void method4776(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString64 = arg0.method6141();
			return;
		}
		@Pc(26) int local26;
		@Pc(36) int local36;
		@Pc(49) byte local49;
		if (arg1 == 2) {
			local26 = arg0.method6138();
			this.anIntArray502 = new int[local26];
			this.aCharArray4 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray502[local36] = arg0.method6148();
				local49 = arg0.method6120();
				this.aCharArray4[local36] = local49 == 0 ? 0 : Static408.method1357(local49);
			}
		} else if (arg1 == 3) {
			local26 = arg0.method6138();
			this.anIntArray501 = new int[local26];
			this.aCharArray5 = new char[local26];
			for (local36 = 0; local36 < local26; local36++) {
				this.anIntArray501[local36] = arg0.method6148();
				local49 = arg0.method6120();
				this.aCharArray5[local36] = local49 == 0 ? 0 : Static408.method1357(local49);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)I")
	public int method4777(@OriginalArg(1) char arg0) {
		if (this.anIntArray501 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray501.length; local20++) {
			if (this.aCharArray5[local20] == arg0) {
				return this.anIntArray501[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IC)I")
	public int method4778(@OriginalArg(1) char arg0) {
		if (this.anIntArray502 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray502.length; local12++) {
			if (arg0 == this.aCharArray4[local12]) {
				return this.anIntArray502[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!hw;I)V")
	public void method4779(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6138();
			if (local15 == 0) {
				return;
			}
			this.method4776(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
	public void method4781() {
		@Pc(14) int local14;
		if (this.anIntArray501 != null) {
			for (local14 = 0; local14 < this.anIntArray501.length; local14++) {
				this.anIntArray501[local14] |= 0x8000;
			}
		}
		if (this.anIntArray502 != null) {
			for (local14 = 0; local14 < this.anIntArray502.length; local14++) {
				this.anIntArray502[local14] |= 0x8000;
			}
		}
	}
}
