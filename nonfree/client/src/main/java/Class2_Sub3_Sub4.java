import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "Lclient!qe;")
	public Class78 aClass78_129;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
	public int[] anIntArray118;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
	public int method509(@OriginalArg(0) int arg0) {
		if (this.anIntArray115 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray115.length; local16++) {
			if (this.anIntArray117[local16] == arg0) {
				return this.anIntArray115[local16];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public void method513() {
		@Pc(4) int local4;
		if (this.anIntArray115 != null) {
			for (local4 = 0; local4 < this.anIntArray115.length; local4++) {
				this.anIntArray115[local4] |= 0x8000;
			}
		}
		if (this.anIntArray118 != null) {
			for (local4 = 0; local4 < this.anIntArray118.length; local4++) {
				this.anIntArray118[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!nh;I)V")
	private void method514(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.aClass78_129 = arg1.method2115();
			return;
		}
		@Pc(19) int local19;
		@Pc(29) int local29;
		@Pc(41) int local41;
		if (arg0 == 2) {
			local19 = arg1.method2122();
			this.anIntArray116 = new int[local19];
			this.anIntArray118 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray118[local29] = arg1.method2095();
				local41 = arg1.method2122();
				if (local41 == 0) {
					this.anIntArray116[local29] = -1;
				} else {
					this.anIntArray116[local29] = local41;
				}
			}
		} else if (arg0 == 3) {
			local19 = arg1.method2122();
			this.anIntArray117 = new int[local19];
			this.anIntArray115 = new int[local19];
			for (local29 = 0; local29 < local19; local29++) {
				this.anIntArray115[local29] = arg1.method2095();
				local41 = arg1.method2122();
				if (local41 == 0) {
					this.anIntArray117[local29] = -1;
				} else {
					this.anIntArray117[local29] = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!nh;B)V")
	public void method515(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2122();
			if (local3 == 0) {
				return;
			}
			this.method514(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)I")
	public int method516(@OriginalArg(0) int arg0) {
		if (this.anIntArray118 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray118.length; local15++) {
			if (arg0 == this.anIntArray116[local15]) {
				return this.anIntArray118[local15];
			}
		}
		return -1;
	}
}
