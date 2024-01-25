import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class11_Sub2_Sub38 extends Class11_Sub2 {

	@OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
	private int anInt6748;

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
	private int anInt6752;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
	private int anInt6754;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V")
	private Class11_Sub2_Sub38(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5698(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub38() {
		this(0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	private void method5698(@OriginalArg(0) int arg0) {
		this.anInt6754 = (arg0 & 0xFF) << 4;
		this.anInt6748 = arg0 >> 4 & 0xFF0;
		this.anInt6752 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static339.anInt6549; local34++) {
				local24[local34] = this.anInt6752;
				local28[local34] = this.anInt6748;
				local32[local34] = this.anInt6754;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5698(arg0.method5221());
		}
	}
}
