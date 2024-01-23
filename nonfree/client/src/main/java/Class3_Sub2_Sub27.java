import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!od", name = "O", descriptor = "I")
	private int anInt3863;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		this(4096);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub27(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3863 = 4096;
		this.anInt3863 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3863 = (arg1.method3915() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			Static326.method4267(local14, 0, Static22.anInt421, this.anInt3863);
		}
		return local14;
	}
}
