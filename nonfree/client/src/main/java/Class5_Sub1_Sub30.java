import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class5_Sub1_Sub30 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
	private int anInt8813;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8813 = 4096;
		this.anInt8813 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			Static682.method794(local15, 0, Static648.anInt9588, this.anInt8813);
		}
		return local15;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt8813 = (arg1.method8529() << 12) / 255;
		}
	}
}
