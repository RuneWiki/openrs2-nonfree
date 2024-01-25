import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt8885;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub36(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8885 = 4096;
		this.anInt8885 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		this(4096);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt8885 = (arg1.method4487() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			Static556.method7040(local14, 0, Static254.anInt4973, this.anInt8885);
		}
		return local14;
	}
}
