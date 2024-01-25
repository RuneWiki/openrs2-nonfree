import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class14_Sub26 extends Class14 {

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub26(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)I")
	public int method8283() {
		return super.anInt10835;
	}
}
