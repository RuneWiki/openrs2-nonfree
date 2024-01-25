import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class5_Sub2_Sub18 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
	private int anInt5314;

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
	private int anInt5316;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
	private Class5_Sub2_Sub18(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4757(arg0);
	}

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub18() {
		this(0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4757(arg0.method5931());
		}
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static597.anInt10025; local34++) {
				local24[local34] = this.anInt5316;
				local28[local34] = this.anInt5314;
				local32[local34] = this.anInt5315;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(II)V")
	private void method4757(@OriginalArg(0) int arg0) {
		this.anInt5316 = arg0 >> 12 & 0xFF0;
		this.anInt5315 = (arg0 & 0xFF) << 4;
		this.anInt5314 = arg0 >> 4 & 0xFF0;
	}
}
