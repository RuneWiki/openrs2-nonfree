import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class39_Sub3(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5996(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6000() {
		return true;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ei;II)V")
	@Override
	public void method5997(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		super.aClass30_Sub1_42.method730(arg0);
		super.aClass30_Sub1_42.method713(arg1);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	@Override
	public void method5995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	@Override
	public void method5994() {
		super.aClass30_Sub1_42.method682(false);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5999(@OriginalArg(1) boolean arg0) {
		super.aClass30_Sub1_42.method682(true);
	}
}
