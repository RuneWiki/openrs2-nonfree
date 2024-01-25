import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class65_Sub2 extends Class65 implements Interface5 {

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!ph;Z)V")
	public Class65_Sub2(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5227(arg0);
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	@Override
	public boolean method5731(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.method5205(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5730() {
		return this.method5730();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	@Override
	public void method5728() {
		super.method5728();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5729() {
		return super.method5729();
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
	@Override
	public int method5726() {
		return super.method5726();
	}
}
