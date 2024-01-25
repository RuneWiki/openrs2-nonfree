import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class181 {

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
	public int anInt5908;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
	public int anInt5913;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	public int anInt5914;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
	public int anInt5907 = 128;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
	public int anInt5911 = 128;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
	public int anInt5909;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
	public Class181(@OriginalArg(0) int arg0) {
		this.anInt5909 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIII)V")
	private Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5913 = arg5;
		this.anInt5909 = arg0;
		this.anInt5908 = arg3;
		this.anInt5907 = arg2;
		this.anInt5911 = arg1;
		this.anInt5914 = arg4;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!lba;)V")
	public void method5184(@OriginalArg(1) Class181 arg0) {
		this.anInt5907 = arg0.anInt5907;
		this.anInt5913 = arg0.anInt5913;
		this.anInt5909 = arg0.anInt5909;
		this.anInt5908 = arg0.anInt5908;
		this.anInt5914 = arg0.anInt5914;
		this.anInt5911 = arg0.anInt5911;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)Lclient!lba;")
	public Class181 method5185() {
		return new Class181(this.anInt5909, this.anInt5911, this.anInt5907, this.anInt5908, this.anInt5914, this.anInt5913);
	}
}
