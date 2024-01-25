import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class223 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public int anInt6228;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public int anInt6231;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	public int anInt6236;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public int anInt6230 = 128;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public int anInt6227 = 128;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public int anInt6232;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V")
	public Class223(@OriginalArg(0) int arg0) {
		this.anInt6232 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V")
	private Class223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6231 = arg5;
		this.anInt6228 = arg3;
		this.anInt6227 = arg2;
		this.anInt6232 = arg0;
		this.anInt6236 = arg4;
		this.anInt6230 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!od;)V")
	public void method5294(@OriginalArg(1) Class223 arg0) {
		this.anInt6230 = arg0.anInt6230;
		this.anInt6228 = arg0.anInt6228;
		this.anInt6232 = arg0.anInt6232;
		this.anInt6227 = arg0.anInt6227;
		this.anInt6231 = arg0.anInt6231;
		this.anInt6236 = arg0.anInt6236;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)Lclient!od;")
	public Class223 method5296() {
		return new Class223(this.anInt6232, this.anInt6230, this.anInt6227, this.anInt6228, this.anInt6236, this.anInt6231);
	}
}
