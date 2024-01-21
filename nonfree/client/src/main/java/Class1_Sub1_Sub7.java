import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!hf", name = "lb", descriptor = "I")
	public int anInt1049 = 0;

	@OriginalMember(owner = "client!hf", name = "ub", descriptor = "I")
	public int anInt1057 = -1;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "Z")
	public boolean aBoolean65 = true;

	@OriginalMember(owner = "client!hf", name = "tb", descriptor = "I")
	public int anInt1056 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!id;I)V")
	public void method800(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1837();
			if (local9 == 0) {
				return;
			}
			this.method801(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!id;II)V")
	private void method801(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1049 = arg0.method1868();
		} else if (arg1 == 2) {
			this.anInt1056 = arg0.method1837();
		} else if (arg1 == 5) {
			this.aBoolean65 = false;
		} else if (arg1 == 7) {
			this.anInt1057 = arg0.method1868();
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
	public void method802() {
		if (this.anInt1057 != -1) {
			this.method805(this.anInt1057);
			this.anInt1042 = this.anInt1044;
			this.anInt1052 = this.anInt1039;
			this.anInt1040 = this.anInt1043;
		}
		this.method805(this.anInt1049);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	private void method805(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local14;
		@Pc(37) double local37 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local37 < local14) {
			local23 = local37;
		}
		if (local23 > local21) {
			local23 = local21;
		}
		@Pc(51) double local51 = local14;
		@Pc(53) double local53 = 0.0D;
		@Pc(55) double local55 = 0.0D;
		if (local14 < local37) {
			local51 = local37;
		}
		if (local51 < local21) {
			local51 = local21;
		}
		@Pc(73) double local73 = (local23 + local51) / 2.0D;
		if (local51 != local23) {
			if (local14 == local51) {
				local55 = (local37 - local21) / (-local23 + local51);
			} else if (local37 == local51) {
				local55 = (local21 - local14) / (-local23 + local51) + 2.0D;
			} else if (local51 == local21) {
				local55 = (local14 - local37) / (local51 - local23) + 4.0D;
			}
			if (local73 < 0.5D) {
				local53 = (local51 - local23) / (local51 + local23);
			}
			if (local73 >= 0.5D) {
				local53 = (local51 - local23) / (2.0D - local51 - local23);
			}
		}
		this.anInt1039 = (int) (local73 * 256.0D);
		if (this.anInt1039 < 0) {
			this.anInt1039 = 0;
		} else if (this.anInt1039 > 255) {
			this.anInt1039 = 255;
		}
		local55 /= 6.0D;
		this.anInt1044 = (int) (local53 * 256.0D);
		this.anInt1043 = (int) (local55 * 256.0D);
		if (this.anInt1044 < 0) {
			this.anInt1044 = 0;
		} else if (this.anInt1044 > 255) {
			this.anInt1044 = 255;
		}
	}
}
