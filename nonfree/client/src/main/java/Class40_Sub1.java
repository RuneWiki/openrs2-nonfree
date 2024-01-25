import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class40_Sub1 extends Class40 implements Interface7 {

	@OriginalMember(owner = "client!bia", name = "E", descriptor = "B")
	private byte aByte15;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!md;Z)V")
	public Class40_Sub1(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIZ)Z")
	@Override
	public boolean method5844(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte15 = (byte) arg2;
		super.method1392(arg1, arg0);
		return true;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5843() {
		return super.method1390(super.aClass144_Sub1_Sub2_5.aMapBuffer2);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)V")
	@Override
	public void method5842() {
		super.method5842();
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)I")
	@Override
	public int method5839() {
		return super.method5839();
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
	public int method774() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte15 = (byte) arg0;
		super.method5084(arg1);
		return true;
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5840() {
		return super.method1391(super.aClass144_Sub1_Sub2_5.aMapBuffer2);
	}
}
