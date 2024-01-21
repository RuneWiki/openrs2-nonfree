import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!db", name = "S", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
	private int anInt631 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!hb;III)V")
	private void method379(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt631 = arg0.method1409();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	private void method380(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> -3041336 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local23;
		if (local14 < local23) {
			local25 = local14;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		if (local38 < local25) {
			local25 = local38;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = local23;
		if (local23 < local14) {
			local50 = local14;
		}
		if (local50 < local38) {
			local50 = local38;
		}
		@Pc(68) double local68 = (local25 + local50) / 2.0D;
		this.anInt635 = (int) (local68 * 256.0D);
		if (local25 != local50) {
			if (local23 == local50) {
				local46 = (local14 - local38) / (local50 - local25);
			} else if (local50 == local14) {
				local46 = (local38 - local23) / (local50 - local25) + 2.0D;
			} else if (local38 == local50) {
				local46 = (local23 - local14) / (local50 - local25) + 4.0D;
			}
			if (local68 < 0.5D) {
				local48 = (local50 - local25) / (local25 + local50);
			}
			if (local68 >= 0.5D) {
				local48 = (local50 - local25) / (2.0D - local50 - local25);
			}
		}
		this.anInt633 = (int) (local48 * 256.0D);
		if (this.anInt635 < 0) {
			this.anInt635 = 0;
		} else if (this.anInt635 > 255) {
			this.anInt635 = 255;
		}
		if (this.anInt633 < 0) {
			this.anInt633 = 0;
		} else if (this.anInt633 > 255) {
			this.anInt633 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt623 = (int) ((1.0D - local68) * 512.0D * local48);
		} else {
			this.anInt623 = (int) (local68 * 512.0D * local48);
		}
		if (this.anInt623 < 1) {
			this.anInt623 = 1;
		}
		local46 /= 6.0D;
		this.anInt621 = (int) ((double) this.anInt623 * local46);
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public void method381() {
		this.method380(this.anInt631);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BILclient!hb;)V")
	public void method383(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1408();
			if (local14 == 0) {
				return;
			}
			this.method379(arg1, local14, arg0);
		}
	}
}
