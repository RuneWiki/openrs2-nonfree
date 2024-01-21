import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class4_Sub3_Sub8 extends Class4_Sub3 {

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "I")
	public int anInt1176;

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "I")
	public int anInt1186;

	@OriginalMember(owner = "client!he", name = "sb", descriptor = "I")
	public int anInt1191;

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
	private int anInt1190 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!tf;)V")
	public void method659(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method773();
			if (local5 == 0) {
				return;
			}
			this.method667(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public void method660() {
		this.method663(this.anInt1190);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	private void method663(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(19) double local19 = local10;
		@Pc(37) double local37 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local10 > local37) {
			local19 = local37;
		}
		if (local19 > local17) {
			local19 = local17;
		}
		@Pc(51) double local51 = 0.0D;
		@Pc(53) double local53 = local10;
		if (local10 < local37) {
			local53 = local37;
		}
		if (local17 > local53) {
			local53 = local17;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local19 + local53) / 2.0D;
		if (local53 != local19) {
			if (local53 == local10) {
				local51 = (local37 - local17) / (-local19 + local53);
			} else if (local53 == local37) {
				local51 = (local17 - local10) / (local53 - local19) + 2.0D;
			} else if (local53 == local17) {
				local51 = (local10 - local37) / (-local19 + local53) + 4.0D;
			}
			if (local73 < 0.5D) {
				local67 = (local53 - local19) / (local19 + local53);
			}
			if (local73 >= 0.5D) {
				local67 = (local53 - local19) / ((2.0D - local53) - local19);
			}
		}
		if (local73 > 0.5D) {
			this.anInt1191 = (int) (local67 * 512.0D * (1.0D - local73));
		} else {
			this.anInt1191 = (int) (local67 * local73 * 512.0D);
		}
		this.anInt1172 = (int) (local73 * 256.0D);
		if (this.anInt1191 < 1) {
			this.anInt1191 = 1;
		}
		this.anInt1176 = (int) (local67 * 256.0D);
		if (this.anInt1172 < 0) {
			this.anInt1172 = 0;
		} else if (this.anInt1172 > 255) {
			this.anInt1172 = 255;
		}
		local51 /= 6.0D;
		if (this.anInt1176 < 0) {
			this.anInt1176 = 0;
		} else if (this.anInt1176 > 255) {
			this.anInt1176 = 255;
		}
		this.anInt1186 = (int) (local51 * (double) this.anInt1191);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBLclient!tf;)V")
	private void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub9 arg2) {
		if (arg0 == 1) {
			this.anInt1190 = arg2.method806();
		}
	}
}
