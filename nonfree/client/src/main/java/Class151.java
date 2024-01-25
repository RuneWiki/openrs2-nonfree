import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class151 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public int anInt4540;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public int anInt4542;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Lclient!or;")
	public Class151 aClass151_2;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!vr;")
	public Class112 aClass112_3;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public int anInt4545;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public final int anInt4541;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public final int anInt4539;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(II)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4541 = arg0;
		this.anInt4539 = arg1;
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!or;I)V")
	public Class151(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1) {
		this.aClass151_2 = arg0;
		this.aClass112_3 = this.aClass151_2.aClass112_3;
		this.anInt4541 = this.aClass151_2.anInt4541;
		this.anInt4539 = this.aClass151_2.anInt4539 + arg1;
	}
}
