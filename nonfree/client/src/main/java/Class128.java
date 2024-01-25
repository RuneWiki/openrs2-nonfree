import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class128 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public int anInt4056;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public int anInt4054 = 128;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public int anInt4057 = 128;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Class128(@OriginalArg(0) int arg0) {
		this.anInt4061 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIII)V")
	private Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4054 = arg1;
		this.anInt4061 = arg0;
		this.anInt4058 = arg5;
		this.anInt4056 = arg3;
		this.anInt4055 = arg4;
		this.anInt4057 = arg2;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Lclient!i;")
	public Class128 method3618() {
		return new Class128(this.anInt4061, this.anInt4054, this.anInt4057, this.anInt4056, this.anInt4055, this.anInt4058);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!i;)V")
	public void method3622(@OriginalArg(1) Class128 arg0) {
		this.anInt4056 = arg0.anInt4056;
		this.anInt4057 = arg0.anInt4057;
		this.anInt4061 = arg0.anInt4061;
		this.anInt4058 = arg0.anInt4058;
		this.anInt4055 = arg0.anInt4055;
		this.anInt4054 = arg0.anInt4054;
	}
}
