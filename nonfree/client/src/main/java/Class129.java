import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class129 {

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
	public final int anInt3390;

	@OriginalMember(owner = "client!gfa", name = "l", descriptor = "I")
	public final int anInt3386;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public final int anInt3394;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
	public final int anInt3388;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIII)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3390 = arg0;
		this.anInt3386 = arg2;
		this.anInt3394 = arg1;
		this.anInt3388 = arg3;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lclient!gfa;")
	public Class129 method3132(@OriginalArg(1) int arg0) {
		return new Class129(this.anInt3390, arg0, this.anInt3386, this.anInt3388);
	}
}
