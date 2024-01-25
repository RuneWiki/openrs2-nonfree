import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class168_Sub2 extends Class168 implements Interface14 {

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!vaa;Z)V")
	public Class168_Sub2(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6766() {
		return super.method6753(super.aClass22_Sub2_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6764() {
		return super.method6756(super.aClass22_Sub2_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)I")
	@Override
	public int method6752() {
		return super.method6752();
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)I")
	public int method6770() {
		return this.aByte115;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method6754() {
		super.method6754();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method6767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte115 = (byte) arg0;
		super.method6757(arg1);
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBLclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte115 = (byte) arg0;
		super.method6762(arg2, arg1);
		return true;
	}
}
