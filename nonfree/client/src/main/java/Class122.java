import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class122 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!sk;")
	private Class5_Sub1 aClass5_Sub1_28 = new Class5_Sub1();

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!we;")
	private final Class212 aClass212_5 = new Class212();

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private int anInt3517;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "I")
	private final int anInt3516;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!tn;")
	private final Class190 aClass190_19;

	static {
		new Class85("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class122(@OriginalArg(0) int arg0) {
		this.anInt3517 = arg0;
		this.anInt3516 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass190_19 = new Class190(local19);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IJ)Lclient!sk;")
	public Class5_Sub1 method3177(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub1 local10 = (Class5_Sub1) this.aClass190_19.method5466(arg0);
		if (local10 != null) {
			this.aClass212_5.method5936(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method3179() {
		this.aClass212_5.method5942();
		this.aClass190_19.method5472();
		this.aClass5_Sub1_28 = new Class5_Sub1();
		this.anInt3517 = this.anInt3516;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(JZLclient!sk;)V")
	public void method3181(@OriginalArg(0) long arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		if (this.anInt3517 == 0) {
			@Pc(17) Class5_Sub1 local17 = this.aClass212_5.method5937();
			local17.method6005();
			local17.method5970();
			if (local17 == this.aClass5_Sub1_28) {
				local17 = this.aClass212_5.method5937();
				local17.method6005();
				local17.method5970();
			}
		} else {
			this.anInt3517--;
		}
		this.aClass190_19.method5464(arg1, arg0);
		this.aClass212_5.method5936(arg1);
	}
}
