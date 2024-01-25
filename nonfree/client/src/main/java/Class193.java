import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class193 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "J")
	private long aLong186;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
	public int anInt6151;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Lclient!kh;")
	private final Class11_Sub25 aClass11_Sub25_8 = new Class11_Sub25(null);

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class193() {
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "([B)V")
	public Class193(@OriginalArg(0) byte[] arg0) {
		this.method5260(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "()Z")
	public boolean method5253() {
		@Pc(3) int local3 = this.anIntArray504.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray504[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public void method5254(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass11_Sub25_8.method5206();
		this.anIntArray503[arg0] += local4;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	public int method5255(@OriginalArg(0) int arg0) {
		return this.method5257(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "()V")
	public void method5256() {
		this.aClass11_Sub25_8.aByteArray93 = null;
		this.anIntArray502 = null;
		this.anIntArray504 = null;
		this.anIntArray503 = null;
		this.anIntArray505 = null;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
	private int method5257(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass11_Sub25_8.aByteArray93[this.aClass11_Sub25_8.anInt6076];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray505[arg0] = local13;
			this.aClass11_Sub25_8.anInt6076++;
		} else {
			local13 = this.anIntArray505[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5259(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass11_Sub25_8.method5206();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass11_Sub25_8.aByteArray93[this.aClass11_Sub25_8.anInt6076] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass11_Sub25_8.anInt6076++;
				this.anIntArray505[arg0] = local57;
				return this.method5259(arg0, local57);
			}
		}
		this.aClass11_Sub25_8.anInt6076 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(J)V")
	public void method5258(@OriginalArg(0) long arg0) {
		this.aLong186 = arg0;
		@Pc(6) int local6 = this.anIntArray504.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray503[local8] = 0;
			this.anIntArray505[local8] = 0;
			this.aClass11_Sub25_8.anInt6076 = this.anIntArray502[local8];
			this.method5254(local8);
			this.anIntArray504[local8] = this.aClass11_Sub25_8.anInt6076;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	private int method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static312.aByteArray94[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass11_Sub25_8.method5185() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass11_Sub25_8.method5185() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass11_Sub25_8.method5185();
		local12 = this.aClass11_Sub25_8.method5206();
		if (local7 == 47) {
			this.aClass11_Sub25_8.anInt6076 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass11_Sub25_8.method5221();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray503[arg0];
			this.aLong186 += (long) local38 * (long) (this.anInt6152 - local32);
			this.anInt6152 = local32;
			this.aClass11_Sub25_8.anInt6076 += local12;
			return 2;
		} else {
			this.aClass11_Sub25_8.anInt6076 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([B)V")
	public void method5260(@OriginalArg(0) byte[] arg0) {
		this.aClass11_Sub25_8.aByteArray93 = arg0;
		this.aClass11_Sub25_8.anInt6076 = 10;
		@Pc(12) int local12 = this.aClass11_Sub25_8.method5187();
		this.anInt6151 = this.aClass11_Sub25_8.method5187();
		this.anInt6152 = 500000;
		this.anIntArray502 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass11_Sub25_8.method5198();
			@Pc(38) int local38 = this.aClass11_Sub25_8.method5198();
			if (local33 == 1297379947) {
				this.anIntArray502[local27] = this.aClass11_Sub25_8.anInt6076;
				local27++;
			}
			this.aClass11_Sub25_8.anInt6076 += local38;
		}
		this.aLong186 = 0L;
		this.anIntArray504 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray504[local33] = this.anIntArray502[local33];
		}
		this.anIntArray503 = new int[local12];
		this.anIntArray505 = new int[local12];
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "()V")
	public void method5261() {
		this.aClass11_Sub25_8.anInt6076 = -1;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
	public void method5262(@OriginalArg(0) int arg0) {
		this.aClass11_Sub25_8.anInt6076 = this.anIntArray504[arg0];
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	public void method5263(@OriginalArg(0) int arg0) {
		this.anIntArray504[arg0] = this.aClass11_Sub25_8.anInt6076;
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "()I")
	public int method5265() {
		@Pc(3) int local3 = this.anIntArray504.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray504[local9] >= 0 && this.anIntArray503[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray503[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "()I")
	public int method5266() {
		return this.anIntArray504.length;
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)J")
	public long method5267(@OriginalArg(0) int arg0) {
		return this.aLong186 + (long) arg0 * (long) this.anInt6152;
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "()Z")
	public boolean method5268() {
		return this.aClass11_Sub25_8.aByteArray93 != null;
	}
}
