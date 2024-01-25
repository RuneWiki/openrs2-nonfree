import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class2_Sub4_Sub25 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
	private int anInt5797;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub25() {
		this(4096);
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub25(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5797 = 4096;
		this.anInt5797 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			Static650.method2272(local14, 0, Static395.anInt6816, this.anInt5797);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5797 = (arg0.method2859() << 12) / 255;
		}
	}
}
