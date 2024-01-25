import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class4_Sub4_Sub31 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
	private int anInt7622;

	@OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
	private int anInt7624;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
	private int anInt7626;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub31() {
		this(0);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	private Class4_Sub4_Sub31(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6307(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.method6307(arg1.method6023());
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
	private void method6307(@OriginalArg(1) int arg0) {
		this.anInt7626 = (arg0 & 0xFF) << 4;
		this.anInt7624 = arg0 >> 12 & 0xFF0;
		this.anInt7622 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static560.anInt9394; local29++) {
				local19[local29] = this.anInt7624;
				local23[local29] = this.anInt7622;
				local27[local29] = this.anInt7626;
			}
		}
		return local11;
	}
}
