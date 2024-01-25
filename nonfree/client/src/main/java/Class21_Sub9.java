import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class21_Sub9 extends Class21 {

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class21_Sub9(@OriginalArg(0) Class42_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub1_19.method5868(arg0);
		super.aClass42_Sub1_19.method5979(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		super.aClass42_Sub1_19.method5909(true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		super.aClass42_Sub1_19.method5909(false);
	}
}
