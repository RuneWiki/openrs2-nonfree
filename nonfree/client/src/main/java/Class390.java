import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class390 {

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	public final int anInt10650;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	public final int anInt10646;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public final int anInt10645;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	public final int anInt10643;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIII)V")
	public Class390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10650 = arg0;
		this.anInt10646 = arg1;
		this.anInt10645 = arg2;
		this.anInt10643 = arg3;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)Lclient!vs;")
	public Class390 method9324(@OriginalArg(1) int arg0) {
		return new Class390(this.anInt10650, arg0, this.anInt10645, this.anInt10643);
	}
}
