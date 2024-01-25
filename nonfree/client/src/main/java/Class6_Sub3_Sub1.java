import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!an", name = "B", descriptor = "I")
	private int anInt306 = 0;

	@OriginalMember(owner = "client!an", name = "C", descriptor = "I")
	private int anInt307 = 4096;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt306 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt307 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(21) int[] local21 = this.method7824(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static447.anInt8568; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt306 && local29 <= this.anInt307 ? 4096 : 0;
			}
		}
		return local11;
	}
}
