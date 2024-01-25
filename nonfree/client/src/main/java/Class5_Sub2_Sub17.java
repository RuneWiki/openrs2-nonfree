import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
	private int anInt2640;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub17() {
		this(4096);
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub17(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2640 = 4096;
		this.anInt2640 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			Static359.method754(local9, 0, Static15.anInt493, this.anInt2640);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2640 = (arg0.method1832() << 12) / 255;
		}
	}
}
