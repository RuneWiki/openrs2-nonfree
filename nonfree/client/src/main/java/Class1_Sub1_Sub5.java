import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!c", name = "X", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!c", name = "V", descriptor = "I")
	private int anInt521 = -1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, false);
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	@Override
	public void method3391() {
		super.method3391();
		this.anIntArray46 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166 && this.method432()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = this.anInt522 * (this.anInt526 == Static123.anInt2607 ? arg0 : this.anInt526 * arg0 / Static123.anInt2607);
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (Static107.anInt2321 == this.anInt522) {
				for (local66 = 0; local66 < Static107.anInt2321; local66++) {
					local74 = this.anIntArray46[local56++];
					local36[local66] = (local74 & 0xFF) << 4;
					local32[local66] = local74 >> 4 & 0xFF0;
					local28[local66] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static107.anInt2321; local66++) {
					local74 = local66 * this.anInt522 / Static107.anInt2321;
					@Pc(126) int local126 = this.anIntArray46[local74 + local56];
					local36[local66] = (local126 & 0xFF) << 4;
					local32[local66] = local126 >> 4 & 0xFF0;
					local28[local66] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)Z")
	private boolean method432() {
		if (this.anIntArray46 != null) {
			return true;
		} else if (this.anInt521 >= 0) {
			@Pc(18) int local18 = Static107.anInt2321;
			@Pc(20) int local20 = Static123.anInt2607;
			@Pc(30) int local30 = Static114.anInterface3_1.method2598(this.anInt521) ? 64 : 128;
			this.anIntArray46 = Static114.anInterface3_1.method2596(this.anInt521);
			this.anInt526 = local30;
			this.anInt522 = local30;
			Static89.method1320(local18, local20);
			return this.anIntArray46 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt521 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)I")
	@Override
	public int method3396() {
		return this.anInt521;
	}
}
