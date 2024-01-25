import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class150_Sub1 extends Class150 implements Interface15 {

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!ag;Z)V")
	public Class150_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method7526(arg0);
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7519() {
		return super.method7519();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7521() {
		return this.method7521();
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I")
	@Override
	public int method7517() {
		return super.method7517();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method6274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		super.method7520(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)V")
	@Override
	public void method7527() {
		super.method7527();
	}
}
