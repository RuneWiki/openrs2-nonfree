import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class181 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	public int anInt4855;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt4856;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "Lclient!np;")
	private final Class3_Sub11 aClass3_Sub11_2 = new Class3_Sub11(null);

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class181() {
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([B)V")
	public Class181(@OriginalArg(0) byte[] arg0) {
		this.method4188(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public int method4186(@OriginalArg(0) int arg0) {
		return this.method4191(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()Z")
	public boolean method4187() {
		@Pc(3) int local3 = this.anIntArray262.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray262[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([B)V")
	public void method4188(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub11_2.aByteArray62 = arg0;
		this.aClass3_Sub11_2.anInt6128 = 10;
		@Pc(12) int local12 = this.aClass3_Sub11_2.method5198();
		this.anInt4855 = this.aClass3_Sub11_2.method5198();
		this.anInt4856 = 500000;
		this.anIntArray264 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub11_2.method5186();
			@Pc(38) int local38 = this.aClass3_Sub11_2.method5186();
			if (local33 == 1297379947) {
				this.anIntArray264[local27] = this.aClass3_Sub11_2.anInt6128;
				local27++;
			}
			this.aClass3_Sub11_2.anInt6128 += local38;
		}
		this.aLong141 = 0L;
		this.anIntArray262 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray262[local33] = this.anIntArray264[local33];
		}
		this.anIntArray263 = new int[local12];
		this.anIntArray265 = new int[local12];
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()V")
	public void method4189() {
		this.aClass3_Sub11_2.anInt6128 = -1;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
	public void method4190() {
		this.aClass3_Sub11_2.aByteArray62 = null;
		this.anIntArray264 = null;
		this.anIntArray262 = null;
		this.anIntArray263 = null;
		this.anIntArray265 = null;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I")
	private int method4191(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub11_2.aByteArray62[this.aClass3_Sub11_2.anInt6128];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray265[arg0] = local13;
			this.aClass3_Sub11_2.anInt6128++;
		} else {
			local13 = this.anIntArray265[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4197(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub11_2.method5207();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub11_2.aByteArray62[this.aClass3_Sub11_2.anInt6128] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub11_2.anInt6128++;
				this.anIntArray265[arg0] = local57;
				return this.method4197(arg0, local57);
			}
		}
		this.aClass3_Sub11_2.anInt6128 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public void method4192(@OriginalArg(0) int arg0) {
		this.anIntArray262[arg0] = this.aClass3_Sub11_2.anInt6128;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public void method4193(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub11_2.method5207();
		this.anIntArray263[arg0] += local4;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()Z")
	public boolean method4194() {
		return this.aClass3_Sub11_2.aByteArray62 != null;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "()I")
	public int method4195() {
		@Pc(3) int local3 = this.anIntArray262.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray262[local9] >= 0 && this.anIntArray263[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray263[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	private int method4197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static281.aByteArray56[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub11_2.method5175() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub11_2.method5175() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub11_2.method5175();
		local12 = this.aClass3_Sub11_2.method5207();
		if (local7 == 47) {
			this.aClass3_Sub11_2.anInt6128 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub11_2.method5230();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray263[arg0];
			this.aLong141 += (long) local38 * (long) (this.anInt4856 - local32);
			this.anInt4856 = local32;
			this.aClass3_Sub11_2.anInt6128 += local12;
			return 2;
		} else {
			this.aClass3_Sub11_2.anInt6128 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)J")
	public long method4198(@OriginalArg(0) int arg0) {
		return this.aLong141 + (long) arg0 * (long) this.anInt4856;
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "()I")
	public int method4199() {
		return this.anIntArray262.length;
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)V")
	public void method4200(@OriginalArg(0) int arg0) {
		this.aClass3_Sub11_2.anInt6128 = this.anIntArray262[arg0];
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(J)V")
	public void method4201(@OriginalArg(0) long arg0) {
		this.aLong141 = arg0;
		@Pc(6) int local6 = this.anIntArray262.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray263[local8] = 0;
			this.anIntArray265[local8] = 0;
			this.aClass3_Sub11_2.anInt6128 = this.anIntArray264[local8];
			this.method4193(local8);
			this.anIntArray262[local8] = this.aClass3_Sub11_2.anInt6128;
		}
	}
}
