import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class174 {

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "[I")
	public static final int[] anIntArray413 = new int[32];

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public int anInt5462;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public int anInt5464;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public int anInt5465;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public int anInt5466;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public int anInt5467;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public int anInt5470;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public int anInt5471;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!rf;")
	public Class174 aClass174_2;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public final int anInt5461;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	public final int anInt5460;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public final int anInt5472;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public final int anInt5459;

	static {
		@Pc(15) int local15 = 2;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			anIntArray413[local17] = local15 - 1;
			local15 += local15;
		}
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIB)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5461 = arg3;
		this.anInt5460 = arg1;
		this.anInt5472 = arg2;
		this.aByte69 = arg4;
		this.anInt5459 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!rf;I)V")
	public Class174(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1) {
		this.aClass174_2 = arg0;
		this.anInt5459 = this.aClass174_2.anInt5459;
		this.aByte69 = this.aClass174_2.aByte69;
		this.anInt5460 = arg1 + this.aClass174_2.anInt5460;
		this.anInt5472 = arg1 + this.aClass174_2.anInt5472;
		this.anInt5461 = arg1 + this.aClass174_2.anInt5461;
	}
}
