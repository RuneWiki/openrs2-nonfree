import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class4_Sub3_Sub37 extends Class4_Sub3 {

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
	private int anInt7685;

	static {
		new Class21(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3_Sub37(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7685 = 4096;
		this.anInt7685 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub37() {
		this(4096);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt7685 = (arg1.method4614() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			Static474.method3330(local9, 0, Static304.anInt5637, this.anInt7685);
		}
		return local9;
	}
}
