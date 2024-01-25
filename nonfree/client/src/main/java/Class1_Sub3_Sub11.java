import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
	private int anInt2258;

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		this(0);
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub11(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2129(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static236.anInt4609; local29++) {
				local19[local29] = this.anInt2258;
				local23[local29] = this.anInt2260;
				local27[local29] = this.anInt2255;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)V")
	private void method2129(@OriginalArg(1) int arg0) {
		this.anInt2258 = arg0 >> 12 & 0xFF0;
		this.anInt2260 = arg0 >> 4 & 0xFF0;
		this.anInt2255 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2129(arg0.method3039());
		}
	}
}
