import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class14_Sub1_Sub10 extends Class14_Sub1 {

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!ffa", name = "L", descriptor = "I")
	private int anInt3083;

	@OriginalMember(owner = "client!ffa", name = "R", descriptor = "I")
	private int anInt3088;

	@OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
	private int anInt3082 = -1;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub10() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(35) int local35 = (Static535.anInt9239 == this.anInt3083 ? arg0 : this.anInt3083 * arg0 / Static535.anInt9239) * this.anInt3088;
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt3088 == Static371.anInt6835) {
				for (local57 = 0; local57 < Static371.anInt6835; local57++) {
					local66 = this.anIntArray248[local35++];
					local47[local57] = (local66 & 0xFF) << 4;
					local43[local57] = local66 >> 4 & 0xFF0;
					local39[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static371.anInt6835; local57++) {
					local66 = local57 * this.anInt3088 / Static371.anInt6835;
					@Pc(74) int local74 = this.anIntArray248[local35 + local66];
					local47[local57] = (local74 & 0xFF) << 4;
					local43[local57] = local74 >> 4 & 0xFF0;
					local39[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method8896(arg0, arg1);
		if (this.anInt3082 >= 0 && Static189.anInterface3_2 != null) {
			@Pc(31) int local31 = Static189.anInterface3_2.method6177(this.anInt3082).aBoolean455 ? 64 : 128;
			this.anIntArray248 = Static189.anInterface3_2.method6180(local31, local31, false, this.anInt3082, 1.0F);
			this.anInt3083 = local31;
			this.anInt3088 = local31;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3082 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
	@Override
	public void method8895() {
		super.method8895();
		this.anIntArray248 = null;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)I")
	@Override
	public int method8902() {
		return this.anInt3082;
	}
}
