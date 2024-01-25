import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class94 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public int anInt2385;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public int anInt2396;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
	public int anInt2392 = 128;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	public int anInt2391 = 128;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
	public int anInt2394;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	public Class94(@OriginalArg(0) int arg0) {
		this.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIII)V")
	private Class94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2391 = arg2;
		this.anInt2385 = arg4;
		this.anInt2396 = arg5;
		this.anInt2394 = arg0;
		this.anInt2393 = arg3;
		this.anInt2392 = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Lclient!gn;")
	public Class94 method2049() {
		return new Class94(this.anInt2394, this.anInt2392, this.anInt2391, this.anInt2393, this.anInt2385, this.anInt2396);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!gn;B)V")
	public void method2054(@OriginalArg(0) Class94 arg0) {
		this.anInt2385 = arg0.anInt2385;
		this.anInt2391 = arg0.anInt2391;
		this.anInt2396 = arg0.anInt2396;
		this.anInt2392 = arg0.anInt2392;
		this.anInt2393 = arg0.anInt2393;
		this.anInt2394 = arg0.anInt2394;
	}
}
