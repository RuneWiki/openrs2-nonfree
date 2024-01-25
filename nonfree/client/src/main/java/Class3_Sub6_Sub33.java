import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class3_Sub6_Sub33 extends Class3_Sub6 {

	@OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
	private int anInt9483;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
	private int anInt9485;

	@OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
	private int anInt9489;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub33() {
		this(0);
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	private Class3_Sub6_Sub33(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7444(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static481.anInt8358; local34++) {
				local24[local34] = this.anInt9483;
				local28[local34] = this.anInt9485;
				local32[local34] = this.anInt9489;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method7444(arg0.method6830());
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
	private void method7444(@OriginalArg(0) int arg0) {
		this.anInt9483 = arg0 >> 12 & 0xFF0;
		this.anInt9489 = (arg0 & 0xFF) << 4;
		this.anInt9485 = arg0 >> 4 & 0xFF0;
	}
}
