import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class135_Sub1 extends Class135 implements Interface2 {

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ia;Z)V")
	public Class135_Sub1(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6241() {
		return super.method6241();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method5803(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2) {
		super.method6245(arg0, arg1);
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6243() {
		return super.method6243();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)Z")
	@Override
	public boolean method5805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6240(arg1);
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
	@Override
	public int method6235() {
		return super.method6235();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	@Override
	public void method6239() {
		super.method6239();
	}
}
