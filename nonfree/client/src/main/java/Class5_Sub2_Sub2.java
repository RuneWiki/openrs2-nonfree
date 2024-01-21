import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
	public int anInt203;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
	public int anInt204;

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
	public int anInt198 = 0;

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
	public int anInt208 = -1;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
	public int anInt202 = -1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!hb;BII)V")
	private void method137(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt198 = arg0.method1409();
		} else if (arg1 == 2) {
			this.anInt202 = arg0.method1408();
		} else if (arg1 == 5) {
			this.aBoolean7 = false;
		} else if (arg1 == 7) {
			this.anInt208 = arg0.method1409();
		}
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	public void method139() {
		if (this.anInt208 != -1) {
			this.method140(this.anInt208);
			this.anInt190 = this.anInt209;
			this.anInt204 = this.anInt203;
			this.anInt205 = this.anInt197;
		}
		this.method140(this.anInt198);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	private void method140(@OriginalArg(1) int arg0) {
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
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = 0.0D;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(72) double local72 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local14 == local46) {
				local50 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local50 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local50 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local72 < 0.5D) {
				local48 = (local46 - local32) / (local32 + local46);
			}
			if (local72 >= 0.5D) {
				local48 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local50 /= 6.0D;
		this.anInt203 = (int) (local48 * 256.0D);
		if (this.anInt203 < 0) {
			this.anInt203 = 0;
		} else if (this.anInt203 > 255) {
			this.anInt203 = 255;
		}
		this.anInt197 = (int) (local50 * 256.0D);
		this.anInt209 = (int) (local72 * 256.0D);
		if (this.anInt209 < 0) {
			this.anInt209 = 0;
		} else if (this.anInt209 > 255) {
			this.anInt209 = 255;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!hb;)V")
	public void method142(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1408();
			if (local9 == 0) {
				return;
			}
			this.method137(arg1, local9, arg0);
		}
	}
}
