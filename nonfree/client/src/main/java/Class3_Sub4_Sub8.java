import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ev", name = "N", descriptor = "I")
	private int anInt2329;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub8() {
		this(4096);
	}

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub8(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2329 = 4096;
		this.anInt2329 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			Static464.method5795(local17, 0, Static106.anInt2356, this.anInt2329);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2329 = (arg1.method6053() << 12) / 255;
		}
	}
}
