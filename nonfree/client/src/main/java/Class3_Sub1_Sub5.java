import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
	public int anInt918;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
	public int anInt922;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	public int anInt923;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
	private int anInt924 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!la;II)V")
	public void method595(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method1936();
			if (local10 == 0) {
				return;
			}
			this.method598(arg1, local10, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "i", descriptor = "(I)V")
	public void method597() {
		this.method599(this.anInt924);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZLclient!la;)V")
	private void method598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub12 arg2) {
		if (arg1 == 1) {
			this.anInt924 = arg2.method1923();
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	private void method599(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 < local23) {
			local34 = local23;
		}
		if (local14 > local23) {
			local32 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(54) double local54 = 0.0D;
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local34 + local32) / 2.0D;
		this.anInt925 = (int) (local68 * 256.0D);
		if (local32 != local34) {
			if (local14 == local34) {
				local62 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local62 = (local30 - local14) / (local34 - local32) + 2.0D;
			} else if (local30 == local34) {
				local62 = (local14 - local23) / (local34 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local54 = (local34 - local32) / (local34 + local32);
			}
			if (local68 >= 0.5D) {
				local54 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		local62 /= 6.0D;
		if (this.anInt925 < 0) {
			this.anInt925 = 0;
		} else if (this.anInt925 > 255) {
			this.anInt925 = 255;
		}
		this.anInt918 = (int) (local54 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt922 = (int) ((1.0D - local68) * 512.0D * local54);
		} else {
			this.anInt922 = (int) (local68 * 512.0D * local54);
		}
		if (this.anInt922 < 1) {
			this.anInt922 = 1;
		}
		this.anInt923 = (int) (local62 * (double) this.anInt922);
		if (this.anInt918 < 0) {
			this.anInt918 = 0;
		} else if (this.anInt918 > 255) {
			this.anInt918 = 255;
			return;
		}
	}
}
