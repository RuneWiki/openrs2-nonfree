import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class10_Sub2_Sub4 extends Class10_Sub2 {

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	private int anInt989 = -1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub4() {
		super(0, false);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	@Override
	public void method6039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6039(arg0, arg1);
		if (this.anInt989 >= 0 && Static157.anInterface7_4 != null) {
			@Pc(34) int local34 = Static157.anInterface7_4.method4447(this.anInt989).aBoolean474 ? 64 : 128;
			this.anIntArray85 = Static157.anInterface7_4.method4448(false, local34, 1.0F, this.anInt989, local34);
			this.anInt994 = local34;
			this.anInt995 = local34;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
	@Override
	public int method6038() {
		return this.anInt989;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(35) int local35 = (this.anInt995 == Static190.anInt3835 ? arg0 : this.anInt995 * arg0 / Static190.anInt3835) * this.anInt994;
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt994 == Static121.anInt2458) {
				for (local57 = 0; local57 < Static121.anInt2458; local57++) {
					local66 = this.anIntArray85[local35++];
					local47[local57] = (local66 & 0xFF) << 4;
					local43[local57] = local66 >> 4 & 0xFF0;
					local39[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static121.anInt2458; local57++) {
					local66 = this.anInt994 * local57 / Static121.anInt2458;
					@Pc(74) int local74 = this.anIntArray85[local35 + local66];
					local47[local57] = (local74 & 0xFF) << 4;
					local43[local57] = local74 >> 4 & 0xFF0;
					local39[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
	@Override
	public void method6047() {
		super.method6047();
		this.anIntArray85 = null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt989 = arg1.method2485();
		}
	}
}
