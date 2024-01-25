import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class225 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "J")
	private long aLong192;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
	public int anInt6257;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!dh;")
	private final Class1_Sub11 aClass1_Sub11_7 = new Class1_Sub11(null);

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class225() {
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "([B)V")
	public Class225(@OriginalArg(0) byte[] arg0) {
		this.method4808(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()I")
	public int method4803() {
		@Pc(3) int local3 = this.anIntArray382.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray382[local9] >= 0 && this.anIntArray381[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray381[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()Z")
	public boolean method4804() {
		return this.aClass1_Sub11_7.aByteArray64 != null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)J")
	public long method4805(@OriginalArg(0) int arg0) {
		return this.aLong192 + (long) arg0 * (long) this.anInt6258;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public void method4806(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass1_Sub11_7.method4479();
		this.anIntArray381[arg0] += local4;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()Z")
	public boolean method4807() {
		@Pc(3) int local3 = this.anIntArray382.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray382[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([B)V")
	public void method4808(@OriginalArg(0) byte[] arg0) {
		this.aClass1_Sub11_7.aByteArray64 = arg0;
		this.aClass1_Sub11_7.anInt5766 = 10;
		@Pc(12) int local12 = this.aClass1_Sub11_7.method4485();
		this.anInt6257 = this.aClass1_Sub11_7.method4485();
		this.anInt6258 = 500000;
		this.anIntArray383 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass1_Sub11_7.method4487();
			@Pc(38) int local38 = this.aClass1_Sub11_7.method4487();
			if (local33 == 1297379947) {
				this.anIntArray383[local27] = this.aClass1_Sub11_7.anInt5766;
				local27++;
			}
			this.aClass1_Sub11_7.anInt5766 += local38;
		}
		this.aLong192 = 0L;
		this.anIntArray382 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray382[local33] = this.anIntArray383[local33];
		}
		this.anIntArray381 = new int[local12];
		this.anIntArray380 = new int[local12];
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
	public void method4809() {
		this.aClass1_Sub11_7.aByteArray64 = null;
		this.anIntArray383 = null;
		this.anIntArray382 = null;
		this.anIntArray381 = null;
		this.anIntArray380 = null;
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "()I")
	public int method4810() {
		return this.anIntArray382.length;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)I")
	public int method4811(@OriginalArg(0) int arg0) {
		return this.method4817(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
	private int method4812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static372.aByteArray74[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass1_Sub11_7.method4463() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass1_Sub11_7.method4463() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass1_Sub11_7.method4463();
		local12 = this.aClass1_Sub11_7.method4479();
		if (local7 == 47) {
			this.aClass1_Sub11_7.anInt5766 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass1_Sub11_7.method4493();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray381[arg0];
			this.aLong192 += (long) local38 * (long) (this.anInt6258 - local32);
			this.anInt6258 = local32;
			this.aClass1_Sub11_7.anInt5766 += local12;
			return 2;
		} else {
			this.aClass1_Sub11_7.anInt5766 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
	public void method4814(@OriginalArg(0) int arg0) {
		this.anIntArray382[arg0] = this.aClass1_Sub11_7.anInt5766;
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "()V")
	public void method4815() {
		this.aClass1_Sub11_7.anInt5766 = -1;
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V")
	public void method4816(@OriginalArg(0) int arg0) {
		this.aClass1_Sub11_7.anInt5766 = this.anIntArray382[arg0];
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I")
	private int method4817(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass1_Sub11_7.aByteArray64[this.aClass1_Sub11_7.anInt5766];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray380[arg0] = local13;
			this.aClass1_Sub11_7.anInt5766++;
		} else {
			local13 = this.anIntArray380[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4812(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass1_Sub11_7.method4479();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass1_Sub11_7.aByteArray64[this.aClass1_Sub11_7.anInt5766] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass1_Sub11_7.anInt5766++;
				this.anIntArray380[arg0] = local57;
				return this.method4812(arg0, local57);
			}
		}
		this.aClass1_Sub11_7.anInt5766 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(J)V")
	public void method4818(@OriginalArg(0) long arg0) {
		this.aLong192 = arg0;
		@Pc(6) int local6 = this.anIntArray382.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray381[local8] = 0;
			this.anIntArray380[local8] = 0;
			this.aClass1_Sub11_7.anInt5766 = this.anIntArray383[local8];
			this.method4806(local8);
			this.anIntArray382[local8] = this.aClass1_Sub11_7.anInt5766;
		}
	}
}
