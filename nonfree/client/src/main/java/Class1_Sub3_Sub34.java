import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub3_Sub34 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	private int anInt6976;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
	private int anInt6979;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
	private int anInt6980;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub34() {
		this(0);
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub34(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5456(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5456(arg0.method4142());
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			for (@Pc(37) int local37 = 0; local37 < Static347.anInt5974; local37++) {
				local27[local37] = this.anInt6980;
				local31[local37] = this.anInt6976;
				local35[local37] = this.anInt6979;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)V")
	private void method5456(@OriginalArg(1) int arg0) {
		this.anInt6979 = (arg0 & 0xFF) << 4;
		this.anInt6980 = arg0 >> 12 & 0xFF0;
		this.anInt6976 = arg0 >> 4 & 0xFF0;
	}
}
