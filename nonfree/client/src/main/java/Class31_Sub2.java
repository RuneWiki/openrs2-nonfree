import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class31_Sub2 extends Class31 implements Interface3 {

	@OriginalMember(owner = "client!uia", name = "L", descriptor = "B")
	private byte aByte135;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lclient!jc;Z)V")
	public Class31_Sub2(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(I)I")
	public int method8248() {
		return this.aByte135;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8243() {
		return super.method8233(super.aClass65_Sub2_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte135 = (byte) arg1;
		super.method8242(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)I")
	@Override
	public int method8232() {
		return super.method8232();
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte135 = (byte) arg1;
		super.method8239(arg0);
		return true;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V")
	@Override
	public void method8235() {
		super.method8235();
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8245() {
		return super.method8241(super.aClass65_Sub2_Sub2_11.aMapBuffer2);
	}
}
