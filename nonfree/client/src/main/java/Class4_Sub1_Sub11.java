import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	private int anInt2225;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
	private int anInt2227;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
	private int anInt2229;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub11(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1775(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub11() {
		this(0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1775(arg0.method4655());
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(24) int[] local24 = local16[1];
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1626; local34++) {
				local28[local34] = this.anInt2229;
				local24[local34] = this.anInt2227;
				local32[local34] = this.anInt2225;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	private void method1775(@OriginalArg(1) int arg0) {
		this.anInt2227 = arg0 >> 4 & 0xFF0;
		this.anInt2229 = arg0 >> 12 & 0xFF0;
		this.anInt2225 = (arg0 & 0xFF) << 4;
	}
}
