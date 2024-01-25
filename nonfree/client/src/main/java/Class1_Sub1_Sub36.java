import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	private int anInt9156;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	private int anInt9159;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	private int anInt9160;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7585(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IZ)V")
	private void method7585(@OriginalArg(0) int arg0) {
		this.anInt9160 = arg0 >> 12 & 0xFF0;
		this.anInt9156 = (arg0 & 0xFF) << 4;
		this.anInt9159 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static87.anInt1964; local35++) {
				local25[local35] = this.anInt9160;
				local29[local35] = this.anInt9159;
				local33[local35] = this.anInt9156;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.method7585(arg1.method4396());
		}
	}
}
