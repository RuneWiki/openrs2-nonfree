import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class368 {

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	public int anInt9865;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public int anInt9868;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
	public int anInt9870;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
	public int anInt9871;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public int anInt9863 = 512;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Z")
	public boolean aBoolean726 = true;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
	public boolean aBoolean727 = true;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	private int anInt9869 = 0;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public int anInt9872 = -1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!vj;II)V")
	private void method8228(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9869 = arg0.method8539();
			this.method8229(this.anInt9869);
		} else if (arg1 == 2) {
			this.anInt9872 = arg0.method8546();
			if (this.anInt9872 == 65535) {
				this.anInt9872 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt9863 = arg0.method8546() << 2;
		} else if (arg1 == 4) {
			this.aBoolean727 = false;
		} else if (arg1 == 5) {
			this.aBoolean726 = false;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)V")
	private void method8229(@OriginalArg(1) int arg0) {
		@Pc(18) double local18 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local18;
		if (local18 > local27) {
			local36 = local27;
		}
		if (local36 > local34) {
			local36 = local34;
		}
		@Pc(50) double local50 = local18;
		if (local27 > local18) {
			local50 = local27;
		}
		if (local34 > local50) {
			local50 = local34;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local50 + local36) / 2.0D;
		if (local50 != local36) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local36 + local50);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local50 - local36);
			}
			if (local50 == local18) {
				local64 = (local27 - local34) / (local50 - local36);
			} else if (local50 == local27) {
				local64 = (local34 - local18) / (-local36 + local50) + 2.0D;
			} else if (local34 == local50) {
				local64 = (local18 - local27) / (local50 - local36) + 4.0D;
			}
		}
		this.anInt9865 = (int) (local72 * 256.0D);
		local64 /= 6.0D;
		this.anInt9871 = (int) (local66 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt9870 = (int) ((1.0D - local72) * 512.0D * local66);
		} else {
			this.anInt9870 = (int) (local72 * 512.0D * local66);
		}
		if (this.anInt9871 < 0) {
			this.anInt9871 = 0;
		} else if (this.anInt9871 > 255) {
			this.anInt9871 = 255;
		}
		if (this.anInt9865 < 0) {
			this.anInt9865 = 0;
		} else if (this.anInt9865 > 255) {
			this.anInt9865 = 255;
		}
		if (this.anInt9870 < 1) {
			this.anInt9870 = 1;
		}
		this.anInt9868 = (int) ((double) this.anInt9870 * local64);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!vj;)V")
	public void method8230(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8547();
			if (local13 == 0) {
				return;
			}
			this.method8228(arg0, local13);
		}
	}
}
