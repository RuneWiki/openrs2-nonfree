import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	private int anInt6873;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	private int anInt6874;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	private int anInt6876;

	static {
		new Class209("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub34(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5429(arg0);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		this(0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5429(arg0.method5485());
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
	private void method5429(@OriginalArg(1) int arg0) {
		this.anInt6873 = arg0 >> 12 & 0xFF0;
		this.anInt6876 = (arg0 & 0xFF) << 4;
		this.anInt6874 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static429.anInt6518; local29++) {
				local19[local29] = this.anInt6873;
				local23[local29] = this.anInt6874;
				local27[local29] = this.anInt6876;
			}
		}
		return local11;
	}
}
