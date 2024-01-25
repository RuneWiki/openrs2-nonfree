import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class6_Sub3_Sub22 extends Class6_Sub3 {

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
	private int anInt4854;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub22() {
		this(4096);
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class6_Sub3_Sub22(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4854 = 4096;
		this.anInt4854 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			Static596.method7718(local9, 0, Static35.anInt670, this.anInt4854);
		}
		return local9;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4854 = (arg1.method6019() << 12) / 255;
		}
	}
}
