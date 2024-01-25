import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub6_Sub16 extends Class2_Sub6 {

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			Static653.method5393(local11, 0, Static51.anInt1085, Static564.anIntArray630[arg0]);
		}
		return local11;
	}
}
