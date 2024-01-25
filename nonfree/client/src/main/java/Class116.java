import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class116 {

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public int anInt3229;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	public int anInt3232;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public int anInt3227 = 128;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public int anInt3236 = 128;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public int anInt3225;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3225 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIII)V")
	private Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3231 = arg5;
		this.anInt3232 = arg4;
		this.anInt3227 = arg1;
		this.anInt3229 = arg3;
		this.anInt3225 = arg0;
		this.anInt3236 = arg2;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Lclient!fs;")
	public Class116 method2916() {
		return new Class116(this.anInt3225, this.anInt3227, this.anInt3236, this.anInt3229, this.anInt3232, this.anInt3231);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!fs;I)V")
	public void method2917(@OriginalArg(0) Class116 arg0) {
		this.anInt3225 = arg0.anInt3225;
		this.anInt3236 = arg0.anInt3236;
		this.anInt3227 = arg0.anInt3227;
		this.anInt3231 = arg0.anInt3231;
		this.anInt3232 = arg0.anInt3232;
		this.anInt3229 = arg0.anInt3229;
	}
}
