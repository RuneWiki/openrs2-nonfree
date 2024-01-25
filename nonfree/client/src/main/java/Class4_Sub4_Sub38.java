import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class4_Sub4_Sub38 extends Class4_Sub4 {

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
	private int anInt9462;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub38() {
		this(4096);
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class4_Sub4_Sub38(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9462 = 4096;
		this.anInt9462 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			Static602.method1584(local14, 0, Static560.anInt9394, this.anInt9462);
		}
		return local14;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt9462 = (arg1.method6015() << 12) / 255;
		}
	}
}
