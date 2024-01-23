import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class160 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "J")
	private long aLong184;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public int anInt5210;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	private int anInt5211;

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!aj;")
	private Class8_Sub2 aClass8_Sub2_9 = new Class8_Sub2(null);

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class160() {
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([B)V")
	public Class160(@OriginalArg(0) byte[] arg0) {
		this.method3904(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I")
	public int method3893(@OriginalArg(0) int arg0) {
		return this.method3894(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
	private int method3894(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass8_Sub2_9.aByteArray24[this.aClass8_Sub2_9.anInt2955];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray411[arg0] = local13;
			this.aClass8_Sub2_9.anInt2955++;
		} else {
			local13 = this.anIntArray411[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3896(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass8_Sub2_9.method2353();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass8_Sub2_9.aByteArray24[this.aClass8_Sub2_9.anInt2955] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass8_Sub2_9.anInt2955++;
				this.anIntArray411[arg0] = local57;
				return this.method3896(arg0, local57);
			}
		}
		this.aClass8_Sub2_9.anInt2955 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	private int method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static259.aByteArray51[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass8_Sub2_9.method2334() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass8_Sub2_9.method2334() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass8_Sub2_9.method2334();
		local12 = this.aClass8_Sub2_9.method2353();
		if (local7 == 47) {
			this.aClass8_Sub2_9.anInt2955 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass8_Sub2_9.method2323();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray413[arg0];
			this.aLong184 += (long) local38 * (long) (this.anInt5211 - local32);
			this.anInt5211 = local32;
			this.aClass8_Sub2_9.anInt2955 += local12;
			return 2;
		} else {
			this.aClass8_Sub2_9.anInt2955 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "()Z")
	public boolean method3897() {
		return this.aClass8_Sub2_9.aByteArray24 != null;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "()V")
	public void method3898() {
		this.aClass8_Sub2_9.aByteArray24 = null;
		this.anIntArray414 = null;
		this.anIntArray412 = null;
		this.anIntArray413 = null;
		this.anIntArray411 = null;
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)J")
	public long method3899(@OriginalArg(0) int arg0) {
		return this.aLong184 + (long) arg0 * (long) this.anInt5211;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(J)V")
	public void method3900(@OriginalArg(0) long arg0) {
		this.aLong184 = arg0;
		@Pc(6) int local6 = this.anIntArray412.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray413[local8] = 0;
			this.anIntArray411[local8] = 0;
			this.aClass8_Sub2_9.anInt2955 = this.anIntArray414[local8];
			this.method3907(local8);
			this.anIntArray412[local8] = this.aClass8_Sub2_9.anInt2955;
		}
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "()I")
	public int method3901() {
		@Pc(3) int local3 = this.anIntArray412.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray412[local9] >= 0 && this.anIntArray413[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray413[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "()I")
	public int method3902() {
		return this.anIntArray412.length;
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "()V")
	public void method3903() {
		this.aClass8_Sub2_9.anInt2955 = -1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([B)V")
	public void method3904(@OriginalArg(0) byte[] arg0) {
		this.aClass8_Sub2_9.aByteArray24 = arg0;
		this.aClass8_Sub2_9.anInt2955 = 10;
		@Pc(12) int local12 = this.aClass8_Sub2_9.method2375();
		this.anInt5210 = this.aClass8_Sub2_9.method2375();
		this.anInt5211 = 500000;
		this.anIntArray414 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass8_Sub2_9.method2352();
			@Pc(40) int local40 = this.aClass8_Sub2_9.method2352();
			if (local35 == 1297379947) {
				this.anIntArray414[local27] = this.aClass8_Sub2_9.anInt2955;
				local27++;
			}
			this.aClass8_Sub2_9.anInt2955 += local40;
		}
		this.aLong184 = 0L;
		this.anIntArray412 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray412[local27] = this.anIntArray414[local27];
		}
		this.anIntArray413 = new int[local12];
		this.anIntArray411 = new int[local12];
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public void method3905(@OriginalArg(0) int arg0) {
		this.aClass8_Sub2_9.anInt2955 = this.anIntArray412[arg0];
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "()Z")
	public boolean method3906() {
		@Pc(3) int local3 = this.anIntArray412.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray412[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V")
	public void method3907(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass8_Sub2_9.method2353();
		this.anIntArray413[arg0] += local4;
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
	public void method3908(@OriginalArg(0) int arg0) {
		this.anIntArray412[arg0] = this.aClass8_Sub2_9.anInt2955;
	}
}
