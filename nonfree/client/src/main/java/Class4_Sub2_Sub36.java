import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class4_Sub2_Sub36 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "[I")
	private int[] anIntArray639;

	@OriginalMember(owner = "client!vu", name = "N", descriptor = "I")
	private int anInt7229;

	@OriginalMember(owner = "client!vu", name = "R", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!vu", name = "K", descriptor = "I")
	private int anInt7226 = -1;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(35) int local35 = (Static160.anInt3006 == this.anInt7229 ? arg0 : this.anInt7229 * arg0 / Static160.anInt3006) * this.anInt7233;
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt7233 == Static350.anInt6330) {
				for (local53 = 0; local53 < Static350.anInt6330; local53++) {
					local61 = this.anIntArray639[local35++];
					local47[local53] = (local61 & 0xFF) << 4;
					local43[local53] = local61 >> 4 & 0xFF0;
					local39[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static350.anInt6330; local53++) {
					local61 = local53 * this.anInt7233 / Static350.anInt6330;
					@Pc(109) int local109 = this.anIntArray639[local61 + local35];
					local47[local53] = (local109 & 0xFF) << 4;
					local43[local53] = local109 >> 4 & 0xFF0;
					local39[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
	@Override
	public void method5839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5839(arg0, arg1);
		if (this.anInt7226 >= 0 && Static8.anInterface10_1 != null) {
			@Pc(27) int local27 = Static8.anInterface10_1.method4241(this.anInt7226).aBoolean231 ? 64 : 128;
			this.anIntArray639 = Static8.anInterface10_1.method4238(1.0F, this.anInt7226, local27, false, local27);
			this.anInt7229 = local27;
			this.anInt7233 = local27;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt7226 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	@Override
	public void method5840() {
		super.method5840();
		this.anIntArray639 = null;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I")
	@Override
	public int method5844() {
		return this.anInt7226;
	}
}
