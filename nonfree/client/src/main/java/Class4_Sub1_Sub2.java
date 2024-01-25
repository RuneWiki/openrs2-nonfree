import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
	private int anInt277 = -1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(31) int local31 = this.anInt273 * (Static477.anInt8774 == this.anInt276 ? arg0 : this.anInt276 * arg0 / Static477.anInt8774);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (this.anInt273 == Static376.anInt7260) {
				for (local53 = 0; local53 < Static376.anInt7260; local53++) {
					local62 = this.anIntArray12[local31++];
					local43[local53] = (local62 & 0xFF) << 4;
					local39[local53] = local62 >> 4 & 0xFF0;
					local35[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static376.anInt7260; local53++) {
					local62 = this.anInt273 * local53 / Static376.anInt7260;
					@Pc(70) int local70 = this.anIntArray12[local31 + local62];
					local43[local53] = (local70 & 0xFF) << 4;
					local39[local53] = local70 >> 4 & 0xFF0;
					local35[local53] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt277 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	@Override
	public int method8383() {
		return this.anInt277;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
	@Override
	public void method8386() {
		super.method8386();
		this.anIntArray12 = null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8387(arg0, arg1);
		if (this.anInt277 >= 0 && Static334.anInterface11_12 != null) {
			@Pc(35) int local35 = Static334.anInterface11_12.method7405(this.anInt277).aBoolean12 ? 64 : 128;
			this.anIntArray12 = Static334.anInterface11_12.method7408(local35, false, local35, this.anInt277, 1.0F);
			this.anInt273 = local35;
			this.anInt276 = local35;
		}
	}
}
