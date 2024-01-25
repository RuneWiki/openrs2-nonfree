import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class159 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
	public int anInt4331;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	public int anInt4337;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public int anInt4333 = 128;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
	public int anInt4338 = 128;

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt4335 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(IIIIII)V")
	private Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4335 = arg0;
		this.anInt4337 = arg4;
		this.anInt4331 = arg3;
		this.anInt4338 = arg2;
		this.anInt4334 = arg5;
		this.anInt4333 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)Lclient!kda;")
	public Class159 method3753() {
		return new Class159(this.anInt4335, this.anInt4333, this.anInt4338, this.anInt4331, this.anInt4337, this.anInt4334);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!kda;I)V")
	public void method3754(@OriginalArg(0) Class159 arg0) {
		this.anInt4334 = arg0.anInt4334;
		this.anInt4338 = arg0.anInt4338;
		this.anInt4337 = arg0.anInt4337;
		this.anInt4335 = arg0.anInt4335;
		this.anInt4331 = arg0.anInt4331;
		this.anInt4333 = arg0.anInt4333;
	}
}
