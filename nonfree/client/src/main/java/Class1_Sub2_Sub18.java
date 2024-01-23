import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
	private int anInt2169;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
	private int anInt2180;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub18(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1618(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		this(0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(19) int[] local19 = local11[1];
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static105.anInt2391; local29++) {
				local23[local29] = this.anInt2180;
				local19[local29] = this.anInt2169;
				local27[local29] = this.anInt2179;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1618(arg0.method920());
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	private void method1618(@OriginalArg(1) int arg0) {
		this.anInt2180 = arg0 >> 12 & 0xFF0;
		this.anInt2169 = arg0 >> 4 & 0xFF0;
		this.anInt2179 = (arg0 & 0xFF) << 4;
	}
}
