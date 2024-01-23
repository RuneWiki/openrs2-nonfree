import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	private int anInt4676 = 0;

	@OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
	private int anInt4680 = 4096;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(30) int[] local30 = this.method4450(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static131.anInt2513; local32++) {
				@Pc(43) int local43 = local30[local32];
				local16[local32] = local43 >= this.anInt4676 && local43 <= this.anInt4680 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4676 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt4680 = arg0.method3107();
		}
	}
}
