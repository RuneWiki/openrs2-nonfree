import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class9 {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	public int anInt260;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	private int anInt248 = -1;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	private int anInt256 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILclient!pg;)V")
	public void method189(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2142();
			if (local9 == 0) {
				return;
			}
			this.method194(local9, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	private void method191(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 < local30) {
			local34 = local30;
		}
		if (local34 < local21) {
			local34 = local21;
		}
		if (local14 > local30) {
			local32 = local30;
		}
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local34) / 2.0D;
		if (local34 != local32) {
			if (local68 < 0.5D) {
				local62 = (local34 - local32) / (local32 + local34);
			}
			if (local14 == local34) {
				local60 = (local30 - local21) / (local34 - local32);
			} else if (local30 == local34) {
				local60 = (local21 - local14) / (local34 - local32) + 2.0D;
			} else if (local34 == local21) {
				local60 = (local14 - local30) / (-local32 + local34) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		this.anInt252 = (int) (local62 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt260 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt260 = (int) (local68 * 512.0D * local62);
		}
		this.anInt251 = (int) (local68 * 256.0D);
		if (this.anInt260 < 1) {
			this.anInt260 = 1;
		}
		if (this.anInt251 < 0) {
			this.anInt251 = 0;
		} else if (this.anInt251 > 255) {
			this.anInt251 = 255;
		}
		local60 /= 6.0D;
		if (this.anInt252 < 0) {
			this.anInt252 = 0;
		} else if (this.anInt252 > 255) {
			this.anInt252 = 255;
		}
		this.anInt255 = (int) ((double) this.anInt260 * local60);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIILclient!pg;)V")
	private void method194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub17 arg2) {
		if (arg0 == 1) {
			this.anInt256 = arg2.method2135();
			this.method191(this.anInt256);
		} else if (arg0 == 2) {
			this.anInt248 = arg2.method2178();
			if (this.anInt248 == 65535) {
				this.anInt248 = -1;
				return;
			}
			return;
		} else if (arg0 == 3) {
			arg2.method2178();
			return;
		}
	}
}
