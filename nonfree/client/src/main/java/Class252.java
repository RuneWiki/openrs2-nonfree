import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class252 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	public int anInt7510;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public int anInt7511;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	public int anInt7517;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public int anInt7513 = 128;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "I")
	public int anInt7512 = 128;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	public int anInt7514;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class252(@OriginalArg(0) int arg0) {
		this.anInt7514 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIII)V")
	private Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7512 = arg1;
		this.anInt7514 = arg0;
		this.anInt7511 = arg4;
		this.anInt7510 = arg5;
		this.anInt7517 = arg3;
		this.anInt7513 = arg2;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Lclient!op;")
	public Class252 method6510() {
		return new Class252(this.anInt7514, this.anInt7512, this.anInt7513, this.anInt7517, this.anInt7511, this.anInt7510);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!op;)V")
	public void method6512(@OriginalArg(1) Class252 arg0) {
		this.anInt7511 = arg0.anInt7511;
		this.anInt7510 = arg0.anInt7510;
		this.anInt7514 = arg0.anInt7514;
		this.anInt7513 = arg0.anInt7513;
		this.anInt7512 = arg0.anInt7512;
		this.anInt7517 = arg0.anInt7517;
	}
}
