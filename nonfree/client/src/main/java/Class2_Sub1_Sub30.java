import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	private int anInt6241;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		this(0);
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub30(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4963(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	private void method4963(@OriginalArg(0) int arg0) {
		this.anInt6245 = arg0 >> 4 & 0xFF0;
		this.anInt6241 = (arg0 & 0xFF) << 4;
		this.anInt6248 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static131.anInt2581; local37++) {
				local27[local37] = this.anInt6248;
				local31[local37] = this.anInt6245;
				local35[local37] = this.anInt6241;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.method4963(arg1.method3748());
		}
	}
}
