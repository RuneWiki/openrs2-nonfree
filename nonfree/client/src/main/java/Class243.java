import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class243 {

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
	public int anInt7177;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
	public int anInt7180;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	private int anInt7174 = 0;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "Z")
	public boolean aBoolean496 = true;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
	public int anInt7171 = 128;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	public int anInt7170 = -1;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILclient!bt;)V")
	public void method5564(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6053();
			if (local11 == 0) {
				return;
			}
			this.method5566(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!bt;)V")
	private void method5566(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.anInt7174 = arg1.method6020();
			this.method5567(this.anInt7174);
		} else if (arg0 == 2) {
			this.anInt7170 = arg1.method6004();
			if (this.anInt7170 == 65535) {
				this.anInt7170 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7171 = arg1.method6004() << 0;
		} else if (arg0 == 4) {
			this.aBoolean496 = false;
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
	private void method5567(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local74 < 0.5D) {
				local68 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt7181 = (int) (local74 * 256.0D);
		this.anInt7180 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt7180 < 0) {
			this.anInt7180 = 0;
		} else if (this.anInt7180 > 255) {
			this.anInt7180 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt7177 = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt7177 = (int) (local74 * 512.0D * local68);
		}
		if (this.anInt7181 < 0) {
			this.anInt7181 = 0;
		} else if (this.anInt7181 > 255) {
			this.anInt7181 = 255;
		}
		if (this.anInt7177 < 1) {
			this.anInt7177 = 1;
		}
		this.anInt7173 = (int) (local60 * (double) this.anInt7177);
	}
}
