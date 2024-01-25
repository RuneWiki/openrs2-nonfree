import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
	private int anInt6415;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class2_Sub1_Sub35(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6415 = 4096;
		this.anInt6415 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		this(4096);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			Static394.method2439(local9, 0, Static391.anInt7118, this.anInt6415);
		}
		return local9;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6415 = (arg1.method5732() << 12) / 255;
		}
	}
}
