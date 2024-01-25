import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qha")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qha", name = "I", descriptor = "I")
	private int anInt8455;

	@OriginalMember(owner = "client!qha", name = "O", descriptor = "I")
	private int anInt8459;

	@OriginalMember(owner = "client!qha", name = "Q", descriptor = "I")
	private int anInt8461;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub25(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7170(arg0);
	}

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub25() {
		this(0);
	}

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(21) int[] local21 = local13[0];
			@Pc(25) int[] local25 = local13[1];
			@Pc(29) int[] local29 = local13[2];
			for (@Pc(31) int local31 = 0; local31 < Static222.anInt4971; local31++) {
				local21[local31] = this.anInt8455;
				local25[local31] = this.anInt8461;
				local29[local31] = this.anInt8459;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qha", name = "e", descriptor = "(II)V")
	private void method7170(@OriginalArg(1) int arg0) {
		this.anInt8455 = arg0 >> 12 & 0xFF0;
		this.anInt8461 = arg0 >> 4 & 0xFF0;
		this.anInt8459 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method7170(arg0.method8347());
		}
	}
}
