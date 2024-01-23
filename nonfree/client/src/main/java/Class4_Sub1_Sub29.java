import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class4_Sub1_Sub29 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
	private int anInt4570;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub29(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4570 = 4096;
		this.anInt4570 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub29() {
		this(4096);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4570 = (arg1.method3110() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			Static317.method3204(local16, 0, Static68.anInt1753, this.anInt4570);
		}
		return local16;
	}
}
