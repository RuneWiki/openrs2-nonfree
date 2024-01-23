import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class186 {

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
	public int[] anIntArray607;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	private int[] anIntArray609;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public int anInt5889;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[I")
	private int[] anIntArray610;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!ug;")
	private Class3_Sub26 aClass3_Sub26_9 = new Class3_Sub26(null);

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	public Class186() {
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
	public Class186(@OriginalArg(0) byte[] arg0) {
		this.method4828(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
	private int method4816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static298.aByteArray74[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub26_9.method3915() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub26_9.method3915() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub26_9.method3915();
		local12 = this.aClass3_Sub26_9.method3918();
		if (local7 == 47) {
			this.aClass3_Sub26_9.anInt4615 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub26_9.method3899();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray607[arg0];
			this.aLong232 += (long) local38 * (long) (this.anInt5890 - local32);
			this.anInt5890 = local32;
			this.aClass3_Sub26_9.anInt4615 += local12;
			return 2;
		} else {
			this.aClass3_Sub26_9.anInt4615 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "()Z")
	public boolean method4817() {
		@Pc(3) int local3 = this.anIntArray610.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray610[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I")
	public int method4818(@OriginalArg(0) int arg0) {
		return this.method4830(arg0);
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
	public void method4819(@OriginalArg(0) int arg0) {
		this.aClass3_Sub26_9.anInt4615 = this.anIntArray610[arg0];
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "()V")
	public void method4820() {
		this.aClass3_Sub26_9.aByteArray64 = null;
		this.anIntArray609 = null;
		this.anIntArray610 = null;
		this.anIntArray607 = null;
		this.anIntArray608 = null;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
	public void method4821(@OriginalArg(0) int arg0) {
		this.anIntArray610[arg0] = this.aClass3_Sub26_9.anInt4615;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)J")
	public long method4822(@OriginalArg(0) int arg0) {
		return this.aLong232 + (long) arg0 * (long) this.anInt5890;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "()Z")
	public boolean method4823() {
		return this.aClass3_Sub26_9.aByteArray64 != null;
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "()I")
	public int method4824() {
		@Pc(3) int local3 = this.anIntArray610.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray610[local9] >= 0 && this.anIntArray607[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray607[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "()V")
	public void method4825() {
		this.aClass3_Sub26_9.anInt4615 = -1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(J)V")
	public void method4826(@OriginalArg(0) long arg0) {
		this.aLong232 = arg0;
		@Pc(6) int local6 = this.anIntArray610.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray607[local8] = 0;
			this.anIntArray608[local8] = 0;
			this.aClass3_Sub26_9.anInt4615 = this.anIntArray609[local8];
			this.method4827(local8);
			this.anIntArray610[local8] = this.aClass3_Sub26_9.anInt4615;
		}
	}

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
	public void method4827(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub26_9.method3918();
		this.anIntArray607[arg0] += local4;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([B)V")
	public void method4828(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub26_9.aByteArray64 = arg0;
		this.aClass3_Sub26_9.anInt4615 = 10;
		@Pc(12) int local12 = this.aClass3_Sub26_9.method3948();
		this.anInt5889 = this.aClass3_Sub26_9.method3948();
		this.anInt5890 = 500000;
		this.anIntArray609 = new int[local12];
		@Pc(27) int local27 = 0;
		while (local27 < local12) {
			@Pc(35) int local35 = this.aClass3_Sub26_9.method3896();
			@Pc(40) int local40 = this.aClass3_Sub26_9.method3896();
			if (local35 == 1297379947) {
				this.anIntArray609[local27] = this.aClass3_Sub26_9.anInt4615;
				local27++;
			}
			this.aClass3_Sub26_9.anInt4615 += local40;
		}
		this.aLong232 = 0L;
		this.anIntArray610 = new int[local12];
		for (local27 = 0; local27 < local12; local27++) {
			this.anIntArray610[local27] = this.anIntArray609[local27];
		}
		this.anIntArray607 = new int[local12];
		this.anIntArray608 = new int[local12];
	}

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "()I")
	public int method4829() {
		return this.anIntArray610.length;
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)I")
	private int method4830(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub26_9.aByteArray64[this.aClass3_Sub26_9.anInt4615];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray608[arg0] = local13;
			this.aClass3_Sub26_9.anInt4615++;
		} else {
			local13 = this.anIntArray608[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method4816(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub26_9.method3918();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub26_9.aByteArray64[this.aClass3_Sub26_9.anInt4615] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub26_9.anInt4615++;
				this.anIntArray608[arg0] = local57;
				return this.method4816(arg0, local57);
			}
		}
		this.aClass3_Sub26_9.anInt4615 += local42;
		return 0;
	}
}
