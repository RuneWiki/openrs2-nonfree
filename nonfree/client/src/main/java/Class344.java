import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class344 implements Interface7 {

	@OriginalMember(owner = "client!vga", name = "e", descriptor = "Lclient!bk;")
	private final Class32 aClass32_1;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!bk;)V")
	public Class344(@OriginalArg(0) Class32 arg0) {
		this.aClass32_1 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		Static240.aClass14_7.C(0, 0, Static240.anInt4852, Static196.anInt4059, this.aClass32_1.anInt1003, 0);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		return true;
	}
}
