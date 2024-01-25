import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class368 {

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	public int anInt9880;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	public int anInt9881;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	public int anInt9882;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public int anInt9884;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt9886;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt9887;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
	public int anInt9888;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public int anInt9890;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public int anInt9885 = 128;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
	public int anInt9891 = 128;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
	public int anInt9883;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V")
	public Class368(@OriginalArg(0) int arg0) {
		this.anInt9883 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(IIIIII)V")
	private Class368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9886 = arg3;
		this.anInt9885 = arg1;
		this.anInt9888 = arg5;
		this.anInt9882 = arg4;
		this.anInt9883 = arg0;
		this.anInt9891 = arg2;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ut;I)V")
	public void method8581(@OriginalArg(0) Class368 arg0) {
		this.anInt9886 = arg0.anInt9886;
		this.anInt9888 = arg0.anInt9888;
		this.anInt9882 = arg0.anInt9882;
		this.anInt9885 = arg0.anInt9885;
		this.anInt9883 = arg0.anInt9883;
		this.anInt9891 = arg0.anInt9891;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)Lclient!ut;")
	public Class368 method8583() {
		return new Class368(this.anInt9883, this.anInt9885, this.anInt9891, this.anInt9886, this.anInt9882, this.anInt9888);
	}
}
