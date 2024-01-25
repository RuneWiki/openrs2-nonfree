import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class159 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
	public int anInt5344;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	public int anInt5348 = 128;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
	public int anInt5347 = 128;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	public int anInt5349;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(I)V")
	public Class159(@OriginalArg(0) int arg0) {
		this.anInt5349 = arg0;
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIII)V")
	private Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5340 = arg4;
		this.anInt5345 = arg3;
		this.anInt5344 = arg5;
		this.anInt5349 = arg0;
		this.anInt5347 = arg1;
		this.anInt5348 = arg2;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!iq;B)V")
	public void method4590(@OriginalArg(0) Class159 arg0) {
		this.anInt5348 = arg0.anInt5348;
		this.anInt5349 = arg0.anInt5349;
		this.anInt5347 = arg0.anInt5347;
		this.anInt5345 = arg0.anInt5345;
		this.anInt5340 = arg0.anInt5340;
		this.anInt5344 = arg0.anInt5344;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Lclient!iq;")
	public Class159 method4591() {
		return new Class159(this.anInt5349, this.anInt5347, this.anInt5348, this.anInt5345, this.anInt5340, this.anInt5344);
	}
}
