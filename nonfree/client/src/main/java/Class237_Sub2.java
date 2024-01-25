import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public final class Class237_Sub2 extends Class237 implements Interface25 {

	@OriginalMember(owner = "client!uha", name = "I", descriptor = "B")
	private byte aByte138;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lclient!fc;Z)V")
	public Class237_Sub2(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	@Override
	public void method9037() {
		super.method9037();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)I")
	@Override
	public int method9028() {
		return super.method9028();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9041() {
		return super.method9033(super.aClass101_Sub1_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method9042(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		this.aByte138 = (byte) arg0;
		super.method9039(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9043() {
		return super.method9032(super.aClass101_Sub1_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!uha", name = "g", descriptor = "(B)I")
	public int method9047() {
		return this.aByte138;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method9040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte138 = (byte) arg1;
		super.method9031(arg0);
		return true;
	}
}
