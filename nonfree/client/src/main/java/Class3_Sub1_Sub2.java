import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!ae", name = "wb", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!ae", name = "xb", descriptor = "I")
	public int anInt173;

	@OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
	private int anInt167 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!m;I)V")
	public void method97(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method981();
			if (local7 == 0) {
				return;
			}
			this.method102(local7, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
	private void method101(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local21;
		if (local30 < local21) {
			local32 = local30;
		}
		@Pc(40) double local40 = local21;
		@Pc(42) double local42 = 0.0D;
		if (local21 < local30) {
			local40 = local30;
		}
		if (local12 < local32) {
			local32 = local12;
		}
		if (local40 < local12) {
			local40 = local12;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local40 + local32) / 2.0D;
		this.anInt168 = (int) (local68 * 256.0D);
		if (local40 != local32) {
			if (local40 == local21) {
				local42 = (local30 - local12) / (local40 - local32);
			} else if (local40 == local30) {
				local42 = (local12 - local21) / (-local32 + local40) + 2.0D;
			} else if (local40 == local12) {
				local42 = (local21 - local30) / (local40 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local40 - local32) / (local40 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local40 - local32) / (2.0D - local32 - local40);
			}
		}
		if (local68 > 0.5D) {
			this.anInt172 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt172 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt168 < 0) {
			this.anInt168 = 0;
		} else if (this.anInt168 > 255) {
			this.anInt168 = 255;
		}
		local42 /= 6.0D;
		if (this.anInt172 < 1) {
			this.anInt172 = 1;
		}
		this.anInt173 = (int) (local42 * (double) this.anInt172);
		this.anInt161 = (int) (local62 * 256.0D);
		if (this.anInt161 < 0) {
			this.anInt161 = 0;
		} else if (this.anInt161 > 255) {
			this.anInt161 = 255;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!m;I)V")
	private void method102(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt167 = arg1.method1013();
		}
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
	public void method104() {
		this.method101(this.anInt167);
	}
}
