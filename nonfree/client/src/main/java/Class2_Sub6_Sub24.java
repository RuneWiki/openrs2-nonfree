import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class2_Sub6_Sub24 extends Class2_Sub6 {

	@OriginalMember(owner = "client!qga", name = "H", descriptor = "I")
	private int anInt7421;

	@OriginalMember(owner = "client!qga", name = "J", descriptor = "I")
	private int anInt7423;

	@OriginalMember(owner = "client!qga", name = "M", descriptor = "I")
	private int anInt7426;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(I)V")
	private Class2_Sub6_Sub24(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6279(arg0);
	}

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub24() {
		this(0);
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(II)V")
	private void method6279(@OriginalArg(0) int arg0) {
		this.anInt7421 = (arg0 & 0xFF) << 4;
		this.anInt7426 = arg0 >> 12 & 0xFF0;
		this.anInt7423 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.method6279(arg1.method8539());
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static51.anInt1085; local36++) {
				local26[local36] = this.anInt7426;
				local30[local36] = this.anInt7423;
				local34[local36] = this.anInt7421;
			}
		}
		return local18;
	}
}
