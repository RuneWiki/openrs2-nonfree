import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class3_Sub6_Sub36 extends Class3_Sub6 {

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
	private int anInt8618;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
	private int anInt8620;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
	private int anInt8624;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub36() {
		this(0);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
	private Class3_Sub6_Sub36(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7177(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method7177(arg0.method5230());
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static521.anInt8383; local29++) {
				local19[local29] = this.anInt8624;
				local23[local29] = this.anInt8618;
				local27[local29] = this.anInt8620;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)V")
	private void method7177(@OriginalArg(1) int arg0) {
		this.anInt8624 = arg0 >> 12 & 0xFF0;
		this.anInt8620 = (arg0 & 0xFF) << 4;
		this.anInt8618 = arg0 >> 4 & 0xFF0;
	}
}
