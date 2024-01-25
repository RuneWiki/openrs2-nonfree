import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class6_Sub4_Sub16 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	private int anInt3682 = 1;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	private int anInt3685 = 0;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	private int anInt3686 = 0;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		Static571.method7641();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(27) int local27 = Static501.anIntArray637[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static408.anInt7209; local35++) {
				@Pc(41) int local41 = Static398.anIntArray514[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(73) int local73;
				if (this.anInt3686 == 0) {
					local73 = (local41 - local27) * this.anInt3682;
				} else {
					@Pc(63) int local63 = local33 * local33 + local47 * local47 >> 12;
					local73 = (int) (Math.sqrt((double) ((float) local63 / 4096.0F)) * 4096.0D);
					local73 = (int) ((double) (this.anInt3682 * local73) * 3.141592653589793D);
				}
				local73 -= local73 & 0xFFFFF000;
				if (this.anInt3685 == 0) {
					local73 = Static435.anIntArray543[local73 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3685 == 2) {
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

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt3686 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt3685 = arg1.method6069();
		} else if (arg0 == 3) {
			this.anInt3682 = arg1.method6069();
		}
	}
}
