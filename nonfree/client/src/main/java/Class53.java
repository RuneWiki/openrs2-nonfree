import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class53 {

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
	private int[] anIntArray145 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
	public int anInt1662 = -1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Lclient!rd;")
	public Class15_Sub6 method1579() {
		if (this.anIntArray146 == null) {
			return null;
		}
		@Pc(16) Class15_Sub6[] local16 = new Class15_Sub6[this.anIntArray146.length];
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray146.length; local18++) {
			local16[local18] = Static241.method3755(Static29.aClass121_15, this.anIntArray146[local18]);
		}
		@Pc(48) Class15_Sub6 local48;
		if (local16.length == 1) {
			local48 = local16[0];
		} else {
			local48 = new Class15_Sub6(local16, local16.length);
		}
		@Pc(61) int local61;
		if (this.aShortArray32 != null) {
			for (local61 = 0; local61 < this.aShortArray32.length; local61++) {
				local48.method3775(this.aShortArray32[local61], this.aShortArray34[local61]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local61 = 0; local61 < this.aShortArray31.length; local61++) {
				local48.method3767(this.aShortArray31[local61], this.aShortArray33[local61]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLclient!lf;I)V")
	private void method1581(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1662 = arg0.method1378();
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (arg1 == 2) {
			local51 = arg0.method1378();
			this.anIntArray146 = new int[local51];
			for (local61 = 0; local61 < local51; local61++) {
				this.anIntArray146[local61] = arg0.method1386();
			}
		} else if (arg1 == 3) {
			this.aBoolean89 = true;
		} else if (arg1 == 40) {
			local51 = arg0.method1378();
			this.aShortArray32 = new short[local51];
			this.aShortArray34 = new short[local51];
			for (local61 = 0; local61 < local51; local61++) {
				this.aShortArray32[local61] = (short) arg0.method1386();
				this.aShortArray34[local61] = (short) arg0.method1386();
			}
		} else if (arg1 == 41) {
			local51 = arg0.method1378();
			this.aShortArray31 = new short[local51];
			this.aShortArray33 = new short[local51];
			for (local61 = 0; local61 < local51; local61++) {
				this.aShortArray31[local61] = (short) arg0.method1386();
				this.aShortArray33[local61] = (short) arg0.method1386();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray145[arg1 - 60] = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Lclient!rd;")
	public Class15_Sub6 method1582() {
		@Pc(4) Class15_Sub6[] local4 = new Class15_Sub6[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray145[local12] != -1) {
				local4[local10++] = Static241.method3755(Static29.aClass121_15, this.anIntArray145[local12]);
			}
		}
		@Pc(50) Class15_Sub6 local50 = new Class15_Sub6(local4, local10);
		@Pc(56) int local56;
		if (this.aShortArray32 != null) {
			for (local56 = 0; local56 < this.aShortArray32.length; local56++) {
				local50.method3775(this.aShortArray32[local56], this.aShortArray34[local56]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local56 = 0; local56 < this.aShortArray31.length; local56++) {
				local50.method3767(this.aShortArray31[local56], this.aShortArray33[local56]);
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Z")
	public boolean method1583() {
		@Pc(3) boolean local3 = true;
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			if (this.anIntArray145[local13] != -1 && !Static29.aClass121_15.method3110(this.anIntArray145[local13], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Z")
	public boolean method1584() {
		if (this.anIntArray146 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray146.length; local15++) {
			if (!Static29.aClass121_15.method3110(this.anIntArray146[local15], 0)) {
				local13 = false;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!lf;)V")
	public void method1585(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1378();
			if (local13 == 0) {
				return;
			}
			this.method1581(arg0, local13);
		}
	}
}
