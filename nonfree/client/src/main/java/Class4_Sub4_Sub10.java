import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class4_Sub4_Sub10 extends Class4_Sub4 {

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	private int anInt2093;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub10() {
		this(4096);
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4_Sub10(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2093 = 4096;
		this.anInt2093 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2093 = (arg1.method2380() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			Static363.method4758(local9, 0, Static124.anInt3576, this.anInt2093);
		}
		return local9;
	}
}
