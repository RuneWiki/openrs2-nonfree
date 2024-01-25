import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class6_Sub3_Sub23 extends Class6_Sub3 {

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "I")
	private int anInt5894;

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
	private int anInt5897;

	static {
		new Class84("", 76);
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub23() {
		this(0);
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(I)V")
	private Class6_Sub3_Sub23(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5054(arg0);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(27) int[] local27 = local19[0];
			@Pc(31) int[] local31 = local19[1];
			@Pc(35) int[] local35 = local19[2];
			for (@Pc(37) int local37 = 0; local37 < Static447.anInt8568; local37++) {
				local27[local37] = this.anInt5897;
				local31[local37] = this.anInt5892;
				local35[local37] = this.anInt5894;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
	private void method5054(@OriginalArg(1) int arg0) {
		this.anInt5894 = (arg0 & 0xFF) << 4;
		this.anInt5892 = arg0 >> 4 & 0xFF0;
		this.anInt5897 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.method5054(arg1.method5988());
		}
	}
}
