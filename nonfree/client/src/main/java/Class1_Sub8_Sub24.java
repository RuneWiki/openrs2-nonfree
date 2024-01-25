import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub8_Sub24 extends Class1_Sub8 {

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
	private int anInt5816;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub24() {
		this(4096);
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub24(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5816 = 4096;
		this.anInt5816 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5816 = (arg1.method1171() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			Static469.method6015(local17, 0, Static18.anInt439, this.anInt5816);
		}
		return local17;
	}
}
