import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "[I")
	private int[] anIntArray446;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	private int anInt7468;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	private int anInt7471;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
	private int anInt7464 = -1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(39) int local39 = this.anInt7471 * (this.anInt7468 == Static414.anInt7271 ? arg0 : arg0 * this.anInt7468 / Static414.anInt7271);
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static201.anInt3738 == this.anInt7471) {
				for (local61 = 0; local61 < Static201.anInt3738; local61++) {
					local69 = this.anIntArray446[local39++];
					local51[local61] = (local69 & 0xFF) << 4;
					local47[local61] = local69 >> 4 & 0xFF0;
					local43[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static201.anInt3738; local61++) {
					local69 = this.anInt7471 * local61 / Static201.anInt3738;
					@Pc(118) int local118 = this.anIntArray446[local39 + local69];
					local51[local61] = (local118 & 0xFF) << 4;
					local47[local61] = local118 >> 4 & 0xFF0;
					local43[local61] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7464 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8670(arg0, arg1);
		if (this.anInt7464 >= 0 && Static444.anInterface5_10 != null) {
			@Pc(24) int local24 = Static444.anInterface5_10.method4129(this.anInt7464).aBoolean741 ? 64 : 128;
			this.anIntArray446 = Static444.anInterface5_10.method4127(this.anInt7464, 1.0F, local24, local24, false);
			this.anInt7471 = local24;
			this.anInt7468 = local24;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
	@Override
	public int method8668() {
		return this.anInt7464;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	@Override
	public void method8666() {
		super.method8666();
		this.anIntArray446 = null;
	}
}
