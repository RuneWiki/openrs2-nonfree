import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class60 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
	public int[] anIntArray338;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
	private int[] anIntArray341;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "Lclient!kk;")
	private final Class2_Sub16 aClass2_Sub16_2 = new Class2_Sub16(null);

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class60() {
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
	public Class60(@OriginalArg(0) byte[] arg0) {
		this.method1218(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "()I")
	public int method1210() {
		@Pc(3) int local3 = this.anIntArray341.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray341[local9] >= 0 && this.anIntArray338[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray338[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	private int method1211(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass2_Sub16_2.aByteArray112[this.aClass2_Sub16_2.anInt6145];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray339[arg0] = local13;
			this.aClass2_Sub16_2.anInt6145++;
		} else {
			local13 = this.anIntArray339[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method1224(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass2_Sub16_2.method5329();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass2_Sub16_2.aByteArray112[this.aClass2_Sub16_2.anInt6145] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass2_Sub16_2.anInt6145++;
				this.anIntArray339[arg0] = local57;
				return this.method1224(arg0, local57);
			}
		}
		this.aClass2_Sub16_2.anInt6145 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
	public int method1212() {
		return this.anIntArray341.length;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public void method1213(@OriginalArg(0) int arg0) {
		this.aClass2_Sub16_2.anInt6145 = this.anIntArray341[arg0];
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
	public int method1214(@OriginalArg(0) int arg0) {
		return this.method1211(arg0);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()Z")
	public boolean method1215() {
		return this.aClass2_Sub16_2.aByteArray112 != null;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()V")
	public void method1216() {
		this.aClass2_Sub16_2.anInt6145 = -1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(J)V")
	public void method1217(@OriginalArg(0) long arg0) {
		this.aLong58 = arg0;
		@Pc(6) int local6 = this.anIntArray341.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray338[local8] = 0;
			this.anIntArray339[local8] = 0;
			this.aClass2_Sub16_2.anInt6145 = this.anIntArray340[local8];
			this.method1221(local8);
			this.anIntArray341[local8] = this.aClass2_Sub16_2.anInt6145;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
	public void method1218(@OriginalArg(0) byte[] arg0) {
		this.aClass2_Sub16_2.aByteArray112 = arg0;
		this.aClass2_Sub16_2.anInt6145 = 10;
		@Pc(12) int local12 = this.aClass2_Sub16_2.method5312();
		this.anInt1464 = this.aClass2_Sub16_2.method5312();
		this.anInt1465 = 500000;
		this.anIntArray340 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass2_Sub16_2.method5346();
			@Pc(38) int local38 = this.aClass2_Sub16_2.method5346();
			if (local33 == 1297379947) {
				this.anIntArray340[local27] = this.aClass2_Sub16_2.anInt6145;
				local27++;
			}
			this.aClass2_Sub16_2.anInt6145 += local38;
		}
		this.aLong58 = 0L;
		this.anIntArray341 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray341[local33] = this.anIntArray340[local33];
		}
		this.anIntArray338 = new int[local12];
		this.anIntArray339 = new int[local12];
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V")
	public void method1219(@OriginalArg(0) int arg0) {
		this.anIntArray341[arg0] = this.aClass2_Sub16_2.anInt6145;
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
	public void method1221(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass2_Sub16_2.method5329();
		this.anIntArray338[arg0] += local4;
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "()Z")
	public boolean method1222() {
		@Pc(3) int local3 = this.anIntArray341.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray341[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "()V")
	public void method1223() {
		this.aClass2_Sub16_2.aByteArray112 = null;
		this.anIntArray340 = null;
		this.anIntArray341 = null;
		this.anIntArray338 = null;
		this.anIntArray339 = null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
	private int method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static78.aByteArray23[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass2_Sub16_2.method5350() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass2_Sub16_2.method5350() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass2_Sub16_2.method5350();
		local12 = this.aClass2_Sub16_2.method5329();
		if (local7 == 47) {
			this.aClass2_Sub16_2.anInt6145 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass2_Sub16_2.method5356();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray338[arg0];
			this.aLong58 += (long) local38 * (long) (this.anInt1465 - local32);
			this.anInt1465 = local32;
			this.aClass2_Sub16_2.anInt6145 += local12;
			return 2;
		} else {
			this.aClass2_Sub16_2.anInt6145 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "(I)J")
	public long method1225(@OriginalArg(0) int arg0) {
		return this.aLong58 + (long) arg0 * (long) this.anInt1465;
	}
}
