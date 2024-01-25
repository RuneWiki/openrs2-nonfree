import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class201 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	public int anInt5906;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public int anInt5907;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	public int anInt5909;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public int anInt5917;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public int anInt5919;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public int anInt5921;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	public int anInt5920 = 128;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public int anInt5914 = 128;

	@OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
	public int anInt5915;

	static {
		new Class158(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
	public Class201(@OriginalArg(0) int arg0) {
		this.anInt5915 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIIII)V")
	private Class201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5907 = arg3;
		this.anInt5919 = arg4;
		this.anInt5915 = arg0;
		this.anInt5920 = arg2;
		this.anInt5906 = arg5;
		this.anInt5914 = arg1;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!pq;)V")
	public void method4523(@OriginalArg(1) Class201 arg0) {
		this.anInt5920 = arg0.anInt5920;
		this.anInt5914 = arg0.anInt5914;
		this.anInt5907 = arg0.anInt5907;
		this.anInt5919 = arg0.anInt5919;
		this.anInt5906 = arg0.anInt5906;
		this.anInt5915 = arg0.anInt5915;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Lclient!pq;")
	public Class201 method4524() {
		return new Class201(this.anInt5915, this.anInt5914, this.anInt5920, this.anInt5907, this.anInt5919, this.anInt5906);
	}
}
