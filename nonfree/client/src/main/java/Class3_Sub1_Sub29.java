import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ns", name = "J", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub29(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4262 = 4096;
		this.anInt4262 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub29() {
		this(4096);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			Static400.method1875(local14, 0, Static238.anInt4221, this.anInt4262);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4262 = (arg0.method2739() << 12) / 255;
		}
	}
}
