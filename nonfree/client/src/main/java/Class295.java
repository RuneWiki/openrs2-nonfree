import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class295 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt8611;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int anInt8612;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public int anInt8614;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public int anInt8615;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public int anInt8617;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public int anInt8619;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt8621;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	public int anInt8625;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public int anInt8618 = 128;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public int anInt8623 = 128;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public int anInt8616;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
	public Class295(@OriginalArg(0) int arg0) {
		this.anInt8616 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIII)V")
	private Class295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8623 = arg1;
		this.anInt8619 = arg3;
		this.anInt8616 = arg0;
		this.anInt8625 = arg5;
		this.anInt8615 = arg4;
		this.anInt8618 = arg2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!qd;B)V")
	public void method7629(@OriginalArg(0) Class295 arg0) {
		this.anInt8623 = arg0.anInt8623;
		this.anInt8618 = arg0.anInt8618;
		this.anInt8616 = arg0.anInt8616;
		this.anInt8625 = arg0.anInt8625;
		this.anInt8615 = arg0.anInt8615;
		this.anInt8619 = arg0.anInt8619;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Lclient!qd;")
	public Class295 method7630() {
		return new Class295(this.anInt8616, this.anInt8623, this.anInt8618, this.anInt8619, this.anInt8615, this.anInt8625);
	}
}
