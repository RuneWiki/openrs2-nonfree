import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
	private int anInt8822;

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
	private int anInt8827;

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
	private int anInt8828;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		this(0);
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub33(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7286(arg0);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static164.anInt8839; local36++) {
				local26[local36] = this.anInt8822;
				local30[local36] = this.anInt8828;
				local34[local36] = this.anInt8827;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.method7286(arg1.method8421());
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V")
	private void method7286(@OriginalArg(0) int arg0) {
		this.anInt8828 = arg0 >> 4 & 0xFF0;
		this.anInt8827 = (arg0 & 0xFF) << 4;
		this.anInt8822 = arg0 >> 12 & 0xFF0;
	}
}
