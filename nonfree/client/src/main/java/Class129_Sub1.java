import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class129_Sub1 extends Class129 implements Interface16 {

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!lh;Z)V")
	public Class129_Sub1(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3487() {
		return super.method3487();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
	@Override
	public int method3485() {
		return super.method3485();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method3488(arg1);
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method3463(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.method3491(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
	@Override
	public void method3493() {
		super.method3493();
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3492() {
		return this.method3492();
	}
}
