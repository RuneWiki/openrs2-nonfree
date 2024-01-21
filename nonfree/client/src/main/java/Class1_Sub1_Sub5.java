import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	public int anInt745;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	private int anInt749 = -1;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
	private int anInt751 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	private void method433(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local30 < local14) {
			local32 = local14;
		}
		@Pc(45) double local45 = 0.0D;
		if (local21 > local32) {
			local32 = local21;
		}
		@Pc(53) double local53 = local30;
		@Pc(55) double local55 = 0.0D;
		if (local30 > local14) {
			local53 = local14;
		}
		if (local53 > local21) {
			local53 = local21;
		}
		@Pc(73) double local73 = (local32 + local53) / 2.0D;
		this.anInt742 = (int) (local73 * 256.0D);
		if (local53 != local32) {
			if (local73 < 0.5D) {
				local55 = (local32 - local53) / (local32 + local53);
			}
			if (local32 == local30) {
				local45 = (local14 - local21) / (local32 - local53);
			} else if (local14 == local32) {
				local45 = (local21 - local30) / (local32 - local53) + 2.0D;
			} else if (local21 == local32) {
				local45 = (local30 - local14) / (-local53 + local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local55 = (local32 - local53) / (2.0D - local32 - local53);
			}
		}
		this.anInt754 = (int) (local55 * 256.0D);
		if (this.anInt754 < 0) {
			this.anInt754 = 0;
		} else if (this.anInt754 > 255) {
			this.anInt754 = 255;
		}
		if (this.anInt742 < 0) {
			this.anInt742 = 0;
		} else if (this.anInt742 > 255) {
			this.anInt742 = 255;
		}
		local45 /= 6.0D;
		if (local73 > 0.5D) {
			this.anInt745 = (int) ((1.0D - local73) * local55 * 512.0D);
		} else {
			this.anInt745 = (int) (local73 * local55 * 512.0D);
		}
		if (this.anInt745 < 1) {
			this.anInt745 = 1;
		}
		this.anInt753 = (int) ((double) this.anInt745 * local45);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!jg;I)V")
	private void method434(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt751 = arg1.method888();
			this.method433(this.anInt751);
		} else if (arg0 == 2) {
			this.anInt749 = arg1.method878();
			if (this.anInt749 == 65535) {
				this.anInt749 = -1;
			}
		} else if (arg0 == 3) {
			arg1.method878();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!jg;IB)V")
	public void method439(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method861();
			if (local5 == 0) {
				return;
			}
			this.method434(local5, arg0, arg1);
		}
	}
}
