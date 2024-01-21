import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	private Class2_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method422(arg0);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub2() {
		this(0);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.method422(arg1.method1536());
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
	private void method422(@OriginalArg(0) int arg0) {
		this.anInt546 = (arg0 & 0xFF) << 4;
		this.anInt554 = arg0 >> 12 & 0xFF0;
		this.anInt548 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(24) int[] local24 = local12[0];
			@Pc(28) int[] local28 = local12[1];
			@Pc(32) int[] local32 = local12[2];
			for (@Pc(34) int local34 = 0; local34 < Static118.anInt2608; local34++) {
				local24[local34] = this.anInt554;
				local28[local34] = this.anInt548;
				local32[local34] = this.anInt546;
			}
		}
		return local12;
	}
}
