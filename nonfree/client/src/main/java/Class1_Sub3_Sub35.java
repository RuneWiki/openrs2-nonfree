import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
	private int anInt8799;

	@OriginalMember(owner = "client!ut", name = "V", descriptor = "[I")
	private int[] anIntArray766;

	@OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
	private int anInt8804;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
	private int anInt8796 = -1;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	@Override
	public void method8195() {
		super.method8195();
		this.anIntArray766 = null;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt8796 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(37) int local37 = this.anInt8804 * (Static426.anInt7423 == this.anInt8799 ? arg0 : arg0 * this.anInt8799 / Static426.anInt7423);
			@Pc(41) int[] local41 = local13[0];
			@Pc(45) int[] local45 = local13[1];
			@Pc(49) int[] local49 = local13[2];
			@Pc(55) int local55;
			@Pc(63) int local63;
			if (Static254.anInt4973 == this.anInt8804) {
				for (local55 = 0; local55 < Static254.anInt4973; local55++) {
					local63 = this.anIntArray766[local37++];
					local49[local55] = (local63 & 0xFF) << 4;
					local45[local55] = local63 >> 4 & 0xFF0;
					local41[local55] = local63 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static254.anInt4973; local55++) {
					local63 = local55 * this.anInt8804 / Static254.anInt4973;
					@Pc(115) int local115 = this.anIntArray766[local37 + local63];
					local49[local55] = (local115 & 0xFF) << 4;
					local45[local55] = local115 >> 4 & 0xFF0;
					local41[local55] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I")
	@Override
	public int method8189() {
		return this.anInt8796;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(III)V")
	@Override
	public void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8198(arg0, arg1);
		if (this.anInt8796 >= 0 && Static526.anInterface13_14 != null) {
			@Pc(32) int local32 = Static526.anInterface13_14.method5789(this.anInt8796).aBoolean638 ? 64 : 128;
			this.anIntArray766 = Static526.anInterface13_14.method5790(local32, false, 1.0F, this.anInt8796, local32);
			this.anInt8804 = local32;
			this.anInt8799 = local32;
		}
	}
}
