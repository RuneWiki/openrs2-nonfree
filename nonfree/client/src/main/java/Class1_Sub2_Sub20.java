import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
	private int anInt3447 = 0;

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
	private int anInt3449 = 4096;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3447 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt3449 = arg1.method3115();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(28) int[] local28 = this.method5654(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static251.anInt6509; local30++) {
				@Pc(36) int local36 = local28[local30];
				local16[local30] = this.anInt3447 <= local36 && this.anInt3449 >= local36 ? 4096 : 0;
			}
		}
		return local16;
	}
}
