import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class21_Sub16 extends Class21 {

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21_Sub16(@OriginalArg(0) Class3_Sub27 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8634(@OriginalArg(1) int arg0) {
		super.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZI)I")
	@Override
	public int method8635(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I")
	@Override
	protected int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(Z)I")
	public int method5997() {
		return super.anInt10079;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(Z)V")
	@Override
	public void method8639() {
	}
}
