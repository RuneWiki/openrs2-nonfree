import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class14_Sub3_Sub1 extends Class14_Sub3 {

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	private Class14_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method398(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub1() {
		this(0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	private void method398(@OriginalArg(0) int arg0) {
		this.anInt342 = arg0 >> 12 & 0xFF0;
		this.anInt344 = arg0 >> 4 & 0xFF0;
		this.anInt341 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static294.anInt5657; local34++) {
				local24[local34] = this.anInt342;
				local28[local34] = this.anInt344;
				local32[local34] = this.anInt341;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method398(arg0.method2501());
		}
	}
}
