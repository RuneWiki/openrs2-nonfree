import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class91 {

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public int anInt3123 = 0;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public int anInt3127 = -1;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
	public int anInt3124 = 0;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public int anInt3120 = -1;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public int anInt3132 = -1;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
	public int anInt3137 = -1;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public int anInt3139 = 0;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	public int anInt3125 = -1;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public int anInt3130 = -1;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public int anInt3126 = -1;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public int anInt3144 = -1;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public int anInt3141 = -1;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public int anInt3121 = 0;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	public int anInt3133 = 0;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	public int anInt3129 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public int anInt3143 = -1;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
	public int anInt3147 = -1;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
	public int anInt3150 = -1;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public int anInt3134 = -1;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
	public int anInt3145 = 0;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public int anInt3138 = -1;

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
	public int anInt3155 = -1;

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
	public int anInt3153 = -1;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
	public int anInt3154 = -1;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public int anInt3148 = -1;

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
	public int anInt3156 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public int anInt3119 = 0;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
	public int anInt3128 = -1;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public int anInt3151 = -1;

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	public int anInt3157 = -1;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public int anInt3142 = -1;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
	public int anInt3146 = 0;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public int anInt3131 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!qm;)V")
	private void method2303(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3138 = arg1.method2244();
			this.anInt3128 = arg1.method2244();
			if (this.anInt3128 == 65535) {
				this.anInt3128 = -1;
			}
			if (this.anInt3138 == 65535) {
				this.anInt3138 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt3134 = arg1.method2244();
		} else if (arg0 == 3) {
			this.anInt3131 = arg1.method2244();
		} else if (arg0 == 4) {
			this.anInt3148 = arg1.method2244();
		} else if (arg0 == 5) {
			this.anInt3147 = arg1.method2244();
		} else if (arg0 == 6) {
			this.anInt3125 = arg1.method2244();
		} else if (arg0 == 7) {
			this.anInt3130 = arg1.method2244();
		} else if (arg0 == 8) {
			this.anInt3155 = arg1.method2244();
		} else if (arg0 == 9) {
			this.anInt3132 = arg1.method2244();
		} else if (arg0 == 26) {
			this.anInt3156 = (short) (arg1.method2199() * 4);
			this.anInt3145 = (short) (arg1.method2199() * 4);
		} else if (arg0 == 27) {
			if (this.anIntArrayArray38 == null) {
				this.anIntArrayArray38 = new int[12][];
			}
			@Pc(384) int local384 = arg1.method2199();
			this.anIntArrayArray38[local384] = new int[6];
			for (@Pc(392) int local392 = 0; local392 < 6; local392++) {
				this.anIntArrayArray38[local384][local392] = arg1.method2248();
			}
		} else if (arg0 == 29) {
			this.anInt3146 = arg1.method2199();
		} else if (arg0 == 30) {
			this.anInt3124 = arg1.method2244();
		} else if (arg0 == 31) {
			this.anInt3129 = arg1.method2199();
		} else if (arg0 == 32) {
			this.anInt3133 = arg1.method2244();
		} else if (arg0 == 33) {
			this.anInt3121 = arg1.method2248();
		} else if (arg0 == 34) {
			this.anInt3119 = arg1.method2199();
		} else if (arg0 == 35) {
			this.anInt3123 = arg1.method2244();
		} else if (arg0 == 36) {
			this.anInt3139 = arg1.method2248();
		} else if (arg0 == 37) {
			this.anInt3120 = arg1.method2199();
		} else if (arg0 == 38) {
			this.anInt3151 = arg1.method2244();
		} else if (arg0 == 39) {
			this.anInt3153 = arg1.method2244();
		} else if (arg0 == 40) {
			this.anInt3141 = arg1.method2244();
		} else if (arg0 == 41) {
			this.anInt3150 = arg1.method2244();
		} else if (arg0 == 42) {
			this.anInt3157 = arg1.method2244();
		} else if (arg0 == 43) {
			arg1.method2244();
		} else if (arg0 == 44) {
			arg1.method2244();
		} else if (arg0 == 45) {
			this.anInt3127 = arg1.method2244();
		} else if (arg0 == 46) {
			this.anInt3143 = arg1.method2244();
		} else if (arg0 == 47) {
			this.anInt3126 = arg1.method2244();
		} else if (arg0 == 48) {
			this.anInt3142 = arg1.method2244();
		} else if (arg0 == 49) {
			this.anInt3144 = arg1.method2244();
		} else if (arg0 == 50) {
			this.anInt3154 = arg1.method2244();
		} else if (arg0 == 51) {
			this.anInt3137 = arg1.method2244();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!qm;)V")
	public void method2305(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2199();
			if (local9 == 0) {
				return;
			}
			this.method2303(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method2306() {
	}
}
