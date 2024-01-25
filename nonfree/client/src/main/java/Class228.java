import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class228 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	private int anInt6351;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public int anInt6352;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!fh;")
	private final Class5_Sub15 aClass5_Sub15_8 = new Class5_Sub15(null);

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class228() {
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
	public Class228(@OriginalArg(0) byte[] arg0) {
		this.method5025(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()Z")
	public boolean method5020() {
		return this.aClass5_Sub15_8.aByteArray93 != null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public void method5021(@OriginalArg(0) int arg0) {
		this.anIntArray448[arg0] = this.aClass5_Sub15_8.anInt7013;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public void method5022(@OriginalArg(0) int arg0) {
		this.aClass5_Sub15_8.anInt7013 = this.anIntArray448[arg0];
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public void method5023(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub15_8.method5574();
		this.anIntArray449[arg0] += local4;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
	public int method5024() {
		return this.anIntArray448.length;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([B)V")
	public void method5025(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub15_8.aByteArray93 = arg0;
		this.aClass5_Sub15_8.anInt7013 = 10;
		@Pc(12) int local12 = this.aClass5_Sub15_8.method5598();
		this.anInt6352 = this.aClass5_Sub15_8.method5598();
		this.anInt6351 = 500000;
		this.anIntArray447 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub15_8.method5603();
			@Pc(38) int local38 = this.aClass5_Sub15_8.method5603();
			if (local33 == 1297379947) {
				this.anIntArray447[local27] = this.aClass5_Sub15_8.anInt7013;
				local27++;
			}
			this.aClass5_Sub15_8.anInt7013 += local38;
		}
		this.aLong196 = 0L;
		this.anIntArray448 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray448[local33] = this.anIntArray447[local33];
		}
		this.anIntArray449 = new int[local12];
		this.anIntArray446 = new int[local12];
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)J")
	public long method5026(@OriginalArg(0) int arg0) {
		return this.aLong196 + (long) arg0 * (long) this.anInt6351;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)I")
	private int method5027(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub15_8.aByteArray93[this.aClass5_Sub15_8.anInt7013];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray446[arg0] = local13;
			this.aClass5_Sub15_8.anInt7013++;
		} else {
			local13 = this.anIntArray446[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5028(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub15_8.method5574();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub15_8.aByteArray93[this.aClass5_Sub15_8.anInt7013] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub15_8.anInt7013++;
				this.anIntArray446[arg0] = local57;
				return this.method5028(arg0, local57);
			}
		}
		this.aClass5_Sub15_8.anInt7013 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
	private int method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static385.aByteArray83[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub15_8.method5539() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub15_8.method5539() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub15_8.method5539();
		local12 = this.aClass5_Sub15_8.method5574();
		if (local7 == 47) {
			this.aClass5_Sub15_8.anInt7013 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub15_8.method5541();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray449[arg0];
			this.aLong196 += (long) local38 * (long) (this.anInt6351 - local32);
			this.anInt6351 = local32;
			this.aClass5_Sub15_8.anInt7013 += local12;
			return 2;
		} else {
			this.aClass5_Sub15_8.anInt7013 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)I")
	public int method5029(@OriginalArg(0) int arg0) {
		return this.method5027(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
	public int method5030() {
		@Pc(3) int local3 = this.anIntArray448.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray448[local9] >= 0 && this.anIntArray449[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray449[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
	public void method5031() {
		this.aClass5_Sub15_8.anInt7013 = -1;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "()Z")
	public boolean method5032() {
		@Pc(3) int local3 = this.anIntArray448.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray448[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "()V")
	public void method5033() {
		this.aClass5_Sub15_8.aByteArray93 = null;
		this.anIntArray447 = null;
		this.anIntArray448 = null;
		this.anIntArray449 = null;
		this.anIntArray446 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(J)V")
	public void method5034(@OriginalArg(0) long arg0) {
		this.aLong196 = arg0;
		@Pc(6) int local6 = this.anIntArray448.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray449[local8] = 0;
			this.anIntArray446[local8] = 0;
			this.aClass5_Sub15_8.anInt7013 = this.anIntArray447[local8];
			this.method5023(local8);
			this.anIntArray448[local8] = this.aClass5_Sub15_8.anInt7013;
		}
	}
}
