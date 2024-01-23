import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(CB)I")
	public int method820(@OriginalArg(0) char arg0) {
		if (this.anIntArray65 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray65.length; local18++) {
			if (arg0 == this.aCharArray1[local18]) {
				return this.anIntArray65[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BC)I")
	public int method822(@OriginalArg(1) char arg0) {
		if (this.anIntArray66 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray66.length; local13++) {
			if (this.aCharArray2[local13] == arg0) {
				return this.anIntArray66[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method824(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4261();
			if (local5 == 0) {
				return;
			}
			this.method825(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method825(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		if (arg0 == 1) {
			this.aString51 = arg1.method4265();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(46) byte local46;
		if (arg0 == 2) {
			local18 = arg1.method4261();
			this.anIntArray65 = new int[local18];
			this.aCharArray1 = new char[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray65[local28] = arg1.method4242();
				local46 = arg1.method4220();
				this.aCharArray1[local28] = local46 == 0 ? 0 : Static184.method3157(local46);
			}
		} else if (arg0 == 3) {
			local18 = arg1.method4261();
			this.aCharArray2 = new char[local18];
			this.anIntArray66 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray66[local28] = arg1.method4242();
				local46 = arg1.method4220();
				this.aCharArray2[local28] = local46 == 0 ? 0 : Static184.method3157(local46);
			}
		} else if (arg0 != 4) {
		}
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
	public void method828() {
		@Pc(12) int local12;
		if (this.anIntArray66 != null) {
			for (local12 = 0; local12 < this.anIntArray66.length; local12++) {
				this.anIntArray66[local12] |= 0x8000;
			}
		}
		if (this.anIntArray65 != null) {
			for (local12 = 0; local12 < this.anIntArray65.length; local12++) {
				this.anIntArray65[local12] |= 0x8000;
			}
		}
	}
}
