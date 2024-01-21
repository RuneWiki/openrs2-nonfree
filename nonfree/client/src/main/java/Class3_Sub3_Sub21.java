import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub3_Sub21 extends Class3_Sub3 {

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!oc;")
	public Class70 aClass70_1521;

	@OriginalMember(owner = "client!q", name = "H", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!q", name = "M", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!q", name = "O", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!q", name = "U", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)I")
	public int method2280(@OriginalArg(0) int arg0) {
		if (this.anIntArray228 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray228.length; local18++) {
			if (arg0 == this.anIntArray231[local18]) {
				return this.anIntArray228[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!ce;)V")
	public void method2281(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1278();
			if (local7 == 0) {
				return;
			}
			this.method2285(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(II)I")
	public int method2284(@OriginalArg(0) int arg0) {
		if (this.anIntArray230 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray230.length; local10++) {
			if (arg0 == this.anIntArray229[local10]) {
				return this.anIntArray230[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method2285(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aClass70_1521 = arg0.method1246();
			return;
		}
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(52) int local52;
		if (arg1 == 2) {
			local30 = arg0.method1278();
			this.anIntArray231 = new int[local30];
			this.anIntArray228 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray228[local40] = arg0.method1270();
				local52 = arg0.method1278();
				if (local52 == 0) {
					this.anIntArray231[local40] = -1;
				} else {
					this.anIntArray231[local40] = local52;
				}
			}
		} else if (arg1 == 3) {
			local30 = arg0.method1278();
			this.anIntArray230 = new int[local30];
			this.anIntArray229 = new int[local30];
			for (local40 = 0; local40 < local30; local40++) {
				this.anIntArray230[local40] = arg0.method1270();
				local52 = arg0.method1278();
				if (local52 == 0) {
					this.anIntArray229[local40] = -1;
				} else {
					this.anIntArray229[local40] = local52;
				}
			}
		}
	}
}
