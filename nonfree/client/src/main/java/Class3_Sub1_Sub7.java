import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub7() {
		this(4096);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub7(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1658 = 4096;
		this.anInt1658 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			Static559.method5958(local9, 0, Static307.anInt4846, this.anInt1658);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt1658 = (arg1.method7548() << 12) / 255;
		}
	}
}
