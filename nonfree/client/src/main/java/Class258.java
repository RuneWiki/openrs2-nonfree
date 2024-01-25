import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class258 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	private int[] anIntArray504;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public int anInt6912;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private int anInt6913;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!cu;")
	private final Class3_Sub7 aClass3_Sub7_8 = new Class3_Sub7(null);

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class258() {
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
	public Class258(@OriginalArg(0) byte[] arg0) {
		this.method5423(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)I")
	public int method5408(@OriginalArg(0) int arg0) {
		return this.method5418(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
	public void method5409() {
		this.aClass3_Sub7_8.aByteArray46 = null;
		this.anIntArray506 = null;
		this.anIntArray504 = null;
		this.anIntArray503 = null;
		this.anIntArray505 = null;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "()Z")
	public boolean method5411() {
		@Pc(3) int local3 = this.anIntArray504.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray504[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	private int method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static425.aByteArray88[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub7_8.method2582() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub7_8.method2582() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub7_8.method2582();
		local12 = this.aClass3_Sub7_8.method2600();
		if (local7 == 47) {
			this.aClass3_Sub7_8.anInt3235 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub7_8.method2604();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray503[arg0];
			this.aLong212 += (long) local38 * (long) (this.anInt6913 - local32);
			this.anInt6913 = local32;
			this.aClass3_Sub7_8.anInt3235 += local12;
			return 2;
		} else {
			this.aClass3_Sub7_8.anInt3235 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)J")
	public long method5413(@OriginalArg(0) int arg0) {
		return this.aLong212 + (long) arg0 * (long) this.anInt6913;
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "()I")
	public int method5414() {
		return this.anIntArray504.length;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "()Z")
	public boolean method5415() {
		return this.aClass3_Sub7_8.aByteArray46 != null;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "()V")
	public void method5416() {
		this.aClass3_Sub7_8.anInt3235 = -1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(J)V")
	public void method5417(@OriginalArg(0) long arg0) {
		this.aLong212 = arg0;
		@Pc(6) int local6 = this.anIntArray504.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray503[local8] = 0;
			this.anIntArray505[local8] = 0;
			this.aClass3_Sub7_8.anInt3235 = this.anIntArray506[local8];
			this.method5420(local8);
			this.anIntArray504[local8] = this.aClass3_Sub7_8.anInt3235;
		}
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I")
	private int method5418(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub7_8.aByteArray46[this.aClass3_Sub7_8.anInt3235];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray505[arg0] = local13;
			this.aClass3_Sub7_8.anInt3235++;
		} else {
			local13 = this.anIntArray505[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5412(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub7_8.method2600();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub7_8.aByteArray46[this.aClass3_Sub7_8.anInt3235] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub7_8.anInt3235++;
				this.anIntArray505[arg0] = local57;
				return this.method5412(arg0, local57);
			}
		}
		this.aClass3_Sub7_8.anInt3235 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "()I")
	public int method5419() {
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

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
	public void method5420(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub7_8.method2600();
		this.anIntArray503[arg0] += local4;
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
	public void method5421(@OriginalArg(0) int arg0) {
		this.anIntArray504[arg0] = this.aClass3_Sub7_8.anInt3235;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
	public void method5422(@OriginalArg(0) int arg0) {
		this.aClass3_Sub7_8.anInt3235 = this.anIntArray504[arg0];
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([B)V")
	public void method5423(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub7_8.aByteArray46 = arg0;
		this.aClass3_Sub7_8.anInt3235 = 10;
		@Pc(12) int local12 = this.aClass3_Sub7_8.method2588();
		this.anInt6912 = this.aClass3_Sub7_8.method2588();
		this.anInt6913 = 500000;
		this.anIntArray506 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub7_8.method2589();
			@Pc(38) int local38 = this.aClass3_Sub7_8.method2589();
			if (local33 == 1297379947) {
				this.anIntArray506[local27] = this.aClass3_Sub7_8.anInt3235;
				local27++;
			}
			this.aClass3_Sub7_8.anInt3235 += local38;
		}
		this.aLong212 = 0L;
		this.anIntArray504 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray504[local33] = this.anIntArray506[local33];
		}
		this.anIntArray503 = new int[local12];
		this.anIntArray505 = new int[local12];
	}
}
