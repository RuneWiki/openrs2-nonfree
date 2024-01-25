import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class251 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public int anInt6392;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	public int anInt6393;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public int anInt6399;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public int anInt6403;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
	public int anInt6396 = 128;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
	public boolean aBoolean592 = true;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public int anInt6397 = -1;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	private int anInt6394 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!re;)V")
	private void method5564(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt6394 = arg1.method5159();
			this.method5567(this.anInt6394);
		} else if (arg0 == 2) {
			this.anInt6397 = arg1.method5177();
			if (this.anInt6397 == 65535) {
				this.anInt6397 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6396 = arg1.method5177();
		} else if (arg0 == 4) {
			this.aBoolean592 = false;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!re;B)V")
	public void method5566(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method5564(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
	private void method5567(@OriginalArg(0) int arg0) {
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
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt6392 = (int) (local73 * 256.0D);
		local60 /= 6.0D;
		this.anInt6403 = (int) (local67 * 256.0D);
		if (this.anInt6403 < 0) {
			this.anInt6403 = 0;
		} else if (this.anInt6403 > 255) {
			this.anInt6403 = 255;
		}
		if (this.anInt6392 < 0) {
			this.anInt6392 = 0;
		} else if (this.anInt6392 > 255) {
			this.anInt6392 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt6393 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt6393 = (int) (local73 * 512.0D * local67);
		}
		if (this.anInt6393 < 1) {
			this.anInt6393 = 1;
		}
		this.anInt6399 = (int) (local60 * (double) this.anInt6393);
	}
}
