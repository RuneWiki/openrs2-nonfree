import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class63_Sub2 extends Class63 implements Interface5 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!ns;")
	private final Class261 aClass261_9;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!lt;Lclient!ns;Z)V")
	public Class63_Sub2(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass261_9 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	@Override
	public void method9248(@OriginalArg(0) int arg0) {
		super.method9248(arg0 * this.aClass261_9.anInt7631);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	@Override
	public int method9247() {
		return super.method9247();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method9252() {
		return super.method4808(super.aClass67_Sub1_Sub2_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Lclient!ns;")
	@Override
	public Class261 method9251() {
		return this.aClass261_9;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9250() {
		return super.method4806(super.aClass67_Sub1_Sub2_7.aMapBuffer1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	@Override
	public void method9249() {
		super.method9249();
	}
}
