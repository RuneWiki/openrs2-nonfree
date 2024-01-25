import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub6_Sub9 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	private int anInt2222;

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	private int anInt2223;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
	private int anInt2228;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	private Class2_Sub6_Sub9(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2143(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub9() {
		this(0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static151.anInt2711; local34++) {
				local24[local34] = this.anInt2222;
				local28[local34] = this.anInt2228;
				local32[local34] = this.anInt2223;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2143(arg0.method4235());
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	private void method2143(@OriginalArg(1) int arg0) {
		this.anInt2222 = arg0 >> 12 & 0xFF0;
		this.anInt2223 = (arg0 & 0xFF) << 4;
		this.anInt2228 = arg0 >> 4 & 0xFF0;
	}
}
