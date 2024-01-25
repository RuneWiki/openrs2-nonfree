import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class6_Sub8_Sub13 extends Class6_Sub8 {

	@OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
	private int anInt4701;

	@OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
	private int anInt4702;

	@OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
	private int anInt4703;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub13() {
		this(0);
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(I)V")
	private Class6_Sub8_Sub13(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4313(arg0);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static83.anInt1268; local29++) {
				local19[local29] = this.anInt4702;
				local23[local29] = this.anInt4703;
				local27[local29] = this.anInt4701;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(II)V")
	private void method4313(@OriginalArg(0) int arg0) {
		this.anInt4702 = arg0 >> 12 & 0xFF0;
		this.anInt4703 = arg0 >> 4 & 0xFF0;
		this.anInt4701 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.method4313(arg1.method2987());
		}
	}
}
