import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class93 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public int anInt3210;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt3212;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public int anInt3213;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	public int anInt3215;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public int anInt3219;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt3220;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public int anInt3223;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public int anInt3214 = 128;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public int anInt3217 = 128;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class93(@OriginalArg(0) int arg0) {
		this.anInt3216 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIII)V")
	private Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3220 = arg4;
		this.anInt3216 = arg0;
		this.anInt3219 = arg3;
		this.anInt3214 = arg2;
		this.anInt3211 = arg5;
		this.anInt3217 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Lclient!ei;")
	public Class93 method2965() {
		return new Class93(this.anInt3216, this.anInt3217, this.anInt3214, this.anInt3219, this.anInt3220, this.anInt3211);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ei;Z)V")
	public void method2966(@OriginalArg(0) Class93 arg0) {
		this.anInt3211 = arg0.anInt3211;
		this.anInt3217 = arg0.anInt3217;
		this.anInt3219 = arg0.anInt3219;
		this.anInt3220 = arg0.anInt3220;
		this.anInt3216 = arg0.anInt3216;
		this.anInt3214 = arg0.anInt3214;
	}
}
