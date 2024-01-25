import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class245 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public int anInt6947;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	private int anInt6948;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	private int[] anIntArray437;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!nj;")
	private final Class3_Sub25 aClass3_Sub25_8 = new Class3_Sub25(null);

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class245() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
	public Class245(@OriginalArg(0) byte[] arg0) {
		this.method5672(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
	private int method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static411.aByteArray117[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass3_Sub25_8.method4096() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass3_Sub25_8.method4096() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass3_Sub25_8.method4096();
		local12 = this.aClass3_Sub25_8.method4078();
		if (local7 == 47) {
			this.aClass3_Sub25_8.anInt4974 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass3_Sub25_8.method4099();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray438[arg0];
			this.aLong230 += (long) local38 * (long) (this.anInt6948 - local32);
			this.anInt6948 = local32;
			this.aClass3_Sub25_8.anInt4974 += local12;
			return 2;
		} else {
			this.aClass3_Sub25_8.anInt4974 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public void method5658() {
		this.aClass3_Sub25_8.anInt4974 = -1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()Z")
	public boolean method5659() {
		@Pc(3) int local3 = this.anIntArray435.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray435[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
	public int method5661(@OriginalArg(0) int arg0) {
		return this.method5668(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(J)V")
	public void method5662(@OriginalArg(0) long arg0) {
		this.aLong230 = arg0;
		@Pc(6) int local6 = this.anIntArray435.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray438[local8] = 0;
			this.anIntArray436[local8] = 0;
			this.aClass3_Sub25_8.anInt4974 = this.anIntArray437[local8];
			this.method5663(local8);
			this.anIntArray435[local8] = this.aClass3_Sub25_8.anInt4974;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method5663(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass3_Sub25_8.method4078();
		this.anIntArray438[arg0] += local4;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Z")
	public boolean method5664() {
		return this.aClass3_Sub25_8.aByteArray88 != null;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public void method5665(@OriginalArg(0) int arg0) {
		this.aClass3_Sub25_8.anInt4974 = this.anIntArray435[arg0];
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()I")
	public int method5666() {
		return this.anIntArray435.length;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public void method5667(@OriginalArg(0) int arg0) {
		this.anIntArray435[arg0] = this.aClass3_Sub25_8.anInt4974;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I")
	private int method5668(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass3_Sub25_8.aByteArray88[this.aClass3_Sub25_8.anInt4974];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray436[arg0] = local13;
			this.aClass3_Sub25_8.anInt4974++;
		} else {
			local13 = this.anIntArray436[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method5657(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass3_Sub25_8.method4078();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass3_Sub25_8.aByteArray88[this.aClass3_Sub25_8.anInt4974] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass3_Sub25_8.anInt4974++;
				this.anIntArray436[arg0] = local57;
				return this.method5657(arg0, local57);
			}
		}
		this.aClass3_Sub25_8.anInt4974 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()I")
	public int method5669() {
		@Pc(3) int local3 = this.anIntArray435.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray435[local9] >= 0 && this.anIntArray438[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray438[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "()V")
	public void method5670() {
		this.aClass3_Sub25_8.aByteArray88 = null;
		this.anIntArray437 = null;
		this.anIntArray435 = null;
		this.anIntArray438 = null;
		this.anIntArray436 = null;
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)J")
	public long method5671(@OriginalArg(0) int arg0) {
		return this.aLong230 + (long) arg0 * (long) this.anInt6948;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([B)V")
	public void method5672(@OriginalArg(0) byte[] arg0) {
		this.aClass3_Sub25_8.aByteArray88 = arg0;
		this.aClass3_Sub25_8.anInt4974 = 10;
		@Pc(12) int local12 = this.aClass3_Sub25_8.method4083();
		this.anInt6947 = this.aClass3_Sub25_8.method4083();
		this.anInt6948 = 500000;
		this.anIntArray437 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass3_Sub25_8.method4108();
			@Pc(38) int local38 = this.aClass3_Sub25_8.method4108();
			if (local33 == 1297379947) {
				this.anIntArray437[local27] = this.aClass3_Sub25_8.anInt4974;
				local27++;
			}
			this.aClass3_Sub25_8.anInt4974 += local38;
		}
		this.aLong230 = 0L;
		this.anIntArray435 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray435[local33] = this.anIntArray437[local33];
		}
		this.anIntArray438 = new int[local12];
		this.anIntArray436 = new int[local12];
	}
}
