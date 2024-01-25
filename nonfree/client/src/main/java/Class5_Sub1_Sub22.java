import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class5_Sub1_Sub22 extends Class5_Sub1 {

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	private int anInt3721 = 4096;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	private int anInt3722 = 0;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3722 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt3721 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(31) int[] local31 = this.method5772(0, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static148.anInt2666; local33++) {
				@Pc(39) int local39 = local31[local33];
				local11[local33] = this.anInt3722 <= local39 && this.anInt3721 >= local39 ? 4096 : 0;
			}
		}
		return local11;
	}
}
