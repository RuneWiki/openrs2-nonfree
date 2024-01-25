import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class111 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!jr;")
	public Class126 aClass126_1;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	private int[] anIntArray277;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
	private final int[] anIntArray278 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILclient!wn;)V")
	private void method3065(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		if (arg0 == 1) {
			arg1.method4614();
			return;
		}
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (arg0 == 2) {
			local22 = arg1.method4614();
			this.anIntArray277 = new int[local22];
			for (local32 = 0; local32 < local22; local32++) {
				this.anIntArray277[local32] = arg1.method4560();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local22 = arg1.method4614();
				this.aShortArray40 = new short[local22];
				this.aShortArray41 = new short[local22];
				for (local32 = 0; local32 < local22; local32++) {
					this.aShortArray40[local32] = (short) arg1.method4560();
					this.aShortArray41[local32] = (short) arg1.method4560();
				}
			} else if (arg0 == 41) {
				local22 = arg1.method4614();
				this.aShortArray42 = new short[local22];
				this.aShortArray39 = new short[local22];
				for (local32 = 0; local32 < local22; local32++) {
					this.aShortArray42[local32] = (short) arg1.method4560();
					this.aShortArray39[local32] = (short) arg1.method4560();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray278[arg0 - 60] = arg1.method4560();
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	public boolean method3067() {
		if (this.anIntArray277 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class38 local16 = this.aClass126_1.aClass38_41;
		synchronized (this.aClass126_1.aClass38_41) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray277.length; local20++) {
				if (!this.aClass126_1.aClass38_41.method1021(this.anIntArray277[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
	public boolean method3068() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class38 local16 = this.aClass126_1.aClass38_41;
		synchronized (this.aClass126_1.aClass38_41) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray278[local20] != -1 && !this.aClass126_1.aClass38_41.method1021(this.anIntArray278[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)Lclient!ch;")
	public Class37 method3069() {
		if (this.anIntArray277 == null) {
			return null;
		}
		@Pc(15) Class37[] local15 = new Class37[this.anIntArray277.length];
		@Pc(19) Class38 local19 = this.aClass126_1.aClass38_41;
		@Pc(23) int local23;
		synchronized (this.aClass126_1.aClass38_41) {
			local23 = 0;
			while (true) {
				if (this.anIntArray277.length <= local23) {
					break;
				}
				local15[local23] = Static39.method813(this.aClass126_1.aClass38_41, this.anIntArray277[local23]);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray277.length; local56++) {
			if (local15[local56].anInt1037 < 13) {
				local15[local56].method999();
			}
		}
		@Pc(86) Class37 local86;
		if (local15.length == 1) {
			local86 = local15[0];
		} else {
			local86 = new Class37(local15, local15.length);
		}
		if (local86 == null) {
			return null;
		}
		if (this.aShortArray40 != null) {
			for (local23 = 0; local23 < this.aShortArray40.length; local23++) {
				local86.method1007(this.aShortArray40[local23], this.aShortArray41[local23]);
			}
		}
		if (this.aShortArray42 != null) {
			for (local23 = 0; local23 < this.aShortArray42.length; local23++) {
				local86.method1013(this.aShortArray42[local23], this.aShortArray39[local23]);
			}
		}
		return local86;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!wn;I)V")
	public void method3070(@OriginalArg(0) Class4_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4614();
			if (local5 == 0) {
				return;
			}
			this.method3065(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lclient!ch;")
	public Class37 method3071() {
		@Pc(8) Class37[] local8 = new Class37[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class38 local14 = this.aClass126_1.aClass38_41;
		synchronized (this.aClass126_1.aClass38_41) {
			@Pc(27) int local27 = 0;
			while (true) {
				if (local27 >= 5) {
					break;
				}
				if (this.anIntArray278[local27] != -1) {
					local8[local10++] = Static39.method813(this.aClass126_1.aClass38_41, this.anIntArray278[local27]);
				}
				local27++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local8[local61] != null && local8[local61].anInt1037 < 13) {
				local8[local61].method999();
			}
		}
		@Pc(91) Class37 local91 = new Class37(local8, local10);
		@Pc(96) int local96;
		if (this.aShortArray40 != null) {
			for (local96 = 0; local96 < this.aShortArray40.length; local96++) {
				local91.method1007(this.aShortArray40[local96], this.aShortArray41[local96]);
			}
		}
		if (this.aShortArray42 != null) {
			for (local96 = 0; local96 < this.aShortArray42.length; local96++) {
				local91.method1013(this.aShortArray42[local96], this.aShortArray39[local96]);
			}
		}
		return local91;
	}
}
