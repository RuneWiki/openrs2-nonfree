import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!i", name = "G", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[Lclient!oc;")
	private Class70[] aClass70Array33;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ce;B)Lclient!oc;")
	public Class70 method1190(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) Class70 local7 = Static180.method2794(80);
		if (this.anIntArray87 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray87.length; local12++) {
				local7.method2031(this.aClass70Array33[local12]);
				local7.method2031(Static17.method310(this.anIntArray87[local12], this.anIntArrayArray7[local12], arg0.method1247(Static68.anIntArray77[this.anIntArray87[local12]])));
			}
		}
		local7.method2031(this.aClass70Array33[this.aClass70Array33.length - 1]);
		return local7.method2026();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([ILclient!ce;I)V")
	public void method1191(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (this.anIntArray87 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray87.length; local17++) {
			if (arg0.length <= local17) {
				return;
			}
			@Pc(25) int local25 = Static59.anIntArray135[this.method1200(local17)];
			if (local25 > 0) {
				arg1.method1261(local25, (long) arg0[local17]);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I")
	public int method1192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray87 == null || arg0 < 0 || this.anIntArray87.length < arg0) {
			return -1;
		} else if (this.anIntArrayArray7[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray7[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray7[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I")
	public int method1193() {
		return this.anIntArray87 == null ? 0 : this.anIntArray87.length;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Lclient!oc;")
	public Class70 method1197() {
		@Pc(3) Class70 local3 = Static180.method2794(80);
		local3.method2031(this.aClass70Array33[0]);
		for (@Pc(17) int local17 = 1; local17 < this.aClass70Array33.length; local17++) {
			local3.method2031(Static109.aClass70_1087);
			local3.method2031(this.aClass70Array33[local17]);
		}
		return local3.method2026();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ce;)V")
	private void method1199(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.aClass70Array33 = arg1.method1246().method2037(60);
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg0 == 2) {
			local13 = arg1.method1278();
			this.anIntArray88 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray88[local19] = arg1.method1270();
			}
		} else if (arg0 == 3) {
			local13 = arg1.method1278();
			this.anIntArray87 = new int[local13];
			this.anIntArrayArray7 = new int[local13][];
			for (local19 = 0; local19 < local13; local19++) {
				@Pc(60) int local60 = arg1.method1270();
				this.anIntArray87[local19] = local60;
				this.anIntArrayArray7[local19] = new int[Static149.anIntArray223[local60]];
				for (@Pc(75) int local75 = 0; local75 < Static149.anIntArray223[local60]; local75++) {
					this.anIntArrayArray7[local19][local75] = arg1.method1270();
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)I")
	public int method1200(@OriginalArg(1) int arg0) {
		return this.anIntArray87 == null || arg0 < 0 || this.anIntArray87.length < arg0 ? -1 : this.anIntArray87[arg0];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ce;Z)V")
	public void method1202(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1278();
			if (local11 == 0) {
				return;
			}
			this.method1199(local11, arg0);
		}
	}
}
