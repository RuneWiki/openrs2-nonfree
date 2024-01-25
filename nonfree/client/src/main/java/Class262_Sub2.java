import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class262_Sub2 extends Class262 implements Interface23 {

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!mc;Z)V")
	public Class262_Sub2(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		return super.method7563();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	@Override
	public void method7567() {
		super.method7567();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7569() {
		return super.method7569();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method7570(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.method7562(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method7560(arg1);
		return true;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)I")
	@Override
	public int method7559() {
		return super.method7559();
	}
}
