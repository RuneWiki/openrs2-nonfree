import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
	private int anInt8254 = 4096;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "Z")
	private boolean aBoolean617 = true;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8254 = arg1.method7945();
		} else if (arg0 == 1) {
			this.aBoolean617 = arg1.method7974() == 1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(30) int[] local30 = this.method7836(arg0 - 1 & Static98.anInt1743, 0);
			@Pc(36) int[] local36 = this.method7836(arg0, 0);
			@Pc(46) int[] local46 = this.method7836(Static98.anInt1743 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static501.anInt8748; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt8254;
				@Pc(94) int local94 = (local36[local60 + 1 & Static326.anInt4973] - local36[local60 - 1 & Static326.anInt4973]) * this.anInt8254;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(142) int local142;
				@Pc(138) int local138;
				@Pc(134) int local134;
				if (local128 == 0) {
					local142 = 0;
					local138 = 0;
					local134 = 0;
				} else {
					local134 = 16777216 / local128;
					local138 = local74 / local128;
					local142 = local94 / local128;
				}
				if (this.aBoolean617) {
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local50[local60] = local142;
				local54[local60] = local138;
				local58[local60] = local134;
			}
		}
		return local16;
	}
}
