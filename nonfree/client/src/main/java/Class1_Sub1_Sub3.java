import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!bd", name = "rb", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	public int anInt476 = 0;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
	public int anInt475 = -1;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
	public int anInt479 = -1;

	@OriginalMember(owner = "client!bd", name = "cb", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILclient!qc;)V")
	private void method261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub18 arg2) {
		if (arg1 == 1) {
			this.anInt476 = arg2.method2145();
		} else if (arg1 == 2) {
			this.anInt479 = arg2.method2169();
		} else if (arg1 == 5) {
			this.aBoolean45 = false;
		} else if (arg1 == 7) {
			this.anInt475 = arg2.method2145();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)V")
	private void method264(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local23;
		if (local14 > local23) {
			local32 = local14;
		}
		if (local32 < local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = local23;
		if (local14 < local23) {
			local50 = local14;
		}
		if (local30 < local50) {
			local50 = local30;
		}
		@Pc(68) double local68 = (local32 + local50) / 2.0D;
		this.anInt484 = (int) (local68 * 256.0D);
		if (this.anInt484 < 0) {
			this.anInt484 = 0;
		} else if (this.anInt484 > 255) {
			this.anInt484 = 255;
		}
		if (local50 != local32) {
			if (local23 == local32) {
				local46 = (local14 - local30) / (-local50 + local32);
			} else if (local32 == local14) {
				local46 = (local30 - local23) / (-local50 + local32) + 2.0D;
			} else if (local32 == local30) {
				local46 = (local23 - local14) / (-local50 + local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local48 = (local32 - local50) / (local32 + local50);
			}
			if (local68 >= 0.5D) {
				local48 = (local32 - local50) / ((2.0D - local32) - local50);
			}
		}
		local46 /= 6.0D;
		this.anInt483 = (int) (local46 * 256.0D);
		this.anInt488 = (int) (local48 * 256.0D);
		if (this.anInt488 < 0) {
			this.anInt488 = 0;
		} else if (this.anInt488 > 255) {
			this.anInt488 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!qc;B)V")
	public void method267(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2169();
			if (local9 == 0) {
				return;
			}
			this.method261(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public void method269() {
		if (this.anInt475 != -1) {
			this.method264(this.anInt475);
			this.anInt486 = this.anInt484;
			this.anInt492 = this.anInt483;
			this.anInt489 = this.anInt488;
		}
		this.method264(this.anInt476);
	}
}
