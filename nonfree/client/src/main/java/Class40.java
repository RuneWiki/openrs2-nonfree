import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class40 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public int anInt1152;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	private int anInt1153;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	private int anInt1156;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt1158;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	private int anInt1167;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private int anInt1170;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
	public int anInt1171;

	@OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
	public boolean aBoolean86 = true;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public int anInt1147 = -1;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private int anInt1151 = -1;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
	private int anInt1165 = -1;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private int anInt1159 = -1;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public int anInt1164 = -1;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt1166 = -1;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray11 = new String[5];

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public int anInt1148 = 0;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	private int anInt1163 = -1;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	public int anInt1169 = -1;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	private int anInt1172 = -1;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z")
	public boolean method978() {
		if (this.anInt1172 == -1 && this.anInt1151 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt1172 == -1) {
			local32 = Static293.method4801(this.anInt1151);
		} else {
			local32 = Static161.anIntArray347[this.anInt1172];
		}
		if (this.anInt1153 > local32 || this.anInt1167 < local32) {
			return false;
		} else if (this.anInt1163 == -1 && this.anInt1159 == -1) {
			return true;
		} else {
			if (this.anInt1163 == -1) {
				local32 = Static293.method4801(this.anInt1159);
			} else {
				local32 = Static161.anIntArray347[this.anInt1163];
			}
			return this.anInt1156 <= local32 && this.anInt1170 >= local32;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!ug;)V")
	private void method980(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt1169 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt1164 = arg1.method3948();
		} else if (arg0 == 3) {
			this.aString48 = arg1.method3931();
		} else if (arg0 == 4) {
			this.anInt1173 = arg1.method3899();
		} else if (arg0 == 5) {
			this.anInt1147 = arg1.method3899();
		} else if (arg0 == 6) {
			this.anInt1148 = arg1.method3915();
		} else {
			@Pc(127) int local127;
			if (arg0 == 7) {
				local127 = arg1.method3915();
				if ((local127 & 0x2) == 2) {
					this.aBoolean88 = true;
				}
				if ((local127 & 0x1) == 0) {
					this.aBoolean89 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean90 = arg1.method3915() == 1;
			} else if (arg0 == 9) {
				this.anInt1151 = arg1.method3948();
				if (this.anInt1151 == 65535) {
					this.anInt1151 = -1;
				}
				this.anInt1172 = arg1.method3948();
				if (this.anInt1172 == 65535) {
					this.anInt1172 = -1;
				}
				this.anInt1153 = arg1.method3896();
				this.anInt1167 = arg1.method3896();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray11[arg0 - 10] = arg1.method3931();
			} else if (arg0 == 15) {
				local127 = arg1.method3915();
				this.anIntArray108 = new int[local127 * 2];
				for (@Pc(135) int local135 = 0; local135 < local127 * 2; local135++) {
					this.anIntArray108[local135] = arg1.method3930();
				}
				this.anInt1168 = arg1.method3896();
				this.anInt1152 = arg1.method3896();
			} else if (arg0 == 16) {
				this.aBoolean86 = false;
			} else if (arg0 == 17) {
				this.aString49 = arg1.method3931();
			} else if (arg0 == 18) {
				this.anInt1165 = arg1.method3948();
			} else if (arg0 == 19) {
				this.anInt1166 = arg1.method3948();
			} else if (arg0 == 20) {
				this.anInt1159 = arg1.method3948();
				if (this.anInt1159 == 65535) {
					this.anInt1159 = -1;
				}
				this.anInt1163 = arg1.method3948();
				if (this.anInt1163 == 65535) {
					this.anInt1163 = -1;
				}
				this.anInt1156 = arg1.method3896();
				this.anInt1170 = arg1.method3896();
			} else if (arg0 == 21) {
				this.anInt1158 = arg1.method3896();
			} else if (arg0 == 22) {
				this.anInt1146 = arg1.method3896();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZI)Lclient!qi;")
	public Class81 method981(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		@Pc(19) int local19 = arg1 ? this.anInt1164 : this.anInt1169;
		@Pc(32) Class81 local32 = (Class81) Static252.aClass98_41.method2570((long) ((arg1 ? 65536 : 0) | local19));
		if (local32 != null) {
			return local32;
		} else if (Static280.aClass155_89.method4133(local19)) {
			@Pc(50) Class81_Sub2 local50 = Static195.method3237(local19, Static280.aClass155_89);
			if (Static283.aBoolean393 && !arg0) {
				local32 = new Class81_Sub1(local50);
			} else {
				local32 = local50;
			}
			if (local32 != null) {
				local32.anInt2801 = 0;
				local32.anInt2802 = local32.anInt2797;
				local32.anInt2795 = local32.anInt2796;
				local32.anInt2798 = 0;
				Static252.aClass98_41.method2568(local32, (long) ((arg1 ? 65536 : 0) | local19));
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lclient!kk;")
	public Class81_Sub2 method982() {
		@Pc(13) Class81_Sub2 local13 = (Class81_Sub2) Static252.aClass98_41.method2570((long) (this.anInt1165 | 0x20000));
		if (local13 != null) {
			return local13;
		}
		Static280.aClass155_89.method4133(this.anInt1165);
		local13 = Static195.method3237(this.anInt1165, Static280.aClass155_89);
		if (local13 != null) {
			local13.anInt2795 = local13.anInt2796;
			local13.anInt2802 = local13.anInt2797;
			local13.anInt2801 = 0;
			local13.anInt2798 = 0;
			Static252.aClass98_41.method2568(local13, (long) (this.anInt1165 | 0x20000));
		}
		return local13;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ug;Z)V")
	public void method983(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3915();
			if (local18 == 0) {
				return;
			}
			this.method980(local18, arg0);
		}
	}
}
