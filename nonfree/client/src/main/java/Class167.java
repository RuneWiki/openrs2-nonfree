import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class167 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public int anInt5186;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public int anInt5187;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	public int anInt5190;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt5194;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public int anInt5188 = -1;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	private int anInt5193 = 0;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "Z")
	public boolean aBoolean338 = true;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public int anInt5195 = 128;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!kh;)V")
	public void method4455(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5185();
			if (local5 == 0) {
				return;
			}
			this.method4457(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V")
	private void method4456(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local32) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local51 + local32);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local32 - local51);
			}
			if (local51 == local14) {
				local65 = (local23 - local30) / (-local32 + local51);
			} else if (local51 == local23) {
				local65 = (local30 - local14) / (-local32 + local51) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (local51 - local32) + 4.0D;
			}
		}
		this.anInt5187 = (int) (local67 * 256.0D);
		this.anInt5190 = (int) (local73 * 256.0D);
		local65 /= 6.0D;
		if (this.anInt5187 < 0) {
			this.anInt5187 = 0;
		} else if (this.anInt5187 > 255) {
			this.anInt5187 = 255;
		}
		if (this.anInt5190 < 0) {
			this.anInt5190 = 0;
		} else if (this.anInt5190 > 255) {
			this.anInt5190 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt5194 = (int) (local67 * 512.0D * (1.0D - local73));
		} else {
			this.anInt5194 = (int) (local73 * local67 * 512.0D);
		}
		if (this.anInt5194 < 1) {
			this.anInt5194 = 1;
		}
		this.anInt5186 = (int) (local65 * (double) this.anInt5194);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!kh;II)V")
	private void method4457(@OriginalArg(1) Class11_Sub25 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5193 = arg0.method5221();
			this.method4456(this.anInt5193);
		} else if (arg1 == 2) {
			this.anInt5188 = arg0.method5187();
			if (this.anInt5188 == 65535) {
				this.anInt5188 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5195 = arg0.method5187();
		} else if (arg1 == 4) {
			this.aBoolean338 = false;
		}
	}
}
