import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class33_Sub12 extends Class33 {

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub12(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I")
	public int method4636() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 0;
	}
}
