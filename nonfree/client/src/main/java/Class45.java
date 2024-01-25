import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class45 {

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
	private int[] anIntArray101;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[I")
	private final int[] anIntArray100 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	public int anInt1293 = -1;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!dg;I)V")
	private void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt1293 = arg1.method4421();
			return;
		}
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (arg0 == 2) {
			local39 = arg1.method4421();
			this.anIntArray101 = new int[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.anIntArray101[local49] = arg1.method4464();
			}
		} else if (arg0 == 3) {
			this.aBoolean118 = true;
		} else if (arg0 == 40) {
			local39 = arg1.method4421();
			this.aShortArray33 = new short[local39];
			this.aShortArray32 = new short[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.aShortArray33[local49] = (short) arg1.method4464();
				this.aShortArray32[local49] = (short) arg1.method4464();
			}
		} else if (arg0 == 41) {
			local39 = arg1.method4421();
			this.aShortArray31 = new short[local39];
			this.aShortArray34 = new short[local39];
			for (local49 = 0; local49 < local39; local49++) {
				this.aShortArray31[local49] = (short) arg1.method4464();
				this.aShortArray34[local49] = (short) arg1.method4464();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray100[arg0 - 60] = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)Z")
	public boolean method1354() {
		if (this.anIntArray101 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class191 local14 = Static182.aClass191_114;
		synchronized (Static182.aClass191_114) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray101.length; local18++) {
				if (!Static182.aClass191_114.method5454(this.anIntArray101[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lclient!tr;")
	public Class192 method1355() {
		@Pc(14) Class192[] local14 = new Class192[5];
		@Pc(16) int local16 = 0;
		@Pc(18) Class191 local18 = Static182.aClass191_114;
		synchronized (Static182.aClass191_114) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray100[local22] != -1) {
					local14[local16++] = Static111.method2400(Static182.aClass191_114, this.anIntArray100[local22]);
				}
			}
		}
		@Pc(58) Class192 local58 = new Class192(local14, local16);
		@Pc(63) int local63;
		if (this.aShortArray33 != null) {
			for (local63 = 0; local63 < this.aShortArray33.length; local63++) {
				local58.method5476(this.aShortArray33[local63], this.aShortArray32[local63]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local63 = 0; local63 < this.aShortArray31.length; local63++) {
				local58.method5472(this.aShortArray34[local63], this.aShortArray31[local63]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Lclient!tr;")
	public Class192 method1357() {
		if (this.anIntArray101 == null) {
			return null;
		}
		@Pc(20) Class192[] local20 = new Class192[this.anIntArray101.length];
		@Pc(22) Class191 local22 = Static182.aClass191_114;
		synchronized (Static182.aClass191_114) {
			@Pc(26) int local26 = 0;
			while (true) {
				if (local26 >= this.anIntArray101.length) {
					break;
				}
				local20[local26] = Static111.method2400(Static182.aClass191_114, this.anIntArray101[local26]);
				local26++;
			}
		}
		@Pc(63) Class192 local63;
		if (local20.length == 1) {
			local63 = local20[0];
		} else {
			local63 = new Class192(local20, local20.length);
		}
		if (local63 == null) {
			return null;
		}
		@Pc(80) int local80;
		if (this.aShortArray33 != null) {
			for (local80 = 0; local80 < this.aShortArray33.length; local80++) {
				local63.method5476(this.aShortArray33[local80], this.aShortArray32[local80]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local80 = 0; local80 < this.aShortArray31.length; local80++) {
				local63.method5472(this.aShortArray34[local80], this.aShortArray31[local80]);
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!dg;B)V")
	public void method1358(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4421();
			if (local15 == 0) {
				return;
			}
			this.method1353(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	public boolean method1359() {
		@Pc(12) boolean local12 = true;
		@Pc(14) Class191 local14 = Static182.aClass191_114;
		synchronized (Static182.aClass191_114) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray100[local18] != -1 && !Static182.aClass191_114.method5454(this.anIntArray100[local18], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}
