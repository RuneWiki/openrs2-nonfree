import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class2_Sub53 extends Class2 {

	@OriginalMember(owner = "client!vja", name = "B", descriptor = "[I")
	public static final int[] anIntArray576 = new int[120];

	@OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
	public int anInt10977 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
	public int anInt10979 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
	public int anInt10980 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
	public int anInt10976 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
	public int anInt10981 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vja", name = "w", descriptor = "I")
	public int anInt10983 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vja", name = "y", descriptor = "I")
	public int anInt10985 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vja", name = "x", descriptor = "I")
	public int anInt10984 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vja", name = "u", descriptor = "Lclient!jg;")
	public final Class2_Sub33 aClass2_Sub33_1;

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 120; local14++) {
			@Pc(19) int local19 = local14 + 1;
			@Pc(32) int local32 = (int) ((double) local19 + Math.pow(2.0D, (double) local19 / 7.0D) * 300.0D);
			local12 += local32;
			anIntArray576[local14] = local12 / 4;
		}
	}

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!jg;)V")
	public Class2_Sub53(@OriginalArg(0) Class2_Sub33 arg0) {
		this.aClass2_Sub33_1 = arg0;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(III)Z")
	public boolean method9393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10976 <= arg0 && this.anInt10980 >= arg0 && arg1 >= this.anInt10983 && this.anInt10984 >= arg1) {
			return true;
		} else {
			return this.anInt10981 <= arg0 && arg0 <= this.anInt10985 && this.anInt10979 <= arg1 && arg1 <= this.anInt10977;
		}
	}
}
