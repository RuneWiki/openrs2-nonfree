import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class14_Sub1_Sub16 extends Class14_Sub1 {

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class14_Sub1_Sub16(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4333 = 4096;
		this.anInt4333 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub16() {
		this(4096);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			Static681.method2479(local9, 0, Static371.anInt6835, this.anInt4333);
		}
		return local9;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4333 = (arg0.method5866() << 12) / 255;
		}
	}
}
