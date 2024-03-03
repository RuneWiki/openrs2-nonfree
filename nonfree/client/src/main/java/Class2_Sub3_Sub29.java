import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_196 = new Class145(48, 11);

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_202 = new Class89(18, -2);

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
	private int anInt5627;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	private int anInt5634;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
	private int anInt5636 = 0;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
	private int anInt5635 = 0;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
	private int anInt5629 = 0;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 93)
	public Class2_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)[[I", line = 6)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[][] local27 = this.method6484(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static211.anInt4031; local53++) {
				this.method5150(local39[local53], local35[local53], local31[local53]);
				this.anInt5634 += this.anInt5636;
				this.anInt5638 += this.anInt5629;
				for (this.anInt5627 += this.anInt5635; this.anInt5627 < 0; this.anInt5627 += 4096) {
				}
				if (this.anInt5638 < 0) {
					this.anInt5638 = 0;
				}
				while (this.anInt5627 > 4096) {
					this.anInt5627 -= 4096;
				}
				if (this.anInt5634 < 0) {
					this.anInt5634 = 0;
				}
				if (this.anInt5638 > 4096) {
					this.anInt5638 = 4096;
				}
				if (this.anInt5634 > 4096) {
					this.anInt5634 = 4096;
				}
				this.method5149(this.anInt5627, this.anInt5634, this.anInt5638);
				local43[local53] = this.anInt5628;
				local47[local53] = this.anInt5637;
				local51[local53] = this.anInt5640;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!bt;I)V", line = 98)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5635 = arg1.method4824();
		} else if (arg0 == 1) {
			this.anInt5629 = (arg1.method4826() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5636 = (arg1.method4826() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIZ)V", line = 143)
	private void method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(26) int local26 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (4096 - -arg2) * arg1 >> 12;
		if (local26 <= 0) {
			this.anInt5628 = this.anInt5637 = this.anInt5640 = arg1;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local26;
		@Pc(52) int local52 = (local26 - local43 << 12) / local26;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local52 * local26 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(81) int local81 = local43 + local77;
		@Pc(86) int local86 = local26 - local77;
		if (local56 == 0) {
			this.anInt5628 = local26;
			this.anInt5640 = local43;
			this.anInt5637 = local81;
			return;
		}
		if (local56 == 1) {
			this.anInt5628 = local86;
			this.anInt5637 = local26;
			this.anInt5640 = local43;
			return;
		}
		if (local56 == 2) {
			this.anInt5628 = local43;
			this.anInt5640 = local81;
			this.anInt5637 = local26;
			return;
		}
		if (local56 == 3) {
			this.anInt5637 = local86;
			this.anInt5628 = local43;
			this.anInt5640 = local26;
			return;
		}
		if (local56 == 4) {
			this.anInt5628 = local81;
			this.anInt5637 = local43;
			this.anInt5640 = local26;
			return;
		}
		if (local56 == 5) {
			this.anInt5640 = local86;
			this.anInt5637 = local43;
			this.anInt5628 = local26;
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)V", line = 264)
	private void method5150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 < arg2 ? arg2 : arg1;
		@Pc(27) int local27 = arg0 <= local16 ? local16 : arg0;
		@Pc(38) int local38 = arg1 <= arg2 ? arg1 : arg2;
		@Pc(49) int local49 = arg0 >= local38 ? local38 : arg0;
		@Pc(53) int local53 = local27 - local49;
		this.anInt5634 = (local27 + local49) / 2;
		if (local53 > 0) {
			@Pc(79) int local79 = (local27 - arg2 << 12) / local53;
			@Pc(88) int local88 = (local27 - arg1 << 12) / local53;
			@Pc(96) int local96 = (local27 - arg0 << 12) / local53;
			if (local27 == arg2) {
				this.anInt5627 = arg1 == local49 ? local96 + 20480 : -local88 + 4096;
			} else if (local27 == arg1) {
				this.anInt5627 = arg0 == local49 ? local79 + 4096 : 12288 - local96;
			} else {
				this.anInt5627 = local49 == arg2 ? local88 + 12288 : 20480 - local79;
			}
			this.anInt5627 /= 6;
		} else {
			this.anInt5627 = 0;
		}
		if (this.anInt5634 > 0 && this.anInt5634 < 4096) {
			this.anInt5638 = (local53 << 12) / (this.anInt5634 <= 2048 ? this.anInt5634 * 2 : 8192 - (this.anInt5634 * 2));
		} else {
			this.anInt5638 = 0;
		}
	}
}
