import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class28 {

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
	public int anInt1020;

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
	public int anInt1021;

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
	public int anInt1023;

	@OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
	public int anInt1025 = -1;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
	public int anInt1022 = 512;

	@OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
	private int anInt1024 = 0;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method998(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method1000(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)V")
	private void method999(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local30 > local51) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local32) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local32 + local51);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / ((2.0D - local51) - local32);
			}
			if (local51 == local14) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local51 == local23) {
				local65 = (local30 - local14) / (-local32 + local51) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (local51 - local32) + 4.0D;
			}
		}
		this.anInt1023 = (int) (local73 * 256.0D);
		local65 /= 6.0D;
		this.anInt1021 = (int) (local67 * 256.0D);
		if (local73 > 0.5D) {
			this.anInt1020 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt1020 = (int) (local67 * local73 * 512.0D);
		}
		if (this.anInt1021 < 0) {
			this.anInt1021 = 0;
		} else if (this.anInt1021 > 255) {
			this.anInt1021 = 255;
		}
		if (this.anInt1023 < 0) {
			this.anInt1023 = 0;
		} else if (this.anInt1023 > 255) {
			this.anInt1023 = 255;
		}
		if (this.anInt1020 < 1) {
			this.anInt1020 = 1;
		}
		this.anInt1027 = (int) (local65 * (double) this.anInt1020);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt1024 = arg1.method4949();
			this.method999(this.anInt1024);
		} else if (arg0 == 2) {
			this.anInt1025 = arg1.method4999();
			if (this.anInt1025 == 65535) {
				this.anInt1025 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt1022 = arg1.method4999() << 2;
		} else if (arg0 == 4) {
			this.aBoolean83 = false;
		}
	}
}
