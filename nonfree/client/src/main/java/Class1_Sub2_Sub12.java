import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1898 = 4096;
		this.anInt1898 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1898 = (arg0.method861() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			Static184.method627(local9, 0, Static110.anInt2825, this.anInt1898);
		}
		return local9;
	}
}
