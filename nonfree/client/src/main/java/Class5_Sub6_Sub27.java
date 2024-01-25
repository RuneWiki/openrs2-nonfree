import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class5_Sub6_Sub27 extends Class5_Sub6 {

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	private int anInt6777 = 4096;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
	private int anInt6779 = 0;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			@Pc(21) int[] local21 = this.method8117(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static421.anInt7443; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt6779 && local29 <= this.anInt6777 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6779 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt6777 = arg0.method3698();
		}
	}
}
