import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class2_Sub7_Sub33 extends Class2_Sub7 {

	@OriginalMember(owner = "client!tca", name = "P", descriptor = "I")
	private int anInt8232;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub33(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8232 = 4096;
		this.anInt8232 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub33() {
		this(4096);
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			Static553.method3371(local9, 0, Static352.anInt6485, this.anInt8232);
		}
		return local9;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt8232 = (arg1.method5170() << 12) / 255;
		}
	}
}
