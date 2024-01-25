import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!md", name = "C", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!md", name = "G", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!md", name = "I", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!rp;I)V")
	private void method3316(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString39 = arg0.method2788();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(38) byte local38;
		if (arg1 == 2) {
			local15 = arg0.method2739();
			this.aCharArray8 = new char[local15];
			this.anIntArray411 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray411[local25] = arg0.method2767();
				local38 = arg0.method2753();
				this.aCharArray8[local25] = local38 == 0 ? 0 : Static240.method4859(local38);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method2739();
			this.anIntArray412 = new int[local15];
			this.aCharArray9 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray412[local25] = arg0.method2767();
				local38 = arg0.method2753();
				this.aCharArray9[local25] = local38 == 0 ? 0 : Static240.method4859(local38);
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!rp;B)V")
	public void method3317(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2739();
			if (local5 == 0) {
				return;
			}
			this.method3316(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IC)I")
	public int method3318(@OriginalArg(1) char arg0) {
		if (this.anIntArray412 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray412.length; local18++) {
			if (arg0 == this.aCharArray9[local18]) {
				return this.anIntArray412[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
	public void method3321() {
		@Pc(14) int local14;
		if (this.anIntArray412 != null) {
			for (local14 = 0; local14 < this.anIntArray412.length; local14++) {
				this.anIntArray412[local14] |= 0x8000;
			}
		}
		if (this.anIntArray411 != null) {
			for (local14 = 0; local14 < this.anIntArray411.length; local14++) {
				this.anIntArray411[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(IC)I")
	public int method3323(@OriginalArg(1) char arg0) {
		if (this.anIntArray411 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray411.length; local12++) {
			if (arg0 == this.aCharArray8[local12]) {
				return this.anIntArray411[local12];
			}
		}
		return -1;
	}
}
