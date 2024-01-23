import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "[S")
	private short[] aShortArray153;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "[S")
	private short[] aShortArray156;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "[I")
	private int[] anIntArray473 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public int anInt4577 = -1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lclient!he;")
	public Class12_Sub6 method3163() {
		if (this.anIntArray471 == null) {
			return null;
		}
		@Pc(15) Class12_Sub6[] local15 = new Class12_Sub6[this.anIntArray471.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray471.length; local22++) {
			local15[local22] = Static72.method1336(Static39.aClass15_10, this.anIntArray471[local22]);
		}
		@Pc(55) Class12_Sub6 local55;
		if (local15.length == 1) {
			local55 = local15[0];
		} else {
			local55 = new Class12_Sub6(local15, local15.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray156 != null) {
			for (local66 = 0; local66 < this.aShortArray156.length; local66++) {
				local55.method1332(this.aShortArray156[local66], this.aShortArray154[local66]);
			}
		}
		if (this.aShortArray155 != null) {
			for (local66 = 0; local66 < this.aShortArray155.length; local66++) {
				local55.method1322(this.aShortArray155[local66], this.aShortArray153[local66]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ea;ZI)V")
	private void method3164(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4577 = arg0.method209();
			return;
		}
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (arg1 == 2) {
			local26 = arg0.method209();
			this.anIntArray471 = new int[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.anIntArray471[local32] = arg0.method163();
			}
		} else if (arg1 == 3) {
			this.aBoolean282 = true;
		} else if (arg1 == 40) {
			local26 = arg0.method209();
			this.aShortArray154 = new short[local26];
			this.aShortArray156 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray156[local32] = (short) arg0.method163();
				this.aShortArray154[local32] = (short) arg0.method163();
			}
		} else if (arg1 == 41) {
			local26 = arg0.method209();
			this.aShortArray153 = new short[local26];
			this.aShortArray155 = new short[local26];
			for (local32 = 0; local32 < local26; local32++) {
				this.aShortArray155[local32] = (short) arg0.method163();
				this.aShortArray153[local32] = (short) arg0.method163();
			}
			return;
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray473[arg1 - 60] = arg0.method163();
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Lclient!he;")
	public Class12_Sub6 method3166() {
		@Pc(12) int local12 = 0;
		@Pc(15) Class12_Sub6[] local15 = new Class12_Sub6[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray473[local17] != -1) {
				local15[local12++] = Static72.method1336(Static39.aClass15_10, this.anIntArray473[local17]);
			}
		}
		@Pc(48) Class12_Sub6 local48 = new Class12_Sub6(local15, local12);
		@Pc(53) int local53;
		if (this.aShortArray156 != null) {
			for (local53 = 0; local53 < this.aShortArray156.length; local53++) {
				local48.method1332(this.aShortArray156[local53], this.aShortArray154[local53]);
			}
		}
		if (this.aShortArray155 != null) {
			for (local53 = 0; local53 < this.aShortArray155.length; local53++) {
				local48.method1322(this.aShortArray155[local53], this.aShortArray153[local53]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z")
	public boolean method3168() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray473[local5] != -1 && !Static39.aClass15_10.method409(this.anIntArray473[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ea;)V")
	public void method3169(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method209();
			if (local17 == 0) {
				return;
			}
			this.method3164(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)Z")
	public boolean method3170() {
		if (this.anIntArray471 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray471.length; local22++) {
			if (!Static39.aClass15_10.method409(this.anIntArray471[local22], 0)) {
				local12 = false;
			}
		}
		return local12;
	}
}
