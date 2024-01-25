import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class241 {

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
	public int anInt6069;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
	public int anInt6073;

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
	public int anInt6072 = 128;

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
	public int anInt6074 = 128;

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
	public int anInt6071;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V")
	public Class241(@OriginalArg(0) int arg0) {
		this.anInt6071 = arg0;
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIIII)V")
	private Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6071 = arg0;
		this.anInt6073 = arg3;
		this.anInt6074 = arg2;
		this.anInt6072 = arg1;
		this.anInt6075 = arg4;
		this.anInt6069 = arg5;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Lclient!nca;")
	public Class241 method5389() {
		return new Class241(this.anInt6071, this.anInt6072, this.anInt6074, this.anInt6073, this.anInt6075, this.anInt6069);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!nca;)V")
	public void method5390(@OriginalArg(1) Class241 arg0) {
		this.anInt6072 = arg0.anInt6072;
		this.anInt6075 = arg0.anInt6075;
		this.anInt6071 = arg0.anInt6071;
		this.anInt6069 = arg0.anInt6069;
		this.anInt6074 = arg0.anInt6074;
		this.anInt6073 = arg0.anInt6073;
	}
}
