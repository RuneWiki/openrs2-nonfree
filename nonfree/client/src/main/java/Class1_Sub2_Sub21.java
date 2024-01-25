import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4504 = 4096;
		this.anInt4504 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4504 = (arg0.method4548() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			Static459.method1547(local14, 0, Static410.anInt7198, this.anInt4504);
		}
		return local14;
	}
}
