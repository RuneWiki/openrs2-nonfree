import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class226 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt5651;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt5652;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!ofa;")
	private final Class5_Sub22 aClass5_Sub22_7 = new Class5_Sub22(null);

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class226() {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class226(@OriginalArg(0) byte[] arg0) {
		this.method4995(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()Z")
	public boolean method4994() {
		return this.aClass5_Sub22_7.aByteArray71 != null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
	public void method4995(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub22_7.aByteArray71 = arg0;
		this.aClass5_Sub22_7.anInt6629 = 10;
		@Pc(12) int local12 = this.aClass5_Sub22_7.method5968();
		this.anInt5651 = this.aClass5_Sub22_7.method5968();
		this.anInt5652 = 500000;
		this.anIntArray311 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub22_7.method5913();
			@Pc(38) int local38 = this.aClass5_Sub22_7.method5913();
			if (local33 == 1297379947) {
				this.anIntArray311[local27] = this.aClass5_Sub22_7.anInt6629;
				local27++;
			}
			this.aClass5_Sub22_7.anInt6629 += local38;
		}
		this.aLong135 = 0L;
		this.anIntArray310 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray310[local33] = this.anIntArray311[local33];
		}
		this.anIntArray309 = new int[local12];
		this.anIntArray308 = new int[local12];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	private int method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static332.aByteArray56[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub22_7.method5966() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub22_7.method5966() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub22_7.method5966();
		local12 = this.aClass5_Sub22_7.method5939();
		if (local7 == 47) {
			this.aClass5_Sub22_7.anInt6629 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub22_7.method5931();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray309[arg0];
			this.aLong135 += (long) local38 * (long) (this.anInt5652 - local32);
			this.anInt5652 = local32;
			this.aClass5_Sub22_7.anInt6629 += local12;
			return 2;
		} else {
			this.aClass5_Sub22_7.anInt6629 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()I")
	public int method4997() {
		@Pc(3) int local3 = this.anIntArray310.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray310[local9] >= 0 && this.anIntArray309[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray309[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J")
	public long method4998(@OriginalArg(0) int arg0) {
		return this.aLong135 + (long) arg0 * (long) this.anInt5652;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method4999(@OriginalArg(0) int arg0) {
		this.anIntArray310[arg0] = this.aClass5_Sub22_7.anInt6629;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
	public void method5001(@OriginalArg(0) long arg0) {
		this.aLong135 = arg0;
		@Pc(6) int local6 = this.anIntArray310.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray309[local8] = 0;
			this.anIntArray308[local8] = 0;
			this.aClass5_Sub22_7.anInt6629 = this.anIntArray311[local8];
			this.method5007(local8);
			this.anIntArray310[local8] = this.aClass5_Sub22_7.anInt6629;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method5002(@OriginalArg(0) int arg0) {
		this.aClass5_Sub22_7.anInt6629 = this.anIntArray310[arg0];
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
	private int method5003(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub22_7.aByteArray71[this.aClass5_Sub22_7.anInt6629];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray308[arg0] = local13;
			this.aClass5_Sub22_7.anInt6629++;
		} else {
			local13 = this.anIntArray308[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4996(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub22_7.method5939();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub22_7.aByteArray71[this.aClass5_Sub22_7.anInt6629] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub22_7.anInt6629++;
				this.anIntArray308[arg0] = local57;
				return this.method4996(arg0, local57);
			}
		}
		this.aClass5_Sub22_7.anInt6629 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	public void method5004() {
		this.aClass5_Sub22_7.aByteArray71 = null;
		this.anIntArray311 = null;
		this.anIntArray310 = null;
		this.anIntArray309 = null;
		this.anIntArray308 = null;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
	public void method5005() {
		this.aClass5_Sub22_7.anInt6629 = -1;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method5006() {
		return this.anIntArray310.length;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public void method5007(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub22_7.method5939();
		this.anIntArray309[arg0] += local4;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()Z")
	public boolean method5008() {
		@Pc(3) int local3 = this.anIntArray310.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray310[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public int method5009(@OriginalArg(0) int arg0) {
		return this.method5003(arg0);
	}
}
