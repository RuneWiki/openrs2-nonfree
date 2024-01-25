import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class86 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!eb;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
	private final int[] anIntArray135 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z")
	public boolean method1726() {
		if (this.anIntArray136 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class188 local16 = this.aClass61_2.aClass188_26;
		synchronized (this.aClass61_2.aClass188_26) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray136.length; local20++) {
				if (!this.aClass61_2.aClass188_26.method4298(0, this.anIntArray136[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!md;)V")
	public void method1727(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method1732(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Lclient!wp;")
	public Class266 method1729() {
		@Pc(8) Class266[] local8 = new Class266[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class188 local14 = this.aClass61_2.aClass188_26;
		@Pc(18) int local18;
		synchronized (this.aClass61_2.aClass188_26) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray135[local18] != -1) {
					local8[local10++] = Static92.method1558(this.aClass61_2.aClass188_26, this.anIntArray135[local18]);
				}
				local18++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local8[local54] != null && local8[local54].anInt7819 < 13) {
				local8[local54].method6061();
			}
		}
		@Pc(84) Class266 local84 = new Class266(local8, local10);
		if (this.aShortArray25 != null) {
			for (local18 = 0; local18 < this.aShortArray25.length; local18++) {
				local84.method6058(this.aShortArray25[local18], this.aShortArray23[local18]);
			}
		}
		if (this.aShortArray24 != null) {
			for (local18 = 0; local18 < this.aShortArray24.length; local18++) {
				local84.method6055(this.aShortArray26[local18], this.aShortArray24[local18]);
			}
		}
		return local84;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)Lclient!wp;")
	public Class266 method1730() {
		if (this.anIntArray136 == null) {
			return null;
		}
		@Pc(15) Class266[] local15 = new Class266[this.anIntArray136.length];
		@Pc(19) Class188 local19 = this.aClass61_2.aClass188_26;
		@Pc(23) int local23;
		synchronized (this.aClass61_2.aClass188_26) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray136.length) {
					break;
				}
				local15[local23] = Static92.method1558(this.aClass61_2.aClass188_26, this.anIntArray136[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray136.length; local56++) {
			if (local15[local56].anInt7819 < 13) {
				local15[local56].method6061();
			}
		}
		@Pc(93) Class266 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class266(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray25 != null) {
			for (local23 = 0; local23 < this.aShortArray25.length; local23++) {
				local93.method6058(this.aShortArray25[local23], this.aShortArray23[local23]);
			}
		}
		if (this.aShortArray24 != null) {
			for (local23 = 0; local23 < this.aShortArray24.length; local23++) {
				local93.method6055(this.aShortArray26[local23], this.aShortArray24[local23]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!md;II)V")
	private void method1732(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method3737();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local23 = arg0.method3737();
			this.anIntArray136 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray136[local33] = arg0.method3711();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method3737();
				this.aShortArray23 = new short[local23];
				this.aShortArray25 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray25[local33] = (short) arg0.method3711();
					this.aShortArray23[local33] = (short) arg0.method3711();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method3737();
				this.aShortArray26 = new short[local23];
				this.aShortArray24 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray24[local33] = (short) arg0.method3711();
					this.aShortArray26[local33] = (short) arg0.method3711();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray135[arg1 - 60] = arg0.method3711();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z")
	public boolean method1733() {
		@Pc(13) boolean local13 = true;
		@Pc(17) Class188 local17 = this.aClass61_2.aClass188_26;
		synchronized (this.aClass61_2.aClass188_26) {
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray135[local21] != -1 && !this.aClass61_2.aClass188_26.method4298(0, this.anIntArray135[local21])) {
					local13 = false;
				}
			}
			return local13;
		}
	}
}
