import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class190 {

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "[I")
	public static final int[] anIntArray312 = new int[128];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
	public int anInt5814;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
	public int anInt5815;

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
	public int anInt5817;

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
	public int anInt5818;

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
	public int anInt5820;

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
	public int anInt5821;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "Lclient!kw;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
	public int anInt5826;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public int anInt5828;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
	public int anInt5829;

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
	public final int anInt5819;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
	public final int anInt5816;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
	private final int anInt5827;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!kw", name = "m", descriptor = "I")
	public final int anInt5824;

	static {
		for (@Pc(14) int local14 = 0; local14 < anIntArray312.length; local14++) {
			anIntArray312[local14] = -1;
		}
		for (@Pc(30) int local30 = 65; local30 <= 90; local30++) {
			anIntArray312[local30] = local30 - 65;
		}
		for (@Pc(45) int local45 = 97; local45 <= 122; local45++) {
			anIntArray312[local45] = local45 + 26 - 97;
		}
		for (@Pc(62) int local62 = 48; local62 <= 57; local62++) {
			anIntArray312[local62] = local62 + 52 - 48;
		}
		anIntArray312[45] = anIntArray312[47] = 63;
		anIntArray312[42] = anIntArray312[43] = 62;
	}

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(IIIIB)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5819 = arg1;
		this.anInt5816 = arg3;
		this.anInt5827 = arg0;
		this.aByte95 = arg4;
		this.anInt5824 = arg2;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIB)Lclient!kw;")
	public Class190 method4494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class190(this.anInt5827, arg0, arg1, arg2, this.aByte95);
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)Lclient!gi;")
	public Class126 method4496() {
		return Static79.method1620(this.anInt5827);
	}
}
