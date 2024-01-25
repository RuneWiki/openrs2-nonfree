import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class14_Sub3_Sub9 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	private int anInt1599 = 4096;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
	private int anInt1602 = 409;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	private int anInt1603 = 4096;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
	private int anInt1604 = 4096;

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "[I")
	private final int[] anIntArray116 = new int[3];

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1602 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt1603 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt1604 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt1599 = arg0.method2498();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method2501();
			this.anIntArray116[1] = local63 >> 4 & 0xFF0;
			this.anIntArray116[0] = (local63 & 0xFF0000) << 4;
			this.anIntArray116[2] = local63 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(23) int[][] local23 = this.method5997(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static294.anInt5657; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(63) int local63 = local55 - this.anIntArray116[0];
				if (local63 < 0) {
					local63 = -local63;
				}
				if (local63 > this.anInt1602) {
					local39[local49] = local55;
					local43[local49] = local31[local49];
					local47[local49] = local35[local49];
				} else {
					@Pc(101) int local101 = local31[local49];
					local63 = local101 - this.anIntArray116[1];
					if (local63 < 0) {
						local63 = -local63;
					}
					if (local63 > this.anInt1602) {
						local39[local49] = local55;
						local43[local49] = local101;
						local47[local49] = local35[local49];
					} else {
						@Pc(141) int local141 = local35[local49];
						local63 = local141 - this.anIntArray116[2];
						if (local63 < 0) {
							local63 = -local63;
						}
						if (this.anInt1602 < local63) {
							local39[local49] = local55;
							local43[local49] = local101;
							local47[local49] = local141;
						} else {
							local39[local49] = local55 * this.anInt1599 >> 12;
							local43[local49] = local101 * this.anInt1604 >> 12;
							local47[local49] = this.anInt1603 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
