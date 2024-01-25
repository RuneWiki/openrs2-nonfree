import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class124 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "Lclient!ns;")
	public Class252 aClass252_1;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "[I")
	private final int[] anIntArray178 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z")
	public boolean method2783() {
		if (this.anIntArray177 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class207 local16 = this.aClass252_1.aClass207_80;
		synchronized (this.aClass252_1.aClass207_80) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray177.length; local20++) {
				if (!this.aClass252_1.aClass207_80.method4697(this.anIntArray177[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z")
	public boolean method2786() {
		@Pc(7) boolean local7 = true;
		@Pc(18) Class207 local18 = this.aClass252_1.aClass207_80;
		synchronized (this.aClass252_1.aClass207_80) {
			for (@Pc(22) int local22 = 0; local22 < 5; local22++) {
				if (this.anIntArray178[local22] != -1 && !this.aClass252_1.aClass207_80.method4697(this.anIntArray178[local22], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Lclient!b;")
	public Class26 method2787() {
		@Pc(8) Class26[] local8 = new Class26[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class207 local14 = this.aClass252_1.aClass207_80;
		@Pc(24) int local24;
		synchronized (this.aClass252_1.aClass207_80) {
			local24 = 0;
			while (true) {
				if (local24 >= 5) {
					break;
				}
				if (this.anIntArray178[local24] != -1) {
					local8[local10++] = Static623.method8839(this.aClass252_1.aClass207_80, this.anIntArray178[local24]);
				}
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local8[local61] != null && local8[local61].anInt393 < 13) {
				local8[local61].method335();
			}
		}
		@Pc(93) Class26 local93 = new Class26(local8, local10);
		if (this.aShortArray53 != null) {
			for (local24 = 0; local24 < this.aShortArray53.length; local24++) {
				local93.method331(this.aShortArray53[local24], this.aShortArray56[local24]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local24 = 0; local24 < this.aShortArray54.length; local24++) {
				local93.method342(this.aShortArray55[local24], this.aShortArray54[local24]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method2788(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5966();
			if (local10 == 0) {
				return;
			}
			this.method2790(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)Lclient!b;")
	public Class26 method2789() {
		if (this.anIntArray177 == null) {
			return null;
		}
		@Pc(15) Class26[] local15 = new Class26[this.anIntArray177.length];
		@Pc(19) Class207 local19 = this.aClass252_1.aClass207_80;
		@Pc(23) int local23;
		synchronized (this.aClass252_1.aClass207_80) {
			local23 = 0;
			while (true) {
				if (this.anIntArray177.length <= local23) {
					break;
				}
				local15[local23] = Static623.method8839(this.aClass252_1.aClass207_80, this.anIntArray177[local23]);
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray177.length; local57++) {
			if (local15[local57].anInt393 < 13) {
				local15[local57].method335();
			}
		}
		@Pc(94) Class26 local94;
		if (local15.length == 1) {
			local94 = local15[0];
		} else {
			local94 = new Class26(local15, local15.length);
		}
		if (local94 == null) {
			return null;
		}
		if (this.aShortArray53 != null) {
			for (local23 = 0; local23 < this.aShortArray53.length; local23++) {
				local94.method331(this.aShortArray53[local23], this.aShortArray56[local23]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local23 = 0; local23 < this.aShortArray54.length; local23++) {
				local94.method342(this.aShortArray55[local23], this.aShortArray54[local23]);
			}
		}
		return local94;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ofa;II)V")
	private void method2790(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method5966();
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local27 = arg0.method5966();
			this.anIntArray177 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray177[local33] = arg0.method5968();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local27 = arg0.method5966();
				this.aShortArray56 = new short[local27];
				this.aShortArray53 = new short[local27];
				for (local33 = 0; local33 < local27; local33++) {
					this.aShortArray53[local33] = (short) arg0.method5968();
					this.aShortArray56[local33] = (short) arg0.method5968();
				}
				return;
			}
			if (arg1 == 41) {
				local27 = arg0.method5966();
				this.aShortArray54 = new short[local27];
				this.aShortArray55 = new short[local27];
				for (local33 = 0; local33 < local27; local33++) {
					this.aShortArray54[local33] = (short) arg0.method5968();
					this.aShortArray55[local33] = (short) arg0.method5968();
				}
				return;
			}
			if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray178[arg1 - 60] = arg0.method5968();
				return;
			}
		}
	}
}
