import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class360 {

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
	public int anInt9696;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
	public int anInt9701;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
	public int anInt9703;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	public int anInt9698 = 128;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
	public int anInt9699 = 128;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	public int anInt9705;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V")
	public Class360(@OriginalArg(0) int arg0) {
		this.anInt9705 = arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIII)V")
	private Class360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9703 = arg3;
		this.anInt9699 = arg1;
		this.anInt9701 = arg5;
		this.anInt9696 = arg4;
		this.anInt9705 = arg0;
		this.anInt9698 = arg2;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!ufa;I)V")
	public void method8256(@OriginalArg(0) Class360 arg0) {
		this.anInt9701 = arg0.anInt9701;
		this.anInt9705 = arg0.anInt9705;
		this.anInt9698 = arg0.anInt9698;
		this.anInt9696 = arg0.anInt9696;
		this.anInt9699 = arg0.anInt9699;
		this.anInt9703 = arg0.anInt9703;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Lclient!ufa;")
	public Class360 method8258() {
		return new Class360(this.anInt9705, this.anInt9699, this.anInt9698, this.anInt9703, this.anInt9696, this.anInt9701);
	}
}
