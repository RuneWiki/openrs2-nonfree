import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class3_Sub6_Sub29 extends Class3_Sub6 {

	@OriginalMember(owner = "client!sea", name = "P", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!sea", name = "S", descriptor = "I")
	private int anInt8397;

	@OriginalMember(owner = "client!sea", name = "W", descriptor = "I")
	private int anInt8401;

	@OriginalMember(owner = "client!sea", name = "R", descriptor = "I")
	private int anInt8396 = -1;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(31) int local31 = this.anInt8397 * (Static465.anInt8091 == this.anInt8401 ? arg0 : this.anInt8401 * arg0 / Static465.anInt8091);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(49) int local49;
			@Pc(58) int local58;
			if (Static481.anInt8358 == this.anInt8397) {
				for (local49 = 0; local49 < Static481.anInt8358; local49++) {
					local58 = this.anIntArray500[local31++];
					local43[local49] = (local58 & 0xFF) << 4;
					local39[local49] = local58 >> 4 & 0xFF0;
					local35[local49] = local58 >> 12 & 0xFF0;
				}
			} else {
				for (local49 = 0; local49 < Static481.anInt8358; local49++) {
					local58 = local49 * this.anInt8397 / Static481.anInt8358;
					@Pc(65) int local65 = this.anIntArray500[local58 + local31];
					local43[local49] = (local65 & 0xFF) << 4;
					local39[local49] = local65 >> 4 & 0xFF0;
					local35[local49] = local65 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)I")
	@Override
	public int method8007() {
		return this.anInt8396;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8396 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(III)V")
	@Override
	public void method8004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8004(arg0, arg1);
		if (this.anInt8396 >= 0 && Static246.anInterface4_7 != null) {
			@Pc(31) int local31 = Static246.anInterface4_7.method7229(this.anInt8396).aBoolean358 ? 64 : 128;
			this.anIntArray500 = Static246.anInterface4_7.method7226(local31, this.anInt8396, false, local31, 1.0F);
			this.anInt8401 = local31;
			this.anInt8397 = local31;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	@Override
	public void method8002() {
		super.method8002();
		this.anIntArray500 = null;
	}
}
