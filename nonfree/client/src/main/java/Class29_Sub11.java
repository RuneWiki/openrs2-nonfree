import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ila")
public final class Class29_Sub11 extends Class29 {

	@OriginalMember(owner = "client!ila", name = "s", descriptor = "I")
	private final int anInt4348;

	@OriginalMember(owner = "client!ila", name = "n", descriptor = "I")
	private final int anInt4349;

	@OriginalMember(owner = "client!ila", name = "q", descriptor = "I")
	private final int anInt4350;

	@OriginalMember(owner = "client!ila", name = "l", descriptor = "I")
	private final int anInt4354;

	@OriginalMember(owner = "client!ila", name = "u", descriptor = "I")
	private final int anInt4351;

	@OriginalMember(owner = "client!ila", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub11(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt4348 = arg0.method2028(-14795);
		@Pc(11) int local11 = arg0.method2036();
		this.anInt4349 = local11 & 0xFFFF;
		this.anInt4350 = local11 >>> 16;
		this.anInt4354 = arg0.method2048(255);
		this.anInt4351 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!ila", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static134.aClass401Array1[this.anInt4348].method9460(this.anInt4354, this.anInt4350, this.anInt4351, this.anInt4349);
	}
}
