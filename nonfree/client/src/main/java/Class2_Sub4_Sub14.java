import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class2_Sub4_Sub14 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
	private int anInt4259 = 0;

	@OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
	private int anInt4260 = 4096;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4259 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt4260 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(28) int[] local28 = this.method7568(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static143.anInt7434; local30++) {
				@Pc(36) int local36 = local28[local30];
				local13[local30] = local36 >= this.anInt4259 && this.anInt4260 >= local36 ? 4096 : 0;
			}
		}
		return local13;
	}
}
