import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class11_Sub1 extends Class11 implements Interface8 {

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!mc;Z)V")
	public Class11_Sub1(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)Z")
	@Override
	public boolean method6463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5935(arg0);
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6462() {
		return super.method6462();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6460() {
		return super.method6460();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method6459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		super.method5927(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I")
	@Override
	public int method6458() {
		return super.method6458();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461() {
		super.method6461();
	}
}
