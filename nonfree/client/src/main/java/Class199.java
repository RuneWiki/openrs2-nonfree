import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class199 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public int anInt5898;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public int anInt5899;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public int anInt5901;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt5902;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt5906;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public int anInt5911;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public int anInt5912;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public int anInt5904 = 128;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	public int anInt5909 = 128;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt5900;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class199(@OriginalArg(0) int arg0) {
		this.anInt5900 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIII)V")
	private Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5912 = arg3;
		this.anInt5904 = arg2;
		this.anInt5905 = arg4;
		this.anInt5909 = arg1;
		this.anInt5901 = arg5;
		this.anInt5900 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!lc;)V")
	public void method5063(@OriginalArg(1) Class199 arg0) {
		this.anInt5909 = arg0.anInt5909;
		this.anInt5900 = arg0.anInt5900;
		this.anInt5901 = arg0.anInt5901;
		this.anInt5905 = arg0.anInt5905;
		this.anInt5904 = arg0.anInt5904;
		this.anInt5912 = arg0.anInt5912;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!lc;")
	public Class199 method5064() {
		return new Class199(this.anInt5900, this.anInt5909, this.anInt5904, this.anInt5912, this.anInt5905, this.anInt5901);
	}
}
