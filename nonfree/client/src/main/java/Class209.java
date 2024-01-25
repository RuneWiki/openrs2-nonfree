import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class209 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
	public int anInt5441;

	@OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
	public int anInt5447;

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
	public int anInt5449;

	@OriginalMember(owner = "client!kfa", name = "n", descriptor = "I")
	public int anInt5438 = 128;

	@OriginalMember(owner = "client!kfa", name = "o", descriptor = "I")
	public int anInt5445 = 128;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
	public int anInt5440;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(I)V")
	public Class209(@OriginalArg(0) int arg0) {
		this.anInt5440 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(IIIIII)V")
	private Class209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5449 = arg3;
		this.anInt5438 = arg1;
		this.anInt5441 = arg5;
		this.anInt5445 = arg2;
		this.anInt5446 = arg4;
		this.anInt5440 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Lclient!kfa;")
	public Class209 method4852() {
		return new Class209(this.anInt5440, this.anInt5438, this.anInt5445, this.anInt5449, this.anInt5446, this.anInt5441);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lclient!kfa;Z)V")
	public void method4854(@OriginalArg(0) Class209 arg0) {
		this.anInt5449 = arg0.anInt5449;
		this.anInt5441 = arg0.anInt5441;
		this.anInt5438 = arg0.anInt5438;
		this.anInt5440 = arg0.anInt5440;
		this.anInt5445 = arg0.anInt5445;
		this.anInt5446 = arg0.anInt5446;
	}
}
