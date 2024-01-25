import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class3_Sub7_Sub9 extends Class3_Sub7 {

	@OriginalMember(owner = "client!haa", name = "E", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!haa", name = "F", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!haa", name = "K", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(CI)I")
	public int method3285(@OriginalArg(0) char arg0) {
		if (this.anIntArray171 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray171.length; local20++) {
			if (arg0 == this.aCharArray4[local20]) {
				return this.anIntArray171[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BC)I")
	public int method3286(@OriginalArg(1) char arg0) {
		if (this.anIntArray170 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray170.length; local20++) {
			if (arg0 == this.aCharArray5[local20]) {
				return this.anIntArray170[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ie;BI)V")
	private void method3287(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString102 = arg0.method6786();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(57) byte local57;
		if (arg1 == 2) {
			local34 = arg0.method6814();
			this.aCharArray4 = new char[local34];
			this.anIntArray171 = new int[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray171[local44] = arg0.method6811();
				local57 = arg0.method6825();
				this.aCharArray4[local44] = local57 == 0 ? 0 : Static135.method2636(local57);
			}
		} else if (arg1 == 3) {
			local34 = arg0.method6814();
			this.anIntArray170 = new int[local34];
			this.aCharArray5 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray170[local44] = arg0.method6811();
				local57 = arg0.method6825();
				this.aCharArray5[local44] = local57 == 0 ? 0 : Static135.method2636(local57);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	public void method3288() {
		@Pc(6) int local6;
		if (this.anIntArray170 != null) {
			for (local6 = 0; local6 < this.anIntArray170.length; local6++) {
				this.anIntArray170[local6] |= 0x8000;
			}
		}
		if (this.anIntArray171 != null) {
			for (local6 = 0; local6 < this.anIntArray171.length; local6++) {
				this.anIntArray171[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BLclient!ie;)V")
	public void method3290(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method3287(arg0, local5);
		}
	}
}
