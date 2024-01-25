import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class2_Sub2_Sub22 extends Class2_Sub2 {

	@OriginalMember(owner = "client!no", name = "H", descriptor = "I")
	private int anInt4958;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub22(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4958 = 4096;
		this.anInt4958 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub22() {
		this(4096);
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			Static457.method686(local15, 0, Static429.anInt6518, this.anInt4958);
		}
		return local15;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4958 = (arg0.method5495() << 12) / 255;
		}
	}
}
