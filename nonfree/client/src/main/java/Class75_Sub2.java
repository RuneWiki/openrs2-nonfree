import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class75_Sub2 extends Class75 implements Interface26 {

	@OriginalMember(owner = "client!te", name = "E", descriptor = "B")
	private byte aByte111;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!ck;Z)V")
	public Class75_Sub2(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)I")
	public int method7637() {
		return this.aByte111;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7635() {
		return super.method7625(super.aClass33_Sub1_Sub1_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	@Override
	public int method7621() {
		return super.method7621();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void method7627() {
		super.method7627();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte111 = (byte) arg0;
		super.method7624(arg1);
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method7634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte111 = (byte) arg1;
		super.method7622(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7632() {
		return super.method7628(super.aClass33_Sub1_Sub1_11.aMapBuffer2);
	}
}
