import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class125 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
	private int[] anIntArray279;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!oi;")
	public Class170 aClass170_1;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
	private final int[] anIntArray280 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z")
	public boolean method3286() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class83 local11 = this.aClass170_1.aClass83_86;
		synchronized (this.aClass170_1.aClass83_86) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray280[local15] != -1 && !this.aClass170_1.aClass83_86.method1949(0, this.anIntArray280[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lclient!kp;")
	public Class130 method3288() {
		if (this.anIntArray279 == null) {
			return null;
		}
		@Pc(15) Class130[] local15 = new Class130[this.anIntArray279.length];
		@Pc(19) Class83 local19 = this.aClass170_1.aClass83_86;
		synchronized (this.aClass170_1.aClass83_86) {
			@Pc(23) int local23 = 0;
			while (true) {
				if (this.anIntArray279.length <= local23) {
					break;
				}
				local15[local23] = Static215.method3852(this.aClass170_1.aClass83_86, this.anIntArray279[local23]);
				local23++;
			}
		}
		@Pc(58) Class130 local58;
		if (local15.length == 1) {
			local58 = local15[0];
		} else {
			local58 = new Class130(local15, local15.length);
		}
		if (local58 == null) {
			return null;
		}
		@Pc(82) int local82;
		if (this.aShortArray32 != null) {
			for (local82 = 0; local82 < this.aShortArray32.length; local82++) {
				local58.method3411(this.aShortArray32[local82], this.aShortArray33[local82]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local82 = 0; local82 < this.aShortArray31.length; local82++) {
				local58.method3419(this.aShortArray31[local82], this.aShortArray30[local82]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!vt;)V")
	public void method3289(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5732();
			if (local12 == 0) {
				return;
			}
			this.method3293(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z")
	public boolean method3290() {
		if (this.anIntArray279 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class83 local16 = this.aClass170_1.aClass83_86;
		synchronized (this.aClass170_1.aClass83_86) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray279.length; local20++) {
				if (!this.aClass170_1.aClass83_86.method1949(0, this.anIntArray279[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)Lclient!kp;")
	public Class130 method3292() {
		@Pc(8) Class130[] local8 = new Class130[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class83 local14 = this.aClass170_1.aClass83_86;
		synchronized (this.aClass170_1.aClass83_86) {
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray280[local18] != -1) {
					local8[local10++] = Static215.method3852(this.aClass170_1.aClass83_86, this.anIntArray280[local18]);
				}
			}
		}
		@Pc(65) Class130 local65 = new Class130(local8, local10);
		@Pc(70) int local70;
		if (this.aShortArray32 != null) {
			for (local70 = 0; local70 < this.aShortArray32.length; local70++) {
				local65.method3411(this.aShortArray32[local70], this.aShortArray33[local70]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local70 = 0; local70 < this.aShortArray31.length; local70++) {
				local65.method3419(this.aShortArray31[local70], this.aShortArray30[local70]);
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!vt;IB)V")
	private void method3293(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method5732();
			return;
		}
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (arg1 == 2) {
			local33 = arg0.method5732();
			this.anIntArray279 = new int[local33];
			for (local43 = 0; local43 < local33; local43++) {
				this.anIntArray279[local43] = arg0.method5753();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local33 = arg0.method5732();
				this.aShortArray33 = new short[local33];
				this.aShortArray32 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray32[local43] = (short) arg0.method5753();
					this.aShortArray33[local43] = (short) arg0.method5753();
				}
				return;
			}
			if (arg1 == 41) {
				local33 = arg0.method5732();
				this.aShortArray30 = new short[local33];
				this.aShortArray31 = new short[local33];
				for (local43 = 0; local43 < local33; local43++) {
					this.aShortArray31[local43] = (short) arg0.method5753();
					this.aShortArray30[local43] = (short) arg0.method5753();
				}
				return;
			}
			if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray280[arg1 - 60] = arg0.method5753();
				return;
			}
		}
	}
}
