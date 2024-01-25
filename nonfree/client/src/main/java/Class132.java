import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class132 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
	public int anInt3865 = -1;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[I")
	private final int[] anIntArray334 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)Lclient!g;")
	public Class71 method3588() {
		@Pc(8) Class71[] local8 = new Class71[5];
		@Pc(10) int local10 = 0;
		@Pc(12) Class143 local12 = Static17.aClass143_12;
		synchronized (Static17.aClass143_12) {
			for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
				if (this.anIntArray334[local16] != -1) {
					local8[local10++] = Static222.method3992(this.anIntArray334[local16], Static17.aClass143_12);
				}
			}
		}
		@Pc(55) Class71 local55 = new Class71(local8, local10);
		@Pc(60) int local60;
		if (this.aShortArray92 != null) {
			for (local60 = 0; local60 < this.aShortArray92.length; local60++) {
				local55.method2179(this.aShortArray91[local60], this.aShortArray92[local60]);
			}
		}
		if (this.aShortArray90 != null) {
			for (local60 = 0; local60 < this.aShortArray90.length; local60++) {
				local55.method2190(this.aShortArray89[local60], this.aShortArray90[local60]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z")
	public boolean method3589() {
		if (this.anIntArray333 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(14) Class143 local14 = Static17.aClass143_12;
		synchronized (Static17.aClass143_12) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray333.length; local18++) {
				if (!Static17.aClass143_12.method3749(0, this.anIntArray333[local18])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILclient!jg;)V")
	private void method3590(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt3865 = arg1.method2548();
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg0 == 2) {
			local21 = arg1.method2548();
			this.anIntArray333 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray333[local27] = arg1.method2498();
			}
			return;
		}
		if (arg0 == 3) {
			this.aBoolean244 = true;
			return;
		}
		if (arg0 == 40) {
			local21 = arg1.method2548();
			this.aShortArray91 = new short[local21];
			this.aShortArray92 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray92[local27] = (short) arg1.method2498();
				this.aShortArray91[local27] = (short) arg1.method2498();
			}
			return;
		}
		if (arg0 == 41) {
			local21 = arg1.method2548();
			this.aShortArray89 = new short[local21];
			this.aShortArray90 = new short[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.aShortArray90[local27] = (short) arg1.method2498();
				this.aShortArray89[local27] = (short) arg1.method2498();
			}
			return;
		}
		if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray334[arg0 - 60] = arg1.method2498();
			return;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z")
	public boolean method3591() {
		@Pc(7) boolean local7 = true;
		@Pc(9) Class143 local9 = Static17.aClass143_12;
		synchronized (Static17.aClass143_12) {
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray334[local13] != -1 && !Static17.aClass143_12.method3749(0, this.anIntArray334[local13])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!jg;)V")
	public void method3592(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2548();
			if (local13 == 0) {
				return;
			}
			this.method3590(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)Lclient!g;")
	public Class71 method3595() {
		if (this.anIntArray333 == null) {
			return null;
		}
		@Pc(15) Class71[] local15 = new Class71[this.anIntArray333.length];
		@Pc(17) Class143 local17 = Static17.aClass143_12;
		synchronized (Static17.aClass143_12) {
			@Pc(21) int local21 = 0;
			while (true) {
				if (this.anIntArray333.length <= local21) {
					break;
				}
				local15[local21] = Static222.method3992(this.anIntArray333[local21], Static17.aClass143_12);
				local21++;
			}
		}
		@Pc(59) Class71 local59;
		if (local15.length == 1) {
			local59 = local15[0];
		} else {
			local59 = new Class71(local15, local15.length);
		}
		if (local59 == null) {
			return null;
		}
		@Pc(79) int local79;
		if (this.aShortArray92 != null) {
			for (local79 = 0; local79 < this.aShortArray92.length; local79++) {
				local59.method2179(this.aShortArray91[local79], this.aShortArray92[local79]);
			}
		}
		if (this.aShortArray90 != null) {
			for (local79 = 0; local79 < this.aShortArray90.length; local79++) {
				local59.method2190(this.aShortArray89[local79], this.aShortArray90[local79]);
			}
		}
		return local59;
	}
}
