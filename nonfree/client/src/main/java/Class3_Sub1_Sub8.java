import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
	private int anInt1374;

	@OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
	private int anInt1375;

	@OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
	private int anInt1377;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub8(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1178(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		this(0);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
	private void method1178(@OriginalArg(1) int arg0) {
		this.anInt1374 = arg0 >> 4 & 0xFF0;
		this.anInt1377 = (arg0 & 0xFF) << 4;
		this.anInt1375 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1178(arg0.method2786());
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(26) int[] local26 = local11[0];
			@Pc(30) int[] local30 = local11[1];
			@Pc(34) int[] local34 = local11[2];
			for (@Pc(36) int local36 = 0; local36 < Static238.anInt4221; local36++) {
				local26[local36] = this.anInt1375;
				local30[local36] = this.anInt1374;
				local34[local36] = this.anInt1377;
			}
		}
		return local11;
	}
}
