import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class382 {

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public int anInt10674;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public int anInt10675;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
	public int anInt10676;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!wr;")
	public Class382 aClass382_2;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
	public int anInt10678;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public int anInt10679;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
	public int anInt10681;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
	public int anInt10685;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public int anInt10687;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
	public int anInt10689;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	private final int anInt10671;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "B")
	public final byte aByte129;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	public final int anInt10683;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	public final int anInt10673;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
	public final int anInt10680;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIB)V")
	public Class382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt10671 = arg0;
		this.aByte129 = arg4;
		this.anInt10683 = arg2;
		this.anInt10673 = arg3;
		this.anInt10680 = arg1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)Lclient!wr;")
	public Class382 method8974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class382(this.anInt10671, arg0, arg1, arg2, this.aByte129);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)Lclient!gq;")
	public Class120 method8976() {
		return Static105.method1741(this.anInt10671);
	}
}
