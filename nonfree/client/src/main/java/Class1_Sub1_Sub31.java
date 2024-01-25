import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
	private int anInt5567 = 0;

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private int anInt5566 = 4096;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5567 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt5566 = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(21) int[] local21 = this.method5620(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static434.anInt4326; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt5567 && local29 <= this.anInt5566 ? 4096 : 0;
			}
		}
		return local11;
	}
}
