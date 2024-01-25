import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uga", name = "J", descriptor = "I")
	private int anInt9406;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9406 = 4096;
		this.anInt9406 = arg0;
	}

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		this(4096);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			Static651.method751(local14, 0, Static201.anInt3738, this.anInt9406);
		}
		return local14;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9406 = (arg0.method5633() << 12) / 255;
		}
	}
}
