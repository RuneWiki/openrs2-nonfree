import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class161 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	public int anInt4294;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public int anInt4296;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	public int anInt4299;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	public int anInt4303;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public int anInt4304;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	public int anInt4293 = 128;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	public int anInt4300 = 128;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public int anInt4298;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
	public Class161(@OriginalArg(0) int arg0) {
		this.anInt4298 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(IIIIII)V")
	private Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4293 = arg1;
		this.anInt4300 = arg2;
		this.anInt4295 = arg5;
		this.anInt4304 = arg4;
		this.anInt4302 = arg3;
		this.anInt4298 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!mn;I)V")
	public void method3392(@OriginalArg(0) Class161 arg0) {
		this.anInt4304 = arg0.anInt4304;
		this.anInt4298 = arg0.anInt4298;
		this.anInt4295 = arg0.anInt4295;
		this.anInt4302 = arg0.anInt4302;
		this.anInt4293 = arg0.anInt4293;
		this.anInt4300 = arg0.anInt4300;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lclient!mn;")
	public Class161 method3393() {
		return new Class161(this.anInt4298, this.anInt4293, this.anInt4300, this.anInt4302, this.anInt4304, this.anInt4295);
	}
}
