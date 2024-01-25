import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub4_Sub28 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
	private int anInt5505;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
	private int anInt5507;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	private int anInt5510;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub28() {
		this(0);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
	private Class1_Sub4_Sub28(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4609(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.method4609(arg1.method5399());
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
	private void method4609(@OriginalArg(1) int arg0) {
		this.anInt5510 = arg0 >> 12 & 0xFF0;
		this.anInt5505 = arg0 >> 4 & 0xFF0;
		this.anInt5507 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static66.anInt1511; local29++) {
				local19[local29] = this.anInt5510;
				local23[local29] = this.anInt5505;
				local27[local29] = this.anInt5507;
			}
		}
		return local11;
	}
}
