import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class4_Sub1_Sub7 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	private int anInt1549;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
	private int anInt1555;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub7(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1291(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub7() {
		this(0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(21) int[] local21 = local7[0];
			@Pc(25) int[] local25 = local7[1];
			@Pc(29) int[] local29 = local7[2];
			for (@Pc(31) int local31 = 0; local31 < Static68.anInt1753; local31++) {
				local21[local31] = this.anInt1557;
				local25[local31] = this.anInt1549;
				local29[local31] = this.anInt1555;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V")
	private void method1291(@OriginalArg(1) int arg0) {
		this.anInt1557 = arg0 >> 12 & 0xFF0;
		this.anInt1555 = (arg0 & 0xFF) << 4;
		this.anInt1549 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.method1291(arg1.method3063());
		}
	}
}
