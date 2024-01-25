import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class160 {

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	public int anInt4128;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public int anInt4131;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public int anInt4137;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public int anInt4130 = 128;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
	public int anInt4135 = 128;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
	public int anInt4129;

	static {
		new Class147("", 76);
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
	public Class160(@OriginalArg(0) int arg0) {
		this.anInt4129 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(IIIIII)V")
	private Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4131 = arg3;
		this.anInt4137 = arg4;
		this.anInt4135 = arg1;
		this.anInt4130 = arg2;
		this.anInt4129 = arg0;
		this.anInt4128 = arg5;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ir;B)V")
	public void method3670(@OriginalArg(0) Class160 arg0) {
		this.anInt4135 = arg0.anInt4135;
		this.anInt4130 = arg0.anInt4130;
		this.anInt4129 = arg0.anInt4129;
		this.anInt4131 = arg0.anInt4131;
		this.anInt4128 = arg0.anInt4128;
		this.anInt4137 = arg0.anInt4137;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)Lclient!ir;")
	public Class160 method3673() {
		return new Class160(this.anInt4129, this.anInt4135, this.anInt4130, this.anInt4131, this.anInt4137, this.anInt4128);
	}
}
