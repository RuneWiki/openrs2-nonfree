import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oea", name = "E", descriptor = "I")
	private int anInt6677;

	@OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
	private int anInt6679;

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
	private int anInt6682;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub27(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5420(arg0);
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		this(0);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static501.anInt8748; local35++) {
				local25[local35] = this.anInt6677;
				local29[local35] = this.anInt6679;
				local33[local35] = this.anInt6682;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
	private void method5420(@OriginalArg(0) int arg0) {
		this.anInt6679 = arg0 >> 4 & 0xFF0;
		this.anInt6682 = (arg0 & 0xFF) << 4;
		this.anInt6677 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.method5420(arg1.method7919());
		}
	}
}
