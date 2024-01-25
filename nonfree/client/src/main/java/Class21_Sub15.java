import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class21_Sub15 extends Class21 {

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "[I")
	public static final int[] anIntArray413 = new int[4096];

	static {
		for (@Pc(61) int local61 = 0; local61 < 4096; local61++) {
			anIntArray413[local61] = Static322.method4690(local61);
		}
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub15(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)I")
	public int method5064() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return super.aClass3_Sub22_34.method2421() == Static326.aClass309_5 && super.aClass3_Sub22_34.method2415() ? 0 : 1;
	}

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		super.anInt10876 = this.method9239();
	}
}
