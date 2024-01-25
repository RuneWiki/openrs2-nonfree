import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class194 {

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
	public int anInt5984;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
	public int anInt5988;

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
	public int anInt5987 = 128;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
	public int anInt5993 = 128;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
	public int anInt5990;

	static {
		new Class40("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I)V")
	public Class194(@OriginalArg(0) int arg0) {
		this.anInt5990 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIII)V")
	private Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5993 = arg2;
		this.anInt5990 = arg0;
		this.anInt5988 = arg5;
		this.anInt5986 = arg3;
		this.anInt5987 = arg1;
		this.anInt5984 = arg4;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Lclient!mca;")
	public Class194 method4981() {
		return new Class194(this.anInt5990, this.anInt5987, this.anInt5993, this.anInt5986, this.anInt5984, this.anInt5988);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!mca;)V")
	public void method4986(@OriginalArg(1) Class194 arg0) {
		this.anInt5984 = arg0.anInt5984;
		this.anInt5993 = arg0.anInt5993;
		this.anInt5988 = arg0.anInt5988;
		this.anInt5987 = arg0.anInt5987;
		this.anInt5990 = arg0.anInt5990;
		this.anInt5986 = arg0.anInt5986;
	}
}
