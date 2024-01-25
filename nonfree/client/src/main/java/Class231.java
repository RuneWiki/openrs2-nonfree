import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class231 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
	private int[] anIntArray695;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!ll;")
	public Class146 aClass146_3;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "[I")
	private final int[] anIntArray697 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)Lclient!vn;")
	public Class238 method5017() {
		if (this.anIntArray695 == null) {
			return null;
		}
		@Pc(15) Class238[] local15 = new Class238[this.anIntArray695.length];
		@Pc(25) Class230 local25 = this.aClass146_3.aClass230_51;
		synchronized (this.aClass146_3.aClass230_51) {
			@Pc(29) int local29 = 0;
			while (true) {
				if (this.anIntArray695.length <= local29) {
					break;
				}
				local15[local29] = Static180.method2595(this.anIntArray695[local29], this.aClass146_3.aClass230_51);
				local29++;
			}
		}
		@Pc(66) Class238 local66;
		if (local15.length == 1) {
			local66 = local15[0];
		} else {
			local66 = new Class238(local15, local15.length);
		}
		if (local66 == null) {
			return null;
		}
		@Pc(83) int local83;
		if (this.aShortArray101 != null) {
			for (local83 = 0; local83 < this.aShortArray101.length; local83++) {
				local66.method5213(this.aShortArray101[local83], this.aShortArray103[local83]);
			}
		}
		if (this.aShortArray100 != null) {
			for (local83 = 0; local83 < this.aShortArray100.length; local83++) {
				local66.method5227(this.aShortArray102[local83], this.aShortArray100[local83]);
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Z")
	public boolean method5018() {
		if (this.anIntArray695 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class230 local16 = this.aClass146_3.aClass230_51;
		synchronized (this.aClass146_3.aClass230_51) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray695.length; local20++) {
				if (!this.aClass146_3.aClass230_51.method4974(0, this.anIntArray695[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!re;BI)V")
	private void method5020(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method5174();
			return;
		}
		@Pc(21) int local21;
		@Pc(31) int local31;
		if (arg1 == 2) {
			local21 = arg0.method5174();
			this.anIntArray695 = new int[local21];
			for (local31 = 0; local31 < local21; local31++) {
				this.anIntArray695[local31] = arg0.method5177();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local21 = arg0.method5174();
				this.aShortArray103 = new short[local21];
				this.aShortArray101 = new short[local21];
				for (local31 = 0; local31 < local21; local31++) {
					this.aShortArray101[local31] = (short) arg0.method5177();
					this.aShortArray103[local31] = (short) arg0.method5177();
				}
			} else if (arg1 == 41) {
				local21 = arg0.method5174();
				this.aShortArray100 = new short[local21];
				this.aShortArray102 = new short[local21];
				for (local31 = 0; local31 < local21; local31++) {
					this.aShortArray100[local31] = (short) arg0.method5177();
					this.aShortArray102[local31] = (short) arg0.method5177();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray697[arg1 - 60] = arg0.method5177();
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lclient!vn;")
	public Class238 method5021() {
		@Pc(8) Class238[] local8 = new Class238[5];
		@Pc(10) int local10 = 0;
		@Pc(19) Class230 local19 = this.aClass146_3.aClass230_51;
		synchronized (this.aClass146_3.aClass230_51) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray697[local23] != -1) {
					local8[local10++] = Static180.method2595(this.anIntArray697[local23], this.aClass146_3.aClass230_51);
				}
			}
		}
		@Pc(64) Class238 local64 = new Class238(local8, local10);
		@Pc(69) int local69;
		if (this.aShortArray101 != null) {
			for (local69 = 0; local69 < this.aShortArray101.length; local69++) {
				local64.method5213(this.aShortArray101[local69], this.aShortArray103[local69]);
			}
		}
		if (this.aShortArray100 != null) {
			for (local69 = 0; local69 < this.aShortArray100.length; local69++) {
				local64.method5227(this.aShortArray102[local69], this.aShortArray100[local69]);
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Z")
	public boolean method5022() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class230 local11 = this.aClass146_3.aClass230_51;
		synchronized (this.aClass146_3.aClass230_51) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray697[local23] != -1 && !this.aClass146_3.aClass230_51.method4974(0, this.anIntArray697[local23])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!re;I)V")
	public void method5023(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5174();
			if (local13 == 0) {
				return;
			}
			this.method5020(arg0, local13);
		}
	}
}
