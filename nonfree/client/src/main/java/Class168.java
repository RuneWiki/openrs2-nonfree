import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class168 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_25;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "J")
	public final long aLong142;

	static {
		new Class267("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!rl;JI)V")
	public Class168(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub2_25 = arg0;
		this.aLong142 = arg1;
	}

	@OriginalMember(owner = "client!mt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub2_25.method5096(this.aLong142);
		super.finalize();
	}
}
