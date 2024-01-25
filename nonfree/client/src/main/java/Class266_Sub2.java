import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class266_Sub2 extends Class266 implements Interface17 {

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
	private int anInt7692;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!dia;I[BIZ)V")
	public Class266_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7692 = arg1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZI[B)V")
	@Override
	public void method6786(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method6782(arg1, arg0);
		this.anInt7692 = 5123;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I")
	@Override
	public int method6787() {
		return this.anInt7692;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)I")
	@Override
	public int method6789() {
		return super.anInt7687;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)J")
	@Override
	public long method6788() {
		return 0L;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	protected void method6785() {
		super.aClass13_Sub2_32.method2023(this);
	}
}
