import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class25_Sub2 extends Class25 implements Interface4 {

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "B")
	private byte aByte78;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ai;Z)V")
	public Class25_Sub2(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)I")
	@Override
	public int method6492() {
		return super.method6492();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte78 = (byte) arg0;
		super.method6500(arg1);
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
	public int method6508() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6496() {
		super.method6496();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6506() {
		return super.method6497(super.aClass16_Sub1_Sub1_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6505() {
		return super.method6495(super.aClass16_Sub1_Sub1_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	@Override
	public boolean method6504(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte78 = (byte) arg1;
		super.method6499(arg0, arg2);
		return true;
	}
}
