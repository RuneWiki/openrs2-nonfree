import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class6_Sub4_Sub25 extends Class6_Sub4 {

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	private int anInt6684;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub25(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6684 = 4096;
		this.anInt6684 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub25() {
		this(4096);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt6684 = (arg1.method6069() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			Static601.method2939(local9, 0, Static408.anInt7209, this.anInt6684);
		}
		return local9;
	}
}
