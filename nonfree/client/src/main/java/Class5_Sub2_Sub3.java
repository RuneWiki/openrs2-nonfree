import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	private int anInt333;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	private int anInt337 = -1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5812(arg0, arg1);
		if (this.anInt337 >= 0) {
			@Pc(25) int local25 = Static264.anInterface1_4.method2005(this.anInt337).aBoolean170 ? 64 : 128;
			this.anIntArray9 = Static264.anInterface1_4.method2007(local25, this.anInt337, 1.0F, local25, false);
			this.anInt333 = local25;
			this.anInt341 = local25;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(39) int local39 = this.anInt341 * (Static88.anInt1584 == this.anInt333 ? arg0 : this.anInt333 * arg0 / Static88.anInt1584);
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (this.anInt341 == Static15.anInt493) {
				for (local57 = 0; local57 < Static15.anInt493; local57++) {
					local66 = this.anIntArray9[local39++];
					local51[local57] = (local66 & 0xFF) << 4;
					local47[local57] = local66 >> 4 & 0xFF0;
					local43[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static15.anInt493; local57++) {
					local66 = this.anInt341 * local57 / Static15.anInt493;
					@Pc(74) int local74 = this.anIntArray9[local39 + local66];
					local51[local57] = (local74 & 0xFF) << 4;
					local47[local57] = local74 >> 4 & 0xFF0;
					local43[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
	@Override
	public int method5814() {
		return this.anInt337;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt337 = arg0.method1845();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	@Override
	public void method5807() {
		super.method5807();
		this.anIntArray9 = null;
	}
}
