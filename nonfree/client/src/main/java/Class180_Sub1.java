import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class180_Sub1 extends Class180 implements Interface16 {

	@OriginalMember(owner = "client!jw", name = "x", descriptor = "B")
	private byte aByte62;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!sb;Z)V")
	public Class180_Sub1(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method7457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte62 = (byte) arg1;
		super.method7382(arg0);
		return true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7456() {
		return super.method7383(super.aClass95_Sub3_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7458() {
		return super.method7375(super.aClass95_Sub3_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7459() {
		super.method7459();
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)I")
	public int method3896() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method7460(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte62 = (byte) arg1;
		super.method7381(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(Z)I")
	@Override
	public int method7455() {
		return super.method7455();
	}
}
