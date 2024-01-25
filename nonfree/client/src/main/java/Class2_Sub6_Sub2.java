import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt639 = 4096;
		this.anInt639 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub2() {
		this(4096);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt639 = (arg1.method8547() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			Static653.method5393(local9, 0, Static51.anInt1085, this.anInt639);
		}
		return local9;
	}
}
