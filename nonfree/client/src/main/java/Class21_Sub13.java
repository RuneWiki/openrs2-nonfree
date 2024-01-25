import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class21_Sub13 extends Class21 {

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class21_Sub13(@OriginalArg(0) Class14_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class21_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)I")
	@Override
	protected int method9292() {
		return super.aClass14_Sub22_31.method3013() == Static174.aClass77_11 && super.aClass14_Sub22_31.method3008() ? 0 : 1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	@Override
	public void method9290() {
		super.anInt11183 = this.method9292();
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)I")
	public int method4396() {
		return super.anInt11183;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)I")
	@Override
	public int method9289(@OriginalArg(1) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)V")
	@Override
	protected void method9291(@OriginalArg(0) int arg0) {
		super.anInt11183 = arg0;
	}
}
