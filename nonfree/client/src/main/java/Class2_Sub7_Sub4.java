import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub7_Sub4 extends Class2_Sub7 {

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!fb", name = "E", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!sl;)V")
	public void method2628(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2859();
			if (local7 == 0) {
				return;
			}
			this.method2632(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BC)I")
	public int method2629(@OriginalArg(1) char arg0) {
		if (this.anIntArray200 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray200.length; local15++) {
			if (this.aCharArray4[local15] == arg0) {
				return this.anIntArray200[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IC)I")
	public int method2630(@OriginalArg(1) char arg0) {
		if (this.anIntArray201 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray201.length; local16++) {
			if (arg0 == this.aCharArray5[local16]) {
				return this.anIntArray201[local16];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method2631() {
		@Pc(8) int local8;
		if (this.anIntArray201 != null) {
			for (local8 = 0; local8 < this.anIntArray201.length; local8++) {
				this.anIntArray201[local8] |= 0x8000;
			}
		}
		if (this.anIntArray200 != null) {
			for (local8 = 0; local8 < this.anIntArray200.length; local8++) {
				this.anIntArray200[local8] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method2632(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString29 = arg0.method2833();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		@Pc(44) byte local44;
		if (arg1 == 2) {
			local22 = arg0.method2859();
			this.aCharArray4 = new char[local22];
			this.anIntArray200 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray200[local32] = arg0.method2825();
				local44 = arg0.method2860();
				this.aCharArray4[local32] = local44 == 0 ? 0 : Static95.method1918(local44);
			}
		} else if (arg1 == 3) {
			local22 = arg0.method2859();
			this.anIntArray201 = new int[local22];
			this.aCharArray5 = new char[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray201[local32] = arg0.method2825();
				local44 = arg0.method2860();
				this.aCharArray5[local32] = local44 == 0 ? 0 : Static95.method1918(local44);
			}
		}
	}
}
