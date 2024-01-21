import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "[I")
	public int[] anIntArray100;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "Lclient!qe;")
	public Class83 aClass83_401;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ra;B)V")
	private void method1021(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.aClass83_401 = arg1.method259();
			return;
		}
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(41) int local41;
		if (arg0 == 2) {
			local18 = arg1.method260();
			this.anIntArray100 = new int[local18];
			this.anIntArray101 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray101[local28] = arg1.method269();
				local41 = arg1.method260();
				if (local41 == 0) {
					this.anIntArray100[local28] = -1;
				} else {
					this.anIntArray100[local28] = local41;
				}
			}
		} else if (arg0 == 3) {
			local18 = arg1.method260();
			this.anIntArray103 = new int[local18];
			this.anIntArray99 = new int[local18];
			for (local28 = 0; local28 < local18; local28++) {
				this.anIntArray103[local28] = arg1.method269();
				local41 = arg1.method260();
				if (local41 == 0) {
					this.anIntArray99[local28] = -1;
				} else {
					this.anIntArray99[local28] = local41;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)I")
	public int method1022(@OriginalArg(0) int arg0) {
		if (this.anIntArray101 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray101.length; local17++) {
			if (arg0 == this.anIntArray100[local17]) {
				return this.anIntArray101[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!ra;)V")
	public void method1024(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method260();
			if (local5 == 0) {
				return;
			}
			this.method1021(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
	public int method1025(@OriginalArg(1) int arg0) {
		if (this.anIntArray103 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray103.length; local20++) {
			if (arg0 == this.anIntArray99[local20]) {
				return this.anIntArray103[local20];
			}
		}
		return -1;
	}
}
