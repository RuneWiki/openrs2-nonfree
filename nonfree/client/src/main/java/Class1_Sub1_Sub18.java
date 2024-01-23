import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wi", name = "E", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!wi", name = "L", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "[I")
	public int[] anIntArray516;

	@OriginalMember(owner = "client!wi", name = "R", descriptor = "Lclient!hh;")
	public Class50 aClass50_1426;

	@OriginalMember(owner = "client!wi", name = "U", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLclient!pg;)V")
	public void method3514(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2142();
			if (local17 == 0) {
				return;
			}
			this.method3523(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)I")
	public int method3516(@OriginalArg(0) int arg0) {
		if (this.anIntArray517 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray517.length; local18++) {
			if (this.anIntArray515[local18] == arg0) {
				return this.anIntArray517[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
	public void method3520() {
		@Pc(12) int local12;
		if (this.anIntArray517 != null) {
			for (local12 = 0; local12 < this.anIntArray517.length; local12++) {
				this.anIntArray517[local12] |= 0x8000;
			}
		}
		if (this.anIntArray513 != null) {
			for (local12 = 0; local12 < this.anIntArray513.length; local12++) {
				this.anIntArray513[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
	public int method3521(@OriginalArg(1) int arg0) {
		if (this.anIntArray513 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray513.length; local17++) {
			if (arg0 == this.anIntArray516[local17]) {
				return this.anIntArray513[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!pg;I)V")
	private void method3523(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.aClass50_1426 = arg1.method2125();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(43) int local43;
		if (arg0 == 2) {
			local20 = arg1.method2142();
			this.anIntArray513 = new int[local20];
			this.anIntArray516 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray513[local30] = arg1.method2178();
				local43 = arg1.method2142();
				if (local43 == 0) {
					this.anIntArray516[local30] = -1;
				} else {
					this.anIntArray516[local30] = local43;
				}
			}
		} else if (arg0 == 3) {
			local20 = arg1.method2142();
			this.anIntArray517 = new int[local20];
			this.anIntArray515 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray517[local30] = arg1.method2178();
				local43 = arg1.method2142();
				if (local43 == 0) {
					this.anIntArray515[local30] = -1;
				} else {
					this.anIntArray515[local30] = local43;
				}
			}
		}
	}
}
