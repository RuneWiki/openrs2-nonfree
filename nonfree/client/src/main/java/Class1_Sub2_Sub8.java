import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
	public int[] anIntArray91;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!oc;")
	public Class65 aClass65_654;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "[I")
	public int[] anIntArray93;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)I")
	public int method654(@OriginalArg(0) int arg0) {
		if (this.anIntArray91 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray91.length; local15++) {
			if (this.anIntArray93[local15] == arg0) {
				return this.anIntArray91[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!wa;)V")
	public void method655(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1738();
			if (local7 == 0) {
				return;
			}
			this.method657(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)I")
	public int method656(@OriginalArg(0) int arg0) {
		if (this.anIntArray94 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray94.length; local10++) {
			if (arg0 == this.anIntArray92[local10]) {
				return this.anIntArray94[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!wa;)V")
	private void method657(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aClass65_654 = arg1.method1706();
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		@Pc(49) int local49;
		if (arg0 == 2) {
			local27 = arg1.method1738();
			this.anIntArray94 = new int[local27];
			this.anIntArray92 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray94[local37] = arg1.method1753();
				local49 = arg1.method1738();
				if (local49 == 0) {
					this.anIntArray92[local37] = -1;
				} else {
					this.anIntArray92[local37] = local49;
				}
			}
		} else if (arg0 == 3) {
			local27 = arg1.method1738();
			this.anIntArray91 = new int[local27];
			this.anIntArray93 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray91[local37] = arg1.method1753();
				local49 = arg1.method1738();
				if (local49 == 0) {
					this.anIntArray93[local37] = -1;
				} else {
					this.anIntArray93[local37] = local49;
				}
			}
		}
	}
}
