import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public final class Class144 {

	@OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
	public int anInt3589;

	@OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
	public int anInt3592;

	@OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
	public int anInt3587 = 128;

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "I")
	public int anInt3590 = 128;

	@OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
	public int anInt3593;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(I)V")
	public Class144(@OriginalArg(0) int arg0) {
		this.anInt3593 = arg0;
	}

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(IIIIII)V")
	private Class144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3587 = arg1;
		this.anInt3592 = arg5;
		this.anInt3593 = arg0;
		this.anInt3589 = arg3;
		this.anInt3590 = arg2;
		this.anInt3595 = arg4;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Lclient!gja;")
	public Class144 method3147() {
		return new Class144(this.anInt3593, this.anInt3587, this.anInt3590, this.anInt3589, this.anInt3595, this.anInt3592);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILclient!gja;)V")
	public void method3148(@OriginalArg(1) Class144 arg0) {
		this.anInt3595 = arg0.anInt3595;
		this.anInt3590 = arg0.anInt3590;
		this.anInt3592 = arg0.anInt3592;
		this.anInt3593 = arg0.anInt3593;
		this.anInt3587 = arg0.anInt3587;
		this.anInt3589 = arg0.anInt3589;
	}
}
