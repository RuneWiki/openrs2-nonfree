import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class6_Sub4_Sub13 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
	private int anInt2150;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	private int anInt2154;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
	private int anInt2158 = -1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt2158 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(39) int local39 = this.anInt2150 * (Static88.anInt1743 == this.anInt2154 ? arg0 : this.anInt2154 * arg0 / Static88.anInt1743);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static408.anInt7209 == this.anInt2150) {
				for (local61 = 0; local61 < Static408.anInt7209; local61++) {
					local69 = this.anIntArray163[local39++];
					local51[local61] = (local69 & 0xFF) << 4;
					local47[local61] = local69 >> 4 & 0xFF0;
					local43[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static408.anInt7209; local61++) {
					local69 = this.anInt2150 * local61 / Static408.anInt7209;
					@Pc(121) int local121 = this.anIntArray163[local69 + local39];
					local51[local61] = (local121 & 0xFF) << 4;
					local47[local61] = local121 >> 4 & 0xFF0;
					local43[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7756(arg0, arg1);
		if (this.anInt2158 >= 0 && Static210.anInterface4_8 != null) {
			@Pc(27) int local27 = Static210.anInterface4_8.method4234(this.anInt2158).aBoolean595 ? 64 : 128;
			this.anIntArray163 = Static210.anInterface4_8.method4230(1.0F, this.anInt2158, local27, false, local27);
			this.anInt2154 = local27;
			this.anInt2150 = local27;
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.anInt2158;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	@Override
	public void method7751() {
		super.method7751();
		this.anIntArray163 = null;
	}
}
