import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public final class Class329 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
	public int anInt9138;

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
	public int anInt9145;

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
	public int anInt9146;

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
	public int anInt9143 = 128;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
	public int anInt9140 = 128;

	@OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
	public int anInt9144;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I)V")
	public Class329(@OriginalArg(0) int arg0) {
		this.anInt9144 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9143 = arg2;
		this.anInt9144 = arg0;
		this.anInt9145 = arg5;
		this.anInt9140 = arg1;
		this.anInt9138 = arg4;
		this.anInt9146 = arg3;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILclient!vfa;)V")
	public void method7484(@OriginalArg(1) Class329 arg0) {
		this.anInt9145 = arg0.anInt9145;
		this.anInt9144 = arg0.anInt9144;
		this.anInt9143 = arg0.anInt9143;
		this.anInt9138 = arg0.anInt9138;
		this.anInt9146 = arg0.anInt9146;
		this.anInt9140 = arg0.anInt9140;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)Lclient!vfa;")
	public Class329 method7487() {
		return new Class329(this.anInt9144, this.anInt9140, this.anInt9143, this.anInt9146, this.anInt9138, this.anInt9145);
	}
}
