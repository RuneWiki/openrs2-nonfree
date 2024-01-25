import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class107_Sub2 extends Class107 implements Interface17 {

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "B")
	private byte aByte126;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!no;Z)V")
	public Class107_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8438() {
		return super.method8429(super.aClass100_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
	@Override
	public void method8431() {
		super.method8431();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2) {
		this.aByte126 = (byte) arg0;
		super.method8430(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)I")
	public int method8442() {
		return this.aByte126;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8439() {
		return super.method8436(super.aClass100_Sub1_Sub2_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte126 = (byte) arg0;
		super.method8437(arg1);
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)I")
	@Override
	public int method8428() {
		return super.method8428();
	}
}
