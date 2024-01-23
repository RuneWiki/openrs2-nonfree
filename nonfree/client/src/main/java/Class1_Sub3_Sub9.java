import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!d", name = "S", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub9(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt772 = 4096;
		this.anInt772 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		this(4096);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt772 = (arg1.method2142() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			Static235.method864(local13, 0, Static76.anInt1531, this.anInt772);
		}
		return local13;
	}
}
