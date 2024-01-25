import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class4_Sub6_Sub21 extends Class4_Sub6 {

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class4_Sub6_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4099 = 4096;
		this.anInt4099 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4099 = (arg1.method2490() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			Static459.method3327(local9, 0, Static80.anInt1616, this.anInt4099);
		}
		return local9;
	}
}
