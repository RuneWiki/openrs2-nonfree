import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class172_Sub1 extends Class172 implements Interface9 {

	@OriginalMember(owner = "client!jga", name = "G", descriptor = "B")
	private byte aByte41;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!dda;Z)V")
	public Class172_Sub1(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	@Override
	public void method5230() {
		super.method5230();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5101() {
		return super.method5233(super.aClass44_Sub2_Sub1_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method5103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte41 = (byte) arg1;
		super.method5226(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)I")
	public int method3881() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5100() {
		return super.method5231(super.aClass44_Sub2_Sub1_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte41 = (byte) arg0;
		super.method5228(arg1);
		return true;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I")
	@Override
	public int method5223() {
		return super.method5223();
	}
}
