import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class1_Sub4_Sub34 extends Class1_Sub4 {

	@OriginalMember(owner = "client!si", name = "H", descriptor = "I")
	private int anInt6199;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub34() {
		this(4096);
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class1_Sub4_Sub34(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6199 = 4096;
		this.anInt6199 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6199 = (arg0.method5337() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			Static468.method5037(local9, 0, Static395.anInt6592, this.anInt6199);
		}
		return local9;
	}
}
