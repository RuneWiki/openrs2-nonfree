import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class97 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!jp;")
	private final Class129 aClass129_21 = new Class129(64);

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!pc;")
	private final Class188 aClass188_40;

	static {
		new Class256("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!rb;ILclient!pc;)V")
	public Class97(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		this.aClass188_40 = arg2;
		this.aClass188_40.method4285(31);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!nf;")
	public Class166 method1987(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_21;
		@Pc(18) Class166 local18;
		synchronized (this.aClass129_21) {
			local18 = (Class166) this.aClass129_21.method3023((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass188_40.method4283(31, arg0);
		local18 = new Class166();
		if (local41 != null) {
			local18.method3918(new Class2_Sub20(local41));
		}
		@Pc(57) Class129 local57 = this.aClass129_21;
		synchronized (this.aClass129_21) {
			this.aClass129_21.method3029(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public void method1988() {
		@Pc(6) Class129 local6 = this.aClass129_21;
		synchronized (this.aClass129_21) {
			this.aClass129_21.method3026();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public void method1989() {
		@Pc(6) Class129 local6 = this.aClass129_21;
		synchronized (this.aClass129_21) {
			this.aClass129_21.method3025();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB)V")
	public void method1992() {
		@Pc(6) Class129 local6 = this.aClass129_21;
		synchronized (this.aClass129_21) {
			this.aClass129_21.method3028(5);
		}
	}
}
