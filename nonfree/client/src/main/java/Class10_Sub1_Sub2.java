import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
	public int anInt202;

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
	public int anInt206;

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
	public int anInt207 = 0;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
	public int anInt199 = -1;

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	public int anInt214 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILclient!tc;)V")
	private void method165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt207 = arg2.method1138();
		} else if (arg1 == 2) {
			this.anInt214 = arg2.method1111();
		} else if (arg1 == 5) {
			this.aBoolean4 = false;
		} else if (arg1 == 7) {
			this.anInt199 = arg2.method1138();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	public void method168() {
		if (this.anInt199 != -1) {
			this.method172(this.anInt199);
			this.anInt202 = this.anInt217;
			this.anInt205 = this.anInt206;
			this.anInt215 = this.anInt211;
		}
		this.method172(this.anInt207);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!tc;I)V")
	public void method170(@OriginalArg(1) Class10_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1111();
			if (local13 == 0) {
				return;
			}
			this.method165(arg1, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V")
	private void method172(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local23;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 > local14) {
			local25 = local14;
		}
		@Pc(40) double local40 = 0.0D;
		@Pc(42) double local42 = local23;
		@Pc(44) double local44 = 0.0D;
		if (local25 > local32) {
			local25 = local32;
		}
		if (local14 > local23) {
			local42 = local14;
		}
		if (local42 < local32) {
			local42 = local32;
		}
		@Pc(77) double local77 = (local25 + local42) / 2.0D;
		if (local25 != local42) {
			if (local23 == local42) {
				local44 = (local14 - local32) / (local42 - local25);
			} else if (local14 == local42) {
				local44 = (local32 - local23) / (local42 - local25) + 2.0D;
			} else if (local32 == local42) {
				local44 = (local23 - local14) / (local42 - local25) + 4.0D;
			}
			if (local77 < 0.5D) {
				local40 = (local42 - local25) / (local42 + local25);
			}
			if (local77 >= 0.5D) {
				local40 = (local42 - local25) / ((2.0D - local42) - local25);
			}
		}
		local44 /= 6.0D;
		this.anInt206 = (int) (local44 * 256.0D);
		this.anInt217 = (int) (local77 * 256.0D);
		this.anInt211 = (int) (local40 * 256.0D);
		if (this.anInt217 < 0) {
			this.anInt217 = 0;
		} else if (this.anInt217 > 255) {
			this.anInt217 = 255;
		}
		if (this.anInt211 < 0) {
			this.anInt211 = 0;
		} else if (this.anInt211 > 255) {
			this.anInt211 = 255;
		}
	}
}
