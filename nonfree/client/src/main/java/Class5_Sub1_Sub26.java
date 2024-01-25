import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class5_Sub1_Sub26 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
	private int anInt7937 = 0;

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "I")
	private int anInt7936 = 4096;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(28) int[] local28 = this.method9210(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static648.anInt9588; local30++) {
				@Pc(36) int local36 = local28[local30];
				local11[local30] = this.anInt7937 <= local36 && local36 <= this.anInt7936 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt7937 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt7936 = arg1.method8519();
		}
	}
}
