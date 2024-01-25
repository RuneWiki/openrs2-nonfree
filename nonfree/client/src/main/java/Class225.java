import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class225 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public int anInt6166;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public int anInt6169;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	private int anInt6164 = 0;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public int anInt6168 = -1;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public int anInt6170 = 128;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Z")
	public boolean aBoolean535 = true;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	private void method4815(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local21 < local12) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (-local30 + local44);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local30 - local44);
			}
		}
		local58 /= 6.0D;
		this.anInt6169 = (int) (local66 * 256.0D);
		this.anInt6174 = (int) (local60 * 256.0D);
		if (this.anInt6174 < 0) {
			this.anInt6174 = 0;
		} else if (this.anInt6174 > 255) {
			this.anInt6174 = 255;
		}
		if (this.anInt6169 < 0) {
			this.anInt6169 = 0;
		} else if (this.anInt6169 > 255) {
			this.anInt6169 = 255;
		}
		if (local66 > 0.5D) {
			this.anInt6166 = (int) ((1.0D - local66) * 512.0D * local60);
		} else {
			this.anInt6166 = (int) (local60 * 512.0D * local66);
		}
		if (this.anInt6166 < 1) {
			this.anInt6166 = 1;
		}
		this.anInt6173 = (int) ((double) this.anInt6166 * local58);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method4816(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2582();
			if (local11 == 0) {
				return;
			}
			this.method4818(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!cu;)V")
	private void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt6164 = arg1.method2604();
			this.method4815(this.anInt6164);
		} else if (arg0 == 2) {
			this.anInt6168 = arg1.method2588();
			if (this.anInt6168 == 65535) {
				this.anInt6168 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6170 = arg1.method2588() << 0;
		} else if (arg0 == 4) {
			this.aBoolean535 = false;
		}
	}
}
