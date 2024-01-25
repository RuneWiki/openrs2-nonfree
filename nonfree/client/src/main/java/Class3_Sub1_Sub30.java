import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class3_Sub1_Sub30 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
	private int anInt7097;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7097 = 4096;
		this.anInt7097 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			Static604.method5915(local9, 0, Static206.anInt4182, this.anInt7097);
		}
		return local9;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7097 = (arg0.method3118() << 12) / 255;
		}
	}
}
