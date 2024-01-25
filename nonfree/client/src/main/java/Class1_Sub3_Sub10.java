import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!du", name = "L", descriptor = "I")
	private int anInt1993;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		this(4096);
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub10(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1993 = 4096;
		this.anInt1993 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			Static551.method3492(local9, 0, Static452.anInt7734, this.anInt1993);
		}
		return local9;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1993 = (arg0.method3922() << 12) / 255;
		}
	}
}
