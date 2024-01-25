import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class230 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private int anInt6932;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public int anInt6933;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!co;")
	private final Class5_Sub3 aClass5_Sub3_14 = new Class5_Sub3(null);

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class230() {
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
	public Class230(@OriginalArg(0) byte[] arg0) {
		this.method5628(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	private int method5622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static375.aByteArray93[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass5_Sub3_14.method4220() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass5_Sub3_14.method4220() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass5_Sub3_14.method4220();
		local12 = this.aClass5_Sub3_14.method4223();
		if (local7 == 47) {
			this.aClass5_Sub3_14.anInt4960 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass5_Sub3_14.method4182();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray513[arg0];
			this.aLong187 += (long) local38 * (long) (this.anInt6932 - local32);
			this.anInt6932 = local32;
			this.aClass5_Sub3_14.anInt4960 += local12;
			return 2;
		} else {
			this.aClass5_Sub3_14.anInt4960 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z")
	public boolean method5623() {
		@Pc(3) int local3 = this.anIntArray515.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray515[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J")
	public long method5624(@OriginalArg(0) int arg0) {
		return this.aLong187 + (long) arg0 * (long) this.anInt6932;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
	public void method5625() {
		this.aClass5_Sub3_14.aByteArray66 = null;
		this.anIntArray516 = null;
		this.anIntArray515 = null;
		this.anIntArray513 = null;
		this.anIntArray514 = null;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method5626(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass5_Sub3_14.method4223();
		this.anIntArray513[arg0] += local4;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
	public void method5627() {
		this.aClass5_Sub3_14.anInt4960 = -1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([B)V")
	public void method5628(@OriginalArg(0) byte[] arg0) {
		this.aClass5_Sub3_14.aByteArray66 = arg0;
		this.aClass5_Sub3_14.anInt4960 = 10;
		@Pc(12) int local12 = this.aClass5_Sub3_14.method4227();
		this.anInt6933 = this.aClass5_Sub3_14.method4227();
		this.anInt6932 = 500000;
		this.anIntArray516 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass5_Sub3_14.method4230();
			@Pc(38) int local38 = this.aClass5_Sub3_14.method4230();
			if (local33 == 1297379947) {
				this.anIntArray516[local27] = this.aClass5_Sub3_14.anInt4960;
				local27++;
			}
			this.aClass5_Sub3_14.anInt4960 += local38;
		}
		this.aLong187 = 0L;
		this.anIntArray515 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray515[local33] = this.anIntArray516[local33];
		}
		this.anIntArray513 = new int[local12];
		this.anIntArray514 = new int[local12];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(J)V")
	public void method5630(@OriginalArg(0) long arg0) {
		this.aLong187 = arg0;
		@Pc(6) int local6 = this.anIntArray515.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray513[local8] = 0;
			this.anIntArray514[local8] = 0;
			this.aClass5_Sub3_14.anInt4960 = this.anIntArray516[local8];
			this.method5626(local8);
			this.anIntArray515[local8] = this.aClass5_Sub3_14.anInt4960;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public void method5631(@OriginalArg(0) int arg0) {
		this.anIntArray515[arg0] = this.aClass5_Sub3_14.anInt4960;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()I")
	public int method5632() {
		return this.anIntArray515.length;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
	public int method5633(@OriginalArg(0) int arg0) {
		return this.method5636(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z")
	public boolean method5634() {
		return this.aClass5_Sub3_14.aByteArray66 != null;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public void method5635(@OriginalArg(0) int arg0) {
		this.aClass5_Sub3_14.anInt4960 = this.anIntArray515[arg0];
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)I")
	private int method5636(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass5_Sub3_14.aByteArray66[this.aClass5_Sub3_14.anInt4960];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray514[arg0] = local13;
			this.aClass5_Sub3_14.anInt4960++;
		} else {
			local13 = this.anIntArray514[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5622(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass5_Sub3_14.method4223();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass5_Sub3_14.aByteArray66[this.aClass5_Sub3_14.anInt4960] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass5_Sub3_14.anInt4960++;
				this.anIntArray514[arg0] = local57;
				return this.method5622(arg0, local57);
			}
		}
		this.aClass5_Sub3_14.anInt4960 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "()I")
	public int method5637() {
		@Pc(3) int local3 = this.anIntArray515.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray515[local9] >= 0 && this.anIntArray513[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray513[local9];
			}
		}
		return local5;
	}
}
