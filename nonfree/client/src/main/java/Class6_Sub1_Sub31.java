import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class6_Sub1_Sub31 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
	private int anInt8590 = 4096;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
	private int anInt8589 = 0;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8589 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt8590 = arg1.method8220();
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(21) int[] local21 = this.method8731(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static53.anInt1787; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt8589 && local29 <= this.anInt8590 ? 4096 : 0;
			}
		}
		return local11;
	}
}
