import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class6_Sub4_Sub18 extends Class6_Sub4 {

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
	private int anInt5183;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
	private int anInt5184;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	private int anInt5185;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	private Class6_Sub4_Sub18(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4639(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub18() {
		this(0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.method4639(arg1.method8606());
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static6.anInt111; local29++) {
				local19[local29] = this.anInt5185;
				local23[local29] = this.anInt5184;
				local27[local29] = this.anInt5183;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	private void method4639(@OriginalArg(0) int arg0) {
		this.anInt5185 = arg0 >> 12 & 0xFF0;
		this.anInt5183 = (arg0 & 0xFF) << 4;
		this.anInt5184 = arg0 >> 4 & 0xFF0;
	}
}
