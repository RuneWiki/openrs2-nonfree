import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class5_Sub1_Sub17 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub17() {
		this(4096);
	}

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub17(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3176 = 4096;
		this.anInt3176 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			Static468.method3861(local9, 0, Static148.anInt2666, this.anInt3176);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3176 = (arg1.method5539() << 12) / 255;
		}
	}
}
