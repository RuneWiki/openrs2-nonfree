import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sga")
public class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sga", name = "F", descriptor = "[I")
	protected int[] anIntArray213;

	@OriginalMember(owner = "client!sga", name = "P", descriptor = "I")
	protected int anInt3765;

	@OriginalMember(owner = "client!sga", name = "H", descriptor = "I")
	protected int anInt3770;

	@OriginalMember(owner = "client!sga", name = "G", descriptor = "I")
	private int anInt3772 = -1;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)Z")
	protected final boolean method3286() {
		if (this.anIntArray213 != null) {
			return true;
		} else if (this.anInt3772 >= 0) {
			@Pc(39) Class173 local39 = Static396.anInt6780 >= 0 ? Static684.method3655(Static587.aClass208_133, Static396.anInt6780, this.anInt3772) : Static684.method3649(Static587.aClass208_133, this.anInt3772);
			local39.method3646();
			this.anIntArray213 = local39.method3658();
			this.anInt3770 = local39.anInt4282;
			this.anInt3765 = local39.anInt4287;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	@Override
	public final void method9207() {
		super.method9207();
		this.anIntArray213 = null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662 && this.method3286()) {
			@Pc(33) int[] local33 = local19[0];
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[2];
			@Pc(58) int local58 = this.anInt3770 * (Static269.anInt4686 == this.anInt3765 ? arg0 : this.anInt3765 * arg0 / Static269.anInt4686);
			@Pc(68) int local68;
			@Pc(76) int local76;
			if (this.anInt3770 == Static648.anInt9588) {
				for (local68 = 0; local68 < Static648.anInt9588; local68++) {
					local76 = this.anIntArray213[local58++];
					local41[local68] = (local76 & 0xFF) << 4;
					local37[local68] = local76 >> 4 & 0xFF0;
					local33[local68] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local68 = 0; local68 < Static648.anInt9588; local68++) {
					local76 = local68 * this.anInt3770 / Static648.anInt9588;
					@Pc(126) int local126 = this.anIntArray213[local76 + local58];
					local41[local68] = (local126 & 0xFF) << 4;
					local37[local68] = local126 >> 4 & 0xFF0;
					local33[local68] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public final void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt3772 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)I")
	@Override
	public final int method9202() {
		return this.anInt3772;
	}
}
