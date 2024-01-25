import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class149 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private int anInt3617;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
	public int anInt3618;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Lclient!fh;")
	private final Class4_Sub9 aClass4_Sub9_5 = new Class4_Sub9(null);

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class149() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
	public Class149(@OriginalArg(0) byte[] arg0) {
		this.method2879(arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	public void method2876(@OriginalArg(0) int arg0) {
		this.anIntArray268[arg0] = this.aClass4_Sub9_5.anInt6207;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()Z")
	public boolean method2877() {
		return this.aClass4_Sub9_5.aByteArray81 != null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(J)V")
	public void method2878(@OriginalArg(0) long arg0) {
		this.aLong105 = arg0;
		@Pc(6) int local6 = this.anIntArray268.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray270[local8] = 0;
			this.anIntArray267[local8] = 0;
			this.aClass4_Sub9_5.anInt6207 = this.anIntArray269[local8];
			this.method2891(local8);
			this.anIntArray268[local8] = this.aClass4_Sub9_5.anInt6207;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([B)V")
	public void method2879(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub9_5.aByteArray81 = arg0;
		this.aClass4_Sub9_5.anInt6207 = 10;
		@Pc(12) int local12 = this.aClass4_Sub9_5.method5028();
		this.anInt3618 = this.aClass4_Sub9_5.method5028();
		this.anInt3617 = 500000;
		this.anIntArray269 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub9_5.method4997();
			@Pc(38) int local38 = this.aClass4_Sub9_5.method4997();
			if (local33 == 1297379947) {
				this.anIntArray269[local27] = this.aClass4_Sub9_5.anInt6207;
				local27++;
			}
			this.aClass4_Sub9_5.anInt6207 += local38;
		}
		this.aLong105 = 0L;
		this.anIntArray268 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray268[local33] = this.anIntArray269[local33];
		}
		this.anIntArray270 = new int[local12];
		this.anIntArray267 = new int[local12];
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)J")
	public long method2880(@OriginalArg(0) int arg0) {
		return this.aLong105 + (long) arg0 * (long) this.anInt3617;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "()I")
	public int method2881() {
		return this.anIntArray268.length;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()V")
	public void method2882() {
		this.aClass4_Sub9_5.aByteArray81 = null;
		this.anIntArray269 = null;
		this.anIntArray268 = null;
		this.anIntArray270 = null;
		this.anIntArray267 = null;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "()Z")
	public boolean method2883() {
		@Pc(3) int local3 = this.anIntArray268.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray268[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "()V")
	public void method2884() {
		this.aClass4_Sub9_5.anInt6207 = -1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
	private int method2885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static205.aByteArray40[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub9_5.method5007() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub9_5.method5007() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub9_5.method5007();
		local12 = this.aClass4_Sub9_5.method5000();
		if (local7 == 47) {
			this.aClass4_Sub9_5.anInt6207 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub9_5.method5008();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray270[arg0];
			this.aLong105 += (long) local38 * (long) (this.anInt3617 - local32);
			this.anInt3617 = local32;
			this.aClass4_Sub9_5.anInt6207 += local12;
			return 2;
		} else {
			this.aClass4_Sub9_5.anInt6207 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
	public int method2886(@OriginalArg(0) int arg0) {
		return this.method2889(arg0);
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "()I")
	public int method2887() {
		@Pc(3) int local3 = this.anIntArray268.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray268[local9] >= 0 && this.anIntArray270[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray270[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	public void method2888(@OriginalArg(0) int arg0) {
		this.aClass4_Sub9_5.anInt6207 = this.anIntArray268[arg0];
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)I")
	private int method2889(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub9_5.aByteArray81[this.aClass4_Sub9_5.anInt6207];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray267[arg0] = local13;
			this.aClass4_Sub9_5.anInt6207++;
		} else {
			local13 = this.anIntArray267[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method2885(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub9_5.method5000();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub9_5.aByteArray81[this.aClass4_Sub9_5.anInt6207] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub9_5.anInt6207++;
				this.anIntArray267[arg0] = local57;
				return this.method2885(arg0, local57);
			}
		}
		this.aClass4_Sub9_5.anInt6207 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
	public void method2891(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub9_5.method5000();
		this.anIntArray270[arg0] += local4;
	}
}
