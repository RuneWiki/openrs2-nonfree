import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class266 {

	@OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
	public int anInt7531;

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
	public int anInt7533;

	@OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
	public int anInt7535;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
	public int anInt7530 = 128;

	@OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
	public int anInt7532 = 128;

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	public int anInt7528;

	static {
		new Class306("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
	public Class266(@OriginalArg(0) int arg0) {
		this.anInt7528 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIIII)V")
	private Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7532 = arg2;
		this.anInt7535 = arg3;
		this.anInt7530 = arg1;
		this.anInt7528 = arg0;
		this.anInt7533 = arg5;
		this.anInt7531 = arg4;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!sca;I)V")
	public void method6292(@OriginalArg(0) Class266 arg0) {
		this.anInt7530 = arg0.anInt7530;
		this.anInt7528 = arg0.anInt7528;
		this.anInt7533 = arg0.anInt7533;
		this.anInt7535 = arg0.anInt7535;
		this.anInt7531 = arg0.anInt7531;
		this.anInt7532 = arg0.anInt7532;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)Lclient!sca;")
	public Class266 method6293() {
		return new Class266(this.anInt7528, this.anInt7530, this.anInt7532, this.anInt7535, this.anInt7531, this.anInt7533);
	}
}
