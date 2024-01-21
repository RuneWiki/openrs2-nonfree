import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "[Lclient!oc;")
	private Class65[] aClass65Array60;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!ve", name = "ib", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "[I")
	public int[] anIntArray488;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
	public int method3200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray487 == null || arg0 < 0 || arg0 > this.anIntArray487.length) {
			return -1;
		} else if (this.anIntArrayArray39[arg0] == null || arg1 < 0 || this.anIntArrayArray39[arg0].length < arg1) {
			return -1;
		} else {
			return this.anIntArrayArray39[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[ILclient!wa;)V")
	public void method3201(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (this.anIntArray487 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray487.length; local17++) {
			if (arg0.length <= local17) {
				return;
			}
			@Pc(25) int local25 = Static98.anIntArray277[this.method3204(local17)];
			if (local25 > 0) {
				arg1.method1751(local25, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)I")
	public int method3203() {
		return this.anIntArray487 == null ? 0 : this.anIntArray487.length;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I")
	public int method3204(@OriginalArg(0) int arg0) {
		return this.anIntArray487 == null || arg0 < 0 || arg0 > this.anIntArray487.length ? -1 : this.anIntArray487[arg0];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wa;Z)V")
	public void method3205(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1738();
			if (local3 == 0) {
				return;
			}
			this.method3208(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)Lclient!oc;")
	public Class65 method3206() {
		@Pc(7) Class65 local7 = Static172.method2919(80);
		local7.method2474(this.aClass65Array60[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aClass65Array60.length; local22++) {
			local7.method2474(Static34.aClass65_652);
			local7.method2474(this.aClass65Array60[local22]);
		}
		return local7.method2469();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!wa;)Lclient!oc;")
	public Class65 method3207(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(7) Class65 local7 = Static172.method2919(80);
		if (this.anIntArray487 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray487.length; local19++) {
				local7.method2474(this.aClass65Array60[local19]);
				local7.method2474(Static163.method2805(arg0.method1708(Static12.anIntArray37[this.anIntArray487[local19]]), this.anIntArray487[local19], this.anIntArrayArray39[local19]));
			}
		}
		local7.method2474(this.aClass65Array60[this.aClass65Array60.length - 1]);
		return local7.method2469();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!wa;II)V")
	private void method3208(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass65Array60 = arg0.method1706().method2447(60);
			return;
		}
		@Pc(27) int local27;
		@Pc(37) int local37;
		if (arg1 == 2) {
			local27 = arg0.method1738();
			this.anIntArray488 = new int[local27];
			for (local37 = 0; local37 < local27; local37++) {
				this.anIntArray488[local37] = arg0.method1753();
			}
		} else if (arg1 == 3) {
			local27 = arg0.method1738();
			this.anIntArray487 = new int[local27];
			this.anIntArrayArray39 = new int[local27][];
			for (local37 = 0; local37 < local27; local37++) {
				@Pc(42) int local42 = arg0.method1753();
				this.anIntArray487[local37] = local42;
				this.anIntArrayArray39[local37] = new int[Static12.anIntArray34[local42]];
				for (@Pc(57) int local57 = 0; local57 < Static12.anIntArray34[local42]; local57++) {
					this.anIntArrayArray39[local37][local57] = arg0.method1753();
				}
			}
		}
	}
}
