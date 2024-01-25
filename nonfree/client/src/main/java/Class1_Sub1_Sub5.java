import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	private int anInt845;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
	private int anInt847;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		this(0);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub5(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method757(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.method757(arg1.method4493());
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			for (@Pc(35) int local35 = 0; local35 < Static434.anInt4326; local35++) {
				local25[local35] = this.anInt847;
				local29[local35] = this.anInt848;
				local33[local35] = this.anInt845;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	private void method757(@OriginalArg(1) int arg0) {
		this.anInt847 = arg0 >> 12 & 0xFF0;
		this.anInt845 = (arg0 & 0xFF) << 4;
		this.anInt848 = arg0 >> 4 & 0xFF0;
	}
}
