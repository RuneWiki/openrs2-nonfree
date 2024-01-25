import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class351 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "[I")
	public static final int[] anIntArray558 = new int[128];

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!sn;")
	public Class324 aClass324_2;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "[I")
	private final int[] anIntArray557 = new int[] { -1, -1, -1, -1, -1 };

	static {
		for (@Pc(606) int local606 = 0; local606 < anIntArray558.length; local606++) {
			anIntArray558[local606] = -1;
		}
		for (@Pc(618) int local618 = 65; local618 <= 90; local618++) {
			anIntArray558[local618] = local618 - 65;
		}
		for (@Pc(633) int local633 = 97; local633 <= 122; local633++) {
			anIntArray558[local633] = local633 + 26 - 97;
		}
		for (@Pc(648) int local648 = 48; local648 <= 57; local648++) {
			anIntArray558[local648] = local648 + 52 - 48;
		}
		anIntArray558[42] = anIntArray558[43] = 62;
		anIntArray558[45] = anIntArray558[47] = 63;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Z")
	public boolean method8671() {
		if (this.anIntArray556 == null) {
			return true;
		}
		@Pc(22) boolean local22 = true;
		@Pc(26) Class208 local26 = this.aClass324_2.aClass208_125;
		synchronized (this.aClass324_2.aClass208_125) {
			for (@Pc(30) int local30 = 0; local30 < this.anIntArray556.length; local30++) {
				if (!this.aClass324_2.aClass208_125.method4980(0, this.anIntArray556[local30])) {
					local22 = false;
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Z")
	public boolean method8672() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class208 local11 = this.aClass324_2.aClass208_125;
		synchronized (this.aClass324_2.aClass208_125) {
			for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
				if (this.anIntArray557[local20] != -1 && !this.aClass324_2.aClass208_125.method4980(0, this.anIntArray557[local20])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!ib;B)V")
	public void method8673(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8529();
			if (local16 == 0) {
				return;
			}
			this.method8675(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!ju;")
	public Class192 method8674() {
		@Pc(8) Class192[] local8 = new Class192[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class208 local14 = this.aClass324_2.aClass208_125;
		@Pc(25) int local25;
		synchronized (this.aClass324_2.aClass208_125) {
			local25 = 0;
			while (true) {
				if (local25 >= 5) {
					break;
				}
				if (this.anIntArray557[local25] != -1) {
					local8[local10++] = Static213.method3061(this.aClass324_2.aClass208_125, this.anIntArray557[local25]);
				}
				local25++;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < 5; local65++) {
			if (local8[local65] != null && local8[local65].anInt5087 < 13) {
				local8[local65].method4319();
			}
		}
		@Pc(101) Class192 local101 = new Class192(local8, local10);
		if (this.aShortArray137 != null) {
			for (local25 = 0; local25 < this.aShortArray137.length; local25++) {
				local101.method4330(this.aShortArray140[local25], this.aShortArray137[local25]);
			}
		}
		if (this.aShortArray139 != null) {
			for (local25 = 0; local25 < this.aShortArray139.length; local25++) {
				local101.method4321(this.aShortArray139[local25], this.aShortArray138[local25]);
			}
		}
		return local101;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!ib;)V")
	private void method8675(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			arg1.method8529();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method8529();
			this.anIntArray556 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray556[local29] = arg1.method8519();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local23 = arg1.method8529();
				this.aShortArray137 = new short[local23];
				this.aShortArray140 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray137[local29] = (short) arg1.method8519();
					this.aShortArray140[local29] = (short) arg1.method8519();
				}
			} else if (arg0 == 41) {
				local23 = arg1.method8529();
				this.aShortArray139 = new short[local23];
				this.aShortArray138 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray139[local29] = (short) arg1.method8519();
					this.aShortArray138[local29] = (short) arg1.method8519();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray557[arg0 - 60] = arg1.method8519();
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Lclient!ju;")
	public Class192 method8676() {
		if (this.anIntArray556 == null) {
			return null;
		}
		@Pc(16) Class192[] local16 = new Class192[this.anIntArray556.length];
		@Pc(20) Class208 local20 = this.aClass324_2.aClass208_125;
		synchronized (this.aClass324_2.aClass208_125) {
			@Pc(24) int local24 = 0;
			while (true) {
				if (local24 >= this.anIntArray556.length) {
					break;
				}
				local16[local24] = Static213.method3061(this.aClass324_2.aClass208_125, this.anIntArray556[local24]);
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray556.length; local61++) {
			if (local16[local61].anInt5087 < 13) {
				local16[local61].method4319();
			}
		}
		@Pc(107) Class192 local107;
		if (local16.length == 1) {
			local107 = local16[0];
		} else {
			local107 = new Class192(local16, local16.length);
		}
		if (local107 == null) {
			return null;
		}
		@Pc(125) int local125;
		if (this.aShortArray137 != null) {
			for (local125 = 0; local125 < this.aShortArray137.length; local125++) {
				local107.method4330(this.aShortArray140[local125], this.aShortArray137[local125]);
			}
		}
		if (this.aShortArray139 != null) {
			for (local125 = 0; local125 < this.aShortArray139.length; local125++) {
				local107.method4321(this.aShortArray139[local125], this.aShortArray138[local125]);
			}
		}
		return local107;
	}
}
