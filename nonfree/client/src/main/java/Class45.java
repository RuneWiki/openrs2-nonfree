import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class45 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!ffa;")
	public Class114 aClass114_1;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	private final int[] anIntArray70 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lclient!gl;")
	public Class134 method1154() {
		if (this.anIntArray69 == null) {
			return null;
		}
		@Pc(15) Class134[] local15 = new Class134[this.anIntArray69.length];
		@Pc(19) Class362 local19 = this.aClass114_1.aClass362_35;
		@Pc(23) int local23;
		synchronized (this.aClass114_1.aClass362_35) {
			local23 = 0;
			while (true) {
				if (this.anIntArray69.length <= local23) {
					break;
				}
				local15[local23] = Static74.method1278(this.anIntArray69[local23], this.aClass114_1.aClass362_35);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray69.length; local56++) {
			if (local15[local56].anInt3581 < 13) {
				local15[local56].method3065();
			}
		}
		@Pc(101) Class134 local101;
		if (local15.length == 1) {
			local101 = local15[0];
		} else {
			local101 = new Class134(local15, local15.length);
		}
		if (local101 == null) {
			return null;
		}
		if (this.aShortArray16 != null) {
			for (local23 = 0; local23 < this.aShortArray16.length; local23++) {
				local101.method3057(this.aShortArray14[local23], this.aShortArray16[local23]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local23 = 0; local23 < this.aShortArray15.length; local23++) {
				local101.method3062(this.aShortArray15[local23], this.aShortArray13[local23]);
			}
		}
		return local101;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lclient!gl;")
	public Class134 method1155() {
		@Pc(8) Class134[] local8 = new Class134[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class362 local14 = this.aClass114_1.aClass362_35;
		@Pc(18) int local18;
		synchronized (this.aClass114_1.aClass362_35) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray70[local18] != -1) {
					local8[local10++] = Static74.method1278(this.anIntArray70[local18], this.aClass114_1.aClass362_35);
				}
				local18++;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < 5; local55++) {
			if (local8[local55] != null && local8[local55].anInt3581 < 13) {
				local8[local55].method3065();
			}
		}
		@Pc(89) Class134 local89 = new Class134(local8, local10);
		if (this.aShortArray16 != null) {
			for (local18 = 0; local18 < this.aShortArray16.length; local18++) {
				local89.method3057(this.aShortArray14[local18], this.aShortArray16[local18]);
			}
		}
		if (this.aShortArray15 != null) {
			for (local18 = 0; local18 < this.aShortArray15.length; local18++) {
				local89.method3062(this.aShortArray15[local18], this.aShortArray13[local18]);
			}
		}
		return local89;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!dt;)V")
	public void method1156(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			this.method1158(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
	public boolean method1157() {
		if (this.anIntArray69 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class362 local21 = this.aClass114_1.aClass362_35;
		synchronized (this.aClass114_1.aClass362_35) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray69.length; local25++) {
				if (!this.aClass114_1.aClass362_35.method8354(this.anIntArray69[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!dt;II)V")
	private void method1158(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method7954();
			return;
		}
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 == 2) {
			local32 = arg0.method7954();
			this.anIntArray69 = new int[local32];
			for (local42 = 0; local42 < local32; local42++) {
				this.anIntArray69[local42] = arg0.method7951();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local32 = arg0.method7954();
				this.aShortArray14 = new short[local32];
				this.aShortArray16 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray16[local42] = (short) arg0.method7951();
					this.aShortArray14[local42] = (short) arg0.method7951();
				}
			} else if (arg1 == 41) {
				local32 = arg0.method7954();
				this.aShortArray13 = new short[local32];
				this.aShortArray15 = new short[local32];
				for (local42 = 0; local42 < local32; local42++) {
					this.aShortArray15[local42] = (short) arg0.method7951();
					this.aShortArray13[local42] = (short) arg0.method7951();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray70[arg1 - 60] = arg0.method7951();
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Z")
	public boolean method1160() {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class362 local16 = this.aClass114_1.aClass362_35;
		synchronized (this.aClass114_1.aClass362_35) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray70[local20] != -1 && !this.aClass114_1.aClass362_35.method8354(this.anIntArray70[local20], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}
}
