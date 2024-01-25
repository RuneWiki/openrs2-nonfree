import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class17 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
	public int anInt259;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
	public int anInt260;

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
	public int anInt261;

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "I")
	public int anInt274;

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
	public int anInt265 = 128;

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
	public int anInt267 = 128;

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt271 = arg0;
	}

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(IIIIII)V")
	private Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt265 = arg2;
		this.anInt259 = arg4;
		this.anInt267 = arg1;
		this.anInt271 = arg0;
		this.anInt262 = arg3;
		this.anInt274 = arg5;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILclient!aja;)V")
	public void method240(@OriginalArg(1) Class17 arg0) {
		this.anInt259 = arg0.anInt259;
		this.anInt265 = arg0.anInt265;
		this.anInt271 = arg0.anInt271;
		this.anInt274 = arg0.anInt274;
		this.anInt267 = arg0.anInt267;
		this.anInt262 = arg0.anInt262;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)Lclient!aja;")
	public Class17 method241() {
		return new Class17(this.anInt271, this.anInt267, this.anInt265, this.anInt262, this.anInt259, this.anInt274);
	}
}
