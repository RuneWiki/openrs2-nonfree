import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class187 {

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public int anInt5171;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public int anInt5173;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
	public int anInt5176;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
	public int anInt5175 = 128;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	public int anInt5172 = 128;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
	public int anInt5178;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(I)V")
	public Class187(@OriginalArg(0) int arg0) {
		this.anInt5178 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIII)V")
	private Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5171 = arg3;
		this.anInt5178 = arg0;
		this.anInt5176 = arg5;
		this.anInt5172 = arg2;
		this.anInt5173 = arg4;
		this.anInt5175 = arg1;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!ou;I)V")
	public void method4285(@OriginalArg(0) Class187 arg0) {
		this.anInt5175 = arg0.anInt5175;
		this.anInt5173 = arg0.anInt5173;
		this.anInt5178 = arg0.anInt5178;
		this.anInt5176 = arg0.anInt5176;
		this.anInt5171 = arg0.anInt5171;
		this.anInt5172 = arg0.anInt5172;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Lclient!ou;")
	public Class187 method4286() {
		return new Class187(this.anInt5178, this.anInt5175, this.anInt5172, this.anInt5171, this.anInt5173, this.anInt5176);
	}
}
