import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class4_Sub4_Sub30 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
	private int anInt7557 = 4096;

	@OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
	private int anInt7559 = 0;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(27) int[] local27 = this.method7890(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static560.anInt9394; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = local35 >= this.anInt7559 && this.anInt7557 >= local35 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7559 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt7557 = arg1.method5982();
		}
	}
}
