import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class63_Sub1 extends Class63 implements Interface16 {

	@OriginalMember(owner = "client!dba", name = "A", descriptor = "B")
	private byte aByte30;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!lt;Z)V")
	public Class63_Sub1(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7124() {
		return super.method4806(super.aClass67_Sub1_Sub2_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7122() {
		return super.method4808(super.aClass67_Sub1_Sub2_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)I")
	public int method1353() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)I")
	@Override
	public int method9247() {
		return super.method9247();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)V")
	@Override
	public void method9249() {
		super.method9249();
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!jaclib/memory/Source;BII)Z")
	@Override
	public boolean method7125(@OriginalArg(0) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.aByte30 = (byte) arg1;
		super.method4802(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIZ)Z")
	@Override
	public boolean method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte30 = (byte) arg0;
		super.method9248(arg1);
		return true;
	}
}
