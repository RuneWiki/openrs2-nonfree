import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class122 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	private int anInt3009;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	public int anInt3010;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "J")
	private long aLong95;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "Lclient!es;")
	private final Class4_Sub11 aClass4_Sub11_5 = new Class4_Sub11((byte[]) null);

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class122() {
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V")
	public Class122(@OriginalArg(0) byte[] arg0) {
		this.method2811(arg0);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	public int method2809(@OriginalArg(0) int arg0) {
		return this.method2818(arg0);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
	public void method2810(@OriginalArg(0) int arg0) {
		this.aClass4_Sub11_5.anInt10466 = this.anIntArray216[arg0];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([B)V")
	public void method2811(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub11_5.aByteArray107 = arg0;
		this.aClass4_Sub11_5.anInt10466 = 10;
		@Pc(12) int local12 = this.aClass4_Sub11_5.method8859();
		this.anInt3010 = this.aClass4_Sub11_5.method8859();
		this.anInt3009 = 500000;
		this.anIntArray214 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub11_5.method8850();
			@Pc(38) int local38 = this.aClass4_Sub11_5.method8850();
			if (local33 == 1297379947) {
				this.anIntArray214[local27] = this.aClass4_Sub11_5.anInt10466;
				local27++;
			}
			this.aClass4_Sub11_5.anInt10466 += local38;
		}
		this.aLong95 = 0L;
		this.anIntArray216 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray216[local33] = this.anIntArray214[local33];
		}
		this.anIntArray217 = new int[local12];
		this.anIntArray215 = new int[local12];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
	public void method2812() {
		this.aClass4_Sub11_5.aByteArray107 = null;
		this.anIntArray214 = null;
		this.anIntArray216 = null;
		this.anIntArray217 = null;
		this.anIntArray215 = null;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
	public int method2813() {
		return this.anIntArray216.length;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
	private int method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static168.aByteArray37[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub11_5.method8865() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub11_5.method8865() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub11_5.method8865();
		local12 = this.aClass4_Sub11_5.method8836();
		if (local7 == 47) {
			this.aClass4_Sub11_5.anInt10466 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub11_5.method8827();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray217[arg0];
			this.aLong95 += (long) local38 * (long) (this.anInt3009 - local32);
			this.anInt3009 = local32;
			this.aClass4_Sub11_5.anInt10466 += local12;
			return 2;
		} else {
			this.aClass4_Sub11_5.anInt10466 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "()I")
	public int method2815() {
		@Pc(3) int local3 = this.anIntArray216.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray216[local9] >= 0 && this.anIntArray217[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray217[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)J")
	public long method2817(@OriginalArg(0) int arg0) {
		return this.aLong95 + (long) arg0 * (long) this.anInt3009;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
	private int method2818(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub11_5.aByteArray107[this.aClass4_Sub11_5.anInt10466];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray215[arg0] = local13;
			this.aClass4_Sub11_5.anInt10466++;
		} else {
			local13 = this.anIntArray215[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2814(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub11_5.method8836();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub11_5.aByteArray107[this.aClass4_Sub11_5.anInt10466] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub11_5.anInt10466++;
				this.anIntArray215[arg0] = local57;
				return this.method2814(arg0, local57);
			}
		}
		this.aClass4_Sub11_5.anInt10466 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(J)V")
	public void method2819(@OriginalArg(0) long arg0) {
		this.aLong95 = arg0;
		@Pc(6) int local6 = this.anIntArray216.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray217[local8] = 0;
			this.anIntArray215[local8] = 0;
			this.aClass4_Sub11_5.anInt10466 = this.anIntArray214[local8];
			this.method2820(local8);
			this.anIntArray216[local8] = this.aClass4_Sub11_5.anInt10466;
		}
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
	public void method2820(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub11_5.method8836();
		this.anIntArray217[arg0] += local4;
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "()Z")
	public boolean method2821() {
		return this.aClass4_Sub11_5.aByteArray107 != null;
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
	public void method2822(@OriginalArg(0) int arg0) {
		this.anIntArray216[arg0] = this.aClass4_Sub11_5.anInt10466;
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "()V")
	public void method2823() {
		this.aClass4_Sub11_5.anInt10466 = -1;
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "()Z")
	public boolean method2824() {
		@Pc(3) int local3 = this.anIntArray216.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray216[local5] >= 0) {
				return false;
			}
		}
		return true;
	}
}
