import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "[C")
	public char[] aCharArray8;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "[I")
	public int[] anIntArray516;

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "[C")
	public char[] aCharArray9;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(CI)I")
	public int method6395(@OriginalArg(0) char arg0) {
		if (this.anIntArray516 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray516.length; local17++) {
			if (this.aCharArray8[local17] == arg0) {
				return this.anIntArray516[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public void method6398() {
		@Pc(15) int local15;
		if (this.anIntArray515 != null) {
			for (local15 = 0; local15 < this.anIntArray515.length; local15++) {
				this.anIntArray515[local15] |= 0x8000;
			}
		}
		if (this.anIntArray516 != null) {
			for (local15 = 0; local15 < this.anIntArray516.length; local15++) {
				this.anIntArray516[local15] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BC)I")
	public int method6399(@OriginalArg(1) char arg0) {
		if (this.anIntArray515 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray515.length; local20++) {
			if (arg0 == this.aCharArray9[local20]) {
				return this.anIntArray515[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!es;)V")
	private void method6400(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.aString70 = arg1.method4324();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(40) byte local40;
		if (arg0 == 2) {
			local15 = arg1.method4325();
			this.anIntArray516 = new int[local15];
			this.aCharArray8 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray516[local25] = arg1.method4294();
				local40 = arg1.method4304();
				this.aCharArray8[local25] = local40 == 0 ? 0 : Static128.method2158(local40);
			}
		} else if (arg0 == 3) {
			local15 = arg1.method4325();
			this.aCharArray9 = new char[local15];
			this.anIntArray515 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray515[local25] = arg1.method4294();
				local40 = arg1.method4304();
				this.aCharArray9[local25] = local40 == 0 ? 0 : Static128.method2158(local40);
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!es;I)V")
	public void method6401(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4325();
			if (local15 == 0) {
				return;
			}
			this.method6400(local15, arg0);
		}
	}
}
