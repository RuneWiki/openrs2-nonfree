import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class365 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
	public int anInt9557;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	public int anInt9562;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
	public int anInt9565;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
	public int anInt9559 = 128;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
	public int anInt9566 = 128;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public int anInt9558;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I)V")
	public Class365(@OriginalArg(0) int arg0) {
		this.anInt9558 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIII)V")
	private Class365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9562 = arg5;
		this.anInt9559 = arg2;
		this.anInt9566 = arg1;
		this.anInt9558 = arg0;
		this.anInt9565 = arg3;
		this.anInt9557 = arg4;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!uq;)V")
	public void method8088(@OriginalArg(1) Class365 arg0) {
		this.anInt9565 = arg0.anInt9565;
		this.anInt9558 = arg0.anInt9558;
		this.anInt9562 = arg0.anInt9562;
		this.anInt9566 = arg0.anInt9566;
		this.anInt9559 = arg0.anInt9559;
		this.anInt9557 = arg0.anInt9557;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)Lclient!uq;")
	public Class365 method8091() {
		return new Class365(this.anInt9558, this.anInt9566, this.anInt9559, this.anInt9565, this.anInt9557, this.anInt9562);
	}
}
