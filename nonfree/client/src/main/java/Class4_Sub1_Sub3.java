import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lda", name = "A", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(IIIIII)V")
	protected Class4_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aByte139 = (byte) arg3;
		super.aByte138 = (byte) arg4;
		this.aShort48 = (short) arg5;
		super.anInt9805 = arg0;
		super.anInt9797 = arg1;
		super.anInt9803 = arg2;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([Lclient!ih;Z)I")
	@Override
	public final int method8349(@OriginalArg(0) Class5_Sub12[] arg0) {
		return this.method8346(arg0, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)Z")
	@Override
	public final boolean method8352(@OriginalArg(0) int arg0) {
		if (arg0 > -19) {
			Static326.aClass238_7 = null;
		}
		return Static407.aBooleanArrayArray8[(super.anInt9805 >> Static314.anInt5377) + Static553.anInt8738 - Static220.anInt3838][(super.anInt9803 >> Static314.anInt5377) - (Static377.anInt6335 - Static553.anInt8738)];
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8343(@OriginalArg(1) Class100 arg0) {
		return Static339.method5086(super.anInt9805 >> Static314.anInt5377, super.aByte138, super.anInt9803 >> Static314.anInt5377);
	}
}
