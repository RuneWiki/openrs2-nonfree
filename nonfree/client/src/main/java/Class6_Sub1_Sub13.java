import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	private int anInt4456;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub13() {
		this(4096);
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub13(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4456 = 4096;
		this.anInt4456 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			Static653.method6539(local14, 0, Static53.anInt1787, this.anInt4456);
		}
		return local14;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4456 = (arg1.method8246() << 12) / 255;
		}
	}
}
