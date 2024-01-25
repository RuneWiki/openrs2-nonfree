import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class179 {

	@OriginalMember(owner = "client!iia", name = "f", descriptor = "I")
	public int anInt4265;

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "I")
	public int anInt4268;

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
	public int anInt4269;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
	public int anInt4266 = 128;

	@OriginalMember(owner = "client!iia", name = "g", descriptor = "I")
	public int anInt4271 = 128;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
	public int anInt4267;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(I)V")
	public Class179(@OriginalArg(0) int arg0) {
		this.anInt4267 = arg0;
	}

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(IIIIII)V")
	private Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4266 = arg2;
		this.anInt4267 = arg0;
		this.anInt4269 = arg3;
		this.anInt4265 = arg5;
		this.anInt4271 = arg1;
		this.anInt4268 = arg4;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Lclient!iia;I)V")
	public void method3936(@OriginalArg(0) Class179 arg0) {
		this.anInt4271 = arg0.anInt4271;
		this.anInt4266 = arg0.anInt4266;
		this.anInt4267 = arg0.anInt4267;
		this.anInt4268 = arg0.anInt4268;
		this.anInt4265 = arg0.anInt4265;
		this.anInt4269 = arg0.anInt4269;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)Lclient!iia;")
	public Class179 method3938() {
		return new Class179(this.anInt4267, this.anInt4271, this.anInt4266, this.anInt4269, this.anInt4268, this.anInt4265);
	}
}
