import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "[I")
	private int[] anIntArray15;

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!aq", name = "G", descriptor = "I")
	private int anInt389 = -1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(39) int local39 = (Static458.anInt7496 == this.anInt388 ? arg0 : arg0 * this.anInt388 / Static458.anInt7496) * this.anInt392;
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt392 == Static148.anInt2666) {
				for (local57 = 0; local57 < Static148.anInt2666; local57++) {
					local66 = this.anIntArray15[local39++];
					local51[local57] = (local66 & 0xFF) << 4;
					local47[local57] = local66 >> 4 & 0xFF0;
					local43[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static148.anInt2666; local57++) {
					local66 = local57 * this.anInt392 / Static148.anInt2666;
					@Pc(74) int local74 = this.anIntArray15[local39 + local66];
					local51[local57] = (local74 & 0xFF) << 4;
					local47[local57] = local74 >> 4 & 0xFF0;
					local43[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(B)I")
	@Override
	public int method5769() {
		return this.anInt389;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V")
	@Override
	public void method5768() {
		super.method5768();
		this.anIntArray15 = null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt389 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V")
	@Override
	public void method5767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5767(arg0, arg1);
		if (this.anInt389 >= 0 && Static185.anInterface8_55 != null) {
			@Pc(24) int local24 = Static185.anInterface8_55.method4125(this.anInt389).aBoolean324 ? 64 : 128;
			this.anIntArray15 = Static185.anInterface8_55.method4126(local24, this.anInt389, local24, false, 1.0F);
			this.anInt392 = local24;
			this.anInt388 = local24;
		}
	}
}
