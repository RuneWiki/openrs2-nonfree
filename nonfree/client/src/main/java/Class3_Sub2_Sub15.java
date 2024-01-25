import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class3_Sub2_Sub15 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	private int anInt5924;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub15(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5924 = 4096;
		this.anInt5924 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub15() {
		this(4096);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5924 = (arg0.method4888() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			Static689.method8056(local9, 0, Static30.anInt908, this.anInt5924);
		}
		return local9;
	}
}
