import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public final class Class234 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public int anInt6351;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
	public int anInt6354;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
	public int anInt6353 = 128;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public int anInt6352 = 128;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	public int anInt6355;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V")
	public Class234(@OriginalArg(0) int arg0) {
		this.anInt6355 = arg0;
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIII)V")
	private Class234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6355 = arg0;
		this.anInt6353 = arg1;
		this.anInt6352 = arg2;
		this.anInt6351 = arg4;
		this.anInt6354 = arg3;
		this.anInt6349 = arg5;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)Lclient!mv;")
	public Class234 method5471() {
		return new Class234(this.anInt6355, this.anInt6353, this.anInt6352, this.anInt6354, this.anInt6351, this.anInt6349);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!mv;)V")
	public void method5472(@OriginalArg(1) Class234 arg0) {
		this.anInt6349 = arg0.anInt6349;
		this.anInt6351 = arg0.anInt6351;
		this.anInt6355 = arg0.anInt6355;
		this.anInt6353 = arg0.anInt6353;
		this.anInt6352 = arg0.anInt6352;
		this.anInt6354 = arg0.anInt6354;
	}
}
