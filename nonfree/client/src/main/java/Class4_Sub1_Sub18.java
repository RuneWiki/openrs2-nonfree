import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
	private int anInt3394 = 0;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
	private int anInt3396 = 4096;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3394 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt3396 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(27) int[] local27 = this.method4736(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static73.anInt1626; local29++) {
				@Pc(40) int local40 = local27[local29];
				local17[local29] = local40 >= this.anInt3394 && this.anInt3396 >= local40 ? 4096 : 0;
			}
		}
		return local17;
	}
}
