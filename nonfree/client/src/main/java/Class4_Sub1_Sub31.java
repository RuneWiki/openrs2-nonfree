import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class4_Sub1_Sub31 extends Class4_Sub1 {

	@OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
	private int anInt9001;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1_Sub31(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9001 = 4096;
		this.anInt9001 = arg0;
	}

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub31() {
		this(4096);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			Static597.method3724(local17, 0, Static376.anInt7260, this.anInt9001);
		}
		return local17;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9001 = (arg1.method4905() << 12) / 255;
		}
	}
}
