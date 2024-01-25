import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class6_Sub3_Sub37 extends Class6_Sub3 {

	@OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
	private int anInt9390;

	@OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
	private int anInt9392;

	@OriginalMember(owner = "client!wea", name = "G", descriptor = "[I")
	private int[] anIntArray699;

	@OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
	private int anInt9394 = -1;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub37() {
		super(0, false);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	@Override
	public int method7825() {
		return this.anInt9394;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt9394 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	@Override
	public void method7830() {
		super.method7830();
		this.anIntArray699 = null;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(39) int local39 = this.anInt9392 * (Static495.anInt8251 == this.anInt9390 ? arg0 : this.anInt9390 * arg0 / Static495.anInt8251);
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt9392 == Static447.anInt8568) {
				for (local57 = 0; local57 < Static447.anInt8568; local57++) {
					local65 = this.anIntArray699[local39++];
					local51[local57] = (local65 & 0xFF) << 4;
					local47[local57] = local65 >> 4 & 0xFF0;
					local43[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static447.anInt8568; local57++) {
					local65 = local57 * this.anInt9392 / Static447.anInt8568;
					@Pc(117) int local117 = this.anIntArray699[local65 + local39];
					local51[local57] = (local117 & 0xFF) << 4;
					local47[local57] = local117 >> 4 & 0xFF0;
					local43[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(III)V")
	@Override
	public void method7827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7827(arg0, arg1);
		if (this.anInt9394 >= 0 && Static236.anInterface7_7 != null) {
			@Pc(24) int local24 = Static236.anInterface7_7.method5209(this.anInt9394).aBoolean105 ? 64 : 128;
			this.anIntArray699 = Static236.anInterface7_7.method5208(false, 1.0F, local24, local24, this.anInt9394);
			this.anInt9390 = local24;
			this.anInt9392 = local24;
		}
	}
}
