import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class17 {

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "Lclient!jn;")
	private Class1_Sub5 aClass1_Sub5_5 = new Class1_Sub5();

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "Lclient!so;")
	private final Class225 aClass225_1 = new Class225();

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
	private int anInt419;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	private final int anInt418;

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "Lclient!qh;")
	private final Class199 aClass199_11;

	static {
		new Class119("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt419 = arg0;
		this.anInt418 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass199_11 = new Class199(local19);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(JLclient!jn;B)V")
	public void method315(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (this.anInt419 == 0) {
			@Pc(10) Class1_Sub5 local10 = this.aClass225_1.method4939();
			local10.method5915();
			local10.method5305();
			if (this.aClass1_Sub5_5 == local10) {
				local10 = this.aClass225_1.method4939();
				local10.method5915();
				local10.method5305();
			}
		} else {
			this.anInt419--;
		}
		this.aClass199_11.method4383(arg0, arg1);
		this.aClass225_1.method4943(arg1);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method316() {
		this.aClass225_1.method4938();
		this.aClass199_11.method4385();
		this.aClass1_Sub5_5 = new Class1_Sub5();
		this.anInt419 = this.anInt418;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(JI)Lclient!jn;")
	public Class1_Sub5 method317(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub5 local10 = (Class1_Sub5) this.aClass199_11.method4387(arg0);
		if (local10 != null) {
			this.aClass225_1.method4943(local10);
		}
		return local10;
	}
}
