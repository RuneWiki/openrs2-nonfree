import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class5_Sub1_Sub14 extends Class5_Sub1 {

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
	private int anInt5530;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	private int anInt5540;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "[I")
	private int[] anIntArray308;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
	private int anInt5541 = -1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub14() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
	@Override
	public int method9211() {
		return this.anInt5541;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
	@Override
	public void method9213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9213(arg0, arg1);
		if (this.anInt5541 >= 0 && Static448.anInterface1_8 != null) {
			@Pc(34) int local34 = Static448.anInterface1_8.method2863(this.anInt5541).aBoolean485 ? 64 : 128;
			this.anIntArray308 = Static448.anInterface1_8.method2861(false, this.anInt5541, local34, local34, 1.0F);
			this.anInt5530 = local34;
			this.anInt5540 = local34;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt5541 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	@Override
	public void method9207() {
		super.method9207();
		this.anIntArray308 = null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(45) int local45 = (Static269.anInt4686 == this.anInt5540 ? arg0 : arg0 * this.anInt5540 / Static269.anInt4686) * this.anInt5530;
			@Pc(49) int[] local49 = local18[0];
			@Pc(53) int[] local53 = local18[1];
			@Pc(57) int[] local57 = local18[2];
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (Static648.anInt9588 == this.anInt5530) {
				for (local67 = 0; local67 < Static648.anInt9588; local67++) {
					local75 = this.anIntArray308[local45++];
					local57[local67] = (local75 & 0xFF) << 4;
					local53[local67] = local75 >> 4 & 0xFF0;
					local49[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static648.anInt9588; local67++) {
					local75 = this.anInt5530 * local67 / Static648.anInt9588;
					@Pc(129) int local129 = this.anIntArray308[local75 + local45];
					local57[local67] = (local129 & 0xFF) << 4;
					local53[local67] = local129 >> 4 & 0xFF0;
					local49[local67] = local129 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}
}
