import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class83 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private int anInt3423;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public int anInt3424;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!fj;")
	private final Class1_Sub7 aClass1_Sub7_4 = new Class1_Sub7(null);

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class83() {
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
	public Class83(@OriginalArg(0) byte[] arg0) {
		this.method2633(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(J)V")
	public void method2625(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0;
		@Pc(6) int local6 = this.anIntArray292.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray293[local8] = 0;
			this.anIntArray295[local8] = 0;
			this.aClass1_Sub7_4.anInt3592 = this.anIntArray294[local8];
			this.method2639(local8);
			this.anIntArray292[local8] = this.aClass1_Sub7_4.anInt3592;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	private int method2627(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub7_4.aByteArray38[this.aClass1_Sub7_4.anInt3592];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray295[arg0] = local13;
			this.aClass1_Sub7_4.anInt3592++;
		} else {
			local13 = this.anIntArray295[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2640(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub7_4.method2766();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub7_4.aByteArray38[this.aClass1_Sub7_4.anInt3592] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub7_4.anInt3592++;
				this.anIntArray295[arg0] = local57;
				return this.method2640(arg0, local57);
			}
		}
		this.aClass1_Sub7_4.anInt3592 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
	public int method2628() {
		@Pc(3) int local3 = this.anIntArray292.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray292[local9] >= 0 && this.anIntArray293[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray293[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()V")
	public void method2629() {
		this.aClass1_Sub7_4.aByteArray38 = null;
		this.anIntArray294 = null;
		this.anIntArray292 = null;
		this.anIntArray293 = null;
		this.anIntArray295 = null;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method2630(@OriginalArg(0) int arg0) {
		this.anIntArray292[arg0] = this.aClass1_Sub7_4.anInt3592;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	public int method2631() {
		return this.anIntArray292.length;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)J")
	public long method2632(@OriginalArg(0) int arg0) {
		return this.aLong111 + (long) arg0 * (long) this.anInt3423;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([B)V")
	public void method2633(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub7_4.aByteArray38 = arg0;
		this.aClass1_Sub7_4.anInt3592 = 10;
		@Pc(12) int local12 = this.aClass1_Sub7_4.method2765();
		this.anInt3424 = this.aClass1_Sub7_4.method2765();
		this.anInt3423 = 500000;
		this.anIntArray294 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub7_4.method2793();
			@Pc(38) int local38 = this.aClass1_Sub7_4.method2793();
			if (local33 == 1297379947) {
				this.anIntArray294[local27] = this.aClass1_Sub7_4.anInt3592;
				local27++;
			}
			this.aClass1_Sub7_4.anInt3592 += local38;
		}
		this.aLong111 = 0L;
		this.anIntArray292 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray292[local33] = this.anIntArray294[local33];
		}
		this.anIntArray293 = new int[local12];
		this.anIntArray295 = new int[local12];
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	public void method2634(@OriginalArg(0) int arg0) {
		this.aClass1_Sub7_4.anInt3592 = this.anIntArray292[arg0];
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
	public void method2635() {
		this.aClass1_Sub7_4.anInt3592 = -1;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z")
	public boolean method2636() {
		return this.aClass1_Sub7_4.aByteArray38 != null;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)I")
	public int method2637(@OriginalArg(0) int arg0) {
		return this.method2627(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()Z")
	public boolean method2638() {
		@Pc(3) int local3 = this.anIntArray292.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray292[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	public void method2639(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub7_4.method2766();
		this.anIntArray293[arg0] += local4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	private int method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static154.aByteArray36[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub7_4.method2771() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub7_4.method2771() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub7_4.method2771();
		local12 = this.aClass1_Sub7_4.method2766();
		if (local7 == 47) {
			this.aClass1_Sub7_4.anInt3592 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub7_4.method2745();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray293[arg0];
			this.aLong111 += (long) local38 * (long) (this.anInt3423 - local32);
			this.anInt3423 = local32;
			this.aClass1_Sub7_4.anInt3592 += local12;
			return 2;
		} else {
			this.aClass1_Sub7_4.anInt3592 += local12;
			return 3;
		}
	}
}
