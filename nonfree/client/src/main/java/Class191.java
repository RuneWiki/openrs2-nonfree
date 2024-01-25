import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class191 {

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	private int anInt5855;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!mc;")
	private final Class5_Sub41 aClass5_Sub41_3 = new Class5_Sub41((byte[]) null);

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V")
	public Class191() {
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([B)V")
	public Class191(@OriginalArg(0) byte[] arg0) {
		this.method4863(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "()I")
	public int method4848() {
		return this.anIntArray330.length;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public void method4849(@OriginalArg(0) int arg0) {
		this.anIntArray330[arg0] = this.aClass5_Sub41_3.anInt9230;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "()V")
	public void method4850() {
		this.aClass5_Sub41_3.aByteArray93 = null;
		this.anIntArray328 = null;
		this.anIntArray330 = null;
		this.anIntArray329 = null;
		this.anIntArray327 = null;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)J")
	public long method4851(@OriginalArg(0) int arg0) {
		return this.aLong152 + (long) arg0 * (long) this.anInt5855;
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)I")
	public int method4852(@OriginalArg(0) int arg0) {
		return this.method4858(arg0);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I")
	private int method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static307.aByteArray50[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub41_3.method7816() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub41_3.method7816() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub41_3.method7816();
		local12 = this.aClass5_Sub41_3.method7832();
		if (local7 == 47) {
			this.aClass5_Sub41_3.anInt9230 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub41_3.method7807();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray329[arg0];
			this.aLong152 += (long) local38 * (long) (this.anInt5855 - local32);
			this.anInt5855 = local32;
			this.aClass5_Sub41_3.anInt9230 += local12;
			return 2;
		} else {
			this.aClass5_Sub41_3.anInt9230 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(J)V")
	public void method4854(@OriginalArg(0) long arg0) {
		this.aLong152 = arg0;
		@Pc(6) int local6 = this.anIntArray330.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray329[local8] = 0;
			this.anIntArray327[local8] = 0;
			this.aClass5_Sub41_3.anInt9230 = this.anIntArray328[local8];
			this.method4857(local8);
			this.anIntArray330[local8] = this.aClass5_Sub41_3.anInt9230;
		}
	}

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "()V")
	public void method4855() {
		this.aClass5_Sub41_3.anInt9230 = -1;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "()Z")
	public boolean method4856() {
		return this.aClass5_Sub41_3.aByteArray93 != null;
	}

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V")
	public void method4857(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub41_3.method7832();
		this.anIntArray329[arg0] += local4;
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)I")
	private int method4858(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub41_3.aByteArray93[this.aClass5_Sub41_3.anInt9230];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray327[arg0] = local13;
			this.aClass5_Sub41_3.anInt9230++;
		} else {
			local13 = this.anIntArray327[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4853(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub41_3.method7832();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub41_3.aByteArray93[this.aClass5_Sub41_3.anInt9230] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub41_3.anInt9230++;
				this.anIntArray327[arg0] = local57;
				return this.method4853(arg0, local57);
			}
		}
		this.aClass5_Sub41_3.anInt9230 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "()Z")
	public boolean method4859() {
		@Pc(3) int local3 = this.anIntArray330.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray330[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "()I")
	public int method4861() {
		@Pc(3) int local3 = this.anIntArray330.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray330[local9] >= 0 && this.anIntArray329[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray329[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "(I)V")
	public void method4862(@OriginalArg(0) int arg0) {
		this.aClass5_Sub41_3.anInt9230 = this.anIntArray330[arg0];
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([B)V")
	public void method4863(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub41_3.aByteArray93 = arg0;
		this.aClass5_Sub41_3.anInt9230 = 10;
		@Pc(12) int local12 = this.aClass5_Sub41_3.method7860();
		this.anInt5854 = this.aClass5_Sub41_3.method7860();
		this.anInt5855 = 500000;
		this.anIntArray328 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub41_3.method7804();
			@Pc(38) int local38 = this.aClass5_Sub41_3.method7804();
			if (local33 == 1297379947) {
				this.anIntArray328[local27] = this.aClass5_Sub41_3.anInt9230;
				local27++;
			}
			this.aClass5_Sub41_3.anInt9230 += local38;
		}
		this.aLong152 = 0L;
		this.anIntArray330 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray330[local33] = this.anIntArray328[local33];
		}
		this.anIntArray329 = new int[local12];
		this.anIntArray327 = new int[local12];
	}
}
