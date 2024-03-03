import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class173 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_251;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_145;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public static int anInt6986;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	protected final int anInt6985;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public final int anInt6984;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public final int anInt6983;

	static {
		new Class79("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
		aClass145_251 = new Class145(72, 7);
		aClass79_145 = new Class79("Continue", "Weiter", "Continuer", "Continuar");
		anInt6986 = 2;
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V", line = 157)
	protected Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6985 = arg2;
		this.anInt6984 = arg0;
		this.anInt6983 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
	public abstract void method6249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
	public abstract void method6251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
	public abstract void method6252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
