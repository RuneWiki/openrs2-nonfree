import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class238 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
	public int anInt6058;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	public int anInt6059;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
	public int anInt6054 = 128;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
	public int anInt6052 = 128;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
	public int anInt6055;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(I)V")
	public Class238(@OriginalArg(0) int arg0) {
		this.anInt6055 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIIII)V")
	private Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6052 = arg1;
		this.anInt6058 = arg3;
		this.anInt6051 = arg4;
		this.anInt6055 = arg0;
		this.anInt6059 = arg5;
		this.anInt6054 = arg2;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Lclient!nga;")
	public Class238 method5076() {
		return new Class238(this.anInt6055, this.anInt6052, this.anInt6054, this.anInt6058, this.anInt6051, this.anInt6059);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!nga;I)V")
	public void method5077(@OriginalArg(0) Class238 arg0) {
		this.anInt6055 = arg0.anInt6055;
		this.anInt6052 = arg0.anInt6052;
		this.anInt6059 = arg0.anInt6059;
		this.anInt6058 = arg0.anInt6058;
		this.anInt6054 = arg0.anInt6054;
		this.anInt6051 = arg0.anInt6051;
	}
}
