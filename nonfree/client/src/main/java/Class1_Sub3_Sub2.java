import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
	private int anInt257 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILclient!rd;)V")
	private void method243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub20 arg2) {
		if (arg0 == 1) {
			this.anInt257 = arg2.method2075();
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IB)V")
	private void method245(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local14 > local30) {
			local32 = local14;
		}
		if (local21 > local32) {
			local32 = local21;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = local30;
		@Pc(58) double local58 = 0.0D;
		if (local14 < local30) {
			local48 = local14;
		}
		if (local21 < local48) {
			local48 = local21;
		}
		@Pc(76) double local76 = (local48 + local32) / 2.0D;
		if (local32 != local48) {
			if (local32 == local30) {
				local46 = (local14 - local21) / (local32 - local48);
			} else if (local14 == local32) {
				local46 = (local21 - local30) / (-local48 + local32) + 2.0D;
			} else if (local21 == local32) {
				local46 = (local30 - local14) / (local32 - local48) + 4.0D;
			}
			if (local76 < 0.5D) {
				local58 = (local32 - local48) / (local48 + local32);
			}
			if (local76 >= 0.5D) {
				local58 = (local32 - local48) / (2.0D - local32 - local48);
			}
		}
		this.anInt256 = (int) (local58 * 256.0D);
		local46 /= 6.0D;
		if (this.anInt256 < 0) {
			this.anInt256 = 0;
		} else if (this.anInt256 > 255) {
			this.anInt256 = 255;
		}
		this.anInt262 = (int) (local76 * 256.0D);
		if (this.anInt262 < 0) {
			this.anInt262 = 0;
		} else if (this.anInt262 > 255) {
			this.anInt262 = 255;
		}
		if (local76 > 0.5D) {
			this.anInt250 = (int) ((1.0D - local76) * 512.0D * local58);
		} else {
			this.anInt250 = (int) (local76 * local58 * 512.0D);
		}
		if (this.anInt250 < 1) {
			this.anInt250 = 1;
		}
		this.anInt252 = (int) ((double) this.anInt250 * local46);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public void method247() {
		this.method245(this.anInt257);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!rd;IB)V")
	public void method249(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(16) int local16 = arg0.method2053();
			if (local16 == 0) {
				return;
			}
			this.method243(local16, arg1, arg0);
		}
	}
}
