import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	private int anInt595;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		this(4096);
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub4(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt595 = 4096;
		this.anInt595 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			Static184.method1308(local10, 0, Static141.anInt3261, this.anInt595);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt595 = (arg1.method191() << 12) / 255;
		}
	}
}
