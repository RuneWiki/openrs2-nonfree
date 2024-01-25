import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class229 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	public int anInt6431;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	public int anInt6434;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	public int anInt6432 = 128;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public int anInt6429 = 128;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	public int anInt6433;

	static {
		new Class174("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V")
	public Class229(@OriginalArg(0) int arg0) {
		this.anInt6433 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIII)V")
	private Class229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6428 = arg5;
		this.anInt6434 = arg4;
		this.anInt6429 = arg1;
		this.anInt6432 = arg2;
		this.anInt6433 = arg0;
		this.anInt6431 = arg3;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lclient!sr;")
	public Class229 method5292() {
		return new Class229(this.anInt6433, this.anInt6429, this.anInt6432, this.anInt6431, this.anInt6434, this.anInt6428);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!sr;I)V")
	public void method5293(@OriginalArg(0) Class229 arg0) {
		this.anInt6433 = arg0.anInt6433;
		this.anInt6432 = arg0.anInt6432;
		this.anInt6431 = arg0.anInt6431;
		this.anInt6429 = arg0.anInt6429;
		this.anInt6428 = arg0.anInt6428;
		this.anInt6434 = arg0.anInt6434;
	}
}
