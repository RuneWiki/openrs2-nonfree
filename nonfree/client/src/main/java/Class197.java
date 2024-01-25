import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class197 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public int anInt5067;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	public int anInt5070;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
	public int anInt5073;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Lclient!qt;")
	public Class197 aClass197_1;

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public int anInt5077;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
	public int anInt5078;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
	public int anInt5079;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
	public int anInt5080;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
	public int anInt5081;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public final int anInt5076;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "B")
	public final byte aByte63;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	public final int anInt5074;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public final int anInt5068;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public final int anInt5069;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIB)V")
	public Class197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5076 = arg1;
		this.aByte63 = arg4;
		this.anInt5074 = arg2;
		this.anInt5068 = arg0;
		this.anInt5069 = arg3;
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!qt;I)V")
	public Class197(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1) {
		this.aClass197_1 = arg0;
		this.anInt5074 = this.aClass197_1.anInt5074 + arg1;
		this.anInt5069 = this.aClass197_1.anInt5069 + arg1;
		this.aByte63 = this.aClass197_1.aByte63;
		this.anInt5076 = this.aClass197_1.anInt5076 + arg1;
		this.anInt5068 = this.aClass197_1.anInt5068;
	}
}
