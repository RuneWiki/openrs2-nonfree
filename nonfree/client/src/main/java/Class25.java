import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class25 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "Lclient!mq;")
	public Class162 aClass162_1;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
	private final int[] anIntArray41 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lclient!io;")
	public Class117 method309() {
		if (this.anIntArray40 == null) {
			return null;
		}
		@Pc(15) Class117[] local15 = new Class117[this.anIntArray40.length];
		@Pc(24) Class178 local24 = this.aClass162_1.aClass178_77;
		@Pc(28) int local28;
		synchronized (this.aClass162_1.aClass178_77) {
			local28 = 0;
			while (true) {
				if (this.anIntArray40.length <= local28) {
					break;
				}
				local15[local28] = Static49.method625(this.aClass162_1.aClass178_77, this.anIntArray40[local28]);
				local28++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray40.length; local61++) {
			if (local15[local61].anInt3204 < 13) {
				local15[local61].method2587();
			}
		}
		@Pc(93) Class117 local93;
		if (local15.length == 1) {
			local93 = local15[0];
		} else {
			local93 = new Class117(local15, local15.length);
		}
		if (local93 == null) {
			return null;
		}
		if (this.aShortArray5 != null) {
			for (local28 = 0; local28 < this.aShortArray5.length; local28++) {
				local93.method2602(this.aShortArray5[local28], this.aShortArray2[local28]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local28 = 0; local28 < this.aShortArray4.length; local28++) {
				local93.method2593(this.aShortArray3[local28], this.aShortArray4[local28]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)Lclient!io;")
	public Class117 method310() {
		@Pc(8) Class117[] local8 = new Class117[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class178 local14 = this.aClass162_1.aClass178_77;
		synchronized (this.aClass162_1.aClass178_77) {
			@Pc(26) int local26 = 0;
			while (true) {
				if (local26 >= 5) {
					break;
				}
				if (this.anIntArray41[local26] != -1) {
					local8[local10++] = Static49.method625(this.aClass162_1.aClass178_77, this.anIntArray41[local26]);
				}
				local26++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < 5; local63++) {
			if (local8[local63] != null && local8[local63].anInt3204 < 13) {
				local8[local63].method2587();
			}
		}
		@Pc(93) Class117 local93 = new Class117(local8, local10);
		@Pc(98) int local98;
		if (this.aShortArray5 != null) {
			for (local98 = 0; local98 < this.aShortArray5.length; local98++) {
				local93.method2602(this.aShortArray5[local98], this.aShortArray2[local98]);
			}
		}
		if (this.aShortArray4 != null) {
			for (local98 = 0; local98 < this.aShortArray4.length; local98++) {
				local93.method2593(this.aShortArray3[local98], this.aShortArray4[local98]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Z")
	public boolean method313() {
		@Pc(15) boolean local15 = true;
		@Pc(19) Class178 local19 = this.aClass162_1.aClass178_77;
		synchronized (this.aClass162_1.aClass178_77) {
			for (@Pc(23) int local23 = 0; local23 < 5; local23++) {
				if (this.anIntArray41[local23] != -1 && !this.aClass162_1.aClass178_77.method3835(this.anIntArray41[local23], 0)) {
					local15 = false;
				}
			}
			return local15;
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
	public boolean method314() {
		if (this.anIntArray40 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class178 local16 = this.aClass162_1.aClass178_77;
		synchronized (this.aClass162_1.aClass178_77) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray40.length; local25++) {
				if (!this.aClass162_1.aClass178_77.method3835(this.anIntArray40[local25], 0)) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!gk;)V")
	private void method316(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			arg1.method3981();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method3981();
			this.anIntArray40 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray40[local29] = arg1.method3943();
			}
			return;
		}
		if (arg0 == 3) {
			return;
		}
		if (arg0 == 40) {
			local23 = arg1.method3981();
			this.aShortArray5 = new short[local23];
			this.aShortArray2 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray5[local29] = (short) arg1.method3943();
				this.aShortArray2[local29] = (short) arg1.method3943();
			}
			return;
		}
		if (arg0 == 41) {
			local23 = arg1.method3981();
			this.aShortArray3 = new short[local23];
			this.aShortArray4 = new short[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.aShortArray4[local29] = (short) arg1.method3943();
				this.aShortArray3[local29] = (short) arg1.method3943();
			}
			return;
		}
		if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray41[arg0 - 60] = arg1.method3943();
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!gk;B)V")
	public void method317(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3981();
			if (local10 == 0) {
				return;
			}
			this.method316(local10, arg0);
		}
	}
}
