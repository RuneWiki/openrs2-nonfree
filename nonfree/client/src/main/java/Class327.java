import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class327 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public int anInt8939;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	public int anInt8945;

	@OriginalMember(owner = "client!so", name = "m", descriptor = "I")
	public int anInt8950;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "I")
	public int anInt8954;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Z")
	public boolean aBoolean646 = true;

	@OriginalMember(owner = "client!so", name = "e", descriptor = "I")
	private int anInt8942 = 0;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	public int anInt8948 = -1;

	@OriginalMember(owner = "client!so", name = "o", descriptor = "I")
	public int anInt8951 = 512;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Z")
	public boolean aBoolean647 = true;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)V")
	private void method7537(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local12;
		if (local21 < local12) {
			local37 = local21;
		}
		if (local37 > local35) {
			local37 = local35;
		}
		@Pc(51) double local51 = local12;
		if (local21 > local12) {
			local51 = local21;
		}
		if (local51 < local35) {
			local51 = local35;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local37 + local51) / 2.0D;
		if (local37 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local37) / (local51 + local37);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local37) / (2.0D - local51 - local37);
			}
			if (local51 == local12) {
				local65 = (local21 - local35) / (-local37 + local51);
			} else if (local51 == local21) {
				local65 = (local35 - local12) / (local51 - local37) + 2.0D;
			} else if (local51 == local35) {
				local65 = (local12 - local21) / (local51 - local37) + 4.0D;
			}
		}
		this.anInt8945 = (int) (local73 * 256.0D);
		local65 /= 6.0D;
		this.anInt8954 = (int) (local67 * 256.0D);
		if (this.anInt8954 < 0) {
			this.anInt8954 = 0;
		} else if (this.anInt8954 > 255) {
			this.anInt8954 = 255;
		}
		if (this.anInt8945 < 0) {
			this.anInt8945 = 0;
		} else if (this.anInt8945 > 255) {
			this.anInt8945 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt8950 = (int) (local67 * (1.0D - local73) * 512.0D);
		} else {
			this.anInt8950 = (int) (local73 * 512.0D * local67);
		}
		if (this.anInt8950 < 1) {
			this.anInt8950 = 1;
		}
		this.anInt8939 = (int) ((double) this.anInt8950 * local65);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!rv;B)V")
	private void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8942 = arg1.method3633();
			this.method7537(this.anInt8942);
		} else if (arg0 == 2) {
			this.anInt8948 = arg1.method3698();
			if (this.anInt8948 == 65535) {
				this.anInt8948 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt8951 = arg1.method3698() << 2;
		} else if (arg0 == 4) {
			this.aBoolean646 = false;
		} else if (arg0 == 5) {
			this.aBoolean647 = false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method7541(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3642();
			if (local7 == 0) {
				return;
			}
			this.method7540(local7, arg0);
		}
	}
}
