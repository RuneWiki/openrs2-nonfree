import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1151 = 4096;
		this.anInt1151 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			Static193.method2479(local14, 0, Static65.anInt1933, this.anInt1151);
		}
		return local14;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1151 = (arg1.method1607() << 12) / 255;
		}
	}
}
