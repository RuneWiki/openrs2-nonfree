import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class2_Sub10_Sub16 extends Class2_Sub10 {

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "[I")
	public int[] anIntArray1079;

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "[I")
	public int[] anIntArray1080;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(CI)I")
	public int method4700(@OriginalArg(0) char arg0) {
		if (this.anIntArray1080 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray1080.length; local12++) {
			if (this.aCharArray6[local12] == arg0) {
				return this.anIntArray1080[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
	public void method4702() {
		@Pc(6) int local6;
		if (this.anIntArray1080 != null) {
			for (local6 = 0; local6 < this.anIntArray1080.length; local6++) {
				this.anIntArray1080[local6] |= 0x8000;
			}
		}
		if (this.anIntArray1079 != null) {
			for (local6 = 0; local6 < this.anIntArray1079.length; local6++) {
				this.anIntArray1079[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method4703(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5350();
			if (local5 == 0) {
				return;
			}
			this.method4705(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IC)I")
	public int method4704(@OriginalArg(1) char arg0) {
		if (this.anIntArray1079 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray1079.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray1079[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!kk;BI)V")
	private void method4705(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString59 = arg0.method5364();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(41) byte local41;
		if (arg1 == 2) {
			local18 = arg0.method5350();
			this.aCharArray5 = new char[local18];
			this.anIntArray1079 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray1079[local28] = arg0.method5312();
				local41 = arg0.method5330();
				this.aCharArray5[local28] = local41 == 0 ? 0 : Static294.method4424(local41);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method5350();
			this.anIntArray1080 = new int[local18];
			this.aCharArray6 = new char[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray1080[local28] = arg0.method5312();
				local41 = arg0.method5330();
				this.aCharArray6[local28] = local41 == 0 ? 0 : Static294.method4424(local41);
			}
		}
	}
}
