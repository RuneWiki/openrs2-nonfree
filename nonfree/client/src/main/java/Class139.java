import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class139 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public int anInt3965;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!tl;")
	private final Class4_Sub30 aClass4_Sub30_6 = new Class4_Sub30(null);

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class139() {
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V")
	public Class139(@OriginalArg(0) byte[] arg0) {
		this.method3006(arg0);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
	public boolean method2995() {
		return this.aClass4_Sub30_6.aByteArray79 != null;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
	public void method2996() {
		this.aClass4_Sub30_6.aByteArray79 = null;
		this.anIntArray326 = null;
		this.anIntArray329 = null;
		this.anIntArray327 = null;
		this.anIntArray328 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(J)V")
	public void method2997(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
		@Pc(6) int local6 = this.anIntArray329.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray327[local8] = 0;
			this.anIntArray328[local8] = 0;
			this.aClass4_Sub30_6.anInt6244 = this.anIntArray326[local8];
			this.method3000(local8);
			this.anIntArray329[local8] = this.aClass4_Sub30_6.anInt6244;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	public int method2998(@OriginalArg(0) int arg0) {
		return this.method3004(arg0);
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "()I")
	public int method2999() {
		@Pc(3) int local3 = this.anIntArray329.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray329[local9] >= 0 && this.anIntArray327[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray327[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method3000(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub30_6.method4833();
		this.anIntArray327[arg0] += local4;
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "()Z")
	public boolean method3002() {
		@Pc(3) int local3 = this.anIntArray329.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray329[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	public void method3003(@OriginalArg(0) int arg0) {
		this.anIntArray329[arg0] = this.aClass4_Sub30_6.anInt6244;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)I")
	private int method3004(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub30_6.aByteArray79[this.aClass4_Sub30_6.anInt6244];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray328[arg0] = local13;
			this.aClass4_Sub30_6.anInt6244++;
		} else {
			local13 = this.anIntArray328[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3005(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub30_6.method4833();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub30_6.aByteArray79[this.aClass4_Sub30_6.anInt6244] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub30_6.anInt6244++;
				this.anIntArray328[arg0] = local57;
				return this.method3005(arg0, local57);
			}
		}
		this.aClass4_Sub30_6.anInt6244 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
	private int method3005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static211.aByteArray42[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub30_6.method4864() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub30_6.method4864() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub30_6.method4864();
		local12 = this.aClass4_Sub30_6.method4833();
		if (local7 == 47) {
			this.aClass4_Sub30_6.anInt6244 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub30_6.method4887();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray327[arg0];
			this.aLong107 += (long) local38 * (long) (this.anInt3964 - local32);
			this.anInt3964 = local32;
			this.aClass4_Sub30_6.anInt6244 += local12;
			return 2;
		} else {
			this.aClass4_Sub30_6.anInt6244 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([B)V")
	public void method3006(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub30_6.aByteArray79 = arg0;
		this.aClass4_Sub30_6.anInt6244 = 10;
		@Pc(12) int local12 = this.aClass4_Sub30_6.method4877();
		this.anInt3965 = this.aClass4_Sub30_6.method4877();
		this.anInt3964 = 500000;
		this.anIntArray326 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub30_6.method4872();
			@Pc(38) int local38 = this.aClass4_Sub30_6.method4872();
			if (local33 == 1297379947) {
				this.anIntArray326[local27] = this.aClass4_Sub30_6.anInt6244;
				local27++;
			}
			this.aClass4_Sub30_6.anInt6244 += local38;
		}
		this.aLong107 = 0L;
		this.anIntArray329 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray329[local33] = this.anIntArray326[local33];
		}
		this.anIntArray327 = new int[local12];
		this.anIntArray328 = new int[local12];
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)J")
	public long method3007(@OriginalArg(0) int arg0) {
		return this.aLong107 + (long) arg0 * (long) this.anInt3964;
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "()I")
	public int method3008() {
		return this.anIntArray329.length;
	}

	@OriginalMember(owner = "client!km", name = "g", descriptor = "()V")
	public void method3009() {
		this.aClass4_Sub30_6.anInt6244 = -1;
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public void method3010(@OriginalArg(0) int arg0) {
		this.aClass4_Sub30_6.anInt6244 = this.anIntArray329[arg0];
	}
}
