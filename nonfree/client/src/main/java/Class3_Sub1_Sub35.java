import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub1_Sub35 extends Class3_Sub1 {

	@OriginalMember(owner = "client!th", name = "I", descriptor = "I")
	private int anInt9366;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "I")
	private int anInt9370;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "I")
	private int anInt9372;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub35(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7604(arg0);
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub35() {
		this(0);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static131.anInt2935; local37++) {
				local27[local37] = this.anInt9370;
				local31[local37] = this.anInt9372;
				local35[local37] = this.anInt9366;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.method7604(arg1.method6506());
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	private void method7604(@OriginalArg(0) int arg0) {
		this.anInt9372 = arg0 >> 4 & 0xFF0;
		this.anInt9366 = (arg0 & 0xFF) << 4;
		this.anInt9370 = arg0 >> 12 & 0xFF0;
	}
}
