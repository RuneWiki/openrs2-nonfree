import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class4_Sub6_Sub5 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
	private Class4_Sub6_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt711 = 4096;
		this.anInt711 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt711 = (arg0.method1874() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			Static307.method3249(local15, 0, Static2.anInt19, this.anInt711);
		}
		return local15;
	}
}
