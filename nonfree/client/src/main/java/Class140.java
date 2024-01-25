import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class140 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt4404;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[I")
	private int[] anIntArray347;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!wn;")
	private final Class4_Sub20 aClass4_Sub20_3 = new Class4_Sub20(null);

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class140() {
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V")
	public Class140(@OriginalArg(0) byte[] arg0) {
		this.method3771(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V")
	public void method3771(@OriginalArg(0) byte[] arg0) {
		this.aClass4_Sub20_3.aByteArray77 = arg0;
		this.aClass4_Sub20_3.anInt5526 = 10;
		@Pc(12) int local12 = this.aClass4_Sub20_3.method4560();
		this.anInt4403 = this.aClass4_Sub20_3.method4560();
		this.anInt4404 = 500000;
		this.anIntArray347 = new int[local12];
		@Pc(27) int local27 = 0;
		@Pc(33) int local33;
		while (local27 < local12) {
			local33 = this.aClass4_Sub20_3.method4595();
			@Pc(38) int local38 = this.aClass4_Sub20_3.method4595();
			if (local33 == 1297379947) {
				this.anIntArray347[local27] = this.aClass4_Sub20_3.anInt5526;
				local27++;
			}
			this.aClass4_Sub20_3.anInt5526 += local38;
		}
		this.aLong137 = 0L;
		this.anIntArray346 = new int[local12];
		for (local33 = 0; local33 < local12; local33++) {
			this.anIntArray346[local33] = this.anIntArray347[local33];
		}
		this.anIntArray345 = new int[local12];
		this.anIntArray348 = new int[local12];
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()V")
	public void method3772() {
		this.aClass4_Sub20_3.aByteArray77 = null;
		this.anIntArray347 = null;
		this.anIntArray346 = null;
		this.anIntArray345 = null;
		this.anIntArray348 = null;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()I")
	public int method3773() {
		@Pc(3) int local3 = this.anIntArray346.length;
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = Integer.MAX_VALUE;
		for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
			if (this.anIntArray346[local9] >= 0 && this.anIntArray345[local9] < local7) {
				local5 = local9;
				local7 = this.anIntArray345[local9];
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)I")
	private int method3774(@OriginalArg(0) int arg0) {
		@Pc(7) byte local7 = this.aClass4_Sub20_3.aByteArray77[this.aClass4_Sub20_3.anInt5526];
		@Pc(13) int local13;
		if (local7 < 0) {
			local13 = local7 & 0xFF;
			this.anIntArray348[arg0] = local13;
			this.aClass4_Sub20_3.anInt5526++;
		} else {
			local13 = this.anIntArray348[arg0];
		}
		if (local13 != 240 && local13 != 247) {
			return this.method3780(arg0, local13);
		}
		@Pc(42) int local42 = this.aClass4_Sub20_3.method4557();
		if (local13 == 247 && local42 > 0) {
			@Pc(57) int local57 = this.aClass4_Sub20_3.aByteArray77[this.aClass4_Sub20_3.anInt5526] & 0xFF;
			if (local57 >= 241 && local57 <= 243 || local57 == 246 || local57 == 248 || local57 >= 250 && local57 <= 252 || local57 == 254) {
				this.aClass4_Sub20_3.anInt5526++;
				this.anIntArray348[arg0] = local57;
				return this.method3780(arg0, local57);
			}
		}
		this.aClass4_Sub20_3.anInt5526 += local42;
		return 0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public void method3775(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = this.aClass4_Sub20_3.method4557();
		this.anIntArray345[arg0] += local4;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)I")
	public int method3776(@OriginalArg(0) int arg0) {
		return this.method3774(arg0);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()Z")
	public boolean method3777() {
		return this.aClass4_Sub20_3.aByteArray77 != null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(J)V")
	public void method3778(@OriginalArg(0) long arg0) {
		this.aLong137 = arg0;
		@Pc(6) int local6 = this.anIntArray346.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			this.anIntArray345[local8] = 0;
			this.anIntArray348[local8] = 0;
			this.aClass4_Sub20_3.anInt5526 = this.anIntArray347[local8];
			this.method3775(local8);
			this.anIntArray346[local8] = this.aClass4_Sub20_3.anInt5526;
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "()Z")
	public boolean method3779() {
		@Pc(3) int local3 = this.anIntArray346.length;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (this.anIntArray346[local5] >= 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	private int method3780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12;
		if (arg1 != 255) {
			@Pc(78) byte local78 = Static217.aByteArray58[arg1 - 128];
			local12 = arg1;
			if (local78 >= 1) {
				local12 = arg1 | this.aClass4_Sub20_3.method4614() << 8;
			}
			if (local78 >= 2) {
				local12 |= this.aClass4_Sub20_3.method4614() << 16;
			}
			return local12;
		}
		@Pc(7) int local7 = this.aClass4_Sub20_3.method4614();
		local12 = this.aClass4_Sub20_3.method4557();
		if (local7 == 47) {
			this.aClass4_Sub20_3.anInt5526 += local12;
			return 1;
		} else if (local7 == 81) {
			@Pc(32) int local32 = this.aClass4_Sub20_3.method4582();
			local12 -= 3;
			@Pc(38) int local38 = this.anIntArray345[arg0];
			this.aLong137 += (long) local38 * (long) (this.anInt4404 - local32);
			this.anInt4404 = local32;
			this.aClass4_Sub20_3.anInt5526 += local12;
			return 2;
		} else {
			this.aClass4_Sub20_3.anInt5526 += local12;
			return 3;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)J")
	public long method3781(@OriginalArg(0) int arg0) {
		return this.aLong137 + (long) arg0 * (long) this.anInt4404;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(I)V")
	public void method3782(@OriginalArg(0) int arg0) {
		this.aClass4_Sub20_3.anInt5526 = this.anIntArray346[arg0];
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(I)V")
	public void method3783(@OriginalArg(0) int arg0) {
		this.anIntArray346[arg0] = this.aClass4_Sub20_3.anInt5526;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "()V")
	public void method3784() {
		this.aClass4_Sub20_3.anInt5526 = -1;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "()I")
	public int method3785() {
		return this.anIntArray346.length;
	}
}
