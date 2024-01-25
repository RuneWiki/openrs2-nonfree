import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class2_Sub15_Sub2 extends Class2_Sub15 {

	@OriginalMember(owner = "client!dfa", name = "J", descriptor = "I")
	private int anInt1792;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub2() {
		this(4096);
	}

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1792 = 4096;
		this.anInt1792 = arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1792 = (arg1.method5203() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			Static679.method4130(local9, 0, Static329.anInt6017, this.anInt1792);
		}
		return local9;
	}
}
