import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class76_Sub4 extends Class76 {

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class76_Sub4(@OriginalArg(0) Class121_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5611(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_39.method4679(true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5608(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5606() {
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	@Override
	public void method5613() {
		super.aClass121_Sub2_39.method4679(false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!go;B)V")
	@Override
	public void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1) {
		super.aClass121_Sub2_39.method4681(arg1);
		super.aClass121_Sub2_39.method4707(arg0);
	}
}
