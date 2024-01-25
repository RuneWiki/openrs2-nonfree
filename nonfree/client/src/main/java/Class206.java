import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class206 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
	public int anInt6176;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
	public int anInt6179;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public int anInt6180;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
	public int anInt6183;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public int anInt6169 = 128;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	public int anInt6185 = 128;

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	public Class206(@OriginalArg(0) int arg0) {
		this.anInt6174 = arg0;
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIII)V")
	private Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6171 = arg5;
		this.anInt6174 = arg0;
		this.anInt6180 = arg4;
		this.anInt6185 = arg2;
		this.anInt6169 = arg1;
		this.anInt6176 = arg3;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLclient!lt;)V")
	public void method5148(@OriginalArg(1) Class206 arg0) {
		this.anInt6176 = arg0.anInt6176;
		this.anInt6171 = arg0.anInt6171;
		this.anInt6180 = arg0.anInt6180;
		this.anInt6185 = arg0.anInt6185;
		this.anInt6169 = arg0.anInt6169;
		this.anInt6174 = arg0.anInt6174;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Lclient!lt;")
	public Class206 method5150() {
		return new Class206(this.anInt6174, this.anInt6169, this.anInt6185, this.anInt6176, this.anInt6180, this.anInt6171);
	}
}
