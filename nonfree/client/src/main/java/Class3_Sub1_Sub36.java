import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uba", name = "N", descriptor = "[I")
	private int[] anIntArray622;

	@OriginalMember(owner = "client!uba", name = "R", descriptor = "I")
	private int anInt9555;

	@OriginalMember(owner = "client!uba", name = "S", descriptor = "I")
	private int anInt9556;

	@OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
	private int anInt9551 = -1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt9551 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(35) int local35 = (this.anInt9555 == Static331.anInt6903 ? arg0 : this.anInt9555 * arg0 / Static331.anInt6903) * this.anInt9556;
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt9556 == Static131.anInt2935) {
				for (local57 = 0; local57 < Static131.anInt2935; local57++) {
					local66 = this.anIntArray622[local35++];
					local47[local57] = (local66 & 0xFF) << 4;
					local43[local57] = local66 >> 4 & 0xFF0;
					local39[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static131.anInt2935; local57++) {
					local66 = this.anInt9556 * local57 / Static131.anInt2935;
					@Pc(73) int local73 = this.anIntArray622[local35 + local66];
					local47[local57] = (local73 & 0xFF) << 4;
					local43[local57] = local73 >> 4 & 0xFF0;
					local39[local57] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	@Override
	public void method8364() {
		super.method8364();
		this.anIntArray622 = null;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8369() {
		return this.anInt9551;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8363(arg0, arg1);
		if (this.anInt9551 >= 0 && Static350.anInterface4_12 != null) {
			@Pc(33) int local33 = Static350.anInterface4_12.method3088(this.anInt9551).aBoolean486 ? 64 : 128;
			this.anIntArray622 = Static350.anInterface4_12.method3086(local33, false, 1.0F, local33, this.anInt9551);
			this.anInt9555 = local33;
			this.anInt9556 = local33;
		}
	}
}
