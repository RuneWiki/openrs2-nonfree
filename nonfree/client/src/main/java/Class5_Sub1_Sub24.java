import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class5_Sub1_Sub24 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	private int anInt7787 = 0;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
	private int anInt7792 = 1;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
	private int anInt7794 = 0;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt7794 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt7787 = arg1.method8529();
		} else if (arg0 == 3) {
			this.anInt7792 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(29) int local29 = Static23.anIntArray27[arg0];
			@Pc(35) int local35 = local29 - 2048 >> 1;
			for (@Pc(37) int local37 = 0; local37 < Static648.anInt9588; local37++) {
				@Pc(43) int local43 = Static293.anIntArray288[local37];
				@Pc(49) int local49 = local43 - 2048 >> 1;
				@Pc(63) int local63;
				if (this.anInt7794 == 0) {
					local63 = (local43 - local29) * this.anInt7792;
				} else {
					@Pc(75) int local75 = local35 * local35 + local49 * local49 >> 12;
					local63 = (int) (Math.sqrt((double) ((float) local75 / 4096.0F)) * 4096.0D);
					local63 = (int) ((double) (local63 * this.anInt7792) * 3.141592653589793D);
				}
				local63 -= local63 & 0xFFFFF000;
				if (this.anInt7787 == 0) {
					local63 = Static19.anIntArray23[local63 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7787 == 2) {
					local63 -= 2048;
					if (local63 < 0) {
						local63 = -local63;
					}
					local63 = 2048 - local63 << 1;
				}
				local21[local37] = local63;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		Static19.method298();
	}
}
