import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
	private int anInt5193;

	@OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
	private int anInt5196;

	@OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
	private int anInt5197;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub16(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4342(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub16() {
		this(0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V")
	private void method4342(@OriginalArg(1) int arg0) {
		this.anInt5196 = (arg0 & 0xFF) << 4;
		this.anInt5193 = arg0 >> 4 & 0xFF0;
		this.anInt5197 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.method4342(arg1.method5307());
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(26) int[] local26 = local11[0];
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[2];
			for (@Pc(36) int local36 = 0; local36 < Static636.anInt10302; local36++) {
				local26[local36] = this.anInt5197;
				local30[local36] = this.anInt5193;
				local34[local36] = this.anInt5196;
			}
		}
		return local11;
	}
}
