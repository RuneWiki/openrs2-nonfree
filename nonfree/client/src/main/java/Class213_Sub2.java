import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vla")
public final class Class213_Sub2 extends Class213 implements Interface24 {

	@OriginalMember(owner = "client!vla", name = "G", descriptor = "B")
	private byte aByte145;

	@OriginalMember(owner = "client!vla", name = "<init>", descriptor = "(Lclient!mba;Z)V")
	public Class213_Sub2(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!vla", name = "e", descriptor = "(I)I")
	public int method9232() {
		return this.aByte145;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method9229(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte145 = (byte) arg0;
		super.method9222(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9228() {
		return super.method9225(super.aClass145_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(B)V")
	@Override
	public void method9218() {
		super.method9218();
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(I)I")
	@Override
	public int method9217() {
		return super.method9217();
	}

	@OriginalMember(owner = "client!vla", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method9227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte145 = (byte) arg0;
		super.method9224(arg1);
		return true;
	}

	@OriginalMember(owner = "client!vla", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9230() {
		return super.method9223(super.aClass145_Sub1_Sub1_12.aMapBuffer2);
	}
}
