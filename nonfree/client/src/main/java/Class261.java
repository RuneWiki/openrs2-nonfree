import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class261 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
	public int anInt7076;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	public int anInt7079;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	public int anInt7082;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt7070 = 512;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	private int anInt7081 = 0;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Z")
	public boolean aBoolean567 = true;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public int anInt7078 = -1;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Z")
	public boolean aBoolean566 = true;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method5620(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5750();
			if (local9 == 0) {
				return;
			}
			this.method5622(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!mo;)V")
	private void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		if (arg0 == 1) {
			this.anInt7081 = arg1.method5797();
			this.method5623(this.anInt7081);
		} else if (arg0 == 2) {
			this.anInt7078 = arg1.method5771();
			if (this.anInt7078 == 65535) {
				this.anInt7078 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7070 = arg1.method5771() << 2;
		} else if (arg0 == 4) {
			this.aBoolean567 = false;
		} else if (arg0 == 5) {
			this.aBoolean566 = false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	private void method5623(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(36) double local36 = local14;
		if (local23 < local14) {
			local36 = local23;
		}
		if (local36 > local30) {
			local36 = local30;
		}
		@Pc(50) double local50 = local14;
		if (local23 > local14) {
			local50 = local23;
		}
		if (local30 > local50) {
			local50 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local36 + local50) / 2.0D;
		if (local36 != local50) {
			if (local72 < 0.5D) {
				local66 = (local50 - local36) / (local50 + local36);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local36) / (2.0D - local50 - local36);
			}
			if (local50 == local14) {
				local64 = (local23 - local30) / (local50 - local36);
			} else if (local50 == local23) {
				local64 = (local30 - local14) / (local50 - local36) + 2.0D;
			} else if (local30 == local50) {
				local64 = (local14 - local23) / (-local36 + local50) + 4.0D;
			}
		}
		this.anInt7082 = (int) (local72 * 256.0D);
		this.anInt7076 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		if (this.anInt7082 < 0) {
			this.anInt7082 = 0;
		} else if (this.anInt7082 > 255) {
			this.anInt7082 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt7068 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt7068 = (int) (local72 * 512.0D * local66);
		}
		if (this.anInt7076 < 0) {
			this.anInt7076 = 0;
		} else if (this.anInt7076 > 255) {
			this.anInt7076 = 255;
		}
		if (this.anInt7068 < 1) {
			this.anInt7068 = 1;
		}
		this.anInt7079 = (int) ((double) this.anInt7068 * local64);
	}
}
