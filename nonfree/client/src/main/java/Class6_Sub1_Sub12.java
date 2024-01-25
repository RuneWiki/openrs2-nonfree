import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class6_Sub1_Sub12 extends Class6_Sub1 {

	@OriginalMember(owner = "client!fs", name = "H", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3341 = 4096;
		this.anInt3341 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			Static589.method5379(local14, 0, Static289.anInt5549, this.anInt3341);
		}
		return local14;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3341 = (arg1.method4966() << 12) / 255;
		}
	}
}
