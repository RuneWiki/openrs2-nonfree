import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class188 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	private int anInt5133;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public int anInt5134;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!jp;")
	private final Class3_Sub25 aClass3_Sub25_5 = new Class3_Sub25((byte[]) null);

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class188() {
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
	public Class188(@OriginalArg(0) byte[] arg0) {
		this.method4724(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
	private int method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static308.aByteArray47[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub25_5.method8632() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub25_5.method8632() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub25_5.method8632();
		local12 = this.aClass3_Sub25_5.method8626();
		if (local7 == 47) {
			this.aClass3_Sub25_5.anInt9765 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub25_5.method8607();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray461[arg0];
			this.aLong162 += (long) local38 * (long) (this.anInt5133 - local32);
			this.anInt5133 = local32;
			this.aClass3_Sub25_5.anInt9765 += local12;
			return 2;
		} else {
			this.aClass3_Sub25_5.anInt9765 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
	public int method4714() {
		@Pc(3) int local3 = this.anIntArray462.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray462[local9] >= 0 && this.anIntArray461[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray461[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()I")
	public int method4715() {
		return this.anIntArray462.length;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	private int method4716(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub25_5.aByteArray106[this.aClass3_Sub25_5.anInt9765];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray460[arg0] = local13;
			this.aClass3_Sub25_5.anInt9765++;
		} else {
			local13 = this.anIntArray460[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4713(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub25_5.method8626();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub25_5.aByteArray106[this.aClass3_Sub25_5.anInt9765] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub25_5.anInt9765++;
				this.anIntArray460[arg0] = local57;
				return this.method4713(arg0, local57);
			}
		}
		this.aClass3_Sub25_5.anInt9765 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
	public int method4717(@OriginalArg(0) int arg0) {
		return this.method4716(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
	public void method4718(@OriginalArg(0) int arg0) {
		this.anIntArray462[arg0] = this.aClass3_Sub25_5.anInt9765;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()Z")
	public boolean method4719() {
		@Pc(3) int local3 = this.anIntArray462.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray462[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "()Z")
	public boolean method4720() {
		return this.aClass3_Sub25_5.aByteArray106 != null;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public void method4721(@OriginalArg(0) int arg0) {
		this.aClass3_Sub25_5.anInt9765 = this.anIntArray462[arg0];
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "()V")
	public void method4722() {
		this.aClass3_Sub25_5.anInt9765 = -1;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public void method4723(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub25_5.method8626();
		this.anIntArray461[arg0] += local4;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V")
	public void method4724(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub25_5.aByteArray106 = arg0;
		this.aClass3_Sub25_5.anInt9765 = 10;
		@Pc(12) int local12 = this.aClass3_Sub25_5.method8593();
		this.anInt5134 = this.aClass3_Sub25_5.method8593();
		this.anInt5133 = 500000;
		this.anIntArray459 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub25_5.method8618();
			@Pc(38) int local38 = this.aClass3_Sub25_5.method8618();
			if (local33 == 1297379947) {
				this.anIntArray459[local27] = this.aClass3_Sub25_5.anInt9765;
				local27++;
			}
			this.aClass3_Sub25_5.anInt9765 += local38;
		}
		this.aLong162 = 0L;
		this.anIntArray462 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray462[local33] = this.anIntArray459[local33];
		}
		this.anIntArray461 = new int[local12];
		this.anIntArray460 = new int[local12];
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "()V")
	public void method4725() {
		this.aClass3_Sub25_5.aByteArray106 = null;
		this.anIntArray459 = null;
		this.anIntArray462 = null;
		this.anIntArray461 = null;
		this.anIntArray460 = null;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)J")
	public long method4727(@OriginalArg(0) int arg0) {
		return this.aLong162 + (long) arg0 * (long) this.anInt5133;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(J)V")
	public void method4728(@OriginalArg(0) long arg0) {
		this.aLong162 = arg0;
		@Pc(6) int local6 = this.anIntArray462.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray461[local8] = 0;
			this.anIntArray460[local8] = 0;
			this.aClass3_Sub25_5.anInt9765 = this.anIntArray459[local8];
			this.method4723(local8);
			this.anIntArray462[local8] = this.aClass3_Sub25_5.anInt9765;
		}
	}
}
