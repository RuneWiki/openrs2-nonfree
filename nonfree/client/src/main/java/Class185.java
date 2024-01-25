import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class185 {

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
	public int anInt5129;

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
	public int anInt5131;

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
	public int anInt5135;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
	public int anInt5137 = 128;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	public int anInt5136 = 128;

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	public int anInt5132;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(I)V")
	public Class185(@OriginalArg(0) int arg0) {
		this.anInt5132 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIIII)V")
	private Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5132 = arg0;
		this.anInt5137 = arg2;
		this.anInt5135 = arg3;
		this.anInt5136 = arg1;
		this.anInt5129 = arg4;
		this.anInt5131 = arg5;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!jea;I)V")
	public void method4675(@OriginalArg(0) Class185 arg0) {
		this.anInt5135 = arg0.anInt5135;
		this.anInt5136 = arg0.anInt5136;
		this.anInt5131 = arg0.anInt5131;
		this.anInt5132 = arg0.anInt5132;
		this.anInt5137 = arg0.anInt5137;
		this.anInt5129 = arg0.anInt5129;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)Lclient!jea;")
	public Class185 method4676() {
		return new Class185(this.anInt5132, this.anInt5136, this.anInt5137, this.anInt5135, this.anInt5129, this.anInt5131);
	}
}
