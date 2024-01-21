import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub4_Sub18 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
	public int anInt3904;

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
	public int anInt3915;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
	private int anInt3905 = -1;

	@OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
	private int anInt3913 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
	private void method2742(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		@Pc(34) double local34 = local10;
		if (local23 < local10) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = 0.0D;
		if (local23 > local10) {
			local34 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(68) double local68 = (local32 + local34) / 2.0D;
		this.anInt3915 = (int) (local68 * 256.0D);
		if (local34 != local32) {
			if (local68 < 0.5D) {
				local50 = (local34 - local32) / (local32 + local34);
			}
			if (local34 == local10) {
				local48 = (local23 - local30) / (local34 - local32);
			} else if (local23 == local34) {
				local48 = (local30 - local10) / (local34 - local32) + 2.0D;
			} else if (local34 == local30) {
				local48 = (local10 - local23) / (-local32 + local34) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local50 = (local34 - local32) / (2.0D - local32 - local34);
			}
		}
		if (local68 > 0.5D) {
			this.anInt3904 = (int) (local50 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt3904 = (int) (local50 * 512.0D * local68);
		}
		if (this.anInt3915 < 0) {
			this.anInt3915 = 0;
		} else if (this.anInt3915 > 255) {
			this.anInt3915 = 255;
		}
		if (this.anInt3904 < 1) {
			this.anInt3904 = 1;
		}
		this.anInt3909 = (int) (local50 * 256.0D);
		if (this.anInt3909 < 0) {
			this.anInt3909 = 0;
		} else if (this.anInt3909 > 255) {
			this.anInt3909 = 255;
		}
		local48 /= 6.0D;
		this.anInt3908 = (int) (local48 * (double) this.anInt3904);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ab;II)V")
	public void method2743(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1698();
			if (local14 == 0) {
				return;
			}
			this.method2747(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!ab;BI)V")
	private void method2747(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt3913 = arg1.method1654();
			this.method2742(this.anInt3913);
		} else if (arg0 == 2) {
			this.anInt3905 = arg1.method1680();
			if (this.anInt3905 == 65535) {
				this.anInt3905 = -1;
				return;
			}
		} else if (arg0 == 3) {
			arg1.method1680();
		} else {
			return;
		}
	}
}
