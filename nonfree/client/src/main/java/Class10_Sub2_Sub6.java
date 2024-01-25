import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class10_Sub2_Sub6 extends Class10_Sub2 {

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
	private int anInt1609;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
	public Class10_Sub2_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1609 = 4096;
		this.anInt1609 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			Static468.method4353(local9, 0, Static121.anInt2458, this.anInt1609);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1609 = (arg1.method2502() << 12) / 255;
		}
	}
}
