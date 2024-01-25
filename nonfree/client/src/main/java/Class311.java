import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class311 {

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	public int anInt8164;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public int anInt8165;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public int anInt8166;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	public int anInt8168 = 128;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	public int anInt8171 = 128;

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
	public int anInt8163;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V")
	public Class311(@OriginalArg(0) int arg0) {
		this.anInt8163 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIII)V")
	private Class311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8165 = arg5;
		this.anInt8164 = arg3;
		this.anInt8168 = arg2;
		this.anInt8171 = arg1;
		this.anInt8163 = arg0;
		this.anInt8166 = arg4;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lclient!sr;")
	public Class311 method6558() {
		return new Class311(this.anInt8163, this.anInt8171, this.anInt8168, this.anInt8164, this.anInt8166, this.anInt8165);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!sr;)V")
	public void method6561(@OriginalArg(1) Class311 arg0) {
		this.anInt8164 = arg0.anInt8164;
		this.anInt8165 = arg0.anInt8165;
		this.anInt8168 = arg0.anInt8168;
		this.anInt8171 = arg0.anInt8171;
		this.anInt8163 = arg0.anInt8163;
		this.anInt8166 = arg0.anInt8166;
	}
}
