import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
	private int anInt6240 = 0;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
	private int anInt6243 = 4096;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6240 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt6243 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(25) int[] local25 = this.method5894(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static406.anInt6694; local27++) {
				@Pc(33) int local33 = local25[local27];
				local11[local27] = local33 >= this.anInt6240 && local33 <= this.anInt6243 ? 4096 : 0;
			}
		}
		return local11;
	}
}
