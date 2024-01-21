import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "I")
	private int anInt208 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ne;BI)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub10 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt208 = arg1.method572();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	private void method138(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local10;
		@Pc(33) double local33 = (double) (arg0 & 0xFF) / 256.0D;
		if (local19 < local10) {
			local26 = local19;
		}
		@Pc(45) double local45 = local10;
		if (local33 < local26) {
			local26 = local33;
		}
		@Pc(53) double local53 = 0.0D;
		@Pc(55) double local55 = 0.0D;
		if (local19 > local10) {
			local45 = local19;
		}
		if (local45 < local33) {
			local45 = local33;
		}
		@Pc(73) double local73 = (local45 + local26) / 2.0D;
		if (local26 != local45) {
			if (local10 == local45) {
				local55 = (local19 - local33) / (local45 - local26);
			} else if (local45 == local19) {
				local55 = (local33 - local10) / (-local26 + local45) + 2.0D;
			} else if (local33 == local45) {
				local55 = (local10 - local19) / (-local26 + local45) + 4.0D;
			}
			if (local73 < 0.5D) {
				local53 = (local45 - local26) / (local45 + local26);
			}
			if (local73 >= 0.5D) {
				local53 = (local45 - local26) / (2.0D - local45 - local26);
			}
		}
		local55 /= 6.0D;
		if (local73 > 0.5D) {
			this.anInt211 = (int) ((1.0D - local73) * local53 * 512.0D);
		} else {
			this.anInt211 = (int) (local73 * local53 * 512.0D);
		}
		if (this.anInt211 < 1) {
			this.anInt211 = 1;
		}
		this.anInt199 = (int) (local53 * 256.0D);
		if (this.anInt199 < 0) {
			this.anInt199 = 0;
		} else if (this.anInt199 > 255) {
			this.anInt199 = 255;
		}
		this.anInt209 = (int) ((double) this.anInt211 * local55);
		this.anInt210 = (int) (local73 * 256.0D);
		if (this.anInt210 < 0) {
			this.anInt210 = 0;
		} else if (this.anInt210 > 255) {
			this.anInt210 = 255;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!ne;)V")
	public void method139(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method599();
			if (local5 == 0) {
				return;
			}
			this.method134(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public void method140() {
		this.method138(this.anInt208);
	}
}
