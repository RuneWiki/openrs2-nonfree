import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class126 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	public int anInt3246;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	public int anInt3250;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
	public int anInt3253;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public int anInt3245 = 128;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	public int anInt3243 = 128;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public int anInt3248;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	public Class126(@OriginalArg(0) int arg0) {
		this.anInt3248 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIII)V")
	private Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3250 = arg4;
		this.anInt3245 = arg1;
		this.anInt3253 = arg3;
		this.anInt3248 = arg0;
		this.anInt3246 = arg5;
		this.anInt3243 = arg2;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)Lclient!gn;")
	public Class126 method2704() {
		return new Class126(this.anInt3248, this.anInt3245, this.anInt3243, this.anInt3253, this.anInt3250, this.anInt3246);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!gn;I)V")
	public void method2706(@OriginalArg(0) Class126 arg0) {
		this.anInt3243 = arg0.anInt3243;
		this.anInt3245 = arg0.anInt3245;
		this.anInt3253 = arg0.anInt3253;
		this.anInt3246 = arg0.anInt3246;
		this.anInt3248 = arg0.anInt3248;
		this.anInt3250 = arg0.anInt3250;
	}
}
