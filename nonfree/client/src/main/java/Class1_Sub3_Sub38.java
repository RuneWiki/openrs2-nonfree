import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	private int anInt6487;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub38(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6487 = 4096;
		this.anInt6487 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		this(4096);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			Static361.method1333(local17, 0, Static153.anInt3378, this.anInt6487);
		}
		return local17;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6487 = (arg1.method4532() << 12) / 255;
		}
	}
}
