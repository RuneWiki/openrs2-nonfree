import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
	private int anInt8150;

	@OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
	private int anInt8151;

	@OriginalMember(owner = "client!qea", name = "I", descriptor = "I")
	private int anInt8158;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub27(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6859(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		this(0);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(II)V")
	private void method6859(@OriginalArg(1) int arg0) {
		this.anInt8150 = arg0 >> 12 & 0xFF0;
		this.anInt8158 = arg0 >> 4 & 0xFF0;
		this.anInt8151 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static30.anInt908; local34++) {
				local24[local34] = this.anInt8150;
				local28[local34] = this.anInt8158;
				local32[local34] = this.anInt8151;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method6859(arg0.method4862());
		}
	}
}
