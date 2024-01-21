import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
	public int anInt3160;

	@OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
	public int anInt3162;

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
	public int anInt3167;

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
	private int anInt3172 = -1;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
	private int anInt3163 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!fj;II)V")
	public void method2454(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method2771();
			if (local3 == 0) {
				return;
			}
			this.method2455(arg1, local3, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!fj;)V")
	private void method2455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt3163 = arg2.method2745();
			this.method2456(this.anInt3163);
		} else if (arg1 == 2) {
			this.anInt3172 = arg2.method2765();
			if (this.anInt3172 == 65535) {
				this.anInt3172 = -1;
			}
		} else if (arg1 == 3) {
			arg2.method2765();
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)V")
	private void method2456(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local21 < local12) {
			local30 = local21;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = 0.0D;
		if (local30 > local28) {
			local30 = local28;
		}
		@Pc(56) double local56 = local12;
		if (local12 < local21) {
			local56 = local21;
		}
		if (local28 > local56) {
			local56 = local28;
		}
		@Pc(74) double local74 = (local30 + local56) / 2.0D;
		if (local56 != local30) {
			if (local74 < 0.5D) {
				local48 = (local56 - local30) / (local30 + local56);
			}
			if (local12 == local56) {
				local46 = (local21 - local28) / (local56 - local30);
			} else if (local21 == local56) {
				local46 = (local28 - local12) / (local56 - local30) + 2.0D;
			} else if (local28 == local56) {
				local46 = (local12 - local21) / (-local30 + local56) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local48 = (local56 - local30) / ((2.0D - local56) - local30);
			}
		}
		this.anInt3160 = (int) (local74 * 256.0D);
		if (this.anInt3160 < 0) {
			this.anInt3160 = 0;
		} else if (this.anInt3160 > 255) {
			this.anInt3160 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt3168 = (int) ((1.0D - local74) * 512.0D * local48);
		} else {
			this.anInt3168 = (int) (local48 * local74 * 512.0D);
		}
		local46 /= 6.0D;
		this.anInt3167 = (int) (local48 * 256.0D);
		if (this.anInt3167 < 0) {
			this.anInt3167 = 0;
		} else if (this.anInt3167 > 255) {
			this.anInt3167 = 255;
		}
		if (this.anInt3168 < 1) {
			this.anInt3168 = 1;
		}
		this.anInt3162 = (int) ((double) this.anInt3168 * local46);
	}
}
