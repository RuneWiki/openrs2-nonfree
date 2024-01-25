import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class306 {

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt8168;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt8171;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public int anInt8174;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public int anInt8167 = 128;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public int anInt8172 = 128;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
	public int anInt8173;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
	public Class306(@OriginalArg(0) int arg0) {
		this.anInt8173 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIII)V")
	private Class306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8167 = arg1;
		this.anInt8174 = arg3;
		this.anInt8171 = arg4;
		this.anInt8173 = arg0;
		this.anInt8172 = arg2;
		this.anInt8168 = arg5;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lclient!qf;")
	public Class306 method6991() {
		return new Class306(this.anInt8173, this.anInt8167, this.anInt8172, this.anInt8174, this.anInt8171, this.anInt8168);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;I)V")
	public void method6993(@OriginalArg(0) Class306 arg0) {
		this.anInt8171 = arg0.anInt8171;
		this.anInt8168 = arg0.anInt8168;
		this.anInt8172 = arg0.anInt8172;
		this.anInt8174 = arg0.anInt8174;
		this.anInt8173 = arg0.anInt8173;
		this.anInt8167 = arg0.anInt8167;
	}
}
