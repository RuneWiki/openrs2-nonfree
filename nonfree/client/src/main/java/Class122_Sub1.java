import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class122_Sub1 extends Class122 implements Interface19 {

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!qba;Z)V")
	public Class122_Sub1(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method6489(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.method6951(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6953() {
		super.method6953();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6952() {
		return super.method6952();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)I")
	@Override
	public int method6941() {
		return super.method6941();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6954() {
		return this.method6954();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6949(arg0);
		return true;
	}
}
