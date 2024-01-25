import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
	private int anInt6705 = 0;

	@OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
	private int anInt6706 = 1;

	@OriginalMember(owner = "client!ofa", name = "J", descriptor = "I")
	private int anInt6712 = 0;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6712 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt6705 = arg1.method7974();
		} else if (arg0 == 3) {
			this.anInt6706 = arg1.method7974();
		}
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		Static263.method3803();
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(27) int local27 = Static583.anIntArray614[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static501.anInt8748; local35++) {
				@Pc(41) int local41 = Static95.anIntArray77[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt6712 == 0) {
					local73 = this.anInt6706 * (local41 - local27);
				} else {
					@Pc(63) int local63 = local47 * local47 + local33 * local33 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (local73 * this.anInt6706) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt6705 == 0) {
					local73 = Static482.anIntArray516[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6705 == 2) {
					local73 -= 2048;
					if (local73 < 0) {
						local73 = -local73;
					}
					local73 = 2048 - local73 << 1;
				}
				local19[local35] = local73;
			}
		}
		return local19;
	}
}
