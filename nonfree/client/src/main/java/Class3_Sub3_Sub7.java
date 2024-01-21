import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "[I")
	private int[] anIntArray290;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	public int anInt1647 = -1;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "[I")
	private final int[] anIntArray289 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "[I")
	private final int[] anIntArray292 = new int[6];

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "[I")
	private final int[] anIntArray291 = new int[6];

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1179() {
		@Pc(8) Class3_Sub3_Sub1_Sub1[] local8 = new Class3_Sub3_Sub1_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray289[local12] != -1) {
				local8[local10++] = Static21.method398(Static107.aClass54_34, this.anIntArray289[local12]);
			}
		}
		@Pc(41) Class3_Sub3_Sub1_Sub1 local41 = new Class3_Sub3_Sub1_Sub1(local8, local10);
		for (@Pc(43) int local43 = 0; local43 < 6 && this.anIntArray292[local43] != 0; local43++) {
			local41.method406(this.anIntArray292[local43], this.anIntArray291[local43]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!wd;)V")
	public void method1183(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1421();
			if (local8 == 0) {
				return;
			}
			this.method1187(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z")
	public boolean method1186() {
		if (this.anIntArray290 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray290.length; local14++) {
			if (!Static107.aClass54_34.method1598(this.anIntArray290[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!wd;Z)V")
	private void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt1647 = arg1.method1421();
		} else if (arg0 == 2) {
			@Pc(87) int local87 = arg1.method1421();
			this.anIntArray290 = new int[local87];
			for (@Pc(93) int local93 = 0; local93 < local87; local93++) {
				this.anIntArray290[local93] = arg1.method1451();
			}
		} else if (arg0 == 3) {
			this.aBoolean87 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray292[arg0 - 40] = arg1.method1451();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray291[arg0 - 50] = arg1.method1451();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray289[arg0 - 60] = arg1.method1451();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z")
	public boolean method1190() {
		@Pc(7) boolean local7 = true;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray289[local17] != -1 && !Static107.aClass54_34.method1598(this.anIntArray289[local17], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1191() {
		if (this.anIntArray290 == null) {
			return null;
		}
		@Pc(15) Class3_Sub3_Sub1_Sub1[] local15 = new Class3_Sub3_Sub1_Sub1[this.anIntArray290.length];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray290.length; local25++) {
			local15[local25] = Static21.method398(Static107.aClass54_34, this.anIntArray290[local25]);
		}
		@Pc(53) Class3_Sub3_Sub1_Sub1 local53;
		if (local15.length == 1) {
			local53 = local15[0];
		} else {
			local53 = new Class3_Sub3_Sub1_Sub1(local15, local15.length);
		}
		for (@Pc(64) int local64 = 0; local64 < 6 && this.anIntArray292[local64] != 0; local64++) {
			local53.method406(this.anIntArray292[local64], this.anIntArray291[local64]);
		}
		return local53;
	}
}
