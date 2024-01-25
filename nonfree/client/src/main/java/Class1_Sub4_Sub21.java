import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
	private int anInt4490;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub4_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4490 = 4096;
		this.anInt4490 = arg0;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4490 = (arg1.method5366() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			Static468.method4333(local11, 0, Static66.anInt1511, this.anInt4490);
		}
		return local11;
	}
}
