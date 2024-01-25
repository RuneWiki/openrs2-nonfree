import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class198 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public int anInt5251;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public int anInt5252;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public int anInt5257;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
	public int anInt5260;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	public int anInt5261;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public int anInt5248 = 128;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
	public int anInt5258 = 128;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
	public int anInt5256;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
	public Class198(@OriginalArg(0) int arg0) {
		this.anInt5256 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIII)V")
	private Class198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5248 = arg1;
		this.anInt5252 = arg3;
		this.anInt5255 = arg5;
		this.anInt5253 = arg4;
		this.anInt5256 = arg0;
		this.anInt5258 = arg2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Lclient!ph;")
	public Class198 method4198() {
		return new Class198(this.anInt5256, this.anInt5248, this.anInt5258, this.anInt5252, this.anInt5253, this.anInt5255);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ph;)V")
	public void method4201(@OriginalArg(1) Class198 arg0) {
		this.anInt5248 = arg0.anInt5248;
		this.anInt5258 = arg0.anInt5258;
		this.anInt5253 = arg0.anInt5253;
		this.anInt5252 = arg0.anInt5252;
		this.anInt5255 = arg0.anInt5255;
		this.anInt5256 = arg0.anInt5256;
	}
}
