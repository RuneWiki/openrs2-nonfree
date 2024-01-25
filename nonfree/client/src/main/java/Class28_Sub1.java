import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class28_Sub1 extends Class28 implements Interface22 {

	@OriginalMember(owner = "client!bba", name = "H", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!bga;Z)V")
	public Class28_Sub1(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
	@Override
	public void method6475() {
		super.method6475();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method762() {
		return super.method6074(super.aClass20_Sub2_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)I")
	public int method768() {
		return this.aByte19;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method763() {
		return super.method6070(super.aClass20_Sub2_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)I")
	@Override
	public int method6473() {
		return super.method6473();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	@Override
	public boolean method761(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte19 = (byte) arg1;
		super.method6071(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte19 = (byte) arg1;
		super.method6476(arg0);
		return true;
	}
}
