import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class4_Sub4_Sub8 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub8() {
		this(4096);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4_Sub8(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1879 = 4096;
		this.anInt1879 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			Static461.method1986(local9, 0, Static419.anInt6404, this.anInt1879);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1879 = (arg1.method5007() << 12) / 255;
		}
	}
}
