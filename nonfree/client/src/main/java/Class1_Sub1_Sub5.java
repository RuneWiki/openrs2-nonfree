import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	private int anInt1980;

	@OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
	private int anInt1983;

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
	private int anInt1985 = -1;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.anInt1985;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method7698(arg0, arg1);
		if (this.anInt1985 >= 0 && Static535.anInterface7_11 != null) {
			@Pc(27) int local27 = Static535.anInterface7_11.method3874(this.anInt1985).aBoolean13 ? 64 : 128;
			this.anIntArray168 = Static535.anInterface7_11.method3869(local27, this.anInt1985, 1.0F, local27, false);
			this.anInt1980 = local27;
			this.anInt1983 = local27;
		}
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
	@Override
	public void method7710() {
		super.method7710();
		this.anIntArray168 = null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1985 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(31) int local31 = this.anInt1980 * (Static52.anInt1010 == this.anInt1983 ? arg0 : this.anInt1983 * arg0 / Static52.anInt1010);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(49) int local49;
			@Pc(58) int local58;
			if (this.anInt1980 == Static279.anInt4906) {
				for (local49 = 0; local49 < Static279.anInt4906; local49++) {
					local58 = this.anIntArray168[local31++];
					local43[local49] = (local58 & 0xFF) << 4;
					local39[local49] = local58 >> 4 & 0xFF0;
					local35[local49] = local58 >> 12 & 0xFF0;
				}
			} else {
				for (local49 = 0; local49 < Static279.anInt4906; local49++) {
					local58 = local49 * this.anInt1980 / Static279.anInt4906;
					@Pc(65) int local65 = this.anIntArray168[local31 + local58];
					local43[local49] = (local65 & 0xFF) << 4;
					local39[local49] = local65 >> 4 & 0xFF0;
					local35[local49] = local65 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
