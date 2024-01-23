import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class33 {

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public int anInt1121 = 0;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public int anInt1135 = -1;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public int anInt1123 = 0;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public int anInt1122 = -1;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	public int anInt1136 = -1;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
	public int anInt1142 = -1;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	public int anInt1143 = 0;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public int anInt1125 = -1;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	public int anInt1141 = 0;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	public int anInt1133 = 0;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	public int anInt1139 = -1;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	public int anInt1127 = -1;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	public int anInt1144 = 0;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	public int anInt1137 = 0;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public int anInt1138 = -1;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	public int anInt1140 = -1;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	public int anInt1147 = -1;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public int anInt1134 = -1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public int anInt1129 = -1;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
	public int anInt1153 = -1;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public int anInt1130 = -1;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	public int anInt1154 = -1;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
	public int anInt1145 = 0;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
	public int anInt1157 = -1;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	public int anInt1155 = 0;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	public int anInt1156 = -1;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	public int anInt1148 = 0;

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
	public int anInt1159 = -1;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
	public int anInt1152 = -1;

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
	public int anInt1160 = -1;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	public int anInt1150 = -1;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public int anInt1128 = -1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLclient!pi;)V")
	public void method988(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method990(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!pi;I)V")
	private void method990(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt1156 = arg1.method3085();
			this.anInt1128 = arg1.method3085();
			if (this.anInt1156 == 65535) {
				this.anInt1156 = -1;
			}
			if (this.anInt1128 == 65535) {
				this.anInt1128 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1157 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt1160 = arg1.method3085();
		} else if (arg0 == 4) {
			this.anInt1153 = arg1.method3085();
		} else if (arg0 == 5) {
			this.anInt1130 = arg1.method3085();
		} else if (arg0 == 6) {
			this.anInt1139 = arg1.method3085();
		} else if (arg0 == 7) {
			this.anInt1142 = arg1.method3085();
		} else if (arg0 == 8) {
			this.anInt1135 = arg1.method3085();
		} else if (arg0 == 9) {
			this.anInt1140 = arg1.method3085();
		} else if (arg0 == 26) {
			this.anInt1121 = (short) (arg1.method3110() * 4);
			this.anInt1144 = (short) (arg1.method3110() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray11 == null) {
				this.anIntArrayArray11 = new int[12][];
			}
			@Pc(119) int local119 = arg1.method3110();
			this.anIntArrayArray11[local119] = new int[6];
			for (@Pc(127) int local127 = 0; local127 < 6; local127++) {
				this.anIntArrayArray11[local119][local127] = arg1.method3072();
			}
		} else if (arg0 == 29) {
			this.anInt1148 = arg1.method3110();
		} else if (arg0 == 30) {
			this.anInt1137 = arg1.method3085();
		} else if (arg0 == 31) {
			this.anInt1155 = arg1.method3110();
		} else if (arg0 == 32) {
			this.anInt1123 = arg1.method3085();
		} else if (arg0 == 33) {
			this.anInt1145 = arg1.method3072();
		} else if (arg0 == 34) {
			this.anInt1141 = arg1.method3110();
		} else if (arg0 == 35) {
			this.anInt1133 = arg1.method3085();
		} else if (arg0 == 36) {
			this.anInt1143 = arg1.method3072();
		} else if (arg0 == 37) {
			this.anInt1154 = arg1.method3110();
		} else if (arg0 == 38) {
			this.anInt1152 = arg1.method3085();
		} else if (arg0 == 39) {
			this.anInt1134 = arg1.method3085();
		} else if (arg0 == 40) {
			this.anInt1127 = arg1.method3085();
		} else if (arg0 == 41) {
			this.anInt1150 = arg1.method3085();
		} else if (arg0 == 42) {
			this.anInt1136 = arg1.method3085();
		} else if (arg0 == 43) {
			arg1.method3085();
		} else if (arg0 == 44) {
			arg1.method3085();
		} else if (arg0 == 45) {
			arg1.method3085();
		} else if (arg0 == 46) {
			this.anInt1147 = arg1.method3085();
		} else if (arg0 == 47) {
			this.anInt1138 = arg1.method3085();
		} else if (arg0 == 48) {
			this.anInt1122 = arg1.method3085();
		} else if (arg0 == 49) {
			this.anInt1129 = arg1.method3085();
		} else if (arg0 == 50) {
			this.anInt1159 = arg1.method3085();
		} else if (arg0 == 51) {
			this.anInt1125 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public void method993() {
	}
}
