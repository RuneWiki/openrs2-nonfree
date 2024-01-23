import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
	private int anInt2821 = 0;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	private int anInt2819 = 4096;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2821 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt2819 = arg0.method2593();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(27) int[] local27 = this.method4570(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5670; local29++) {
				@Pc(40) int local40 = local27[local29];
				local17[local29] = local40 >= this.anInt2821 && this.anInt2819 >= local40 ? 4096 : 0;
			}
		}
		return local17;
	}
}
