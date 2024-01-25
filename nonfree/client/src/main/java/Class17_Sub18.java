import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public final class Class17_Sub18 extends Class17 {

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17_Sub18(@OriginalArg(0) Class3_Sub15 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(II)V")
	@Override
	protected void method8737(@OriginalArg(0) int arg0) {
		super.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)I")
	public int method5964() {
		return super.anInt10323;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8732() {
		return 0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)I")
	@Override
	public int method8734(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8733() {
	}
}
