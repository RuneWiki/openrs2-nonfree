import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub1_Sub31 extends Class3_Sub1 {

	@OriginalMember(owner = "client!to", name = "H", descriptor = "I")
	private int anInt9734;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "I")
	private int anInt9735;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "I")
	private int anInt9736;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub31() {
		this(0);
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub31(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method8309(arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static379.anInt5859; local29++) {
				local19[local29] = this.anInt9735;
				local23[local29] = this.anInt9736;
				local27[local29] = this.anInt9734;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	private void method8309(@OriginalArg(0) int arg0) {
		this.anInt9736 = arg0 >> 4 & 0xFF0;
		this.anInt9734 = (arg0 & 0xFF) << 4;
		this.anInt9735 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.method8309(arg1.method2061());
		}
	}
}
