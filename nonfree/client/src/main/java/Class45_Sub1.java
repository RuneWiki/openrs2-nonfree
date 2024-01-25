import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public final class Class45_Sub1 extends Class45 implements Interface16 {

	@OriginalMember(owner = "client!caa", name = "D", descriptor = "B")
	private byte aByte28;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!lm;Z)V")
	public Class45_Sub1(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)I")
	public int method896() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5774() {
		return super.method2944(super.aClass100_Sub1_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	@Override
	public void method5772() {
		super.method5772();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte28 = (byte) arg0;
		super.method4117(arg1);
		return true;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5775() {
		return super.method2939(super.aClass100_Sub1_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method5773(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte28 = (byte) arg1;
		super.method2943(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I")
	@Override
	public int method5771() {
		return super.method5771();
	}
}
