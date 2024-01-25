import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class12_Sub1_Sub10 extends Class12_Sub1 {

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt3175 = 0;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	private int anInt3172 = 4096;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3175 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt3172 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(30) int[] local30 = this.method7795(0, arg0);
			for (@Pc(32) int local32 = 0; local32 < Static357.anInt6670; local32++) {
				@Pc(38) int local38 = local30[local32];
				local18[local32] = local38 >= this.anInt3175 && this.anInt3172 >= local38 ? 4096 : 0;
			}
		}
		return local18;
	}
}
