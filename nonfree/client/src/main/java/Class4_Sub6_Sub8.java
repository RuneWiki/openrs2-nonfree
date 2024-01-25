import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class4_Sub6_Sub8 extends Class4_Sub6 {

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	private int anInt1542;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "I")
	private int anInt1543;

	@OriginalMember(owner = "client!df", name = "V", descriptor = "I")
	private int anInt1552;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub8() {
		this(0);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
	private Class4_Sub6_Sub8(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1234(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static31.anInt797; local34++) {
				local24[local34] = this.anInt1542;
				local28[local34] = this.anInt1543;
				local32[local34] = this.anInt1552;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.method1234(arg1.method3442());
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	private void method1234(@OriginalArg(0) int arg0) {
		this.anInt1542 = arg0 >> 12 & 0xFF0;
		this.anInt1552 = (arg0 & 0xFF) << 4;
		this.anInt1543 = arg0 >> 4 & 0xFF0;
	}
}
